package com.tencentcloudapi.batch.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class AnonymousComputeEnv  extends AbstractModel{


    /**
    * 计算环境管理类型
    */
    @SerializedName("EnvType")
    @Expose
    private String EnvType;

    /**
    * 计算环境具体参数
    */
    @SerializedName("EnvData")
    @Expose
    private EnvData EnvData;

    /**
    * 数据盘挂载选项
    */
    @SerializedName("MountDataDisks")
    @Expose
    private MountDataDisk [] MountDataDisks;

    /**
    * agent运行模式，适用于Windows系统
    */
    @SerializedName("AgentRunningMode")
    @Expose
    private AgentRunningMode AgentRunningMode;

    /**
     * 获取计算环境管理类型
     * @return EnvType 计算环境管理类型
     */
    public String getEnvType() {
        return this.EnvType;
    }

    /**
     * 设置计算环境管理类型
     * @param EnvType 计算环境管理类型
     */
    public void setEnvType(String EnvType) {
        this.EnvType = EnvType;
    }

    /**
     * 获取计算环境具体参数
     * @return EnvData 计算环境具体参数
     */
    public EnvData getEnvData() {
        return this.EnvData;
    }

    /**
     * 设置计算环境具体参数
     * @param EnvData 计算环境具体参数
     */
    public void setEnvData(EnvData EnvData) {
        this.EnvData = EnvData;
    }

    /**
     * 获取数据盘挂载选项
     * @return MountDataDisks 数据盘挂载选项
     */
    public MountDataDisk [] getMountDataDisks() {
        return this.MountDataDisks;
    }

    /**
     * 设置数据盘挂载选项
     * @param MountDataDisks 数据盘挂载选项
     */
    public void setMountDataDisks(MountDataDisk [] MountDataDisks) {
        this.MountDataDisks = MountDataDisks;
    }

    /**
     * 获取agent运行模式，适用于Windows系统
     * @return AgentRunningMode agent运行模式，适用于Windows系统
     */
    public AgentRunningMode getAgentRunningMode() {
        return this.AgentRunningMode;
    }

    /**
     * 设置agent运行模式，适用于Windows系统
     * @param AgentRunningMode agent运行模式，适用于Windows系统
     */
    public void setAgentRunningMode(AgentRunningMode AgentRunningMode) {
        this.AgentRunningMode = AgentRunningMode;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvType", this.EnvType);
        this.setParamObj(map, prefix + "EnvData.", this.EnvData);
        this.setParamArrayObj(map, prefix + "MountDataDisks.", this.MountDataDisks);
        this.setParamObj(map, prefix + "AgentRunningMode.", this.AgentRunningMode);

    }
}

