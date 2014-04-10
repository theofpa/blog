package gr.bigdata.blog;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
 
import org.codehaus.jackson.annotate.JsonProperty;
import org.hibernate.validator.constraints.NotEmpty;
 
import com.yammer.dropwizard.config.Configuration;
 
public class BlogConfiguration extends Configuration {
 
    @JsonProperty
    @NotEmpty
    public String mongohost = "ds027348.mongolab.com";
 
    @JsonProperty
    @Min(1)
    @Max(65535)
    public int mongoport = 27348;
 
    @JsonProperty
    @NotEmpty
    public String mongodb = "blog";

    
    @JsonProperty
    @NotEmpty
    public String mongouser = "blog";
    
    @JsonProperty
    @NotEmpty
    public String mongopwd = "blog";
    
}