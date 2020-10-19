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
package com.tencentcloudapi.domain.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RenewDomainBatchRequest extends AbstractModel{

    /**
    * 域名续费的年限。
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 批量续费的域名。
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
    * 付费模式 0手动在线付费，1使用余额付费。
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
     * Get 域名续费的年限。 
     * @return Period 域名续费的年限。
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 域名续费的年限。
     * @param Period 域名续费的年限。
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 批量续费的域名。 
     * @return Domains 批量续费的域名。
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set 批量续费的域名。
     * @param Domains 批量续费的域名。
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get 付费模式 0手动在线付费，1使用余额付费。 
     * @return PayMode 付费模式 0手动在线付费，1使用余额付费。
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 付费模式 0手动在线付费，1使用余额付费。
     * @param PayMode 付费模式 0手动在线付费，1使用余额付费。
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);

    }
}

