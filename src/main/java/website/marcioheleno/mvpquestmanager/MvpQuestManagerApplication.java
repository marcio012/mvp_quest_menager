package website.marcioheleno.mvpquestmanager;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import website.marcioheleno.mvpquestmanager.mapper.UserMapper;
import website.marcioheleno.mvpquestmanager.model.entity.UserAdmin;

@Slf4j
@SpringBootApplication
public class MvpQuestManagerApplication {

    @Autowired
    UserMapper userMapper;

    public static void main(String[] args) {
        SpringApplication.run(MvpQuestManagerApplication.class, args);
        log.info("Spring Rodando.");
    }


    @Bean
    CommandLineRunner runner() {
        return args -> {
//            userMapper.addUserMapper(new UserAdmin(3, "userTest", "$2a$04$KNLUwOWHVQZVpXyMBNc7JOzbLiBjb9Tk9bP7KNcPI12ICuvzXQQKG", "USER"));
        };
    }
}
