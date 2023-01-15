package com.learning.learnspring.repository;

import com.learning.learnspring.entity.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public abstract class RoomRepository implements CrudRepository<Room,Long> {

	public Iterable<Room> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
