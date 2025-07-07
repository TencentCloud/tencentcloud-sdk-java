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

public class DisassociateIPv6AddressRequest extends AbstractModel {

    /**
    * 弹性公网IPv6唯一ID，EIPv6 唯一 ID 形如：eipv6-11112222。可以使用[DescribeIPv6Addresses](https://cloud.tencent.com/document/api/215/113677)接口获取IPv6AddressId。
    */
    @SerializedName("IPv6AddressId")
    @Expose
    private String IPv6AddressId;

    /**
    * 解绑时是否保持绑定弹性网卡。可选值：true、false。
默认值：false
    */
    @SerializedName("KeepBindWithEni")
    @Expose
    private Boolean KeepBindWithEni;

    /**
     * Get 弹性公网IPv6唯一ID，EIPv6 唯一 ID 形如：eipv6-11112222。可以使用[DescribeIPv6Addresses](https://cloud.tencent.com/document/api/215/113677)接口获取IPv6AddressId。 
     * @return IPv6AddressId 弹性公网IPv6唯一ID，EIPv6 唯一 ID 形如：eipv6-11112222。可以使用[DescribeIPv6Addresses](https://cloud.tencent.com/document/api/215/113677)接口获取IPv6AddressId。
     */
    public String getIPv6AddressId() {
        return this.IPv6AddressId;
    }

    /**
     * Set 弹性公网IPv6唯一ID，EIPv6 唯一 ID 形如：eipv6-11112222。可以使用[DescribeIPv6Addresses](https://cloud.tencent.com/document/api/215/113677)接口获取IPv6AddressId。
     * @param IPv6AddressId 弹性公网IPv6唯一ID，EIPv6 唯一 ID 形如：eipv6-11112222。可以使用[DescribeIPv6Addresses](https://cloud.tencent.com/document/api/215/113677)接口获取IPv6AddressId。
     */
    public void setIPv6AddressId(String IPv6AddressId) {
        this.IPv6AddressId = IPv6AddressId;
    }

    /**
     * Get 解绑时是否保持绑定弹性网卡。可选值：true、false。
默认值：false 
     * @return KeepBindWithEni 解绑时是否保持绑定弹性网卡。可选值：true、false。
默认值：false
     */
    public Boolean getKeepBindWithEni() {
        return this.KeepBindWithEni;
    }

    /**
     * Set 解绑时是否保持绑定弹性网卡。可选值：true、false。
默认值：false
     * @param KeepBindWithEni 解绑时是否保持绑定弹性网卡。可选值：true、false。
默认值：false
     */
    public void setKeepBindWithEni(Boolean KeepBindWithEni) {
        this.KeepBindWithEni = KeepBindWithEni;
    }

    public DisassociateIPv6AddressRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DisassociateIPv6AddressRequest(DisassociateIPv6AddressRequest source) {
        if (source.IPv6AddressId != null) {
            this.IPv6AddressId = new String(source.IPv6AddressId);
        }
        if (source.KeepBindWithEni != null) {
            this.KeepBindWithEni = new Boolean(source.KeepBindWithEni);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IPv6AddressId", this.IPv6AddressId);
        this.setParamSimple(map, prefix + "KeepBindWithEni", this.KeepBindWithEni);

    }
}

