package com.tencentcloudapi.cvm.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class EnhancedService  extends AbstractModel{


    /**
    * 开启云安全服务。若不指定该参数，则默认开启云安全服务。
    */
    @SerializedName("SecurityService")
    @Expose
    private RunSecurityServiceEnabled SecurityService;
    

    /**
    * 开启云安全服务。若不指定该参数，则默认开启云监控服务。
    */
    @SerializedName("MonitorService")
    @Expose
    private RunMonitorServiceEnabled MonitorService;
    

    /**
     * 获取开启云安全服务。若不指定该参数，则默认开启云安全服务。
     * @return SecurityService 开启云安全服务。若不指定该参数，则默认开启云安全服务。
     */
    public RunSecurityServiceEnabled getSecurityService() {
        return this.SecurityService;
    }

    /**
     * 设置开启云安全服务。若不指定该参数，则默认开启云安全服务。
     * @param SecurityService 开启云安全服务。若不指定该参数，则默认开启云安全服务。
     */
    public void setSecurityService(RunSecurityServiceEnabled SecurityService) {
        this.SecurityService = SecurityService;
    }

    /**
     * 获取开启云安全服务。若不指定该参数，则默认开启云监控服务。
     * @return MonitorService 开启云安全服务。若不指定该参数，则默认开启云监控服务。
     */
    public RunMonitorServiceEnabled getMonitorService() {
        return this.MonitorService;
    }

    /**
     * 设置开启云安全服务。若不指定该参数，则默认开启云监控服务。
     * @param MonitorService 开启云安全服务。若不指定该参数，则默认开启云监控服务。
     */
    public void setMonitorService(RunMonitorServiceEnabled MonitorService) {
        this.MonitorService = MonitorService;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "SecurityService.", this.SecurityService);
        this.setParamObj(map, prefix + "MonitorService.", this.MonitorService);

    }
}

