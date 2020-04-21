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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DisassociateAddressRequest extends AbstractModel{

    /**
    * ECM 地域
    */
    @SerializedName("EcmRegion")
    @Expose
    private String EcmRegion;

    /**
    * 标识 EIP 的唯一 ID。EIP 唯一 ID 形如：eip-11112222。
    */
    @SerializedName("AddressId")
    @Expose
    private String AddressId;

    /**
    * 表示解绑 EIP 之后是否分配普通公网 IP。取值范围：
TRUE：表示解绑 EIP 之后分配普通公网 IP。
FALSE：表示解绑 EIP 之后不分配普通公网 IP。
默认取值：FALSE。

只有满足以下条件时才能指定该参数：
只有在解绑主网卡的主内网 IP 上的 EIP 时才能指定该参数。
解绑 EIP 后重新分配普通公网 IP 操作一个账号每天最多操作 10 次；详情可通过 DescribeAddressQuota 接口获取。
    */
    @SerializedName("ReallocateNormalPublicIp")
    @Expose
    private Boolean ReallocateNormalPublicIp;

    /**
     * Get ECM 地域 
     * @return EcmRegion ECM 地域
     */
    public String getEcmRegion() {
        return this.EcmRegion;
    }

    /**
     * Set ECM 地域
     * @param EcmRegion ECM 地域
     */
    public void setEcmRegion(String EcmRegion) {
        this.EcmRegion = EcmRegion;
    }

    /**
     * Get 标识 EIP 的唯一 ID。EIP 唯一 ID 形如：eip-11112222。 
     * @return AddressId 标识 EIP 的唯一 ID。EIP 唯一 ID 形如：eip-11112222。
     */
    public String getAddressId() {
        return this.AddressId;
    }

    /**
     * Set 标识 EIP 的唯一 ID。EIP 唯一 ID 形如：eip-11112222。
     * @param AddressId 标识 EIP 的唯一 ID。EIP 唯一 ID 形如：eip-11112222。
     */
    public void setAddressId(String AddressId) {
        this.AddressId = AddressId;
    }

    /**
     * Get 表示解绑 EIP 之后是否分配普通公网 IP。取值范围：
TRUE：表示解绑 EIP 之后分配普通公网 IP。
FALSE：表示解绑 EIP 之后不分配普通公网 IP。
默认取值：FALSE。

只有满足以下条件时才能指定该参数：
只有在解绑主网卡的主内网 IP 上的 EIP 时才能指定该参数。
解绑 EIP 后重新分配普通公网 IP 操作一个账号每天最多操作 10 次；详情可通过 DescribeAddressQuota 接口获取。 
     * @return ReallocateNormalPublicIp 表示解绑 EIP 之后是否分配普通公网 IP。取值范围：
TRUE：表示解绑 EIP 之后分配普通公网 IP。
FALSE：表示解绑 EIP 之后不分配普通公网 IP。
默认取值：FALSE。

只有满足以下条件时才能指定该参数：
只有在解绑主网卡的主内网 IP 上的 EIP 时才能指定该参数。
解绑 EIP 后重新分配普通公网 IP 操作一个账号每天最多操作 10 次；详情可通过 DescribeAddressQuota 接口获取。
     */
    public Boolean getReallocateNormalPublicIp() {
        return this.ReallocateNormalPublicIp;
    }

    /**
     * Set 表示解绑 EIP 之后是否分配普通公网 IP。取值范围：
TRUE：表示解绑 EIP 之后分配普通公网 IP。
FALSE：表示解绑 EIP 之后不分配普通公网 IP。
默认取值：FALSE。

只有满足以下条件时才能指定该参数：
只有在解绑主网卡的主内网 IP 上的 EIP 时才能指定该参数。
解绑 EIP 后重新分配普通公网 IP 操作一个账号每天最多操作 10 次；详情可通过 DescribeAddressQuota 接口获取。
     * @param ReallocateNormalPublicIp 表示解绑 EIP 之后是否分配普通公网 IP。取值范围：
TRUE：表示解绑 EIP 之后分配普通公网 IP。
FALSE：表示解绑 EIP 之后不分配普通公网 IP。
默认取值：FALSE。

只有满足以下条件时才能指定该参数：
只有在解绑主网卡的主内网 IP 上的 EIP 时才能指定该参数。
解绑 EIP 后重新分配普通公网 IP 操作一个账号每天最多操作 10 次；详情可通过 DescribeAddressQuota 接口获取。
     */
    public void setReallocateNormalPublicIp(Boolean ReallocateNormalPublicIp) {
        this.ReallocateNormalPublicIp = ReallocateNormalPublicIp;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EcmRegion", this.EcmRegion);
        this.setParamSimple(map, prefix + "AddressId", this.AddressId);
        this.setParamSimple(map, prefix + "ReallocateNormalPublicIp", this.ReallocateNormalPublicIp);

    }
}

