package com.tencentcloudapi.ms.v20180408.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class CreateShieldInstanceRequest  extends AbstractModel{


    /**
    * 待加固的应用信息
    */
    @SerializedName("AppInfo")
    @Expose
    private AppInfo AppInfo;

    /**
    * 加固服务信息
    */
    @SerializedName("ServiceInfo")
    @Expose
    private ServiceInfo ServiceInfo;

    /**
     * 获取待加固的应用信息
     * @return AppInfo 待加固的应用信息
     */
    public AppInfo getAppInfo() {
        return this.AppInfo;
    }

    /**
     * 设置待加固的应用信息
     * @param AppInfo 待加固的应用信息
     */
    public void setAppInfo(AppInfo AppInfo) {
        this.AppInfo = AppInfo;
    }

    /**
     * 获取加固服务信息
     * @return ServiceInfo 加固服务信息
     */
    public ServiceInfo getServiceInfo() {
        return this.ServiceInfo;
    }

    /**
     * 设置加固服务信息
     * @param ServiceInfo 加固服务信息
     */
    public void setServiceInfo(ServiceInfo ServiceInfo) {
        this.ServiceInfo = ServiceInfo;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "AppInfo.", this.AppInfo);
        this.setParamObj(map, prefix + "ServiceInfo.", this.ServiceInfo);

    }
}

