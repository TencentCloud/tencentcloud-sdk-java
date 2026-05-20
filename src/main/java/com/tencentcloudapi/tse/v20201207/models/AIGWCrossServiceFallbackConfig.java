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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AIGWCrossServiceFallbackConfig extends AbstractModel {

    /**
    * <p>触发条件</p><p>枚举值：</p><ul><li>ServiceUnavailable： 服务不可用</li><li>ConnectionTimeout： 连接超时</li><li>RateLimited： 限流</li></ul>
    */
    @SerializedName("TriggerConditions")
    @Expose
    private String [] TriggerConditions;

    /**
    * <p>fallback 服务链</p>
    */
    @SerializedName("FallbackServiceChain")
    @Expose
    private AIGWFallbackServiceItem [] FallbackServiceChain;

    /**
     * Get <p>触发条件</p><p>枚举值：</p><ul><li>ServiceUnavailable： 服务不可用</li><li>ConnectionTimeout： 连接超时</li><li>RateLimited： 限流</li></ul> 
     * @return TriggerConditions <p>触发条件</p><p>枚举值：</p><ul><li>ServiceUnavailable： 服务不可用</li><li>ConnectionTimeout： 连接超时</li><li>RateLimited： 限流</li></ul>
     */
    public String [] getTriggerConditions() {
        return this.TriggerConditions;
    }

    /**
     * Set <p>触发条件</p><p>枚举值：</p><ul><li>ServiceUnavailable： 服务不可用</li><li>ConnectionTimeout： 连接超时</li><li>RateLimited： 限流</li></ul>
     * @param TriggerConditions <p>触发条件</p><p>枚举值：</p><ul><li>ServiceUnavailable： 服务不可用</li><li>ConnectionTimeout： 连接超时</li><li>RateLimited： 限流</li></ul>
     */
    public void setTriggerConditions(String [] TriggerConditions) {
        this.TriggerConditions = TriggerConditions;
    }

    /**
     * Get <p>fallback 服务链</p> 
     * @return FallbackServiceChain <p>fallback 服务链</p>
     */
    public AIGWFallbackServiceItem [] getFallbackServiceChain() {
        return this.FallbackServiceChain;
    }

    /**
     * Set <p>fallback 服务链</p>
     * @param FallbackServiceChain <p>fallback 服务链</p>
     */
    public void setFallbackServiceChain(AIGWFallbackServiceItem [] FallbackServiceChain) {
        this.FallbackServiceChain = FallbackServiceChain;
    }

    public AIGWCrossServiceFallbackConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIGWCrossServiceFallbackConfig(AIGWCrossServiceFallbackConfig source) {
        if (source.TriggerConditions != null) {
            this.TriggerConditions = new String[source.TriggerConditions.length];
            for (int i = 0; i < source.TriggerConditions.length; i++) {
                this.TriggerConditions[i] = new String(source.TriggerConditions[i]);
            }
        }
        if (source.FallbackServiceChain != null) {
            this.FallbackServiceChain = new AIGWFallbackServiceItem[source.FallbackServiceChain.length];
            for (int i = 0; i < source.FallbackServiceChain.length; i++) {
                this.FallbackServiceChain[i] = new AIGWFallbackServiceItem(source.FallbackServiceChain[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "TriggerConditions.", this.TriggerConditions);
        this.setParamArrayObj(map, prefix + "FallbackServiceChain.", this.FallbackServiceChain);

    }
}

