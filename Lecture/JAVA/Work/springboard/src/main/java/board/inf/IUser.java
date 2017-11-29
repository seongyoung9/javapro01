package board.inf;

import java.util.List;

import board.model.ModelUser;

public interface IUser {
	
	int insertUser(ModelUser user) throws Exception;
	List<ModelUser> login( ModelUser user ) throws Exception;
	int logout( String out ) throws Exception;
	int updateUserInfo( ModelUser updateValue, ModelUser searchValue) throws Exception;
	int updatePasswd( String newpasswd, String currentPasswd, String userid) throws Exception;
	int deleteUser( ModelUser user ) throws Exception;
	List<ModelUser> selectUserOne( ModelUser user ) throws Exception;
	List<ModelUser> selectUserList( ModelUser user ) throws Exception;
	int checkuserid( String id ) throws Exception;
	
}
