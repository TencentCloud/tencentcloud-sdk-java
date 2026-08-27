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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HTTPServiceCacheSet extends AbstractModel {

    /**
    * <p>HTTPService 缓存配置列表。Rules 按数组顺序为优先级顺序，Rules[n-1] 优先级最高</p>
    */
    @SerializedName("Rules")
    @Expose
    private HTTPServiceCacheRule [] Rules;

    /**
     * Get <p>HTTPService 缓存配置列表。Rules 按数组顺序为优先级顺序，Rules[n-1] 优先级最高</p> 
     * @return Rules <p>HTTPService 缓存配置列表。Rules 按数组顺序为优先级顺序，Rules[n-1] 优先级最高</p>
     */
    public HTTPServiceCacheRule [] getRules() {
        return this.Rules;
    }

    /**
     * Set <p>HTTPService 缓存配置列表。Rules 按数组顺序为优先级顺序，Rules[n-1] 优先级最高</p>
     * @param Rules <p>HTTPService 缓存配置列表。Rules 按数组顺序为优先级顺序，Rules[n-1] 优先级最高</p>
     */
    public void setRules(HTTPServiceCacheRule [] Rules) {
        this.Rules = Rules;
    }

    public HTTPServiceCacheSet() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HTTPServiceCacheSet(HTTPServiceCacheSet source) {
        if (source.Rules != null) {
            this.Rules = new HTTPServiceCacheRule[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new HTTPServiceCacheRule(source.Rules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);

    }
}

