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
package com.tencentcloudapi.cdwch.v20200915.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Charge extends AbstractModel{

    /**
    * 计费类型，“PREPAID” 预付费，“POSTPAID_BY_HOUR” 后付费
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * PREPAID需要传递，是否自动续费，1表示自动续费开启
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * 预付费需要传递，计费时间长度，多少个月
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

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
     * Get PREPAID需要传递，是否自动续费，1表示自动续费开启 
     * @return RenewFlag PREPAID需要传递，是否自动续费，1表示自动续费开启
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set PREPAID需要传递，是否自动续费，1表示自动续费开启
     * @param RenewFlag PREPAID需要传递，是否自动续费，1表示自动续费开启
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get 预付费需要传递，计费时间长度，多少个月 
     * @return TimeSpan 预付费需要传递，计费时间长度，多少个月
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set 预付费需要传递，计费时间长度，多少个月
     * @param TimeSpan 预付费需要传递，计费时间长度，多少个月
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    public Charge() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Charge(Charge source) {
        if (source.ChargeType != null) {
            this.ChargeType = new String(source.ChargeType);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Long(source.RenewFlag);
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);

    }
}

