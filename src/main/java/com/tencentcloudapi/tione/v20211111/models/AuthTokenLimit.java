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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuthTokenLimit extends AbstractModel {

    /**
    * 限频策略：PerMinute 每分钟限频；PerDay 每日限频
    */
    @SerializedName("Strategy")
    @Expose
    private String Strategy;

    /**
    * 上限值
    */
    @SerializedName("Max")
    @Expose
    private Long Max;

    /**
     * Get 限频策略：PerMinute 每分钟限频；PerDay 每日限频 
     * @return Strategy 限频策略：PerMinute 每分钟限频；PerDay 每日限频
     */
    public String getStrategy() {
        return this.Strategy;
    }

    /**
     * Set 限频策略：PerMinute 每分钟限频；PerDay 每日限频
     * @param Strategy 限频策略：PerMinute 每分钟限频；PerDay 每日限频
     */
    public void setStrategy(String Strategy) {
        this.Strategy = Strategy;
    }

    /**
     * Get 上限值 
     * @return Max 上限值
     */
    public Long getMax() {
        return this.Max;
    }

    /**
     * Set 上限值
     * @param Max 上限值
     */
    public void setMax(Long Max) {
        this.Max = Max;
    }

    public AuthTokenLimit() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuthTokenLimit(AuthTokenLimit source) {
        if (source.Strategy != null) {
            this.Strategy = new String(source.Strategy);
        }
        if (source.Max != null) {
            this.Max = new Long(source.Max);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Strategy", this.Strategy);
        this.setParamSimple(map, prefix + "Max", this.Max);

    }
}

