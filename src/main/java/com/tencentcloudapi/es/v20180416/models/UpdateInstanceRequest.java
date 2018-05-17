package com.tencentcloudapi.es.v20180416.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class UpdateInstanceRequest  extends AbstractModel{


    /**
    * 要操作的实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;
    

    /**
    * 修改后的实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;
    

    /**
    * 横向扩缩容后的节点个数
    */
    @SerializedName("NodeNum")
    @Expose
    private Integer NodeNum;
    

    /**
    * 修改后的配置项
    */
    @SerializedName("EsConfig")
    @Expose
    private String EsConfig;
    

    /**
    * 重置后的用户密码
    */
    @SerializedName("Password")
    @Expose
    private String Password;
    

    /**
    * 修改后的访问控制列表
    */
    @SerializedName("EsAcl")
    @Expose
    private String EsAcl;
    

    /**
     * 获取要操作的实例ID
     * @return InstanceId 要操作的实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置要操作的实例ID
     * @param InstanceId 要操作的实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取修改后的实例名称
     * @return InstanceName 修改后的实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * 设置修改后的实例名称
     * @param InstanceName 修改后的实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * 获取横向扩缩容后的节点个数
     * @return NodeNum 横向扩缩容后的节点个数
     */
    public Integer getNodeNum() {
        return this.NodeNum;
    }

    /**
     * 设置横向扩缩容后的节点个数
     * @param NodeNum 横向扩缩容后的节点个数
     */
    public void setNodeNum(Integer NodeNum) {
        this.NodeNum = NodeNum;
    }

    /**
     * 获取修改后的配置项
     * @return EsConfig 修改后的配置项
     */
    public String getEsConfig() {
        return this.EsConfig;
    }

    /**
     * 设置修改后的配置项
     * @param EsConfig 修改后的配置项
     */
    public void setEsConfig(String EsConfig) {
        this.EsConfig = EsConfig;
    }

    /**
     * 获取重置后的用户密码
     * @return Password 重置后的用户密码
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * 设置重置后的用户密码
     * @param Password 重置后的用户密码
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * 获取修改后的访问控制列表
     * @return EsAcl 修改后的访问控制列表
     */
    public String getEsAcl() {
        return this.EsAcl;
    }

    /**
     * 设置修改后的访问控制列表
     * @param EsAcl 修改后的访问控制列表
     */
    public void setEsAcl(String EsAcl) {
        this.EsAcl = EsAcl;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "NodeNum", this.NodeNum);
        this.setParamSimple(map, prefix + "EsConfig", this.EsConfig);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "EsAcl", this.EsAcl);

    }
}

