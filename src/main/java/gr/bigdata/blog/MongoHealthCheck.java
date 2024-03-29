package gr.bigdata.blog;

import com.mongodb.Mongo;
import com.yammer.metrics.core.HealthCheck;
 
public class MongoHealthCheck extends HealthCheck {
 
    private Mongo mongo;
 
    protected MongoHealthCheck(Mongo mongo) {
        super("MongoDBHealthCheck");
        this.mongo = mongo;
    }
 
    @Override
    protected Result check() throws Exception {
        mongo.getVersion();
        return Result.healthy();
    }
 
}