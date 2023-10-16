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

public class AutoScaleRecord extends AbstractModel{

    /**
    * 扩缩容规则名。
    */
    @SerializedName("StrategyName")
    @Expose
    private String StrategyName;

    /**
    * "SCALE_OUT"和"SCALE_IN"，分别表示扩容和缩容。
    */
    @SerializedName("ScaleAction")
    @Expose
    private String ScaleAction;

    /**
    * 取值为"SUCCESS","FAILED","PART_SUCCESS","IN_PROCESS"，分别表示成功、失败、部分成功和流程中。
    */
    @SerializedName("ActionStatus")
    @Expose
    private String ActionStatus;

    /**
    * 流程触发时间。
    */
    @SerializedName("ActionTime")
    @Expose
    private String ActionTime;

    /**
    * 扩缩容相关描述信息。
    */
    @SerializedName("ScaleInfo")
    @Expose
    private String ScaleInfo;

    /**
    * 只在ScaleAction为SCALE_OUT时有效。
    */
    @SerializedName("ExpectScaleNum")
    @Expose
    private Long ExpectScaleNum;

    /**
    * 流程结束时间。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 策略类型，按负载或者按时间，1表示负载伸缩，2表示时间伸缩
    */
    @SerializedName("StrategyType")
    @Expose
    private Long StrategyType;

    /**
    * 扩容时所使用规格信息。
    */
    @SerializedName("SpecInfo")
    @Expose
    private String SpecInfo;

    /**
    * 补偿扩容，0表示不开启，1表示开启
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CompensateFlag")
    @Expose
    private Long CompensateFlag;

    /**
    * 补偿次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CompensateCount")
    @Expose
    private Long CompensateCount;

    /**
     * Get 扩缩容规则名。 
     * @return StrategyName 扩缩容规则名。
     */
    public String getStrategyName() {
        return this.StrategyName;
    }

    /**
     * Set 扩缩容规则名。
     * @param StrategyName 扩缩容规则名。
     */
    public void setStrategyName(String StrategyName) {
        this.StrategyName = StrategyName;
    }

    /**
     * Get "SCALE_OUT"和"SCALE_IN"，分别表示扩容和缩容。 
     * @return ScaleAction "SCALE_OUT"和"SCALE_IN"，分别表示扩容和缩容。
     */
    public String getScaleAction() {
        return this.ScaleAction;
    }

    /**
     * Set "SCALE_OUT"和"SCALE_IN"，分别表示扩容和缩容。
     * @param ScaleAction "SCALE_OUT"和"SCALE_IN"，分别表示扩容和缩容。
     */
    public void setScaleAction(String ScaleAction) {
        this.ScaleAction = ScaleAction;
    }

    /**
     * Get 取值为"SUCCESS","FAILED","PART_SUCCESS","IN_PROCESS"，分别表示成功、失败、部分成功和流程中。 
     * @return ActionStatus 取值为"SUCCESS","FAILED","PART_SUCCESS","IN_PROCESS"，分别表示成功、失败、部分成功和流程中。
     */
    public String getActionStatus() {
        return this.ActionStatus;
    }

    /**
     * Set 取值为"SUCCESS","FAILED","PART_SUCCESS","IN_PROCESS"，分别表示成功、失败、部分成功和流程中。
     * @param ActionStatus 取值为"SUCCESS","FAILED","PART_SUCCESS","IN_PROCESS"，分别表示成功、失败、部分成功和流程中。
     */
    public void setActionStatus(String ActionStatus) {
        this.ActionStatus = ActionStatus;
    }

    /**
     * Get 流程触发时间。 
     * @return ActionTime 流程触发时间。
     */
    public String getActionTime() {
        return this.ActionTime;
    }

    /**
     * Set 流程触发时间。
     * @param ActionTime 流程触发时间。
     */
    public void setActionTime(String ActionTime) {
        this.ActionTime = ActionTime;
    }

    /**
     * Get 扩缩容相关描述信息。 
     * @return ScaleInfo 扩缩容相关描述信息。
     */
    public String getScaleInfo() {
        return this.ScaleInfo;
    }

    /**
     * Set 扩缩容相关描述信息。
     * @param ScaleInfo 扩缩容相关描述信息。
     */
    public void setScaleInfo(String ScaleInfo) {
        this.ScaleInfo = ScaleInfo;
    }

    /**
     * Get 只在ScaleAction为SCALE_OUT时有效。 
     * @return ExpectScaleNum 只在ScaleAction为SCALE_OUT时有效。
     */
    public Long getExpectScaleNum() {
        return this.ExpectScaleNum;
    }

    /**
     * Set 只在ScaleAction为SCALE_OUT时有效。
     * @param ExpectScaleNum 只在ScaleAction为SCALE_OUT时有效。
     */
    public void setExpectScaleNum(Long ExpectScaleNum) {
        this.ExpectScaleNum = ExpectScaleNum;
    }

    /**
     * Get 流程结束时间。 
     * @return EndTime 流程结束时间。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 流程结束时间。
     * @param EndTime 流程结束时间。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 策略类型，按负载或者按时间，1表示负载伸缩，2表示时间伸缩 
     * @return StrategyType 策略类型，按负载或者按时间，1表示负载伸缩，2表示时间伸缩
     */
    public Long getStrategyType() {
        return this.StrategyType;
    }

    /**
     * Set 策略类型，按负载或者按时间，1表示负载伸缩，2表示时间伸缩
     * @param StrategyType 策略类型，按负载或者按时间，1表示负载伸缩，2表示时间伸缩
     */
    public void setStrategyType(Long StrategyType) {
        this.StrategyType = StrategyType;
    }

    /**
     * Get 扩容时所使用规格信息。 
     * @return SpecInfo 扩容时所使用规格信息。
     */
    public String getSpecInfo() {
        return this.SpecInfo;
    }

    /**
     * Set 扩容时所使用规格信息。
     * @param SpecInfo 扩容时所使用规格信息。
     */
    public void setSpecInfo(String SpecInfo) {
        this.SpecInfo = SpecInfo;
    }

    /**
     * Get 补偿扩容，0表示不开启，1表示开启
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CompensateFlag 补偿扩容，0表示不开启，1表示开启
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCompensateFlag() {
        return this.CompensateFlag;
    }

    /**
     * Set 补偿扩容，0表示不开启，1表示开启
注意：此字段可能返回 null，表示取不到有效值。
     * @param CompensateFlag 补偿扩容，0表示不开启，1表示开启
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompensateFlag(Long CompensateFlag) {
        this.CompensateFlag = CompensateFlag;
    }

    /**
     * Get 补偿次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CompensateCount 补偿次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCompensateCount() {
        return this.CompensateCount;
    }

    /**
     * Set 补偿次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param CompensateCount 补偿次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompensateCount(Long CompensateCount) {
        this.CompensateCount = CompensateCount;
    }

    public AutoScaleRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AutoScaleRecord(AutoScaleRecord source) {
        if (source.StrategyName != null) {
            this.StrategyName = new String(source.StrategyName);
        }
        if (source.ScaleAction != null) {
            this.ScaleAction = new String(source.ScaleAction);
        }
        if (source.ActionStatus != null) {
            this.ActionStatus = new String(source.ActionStatus);
        }
        if (source.ActionTime != null) {
            this.ActionTime = new String(source.ActionTime);
        }
        if (source.ScaleInfo != null) {
            this.ScaleInfo = new String(source.ScaleInfo);
        }
        if (source.ExpectScaleNum != null) {
            this.ExpectScaleNum = new Long(source.ExpectScaleNum);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.StrategyType != null) {
            this.StrategyType = new Long(source.StrategyType);
        }
        if (source.SpecInfo != null) {
            this.SpecInfo = new String(source.SpecInfo);
        }
        if (source.CompensateFlag != null) {
            this.CompensateFlag = new Long(source.CompensateFlag);
        }
        if (source.CompensateCount != null) {
            this.CompensateCount = new Long(source.CompensateCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StrategyName", this.StrategyName);
        this.setParamSimple(map, prefix + "ScaleAction", this.ScaleAction);
        this.setParamSimple(map, prefix + "ActionStatus", this.ActionStatus);
        this.setParamSimple(map, prefix + "ActionTime", this.ActionTime);
        this.setParamSimple(map, prefix + "ScaleInfo", this.ScaleInfo);
        this.setParamSimple(map, prefix + "ExpectScaleNum", this.ExpectScaleNum);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "StrategyType", this.StrategyType);
        this.setParamSimple(map, prefix + "SpecInfo", this.SpecInfo);
        this.setParamSimple(map, prefix + "CompensateFlag", this.CompensateFlag);
        this.setParamSimple(map, prefix + "CompensateCount", this.CompensateCount);

    }
}

