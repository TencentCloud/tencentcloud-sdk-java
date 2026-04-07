/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScaleOutInstanceRequest extends AbstractModel {

    /**
    * <p>扩容的时间单位。取值范围：</p><li>s：表示秒。PayMode取值为0时，TimeUnit只能取值为s。</li><li>m：表示月份。PayMode取值为1时，TimeUnit只能取值为m。</li>
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * <p>扩容的时长。结合TimeUnit一起使用。</p><li>TimeUnit为s时，该参数只能填写3600，表示按量计费实例。</li><li>TimeUnit为m时，该参数填写的数字表示包年包月实例的购买时长，如1表示购买一个月</li>
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * <p>实例ID。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>实例计费模式。取值范围：</p><li>0：表示按量计费。</li><li>1：表示包年包月。</li>
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * <p>唯一随机标识，时效5分钟，需要调用者指定 防止客户端重新创建资源，例如 a9a90aa6-<strong><strong>-</strong></strong>-****-fae36063280</p>
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * <p>引导操作脚本设置。</p>
    */
    @SerializedName("PreExecutedFileSettings")
    @Expose
    private PreExecuteFileSettings [] PreExecutedFileSettings;

    /**
    * <p>扩容的Task节点数量。</p>
    */
    @SerializedName("TaskCount")
    @Expose
    private Long TaskCount;

    /**
    * <p>扩容的Core节点数量。</p>
    */
    @SerializedName("CoreCount")
    @Expose
    private Long CoreCount;

    /**
    * <p>扩容时不需要安装的进程。</p>
    */
    @SerializedName("UnNecessaryNodeList")
    @Expose
    private Long [] UnNecessaryNodeList;

    /**
    * <p>扩容的Router节点数量。</p>
    */
    @SerializedName("RouterCount")
    @Expose
    private Long RouterCount;

    /**
    * <p>部署的服务。</p><li>SoftDeployInfo和ServiceNodeInfo是同组参数，和UnNecessaryNodeList参数互斥。</li><li>建议使用SoftDeployInfo和ServiceNodeInfo组合。</li>
    */
    @SerializedName("SoftDeployInfo")
    @Expose
    private Long [] SoftDeployInfo;

    /**
    * <p>启动的进程。</p>
    */
    @SerializedName("ServiceNodeInfo")
    @Expose
    private Long [] ServiceNodeInfo;

    /**
    * <p>分散置放群组ID列表，当前仅支持指定一个。</p>
    */
    @SerializedName("DisasterRecoverGroupIds")
    @Expose
    private String [] DisasterRecoverGroupIds;

    /**
    * <p>扩容节点绑定标签列表。</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>扩容所选资源类型，可选范围为&quot;HOST&quot;,&quot;POD&quot;,&quot;MNode&quot;，HOST为普通的CVM资源，POD为TKE集群或EKS集群提供的资源,MNode为全托管资源类型</p>
    */
    @SerializedName("HardwareResourceType")
    @Expose
    private String HardwareResourceType;

    /**
    * <p>使用Pod资源扩容时，指定的Pod规格以及来源等信息</p>
    */
    @SerializedName("PodSpec")
    @Expose
    private PodSpec PodSpec;

    /**
    * <p>使用clickhouse集群扩容时，选择的机器分组名称</p>
    */
    @SerializedName("ClickHouseClusterName")
    @Expose
    private String ClickHouseClusterName;

    /**
    * <p>使用clickhouse集群扩容时，选择的机器分组类型。new为新增，old为选择旧分组</p>
    */
    @SerializedName("ClickHouseClusterType")
    @Expose
    private String ClickHouseClusterType;

    /**
    * <p>规则扩容指定 yarn node label</p>
    */
    @SerializedName("YarnNodeLabel")
    @Expose
    private String YarnNodeLabel;

    /**
    * <p>POD自定义权限和自定义参数</p>
    */
    @SerializedName("PodParameter")
    @Expose
    private PodParameter PodParameter;

    /**
    * <p>扩容的Master节点的数量。<br>使用clickhouse集群扩容时，该参数不生效。<br>使用kafka集群扩容时，该参数不生效。<br>当HardwareResourceType=POD时，该参数不生效。</p>
    */
    @SerializedName("MasterCount")
    @Expose
    private Long MasterCount;

    /**
    * <p>扩容后是否启动服务，true：启动，false：不启动</p>
    */
    @SerializedName("StartServiceAfterScaleOut")
    @Expose
    private String StartServiceAfterScaleOut;

    /**
    * <p>可用区，默认是集群的主可用区</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * <p>子网，默认是集群创建时的子网</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>预设配置组</p>
    */
    @SerializedName("ScaleOutServiceConfAssign")
    @Expose
    private String ScaleOutServiceConfAssign;

    /**
    * <p>0表示关闭自动续费，1表示开启自动续费</p>
    */
    @SerializedName("AutoRenew")
    @Expose
    private Long AutoRenew;

    /**
    * <p>类型为ComputeResource和EMR以及默认，默认为EMR,类型为EMR时,InstanceId生效,类型为ComputeResource时,使用ComputeResourceId标识</p>
    */
    @SerializedName("ResourceBaseType")
    @Expose
    private String ResourceBaseType;

    /**
    * <p>计算资源id</p>
    */
    @SerializedName("ComputeResourceId")
    @Expose
    private String ComputeResourceId;

    /**
    * <p>计算资源高级设置</p>
    */
    @SerializedName("ComputeResourceAdvanceParams")
    @Expose
    private ComputeResourceAdvanceParams ComputeResourceAdvanceParams;

    /**
    * <p>节点标记信息，目前只提供tf平台使用</p>
    */
    @SerializedName("NodeMarks")
    @Expose
    private NodeMark NodeMarks;

    /**
    * <p>扩容指定计算组</p>
    */
    @SerializedName("WarehouseName")
    @Expose
    private String WarehouseName;

    /**
    * <p>分区置放群组分区</p>
    */
    @SerializedName("PartitionNumber")
    @Expose
    private Long PartitionNumber;

    /**
     * Get <p>扩容的时间单位。取值范围：</p><li>s：表示秒。PayMode取值为0时，TimeUnit只能取值为s。</li><li>m：表示月份。PayMode取值为1时，TimeUnit只能取值为m。</li> 
     * @return TimeUnit <p>扩容的时间单位。取值范围：</p><li>s：表示秒。PayMode取值为0时，TimeUnit只能取值为s。</li><li>m：表示月份。PayMode取值为1时，TimeUnit只能取值为m。</li>
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set <p>扩容的时间单位。取值范围：</p><li>s：表示秒。PayMode取值为0时，TimeUnit只能取值为s。</li><li>m：表示月份。PayMode取值为1时，TimeUnit只能取值为m。</li>
     * @param TimeUnit <p>扩容的时间单位。取值范围：</p><li>s：表示秒。PayMode取值为0时，TimeUnit只能取值为s。</li><li>m：表示月份。PayMode取值为1时，TimeUnit只能取值为m。</li>
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get <p>扩容的时长。结合TimeUnit一起使用。</p><li>TimeUnit为s时，该参数只能填写3600，表示按量计费实例。</li><li>TimeUnit为m时，该参数填写的数字表示包年包月实例的购买时长，如1表示购买一个月</li> 
     * @return TimeSpan <p>扩容的时长。结合TimeUnit一起使用。</p><li>TimeUnit为s时，该参数只能填写3600，表示按量计费实例。</li><li>TimeUnit为m时，该参数填写的数字表示包年包月实例的购买时长，如1表示购买一个月</li>
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set <p>扩容的时长。结合TimeUnit一起使用。</p><li>TimeUnit为s时，该参数只能填写3600，表示按量计费实例。</li><li>TimeUnit为m时，该参数填写的数字表示包年包月实例的购买时长，如1表示购买一个月</li>
     * @param TimeSpan <p>扩容的时长。结合TimeUnit一起使用。</p><li>TimeUnit为s时，该参数只能填写3600，表示按量计费实例。</li><li>TimeUnit为m时，该参数填写的数字表示包年包月实例的购买时长，如1表示购买一个月</li>
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get <p>实例ID。</p> 
     * @return InstanceId <p>实例ID。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID。</p>
     * @param InstanceId <p>实例ID。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>实例计费模式。取值范围：</p><li>0：表示按量计费。</li><li>1：表示包年包月。</li> 
     * @return PayMode <p>实例计费模式。取值范围：</p><li>0：表示按量计费。</li><li>1：表示包年包月。</li>
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>实例计费模式。取值范围：</p><li>0：表示按量计费。</li><li>1：表示包年包月。</li>
     * @param PayMode <p>实例计费模式。取值范围：</p><li>0：表示按量计费。</li><li>1：表示包年包月。</li>
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>唯一随机标识，时效5分钟，需要调用者指定 防止客户端重新创建资源，例如 a9a90aa6-<strong><strong>-</strong></strong>-****-fae36063280</p> 
     * @return ClientToken <p>唯一随机标识，时效5分钟，需要调用者指定 防止客户端重新创建资源，例如 a9a90aa6-<strong><strong>-</strong></strong>-****-fae36063280</p>
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set <p>唯一随机标识，时效5分钟，需要调用者指定 防止客户端重新创建资源，例如 a9a90aa6-<strong><strong>-</strong></strong>-****-fae36063280</p>
     * @param ClientToken <p>唯一随机标识，时效5分钟，需要调用者指定 防止客户端重新创建资源，例如 a9a90aa6-<strong><strong>-</strong></strong>-****-fae36063280</p>
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get <p>引导操作脚本设置。</p> 
     * @return PreExecutedFileSettings <p>引导操作脚本设置。</p>
     */
    public PreExecuteFileSettings [] getPreExecutedFileSettings() {
        return this.PreExecutedFileSettings;
    }

    /**
     * Set <p>引导操作脚本设置。</p>
     * @param PreExecutedFileSettings <p>引导操作脚本设置。</p>
     */
    public void setPreExecutedFileSettings(PreExecuteFileSettings [] PreExecutedFileSettings) {
        this.PreExecutedFileSettings = PreExecutedFileSettings;
    }

    /**
     * Get <p>扩容的Task节点数量。</p> 
     * @return TaskCount <p>扩容的Task节点数量。</p>
     */
    public Long getTaskCount() {
        return this.TaskCount;
    }

    /**
     * Set <p>扩容的Task节点数量。</p>
     * @param TaskCount <p>扩容的Task节点数量。</p>
     */
    public void setTaskCount(Long TaskCount) {
        this.TaskCount = TaskCount;
    }

    /**
     * Get <p>扩容的Core节点数量。</p> 
     * @return CoreCount <p>扩容的Core节点数量。</p>
     */
    public Long getCoreCount() {
        return this.CoreCount;
    }

    /**
     * Set <p>扩容的Core节点数量。</p>
     * @param CoreCount <p>扩容的Core节点数量。</p>
     */
    public void setCoreCount(Long CoreCount) {
        this.CoreCount = CoreCount;
    }

    /**
     * Get <p>扩容时不需要安装的进程。</p> 
     * @return UnNecessaryNodeList <p>扩容时不需要安装的进程。</p>
     */
    public Long [] getUnNecessaryNodeList() {
        return this.UnNecessaryNodeList;
    }

    /**
     * Set <p>扩容时不需要安装的进程。</p>
     * @param UnNecessaryNodeList <p>扩容时不需要安装的进程。</p>
     */
    public void setUnNecessaryNodeList(Long [] UnNecessaryNodeList) {
        this.UnNecessaryNodeList = UnNecessaryNodeList;
    }

    /**
     * Get <p>扩容的Router节点数量。</p> 
     * @return RouterCount <p>扩容的Router节点数量。</p>
     */
    public Long getRouterCount() {
        return this.RouterCount;
    }

    /**
     * Set <p>扩容的Router节点数量。</p>
     * @param RouterCount <p>扩容的Router节点数量。</p>
     */
    public void setRouterCount(Long RouterCount) {
        this.RouterCount = RouterCount;
    }

    /**
     * Get <p>部署的服务。</p><li>SoftDeployInfo和ServiceNodeInfo是同组参数，和UnNecessaryNodeList参数互斥。</li><li>建议使用SoftDeployInfo和ServiceNodeInfo组合。</li> 
     * @return SoftDeployInfo <p>部署的服务。</p><li>SoftDeployInfo和ServiceNodeInfo是同组参数，和UnNecessaryNodeList参数互斥。</li><li>建议使用SoftDeployInfo和ServiceNodeInfo组合。</li>
     */
    public Long [] getSoftDeployInfo() {
        return this.SoftDeployInfo;
    }

    /**
     * Set <p>部署的服务。</p><li>SoftDeployInfo和ServiceNodeInfo是同组参数，和UnNecessaryNodeList参数互斥。</li><li>建议使用SoftDeployInfo和ServiceNodeInfo组合。</li>
     * @param SoftDeployInfo <p>部署的服务。</p><li>SoftDeployInfo和ServiceNodeInfo是同组参数，和UnNecessaryNodeList参数互斥。</li><li>建议使用SoftDeployInfo和ServiceNodeInfo组合。</li>
     */
    public void setSoftDeployInfo(Long [] SoftDeployInfo) {
        this.SoftDeployInfo = SoftDeployInfo;
    }

    /**
     * Get <p>启动的进程。</p> 
     * @return ServiceNodeInfo <p>启动的进程。</p>
     */
    public Long [] getServiceNodeInfo() {
        return this.ServiceNodeInfo;
    }

    /**
     * Set <p>启动的进程。</p>
     * @param ServiceNodeInfo <p>启动的进程。</p>
     */
    public void setServiceNodeInfo(Long [] ServiceNodeInfo) {
        this.ServiceNodeInfo = ServiceNodeInfo;
    }

    /**
     * Get <p>分散置放群组ID列表，当前仅支持指定一个。</p> 
     * @return DisasterRecoverGroupIds <p>分散置放群组ID列表，当前仅支持指定一个。</p>
     */
    public String [] getDisasterRecoverGroupIds() {
        return this.DisasterRecoverGroupIds;
    }

    /**
     * Set <p>分散置放群组ID列表，当前仅支持指定一个。</p>
     * @param DisasterRecoverGroupIds <p>分散置放群组ID列表，当前仅支持指定一个。</p>
     */
    public void setDisasterRecoverGroupIds(String [] DisasterRecoverGroupIds) {
        this.DisasterRecoverGroupIds = DisasterRecoverGroupIds;
    }

    /**
     * Get <p>扩容节点绑定标签列表。</p> 
     * @return Tags <p>扩容节点绑定标签列表。</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>扩容节点绑定标签列表。</p>
     * @param Tags <p>扩容节点绑定标签列表。</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>扩容所选资源类型，可选范围为&quot;HOST&quot;,&quot;POD&quot;,&quot;MNode&quot;，HOST为普通的CVM资源，POD为TKE集群或EKS集群提供的资源,MNode为全托管资源类型</p> 
     * @return HardwareResourceType <p>扩容所选资源类型，可选范围为&quot;HOST&quot;,&quot;POD&quot;,&quot;MNode&quot;，HOST为普通的CVM资源，POD为TKE集群或EKS集群提供的资源,MNode为全托管资源类型</p>
     */
    public String getHardwareResourceType() {
        return this.HardwareResourceType;
    }

    /**
     * Set <p>扩容所选资源类型，可选范围为&quot;HOST&quot;,&quot;POD&quot;,&quot;MNode&quot;，HOST为普通的CVM资源，POD为TKE集群或EKS集群提供的资源,MNode为全托管资源类型</p>
     * @param HardwareResourceType <p>扩容所选资源类型，可选范围为&quot;HOST&quot;,&quot;POD&quot;,&quot;MNode&quot;，HOST为普通的CVM资源，POD为TKE集群或EKS集群提供的资源,MNode为全托管资源类型</p>
     */
    public void setHardwareResourceType(String HardwareResourceType) {
        this.HardwareResourceType = HardwareResourceType;
    }

    /**
     * Get <p>使用Pod资源扩容时，指定的Pod规格以及来源等信息</p> 
     * @return PodSpec <p>使用Pod资源扩容时，指定的Pod规格以及来源等信息</p>
     */
    public PodSpec getPodSpec() {
        return this.PodSpec;
    }

    /**
     * Set <p>使用Pod资源扩容时，指定的Pod规格以及来源等信息</p>
     * @param PodSpec <p>使用Pod资源扩容时，指定的Pod规格以及来源等信息</p>
     */
    public void setPodSpec(PodSpec PodSpec) {
        this.PodSpec = PodSpec;
    }

    /**
     * Get <p>使用clickhouse集群扩容时，选择的机器分组名称</p> 
     * @return ClickHouseClusterName <p>使用clickhouse集群扩容时，选择的机器分组名称</p>
     */
    public String getClickHouseClusterName() {
        return this.ClickHouseClusterName;
    }

    /**
     * Set <p>使用clickhouse集群扩容时，选择的机器分组名称</p>
     * @param ClickHouseClusterName <p>使用clickhouse集群扩容时，选择的机器分组名称</p>
     */
    public void setClickHouseClusterName(String ClickHouseClusterName) {
        this.ClickHouseClusterName = ClickHouseClusterName;
    }

    /**
     * Get <p>使用clickhouse集群扩容时，选择的机器分组类型。new为新增，old为选择旧分组</p> 
     * @return ClickHouseClusterType <p>使用clickhouse集群扩容时，选择的机器分组类型。new为新增，old为选择旧分组</p>
     */
    public String getClickHouseClusterType() {
        return this.ClickHouseClusterType;
    }

    /**
     * Set <p>使用clickhouse集群扩容时，选择的机器分组类型。new为新增，old为选择旧分组</p>
     * @param ClickHouseClusterType <p>使用clickhouse集群扩容时，选择的机器分组类型。new为新增，old为选择旧分组</p>
     */
    public void setClickHouseClusterType(String ClickHouseClusterType) {
        this.ClickHouseClusterType = ClickHouseClusterType;
    }

    /**
     * Get <p>规则扩容指定 yarn node label</p> 
     * @return YarnNodeLabel <p>规则扩容指定 yarn node label</p>
     */
    public String getYarnNodeLabel() {
        return this.YarnNodeLabel;
    }

    /**
     * Set <p>规则扩容指定 yarn node label</p>
     * @param YarnNodeLabel <p>规则扩容指定 yarn node label</p>
     */
    public void setYarnNodeLabel(String YarnNodeLabel) {
        this.YarnNodeLabel = YarnNodeLabel;
    }

    /**
     * Get <p>POD自定义权限和自定义参数</p> 
     * @return PodParameter <p>POD自定义权限和自定义参数</p>
     */
    public PodParameter getPodParameter() {
        return this.PodParameter;
    }

    /**
     * Set <p>POD自定义权限和自定义参数</p>
     * @param PodParameter <p>POD自定义权限和自定义参数</p>
     */
    public void setPodParameter(PodParameter PodParameter) {
        this.PodParameter = PodParameter;
    }

    /**
     * Get <p>扩容的Master节点的数量。<br>使用clickhouse集群扩容时，该参数不生效。<br>使用kafka集群扩容时，该参数不生效。<br>当HardwareResourceType=POD时，该参数不生效。</p> 
     * @return MasterCount <p>扩容的Master节点的数量。<br>使用clickhouse集群扩容时，该参数不生效。<br>使用kafka集群扩容时，该参数不生效。<br>当HardwareResourceType=POD时，该参数不生效。</p>
     */
    public Long getMasterCount() {
        return this.MasterCount;
    }

    /**
     * Set <p>扩容的Master节点的数量。<br>使用clickhouse集群扩容时，该参数不生效。<br>使用kafka集群扩容时，该参数不生效。<br>当HardwareResourceType=POD时，该参数不生效。</p>
     * @param MasterCount <p>扩容的Master节点的数量。<br>使用clickhouse集群扩容时，该参数不生效。<br>使用kafka集群扩容时，该参数不生效。<br>当HardwareResourceType=POD时，该参数不生效。</p>
     */
    public void setMasterCount(Long MasterCount) {
        this.MasterCount = MasterCount;
    }

    /**
     * Get <p>扩容后是否启动服务，true：启动，false：不启动</p> 
     * @return StartServiceAfterScaleOut <p>扩容后是否启动服务，true：启动，false：不启动</p>
     */
    public String getStartServiceAfterScaleOut() {
        return this.StartServiceAfterScaleOut;
    }

    /**
     * Set <p>扩容后是否启动服务，true：启动，false：不启动</p>
     * @param StartServiceAfterScaleOut <p>扩容后是否启动服务，true：启动，false：不启动</p>
     */
    public void setStartServiceAfterScaleOut(String StartServiceAfterScaleOut) {
        this.StartServiceAfterScaleOut = StartServiceAfterScaleOut;
    }

    /**
     * Get <p>可用区，默认是集群的主可用区</p> 
     * @return ZoneId <p>可用区，默认是集群的主可用区</p>
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>可用区，默认是集群的主可用区</p>
     * @param ZoneId <p>可用区，默认是集群的主可用区</p>
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>子网，默认是集群创建时的子网</p> 
     * @return SubnetId <p>子网，默认是集群创建时的子网</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>子网，默认是集群创建时的子网</p>
     * @param SubnetId <p>子网，默认是集群创建时的子网</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>预设配置组</p> 
     * @return ScaleOutServiceConfAssign <p>预设配置组</p>
     */
    public String getScaleOutServiceConfAssign() {
        return this.ScaleOutServiceConfAssign;
    }

    /**
     * Set <p>预设配置组</p>
     * @param ScaleOutServiceConfAssign <p>预设配置组</p>
     */
    public void setScaleOutServiceConfAssign(String ScaleOutServiceConfAssign) {
        this.ScaleOutServiceConfAssign = ScaleOutServiceConfAssign;
    }

    /**
     * Get <p>0表示关闭自动续费，1表示开启自动续费</p> 
     * @return AutoRenew <p>0表示关闭自动续费，1表示开启自动续费</p>
     */
    public Long getAutoRenew() {
        return this.AutoRenew;
    }

    /**
     * Set <p>0表示关闭自动续费，1表示开启自动续费</p>
     * @param AutoRenew <p>0表示关闭自动续费，1表示开启自动续费</p>
     */
    public void setAutoRenew(Long AutoRenew) {
        this.AutoRenew = AutoRenew;
    }

    /**
     * Get <p>类型为ComputeResource和EMR以及默认，默认为EMR,类型为EMR时,InstanceId生效,类型为ComputeResource时,使用ComputeResourceId标识</p> 
     * @return ResourceBaseType <p>类型为ComputeResource和EMR以及默认，默认为EMR,类型为EMR时,InstanceId生效,类型为ComputeResource时,使用ComputeResourceId标识</p>
     */
    public String getResourceBaseType() {
        return this.ResourceBaseType;
    }

    /**
     * Set <p>类型为ComputeResource和EMR以及默认，默认为EMR,类型为EMR时,InstanceId生效,类型为ComputeResource时,使用ComputeResourceId标识</p>
     * @param ResourceBaseType <p>类型为ComputeResource和EMR以及默认，默认为EMR,类型为EMR时,InstanceId生效,类型为ComputeResource时,使用ComputeResourceId标识</p>
     */
    public void setResourceBaseType(String ResourceBaseType) {
        this.ResourceBaseType = ResourceBaseType;
    }

    /**
     * Get <p>计算资源id</p> 
     * @return ComputeResourceId <p>计算资源id</p>
     */
    public String getComputeResourceId() {
        return this.ComputeResourceId;
    }

    /**
     * Set <p>计算资源id</p>
     * @param ComputeResourceId <p>计算资源id</p>
     */
    public void setComputeResourceId(String ComputeResourceId) {
        this.ComputeResourceId = ComputeResourceId;
    }

    /**
     * Get <p>计算资源高级设置</p> 
     * @return ComputeResourceAdvanceParams <p>计算资源高级设置</p>
     */
    public ComputeResourceAdvanceParams getComputeResourceAdvanceParams() {
        return this.ComputeResourceAdvanceParams;
    }

    /**
     * Set <p>计算资源高级设置</p>
     * @param ComputeResourceAdvanceParams <p>计算资源高级设置</p>
     */
    public void setComputeResourceAdvanceParams(ComputeResourceAdvanceParams ComputeResourceAdvanceParams) {
        this.ComputeResourceAdvanceParams = ComputeResourceAdvanceParams;
    }

    /**
     * Get <p>节点标记信息，目前只提供tf平台使用</p> 
     * @return NodeMarks <p>节点标记信息，目前只提供tf平台使用</p>
     */
    public NodeMark getNodeMarks() {
        return this.NodeMarks;
    }

    /**
     * Set <p>节点标记信息，目前只提供tf平台使用</p>
     * @param NodeMarks <p>节点标记信息，目前只提供tf平台使用</p>
     */
    public void setNodeMarks(NodeMark NodeMarks) {
        this.NodeMarks = NodeMarks;
    }

    /**
     * Get <p>扩容指定计算组</p> 
     * @return WarehouseName <p>扩容指定计算组</p>
     */
    public String getWarehouseName() {
        return this.WarehouseName;
    }

    /**
     * Set <p>扩容指定计算组</p>
     * @param WarehouseName <p>扩容指定计算组</p>
     */
    public void setWarehouseName(String WarehouseName) {
        this.WarehouseName = WarehouseName;
    }

    /**
     * Get <p>分区置放群组分区</p> 
     * @return PartitionNumber <p>分区置放群组分区</p>
     */
    public Long getPartitionNumber() {
        return this.PartitionNumber;
    }

    /**
     * Set <p>分区置放群组分区</p>
     * @param PartitionNumber <p>分区置放群组分区</p>
     */
    public void setPartitionNumber(Long PartitionNumber) {
        this.PartitionNumber = PartitionNumber;
    }

    public ScaleOutInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScaleOutInstanceRequest(ScaleOutInstanceRequest source) {
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
        if (source.PreExecutedFileSettings != null) {
            this.PreExecutedFileSettings = new PreExecuteFileSettings[source.PreExecutedFileSettings.length];
            for (int i = 0; i < source.PreExecutedFileSettings.length; i++) {
                this.PreExecutedFileSettings[i] = new PreExecuteFileSettings(source.PreExecutedFileSettings[i]);
            }
        }
        if (source.TaskCount != null) {
            this.TaskCount = new Long(source.TaskCount);
        }
        if (source.CoreCount != null) {
            this.CoreCount = new Long(source.CoreCount);
        }
        if (source.UnNecessaryNodeList != null) {
            this.UnNecessaryNodeList = new Long[source.UnNecessaryNodeList.length];
            for (int i = 0; i < source.UnNecessaryNodeList.length; i++) {
                this.UnNecessaryNodeList[i] = new Long(source.UnNecessaryNodeList[i]);
            }
        }
        if (source.RouterCount != null) {
            this.RouterCount = new Long(source.RouterCount);
        }
        if (source.SoftDeployInfo != null) {
            this.SoftDeployInfo = new Long[source.SoftDeployInfo.length];
            for (int i = 0; i < source.SoftDeployInfo.length; i++) {
                this.SoftDeployInfo[i] = new Long(source.SoftDeployInfo[i]);
            }
        }
        if (source.ServiceNodeInfo != null) {
            this.ServiceNodeInfo = new Long[source.ServiceNodeInfo.length];
            for (int i = 0; i < source.ServiceNodeInfo.length; i++) {
                this.ServiceNodeInfo[i] = new Long(source.ServiceNodeInfo[i]);
            }
        }
        if (source.DisasterRecoverGroupIds != null) {
            this.DisasterRecoverGroupIds = new String[source.DisasterRecoverGroupIds.length];
            for (int i = 0; i < source.DisasterRecoverGroupIds.length; i++) {
                this.DisasterRecoverGroupIds[i] = new String(source.DisasterRecoverGroupIds[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.HardwareResourceType != null) {
            this.HardwareResourceType = new String(source.HardwareResourceType);
        }
        if (source.PodSpec != null) {
            this.PodSpec = new PodSpec(source.PodSpec);
        }
        if (source.ClickHouseClusterName != null) {
            this.ClickHouseClusterName = new String(source.ClickHouseClusterName);
        }
        if (source.ClickHouseClusterType != null) {
            this.ClickHouseClusterType = new String(source.ClickHouseClusterType);
        }
        if (source.YarnNodeLabel != null) {
            this.YarnNodeLabel = new String(source.YarnNodeLabel);
        }
        if (source.PodParameter != null) {
            this.PodParameter = new PodParameter(source.PodParameter);
        }
        if (source.MasterCount != null) {
            this.MasterCount = new Long(source.MasterCount);
        }
        if (source.StartServiceAfterScaleOut != null) {
            this.StartServiceAfterScaleOut = new String(source.StartServiceAfterScaleOut);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.ScaleOutServiceConfAssign != null) {
            this.ScaleOutServiceConfAssign = new String(source.ScaleOutServiceConfAssign);
        }
        if (source.AutoRenew != null) {
            this.AutoRenew = new Long(source.AutoRenew);
        }
        if (source.ResourceBaseType != null) {
            this.ResourceBaseType = new String(source.ResourceBaseType);
        }
        if (source.ComputeResourceId != null) {
            this.ComputeResourceId = new String(source.ComputeResourceId);
        }
        if (source.ComputeResourceAdvanceParams != null) {
            this.ComputeResourceAdvanceParams = new ComputeResourceAdvanceParams(source.ComputeResourceAdvanceParams);
        }
        if (source.NodeMarks != null) {
            this.NodeMarks = new NodeMark(source.NodeMarks);
        }
        if (source.WarehouseName != null) {
            this.WarehouseName = new String(source.WarehouseName);
        }
        if (source.PartitionNumber != null) {
            this.PartitionNumber = new Long(source.PartitionNumber);
        }
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
        this.setParamSimple(map, prefix + "HardwareResourceType", this.HardwareResourceType);
        this.setParamObj(map, prefix + "PodSpec.", this.PodSpec);
        this.setParamSimple(map, prefix + "ClickHouseClusterName", this.ClickHouseClusterName);
        this.setParamSimple(map, prefix + "ClickHouseClusterType", this.ClickHouseClusterType);
        this.setParamSimple(map, prefix + "YarnNodeLabel", this.YarnNodeLabel);
        this.setParamObj(map, prefix + "PodParameter.", this.PodParameter);
        this.setParamSimple(map, prefix + "MasterCount", this.MasterCount);
        this.setParamSimple(map, prefix + "StartServiceAfterScaleOut", this.StartServiceAfterScaleOut);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "ScaleOutServiceConfAssign", this.ScaleOutServiceConfAssign);
        this.setParamSimple(map, prefix + "AutoRenew", this.AutoRenew);
        this.setParamSimple(map, prefix + "ResourceBaseType", this.ResourceBaseType);
        this.setParamSimple(map, prefix + "ComputeResourceId", this.ComputeResourceId);
        this.setParamObj(map, prefix + "ComputeResourceAdvanceParams.", this.ComputeResourceAdvanceParams);
        this.setParamObj(map, prefix + "NodeMarks.", this.NodeMarks);
        this.setParamSimple(map, prefix + "WarehouseName", this.WarehouseName);
        this.setParamSimple(map, prefix + "PartitionNumber", this.PartitionNumber);

    }
}

