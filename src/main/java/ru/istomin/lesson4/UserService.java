package ru.istomin.lesson4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers(){
        userRepository.save(new User(null, "Sergey", "123@mail.ru"));
        userRepository.save(new User(null, "Anton", "456@mail.ru"));
        userRepository.save(new User(null, "Tany", "789@mail.ru"));
        return userRepository.findAll();
    }

    public User getUserByID(Long id){
        return userRepository.findByID(id);
    }

}
