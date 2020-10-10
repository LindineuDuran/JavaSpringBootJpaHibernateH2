package com.lduran.jpaonetomanybidirectional;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.lduran.jpaonetomanybidirectional.model.Cart;
import com.lduran.jpaonetomanybidirectional.model.Item;
import com.lduran.jpaonetomanybidirectional.repository.CartRepository;
import com.lduran.jpaonetomanybidirectional.repository.ItemRepository;

@SpringBootApplication
public class JpaOneToManyBidirectionalApplication
{

	public static void main(String[] args)
	{
		ConfigurableApplicationContext cac = SpringApplication.run(JpaOneToManyBidirectionalApplication.class, args);

		ItemRepository itemRepository = cac.getBean(ItemRepository.class);
		CartRepository cartRepository = cac.getBean(CartRepository.class);

		Cart cart = new Cart("C999");
		Item chocolate = new Item("123", cart);
		Item shampoo = new Item("321", cart);

		List<Item> itens = Arrays.asList(chocolate, shampoo);

		cart.setItens(itens);
		cartRepository.save(cart);

		cartRepository.delete(cart);
	}
}
