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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PostPaidQuota extends AbstractModel{

    /**
    * 累计已使用配额
    */
    @SerializedName("UsedQuota")
    @Expose
    private Long UsedQuota;

    /**
    * 剩余配额
    */
    @SerializedName("RemainingQuota")
    @Expose
    private Long RemainingQuota;

    /**
    * 总配额
    */
    @SerializedName("TotalQuota")
    @Expose
    private Long TotalQuota;

    /**
    * 可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
     * Get 累计已使用配额 
     * @return UsedQuota 累计已使用配额
     */
    public Long getUsedQuota() {
        return this.UsedQuota;
    }

    /**
     * Set 累计已使用配额
     * @param UsedQuota 累计已使用配额
     */
    public void setUsedQuota(Long UsedQuota) {
        this.UsedQuota = UsedQuota;
    }

    /**
     * Get 剩余配额 
     * @return RemainingQuota 剩余配额
     */
    public Long getRemainingQuota() {
        return this.RemainingQuota;
    }

    /**
     * Set 剩余配额
     * @param RemainingQuota 剩余配额
     */
    public void setRemainingQuota(Long RemainingQuota) {
        this.RemainingQuota = RemainingQuota;
    }

    /**
     * Get 总配额 
     * @return TotalQuota 总配额
     */
    public Long getTotalQuota() {
        return this.TotalQuota;
    }

    /**
     * Set 总配额
     * @param TotalQuota 总配额
     */
    public void setTotalQuota(Long TotalQuota) {
        this.TotalQuota = TotalQuota;
    }

    /**
     * Get 可用区 
     * @return Zone 可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区
     * @param Zone 可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    public PostPaidQuota() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PostPaidQuota(PostPaidQuota source) {
        if (source.UsedQuota != null) {
            this.UsedQuota = new Long(source.UsedQuota);
        }
        if (source.RemainingQuota != null) {
            this.RemainingQuota = new Long(source.RemainingQuota);
        }
        if (source.TotalQuota != null) {
            this.TotalQuota = new Long(source.TotalQuota);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UsedQuota", this.UsedQuota);
        this.setParamSimple(map, prefix + "RemainingQuota", this.RemainingQuota);
        this.setParamSimple(map, prefix + "TotalQuota", this.TotalQuota);
        this.setParamSimple(map, prefix + "Zone", this.Zone);

    }
}

