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
package com.tencentcloudapi.antiddos.v20250903.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DDoSUnblockQuota extends AbstractModel {

    /**
    * <p>解封次数配额总数。</p>
    */
    @SerializedName("TotalQuota")
    @Expose
    private Long TotalQuota;

    /**
    * <p>已使用的配额总数。</p>
    */
    @SerializedName("UsedQuota")
    @Expose
    private Long UsedQuota;

    /**
    * <p>配额生效的起始时间。</p>
    */
    @SerializedName("QuotaStartTime")
    @Expose
    private String QuotaStartTime;

    /**
    * <p>配额生效的结束时间。</p>
    */
    @SerializedName("QuotaEndTime")
    @Expose
    private String QuotaEndTime;

    /**
     * Get <p>解封次数配额总数。</p> 
     * @return TotalQuota <p>解封次数配额总数。</p>
     */
    public Long getTotalQuota() {
        return this.TotalQuota;
    }

    /**
     * Set <p>解封次数配额总数。</p>
     * @param TotalQuota <p>解封次数配额总数。</p>
     */
    public void setTotalQuota(Long TotalQuota) {
        this.TotalQuota = TotalQuota;
    }

    /**
     * Get <p>已使用的配额总数。</p> 
     * @return UsedQuota <p>已使用的配额总数。</p>
     */
    public Long getUsedQuota() {
        return this.UsedQuota;
    }

    /**
     * Set <p>已使用的配额总数。</p>
     * @param UsedQuota <p>已使用的配额总数。</p>
     */
    public void setUsedQuota(Long UsedQuota) {
        this.UsedQuota = UsedQuota;
    }

    /**
     * Get <p>配额生效的起始时间。</p> 
     * @return QuotaStartTime <p>配额生效的起始时间。</p>
     */
    public String getQuotaStartTime() {
        return this.QuotaStartTime;
    }

    /**
     * Set <p>配额生效的起始时间。</p>
     * @param QuotaStartTime <p>配额生效的起始时间。</p>
     */
    public void setQuotaStartTime(String QuotaStartTime) {
        this.QuotaStartTime = QuotaStartTime;
    }

    /**
     * Get <p>配额生效的结束时间。</p> 
     * @return QuotaEndTime <p>配额生效的结束时间。</p>
     */
    public String getQuotaEndTime() {
        return this.QuotaEndTime;
    }

    /**
     * Set <p>配额生效的结束时间。</p>
     * @param QuotaEndTime <p>配额生效的结束时间。</p>
     */
    public void setQuotaEndTime(String QuotaEndTime) {
        this.QuotaEndTime = QuotaEndTime;
    }

    public DDoSUnblockQuota() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DDoSUnblockQuota(DDoSUnblockQuota source) {
        if (source.TotalQuota != null) {
            this.TotalQuota = new Long(source.TotalQuota);
        }
        if (source.UsedQuota != null) {
            this.UsedQuota = new Long(source.UsedQuota);
        }
        if (source.QuotaStartTime != null) {
            this.QuotaStartTime = new String(source.QuotaStartTime);
        }
        if (source.QuotaEndTime != null) {
            this.QuotaEndTime = new String(source.QuotaEndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalQuota", this.TotalQuota);
        this.setParamSimple(map, prefix + "UsedQuota", this.UsedQuota);
        this.setParamSimple(map, prefix + "QuotaStartTime", this.QuotaStartTime);
        this.setParamSimple(map, prefix + "QuotaEndTime", this.QuotaEndTime);

    }
}

