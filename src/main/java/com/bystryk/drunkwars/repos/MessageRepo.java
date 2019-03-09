package com.bystryk.drunkwars.repos;

import com.bystryk.drunkwars.domain.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MessageRepo extends CrudRepository<Message,Long> {

    List<Message> findByTag(String tag);

}
