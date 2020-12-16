package ua.lviv.lgs.periodacals.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ua.lviv.lgs.periodacals.dao.UserRepository;
import ua.lviv.lgs.periodacals.domain.User;
import ua.lviv.lgs.periodacals.domain.UserRole;
import ua.lviv.lgs.periodacals.dto.RegistUserDto;

@Service
public class UserService{
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder bCryptPasswordEncoder;


    public void save(RegistUserDto userDto) {
        User user = new User();
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setEmail(userDto.getEmail());
        user.setPassword(bCryptPasswordEncoder.encode(userDto.getPassword()));
        user.setRole(UserRole.USER_ROLE);
        userRepository.save(user);
    }

}