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

public class AutoScaleRecord extends AbstractModel {

    /**
    * <p>扩缩容规则名。</p>
    */
    @SerializedName("StrategyName")
    @Expose
    private String StrategyName;

    /**
    * <p>&quot;SCALE_OUT&quot;和&quot;SCALE_IN&quot;，分别表示扩容和缩容。</p>
    */
    @SerializedName("ScaleAction")
    @Expose
    private String ScaleAction;

    /**
    * <p>取值为&quot;SUCCESS&quot;,&quot;FAILED&quot;,&quot;PART_SUCCESS&quot;,&quot;IN_PROCESS&quot;，分别表示成功、失败、部分成功和流程中。</p>
    */
    @SerializedName("ActionStatus")
    @Expose
    private String ActionStatus;

    /**
    * <p>流程触发时间。</p>
    */
    @SerializedName("ActionTime")
    @Expose
    private String ActionTime;

    /**
    * <p>扩缩容相关描述信息。</p>
    */
    @SerializedName("ScaleInfo")
    @Expose
    private String ScaleInfo;

    /**
    * <p>只在ScaleAction为SCALE_OUT时有效。</p>
    */
    @SerializedName("ExpectScaleNum")
    @Expose
    private Long ExpectScaleNum;

    /**
    * <p>流程结束时间。</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>策略类型，按负载或者按时间，1表示负载伸缩，2表示时间伸缩</p>
    */
    @SerializedName("StrategyType")
    @Expose
    private Long StrategyType;

    /**
    * <p>扩容时所使用规格信息。</p>
    */
    @SerializedName("SpecInfo")
    @Expose
    private String SpecInfo;

    /**
    * <p>补偿扩容，0表示不开启，1表示开启</p>
    */
    @SerializedName("CompensateFlag")
    @Expose
    private Long CompensateFlag;

    /**
    * <p>补偿次数</p>
    */
    @SerializedName("CompensateCount")
    @Expose
    private Long CompensateCount;

    /**
    * <p>重试次数</p>
    */
    @SerializedName("RetryCount")
    @Expose
    private Long RetryCount;

    /**
    * <p>重试信息</p>
    */
    @SerializedName("RetryInfo")
    @Expose
    private String RetryInfo;

    /**
    * <p>重试英文描述</p>
    */
    @SerializedName("RetryEnReason")
    @Expose
    private String RetryEnReason;

    /**
    * <p>重试描述</p>
    */
    @SerializedName("RetryReason")
    @Expose
    private String RetryReason;

    /**
    * <p>缺失分类</p>
    */
    @SerializedName("ShortageClass")
    @Expose
    private Long ShortageClass;

    /**
     * Get <p>扩缩容规则名。</p> 
     * @return StrategyName <p>扩缩容规则名。</p>
     */
    public String getStrategyName() {
        return this.StrategyName;
    }

    /**
     * Set <p>扩缩容规则名。</p>
     * @param StrategyName <p>扩缩容规则名。</p>
     */
    public void setStrategyName(String StrategyName) {
        this.StrategyName = StrategyName;
    }

    /**
     * Get <p>&quot;SCALE_OUT&quot;和&quot;SCALE_IN&quot;，分别表示扩容和缩容。</p> 
     * @return ScaleAction <p>&quot;SCALE_OUT&quot;和&quot;SCALE_IN&quot;，分别表示扩容和缩容。</p>
     */
    public String getScaleAction() {
        return this.ScaleAction;
    }

    /**
     * Set <p>&quot;SCALE_OUT&quot;和&quot;SCALE_IN&quot;，分别表示扩容和缩容。</p>
     * @param ScaleAction <p>&quot;SCALE_OUT&quot;和&quot;SCALE_IN&quot;，分别表示扩容和缩容。</p>
     */
    public void setScaleAction(String ScaleAction) {
        this.ScaleAction = ScaleAction;
    }

    /**
     * Get <p>取值为&quot;SUCCESS&quot;,&quot;FAILED&quot;,&quot;PART_SUCCESS&quot;,&quot;IN_PROCESS&quot;，分别表示成功、失败、部分成功和流程中。</p> 
     * @return ActionStatus <p>取值为&quot;SUCCESS&quot;,&quot;FAILED&quot;,&quot;PART_SUCCESS&quot;,&quot;IN_PROCESS&quot;，分别表示成功、失败、部分成功和流程中。</p>
     */
    public String getActionStatus() {
        return this.ActionStatus;
    }

    /**
     * Set <p>取值为&quot;SUCCESS&quot;,&quot;FAILED&quot;,&quot;PART_SUCCESS&quot;,&quot;IN_PROCESS&quot;，分别表示成功、失败、部分成功和流程中。</p>
     * @param ActionStatus <p>取值为&quot;SUCCESS&quot;,&quot;FAILED&quot;,&quot;PART_SUCCESS&quot;,&quot;IN_PROCESS&quot;，分别表示成功、失败、部分成功和流程中。</p>
     */
    public void setActionStatus(String ActionStatus) {
        this.ActionStatus = ActionStatus;
    }

    /**
     * Get <p>流程触发时间。</p> 
     * @return ActionTime <p>流程触发时间。</p>
     */
    public String getActionTime() {
        return this.ActionTime;
    }

    /**
     * Set <p>流程触发时间。</p>
     * @param ActionTime <p>流程触发时间。</p>
     */
    public void setActionTime(String ActionTime) {
        this.ActionTime = ActionTime;
    }

    /**
     * Get <p>扩缩容相关描述信息。</p> 
     * @return ScaleInfo <p>扩缩容相关描述信息。</p>
     */
    public String getScaleInfo() {
        return this.ScaleInfo;
    }

    /**
     * Set <p>扩缩容相关描述信息。</p>
     * @param ScaleInfo <p>扩缩容相关描述信息。</p>
     */
    public void setScaleInfo(String ScaleInfo) {
        this.ScaleInfo = ScaleInfo;
    }

    /**
     * Get <p>只在ScaleAction为SCALE_OUT时有效。</p> 
     * @return ExpectScaleNum <p>只在ScaleAction为SCALE_OUT时有效。</p>
     */
    public Long getExpectScaleNum() {
        return this.ExpectScaleNum;
    }

    /**
     * Set <p>只在ScaleAction为SCALE_OUT时有效。</p>
     * @param ExpectScaleNum <p>只在ScaleAction为SCALE_OUT时有效。</p>
     */
    public void setExpectScaleNum(Long ExpectScaleNum) {
        this.ExpectScaleNum = ExpectScaleNum;
    }

    /**
     * Get <p>流程结束时间。</p> 
     * @return EndTime <p>流程结束时间。</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>流程结束时间。</p>
     * @param EndTime <p>流程结束时间。</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>策略类型，按负载或者按时间，1表示负载伸缩，2表示时间伸缩</p> 
     * @return StrategyType <p>策略类型，按负载或者按时间，1表示负载伸缩，2表示时间伸缩</p>
     */
    public Long getStrategyType() {
        return this.StrategyType;
    }

    /**
     * Set <p>策略类型，按负载或者按时间，1表示负载伸缩，2表示时间伸缩</p>
     * @param StrategyType <p>策略类型，按负载或者按时间，1表示负载伸缩，2表示时间伸缩</p>
     */
    public void setStrategyType(Long StrategyType) {
        this.StrategyType = StrategyType;
    }

    /**
     * Get <p>扩容时所使用规格信息。</p> 
     * @return SpecInfo <p>扩容时所使用规格信息。</p>
     */
    public String getSpecInfo() {
        return this.SpecInfo;
    }

    /**
     * Set <p>扩容时所使用规格信息。</p>
     * @param SpecInfo <p>扩容时所使用规格信息。</p>
     */
    public void setSpecInfo(String SpecInfo) {
        this.SpecInfo = SpecInfo;
    }

    /**
     * Get <p>补偿扩容，0表示不开启，1表示开启</p> 
     * @return CompensateFlag <p>补偿扩容，0表示不开启，1表示开启</p>
     */
    public Long getCompensateFlag() {
        return this.CompensateFlag;
    }

    /**
     * Set <p>补偿扩容，0表示不开启，1表示开启</p>
     * @param CompensateFlag <p>补偿扩容，0表示不开启，1表示开启</p>
     */
    public void setCompensateFlag(Long CompensateFlag) {
        this.CompensateFlag = CompensateFlag;
    }

    /**
     * Get <p>补偿次数</p> 
     * @return CompensateCount <p>补偿次数</p>
     */
    public Long getCompensateCount() {
        return this.CompensateCount;
    }

    /**
     * Set <p>补偿次数</p>
     * @param CompensateCount <p>补偿次数</p>
     */
    public void setCompensateCount(Long CompensateCount) {
        this.CompensateCount = CompensateCount;
    }

    /**
     * Get <p>重试次数</p> 
     * @return RetryCount <p>重试次数</p>
     */
    public Long getRetryCount() {
        return this.RetryCount;
    }

    /**
     * Set <p>重试次数</p>
     * @param RetryCount <p>重试次数</p>
     */
    public void setRetryCount(Long RetryCount) {
        this.RetryCount = RetryCount;
    }

    /**
     * Get <p>重试信息</p> 
     * @return RetryInfo <p>重试信息</p>
     */
    public String getRetryInfo() {
        return this.RetryInfo;
    }

    /**
     * Set <p>重试信息</p>
     * @param RetryInfo <p>重试信息</p>
     */
    public void setRetryInfo(String RetryInfo) {
        this.RetryInfo = RetryInfo;
    }

    /**
     * Get <p>重试英文描述</p> 
     * @return RetryEnReason <p>重试英文描述</p>
     */
    public String getRetryEnReason() {
        return this.RetryEnReason;
    }

    /**
     * Set <p>重试英文描述</p>
     * @param RetryEnReason <p>重试英文描述</p>
     */
    public void setRetryEnReason(String RetryEnReason) {
        this.RetryEnReason = RetryEnReason;
    }

    /**
     * Get <p>重试描述</p> 
     * @return RetryReason <p>重试描述</p>
     */
    public String getRetryReason() {
        return this.RetryReason;
    }

    /**
     * Set <p>重试描述</p>
     * @param RetryReason <p>重试描述</p>
     */
    public void setRetryReason(String RetryReason) {
        this.RetryReason = RetryReason;
    }

    /**
     * Get <p>缺失分类</p> 
     * @return ShortageClass <p>缺失分类</p>
     */
    public Long getShortageClass() {
        return this.ShortageClass;
    }

    /**
     * Set <p>缺失分类</p>
     * @param ShortageClass <p>缺失分类</p>
     */
    public void setShortageClass(Long ShortageClass) {
        this.ShortageClass = ShortageClass;
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
        if (source.RetryCount != null) {
            this.RetryCount = new Long(source.RetryCount);
        }
        if (source.RetryInfo != null) {
            this.RetryInfo = new String(source.RetryInfo);
        }
        if (source.RetryEnReason != null) {
            this.RetryEnReason = new String(source.RetryEnReason);
        }
        if (source.RetryReason != null) {
            this.RetryReason = new String(source.RetryReason);
        }
        if (source.ShortageClass != null) {
            this.ShortageClass = new Long(source.ShortageClass);
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
        this.setParamSimple(map, prefix + "RetryCount", this.RetryCount);
        this.setParamSimple(map, prefix + "RetryInfo", this.RetryInfo);
        this.setParamSimple(map, prefix + "RetryEnReason", this.RetryEnReason);
        this.setParamSimple(map, prefix + "RetryReason", this.RetryReason);
        this.setParamSimple(map, prefix + "ShortageClass", this.ShortageClass);

    }
}

