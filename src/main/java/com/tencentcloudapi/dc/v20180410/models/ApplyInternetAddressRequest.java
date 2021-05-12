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
package com.tencentcloudapi.dc.v20180410.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApplyInternetAddressRequest extends AbstractModel{

    /**
    * CIDR地址掩码长度
    */
    @SerializedName("MaskLen")
    @Expose
    private Long MaskLen;

    /**
    * 0:BGP类型地址
1：中国电信
2：中国移动
3：中国联通
    */
    @SerializedName("AddrType")
    @Expose
    private Long AddrType;

    /**
    * 0：IPv4
1:IPv6
    */
    @SerializedName("AddrProto")
    @Expose
    private Long AddrProto;

    /**
     * Get CIDR地址掩码长度 
     * @return MaskLen CIDR地址掩码长度
     */
    public Long getMaskLen() {
        return this.MaskLen;
    }

    /**
     * Set CIDR地址掩码长度
     * @param MaskLen CIDR地址掩码长度
     */
    public void setMaskLen(Long MaskLen) {
        this.MaskLen = MaskLen;
    }

    /**
     * Get 0:BGP类型地址
1：中国电信
2：中国移动
3：中国联通 
     * @return AddrType 0:BGP类型地址
1：中国电信
2：中国移动
3：中国联通
     */
    public Long getAddrType() {
        return this.AddrType;
    }

    /**
     * Set 0:BGP类型地址
1：中国电信
2：中国移动
3：中国联通
     * @param AddrType 0:BGP类型地址
1：中国电信
2：中国移动
3：中国联通
     */
    public void setAddrType(Long AddrType) {
        this.AddrType = AddrType;
    }

    /**
     * Get 0：IPv4
1:IPv6 
     * @return AddrProto 0：IPv4
1:IPv6
     */
    public Long getAddrProto() {
        return this.AddrProto;
    }

    /**
     * Set 0：IPv4
1:IPv6
     * @param AddrProto 0：IPv4
1:IPv6
     */
    public void setAddrProto(Long AddrProto) {
        this.AddrProto = AddrProto;
    }

    public ApplyInternetAddressRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplyInternetAddressRequest(ApplyInternetAddressRequest source) {
        if (source.MaskLen != null) {
            this.MaskLen = new Long(source.MaskLen);
        }
        if (source.AddrType != null) {
            this.AddrType = new Long(source.AddrType);
        }
        if (source.AddrProto != null) {
            this.AddrProto = new Long(source.AddrProto);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaskLen", this.MaskLen);
        this.setParamSimple(map, prefix + "AddrType", this.AddrType);
        this.setParamSimple(map, prefix + "AddrProto", this.AddrProto);

    }
}

