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
package com.tencentcloudapi.eb.v20210416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RetryPolicy extends AbstractModel{

    /**
    * 重试间隔 单位:秒
    */
    @SerializedName("RetryInterval")
    @Expose
    private Long RetryInterval;

    /**
    * 最大重试次数
    */
    @SerializedName("MaxRetryAttempts")
    @Expose
    private Long MaxRetryAttempts;

    /**
     * Get 重试间隔 单位:秒 
     * @return RetryInterval 重试间隔 单位:秒
     */
    public Long getRetryInterval() {
        return this.RetryInterval;
    }

    /**
     * Set 重试间隔 单位:秒
     * @param RetryInterval 重试间隔 单位:秒
     */
    public void setRetryInterval(Long RetryInterval) {
        this.RetryInterval = RetryInterval;
    }

    /**
     * Get 最大重试次数 
     * @return MaxRetryAttempts 最大重试次数
     */
    public Long getMaxRetryAttempts() {
        return this.MaxRetryAttempts;
    }

    /**
     * Set 最大重试次数
     * @param MaxRetryAttempts 最大重试次数
     */
    public void setMaxRetryAttempts(Long MaxRetryAttempts) {
        this.MaxRetryAttempts = MaxRetryAttempts;
    }

    public RetryPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RetryPolicy(RetryPolicy source) {
        if (source.RetryInterval != null) {
            this.RetryInterval = new Long(source.RetryInterval);
        }
        if (source.MaxRetryAttempts != null) {
            this.MaxRetryAttempts = new Long(source.MaxRetryAttempts);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RetryInterval", this.RetryInterval);
        this.setParamSimple(map, prefix + "MaxRetryAttempts", this.MaxRetryAttempts);

    }
}

