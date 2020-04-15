/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScaleOutInstanceRequest extends AbstractModel{

    /**
    * 扩容的时间单位。取值范围：
<li>s：表示秒。PayMode取值为0时，TimeUnit只能取值为s。</li>
<li>m：表示月份。PayMode取值为1时，TimeUnit只能取值为m。</li>
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * 扩容的时长。结合TimeUnit一起使用。
<li>TimeUnit为s时，该参数只能填写3600，表示按量计费实例。</li>
<li>TimeUnit为m时，该参数填写的数字表示包年包月实例的购买时长，如1表示购买一个月</li>
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * 实例ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例计费模式。取值范围：
<li>0：表示按量计费。</li>
<li>1：表示包年包月。</li>
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * 客户端Token。
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * 引导操作脚本设置。
    */
    @SerializedName("PreExecutedFileSettings")
    @Expose
    private PreExecuteFileSettings [] PreExecutedFileSettings;

    /**
    * 扩容的Task节点数量。
    */
    @SerializedName("TaskCount")
    @Expose
    private Long TaskCount;

    /**
    * 扩容的Core节点数量。
    */
    @SerializedName("CoreCount")
    @Expose
    private Long CoreCount;

    /**
    * 扩容时不需要安装的进程。
    */
    @SerializedName("UnNecessaryNodeList")
    @Expose
    private Long [] UnNecessaryNodeList;

    /**
    * 扩容的Router节点数量。
    */
    @SerializedName("RouterCount")
    @Expose
    private Long RouterCount;

    /**
    * 部署的服务。
<li>SoftDeployInfo和ServiceNodeInfo是同组参数，和UnNecessaryNodeList参数互斥。</li>
<li>建议使用SoftDeployInfo和ServiceNodeInfo组合。</li>
    */
    @SerializedName("SoftDeployInfo")
    @Expose
    private Long [] SoftDeployInfo;

    /**
    * 启动的进程。
    */
    @SerializedName("ServiceNodeInfo")
    @Expose
    private Long [] ServiceNodeInfo;

    /**
    * 分散置放群组ID列表，当前仅支持指定一个。
    */
    @SerializedName("DisasterRecoverGroupIds")
    @Expose
    private String [] DisasterRecoverGroupIds;

    /**
    * 扩容节点绑定标签列表。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get 扩容的时间单位。取值范围：
<li>s：表示秒。PayMode取值为0时，TimeUnit只能取值为s。</li>
<li>m：表示月份。PayMode取值为1时，TimeUnit只能取值为m。</li> 
     * @return TimeUnit 扩容的时间单位。取值范围：
<li>s：表示秒。PayMode取值为0时，TimeUnit只能取值为s。</li>
<li>m：表示月份。PayMode取值为1时，TimeUnit只能取值为m。</li>
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set 扩容的时间单位。取值范围：
<li>s：表示秒。PayMode取值为0时，TimeUnit只能取值为s。</li>
<li>m：表示月份。PayMode取值为1时，TimeUnit只能取值为m。</li>
     * @param TimeUnit 扩容的时间单位。取值范围：
<li>s：表示秒。PayMode取值为0时，TimeUnit只能取值为s。</li>
<li>m：表示月份。PayMode取值为1时，TimeUnit只能取值为m。</li>
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get 扩容的时长。结合TimeUnit一起使用。
<li>TimeUnit为s时，该参数只能填写3600，表示按量计费实例。</li>
<li>TimeUnit为m时，该参数填写的数字表示包年包月实例的购买时长，如1表示购买一个月</li> 
     * @return TimeSpan 扩容的时长。结合TimeUnit一起使用。
<li>TimeUnit为s时，该参数只能填写3600，表示按量计费实例。</li>
<li>TimeUnit为m时，该参数填写的数字表示包年包月实例的购买时长，如1表示购买一个月</li>
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set 扩容的时长。结合TimeUnit一起使用。
<li>TimeUnit为s时，该参数只能填写3600，表示按量计费实例。</li>
<li>TimeUnit为m时，该参数填写的数字表示包年包月实例的购买时长，如1表示购买一个月</li>
     * @param TimeSpan 扩容的时长。结合TimeUnit一起使用。
<li>TimeUnit为s时，该参数只能填写3600，表示按量计费实例。</li>
<li>TimeUnit为m时，该参数填写的数字表示包年包月实例的购买时长，如1表示购买一个月</li>
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get 实例ID。 
     * @return InstanceId 实例ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID。
     * @param InstanceId 实例ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例计费模式。取值范围：
<li>0：表示按量计费。</li>
<li>1：表示包年包月。</li> 
     * @return PayMode 实例计费模式。取值范围：
<li>0：表示按量计费。</li>
<li>1：表示包年包月。</li>
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 实例计费模式。取值范围：
<li>0：表示按量计费。</li>
<li>1：表示包年包月。</li>
     * @param PayMode 实例计费模式。取值范围：
<li>0：表示按量计费。</li>
<li>1：表示包年包月。</li>
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 客户端Token。 
     * @return ClientToken 客户端Token。
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set 客户端Token。
     * @param ClientToken 客户端Token。
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get 引导操作脚本设置。 
     * @return PreExecutedFileSettings 引导操作脚本设置。
     */
    public PreExecuteFileSettings [] getPreExecutedFileSettings() {
        return this.PreExecutedFileSettings;
    }

    /**
     * Set 引导操作脚本设置。
     * @param PreExecutedFileSettings 引导操作脚本设置。
     */
    public void setPreExecutedFileSettings(PreExecuteFileSettings [] PreExecutedFileSettings) {
        this.PreExecutedFileSettings = PreExecutedFileSettings;
    }

    /**
     * Get 扩容的Task节点数量。 
     * @return TaskCount 扩容的Task节点数量。
     */
    public Long getTaskCount() {
        return this.TaskCount;
    }

    /**
     * Set 扩容的Task节点数量。
     * @param TaskCount 扩容的Task节点数量。
     */
    public void setTaskCount(Long TaskCount) {
        this.TaskCount = TaskCount;
    }

    /**
     * Get 扩容的Core节点数量。 
     * @return CoreCount 扩容的Core节点数量。
     */
    public Long getCoreCount() {
        return this.CoreCount;
    }

    /**
     * Set 扩容的Core节点数量。
     * @param CoreCount 扩容的Core节点数量。
     */
    public void setCoreCount(Long CoreCount) {
        this.CoreCount = CoreCount;
    }

    /**
     * Get 扩容时不需要安装的进程。 
     * @return UnNecessaryNodeList 扩容时不需要安装的进程。
     */
    public Long [] getUnNecessaryNodeList() {
        return this.UnNecessaryNodeList;
    }

    /**
     * Set 扩容时不需要安装的进程。
     * @param UnNecessaryNodeList 扩容时不需要安装的进程。
     */
    public void setUnNecessaryNodeList(Long [] UnNecessaryNodeList) {
        this.UnNecessaryNodeList = UnNecessaryNodeList;
    }

    /**
     * Get 扩容的Router节点数量。 
     * @return RouterCount 扩容的Router节点数量。
     */
    public Long getRouterCount() {
        return this.RouterCount;
    }

    /**
     * Set 扩容的Router节点数量。
     * @param RouterCount 扩容的Router节点数量。
     */
    public void setRouterCount(Long RouterCount) {
        this.RouterCount = RouterCount;
    }

    /**
     * Get 部署的服务。
<li>SoftDeployInfo和ServiceNodeInfo是同组参数，和UnNecessaryNodeList参数互斥。</li>
<li>建议使用SoftDeployInfo和ServiceNodeInfo组合。</li> 
     * @return SoftDeployInfo 部署的服务。
<li>SoftDeployInfo和ServiceNodeInfo是同组参数，和UnNecessaryNodeList参数互斥。</li>
<li>建议使用SoftDeployInfo和ServiceNodeInfo组合。</li>
     */
    public Long [] getSoftDeployInfo() {
        return this.SoftDeployInfo;
    }

    /**
     * Set 部署的服务。
<li>SoftDeployInfo和ServiceNodeInfo是同组参数，和UnNecessaryNodeList参数互斥。</li>
<li>建议使用SoftDeployInfo和ServiceNodeInfo组合。</li>
     * @param SoftDeployInfo 部署的服务。
<li>SoftDeployInfo和ServiceNodeInfo是同组参数，和UnNecessaryNodeList参数互斥。</li>
<li>建议使用SoftDeployInfo和ServiceNodeInfo组合。</li>
     */
    public void setSoftDeployInfo(Long [] SoftDeployInfo) {
        this.SoftDeployInfo = SoftDeployInfo;
    }

    /**
     * Get 启动的进程。 
     * @return ServiceNodeInfo 启动的进程。
     */
    public Long [] getServiceNodeInfo() {
        return this.ServiceNodeInfo;
    }

    /**
     * Set 启动的进程。
     * @param ServiceNodeInfo 启动的进程。
     */
    public void setServiceNodeInfo(Long [] ServiceNodeInfo) {
        this.ServiceNodeInfo = ServiceNodeInfo;
    }

    /**
     * Get 分散置放群组ID列表，当前仅支持指定一个。 
     * @return DisasterRecoverGroupIds 分散置放群组ID列表，当前仅支持指定一个。
     */
    public String [] getDisasterRecoverGroupIds() {
        return this.DisasterRecoverGroupIds;
    }

    /**
     * Set 分散置放群组ID列表，当前仅支持指定一个。
     * @param DisasterRecoverGroupIds 分散置放群组ID列表，当前仅支持指定一个。
     */
    public void setDisasterRecoverGroupIds(String [] DisasterRecoverGroupIds) {
        this.DisasterRecoverGroupIds = DisasterRecoverGroupIds;
    }

    /**
     * Get 扩容节点绑定标签列表。 
     * @return Tags 扩容节点绑定标签列表。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 扩容节点绑定标签列表。
     * @param Tags 扩容节点绑定标签列表。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamArrayObj(map, prefix + "PreExecutedFileSettings.", this.PreExecutedFileSettings);
        this.setParamSimple(map, prefix + "TaskCount", this.TaskCount);
        this.setParamSimple(map, prefix + "CoreCount", this.CoreCount);
        this.setParamArraySimple(map, prefix + "UnNecessaryNodeList.", this.UnNecessaryNodeList);
        this.setParamSimple(map, prefix + "RouterCount", this.RouterCount);
        this.setParamArraySimple(map, prefix + "SoftDeployInfo.", this.SoftDeployInfo);
        this.setParamArraySimple(map, prefix + "ServiceNodeInfo.", this.ServiceNodeInfo);
        this.setParamArraySimple(map, prefix + "DisasterRecoverGroupIds.", this.DisasterRecoverGroupIds);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

