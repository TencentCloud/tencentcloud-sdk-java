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

public class CloseSSLRequest extends AbstractModel {

    /**
    * <p>实例 ID。请登录<a href="https://console.cloud.tencent.com/redis">Redis控制台</a>在实例列表复制实例 ID。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>SSL地址类型。</p><p>枚举值：</p><ul><li>0：  不限。</li><li>1： 内网IPv4。</li><li>2：  内网IPv6。</li><li>3： 外网。</li><li>-1： 未指定。</li></ul><p>默认值：0</p>
    */
    @SerializedName("AddressType")
    @Expose
    private Long AddressType;

    /**
     * Get <p>实例 ID。请登录<a href="https://console.cloud.tencent.com/redis">Redis控制台</a>在实例列表复制实例 ID。</p> 
     * @return InstanceId <p>实例 ID。请登录<a href="https://console.cloud.tencent.com/redis">Redis控制台</a>在实例列表复制实例 ID。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例 ID。请登录<a href="https://console.cloud.tencent.com/redis">Redis控制台</a>在实例列表复制实例 ID。</p>
     * @param InstanceId <p>实例 ID。请登录<a href="https://console.cloud.tencent.com/redis">Redis控制台</a>在实例列表复制实例 ID。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>SSL地址类型。</p><p>枚举值：</p><ul><li>0：  不限。</li><li>1： 内网IPv4。</li><li>2：  内网IPv6。</li><li>3： 外网。</li><li>-1： 未指定。</li></ul><p>默认值：0</p> 
     * @return AddressType <p>SSL地址类型。</p><p>枚举值：</p><ul><li>0：  不限。</li><li>1： 内网IPv4。</li><li>2：  内网IPv6。</li><li>3： 外网。</li><li>-1： 未指定。</li></ul><p>默认值：0</p>
     */
    public Long getAddressType() {
        return this.AddressType;
    }

    /**
     * Set <p>SSL地址类型。</p><p>枚举值：</p><ul><li>0：  不限。</li><li>1： 内网IPv4。</li><li>2：  内网IPv6。</li><li>3： 外网。</li><li>-1： 未指定。</li></ul><p>默认值：0</p>
     * @param AddressType <p>SSL地址类型。</p><p>枚举值：</p><ul><li>0：  不限。</li><li>1： 内网IPv4。</li><li>2：  内网IPv6。</li><li>3： 外网。</li><li>-1： 未指定。</li></ul><p>默认值：0</p>
     */
    public void setAddressType(Long AddressType) {
        this.AddressType = AddressType;
    }

    public CloseSSLRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloseSSLRequest(CloseSSLRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.AddressType != null) {
            this.AddressType = new Long(source.AddressType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "AddressType", this.AddressType);

    }
}

