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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BudgetWarn extends AbstractModel {

    /**
    * ACTUAL 实际金额，
FORECAST 预测金额
    */
    @SerializedName("WarnType")
    @Expose
    private String WarnType;

    /**
    * PERCENTAGE 预算金额的百分比，ABS 固定值
    */
    @SerializedName("CalType")
    @Expose
    private String CalType;

    /**
    * 阈值（大于等于0）
    */
    @SerializedName("ThresholdValue")
    @Expose
    private String ThresholdValue;

    /**
     * Get ACTUAL 实际金额，
FORECAST 预测金额 
     * @return WarnType ACTUAL 实际金额，
FORECAST 预测金额
     */
    public String getWarnType() {
        return this.WarnType;
    }

    /**
     * Set ACTUAL 实际金额，
FORECAST 预测金额
     * @param WarnType ACTUAL 实际金额，
FORECAST 预测金额
     */
    public void setWarnType(String WarnType) {
        this.WarnType = WarnType;
    }

    /**
     * Get PERCENTAGE 预算金额的百分比，ABS 固定值 
     * @return CalType PERCENTAGE 预算金额的百分比，ABS 固定值
     */
    public String getCalType() {
        return this.CalType;
    }

    /**
     * Set PERCENTAGE 预算金额的百分比，ABS 固定值
     * @param CalType PERCENTAGE 预算金额的百分比，ABS 固定值
     */
    public void setCalType(String CalType) {
        this.CalType = CalType;
    }

    /**
     * Get 阈值（大于等于0） 
     * @return ThresholdValue 阈值（大于等于0）
     */
    public String getThresholdValue() {
        return this.ThresholdValue;
    }

    /**
     * Set 阈值（大于等于0）
     * @param ThresholdValue 阈值（大于等于0）
     */
    public void setThresholdValue(String ThresholdValue) {
        this.ThresholdValue = ThresholdValue;
    }

    public BudgetWarn() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BudgetWarn(BudgetWarn source) {
        if (source.WarnType != null) {
            this.WarnType = new String(source.WarnType);
        }
        if (source.CalType != null) {
            this.CalType = new String(source.CalType);
        }
        if (source.ThresholdValue != null) {
            this.ThresholdValue = new String(source.ThresholdValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WarnType", this.WarnType);
        this.setParamSimple(map, prefix + "CalType", this.CalType);
        this.setParamSimple(map, prefix + "ThresholdValue", this.ThresholdValue);

    }
}

