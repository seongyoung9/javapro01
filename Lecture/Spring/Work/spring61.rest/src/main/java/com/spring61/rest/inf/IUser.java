package com.spring61.rest.inf;

import java.util.List;

import com.spring61.rest.model.ModelUser;

public interface IUser {

   int insertUser(ModelUser user);
   
   ModelUser login(String userid, String passwd);
   
   int logout(String userid);
   
   int updateUserInfo(ModelUser setValue, ModelUser whereValue);
   
   int updatePasswd(String userid, String currentPasswd, String newPasswd);
   
   int updateRetire(ModelUser user);
   
   ModelUser selectUserOne(ModelUser user);
   
   List<ModelUser> selectUserList(ModelUser user);
   
   // id중복확인 메서드
   int checkuserid(String userid);
}
