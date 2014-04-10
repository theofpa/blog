package gr.bigdata.blog;
import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;
 
public class BlogService extends Service<BlogConfiguration> {
 
    public static void main(String[] args) throws Exception {
        new BlogService().run(new String[] { "server" });
    }
 
    @Override
    public void initialize(Bootstrap<BlogConfiguration> bootstrap) {
        bootstrap.setName("blog");
    }
 
    @Override
    public void run(BlogConfiguration configuration, Environment environment) throws Exception {
       environment.addResource(new IndexResource());
    }
 
}