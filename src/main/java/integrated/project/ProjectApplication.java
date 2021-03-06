package integrated.project;

import integrated.project.services.StorageService;
import integrated.project.services.StorageProperties;
import integrated.project.services.StorageServiceImp;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import javax.annotation.Resource;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class ProjectApplication  implements CommandLineRunner{
@Resource
StorageServiceImp storageService;

	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}

	@Override
	public void run(String... arg) throws Exception {

//		storageService.deleteAll();
		storageService.init();
	}

}

