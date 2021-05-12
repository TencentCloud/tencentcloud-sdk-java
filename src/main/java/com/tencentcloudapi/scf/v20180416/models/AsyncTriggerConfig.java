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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AsyncTriggerConfig extends AbstractModel{

    /**
    * 用户错误的异步重试重试配置
    */
    @SerializedName("RetryConfig")
    @Expose
    private RetryConfig [] RetryConfig;

    /**
    * 消息保留时间
    */
    @SerializedName("MsgTTL")
    @Expose
    private Long MsgTTL;

    /**
     * Get 用户错误的异步重试重试配置 
     * @return RetryConfig 用户错误的异步重试重试配置
     */
    public RetryConfig [] getRetryConfig() {
        return this.RetryConfig;
    }

    /**
     * Set 用户错误的异步重试重试配置
     * @param RetryConfig 用户错误的异步重试重试配置
     */
    public void setRetryConfig(RetryConfig [] RetryConfig) {
        this.RetryConfig = RetryConfig;
    }

    /**
     * Get 消息保留时间 
     * @return MsgTTL 消息保留时间
     */
    public Long getMsgTTL() {
        return this.MsgTTL;
    }

    /**
     * Set 消息保留时间
     * @param MsgTTL 消息保留时间
     */
    public void setMsgTTL(Long MsgTTL) {
        this.MsgTTL = MsgTTL;
    }

    public AsyncTriggerConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AsyncTriggerConfig(AsyncTriggerConfig source) {
        if (source.RetryConfig != null) {
            this.RetryConfig = new RetryConfig[source.RetryConfig.length];
            for (int i = 0; i < source.RetryConfig.length; i++) {
                this.RetryConfig[i] = new RetryConfig(source.RetryConfig[i]);
            }
        }
        if (source.MsgTTL != null) {
            this.MsgTTL = new Long(source.MsgTTL);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "RetryConfig.", this.RetryConfig);
        this.setParamSimple(map, prefix + "MsgTTL", this.MsgTTL);

    }
}

