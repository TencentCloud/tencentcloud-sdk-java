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
package com.tencentcloudapi.cetcd.v20220325.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChargePrepaidConfig extends AbstractModel {

    /**
    * 预付费购买周期，单位：月
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 预付费自动续费设置：
NOTIFY_AND_MANUAL_RENEW：表示默认状态(用户未设置，即初始状态)， NOTIFY_AND_AUTO_RENEW：表示自动续费，DISABLE_NOTIFY_AND_MANUAL_RENEW：表示明确不自动续费(用户设置)
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
     * Get 预付费购买周期，单位：月 
     * @return Period 预付费购买周期，单位：月
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 预付费购买周期，单位：月
     * @param Period 预付费购买周期，单位：月
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 预付费自动续费设置：
NOTIFY_AND_MANUAL_RENEW：表示默认状态(用户未设置，即初始状态)， NOTIFY_AND_AUTO_RENEW：表示自动续费，DISABLE_NOTIFY_AND_MANUAL_RENEW：表示明确不自动续费(用户设置) 
     * @return RenewFlag 预付费自动续费设置：
NOTIFY_AND_MANUAL_RENEW：表示默认状态(用户未设置，即初始状态)， NOTIFY_AND_AUTO_RENEW：表示自动续费，DISABLE_NOTIFY_AND_MANUAL_RENEW：表示明确不自动续费(用户设置)
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set 预付费自动续费设置：
NOTIFY_AND_MANUAL_RENEW：表示默认状态(用户未设置，即初始状态)， NOTIFY_AND_AUTO_RENEW：表示自动续费，DISABLE_NOTIFY_AND_MANUAL_RENEW：表示明确不自动续费(用户设置)
     * @param RenewFlag 预付费自动续费设置：
NOTIFY_AND_MANUAL_RENEW：表示默认状态(用户未设置，即初始状态)， NOTIFY_AND_AUTO_RENEW：表示自动续费，DISABLE_NOTIFY_AND_MANUAL_RENEW：表示明确不自动续费(用户设置)
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    public ChargePrepaidConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChargePrepaidConfig(ChargePrepaidConfig source) {
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new String(source.RenewFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);

    }
}

