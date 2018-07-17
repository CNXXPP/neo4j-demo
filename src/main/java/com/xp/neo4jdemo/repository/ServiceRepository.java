package com.xp.neo4jdemo.repository;


import com.xp.neo4jdemo.domain.ServiceNode;
import com.xp.neo4jdemo.domain.UserNode;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepository extends Neo4jRepository<ServiceNode,Long>{

}
