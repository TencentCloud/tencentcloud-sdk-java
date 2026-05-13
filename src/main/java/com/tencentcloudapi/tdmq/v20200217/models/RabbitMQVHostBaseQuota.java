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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RabbitMQVHostBaseQuota extends AbstractModel {

    /**
    * 单个 vhost 下允许的最大连接数
    */
    @SerializedName("MaxConnectionPerVhost")
    @Expose
    private Long MaxConnectionPerVhost;

    /**
    * 单个 vhost 下允许的最大交换机数
    */
    @SerializedName("MaxExchangePerVhost")
    @Expose
    private Long MaxExchangePerVhost;

    /**
    * 单个 vhost 下允许的最大队列数
    */
    @SerializedName("MaxQueuePerVhost")
    @Expose
    private Long MaxQueuePerVhost;

    /**
     * Get 单个 vhost 下允许的最大连接数 
     * @return MaxConnectionPerVhost 单个 vhost 下允许的最大连接数
     */
    public Long getMaxConnectionPerVhost() {
        return this.MaxConnectionPerVhost;
    }

    /**
     * Set 单个 vhost 下允许的最大连接数
     * @param MaxConnectionPerVhost 单个 vhost 下允许的最大连接数
     */
    public void setMaxConnectionPerVhost(Long MaxConnectionPerVhost) {
        this.MaxConnectionPerVhost = MaxConnectionPerVhost;
    }

    /**
     * Get 单个 vhost 下允许的最大交换机数 
     * @return MaxExchangePerVhost 单个 vhost 下允许的最大交换机数
     */
    public Long getMaxExchangePerVhost() {
        return this.MaxExchangePerVhost;
    }

    /**
     * Set 单个 vhost 下允许的最大交换机数
     * @param MaxExchangePerVhost 单个 vhost 下允许的最大交换机数
     */
    public void setMaxExchangePerVhost(Long MaxExchangePerVhost) {
        this.MaxExchangePerVhost = MaxExchangePerVhost;
    }

    /**
     * Get 单个 vhost 下允许的最大队列数 
     * @return MaxQueuePerVhost 单个 vhost 下允许的最大队列数
     */
    public Long getMaxQueuePerVhost() {
        return this.MaxQueuePerVhost;
    }

    /**
     * Set 单个 vhost 下允许的最大队列数
     * @param MaxQueuePerVhost 单个 vhost 下允许的最大队列数
     */
    public void setMaxQueuePerVhost(Long MaxQueuePerVhost) {
        this.MaxQueuePerVhost = MaxQueuePerVhost;
    }

    public RabbitMQVHostBaseQuota() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RabbitMQVHostBaseQuota(RabbitMQVHostBaseQuota source) {
        if (source.MaxConnectionPerVhost != null) {
            this.MaxConnectionPerVhost = new Long(source.MaxConnectionPerVhost);
        }
        if (source.MaxExchangePerVhost != null) {
            this.MaxExchangePerVhost = new Long(source.MaxExchangePerVhost);
        }
        if (source.MaxQueuePerVhost != null) {
            this.MaxQueuePerVhost = new Long(source.MaxQueuePerVhost);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaxConnectionPerVhost", this.MaxConnectionPerVhost);
        this.setParamSimple(map, prefix + "MaxExchangePerVhost", this.MaxExchangePerVhost);
        this.setParamSimple(map, prefix + "MaxQueuePerVhost", this.MaxQueuePerVhost);

    }
}

