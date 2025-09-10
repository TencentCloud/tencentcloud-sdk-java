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

public class TimeAutoScaleStrategy extends AbstractModel {

    /**
    * 策略名字，集群内唯一。
    */
    @SerializedName("StrategyName")
    @Expose
    private String StrategyName;

    /**
    * 策略触发后的冷却时间，该段时间内，将不能触发弹性扩缩容。
    */
    @SerializedName("IntervalTime")
    @Expose
    private Long IntervalTime;

    /**
    * 扩缩容动作，1表示扩容，2表示缩容。
    */
    @SerializedName("ScaleAction")
    @Expose
    private Long ScaleAction;

    /**
    * 扩缩容数量。
    */
    @SerializedName("ScaleNum")
    @Expose
    private Long ScaleNum;

    /**
    * 规则状态，1表示有效，2表示无效，3表示暂停。必须填写
    */
    @SerializedName("StrategyStatus")
    @Expose
    private Long StrategyStatus;

    /**
    * 规则优先级，越小越高。
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * 当多条规则同时触发，其中某些未真正执行时，在该时间范围内，将会重试。
    */
    @SerializedName("RetryValidTime")
    @Expose
    private Long RetryValidTime;

    /**
    * 时间扩缩容重复策略
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RepeatStrategy")
    @Expose
    private RepeatStrategy RepeatStrategy;

    /**
    * 策略唯一ID。
    */
    @SerializedName("StrategyId")
    @Expose
    private Long StrategyId;

    /**
    * 优雅缩容开关
    */
    @SerializedName("GraceDownFlag")
    @Expose
    private Boolean GraceDownFlag;

    /**
    * 优雅缩容等待时间
    */
    @SerializedName("GraceDownTime")
    @Expose
    private Long GraceDownTime;

    /**
    * 是否开启任务保护
    */
    @SerializedName("GraceDownProtectFlag")
    @Expose
    private Boolean GraceDownProtectFlag;

    /**
    * 绑定标签列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 预设配置组
    */
    @SerializedName("ConfigGroupAssigned")
    @Expose
    private String ConfigGroupAssigned;

    /**
    * 扩容资源计算方法，"DEFAULT","INSTANCE", "CPU", "MEMORYGB"。
"DEFAULT"表示默认方式，与"INSTANCE"意义相同。
"INSTANCE"表示按照节点计算，默认方式。
"CPU"表示按照机器的核数计算。
"MEMORYGB"表示按照机器内存数计算。
    */
    @SerializedName("MeasureMethod")
    @Expose
    private String MeasureMethod;

    /**
    * 销毁策略, "DEFAULT",默认销毁策略，由缩容规则触发缩容，"TIMING"表示定时销毁
    */
    @SerializedName("TerminatePolicy")
    @Expose
    private String TerminatePolicy;

    /**
    * 最长使用时间， 秒数，最短1小时，最长24小时
    */
    @SerializedName("MaxUse")
    @Expose
    private Long MaxUse;

    /**
    * 节点部署服务列表。部署服务仅填写HDFS、YARN。[组件名对应的映射关系表](https://cloud.tencent.com/document/product/589/98760)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SoftDeployInfo")
    @Expose
    private Long [] SoftDeployInfo;

    /**
    * 启动进程列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceNodeInfo")
    @Expose
    private Long [] ServiceNodeInfo;

    /**
    * 补偿扩容，0表示不开启，1表示开启
    */
    @SerializedName("CompensateFlag")
    @Expose
    private Long CompensateFlag;

    /**
    * 伸缩组id
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * 优雅缩容业务pod标签，当node不存在上述pod或超过优雅缩容时间时，缩容节点
    */
    @SerializedName("GraceDownLabel")
    @Expose
    private TkeLabel [] GraceDownLabel;

    /**
     * Get 策略名字，集群内唯一。 
     * @return StrategyName 策略名字，集群内唯一。
     */
    public String getStrategyName() {
        return this.StrategyName;
    }

    /**
     * Set 策略名字，集群内唯一。
     * @param StrategyName 策略名字，集群内唯一。
     */
    public void setStrategyName(String StrategyName) {
        this.StrategyName = StrategyName;
    }

    /**
     * Get 策略触发后的冷却时间，该段时间内，将不能触发弹性扩缩容。 
     * @return IntervalTime 策略触发后的冷却时间，该段时间内，将不能触发弹性扩缩容。
     */
    public Long getIntervalTime() {
        return this.IntervalTime;
    }

    /**
     * Set 策略触发后的冷却时间，该段时间内，将不能触发弹性扩缩容。
     * @param IntervalTime 策略触发后的冷却时间，该段时间内，将不能触发弹性扩缩容。
     */
    public void setIntervalTime(Long IntervalTime) {
        this.IntervalTime = IntervalTime;
    }

    /**
     * Get 扩缩容动作，1表示扩容，2表示缩容。 
     * @return ScaleAction 扩缩容动作，1表示扩容，2表示缩容。
     */
    public Long getScaleAction() {
        return this.ScaleAction;
    }

    /**
     * Set 扩缩容动作，1表示扩容，2表示缩容。
     * @param ScaleAction 扩缩容动作，1表示扩容，2表示缩容。
     */
    public void setScaleAction(Long ScaleAction) {
        this.ScaleAction = ScaleAction;
    }

    /**
     * Get 扩缩容数量。 
     * @return ScaleNum 扩缩容数量。
     */
    public Long getScaleNum() {
        return this.ScaleNum;
    }

    /**
     * Set 扩缩容数量。
     * @param ScaleNum 扩缩容数量。
     */
    public void setScaleNum(Long ScaleNum) {
        this.ScaleNum = ScaleNum;
    }

    /**
     * Get 规则状态，1表示有效，2表示无效，3表示暂停。必须填写 
     * @return StrategyStatus 规则状态，1表示有效，2表示无效，3表示暂停。必须填写
     */
    public Long getStrategyStatus() {
        return this.StrategyStatus;
    }

    /**
     * Set 规则状态，1表示有效，2表示无效，3表示暂停。必须填写
     * @param StrategyStatus 规则状态，1表示有效，2表示无效，3表示暂停。必须填写
     */
    public void setStrategyStatus(Long StrategyStatus) {
        this.StrategyStatus = StrategyStatus;
    }

    /**
     * Get 规则优先级，越小越高。 
     * @return Priority 规则优先级，越小越高。
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set 规则优先级，越小越高。
     * @param Priority 规则优先级，越小越高。
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get 当多条规则同时触发，其中某些未真正执行时，在该时间范围内，将会重试。 
     * @return RetryValidTime 当多条规则同时触发，其中某些未真正执行时，在该时间范围内，将会重试。
     */
    public Long getRetryValidTime() {
        return this.RetryValidTime;
    }

    /**
     * Set 当多条规则同时触发，其中某些未真正执行时，在该时间范围内，将会重试。
     * @param RetryValidTime 当多条规则同时触发，其中某些未真正执行时，在该时间范围内，将会重试。
     */
    public void setRetryValidTime(Long RetryValidTime) {
        this.RetryValidTime = RetryValidTime;
    }

    /**
     * Get 时间扩缩容重复策略
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RepeatStrategy 时间扩缩容重复策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RepeatStrategy getRepeatStrategy() {
        return this.RepeatStrategy;
    }

    /**
     * Set 时间扩缩容重复策略
注意：此字段可能返回 null，表示取不到有效值。
     * @param RepeatStrategy 时间扩缩容重复策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRepeatStrategy(RepeatStrategy RepeatStrategy) {
        this.RepeatStrategy = RepeatStrategy;
    }

    /**
     * Get 策略唯一ID。 
     * @return StrategyId 策略唯一ID。
     */
    public Long getStrategyId() {
        return this.StrategyId;
    }

    /**
     * Set 策略唯一ID。
     * @param StrategyId 策略唯一ID。
     */
    public void setStrategyId(Long StrategyId) {
        this.StrategyId = StrategyId;
    }

    /**
     * Get 优雅缩容开关 
     * @return GraceDownFlag 优雅缩容开关
     */
    public Boolean getGraceDownFlag() {
        return this.GraceDownFlag;
    }

    /**
     * Set 优雅缩容开关
     * @param GraceDownFlag 优雅缩容开关
     */
    public void setGraceDownFlag(Boolean GraceDownFlag) {
        this.GraceDownFlag = GraceDownFlag;
    }

    /**
     * Get 优雅缩容等待时间 
     * @return GraceDownTime 优雅缩容等待时间
     */
    public Long getGraceDownTime() {
        return this.GraceDownTime;
    }

    /**
     * Set 优雅缩容等待时间
     * @param GraceDownTime 优雅缩容等待时间
     */
    public void setGraceDownTime(Long GraceDownTime) {
        this.GraceDownTime = GraceDownTime;
    }

    /**
     * Get 是否开启任务保护 
     * @return GraceDownProtectFlag 是否开启任务保护
     */
    public Boolean getGraceDownProtectFlag() {
        return this.GraceDownProtectFlag;
    }

    /**
     * Set 是否开启任务保护
     * @param GraceDownProtectFlag 是否开启任务保护
     */
    public void setGraceDownProtectFlag(Boolean GraceDownProtectFlag) {
        this.GraceDownProtectFlag = GraceDownProtectFlag;
    }

    /**
     * Get 绑定标签列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 绑定标签列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 绑定标签列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 绑定标签列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 预设配置组 
     * @return ConfigGroupAssigned 预设配置组
     */
    public String getConfigGroupAssigned() {
        return this.ConfigGroupAssigned;
    }

    /**
     * Set 预设配置组
     * @param ConfigGroupAssigned 预设配置组
     */
    public void setConfigGroupAssigned(String ConfigGroupAssigned) {
        this.ConfigGroupAssigned = ConfigGroupAssigned;
    }

    /**
     * Get 扩容资源计算方法，"DEFAULT","INSTANCE", "CPU", "MEMORYGB"。
"DEFAULT"表示默认方式，与"INSTANCE"意义相同。
"INSTANCE"表示按照节点计算，默认方式。
"CPU"表示按照机器的核数计算。
"MEMORYGB"表示按照机器内存数计算。 
     * @return MeasureMethod 扩容资源计算方法，"DEFAULT","INSTANCE", "CPU", "MEMORYGB"。
"DEFAULT"表示默认方式，与"INSTANCE"意义相同。
"INSTANCE"表示按照节点计算，默认方式。
"CPU"表示按照机器的核数计算。
"MEMORYGB"表示按照机器内存数计算。
     */
    public String getMeasureMethod() {
        return this.MeasureMethod;
    }

    /**
     * Set 扩容资源计算方法，"DEFAULT","INSTANCE", "CPU", "MEMORYGB"。
"DEFAULT"表示默认方式，与"INSTANCE"意义相同。
"INSTANCE"表示按照节点计算，默认方式。
"CPU"表示按照机器的核数计算。
"MEMORYGB"表示按照机器内存数计算。
     * @param MeasureMethod 扩容资源计算方法，"DEFAULT","INSTANCE", "CPU", "MEMORYGB"。
"DEFAULT"表示默认方式，与"INSTANCE"意义相同。
"INSTANCE"表示按照节点计算，默认方式。
"CPU"表示按照机器的核数计算。
"MEMORYGB"表示按照机器内存数计算。
     */
    public void setMeasureMethod(String MeasureMethod) {
        this.MeasureMethod = MeasureMethod;
    }

    /**
     * Get 销毁策略, "DEFAULT",默认销毁策略，由缩容规则触发缩容，"TIMING"表示定时销毁 
     * @return TerminatePolicy 销毁策略, "DEFAULT",默认销毁策略，由缩容规则触发缩容，"TIMING"表示定时销毁
     */
    public String getTerminatePolicy() {
        return this.TerminatePolicy;
    }

    /**
     * Set 销毁策略, "DEFAULT",默认销毁策略，由缩容规则触发缩容，"TIMING"表示定时销毁
     * @param TerminatePolicy 销毁策略, "DEFAULT",默认销毁策略，由缩容规则触发缩容，"TIMING"表示定时销毁
     */
    public void setTerminatePolicy(String TerminatePolicy) {
        this.TerminatePolicy = TerminatePolicy;
    }

    /**
     * Get 最长使用时间， 秒数，最短1小时，最长24小时 
     * @return MaxUse 最长使用时间， 秒数，最短1小时，最长24小时
     */
    public Long getMaxUse() {
        return this.MaxUse;
    }

    /**
     * Set 最长使用时间， 秒数，最短1小时，最长24小时
     * @param MaxUse 最长使用时间， 秒数，最短1小时，最长24小时
     */
    public void setMaxUse(Long MaxUse) {
        this.MaxUse = MaxUse;
    }

    /**
     * Get 节点部署服务列表。部署服务仅填写HDFS、YARN。[组件名对应的映射关系表](https://cloud.tencent.com/document/product/589/98760)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SoftDeployInfo 节点部署服务列表。部署服务仅填写HDFS、YARN。[组件名对应的映射关系表](https://cloud.tencent.com/document/product/589/98760)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getSoftDeployInfo() {
        return this.SoftDeployInfo;
    }

    /**
     * Set 节点部署服务列表。部署服务仅填写HDFS、YARN。[组件名对应的映射关系表](https://cloud.tencent.com/document/product/589/98760)
注意：此字段可能返回 null，表示取不到有效值。
     * @param SoftDeployInfo 节点部署服务列表。部署服务仅填写HDFS、YARN。[组件名对应的映射关系表](https://cloud.tencent.com/document/product/589/98760)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSoftDeployInfo(Long [] SoftDeployInfo) {
        this.SoftDeployInfo = SoftDeployInfo;
    }

    /**
     * Get 启动进程列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceNodeInfo 启动进程列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getServiceNodeInfo() {
        return this.ServiceNodeInfo;
    }

    /**
     * Set 启动进程列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceNodeInfo 启动进程列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceNodeInfo(Long [] ServiceNodeInfo) {
        this.ServiceNodeInfo = ServiceNodeInfo;
    }

    /**
     * Get 补偿扩容，0表示不开启，1表示开启 
     * @return CompensateFlag 补偿扩容，0表示不开启，1表示开启
     */
    public Long getCompensateFlag() {
        return this.CompensateFlag;
    }

    /**
     * Set 补偿扩容，0表示不开启，1表示开启
     * @param CompensateFlag 补偿扩容，0表示不开启，1表示开启
     */
    public void setCompensateFlag(Long CompensateFlag) {
        this.CompensateFlag = CompensateFlag;
    }

    /**
     * Get 伸缩组id 
     * @return GroupId 伸缩组id
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 伸缩组id
     * @param GroupId 伸缩组id
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 优雅缩容业务pod标签，当node不存在上述pod或超过优雅缩容时间时，缩容节点 
     * @return GraceDownLabel 优雅缩容业务pod标签，当node不存在上述pod或超过优雅缩容时间时，缩容节点
     */
    public TkeLabel [] getGraceDownLabel() {
        return this.GraceDownLabel;
    }

    /**
     * Set 优雅缩容业务pod标签，当node不存在上述pod或超过优雅缩容时间时，缩容节点
     * @param GraceDownLabel 优雅缩容业务pod标签，当node不存在上述pod或超过优雅缩容时间时，缩容节点
     */
    public void setGraceDownLabel(TkeLabel [] GraceDownLabel) {
        this.GraceDownLabel = GraceDownLabel;
    }

    public TimeAutoScaleStrategy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TimeAutoScaleStrategy(TimeAutoScaleStrategy source) {
        if (source.StrategyName != null) {
            this.StrategyName = new String(source.StrategyName);
        }
        if (source.IntervalTime != null) {
            this.IntervalTime = new Long(source.IntervalTime);
        }
        if (source.ScaleAction != null) {
            this.ScaleAction = new Long(source.ScaleAction);
        }
        if (source.ScaleNum != null) {
            this.ScaleNum = new Long(source.ScaleNum);
        }
        if (source.StrategyStatus != null) {
            this.StrategyStatus = new Long(source.StrategyStatus);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.RetryValidTime != null) {
            this.RetryValidTime = new Long(source.RetryValidTime);
        }
        if (source.RepeatStrategy != null) {
            this.RepeatStrategy = new RepeatStrategy(source.RepeatStrategy);
        }
        if (source.StrategyId != null) {
            this.StrategyId = new Long(source.StrategyId);
        }
        if (source.GraceDownFlag != null) {
            this.GraceDownFlag = new Boolean(source.GraceDownFlag);
        }
        if (source.GraceDownTime != null) {
            this.GraceDownTime = new Long(source.GraceDownTime);
        }
        if (source.GraceDownProtectFlag != null) {
            this.GraceDownProtectFlag = new Boolean(source.GraceDownProtectFlag);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.ConfigGroupAssigned != null) {
            this.ConfigGroupAssigned = new String(source.ConfigGroupAssigned);
        }
        if (source.MeasureMethod != null) {
            this.MeasureMethod = new String(source.MeasureMethod);
        }
        if (source.TerminatePolicy != null) {
            this.TerminatePolicy = new String(source.TerminatePolicy);
        }
        if (source.MaxUse != null) {
            this.MaxUse = new Long(source.MaxUse);
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
        if (source.CompensateFlag != null) {
            this.CompensateFlag = new Long(source.CompensateFlag);
        }
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.GraceDownLabel != null) {
            this.GraceDownLabel = new TkeLabel[source.GraceDownLabel.length];
            for (int i = 0; i < source.GraceDownLabel.length; i++) {
                this.GraceDownLabel[i] = new TkeLabel(source.GraceDownLabel[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StrategyName", this.StrategyName);
        this.setParamSimple(map, prefix + "IntervalTime", this.IntervalTime);
        this.setParamSimple(map, prefix + "ScaleAction", this.ScaleAction);
        this.setParamSimple(map, prefix + "ScaleNum", this.ScaleNum);
        this.setParamSimple(map, prefix + "StrategyStatus", this.StrategyStatus);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "RetryValidTime", this.RetryValidTime);
        this.setParamObj(map, prefix + "RepeatStrategy.", this.RepeatStrategy);
        this.setParamSimple(map, prefix + "StrategyId", this.StrategyId);
        this.setParamSimple(map, prefix + "GraceDownFlag", this.GraceDownFlag);
        this.setParamSimple(map, prefix + "GraceDownTime", this.GraceDownTime);
        this.setParamSimple(map, prefix + "GraceDownProtectFlag", this.GraceDownProtectFlag);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "ConfigGroupAssigned", this.ConfigGroupAssigned);
        this.setParamSimple(map, prefix + "MeasureMethod", this.MeasureMethod);
        this.setParamSimple(map, prefix + "TerminatePolicy", this.TerminatePolicy);
        this.setParamSimple(map, prefix + "MaxUse", this.MaxUse);
        this.setParamArraySimple(map, prefix + "SoftDeployInfo.", this.SoftDeployInfo);
        this.setParamArraySimple(map, prefix + "ServiceNodeInfo.", this.ServiceNodeInfo);
        this.setParamSimple(map, prefix + "CompensateFlag", this.CompensateFlag);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamArrayObj(map, prefix + "GraceDownLabel.", this.GraceDownLabel);

    }
}

