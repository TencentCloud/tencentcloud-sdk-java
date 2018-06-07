package com.tencentcloudapi.ms.v20180408.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class ScanSetInfo  extends AbstractModel{


    /**
    * 任务状态: 1-已完成,2-处理中,3-处理出错,4-处理超时
    */
    @SerializedName("TaskStatus")
    @Expose
    private Integer TaskStatus;
    

    /**
    * app信息
    */
    @SerializedName("AppDetailInfo")
    @Expose
    private AppDetailInfo AppDetailInfo;
    

    /**
    * 病毒信息
    */
    @SerializedName("VirusInfo")
    @Expose
    private VirusInfo VirusInfo;
    

    /**
    * 漏洞信息
    */
    @SerializedName("VulInfo")
    @Expose
    private VulInfo VulInfo;
    

    /**
    * 广告插件信息
    */
    @SerializedName("AdInfo")
    @Expose
    private AdInfo AdInfo;
    

    /**
    * 提交扫描的时间
    */
    @SerializedName("TaskTime")
    @Expose
    private Integer TaskTime;
    

    /**
     * 获取任务状态: 1-已完成,2-处理中,3-处理出错,4-处理超时
     * @return TaskStatus 任务状态: 1-已完成,2-处理中,3-处理出错,4-处理超时
     */
    public Integer getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * 设置任务状态: 1-已完成,2-处理中,3-处理出错,4-处理超时
     * @param TaskStatus 任务状态: 1-已完成,2-处理中,3-处理出错,4-处理超时
     */
    public void setTaskStatus(Integer TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * 获取app信息
     * @return AppDetailInfo app信息
     */
    public AppDetailInfo getAppDetailInfo() {
        return this.AppDetailInfo;
    }

    /**
     * 设置app信息
     * @param AppDetailInfo app信息
     */
    public void setAppDetailInfo(AppDetailInfo AppDetailInfo) {
        this.AppDetailInfo = AppDetailInfo;
    }

    /**
     * 获取病毒信息
     * @return VirusInfo 病毒信息
     */
    public VirusInfo getVirusInfo() {
        return this.VirusInfo;
    }

    /**
     * 设置病毒信息
     * @param VirusInfo 病毒信息
     */
    public void setVirusInfo(VirusInfo VirusInfo) {
        this.VirusInfo = VirusInfo;
    }

    /**
     * 获取漏洞信息
     * @return VulInfo 漏洞信息
     */
    public VulInfo getVulInfo() {
        return this.VulInfo;
    }

    /**
     * 设置漏洞信息
     * @param VulInfo 漏洞信息
     */
    public void setVulInfo(VulInfo VulInfo) {
        this.VulInfo = VulInfo;
    }

    /**
     * 获取广告插件信息
     * @return AdInfo 广告插件信息
     */
    public AdInfo getAdInfo() {
        return this.AdInfo;
    }

    /**
     * 设置广告插件信息
     * @param AdInfo 广告插件信息
     */
    public void setAdInfo(AdInfo AdInfo) {
        this.AdInfo = AdInfo;
    }

    /**
     * 获取提交扫描的时间
     * @return TaskTime 提交扫描的时间
     */
    public Integer getTaskTime() {
        return this.TaskTime;
    }

    /**
     * 设置提交扫描的时间
     * @param TaskTime 提交扫描的时间
     */
    public void setTaskTime(Integer TaskTime) {
        this.TaskTime = TaskTime;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamObj(map, prefix + "AppDetailInfo.", this.AppDetailInfo);
        this.setParamObj(map, prefix + "VirusInfo.", this.VirusInfo);
        this.setParamObj(map, prefix + "VulInfo.", this.VulInfo);
        this.setParamObj(map, prefix + "AdInfo.", this.AdInfo);
        this.setParamSimple(map, prefix + "TaskTime", this.TaskTime);

    }
}

