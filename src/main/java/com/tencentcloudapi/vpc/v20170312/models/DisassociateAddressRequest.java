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

public class DisassociateAddressRequest extends AbstractModel {

    /**
    * <p>标识 EIP 的唯一 ID。EIP 唯一 ID 形如：<code>eip-11112222</code>。可以使用<a href="https://cloud.tencent.com/document/product/215/16702">DescribeAddresses</a>接口获取AddressId。</p>
    */
    @SerializedName("AddressId")
    @Expose
    private String AddressId;

    /**
    * <p>表示解绑 EIP 之后是否分配普通公网 IP。取值范围：<li><code>true</code>：表示解绑 EIP 之后分配普通公网 IP。</li><li><code>false</code>：表示解绑 EIP 之后不分配普通公网 IP。</li>默认取值：<code>false</code>。<br><br>只有满足以下条件时才能指定该参数：<li>只有在解绑主网卡的主内网 IP 上的 EIP 时才能指定该参数。</li><li>解绑 EIP 后重新分配普通公网 IP 操作一个账号每天最多操作 10 次；详情可通过 <a href="https://cloud.tencent.com/document/api/213/1378">DescribeAddressQuota</a> 接口获取。</li></p>
    */
    @SerializedName("ReallocateNormalPublicIp")
    @Expose
    private Boolean ReallocateNormalPublicIp;

    /**
     * Get <p>标识 EIP 的唯一 ID。EIP 唯一 ID 形如：<code>eip-11112222</code>。可以使用<a href="https://cloud.tencent.com/document/product/215/16702">DescribeAddresses</a>接口获取AddressId。</p> 
     * @return AddressId <p>标识 EIP 的唯一 ID。EIP 唯一 ID 形如：<code>eip-11112222</code>。可以使用<a href="https://cloud.tencent.com/document/product/215/16702">DescribeAddresses</a>接口获取AddressId。</p>
     */
    public String getAddressId() {
        return this.AddressId;
    }

    /**
     * Set <p>标识 EIP 的唯一 ID。EIP 唯一 ID 形如：<code>eip-11112222</code>。可以使用<a href="https://cloud.tencent.com/document/product/215/16702">DescribeAddresses</a>接口获取AddressId。</p>
     * @param AddressId <p>标识 EIP 的唯一 ID。EIP 唯一 ID 形如：<code>eip-11112222</code>。可以使用<a href="https://cloud.tencent.com/document/product/215/16702">DescribeAddresses</a>接口获取AddressId。</p>
     */
    public void setAddressId(String AddressId) {
        this.AddressId = AddressId;
    }

    /**
     * Get <p>表示解绑 EIP 之后是否分配普通公网 IP。取值范围：<li><code>true</code>：表示解绑 EIP 之后分配普通公网 IP。</li><li><code>false</code>：表示解绑 EIP 之后不分配普通公网 IP。</li>默认取值：<code>false</code>。<br><br>只有满足以下条件时才能指定该参数：<li>只有在解绑主网卡的主内网 IP 上的 EIP 时才能指定该参数。</li><li>解绑 EIP 后重新分配普通公网 IP 操作一个账号每天最多操作 10 次；详情可通过 <a href="https://cloud.tencent.com/document/api/213/1378">DescribeAddressQuota</a> 接口获取。</li></p> 
     * @return ReallocateNormalPublicIp <p>表示解绑 EIP 之后是否分配普通公网 IP。取值范围：<li><code>true</code>：表示解绑 EIP 之后分配普通公网 IP。</li><li><code>false</code>：表示解绑 EIP 之后不分配普通公网 IP。</li>默认取值：<code>false</code>。<br><br>只有满足以下条件时才能指定该参数：<li>只有在解绑主网卡的主内网 IP 上的 EIP 时才能指定该参数。</li><li>解绑 EIP 后重新分配普通公网 IP 操作一个账号每天最多操作 10 次；详情可通过 <a href="https://cloud.tencent.com/document/api/213/1378">DescribeAddressQuota</a> 接口获取。</li></p>
     */
    public Boolean getReallocateNormalPublicIp() {
        return this.ReallocateNormalPublicIp;
    }

    /**
     * Set <p>表示解绑 EIP 之后是否分配普通公网 IP。取值范围：<li><code>true</code>：表示解绑 EIP 之后分配普通公网 IP。</li><li><code>false</code>：表示解绑 EIP 之后不分配普通公网 IP。</li>默认取值：<code>false</code>。<br><br>只有满足以下条件时才能指定该参数：<li>只有在解绑主网卡的主内网 IP 上的 EIP 时才能指定该参数。</li><li>解绑 EIP 后重新分配普通公网 IP 操作一个账号每天最多操作 10 次；详情可通过 <a href="https://cloud.tencent.com/document/api/213/1378">DescribeAddressQuota</a> 接口获取。</li></p>
     * @param ReallocateNormalPublicIp <p>表示解绑 EIP 之后是否分配普通公网 IP。取值范围：<li><code>true</code>：表示解绑 EIP 之后分配普通公网 IP。</li><li><code>false</code>：表示解绑 EIP 之后不分配普通公网 IP。</li>默认取值：<code>false</code>。<br><br>只有满足以下条件时才能指定该参数：<li>只有在解绑主网卡的主内网 IP 上的 EIP 时才能指定该参数。</li><li>解绑 EIP 后重新分配普通公网 IP 操作一个账号每天最多操作 10 次；详情可通过 <a href="https://cloud.tencent.com/document/api/213/1378">DescribeAddressQuota</a> 接口获取。</li></p>
     */
    public void setReallocateNormalPublicIp(Boolean ReallocateNormalPublicIp) {
        this.ReallocateNormalPublicIp = ReallocateNormalPublicIp;
    }

    public DisassociateAddressRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DisassociateAddressRequest(DisassociateAddressRequest source) {
        if (source.AddressId != null) {
            this.AddressId = new String(source.AddressId);
        }
        if (source.ReallocateNormalPublicIp != null) {
            this.ReallocateNormalPublicIp = new Boolean(source.ReallocateNormalPublicIp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AddressId", this.AddressId);
        this.setParamSimple(map, prefix + "ReallocateNormalPublicIp", this.ReallocateNormalPublicIp);

    }
}

