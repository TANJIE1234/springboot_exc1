package org.zyzz.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.zyzz.entity.User;

/**
 * Created by zyzz on 17-8-30.
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long>{
}
