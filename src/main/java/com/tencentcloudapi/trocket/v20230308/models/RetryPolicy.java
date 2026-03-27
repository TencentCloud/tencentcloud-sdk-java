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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RetryPolicy extends AbstractModel {

    /**
    * 重试策略类型，枚举值如下：

- EXPONENTIAL：固定间隔
- CUSTOMIZED：阶梯退避
    */
    @SerializedName("PolicyType")
    @Expose
    private String PolicyType;

    /**
    * 固定重试间隔，仅在重试策略为固定间隔时生效
    */
    @SerializedName("RetryInterval")
    @Expose
    private Long RetryInterval;

    /**
     * Get 重试策略类型，枚举值如下：

- EXPONENTIAL：固定间隔
- CUSTOMIZED：阶梯退避 
     * @return PolicyType 重试策略类型，枚举值如下：

- EXPONENTIAL：固定间隔
- CUSTOMIZED：阶梯退避
     */
    public String getPolicyType() {
        return this.PolicyType;
    }

    /**
     * Set 重试策略类型，枚举值如下：

- EXPONENTIAL：固定间隔
- CUSTOMIZED：阶梯退避
     * @param PolicyType 重试策略类型，枚举值如下：

- EXPONENTIAL：固定间隔
- CUSTOMIZED：阶梯退避
     */
    public void setPolicyType(String PolicyType) {
        this.PolicyType = PolicyType;
    }

    /**
     * Get 固定重试间隔，仅在重试策略为固定间隔时生效 
     * @return RetryInterval 固定重试间隔，仅在重试策略为固定间隔时生效
     */
    public Long getRetryInterval() {
        return this.RetryInterval;
    }

    /**
     * Set 固定重试间隔，仅在重试策略为固定间隔时生效
     * @param RetryInterval 固定重试间隔，仅在重试策略为固定间隔时生效
     */
    public void setRetryInterval(Long RetryInterval) {
        this.RetryInterval = RetryInterval;
    }

    public RetryPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RetryPolicy(RetryPolicy source) {
        if (source.PolicyType != null) {
            this.PolicyType = new String(source.PolicyType);
        }
        if (source.RetryInterval != null) {
            this.RetryInterval = new Long(source.RetryInterval);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyType", this.PolicyType);
        this.setParamSimple(map, prefix + "RetryInterval", this.RetryInterval);

    }
}

