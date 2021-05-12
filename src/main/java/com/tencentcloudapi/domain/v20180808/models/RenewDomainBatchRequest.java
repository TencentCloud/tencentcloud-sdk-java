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
    * 自动续费开关。有三个可选值：
0 表示关闭，不自动续费
1 表示开启，将自动续费
2 表示不处理，保留域名原有状态（默认值）
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

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
     * Get 自动续费开关。有三个可选值：
0 表示关闭，不自动续费
1 表示开启，将自动续费
2 表示不处理，保留域名原有状态（默认值） 
     * @return AutoRenewFlag 自动续费开关。有三个可选值：
0 表示关闭，不自动续费
1 表示开启，将自动续费
2 表示不处理，保留域名原有状态（默认值）
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 自动续费开关。有三个可选值：
0 表示关闭，不自动续费
1 表示开启，将自动续费
2 表示不处理，保留域名原有状态（默认值）
     * @param AutoRenewFlag 自动续费开关。有三个可选值：
0 表示关闭，不自动续费
1 表示开启，将自动续费
2 表示不处理，保留域名原有状态（默认值）
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    public RenewDomainBatchRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RenewDomainBatchRequest(RenewDomainBatchRequest source) {
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.Domains != null) {
            this.Domains = new String[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new String(source.Domains[i]);
            }
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);

    }
}

