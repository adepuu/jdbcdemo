package com.adepuu.demojdbc.auth.service;

import com.adepuu.demojdbc.auth.entity.User;
import com.adepuu.demojdbc.auth.repository.UserCustomRepository;
import com.adepuu.demojdbc.auth.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements  UserService{
    private final UserRepository userRepository;
    private  final UserCustomRepository userCustomRepository;

    public UserServiceImpl(UserRepository userRepository, UserCustomRepository userCustomRepository) {
        this.userRepository = userRepository;
        this.userCustomRepository = userCustomRepository;
    }


    @Override
    public List<User> findAll() {
        return userCustomRepository.findAllUsers();
    }

    @Override
    @Transactional
    public void createUser(User user) {
        userCustomRepository.save(user);
        throw new RuntimeException("Error");
//        userCustomRepository.save(user);
    }
}
