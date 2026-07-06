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
package com.tencentcloudapi.tdai.v20250717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RecoverMemoryPlusSpaceRequest extends AbstractModel {

    /**
    * <p>指定需要恢复的 Memory 实例 ID 列表。</p>
    */
    @SerializedName("SpaceIds")
    @Expose
    private String [] SpaceIds;

    /**
    * <p>包年包月续费周期</p><p>单位：月</p>
    */
    @SerializedName("PayPeriod")
    @Expose
    private Long PayPeriod;

    /**
     * Get <p>指定需要恢复的 Memory 实例 ID 列表。</p> 
     * @return SpaceIds <p>指定需要恢复的 Memory 实例 ID 列表。</p>
     */
    public String [] getSpaceIds() {
        return this.SpaceIds;
    }

    /**
     * Set <p>指定需要恢复的 Memory 实例 ID 列表。</p>
     * @param SpaceIds <p>指定需要恢复的 Memory 实例 ID 列表。</p>
     */
    public void setSpaceIds(String [] SpaceIds) {
        this.SpaceIds = SpaceIds;
    }

    /**
     * Get <p>包年包月续费周期</p><p>单位：月</p> 
     * @return PayPeriod <p>包年包月续费周期</p><p>单位：月</p>
     */
    public Long getPayPeriod() {
        return this.PayPeriod;
    }

    /**
     * Set <p>包年包月续费周期</p><p>单位：月</p>
     * @param PayPeriod <p>包年包月续费周期</p><p>单位：月</p>
     */
    public void setPayPeriod(Long PayPeriod) {
        this.PayPeriod = PayPeriod;
    }

    public RecoverMemoryPlusSpaceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecoverMemoryPlusSpaceRequest(RecoverMemoryPlusSpaceRequest source) {
        if (source.SpaceIds != null) {
            this.SpaceIds = new String[source.SpaceIds.length];
            for (int i = 0; i < source.SpaceIds.length; i++) {
                this.SpaceIds[i] = new String(source.SpaceIds[i]);
            }
        }
        if (source.PayPeriod != null) {
            this.PayPeriod = new Long(source.PayPeriod);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "SpaceIds.", this.SpaceIds);
        this.setParamSimple(map, prefix + "PayPeriod", this.PayPeriod);

    }
}

