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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleChangeItem extends AbstractModel {

    /**
    * 原始sequence 值
    */
    @SerializedName("OrderIndex")
    @Expose
    private Long OrderIndex;

    /**
    * 新的sequence 值
    */
    @SerializedName("NewOrderIndex")
    @Expose
    private Long NewOrderIndex;

    /**
    * Ip版本，0：IPv4，1：IPv6，默认为IPv4
    */
    @SerializedName("IpVersion")
    @Expose
    private Long IpVersion;

    /**
     * Get 原始sequence 值 
     * @return OrderIndex 原始sequence 值
     */
    public Long getOrderIndex() {
        return this.OrderIndex;
    }

    /**
     * Set 原始sequence 值
     * @param OrderIndex 原始sequence 值
     */
    public void setOrderIndex(Long OrderIndex) {
        this.OrderIndex = OrderIndex;
    }

    /**
     * Get 新的sequence 值 
     * @return NewOrderIndex 新的sequence 值
     */
    public Long getNewOrderIndex() {
        return this.NewOrderIndex;
    }

    /**
     * Set 新的sequence 值
     * @param NewOrderIndex 新的sequence 值
     */
    public void setNewOrderIndex(Long NewOrderIndex) {
        this.NewOrderIndex = NewOrderIndex;
    }

    /**
     * Get Ip版本，0：IPv4，1：IPv6，默认为IPv4 
     * @return IpVersion Ip版本，0：IPv4，1：IPv6，默认为IPv4
     */
    public Long getIpVersion() {
        return this.IpVersion;
    }

    /**
     * Set Ip版本，0：IPv4，1：IPv6，默认为IPv4
     * @param IpVersion Ip版本，0：IPv4，1：IPv6，默认为IPv4
     */
    public void setIpVersion(Long IpVersion) {
        this.IpVersion = IpVersion;
    }

    public RuleChangeItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleChangeItem(RuleChangeItem source) {
        if (source.OrderIndex != null) {
            this.OrderIndex = new Long(source.OrderIndex);
        }
        if (source.NewOrderIndex != null) {
            this.NewOrderIndex = new Long(source.NewOrderIndex);
        }
        if (source.IpVersion != null) {
            this.IpVersion = new Long(source.IpVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrderIndex", this.OrderIndex);
        this.setParamSimple(map, prefix + "NewOrderIndex", this.NewOrderIndex);
        this.setParamSimple(map, prefix + "IpVersion", this.IpVersion);

    }
}

