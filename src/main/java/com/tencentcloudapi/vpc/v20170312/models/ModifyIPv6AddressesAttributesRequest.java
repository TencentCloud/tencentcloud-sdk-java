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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyIPv6AddressesAttributesRequest extends AbstractModel {

    /**
    * 弹性公网IPv6唯一ID列表。
    */
    @SerializedName("IPv6AddressIds")
    @Expose
    private String [] IPv6AddressIds;

    /**
    * 弹性公网IPv6地址名称
    */
    @SerializedName("IPv6AddressName")
    @Expose
    private String IPv6AddressName;

    /**
     * Get 弹性公网IPv6唯一ID列表。 
     * @return IPv6AddressIds 弹性公网IPv6唯一ID列表。
     */
    public String [] getIPv6AddressIds() {
        return this.IPv6AddressIds;
    }

    /**
     * Set 弹性公网IPv6唯一ID列表。
     * @param IPv6AddressIds 弹性公网IPv6唯一ID列表。
     */
    public void setIPv6AddressIds(String [] IPv6AddressIds) {
        this.IPv6AddressIds = IPv6AddressIds;
    }

    /**
     * Get 弹性公网IPv6地址名称 
     * @return IPv6AddressName 弹性公网IPv6地址名称
     */
    public String getIPv6AddressName() {
        return this.IPv6AddressName;
    }

    /**
     * Set 弹性公网IPv6地址名称
     * @param IPv6AddressName 弹性公网IPv6地址名称
     */
    public void setIPv6AddressName(String IPv6AddressName) {
        this.IPv6AddressName = IPv6AddressName;
    }

    public ModifyIPv6AddressesAttributesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyIPv6AddressesAttributesRequest(ModifyIPv6AddressesAttributesRequest source) {
        if (source.IPv6AddressIds != null) {
            this.IPv6AddressIds = new String[source.IPv6AddressIds.length];
            for (int i = 0; i < source.IPv6AddressIds.length; i++) {
                this.IPv6AddressIds[i] = new String(source.IPv6AddressIds[i]);
            }
        }
        if (source.IPv6AddressName != null) {
            this.IPv6AddressName = new String(source.IPv6AddressName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "IPv6AddressIds.", this.IPv6AddressIds);
        this.setParamSimple(map, prefix + "IPv6AddressName", this.IPv6AddressName);

    }
}

