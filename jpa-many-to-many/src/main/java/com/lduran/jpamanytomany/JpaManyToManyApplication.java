package com.lduran.jpamanytomany;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.lduran.jpamanytomany.model.Stream;
import com.lduran.jpamanytomany.model.Viewer;
import com.lduran.jpamanytomany.repository.StreamRepository;
import com.lduran.jpamanytomany.repository.ViewerRepository;

@SpringBootApplication
public class JpaManyToManyApplication
{

	public static void main(String[] args)
	{
		ConfigurableApplicationContext cac = SpringApplication.run(JpaManyToManyApplication.class, args);

		StreamRepository streamRepository = cac.getBean(StreamRepository.class);
		ViewerRepository viewerRepository = cac.getBean(ViewerRepository.class);

		Viewer johnViewer = new Viewer("John12");
		Viewer willViewer = new Viewer("WillM2");
		Viewer samViewer = new Viewer("MightSam");

		List<Viewer> viewers = Arrays.asList(johnViewer, willViewer, samViewer);

		Stream cookingStream = new Stream("CookIsAwesome");
		Stream gamingStream = new Stream("ChillGaming");

		List<Stream> streams = Arrays.asList(cookingStream, gamingStream);

		streamRepository.saveAll(streams);

		johnViewer.followStream(cookingStream);
		willViewer.followStream(gamingStream);
		samViewer.followStream(gamingStream);
		samViewer.followStream(cookingStream);

		viewerRepository.saveAll(viewers);
	}
}
