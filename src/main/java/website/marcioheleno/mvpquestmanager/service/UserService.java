package website.marcioheleno.mvpquestmanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import website.marcioheleno.mvpquestmanager.mapper.UserMapper;
import website.marcioheleno.mvpquestmanager.model.entity.UserAdmin;

import java.util.List;

@Service
public class UserService {


    @Autowired
    UserMapper userMapper;

    public List getListUserService() {
        return userMapper.getUserAdminListMapper();
    }

    public UserAdmin getUserAdminByNameService(String nome){
        return userMapper.getUserAdminByNameMapper(nome);
    }

    public UserAdmin getUserAdminIdService(int id) {
        return userMapper.getUserAdminIdMapper(id);
    }

    public int addUseradminService(UserAdmin userAdmin) {
        return userMapper.addUserMapper(userAdmin);
    }


}
