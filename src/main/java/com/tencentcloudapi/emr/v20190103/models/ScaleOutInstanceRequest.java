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
    * 扩容所选资源类型，可选范围为"host","pod"，host为普通的CVM资源，Pod为TKE集群或EKS集群提供的资源
    */
    @SerializedName("HardwareResourceType")
    @Expose
    private String HardwareResourceType;

    /**
    * 使用Pod资源扩容时，指定的Pod规格以及来源等信息
    */
    @SerializedName("PodSpec")
    @Expose
    private PodSpec PodSpec;

    /**
    * 使用clickhouse集群扩容时，选择的机器分组名称
    */
    @SerializedName("ClickHouseClusterName")
    @Expose
    private String ClickHouseClusterName;

    /**
    * 使用clickhouse集群扩容时，选择的机器分组类型。new为新增，old为选择旧分组
    */
    @SerializedName("ClickHouseClusterType")
    @Expose
    private String ClickHouseClusterType;

    /**
    * 规则扩容指定 yarn node label
    */
    @SerializedName("YarnNodeLabel")
    @Expose
    private String YarnNodeLabel;

    /**
    * POD自定义权限和自定义参数
    */
    @SerializedName("PodParameter")
    @Expose
    private PodParameter PodParameter;

    /**
    * 扩容的Master节点的数量。
使用clickhouse集群扩容时，该参数不生效。
使用kafka集群扩容时，该参数不生效。
当HardwareResourceType=POD时，该参数不生效。
    */
    @SerializedName("MasterCount")
    @Expose
    private Long MasterCount;

    /**
    * 扩容后是否启动服务，true：启动，false：不启动
    */
    @SerializedName("StartServiceAfterScaleOut")
    @Expose
    private String StartServiceAfterScaleOut;

    /**
    * 可用区，默认是集群的主可用区
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * 子网，默认是集群创建时的子网
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

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
     * Get 扩容所选资源类型，可选范围为"host","pod"，host为普通的CVM资源，Pod为TKE集群或EKS集群提供的资源 
     * @return HardwareResourceType 扩容所选资源类型，可选范围为"host","pod"，host为普通的CVM资源，Pod为TKE集群或EKS集群提供的资源
     */
    public String getHardwareResourceType() {
        return this.HardwareResourceType;
    }

    /**
     * Set 扩容所选资源类型，可选范围为"host","pod"，host为普通的CVM资源，Pod为TKE集群或EKS集群提供的资源
     * @param HardwareResourceType 扩容所选资源类型，可选范围为"host","pod"，host为普通的CVM资源，Pod为TKE集群或EKS集群提供的资源
     */
    public void setHardwareResourceType(String HardwareResourceType) {
        this.HardwareResourceType = HardwareResourceType;
    }

    /**
     * Get 使用Pod资源扩容时，指定的Pod规格以及来源等信息 
     * @return PodSpec 使用Pod资源扩容时，指定的Pod规格以及来源等信息
     */
    public PodSpec getPodSpec() {
        return this.PodSpec;
    }

    /**
     * Set 使用Pod资源扩容时，指定的Pod规格以及来源等信息
     * @param PodSpec 使用Pod资源扩容时，指定的Pod规格以及来源等信息
     */
    public void setPodSpec(PodSpec PodSpec) {
        this.PodSpec = PodSpec;
    }

    /**
     * Get 使用clickhouse集群扩容时，选择的机器分组名称 
     * @return ClickHouseClusterName 使用clickhouse集群扩容时，选择的机器分组名称
     */
    public String getClickHouseClusterName() {
        return this.ClickHouseClusterName;
    }

    /**
     * Set 使用clickhouse集群扩容时，选择的机器分组名称
     * @param ClickHouseClusterName 使用clickhouse集群扩容时，选择的机器分组名称
     */
    public void setClickHouseClusterName(String ClickHouseClusterName) {
        this.ClickHouseClusterName = ClickHouseClusterName;
    }

    /**
     * Get 使用clickhouse集群扩容时，选择的机器分组类型。new为新增，old为选择旧分组 
     * @return ClickHouseClusterType 使用clickhouse集群扩容时，选择的机器分组类型。new为新增，old为选择旧分组
     */
    public String getClickHouseClusterType() {
        return this.ClickHouseClusterType;
    }

    /**
     * Set 使用clickhouse集群扩容时，选择的机器分组类型。new为新增，old为选择旧分组
     * @param ClickHouseClusterType 使用clickhouse集群扩容时，选择的机器分组类型。new为新增，old为选择旧分组
     */
    public void setClickHouseClusterType(String ClickHouseClusterType) {
        this.ClickHouseClusterType = ClickHouseClusterType;
    }

    /**
     * Get 规则扩容指定 yarn node label 
     * @return YarnNodeLabel 规则扩容指定 yarn node label
     */
    public String getYarnNodeLabel() {
        return this.YarnNodeLabel;
    }

    /**
     * Set 规则扩容指定 yarn node label
     * @param YarnNodeLabel 规则扩容指定 yarn node label
     */
    public void setYarnNodeLabel(String YarnNodeLabel) {
        this.YarnNodeLabel = YarnNodeLabel;
    }

    /**
     * Get POD自定义权限和自定义参数 
     * @return PodParameter POD自定义权限和自定义参数
     */
    public PodParameter getPodParameter() {
        return this.PodParameter;
    }

    /**
     * Set POD自定义权限和自定义参数
     * @param PodParameter POD自定义权限和自定义参数
     */
    public void setPodParameter(PodParameter PodParameter) {
        this.PodParameter = PodParameter;
    }

    /**
     * Get 扩容的Master节点的数量。
使用clickhouse集群扩容时，该参数不生效。
使用kafka集群扩容时，该参数不生效。
当HardwareResourceType=POD时，该参数不生效。 
     * @return MasterCount 扩容的Master节点的数量。
使用clickhouse集群扩容时，该参数不生效。
使用kafka集群扩容时，该参数不生效。
当HardwareResourceType=POD时，该参数不生效。
     */
    public Long getMasterCount() {
        return this.MasterCount;
    }

    /**
     * Set 扩容的Master节点的数量。
使用clickhouse集群扩容时，该参数不生效。
使用kafka集群扩容时，该参数不生效。
当HardwareResourceType=POD时，该参数不生效。
     * @param MasterCount 扩容的Master节点的数量。
使用clickhouse集群扩容时，该参数不生效。
使用kafka集群扩容时，该参数不生效。
当HardwareResourceType=POD时，该参数不生效。
     */
    public void setMasterCount(Long MasterCount) {
        this.MasterCount = MasterCount;
    }

    /**
     * Get 扩容后是否启动服务，true：启动，false：不启动 
     * @return StartServiceAfterScaleOut 扩容后是否启动服务，true：启动，false：不启动
     */
    public String getStartServiceAfterScaleOut() {
        return this.StartServiceAfterScaleOut;
    }

    /**
     * Set 扩容后是否启动服务，true：启动，false：不启动
     * @param StartServiceAfterScaleOut 扩容后是否启动服务，true：启动，false：不启动
     */
    public void setStartServiceAfterScaleOut(String StartServiceAfterScaleOut) {
        this.StartServiceAfterScaleOut = StartServiceAfterScaleOut;
    }

    /**
     * Get 可用区，默认是集群的主可用区 
     * @return ZoneId 可用区，默认是集群的主可用区
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 可用区，默认是集群的主可用区
     * @param ZoneId 可用区，默认是集群的主可用区
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 子网，默认是集群创建时的子网 
     * @return SubnetId 子网，默认是集群创建时的子网
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网，默认是集群创建时的子网
     * @param SubnetId 子网，默认是集群创建时的子网
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
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

    }
}

