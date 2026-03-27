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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquiryPriceRenewInstanceRequest extends AbstractModel {

    /**
    * <p>包年包月实例的购买时长。- 单位：月。- 取值范围 [1,2,3,4,5,6,7,8,9,10,11,12,24,36]。</p>
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * <p>指定实例 ID。例如：crs-xjhsdj****。请登录 <a href="https://console.cloud.tencent.com/redis">Redis 控制台</a>在实例列表复制包年包月实例 ID。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get <p>包年包月实例的购买时长。- 单位：月。- 取值范围 [1,2,3,4,5,6,7,8,9,10,11,12,24,36]。</p> 
     * @return Period <p>包年包月实例的购买时长。- 单位：月。- 取值范围 [1,2,3,4,5,6,7,8,9,10,11,12,24,36]。</p>
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set <p>包年包月实例的购买时长。- 单位：月。- 取值范围 [1,2,3,4,5,6,7,8,9,10,11,12,24,36]。</p>
     * @param Period <p>包年包月实例的购买时长。- 单位：月。- 取值范围 [1,2,3,4,5,6,7,8,9,10,11,12,24,36]。</p>
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get <p>指定实例 ID。例如：crs-xjhsdj****。请登录 <a href="https://console.cloud.tencent.com/redis">Redis 控制台</a>在实例列表复制包年包月实例 ID。</p> 
     * @return InstanceId <p>指定实例 ID。例如：crs-xjhsdj****。请登录 <a href="https://console.cloud.tencent.com/redis">Redis 控制台</a>在实例列表复制包年包月实例 ID。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>指定实例 ID。例如：crs-xjhsdj****。请登录 <a href="https://console.cloud.tencent.com/redis">Redis 控制台</a>在实例列表复制包年包月实例 ID。</p>
     * @param InstanceId <p>指定实例 ID。例如：crs-xjhsdj****。请登录 <a href="https://console.cloud.tencent.com/redis">Redis 控制台</a>在实例列表复制包年包月实例 ID。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    public InquiryPriceRenewInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquiryPriceRenewInstanceRequest(InquiryPriceRenewInstanceRequest source) {
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

