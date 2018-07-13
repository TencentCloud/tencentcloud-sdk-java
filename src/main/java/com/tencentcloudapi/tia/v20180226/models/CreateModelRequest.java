package com.tencentcloudapi.tia.v20180226.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class CreateModelRequest  extends AbstractModel{


    /**
    * 模型名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 指定集群的名称
    */
    @SerializedName("Cluster")
    @Expose
    private String Cluster;

    /**
    * 要部署模型的路径名
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * 关于模型的描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 运行环境镜像的标签
    */
    @SerializedName("RuntimeVersion")
    @Expose
    private String RuntimeVersion;

    /**
    * 要部署的模型副本数目
    */
    @SerializedName("Replicas")
    @Expose
    private Integer Replicas;

    /**
    * 暴露外网或内网，默认暴露外网
    */
    @SerializedName("Expose")
    @Expose
    private String Expose;

    /**
    * 要部署模型的机器配置
    */
    @SerializedName("ServType")
    @Expose
    private String ServType;

    /**
     * 获取模型名称
     * @return Name 模型名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置模型名称
     * @param Name 模型名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取指定集群的名称
     * @return Cluster 指定集群的名称
     */
    public String getCluster() {
        return this.Cluster;
    }

    /**
     * 设置指定集群的名称
     * @param Cluster 指定集群的名称
     */
    public void setCluster(String Cluster) {
        this.Cluster = Cluster;
    }

    /**
     * 获取要部署模型的路径名
     * @return Model 要部署模型的路径名
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * 设置要部署模型的路径名
     * @param Model 要部署模型的路径名
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * 获取关于模型的描述
     * @return Description 关于模型的描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * 设置关于模型的描述
     * @param Description 关于模型的描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * 获取运行环境镜像的标签
     * @return RuntimeVersion 运行环境镜像的标签
     */
    public String getRuntimeVersion() {
        return this.RuntimeVersion;
    }

    /**
     * 设置运行环境镜像的标签
     * @param RuntimeVersion 运行环境镜像的标签
     */
    public void setRuntimeVersion(String RuntimeVersion) {
        this.RuntimeVersion = RuntimeVersion;
    }

    /**
     * 获取要部署的模型副本数目
     * @return Replicas 要部署的模型副本数目
     */
    public Integer getReplicas() {
        return this.Replicas;
    }

    /**
     * 设置要部署的模型副本数目
     * @param Replicas 要部署的模型副本数目
     */
    public void setReplicas(Integer Replicas) {
        this.Replicas = Replicas;
    }

    /**
     * 获取暴露外网或内网，默认暴露外网
     * @return Expose 暴露外网或内网，默认暴露外网
     */
    public String getExpose() {
        return this.Expose;
    }

    /**
     * 设置暴露外网或内网，默认暴露外网
     * @param Expose 暴露外网或内网，默认暴露外网
     */
    public void setExpose(String Expose) {
        this.Expose = Expose;
    }

    /**
     * 获取要部署模型的机器配置
     * @return ServType 要部署模型的机器配置
     */
    public String getServType() {
        return this.ServType;
    }

    /**
     * 设置要部署模型的机器配置
     * @param ServType 要部署模型的机器配置
     */
    public void setServType(String ServType) {
        this.ServType = ServType;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Cluster", this.Cluster);
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "RuntimeVersion", this.RuntimeVersion);
        this.setParamSimple(map, prefix + "Replicas", this.Replicas);
        this.setParamSimple(map, prefix + "Expose", this.Expose);
        this.setParamSimple(map, prefix + "ServType", this.ServType);

    }
}

