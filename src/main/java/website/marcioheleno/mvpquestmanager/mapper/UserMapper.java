package website.marcioheleno.mvpquestmanager.mapper;

import org.apache.ibatis.annotations.Mapper;
import website.marcioheleno.mvpquestmanager.model.entity.UserAdmin;

import java.util.List;

@Mapper
public interface UserMapper {

    List getUserAdminListMapper();
    UserAdmin getUserAdminByNameMapper(String nome);
    UserAdmin getUserAdminIdMapper(int id);
    int addUserMapper(UserAdmin userAdmin);
}
