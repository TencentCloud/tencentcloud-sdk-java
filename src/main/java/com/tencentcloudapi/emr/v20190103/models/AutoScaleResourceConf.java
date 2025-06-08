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

public class AutoScaleResourceConf extends AbstractModel {

    /**
    * 配置ID。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 集群实例ID。
    */
    @SerializedName("ClusterId")
    @Expose
    private Long ClusterId;

    /**
    * 自动扩缩容保留最小实例数。
    */
    @SerializedName("ScaleLowerBound")
    @Expose
    private Long ScaleLowerBound;

    /**
    * 自动扩缩容最大实例数。
    */
    @SerializedName("ScaleUpperBound")
    @Expose
    private Long ScaleUpperBound;

    /**
    * 扩容规则类型，1为按负载指标扩容规则，2为按时间扩容规则
    */
    @SerializedName("StrategyType")
    @Expose
    private Long StrategyType;

    /**
    * 下次可扩容时间。
    */
    @SerializedName("NextTimeCanScale")
    @Expose
    private Long NextTimeCanScale;

    /**
    * 优雅缩容开关
    */
    @SerializedName("GraceDownFlag")
    @Expose
    private Boolean GraceDownFlag;

    /**
    * "CVM"表示规格全部使用CVM相关类型，"POD"表示规格使用容器相关类型,默认为"CVM"。
    */
    @SerializedName("HardwareType")
    @Expose
    private String HardwareType;

    /**
    * "POSTPAY"表示只使用按量计费，"SPOT_FIRST"表示竞价实例优先，只有HardwareType为"HOST"时支持竞价实例优先，"POD"只支持纯按量计费。
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * 竞价实例优先的场景下，按量计费资源数量的最低百分比，整数
    */
    @SerializedName("PostPayPercentMin")
    @Expose
    private Long PostPayPercentMin;

    /**
    * 预设资源类型为HOST时，支持勾选“资源不足时切换POD”；支持取消勾选；0表示默认不勾选（0），1表示勾选
    */
    @SerializedName("ChangeToPod")
    @Expose
    private Long ChangeToPod;

    /**
    * 伸缩组名
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 标签
    */
    @SerializedName("YarnNodeLabel")
    @Expose
    private String YarnNodeLabel;

    /**
    * 伸缩组状态
    */
    @SerializedName("GroupStatus")
    @Expose
    private Long GroupStatus;

    /**
    * 并行伸缩 0关闭；1开启
    */
    @SerializedName("Parallel")
    @Expose
    private Long Parallel;

    /**
    * 是否支持MNode
    */
    @SerializedName("EnableMNode")
    @Expose
    private Long EnableMNode;

    /**
    * 伸缩组更多设置
    */
    @SerializedName("ExtraAdvanceAttrs")
    @Expose
    private AutoScaleGroupAdvanceAttrs ExtraAdvanceAttrs;

    /**
     * Get 配置ID。 
     * @return Id 配置ID。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 配置ID。
     * @param Id 配置ID。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 集群实例ID。 
     * @return ClusterId 集群实例ID。
     */
    public Long getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群实例ID。
     * @param ClusterId 集群实例ID。
     */
    public void setClusterId(Long ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 自动扩缩容保留最小实例数。 
     * @return ScaleLowerBound 自动扩缩容保留最小实例数。
     */
    public Long getScaleLowerBound() {
        return this.ScaleLowerBound;
    }

    /**
     * Set 自动扩缩容保留最小实例数。
     * @param ScaleLowerBound 自动扩缩容保留最小实例数。
     */
    public void setScaleLowerBound(Long ScaleLowerBound) {
        this.ScaleLowerBound = ScaleLowerBound;
    }

    /**
     * Get 自动扩缩容最大实例数。 
     * @return ScaleUpperBound 自动扩缩容最大实例数。
     */
    public Long getScaleUpperBound() {
        return this.ScaleUpperBound;
    }

    /**
     * Set 自动扩缩容最大实例数。
     * @param ScaleUpperBound 自动扩缩容最大实例数。
     */
    public void setScaleUpperBound(Long ScaleUpperBound) {
        this.ScaleUpperBound = ScaleUpperBound;
    }

    /**
     * Get 扩容规则类型，1为按负载指标扩容规则，2为按时间扩容规则 
     * @return StrategyType 扩容规则类型，1为按负载指标扩容规则，2为按时间扩容规则
     */
    public Long getStrategyType() {
        return this.StrategyType;
    }

    /**
     * Set 扩容规则类型，1为按负载指标扩容规则，2为按时间扩容规则
     * @param StrategyType 扩容规则类型，1为按负载指标扩容规则，2为按时间扩容规则
     */
    public void setStrategyType(Long StrategyType) {
        this.StrategyType = StrategyType;
    }

    /**
     * Get 下次可扩容时间。 
     * @return NextTimeCanScale 下次可扩容时间。
     */
    public Long getNextTimeCanScale() {
        return this.NextTimeCanScale;
    }

    /**
     * Set 下次可扩容时间。
     * @param NextTimeCanScale 下次可扩容时间。
     */
    public void setNextTimeCanScale(Long NextTimeCanScale) {
        this.NextTimeCanScale = NextTimeCanScale;
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
     * Get "CVM"表示规格全部使用CVM相关类型，"POD"表示规格使用容器相关类型,默认为"CVM"。 
     * @return HardwareType "CVM"表示规格全部使用CVM相关类型，"POD"表示规格使用容器相关类型,默认为"CVM"。
     */
    public String getHardwareType() {
        return this.HardwareType;
    }

    /**
     * Set "CVM"表示规格全部使用CVM相关类型，"POD"表示规格使用容器相关类型,默认为"CVM"。
     * @param HardwareType "CVM"表示规格全部使用CVM相关类型，"POD"表示规格使用容器相关类型,默认为"CVM"。
     */
    public void setHardwareType(String HardwareType) {
        this.HardwareType = HardwareType;
    }

    /**
     * Get "POSTPAY"表示只使用按量计费，"SPOT_FIRST"表示竞价实例优先，只有HardwareType为"HOST"时支持竞价实例优先，"POD"只支持纯按量计费。 
     * @return PayMode "POSTPAY"表示只使用按量计费，"SPOT_FIRST"表示竞价实例优先，只有HardwareType为"HOST"时支持竞价实例优先，"POD"只支持纯按量计费。
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set "POSTPAY"表示只使用按量计费，"SPOT_FIRST"表示竞价实例优先，只有HardwareType为"HOST"时支持竞价实例优先，"POD"只支持纯按量计费。
     * @param PayMode "POSTPAY"表示只使用按量计费，"SPOT_FIRST"表示竞价实例优先，只有HardwareType为"HOST"时支持竞价实例优先，"POD"只支持纯按量计费。
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 竞价实例优先的场景下，按量计费资源数量的最低百分比，整数 
     * @return PostPayPercentMin 竞价实例优先的场景下，按量计费资源数量的最低百分比，整数
     */
    public Long getPostPayPercentMin() {
        return this.PostPayPercentMin;
    }

    /**
     * Set 竞价实例优先的场景下，按量计费资源数量的最低百分比，整数
     * @param PostPayPercentMin 竞价实例优先的场景下，按量计费资源数量的最低百分比，整数
     */
    public void setPostPayPercentMin(Long PostPayPercentMin) {
        this.PostPayPercentMin = PostPayPercentMin;
    }

    /**
     * Get 预设资源类型为HOST时，支持勾选“资源不足时切换POD”；支持取消勾选；0表示默认不勾选（0），1表示勾选 
     * @return ChangeToPod 预设资源类型为HOST时，支持勾选“资源不足时切换POD”；支持取消勾选；0表示默认不勾选（0），1表示勾选
     */
    public Long getChangeToPod() {
        return this.ChangeToPod;
    }

    /**
     * Set 预设资源类型为HOST时，支持勾选“资源不足时切换POD”；支持取消勾选；0表示默认不勾选（0），1表示勾选
     * @param ChangeToPod 预设资源类型为HOST时，支持勾选“资源不足时切换POD”；支持取消勾选；0表示默认不勾选（0），1表示勾选
     */
    public void setChangeToPod(Long ChangeToPod) {
        this.ChangeToPod = ChangeToPod;
    }

    /**
     * Get 伸缩组名 
     * @return GroupName 伸缩组名
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 伸缩组名
     * @param GroupName 伸缩组名
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 标签 
     * @return YarnNodeLabel 标签
     */
    public String getYarnNodeLabel() {
        return this.YarnNodeLabel;
    }

    /**
     * Set 标签
     * @param YarnNodeLabel 标签
     */
    public void setYarnNodeLabel(String YarnNodeLabel) {
        this.YarnNodeLabel = YarnNodeLabel;
    }

    /**
     * Get 伸缩组状态 
     * @return GroupStatus 伸缩组状态
     */
    public Long getGroupStatus() {
        return this.GroupStatus;
    }

    /**
     * Set 伸缩组状态
     * @param GroupStatus 伸缩组状态
     */
    public void setGroupStatus(Long GroupStatus) {
        this.GroupStatus = GroupStatus;
    }

    /**
     * Get 并行伸缩 0关闭；1开启 
     * @return Parallel 并行伸缩 0关闭；1开启
     */
    public Long getParallel() {
        return this.Parallel;
    }

    /**
     * Set 并行伸缩 0关闭；1开启
     * @param Parallel 并行伸缩 0关闭；1开启
     */
    public void setParallel(Long Parallel) {
        this.Parallel = Parallel;
    }

    /**
     * Get 是否支持MNode 
     * @return EnableMNode 是否支持MNode
     */
    public Long getEnableMNode() {
        return this.EnableMNode;
    }

    /**
     * Set 是否支持MNode
     * @param EnableMNode 是否支持MNode
     */
    public void setEnableMNode(Long EnableMNode) {
        this.EnableMNode = EnableMNode;
    }

    /**
     * Get 伸缩组更多设置 
     * @return ExtraAdvanceAttrs 伸缩组更多设置
     */
    public AutoScaleGroupAdvanceAttrs getExtraAdvanceAttrs() {
        return this.ExtraAdvanceAttrs;
    }

    /**
     * Set 伸缩组更多设置
     * @param ExtraAdvanceAttrs 伸缩组更多设置
     */
    public void setExtraAdvanceAttrs(AutoScaleGroupAdvanceAttrs ExtraAdvanceAttrs) {
        this.ExtraAdvanceAttrs = ExtraAdvanceAttrs;
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
        this.setParamSimple(map, prefix + "GroupStatus", this.GroupStatus);
        this.setParamSimple(map, prefix + "Parallel", this.Parallel);
        this.setParamSimple(map, prefix + "EnableMNode", this.EnableMNode);
        this.setParamObj(map, prefix + "ExtraAdvanceAttrs.", this.ExtraAdvanceAttrs);

    }
}

