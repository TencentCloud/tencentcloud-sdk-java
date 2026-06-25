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
package com.tencentcloudapi.cngw.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AIGWLLMQuotaLimit extends AbstractModel {

    /**
    * <p>该模型服务每分钟请求数上限，0 表示该维度不限</p>
    */
    @SerializedName("RPMLimit")
    @Expose
    private Long RPMLimit;

    /**
    * <p>该模型服务每分钟 Token 数上限，0 表示该维度不限</p>
    */
    @SerializedName("TPMLimit")
    @Expose
    private Long TPMLimit;

    /**
     * Get <p>该模型服务每分钟请求数上限，0 表示该维度不限</p> 
     * @return RPMLimit <p>该模型服务每分钟请求数上限，0 表示该维度不限</p>
     */
    public Long getRPMLimit() {
        return this.RPMLimit;
    }

    /**
     * Set <p>该模型服务每分钟请求数上限，0 表示该维度不限</p>
     * @param RPMLimit <p>该模型服务每分钟请求数上限，0 表示该维度不限</p>
     */
    public void setRPMLimit(Long RPMLimit) {
        this.RPMLimit = RPMLimit;
    }

    /**
     * Get <p>该模型服务每分钟 Token 数上限，0 表示该维度不限</p> 
     * @return TPMLimit <p>该模型服务每分钟 Token 数上限，0 表示该维度不限</p>
     */
    public Long getTPMLimit() {
        return this.TPMLimit;
    }

    /**
     * Set <p>该模型服务每分钟 Token 数上限，0 表示该维度不限</p>
     * @param TPMLimit <p>该模型服务每分钟 Token 数上限，0 表示该维度不限</p>
     */
    public void setTPMLimit(Long TPMLimit) {
        this.TPMLimit = TPMLimit;
    }

    public AIGWLLMQuotaLimit() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIGWLLMQuotaLimit(AIGWLLMQuotaLimit source) {
        if (source.RPMLimit != null) {
            this.RPMLimit = new Long(source.RPMLimit);
        }
        if (source.TPMLimit != null) {
            this.TPMLimit = new Long(source.TPMLimit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RPMLimit", this.RPMLimit);
        this.setParamSimple(map, prefix + "TPMLimit", this.TPMLimit);

    }
}

