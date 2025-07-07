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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChargeProperties extends AbstractModel {

    /**
    * 计费类型，“PREPAID” 预付费，“POSTPAID_BY_HOUR” 后付费
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * 是否自动续费，1表示自动续费开启
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * 计费时间长度
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * 计费时间单位，“m”表示月等
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
     * Get 计费类型，“PREPAID” 预付费，“POSTPAID_BY_HOUR” 后付费 
     * @return ChargeType 计费类型，“PREPAID” 预付费，“POSTPAID_BY_HOUR” 后付费
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set 计费类型，“PREPAID” 预付费，“POSTPAID_BY_HOUR” 后付费
     * @param ChargeType 计费类型，“PREPAID” 预付费，“POSTPAID_BY_HOUR” 后付费
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get 是否自动续费，1表示自动续费开启 
     * @return RenewFlag 是否自动续费，1表示自动续费开启
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set 是否自动续费，1表示自动续费开启
     * @param RenewFlag 是否自动续费，1表示自动续费开启
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get 计费时间长度 
     * @return TimeSpan 计费时间长度
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set 计费时间长度
     * @param TimeSpan 计费时间长度
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get 计费时间单位，“m”表示月等 
     * @return TimeUnit 计费时间单位，“m”表示月等
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set 计费时间单位，“m”表示月等
     * @param TimeUnit 计费时间单位，“m”表示月等
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    public ChargeProperties() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChargeProperties(ChargeProperties source) {
        if (source.ChargeType != null) {
            this.ChargeType = new String(source.ChargeType);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Long(source.RenewFlag);
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);

    }
}

