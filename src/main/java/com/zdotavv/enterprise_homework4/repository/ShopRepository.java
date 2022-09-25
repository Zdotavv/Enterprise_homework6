package com.zdotavv.enterprise_homework4.repository;

import com.zdotavv.enterprise_homework4.model.Shop;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopRepository extends CrudRepository<Shop, Long> {
}
