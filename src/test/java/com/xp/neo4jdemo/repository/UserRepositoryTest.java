package com.xp.neo4jdemo.repository;

import com.xp.neo4jdemo.Neo4jDemoApplicationTests;
import com.xp.neo4jdemo.domain.UserNode;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserRepositoryTest extends Neo4jDemoApplicationTests{

    Logger logger = LoggerFactory.getLogger(UserRepositoryTest.class);

    @Autowired
    UserRepository userRepository;

    @Test
    public void createUserNode(){
        System.out.println(userRepository);
        UserNode userNode = new UserNode();
        userNode.setName("xupan");
        userNode.setUserId("123");
        UserNode save = userRepository.save(userNode);
        logger.info(save.toString());
        Assert.assertTrue(save!=null);
    }

    @Test
    public void delAll(){
       userRepository.deleteById(new Long(27));

    }
}