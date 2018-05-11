package com.tencentcloudapi.iot.v20180123.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class AppUser  extends AbstractModel{


    /**
    * 应用Id
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;
    

    /**
    * 用户名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;
    

    /**
    * 昵称
    */
    @SerializedName("NickName")
    @Expose
    private String NickName;
    

    /**
    * 绑定设备列表
    */
    @SerializedName("Devices")
    @Expose
    private Object [] Devices;
    

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;
    

    /**
    * 修改时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;
    

    /**
     * 获取应用Id
     * @return ApplicationId 应用Id
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * 设置应用Id
     * @param ApplicationId 应用Id
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * 获取用户名
     * @return UserName 用户名
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * 设置用户名
     * @param UserName 用户名
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * 获取昵称
     * @return NickName 昵称
     */
    public String getNickName() {
        return this.NickName;
    }

    /**
     * 设置昵称
     * @param NickName 昵称
     */
    public void setNickName(String NickName) {
        this.NickName = NickName;
    }

    /**
     * 获取绑定设备列表
     * @return Devices 绑定设备列表
     */
    public Object [] getDevices() {
        return this.Devices;
    }

    /**
     * 设置绑定设备列表
     * @param Devices 绑定设备列表
     */
    public void setDevices(Object [] Devices) {
        this.Devices = Devices;
    }

    /**
     * 获取创建时间
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 获取修改时间
     * @return UpdateTime 修改时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * 设置修改时间
     * @param UpdateTime 修改时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "NickName", this.NickName);
        this.setParamArrayObj(map, prefix + "Devices.", this.Devices);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

