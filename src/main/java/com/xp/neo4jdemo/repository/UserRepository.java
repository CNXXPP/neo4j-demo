package com.xp.neo4jdemo.repository;


import com.xp.neo4jdemo.domain.UserNode;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.GraphRepositoryQuery;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends Neo4jRepository<UserNode,Long>{

}
