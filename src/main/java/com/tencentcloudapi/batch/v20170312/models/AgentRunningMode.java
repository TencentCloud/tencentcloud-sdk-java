package com.tencentcloudapi.batch.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class AgentRunningMode  extends AbstractModel{


    /**
    * 场景类型，支持WINDOWS
    */
    @SerializedName("Scene")
    @Expose
    private String Scene;

    /**
    * 运行Agent的User
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * 运行Agent的Session
    */
    @SerializedName("Session")
    @Expose
    private String Session;

    /**
     * 获取场景类型，支持WINDOWS
     * @return Scene 场景类型，支持WINDOWS
     */
    public String getScene() {
        return this.Scene;
    }

    /**
     * 设置场景类型，支持WINDOWS
     * @param Scene 场景类型，支持WINDOWS
     */
    public void setScene(String Scene) {
        this.Scene = Scene;
    }

    /**
     * 获取运行Agent的User
     * @return User 运行Agent的User
     */
    public String getUser() {
        return this.User;
    }

    /**
     * 设置运行Agent的User
     * @param User 运行Agent的User
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * 获取运行Agent的Session
     * @return Session 运行Agent的Session
     */
    public String getSession() {
        return this.Session;
    }

    /**
     * 设置运行Agent的Session
     * @param Session 运行Agent的Session
     */
    public void setSession(String Session) {
        this.Session = Session;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Scene", this.Scene);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "Session", this.Session);

    }
}

