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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LoadAutoScaleStrategy extends AbstractModel {

    /**
    * 规则ID。
    */
    @SerializedName("StrategyId")
    @Expose
    private Long StrategyId;

    /**
    * 规则名称。
    */
    @SerializedName("StrategyName")
    @Expose
    private String StrategyName;

    /**
    * 规则生效冷却时间。
    */
    @SerializedName("CalmDownTime")
    @Expose
    private Long CalmDownTime;

    /**
    * 扩缩容动作，1表示扩容，2表示缩容。
    */
    @SerializedName("ScaleAction")
    @Expose
    private Long ScaleAction;

    /**
    * 每次规则生效时的扩缩容数量。
    */
    @SerializedName("ScaleNum")
    @Expose
    private Long ScaleNum;

    /**
    * 指标处理方法，1表示MAX，2表示MIN，3表示AVG。
    */
    @SerializedName("ProcessMethod")
    @Expose
    private Long ProcessMethod;

    /**
    * 规则优先级，添加时无效，默认为自增。
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * 规则状态，1表示启动，3表示禁用。
    */
    @SerializedName("StrategyStatus")
    @Expose
    private Long StrategyStatus;

    /**
    * 规则扩容指定 yarn node label
    */
    @SerializedName("YarnNodeLabel")
    @Expose
    private String YarnNodeLabel;

    /**
    * 规则生效的有效时间
    */
    @SerializedName("PeriodValid")
    @Expose
    private String PeriodValid;

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
    * 节点部署服务列表，例如["HDFS-3.1.2","YARN-3.1.2"]。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SoftDeployDesc")
    @Expose
    private String [] SoftDeployDesc;

    /**
    * 启动进程列表，例如["NodeManager"]。
    */
    @SerializedName("ServiceNodeDesc")
    @Expose
    private String ServiceNodeDesc;

    /**
    * 启动进程列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceNodeInfo")
    @Expose
    private Long [] ServiceNodeInfo;

    /**
    * 节点部署服务列表。部署服务仅填写HDFS、YARN。[组件名对应的映射关系表](https://cloud.tencent.com/document/product/589/98760)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SoftDeployInfo")
    @Expose
    private Long [] SoftDeployInfo;

    /**
    * 多指标触发条件
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LoadMetricsConditions")
    @Expose
    private LoadMetricsConditions LoadMetricsConditions;

    /**
    * 伸缩组Id
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * soft例如yarn
    */
    @SerializedName("Soft")
    @Expose
    private String Soft;

    /**
     * Get 规则ID。 
     * @return StrategyId 规则ID。
     */
    public Long getStrategyId() {
        return this.StrategyId;
    }

    /**
     * Set 规则ID。
     * @param StrategyId 规则ID。
     */
    public void setStrategyId(Long StrategyId) {
        this.StrategyId = StrategyId;
    }

    /**
     * Get 规则名称。 
     * @return StrategyName 规则名称。
     */
    public String getStrategyName() {
        return this.StrategyName;
    }

    /**
     * Set 规则名称。
     * @param StrategyName 规则名称。
     */
    public void setStrategyName(String StrategyName) {
        this.StrategyName = StrategyName;
    }

    /**
     * Get 规则生效冷却时间。 
     * @return CalmDownTime 规则生效冷却时间。
     */
    public Long getCalmDownTime() {
        return this.CalmDownTime;
    }

    /**
     * Set 规则生效冷却时间。
     * @param CalmDownTime 规则生效冷却时间。
     */
    public void setCalmDownTime(Long CalmDownTime) {
        this.CalmDownTime = CalmDownTime;
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
     * Get 每次规则生效时的扩缩容数量。 
     * @return ScaleNum 每次规则生效时的扩缩容数量。
     */
    public Long getScaleNum() {
        return this.ScaleNum;
    }

    /**
     * Set 每次规则生效时的扩缩容数量。
     * @param ScaleNum 每次规则生效时的扩缩容数量。
     */
    public void setScaleNum(Long ScaleNum) {
        this.ScaleNum = ScaleNum;
    }

    /**
     * Get 指标处理方法，1表示MAX，2表示MIN，3表示AVG。 
     * @return ProcessMethod 指标处理方法，1表示MAX，2表示MIN，3表示AVG。
     */
    public Long getProcessMethod() {
        return this.ProcessMethod;
    }

    /**
     * Set 指标处理方法，1表示MAX，2表示MIN，3表示AVG。
     * @param ProcessMethod 指标处理方法，1表示MAX，2表示MIN，3表示AVG。
     */
    public void setProcessMethod(Long ProcessMethod) {
        this.ProcessMethod = ProcessMethod;
    }

    /**
     * Get 规则优先级，添加时无效，默认为自增。 
     * @return Priority 规则优先级，添加时无效，默认为自增。
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set 规则优先级，添加时无效，默认为自增。
     * @param Priority 规则优先级，添加时无效，默认为自增。
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get 规则状态，1表示启动，3表示禁用。 
     * @return StrategyStatus 规则状态，1表示启动，3表示禁用。
     */
    public Long getStrategyStatus() {
        return this.StrategyStatus;
    }

    /**
     * Set 规则状态，1表示启动，3表示禁用。
     * @param StrategyStatus 规则状态，1表示启动，3表示禁用。
     */
    public void setStrategyStatus(Long StrategyStatus) {
        this.StrategyStatus = StrategyStatus;
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
     * Get 规则生效的有效时间 
     * @return PeriodValid 规则生效的有效时间
     */
    public String getPeriodValid() {
        return this.PeriodValid;
    }

    /**
     * Set 规则生效的有效时间
     * @param PeriodValid 规则生效的有效时间
     */
    public void setPeriodValid(String PeriodValid) {
        this.PeriodValid = PeriodValid;
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
     * Get 节点部署服务列表，例如["HDFS-3.1.2","YARN-3.1.2"]。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SoftDeployDesc 节点部署服务列表，例如["HDFS-3.1.2","YARN-3.1.2"]。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSoftDeployDesc() {
        return this.SoftDeployDesc;
    }

    /**
     * Set 节点部署服务列表，例如["HDFS-3.1.2","YARN-3.1.2"]。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SoftDeployDesc 节点部署服务列表，例如["HDFS-3.1.2","YARN-3.1.2"]。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSoftDeployDesc(String [] SoftDeployDesc) {
        this.SoftDeployDesc = SoftDeployDesc;
    }

    /**
     * Get 启动进程列表，例如["NodeManager"]。 
     * @return ServiceNodeDesc 启动进程列表，例如["NodeManager"]。
     */
    public String getServiceNodeDesc() {
        return this.ServiceNodeDesc;
    }

    /**
     * Set 启动进程列表，例如["NodeManager"]。
     * @param ServiceNodeDesc 启动进程列表，例如["NodeManager"]。
     */
    public void setServiceNodeDesc(String ServiceNodeDesc) {
        this.ServiceNodeDesc = ServiceNodeDesc;
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
     * Get 多指标触发条件
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LoadMetricsConditions 多指标触发条件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LoadMetricsConditions getLoadMetricsConditions() {
        return this.LoadMetricsConditions;
    }

    /**
     * Set 多指标触发条件
注意：此字段可能返回 null，表示取不到有效值。
     * @param LoadMetricsConditions 多指标触发条件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLoadMetricsConditions(LoadMetricsConditions LoadMetricsConditions) {
        this.LoadMetricsConditions = LoadMetricsConditions;
    }

    /**
     * Get 伸缩组Id 
     * @return GroupId 伸缩组Id
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 伸缩组Id
     * @param GroupId 伸缩组Id
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get soft例如yarn 
     * @return Soft soft例如yarn
     */
    public String getSoft() {
        return this.Soft;
    }

    /**
     * Set soft例如yarn
     * @param Soft soft例如yarn
     */
    public void setSoft(String Soft) {
        this.Soft = Soft;
    }

    public LoadAutoScaleStrategy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LoadAutoScaleStrategy(LoadAutoScaleStrategy source) {
        if (source.StrategyId != null) {
            this.StrategyId = new Long(source.StrategyId);
        }
        if (source.StrategyName != null) {
            this.StrategyName = new String(source.StrategyName);
        }
        if (source.CalmDownTime != null) {
            this.CalmDownTime = new Long(source.CalmDownTime);
        }
        if (source.ScaleAction != null) {
            this.ScaleAction = new Long(source.ScaleAction);
        }
        if (source.ScaleNum != null) {
            this.ScaleNum = new Long(source.ScaleNum);
        }
        if (source.ProcessMethod != null) {
            this.ProcessMethod = new Long(source.ProcessMethod);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.StrategyStatus != null) {
            this.StrategyStatus = new Long(source.StrategyStatus);
        }
        if (source.YarnNodeLabel != null) {
            this.YarnNodeLabel = new String(source.YarnNodeLabel);
        }
        if (source.PeriodValid != null) {
            this.PeriodValid = new String(source.PeriodValid);
        }
        if (source.GraceDownFlag != null) {
            this.GraceDownFlag = new Boolean(source.GraceDownFlag);
        }
        if (source.GraceDownTime != null) {
            this.GraceDownTime = new Long(source.GraceDownTime);
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
        if (source.SoftDeployDesc != null) {
            this.SoftDeployDesc = new String[source.SoftDeployDesc.length];
            for (int i = 0; i < source.SoftDeployDesc.length; i++) {
                this.SoftDeployDesc[i] = new String(source.SoftDeployDesc[i]);
            }
        }
        if (source.ServiceNodeDesc != null) {
            this.ServiceNodeDesc = new String(source.ServiceNodeDesc);
        }
        if (source.ServiceNodeInfo != null) {
            this.ServiceNodeInfo = new Long[source.ServiceNodeInfo.length];
            for (int i = 0; i < source.ServiceNodeInfo.length; i++) {
                this.ServiceNodeInfo[i] = new Long(source.ServiceNodeInfo[i]);
            }
        }
        if (source.SoftDeployInfo != null) {
            this.SoftDeployInfo = new Long[source.SoftDeployInfo.length];
            for (int i = 0; i < source.SoftDeployInfo.length; i++) {
                this.SoftDeployInfo[i] = new Long(source.SoftDeployInfo[i]);
            }
        }
        if (source.LoadMetricsConditions != null) {
            this.LoadMetricsConditions = new LoadMetricsConditions(source.LoadMetricsConditions);
        }
        if (source.GroupId != null) {
            this.GroupId = new Long(source.GroupId);
        }
        if (source.Soft != null) {
            this.Soft = new String(source.Soft);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StrategyId", this.StrategyId);
        this.setParamSimple(map, prefix + "StrategyName", this.StrategyName);
        this.setParamSimple(map, prefix + "CalmDownTime", this.CalmDownTime);
        this.setParamSimple(map, prefix + "ScaleAction", this.ScaleAction);
        this.setParamSimple(map, prefix + "ScaleNum", this.ScaleNum);
        this.setParamSimple(map, prefix + "ProcessMethod", this.ProcessMethod);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "StrategyStatus", this.StrategyStatus);
        this.setParamSimple(map, prefix + "YarnNodeLabel", this.YarnNodeLabel);
        this.setParamSimple(map, prefix + "PeriodValid", this.PeriodValid);
        this.setParamSimple(map, prefix + "GraceDownFlag", this.GraceDownFlag);
        this.setParamSimple(map, prefix + "GraceDownTime", this.GraceDownTime);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "ConfigGroupAssigned", this.ConfigGroupAssigned);
        this.setParamSimple(map, prefix + "MeasureMethod", this.MeasureMethod);
        this.setParamArraySimple(map, prefix + "SoftDeployDesc.", this.SoftDeployDesc);
        this.setParamSimple(map, prefix + "ServiceNodeDesc", this.ServiceNodeDesc);
        this.setParamArraySimple(map, prefix + "ServiceNodeInfo.", this.ServiceNodeInfo);
        this.setParamArraySimple(map, prefix + "SoftDeployInfo.", this.SoftDeployInfo);
        this.setParamObj(map, prefix + "LoadMetricsConditions.", this.LoadMetricsConditions);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "Soft", this.Soft);

    }
}

