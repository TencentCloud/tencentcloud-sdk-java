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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IPAddressInfo extends AbstractModel {

    /**
    * IP 地址
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * EIP AddressId
    */
    @SerializedName("AddressId")
    @Expose
    private String AddressId;

    /**
     * Get IP 地址 
     * @return Address IP 地址
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set IP 地址
     * @param Address IP 地址
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get EIP AddressId 
     * @return AddressId EIP AddressId
     */
    public String getAddressId() {
        return this.AddressId;
    }

    /**
     * Set EIP AddressId
     * @param AddressId EIP AddressId
     */
    public void setAddressId(String AddressId) {
        this.AddressId = AddressId;
    }

    public IPAddressInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IPAddressInfo(IPAddressInfo source) {
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.AddressId != null) {
            this.AddressId = new String(source.AddressId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "AddressId", this.AddressId);

    }
}

