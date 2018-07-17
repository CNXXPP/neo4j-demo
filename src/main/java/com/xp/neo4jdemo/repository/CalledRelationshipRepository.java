package com.xp.neo4jdemo.repository;


import com.xp.neo4jdemo.domain.CalledRelationship;
import com.xp.neo4jdemo.domain.ServiceNode;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalledRelationshipRepository extends Neo4jRepository<CalledRelationship,Long>{

}
