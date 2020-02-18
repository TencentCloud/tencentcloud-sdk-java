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

public class InquiryPriceUpdateInstanceRequest extends AbstractModel{

    /**
    * 时间单位。s:按量用例单位。m:包年包月用例单位
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * 时间长度。按量用例长度为3600。
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * 变配参数
    */
    @SerializedName("UpdateSpec")
    @Expose
    private UpdateInstanceSettings UpdateSpec;

    /**
    * 计费类型
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * 位置信息
    */
    @SerializedName("Placement")
    @Expose
    private Placement Placement;

    /**
    * 货币种类
    */
    @SerializedName("Currency")
    @Expose
    private String Currency;

    /**
     * Get 时间单位。s:按量用例单位。m:包年包月用例单位 
     * @return TimeUnit 时间单位。s:按量用例单位。m:包年包月用例单位
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set 时间单位。s:按量用例单位。m:包年包月用例单位
     * @param TimeUnit 时间单位。s:按量用例单位。m:包年包月用例单位
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get 时间长度。按量用例长度为3600。 
     * @return TimeSpan 时间长度。按量用例长度为3600。
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set 时间长度。按量用例长度为3600。
     * @param TimeSpan 时间长度。按量用例长度为3600。
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get 变配参数 
     * @return UpdateSpec 变配参数
     */
    public UpdateInstanceSettings getUpdateSpec() {
        return this.UpdateSpec;
    }

    /**
     * Set 变配参数
     * @param UpdateSpec 变配参数
     */
    public void setUpdateSpec(UpdateInstanceSettings UpdateSpec) {
        this.UpdateSpec = UpdateSpec;
    }

    /**
     * Get 计费类型 
     * @return PayMode 计费类型
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 计费类型
     * @param PayMode 计费类型
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 位置信息 
     * @return Placement 位置信息
     */
    public Placement getPlacement() {
        return this.Placement;
    }

    /**
     * Set 位置信息
     * @param Placement 位置信息
     */
    public void setPlacement(Placement Placement) {
        this.Placement = Placement;
    }

    /**
     * Get 货币种类 
     * @return Currency 货币种类
     */
    public String getCurrency() {
        return this.Currency;
    }

    /**
     * Set 货币种类
     * @param Currency 货币种类
     */
    public void setCurrency(String Currency) {
        this.Currency = Currency;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamObj(map, prefix + "UpdateSpec.", this.UpdateSpec);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamObj(map, prefix + "Placement.", this.Placement);
        this.setParamSimple(map, prefix + "Currency", this.Currency);

    }
}

