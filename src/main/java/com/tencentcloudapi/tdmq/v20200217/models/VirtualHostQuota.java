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

public class VirtualHostQuota extends AbstractModel {

    /**
    * 允许创建最大vhost数
    */
    @SerializedName("MaxVirtualHost")
    @Expose
    private Long MaxVirtualHost;

    /**
    * 已创建vhost数
    */
    @SerializedName("UsedVirtualHost")
    @Expose
    private Long UsedVirtualHost;

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
    * 单个 vhost 下允许的最大队列机数
    */
    @SerializedName("MaxQueuePerVhost")
    @Expose
    private Long MaxQueuePerVhost;

    /**
     * Get 允许创建最大vhost数 
     * @return MaxVirtualHost 允许创建最大vhost数
     */
    public Long getMaxVirtualHost() {
        return this.MaxVirtualHost;
    }

    /**
     * Set 允许创建最大vhost数
     * @param MaxVirtualHost 允许创建最大vhost数
     */
    public void setMaxVirtualHost(Long MaxVirtualHost) {
        this.MaxVirtualHost = MaxVirtualHost;
    }

    /**
     * Get 已创建vhost数 
     * @return UsedVirtualHost 已创建vhost数
     */
    public Long getUsedVirtualHost() {
        return this.UsedVirtualHost;
    }

    /**
     * Set 已创建vhost数
     * @param UsedVirtualHost 已创建vhost数
     */
    public void setUsedVirtualHost(Long UsedVirtualHost) {
        this.UsedVirtualHost = UsedVirtualHost;
    }

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
     * Get 单个 vhost 下允许的最大队列机数 
     * @return MaxQueuePerVhost 单个 vhost 下允许的最大队列机数
     */
    public Long getMaxQueuePerVhost() {
        return this.MaxQueuePerVhost;
    }

    /**
     * Set 单个 vhost 下允许的最大队列机数
     * @param MaxQueuePerVhost 单个 vhost 下允许的最大队列机数
     */
    public void setMaxQueuePerVhost(Long MaxQueuePerVhost) {
        this.MaxQueuePerVhost = MaxQueuePerVhost;
    }

    public VirtualHostQuota() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VirtualHostQuota(VirtualHostQuota source) {
        if (source.MaxVirtualHost != null) {
            this.MaxVirtualHost = new Long(source.MaxVirtualHost);
        }
        if (source.UsedVirtualHost != null) {
            this.UsedVirtualHost = new Long(source.UsedVirtualHost);
        }
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
        this.setParamSimple(map, prefix + "MaxVirtualHost", this.MaxVirtualHost);
        this.setParamSimple(map, prefix + "UsedVirtualHost", this.UsedVirtualHost);
        this.setParamSimple(map, prefix + "MaxConnectionPerVhost", this.MaxConnectionPerVhost);
        this.setParamSimple(map, prefix + "MaxExchangePerVhost", this.MaxExchangePerVhost);
        this.setParamSimple(map, prefix + "MaxQueuePerVhost", this.MaxQueuePerVhost);

    }
}

