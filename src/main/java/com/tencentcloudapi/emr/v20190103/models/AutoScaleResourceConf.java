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

public class AutoScaleResourceConf extends AbstractModel {

    /**
    * <p>配置ID。</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>集群实例ID。</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private Long ClusterId;

    /**
    * <p>自动扩缩容保留最小实例数。</p>
    */
    @SerializedName("ScaleLowerBound")
    @Expose
    private Long ScaleLowerBound;

    /**
    * <p>自动扩缩容最大实例数。</p>
    */
    @SerializedName("ScaleUpperBound")
    @Expose
    private Long ScaleUpperBound;

    /**
    * <p>扩容规则类型，1为按负载指标扩容规则，2为按时间扩容规则</p>
    */
    @SerializedName("StrategyType")
    @Expose
    private Long StrategyType;

    /**
    * <p>下次可扩容时间。</p>
    */
    @SerializedName("NextTimeCanScale")
    @Expose
    private Long NextTimeCanScale;

    /**
    * <p>优雅缩容开关</p>
    */
    @SerializedName("GraceDownFlag")
    @Expose
    private Boolean GraceDownFlag;

    /**
    * <p>&quot;CVM&quot;表示规格全部使用CVM相关类型，&quot;POD&quot;表示规格使用容器相关类型,默认为&quot;CVM&quot;。</p>
    */
    @SerializedName("HardwareType")
    @Expose
    private String HardwareType;

    /**
    * <p>&quot;POSTPAY&quot;表示只使用按量计费，&quot;SPOT_FIRST&quot;表示竞价实例优先，只有HardwareType为&quot;HOST&quot;时支持竞价实例优先，&quot;POD&quot;只支持纯按量计费。</p>
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * <p>竞价实例优先的场景下，按量计费资源数量的最低百分比，整数</p>
    */
    @SerializedName("PostPayPercentMin")
    @Expose
    private Long PostPayPercentMin;

    /**
    * <p>预设资源类型为HOST时，支持勾选“资源不足时切换POD”；支持取消勾选；0表示默认不勾选（0），1表示勾选</p>
    */
    @SerializedName("ChangeToPod")
    @Expose
    private Long ChangeToPod;

    /**
    * <p>伸缩组名</p>
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * <p>标签</p>
    */
    @SerializedName("YarnNodeLabel")
    @Expose
    private String YarnNodeLabel;

    /**
    * <p>对应的计算组</p>
    */
    @SerializedName("WarehouseName")
    @Expose
    private String WarehouseName;

    /**
    * <p>伸缩组状态</p>
    */
    @SerializedName("GroupStatus")
    @Expose
    private Long GroupStatus;

    /**
    * <p>并行伸缩 0关闭；1开启</p>
    */
    @SerializedName("Parallel")
    @Expose
    private Long Parallel;

    /**
    * <p>是否支持MNode</p>
    */
    @SerializedName("EnableMNode")
    @Expose
    private Long EnableMNode;

    /**
    * <p>伸缩组更多设置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtraAdvanceAttrs")
    @Expose
    private AutoScaleGroupAdvanceAttrs ExtraAdvanceAttrs;

    /**
    * <p>自定义主机名</p>
    */
    @SerializedName("CustomNodeName")
    @Expose
    private String CustomNodeName;

    /**
     * Get <p>配置ID。</p> 
     * @return Id <p>配置ID。</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>配置ID。</p>
     * @param Id <p>配置ID。</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>集群实例ID。</p> 
     * @return ClusterId <p>集群实例ID。</p>
     */
    public Long getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群实例ID。</p>
     * @param ClusterId <p>集群实例ID。</p>
     */
    public void setClusterId(Long ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>自动扩缩容保留最小实例数。</p> 
     * @return ScaleLowerBound <p>自动扩缩容保留最小实例数。</p>
     */
    public Long getScaleLowerBound() {
        return this.ScaleLowerBound;
    }

    /**
     * Set <p>自动扩缩容保留最小实例数。</p>
     * @param ScaleLowerBound <p>自动扩缩容保留最小实例数。</p>
     */
    public void setScaleLowerBound(Long ScaleLowerBound) {
        this.ScaleLowerBound = ScaleLowerBound;
    }

    /**
     * Get <p>自动扩缩容最大实例数。</p> 
     * @return ScaleUpperBound <p>自动扩缩容最大实例数。</p>
     */
    public Long getScaleUpperBound() {
        return this.ScaleUpperBound;
    }

    /**
     * Set <p>自动扩缩容最大实例数。</p>
     * @param ScaleUpperBound <p>自动扩缩容最大实例数。</p>
     */
    public void setScaleUpperBound(Long ScaleUpperBound) {
        this.ScaleUpperBound = ScaleUpperBound;
    }

    /**
     * Get <p>扩容规则类型，1为按负载指标扩容规则，2为按时间扩容规则</p> 
     * @return StrategyType <p>扩容规则类型，1为按负载指标扩容规则，2为按时间扩容规则</p>
     */
    public Long getStrategyType() {
        return this.StrategyType;
    }

    /**
     * Set <p>扩容规则类型，1为按负载指标扩容规则，2为按时间扩容规则</p>
     * @param StrategyType <p>扩容规则类型，1为按负载指标扩容规则，2为按时间扩容规则</p>
     */
    public void setStrategyType(Long StrategyType) {
        this.StrategyType = StrategyType;
    }

    /**
     * Get <p>下次可扩容时间。</p> 
     * @return NextTimeCanScale <p>下次可扩容时间。</p>
     */
    public Long getNextTimeCanScale() {
        return this.NextTimeCanScale;
    }

    /**
     * Set <p>下次可扩容时间。</p>
     * @param NextTimeCanScale <p>下次可扩容时间。</p>
     */
    public void setNextTimeCanScale(Long NextTimeCanScale) {
        this.NextTimeCanScale = NextTimeCanScale;
    }

    /**
     * Get <p>优雅缩容开关</p> 
     * @return GraceDownFlag <p>优雅缩容开关</p>
     */
    public Boolean getGraceDownFlag() {
        return this.GraceDownFlag;
    }

    /**
     * Set <p>优雅缩容开关</p>
     * @param GraceDownFlag <p>优雅缩容开关</p>
     */
    public void setGraceDownFlag(Boolean GraceDownFlag) {
        this.GraceDownFlag = GraceDownFlag;
    }

    /**
     * Get <p>&quot;CVM&quot;表示规格全部使用CVM相关类型，&quot;POD&quot;表示规格使用容器相关类型,默认为&quot;CVM&quot;。</p> 
     * @return HardwareType <p>&quot;CVM&quot;表示规格全部使用CVM相关类型，&quot;POD&quot;表示规格使用容器相关类型,默认为&quot;CVM&quot;。</p>
     */
    public String getHardwareType() {
        return this.HardwareType;
    }

    /**
     * Set <p>&quot;CVM&quot;表示规格全部使用CVM相关类型，&quot;POD&quot;表示规格使用容器相关类型,默认为&quot;CVM&quot;。</p>
     * @param HardwareType <p>&quot;CVM&quot;表示规格全部使用CVM相关类型，&quot;POD&quot;表示规格使用容器相关类型,默认为&quot;CVM&quot;。</p>
     */
    public void setHardwareType(String HardwareType) {
        this.HardwareType = HardwareType;
    }

    /**
     * Get <p>&quot;POSTPAY&quot;表示只使用按量计费，&quot;SPOT_FIRST&quot;表示竞价实例优先，只有HardwareType为&quot;HOST&quot;时支持竞价实例优先，&quot;POD&quot;只支持纯按量计费。</p> 
     * @return PayMode <p>&quot;POSTPAY&quot;表示只使用按量计费，&quot;SPOT_FIRST&quot;表示竞价实例优先，只有HardwareType为&quot;HOST&quot;时支持竞价实例优先，&quot;POD&quot;只支持纯按量计费。</p>
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>&quot;POSTPAY&quot;表示只使用按量计费，&quot;SPOT_FIRST&quot;表示竞价实例优先，只有HardwareType为&quot;HOST&quot;时支持竞价实例优先，&quot;POD&quot;只支持纯按量计费。</p>
     * @param PayMode <p>&quot;POSTPAY&quot;表示只使用按量计费，&quot;SPOT_FIRST&quot;表示竞价实例优先，只有HardwareType为&quot;HOST&quot;时支持竞价实例优先，&quot;POD&quot;只支持纯按量计费。</p>
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>竞价实例优先的场景下，按量计费资源数量的最低百分比，整数</p> 
     * @return PostPayPercentMin <p>竞价实例优先的场景下，按量计费资源数量的最低百分比，整数</p>
     */
    public Long getPostPayPercentMin() {
        return this.PostPayPercentMin;
    }

    /**
     * Set <p>竞价实例优先的场景下，按量计费资源数量的最低百分比，整数</p>
     * @param PostPayPercentMin <p>竞价实例优先的场景下，按量计费资源数量的最低百分比，整数</p>
     */
    public void setPostPayPercentMin(Long PostPayPercentMin) {
        this.PostPayPercentMin = PostPayPercentMin;
    }

    /**
     * Get <p>预设资源类型为HOST时，支持勾选“资源不足时切换POD”；支持取消勾选；0表示默认不勾选（0），1表示勾选</p> 
     * @return ChangeToPod <p>预设资源类型为HOST时，支持勾选“资源不足时切换POD”；支持取消勾选；0表示默认不勾选（0），1表示勾选</p>
     */
    public Long getChangeToPod() {
        return this.ChangeToPod;
    }

    /**
     * Set <p>预设资源类型为HOST时，支持勾选“资源不足时切换POD”；支持取消勾选；0表示默认不勾选（0），1表示勾选</p>
     * @param ChangeToPod <p>预设资源类型为HOST时，支持勾选“资源不足时切换POD”；支持取消勾选；0表示默认不勾选（0），1表示勾选</p>
     */
    public void setChangeToPod(Long ChangeToPod) {
        this.ChangeToPod = ChangeToPod;
    }

    /**
     * Get <p>伸缩组名</p> 
     * @return GroupName <p>伸缩组名</p>
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set <p>伸缩组名</p>
     * @param GroupName <p>伸缩组名</p>
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get <p>标签</p> 
     * @return YarnNodeLabel <p>标签</p>
     */
    public String getYarnNodeLabel() {
        return this.YarnNodeLabel;
    }

    /**
     * Set <p>标签</p>
     * @param YarnNodeLabel <p>标签</p>
     */
    public void setYarnNodeLabel(String YarnNodeLabel) {
        this.YarnNodeLabel = YarnNodeLabel;
    }

    /**
     * Get <p>对应的计算组</p> 
     * @return WarehouseName <p>对应的计算组</p>
     */
    public String getWarehouseName() {
        return this.WarehouseName;
    }

    /**
     * Set <p>对应的计算组</p>
     * @param WarehouseName <p>对应的计算组</p>
     */
    public void setWarehouseName(String WarehouseName) {
        this.WarehouseName = WarehouseName;
    }

    /**
     * Get <p>伸缩组状态</p> 
     * @return GroupStatus <p>伸缩组状态</p>
     */
    public Long getGroupStatus() {
        return this.GroupStatus;
    }

    /**
     * Set <p>伸缩组状态</p>
     * @param GroupStatus <p>伸缩组状态</p>
     */
    public void setGroupStatus(Long GroupStatus) {
        this.GroupStatus = GroupStatus;
    }

    /**
     * Get <p>并行伸缩 0关闭；1开启</p> 
     * @return Parallel <p>并行伸缩 0关闭；1开启</p>
     */
    public Long getParallel() {
        return this.Parallel;
    }

    /**
     * Set <p>并行伸缩 0关闭；1开启</p>
     * @param Parallel <p>并行伸缩 0关闭；1开启</p>
     */
    public void setParallel(Long Parallel) {
        this.Parallel = Parallel;
    }

    /**
     * Get <p>是否支持MNode</p> 
     * @return EnableMNode <p>是否支持MNode</p>
     */
    public Long getEnableMNode() {
        return this.EnableMNode;
    }

    /**
     * Set <p>是否支持MNode</p>
     * @param EnableMNode <p>是否支持MNode</p>
     */
    public void setEnableMNode(Long EnableMNode) {
        this.EnableMNode = EnableMNode;
    }

    /**
     * Get <p>伸缩组更多设置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtraAdvanceAttrs <p>伸缩组更多设置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AutoScaleGroupAdvanceAttrs getExtraAdvanceAttrs() {
        return this.ExtraAdvanceAttrs;
    }

    /**
     * Set <p>伸缩组更多设置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtraAdvanceAttrs <p>伸缩组更多设置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtraAdvanceAttrs(AutoScaleGroupAdvanceAttrs ExtraAdvanceAttrs) {
        this.ExtraAdvanceAttrs = ExtraAdvanceAttrs;
    }

    /**
     * Get <p>自定义主机名</p> 
     * @return CustomNodeName <p>自定义主机名</p>
     */
    public String getCustomNodeName() {
        return this.CustomNodeName;
    }

    /**
     * Set <p>自定义主机名</p>
     * @param CustomNodeName <p>自定义主机名</p>
     */
    public void setCustomNodeName(String CustomNodeName) {
        this.CustomNodeName = CustomNodeName;
    }

    public AutoScaleResourceConf() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AutoScaleResourceConf(AutoScaleResourceConf source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new Long(source.ClusterId);
        }
        if (source.ScaleLowerBound != null) {
            this.ScaleLowerBound = new Long(source.ScaleLowerBound);
        }
        if (source.ScaleUpperBound != null) {
            this.ScaleUpperBound = new Long(source.ScaleUpperBound);
        }
        if (source.StrategyType != null) {
            this.StrategyType = new Long(source.StrategyType);
        }
        if (source.NextTimeCanScale != null) {
            this.NextTimeCanScale = new Long(source.NextTimeCanScale);
        }
        if (source.GraceDownFlag != null) {
            this.GraceDownFlag = new Boolean(source.GraceDownFlag);
        }
        if (source.HardwareType != null) {
            this.HardwareType = new String(source.HardwareType);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.PostPayPercentMin != null) {
            this.PostPayPercentMin = new Long(source.PostPayPercentMin);
        }
        if (source.ChangeToPod != null) {
            this.ChangeToPod = new Long(source.ChangeToPod);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.YarnNodeLabel != null) {
            this.YarnNodeLabel = new String(source.YarnNodeLabel);
        }
        if (source.WarehouseName != null) {
            this.WarehouseName = new String(source.WarehouseName);
        }
        if (source.GroupStatus != null) {
            this.GroupStatus = new Long(source.GroupStatus);
        }
        if (source.Parallel != null) {
            this.Parallel = new Long(source.Parallel);
        }
        if (source.EnableMNode != null) {
            this.EnableMNode = new Long(source.EnableMNode);
        }
        if (source.ExtraAdvanceAttrs != null) {
            this.ExtraAdvanceAttrs = new AutoScaleGroupAdvanceAttrs(source.ExtraAdvanceAttrs);
        }
        if (source.CustomNodeName != null) {
            this.CustomNodeName = new String(source.CustomNodeName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ScaleLowerBound", this.ScaleLowerBound);
        this.setParamSimple(map, prefix + "ScaleUpperBound", this.ScaleUpperBound);
        this.setParamSimple(map, prefix + "StrategyType", this.StrategyType);
        this.setParamSimple(map, prefix + "NextTimeCanScale", this.NextTimeCanScale);
        this.setParamSimple(map, prefix + "GraceDownFlag", this.GraceDownFlag);
        this.setParamSimple(map, prefix + "HardwareType", this.HardwareType);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "PostPayPercentMin", this.PostPayPercentMin);
        this.setParamSimple(map, prefix + "ChangeToPod", this.ChangeToPod);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "YarnNodeLabel", this.YarnNodeLabel);
        this.setParamSimple(map, prefix + "WarehouseName", this.WarehouseName);
        this.setParamSimple(map, prefix + "GroupStatus", this.GroupStatus);
        this.setParamSimple(map, prefix + "Parallel", this.Parallel);
        this.setParamSimple(map, prefix + "EnableMNode", this.EnableMNode);
        this.setParamObj(map, prefix + "ExtraAdvanceAttrs.", this.ExtraAdvanceAttrs);
        this.setParamSimple(map, prefix + "CustomNodeName", this.CustomNodeName);

    }
}

