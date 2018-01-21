package com.sys.commons;

/**
 *
 */
public class ReqResult {
	private int resultCode;// 返回码
	private Object returnObject;// 返回对象

	// 系统级错误
	public static final int resultCode_Success = 1000;// 成功
	public static final int resultCode_error = 9999;// 系统异常
	public static final int resultCode_no_permission = 1001;// 无操作权限
	public static final int resultCode_login_error = 1002;// 帐号验证失败
	public static final int resultCode_rand_error = 1003;// 验证码验证失败
	public static final int resultCode_not_login = 1004;// 用户未登录-跳到登录页面
	public static final int resultCode_param_error = 1005;// 参数格式错误
	public static final int resultCode_param_lost = 1006;// 参数缺失
	public static final int resultCode_norole = 1007;// 角色未分配
	public static final int resultCode_exist=1008;//对象已存在
	public static final int resultCode_not_exist=1009;//对象不存在
	public static final int resultCode_fail=1010;//操作失败
	public static final int resultCode_objecr_number=1011;//对象数量不足
	public static final int resultCode_file_error=1999;//文件错误

	// 用户模块错误
	public static final int resultCode_user_forbid = 2001;// 禁用/删除用户
	public static final int resultCode_user_existed = 2002;// 

	//角色模块错误
	public static final int resultCode_role_forbid = 3001;// 不能删除自己

	public int getResultCode() {
		return resultCode;
	}
	public void setResultCode(int resultCode) {
		this.resultCode = resultCode;
	}
	public Object getReturnObject() {
		return returnObject;
	}
	public void setReturnObject(Object returnObject) {
		this.returnObject = returnObject;
	}
}
