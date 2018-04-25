package com.tencentcloudapi.batch.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class EnvData  extends AbstractModel{


    /**
    * CVM实例类型
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;
    

    /**
    * CVM镜像ID
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;
    

    /**
    * 实例系统盘配置信息
    */
    @SerializedName("SystemDisk")
    @Expose
    private SystemDisk SystemDisk;
    

    /**
    * 实例数据盘配置信息
    */
    @SerializedName("DataDisks")
    @Expose
    private DataDisk [] DataDisks;
    

    /**
    * 私有网络相关信息配置
    */
    @SerializedName("VirtualPrivateCloud")
    @Expose
    private VirtualPrivateCloud VirtualPrivateCloud;
    

    /**
    * 公网带宽相关信息设置
    */
    @SerializedName("InternetAccessible")
    @Expose
    private InternetAccessible InternetAccessible;
    

    /**
    * CVM实例显示名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;
    

    /**
    * 实例登录设置
    */
    @SerializedName("LoginSettings")
    @Expose
    private LoginSettings LoginSettings;
    

    /**
    * 实例所属安全组
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;
    

    /**
    * 增强服务。通过该参数可以指定是否开启云安全、云监控等服务。若不指定该参数，则默认开启云监控、云安全服务。
    */
    @SerializedName("EnhancedService")
    @Expose
    private EnhancedService EnhancedService;
    

    /**
     * 获取CVM实例类型
     * @return InstanceType CVM实例类型
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * 设置CVM实例类型
     * @param InstanceType CVM实例类型
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * 获取CVM镜像ID
     * @return ImageId CVM镜像ID
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * 设置CVM镜像ID
     * @param ImageId CVM镜像ID
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * 获取实例系统盘配置信息
     * @return SystemDisk 实例系统盘配置信息
     */
    public SystemDisk getSystemDisk() {
        return this.SystemDisk;
    }

    /**
     * 设置实例系统盘配置信息
     * @param SystemDisk 实例系统盘配置信息
     */
    public void setSystemDisk(SystemDisk SystemDisk) {
        this.SystemDisk = SystemDisk;
    }

    /**
     * 获取实例数据盘配置信息
     * @return DataDisks 实例数据盘配置信息
     */
    public DataDisk [] getDataDisks() {
        return this.DataDisks;
    }

    /**
     * 设置实例数据盘配置信息
     * @param DataDisks 实例数据盘配置信息
     */
    public void setDataDisks(DataDisk [] DataDisks) {
        this.DataDisks = DataDisks;
    }

    /**
     * 获取私有网络相关信息配置
     * @return VirtualPrivateCloud 私有网络相关信息配置
     */
    public VirtualPrivateCloud getVirtualPrivateCloud() {
        return this.VirtualPrivateCloud;
    }

    /**
     * 设置私有网络相关信息配置
     * @param VirtualPrivateCloud 私有网络相关信息配置
     */
    public void setVirtualPrivateCloud(VirtualPrivateCloud VirtualPrivateCloud) {
        this.VirtualPrivateCloud = VirtualPrivateCloud;
    }

    /**
     * 获取公网带宽相关信息设置
     * @return InternetAccessible 公网带宽相关信息设置
     */
    public InternetAccessible getInternetAccessible() {
        return this.InternetAccessible;
    }

    /**
     * 设置公网带宽相关信息设置
     * @param InternetAccessible 公网带宽相关信息设置
     */
    public void setInternetAccessible(InternetAccessible InternetAccessible) {
        this.InternetAccessible = InternetAccessible;
    }

    /**
     * 获取CVM实例显示名称
     * @return InstanceName CVM实例显示名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * 设置CVM实例显示名称
     * @param InstanceName CVM实例显示名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * 获取实例登录设置
     * @return LoginSettings 实例登录设置
     */
    public LoginSettings getLoginSettings() {
        return this.LoginSettings;
    }

    /**
     * 设置实例登录设置
     * @param LoginSettings 实例登录设置
     */
    public void setLoginSettings(LoginSettings LoginSettings) {
        this.LoginSettings = LoginSettings;
    }

    /**
     * 获取实例所属安全组
     * @return SecurityGroupIds 实例所属安全组
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * 设置实例所属安全组
     * @param SecurityGroupIds 实例所属安全组
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * 获取增强服务。通过该参数可以指定是否开启云安全、云监控等服务。若不指定该参数，则默认开启云监控、云安全服务。
     * @return EnhancedService 增强服务。通过该参数可以指定是否开启云安全、云监控等服务。若不指定该参数，则默认开启云监控、云安全服务。
     */
    public EnhancedService getEnhancedService() {
        return this.EnhancedService;
    }

    /**
     * 设置增强服务。通过该参数可以指定是否开启云安全、云监控等服务。若不指定该参数，则默认开启云监控、云安全服务。
     * @param EnhancedService 增强服务。通过该参数可以指定是否开启云安全、云监控等服务。若不指定该参数，则默认开启云监控、云安全服务。
     */
    public void setEnhancedService(EnhancedService EnhancedService) {
        this.EnhancedService = EnhancedService;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamObj(map, prefix + "SystemDisk.", this.SystemDisk);
        this.setParamArrayObj(map, prefix + "DataDisks.", this.DataDisks);
        this.setParamObj(map, prefix + "VirtualPrivateCloud.", this.VirtualPrivateCloud);
        this.setParamObj(map, prefix + "InternetAccessible.", this.InternetAccessible);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamObj(map, prefix + "LoginSettings.", this.LoginSettings);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamObj(map, prefix + "EnhancedService.", this.EnhancedService);

    }
}

