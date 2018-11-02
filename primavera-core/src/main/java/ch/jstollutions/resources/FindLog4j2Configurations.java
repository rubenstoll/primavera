package ch.jstollutions.resources;

import java.io.IOException;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

public class FindLog4j2Configurations {

    public void find() throws IOException {
        String regexp = "classpath:junit_tkj3m.properties";
        PathMatchingResourcePatternResolver pathMatchingResourcePatternResolver = new PathMatchingResourcePatternResolver(this.getClass().getClassLoader());
        Resource[] resources = pathMatchingResourcePatternResolver.getResources(regexp);

        for (Resource resource : resources) {
            System.out.println(resource.getURL().toString());
        }
    }

}
