package top.fanzhengke.api.config;


import cn.dev33.satoken.stp.StpInterface;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class StpInterfaceImpl implements StpInterface {
    @Autowired
//    private TbUserMapper userMapper;

    /**
     * 返回一个用户所拥有的权限集合
     */
    @Override
    public List<String> getPermissionList(Object loginId, String loginKey) {
        int userId = Integer.parseInt(loginId.toString());
//        Set<String> permissions = userMapper.searchUserPermissions(userId);
        ArrayList list = new ArrayList();
//        list.addAll(permissions);
        return list;
    }


    /**
     * 返回一个用户所拥有的角色标识集合
     */
    @Override
    public List<String> getRoleList(Object loginId, String loginKey) {
        //因为本项目不需要用到角色判定，所以这里就返回一个空的ArrayList对象
        ArrayList<String> list = new ArrayList<String>();
        return list;
    }

}