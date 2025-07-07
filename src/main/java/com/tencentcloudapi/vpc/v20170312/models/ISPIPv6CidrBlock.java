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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ISPIPv6CidrBlock extends AbstractModel {

    /**
    * IPv6 CIdr Block
    */
    @SerializedName("IPv6CidrBlock")
    @Expose
    private String IPv6CidrBlock;

    /**
    * 网络运营商类型 取值范围:'BGP'-默认, 'CMCC'-中国移动, 'CTCC'-中国电信, 'CUCC'-中国联调
    */
    @SerializedName("ISPType")
    @Expose
    private String ISPType;

    /**
    * IPv6 Cidr 的类型：`GUA`(全球单播地址), `ULA`(唯一本地地址)
    */
    @SerializedName("AddressType")
    @Expose
    private String AddressType;

    /**
     * Get IPv6 CIdr Block 
     * @return IPv6CidrBlock IPv6 CIdr Block
     */
    public String getIPv6CidrBlock() {
        return this.IPv6CidrBlock;
    }

    /**
     * Set IPv6 CIdr Block
     * @param IPv6CidrBlock IPv6 CIdr Block
     */
    public void setIPv6CidrBlock(String IPv6CidrBlock) {
        this.IPv6CidrBlock = IPv6CidrBlock;
    }

    /**
     * Get 网络运营商类型 取值范围:'BGP'-默认, 'CMCC'-中国移动, 'CTCC'-中国电信, 'CUCC'-中国联调 
     * @return ISPType 网络运营商类型 取值范围:'BGP'-默认, 'CMCC'-中国移动, 'CTCC'-中国电信, 'CUCC'-中国联调
     */
    public String getISPType() {
        return this.ISPType;
    }

    /**
     * Set 网络运营商类型 取值范围:'BGP'-默认, 'CMCC'-中国移动, 'CTCC'-中国电信, 'CUCC'-中国联调
     * @param ISPType 网络运营商类型 取值范围:'BGP'-默认, 'CMCC'-中国移动, 'CTCC'-中国电信, 'CUCC'-中国联调
     */
    public void setISPType(String ISPType) {
        this.ISPType = ISPType;
    }

    /**
     * Get IPv6 Cidr 的类型：`GUA`(全球单播地址), `ULA`(唯一本地地址) 
     * @return AddressType IPv6 Cidr 的类型：`GUA`(全球单播地址), `ULA`(唯一本地地址)
     */
    public String getAddressType() {
        return this.AddressType;
    }

    /**
     * Set IPv6 Cidr 的类型：`GUA`(全球单播地址), `ULA`(唯一本地地址)
     * @param AddressType IPv6 Cidr 的类型：`GUA`(全球单播地址), `ULA`(唯一本地地址)
     */
    public void setAddressType(String AddressType) {
        this.AddressType = AddressType;
    }

    public ISPIPv6CidrBlock() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ISPIPv6CidrBlock(ISPIPv6CidrBlock source) {
        if (source.IPv6CidrBlock != null) {
            this.IPv6CidrBlock = new String(source.IPv6CidrBlock);
        }
        if (source.ISPType != null) {
            this.ISPType = new String(source.ISPType);
        }
        if (source.AddressType != null) {
            this.AddressType = new String(source.AddressType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IPv6CidrBlock", this.IPv6CidrBlock);
        this.setParamSimple(map, prefix + "ISPType", this.ISPType);
        this.setParamSimple(map, prefix + "AddressType", this.AddressType);

    }
}

