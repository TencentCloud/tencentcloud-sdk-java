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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EipQuota extends AbstractModel {

    /**
    * 配额名称，取值范围：
TOTAL_EIP_QUOTA：用户当前地域下EIP的配额数；
DAILY_EIP_APPLY：用户当前地域下今日申购次数；
DAILY_PUBLIC_IP_ASSIGN：用户当前地域下，重新分配公网 IP次数。
    */
    @SerializedName("QuotaId")
    @Expose
    private String QuotaId;

    /**
    * 当前数量
    */
    @SerializedName("QuotaCurrent")
    @Expose
    private Long QuotaCurrent;

    /**
    * 配额数量
    */
    @SerializedName("QuotaLimit")
    @Expose
    private Long QuotaLimit;

    /**
     * Get 配额名称，取值范围：
TOTAL_EIP_QUOTA：用户当前地域下EIP的配额数；
DAILY_EIP_APPLY：用户当前地域下今日申购次数；
DAILY_PUBLIC_IP_ASSIGN：用户当前地域下，重新分配公网 IP次数。 
     * @return QuotaId 配额名称，取值范围：
TOTAL_EIP_QUOTA：用户当前地域下EIP的配额数；
DAILY_EIP_APPLY：用户当前地域下今日申购次数；
DAILY_PUBLIC_IP_ASSIGN：用户当前地域下，重新分配公网 IP次数。
     */
    public String getQuotaId() {
        return this.QuotaId;
    }

    /**
     * Set 配额名称，取值范围：
TOTAL_EIP_QUOTA：用户当前地域下EIP的配额数；
DAILY_EIP_APPLY：用户当前地域下今日申购次数；
DAILY_PUBLIC_IP_ASSIGN：用户当前地域下，重新分配公网 IP次数。
     * @param QuotaId 配额名称，取值范围：
TOTAL_EIP_QUOTA：用户当前地域下EIP的配额数；
DAILY_EIP_APPLY：用户当前地域下今日申购次数；
DAILY_PUBLIC_IP_ASSIGN：用户当前地域下，重新分配公网 IP次数。
     */
    public void setQuotaId(String QuotaId) {
        this.QuotaId = QuotaId;
    }

    /**
     * Get 当前数量 
     * @return QuotaCurrent 当前数量
     */
    public Long getQuotaCurrent() {
        return this.QuotaCurrent;
    }

    /**
     * Set 当前数量
     * @param QuotaCurrent 当前数量
     */
    public void setQuotaCurrent(Long QuotaCurrent) {
        this.QuotaCurrent = QuotaCurrent;
    }

    /**
     * Get 配额数量 
     * @return QuotaLimit 配额数量
     */
    public Long getQuotaLimit() {
        return this.QuotaLimit;
    }

    /**
     * Set 配额数量
     * @param QuotaLimit 配额数量
     */
    public void setQuotaLimit(Long QuotaLimit) {
        this.QuotaLimit = QuotaLimit;
    }

    public EipQuota() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EipQuota(EipQuota source) {
        if (source.QuotaId != null) {
            this.QuotaId = new String(source.QuotaId);
        }
        if (source.QuotaCurrent != null) {
            this.QuotaCurrent = new Long(source.QuotaCurrent);
        }
        if (source.QuotaLimit != null) {
            this.QuotaLimit = new Long(source.QuotaLimit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "QuotaId", this.QuotaId);
        this.setParamSimple(map, prefix + "QuotaCurrent", this.QuotaCurrent);
        this.setParamSimple(map, prefix + "QuotaLimit", this.QuotaLimit);

    }
}

