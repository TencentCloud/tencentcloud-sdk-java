package com.tencentcloudapi.tia.v20180226.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class CreateJobRequest  extends AbstractModel{


    /**
    * 任务名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 运行任务的集群
    */
    @SerializedName("Cluster")
    @Expose
    private String Cluster;

    /**
    * 运行任务的环境
    */
    @SerializedName("RuntimeVersion")
    @Expose
    private String RuntimeVersion;

    /**
    * 挂载的路径，支持nfs,cos(cos只在tia运行环境中支持)
    */
    @SerializedName("PackageDir")
    @Expose
    private String [] PackageDir;

    /**
    * 任务启动命令
    */
    @SerializedName("Command")
    @Expose
    private String [] Command;

    /**
    * 任务启动参数
    */
    @SerializedName("Args")
    @Expose
    private String [] Args;

    /**
    * 运行任务的配置信息
    */
    @SerializedName("ScaleTier")
    @Expose
    private String ScaleTier;

    /**
    * （ScaleTier为Custom时）master机器类型
    */
    @SerializedName("MasterType")
    @Expose
    private String MasterType;

    /**
    * （ScaleTier为Custom时）worker机器类型
    */
    @SerializedName("WorkerType")
    @Expose
    private String WorkerType;

    /**
    * （ScaleTier为Custom时）parameter server机器类型
    */
    @SerializedName("ParameterServerType")
    @Expose
    private String ParameterServerType;

    /**
    * （ScaleTier为Custom时）worker机器数量
    */
    @SerializedName("WorkerCount")
    @Expose
    private Integer WorkerCount;

    /**
    * （ScaleTier为Custom时）parameter server机器数量
    */
    @SerializedName("ParameterServerCount")
    @Expose
    private Integer ParameterServerCount;

    /**
    * 启动debug mode，默认为false
    */
    @SerializedName("Debug")
    @Expose
    private Boolean Debug;

    /**
     * 获取任务名称
     * @return Name 任务名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置任务名称
     * @param Name 任务名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取运行任务的集群
     * @return Cluster 运行任务的集群
     */
    public String getCluster() {
        return this.Cluster;
    }

    /**
     * 设置运行任务的集群
     * @param Cluster 运行任务的集群
     */
    public void setCluster(String Cluster) {
        this.Cluster = Cluster;
    }

    /**
     * 获取运行任务的环境
     * @return RuntimeVersion 运行任务的环境
     */
    public String getRuntimeVersion() {
        return this.RuntimeVersion;
    }

    /**
     * 设置运行任务的环境
     * @param RuntimeVersion 运行任务的环境
     */
    public void setRuntimeVersion(String RuntimeVersion) {
        this.RuntimeVersion = RuntimeVersion;
    }

    /**
     * 获取挂载的路径，支持nfs,cos(cos只在tia运行环境中支持)
     * @return PackageDir 挂载的路径，支持nfs,cos(cos只在tia运行环境中支持)
     */
    public String [] getPackageDir() {
        return this.PackageDir;
    }

    /**
     * 设置挂载的路径，支持nfs,cos(cos只在tia运行环境中支持)
     * @param PackageDir 挂载的路径，支持nfs,cos(cos只在tia运行环境中支持)
     */
    public void setPackageDir(String [] PackageDir) {
        this.PackageDir = PackageDir;
    }

    /**
     * 获取任务启动命令
     * @return Command 任务启动命令
     */
    public String [] getCommand() {
        return this.Command;
    }

    /**
     * 设置任务启动命令
     * @param Command 任务启动命令
     */
    public void setCommand(String [] Command) {
        this.Command = Command;
    }

    /**
     * 获取任务启动参数
     * @return Args 任务启动参数
     */
    public String [] getArgs() {
        return this.Args;
    }

    /**
     * 设置任务启动参数
     * @param Args 任务启动参数
     */
    public void setArgs(String [] Args) {
        this.Args = Args;
    }

    /**
     * 获取运行任务的配置信息
     * @return ScaleTier 运行任务的配置信息
     */
    public String getScaleTier() {
        return this.ScaleTier;
    }

    /**
     * 设置运行任务的配置信息
     * @param ScaleTier 运行任务的配置信息
     */
    public void setScaleTier(String ScaleTier) {
        this.ScaleTier = ScaleTier;
    }

    /**
     * 获取（ScaleTier为Custom时）master机器类型
     * @return MasterType （ScaleTier为Custom时）master机器类型
     */
    public String getMasterType() {
        return this.MasterType;
    }

    /**
     * 设置（ScaleTier为Custom时）master机器类型
     * @param MasterType （ScaleTier为Custom时）master机器类型
     */
    public void setMasterType(String MasterType) {
        this.MasterType = MasterType;
    }

    /**
     * 获取（ScaleTier为Custom时）worker机器类型
     * @return WorkerType （ScaleTier为Custom时）worker机器类型
     */
    public String getWorkerType() {
        return this.WorkerType;
    }

    /**
     * 设置（ScaleTier为Custom时）worker机器类型
     * @param WorkerType （ScaleTier为Custom时）worker机器类型
     */
    public void setWorkerType(String WorkerType) {
        this.WorkerType = WorkerType;
    }

    /**
     * 获取（ScaleTier为Custom时）parameter server机器类型
     * @return ParameterServerType （ScaleTier为Custom时）parameter server机器类型
     */
    public String getParameterServerType() {
        return this.ParameterServerType;
    }

    /**
     * 设置（ScaleTier为Custom时）parameter server机器类型
     * @param ParameterServerType （ScaleTier为Custom时）parameter server机器类型
     */
    public void setParameterServerType(String ParameterServerType) {
        this.ParameterServerType = ParameterServerType;
    }

    /**
     * 获取（ScaleTier为Custom时）worker机器数量
     * @return WorkerCount （ScaleTier为Custom时）worker机器数量
     */
    public Integer getWorkerCount() {
        return this.WorkerCount;
    }

    /**
     * 设置（ScaleTier为Custom时）worker机器数量
     * @param WorkerCount （ScaleTier为Custom时）worker机器数量
     */
    public void setWorkerCount(Integer WorkerCount) {
        this.WorkerCount = WorkerCount;
    }

    /**
     * 获取（ScaleTier为Custom时）parameter server机器数量
     * @return ParameterServerCount （ScaleTier为Custom时）parameter server机器数量
     */
    public Integer getParameterServerCount() {
        return this.ParameterServerCount;
    }

    /**
     * 设置（ScaleTier为Custom时）parameter server机器数量
     * @param ParameterServerCount （ScaleTier为Custom时）parameter server机器数量
     */
    public void setParameterServerCount(Integer ParameterServerCount) {
        this.ParameterServerCount = ParameterServerCount;
    }

    /**
     * 获取启动debug mode，默认为false
     * @return Debug 启动debug mode，默认为false
     */
    public Boolean getDebug() {
        return this.Debug;
    }

    /**
     * 设置启动debug mode，默认为false
     * @param Debug 启动debug mode，默认为false
     */
    public void setDebug(Boolean Debug) {
        this.Debug = Debug;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Cluster", this.Cluster);
        this.setParamSimple(map, prefix + "RuntimeVersion", this.RuntimeVersion);
        this.setParamArraySimple(map, prefix + "PackageDir.", this.PackageDir);
        this.setParamArraySimple(map, prefix + "Command.", this.Command);
        this.setParamArraySimple(map, prefix + "Args.", this.Args);
        this.setParamSimple(map, prefix + "ScaleTier", this.ScaleTier);
        this.setParamSimple(map, prefix + "MasterType", this.MasterType);
        this.setParamSimple(map, prefix + "WorkerType", this.WorkerType);
        this.setParamSimple(map, prefix + "ParameterServerType", this.ParameterServerType);
        this.setParamSimple(map, prefix + "WorkerCount", this.WorkerCount);
        this.setParamSimple(map, prefix + "ParameterServerCount", this.ParameterServerCount);
        this.setParamSimple(map, prefix + "Debug", this.Debug);

    }
}

