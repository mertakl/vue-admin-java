package com.lmxdawn.admin.dao.auth;

import com.lmxdawn.admin.entity.auth.AuthAdmin;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface AuthAdminDao {
    
    /**
     * 后台业务查询列表
     * @return 列表
     */
    List<AuthAdmin> listAdminPage(Map<String,Object> map);
    
    /**
     * 根据id查询
     * @param id 传入的id
     * @return
     */
    AuthAdmin findById(Long id);

    /**
     * 根据id查询 password
     * @param id 传入的id
     * @return
     */
    AuthAdmin findPwdById(Long id);

    /**
     * 根据Name
     * @param userName 用户名
     * @return
     */
    AuthAdmin findByUserName(String userName);
    
    /**
     * 插入
     * @param authAdmin
     * @return
     */
    boolean insertAuthAdmin(AuthAdmin authAdmin);
    
    /**
     * 更新
     * @param authAdmin
     * @return
     */
    boolean updateAuthAdmin(AuthAdmin authAdmin);
    
    /**
     * 删除
     * @param id
     * @return
     */
    boolean delete(Long id);
    
}
