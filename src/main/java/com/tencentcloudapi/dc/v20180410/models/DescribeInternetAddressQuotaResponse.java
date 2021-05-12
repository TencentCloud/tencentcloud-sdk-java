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

public class DescribeInternetAddressQuotaResponse extends AbstractModel{

    /**
    * IPv6互联网公网允许的最小前缀长度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ipv6PrefixLen")
    @Expose
    private Long Ipv6PrefixLen;

    /**
    * BGP类型IPv4互联网地址配额
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ipv4BgpQuota")
    @Expose
    private Long Ipv4BgpQuota;

    /**
    * 非BGP类型IPv4互联网地址配额
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ipv4OtherQuota")
    @Expose
    private Long Ipv4OtherQuota;

    /**
    * BGP类型IPv4互联网地址已使用数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ipv4BgpNum")
    @Expose
    private Long Ipv4BgpNum;

    /**
    * 非BGP类型互联网地址已使用数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ipv4OtherNum")
    @Expose
    private Long Ipv4OtherNum;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get IPv6互联网公网允许的最小前缀长度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ipv6PrefixLen IPv6互联网公网允许的最小前缀长度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIpv6PrefixLen() {
        return this.Ipv6PrefixLen;
    }

    /**
     * Set IPv6互联网公网允许的最小前缀长度
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ipv6PrefixLen IPv6互联网公网允许的最小前缀长度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpv6PrefixLen(Long Ipv6PrefixLen) {
        this.Ipv6PrefixLen = Ipv6PrefixLen;
    }

    /**
     * Get BGP类型IPv4互联网地址配额
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ipv4BgpQuota BGP类型IPv4互联网地址配额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIpv4BgpQuota() {
        return this.Ipv4BgpQuota;
    }

    /**
     * Set BGP类型IPv4互联网地址配额
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ipv4BgpQuota BGP类型IPv4互联网地址配额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpv4BgpQuota(Long Ipv4BgpQuota) {
        this.Ipv4BgpQuota = Ipv4BgpQuota;
    }

    /**
     * Get 非BGP类型IPv4互联网地址配额
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ipv4OtherQuota 非BGP类型IPv4互联网地址配额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIpv4OtherQuota() {
        return this.Ipv4OtherQuota;
    }

    /**
     * Set 非BGP类型IPv4互联网地址配额
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ipv4OtherQuota 非BGP类型IPv4互联网地址配额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpv4OtherQuota(Long Ipv4OtherQuota) {
        this.Ipv4OtherQuota = Ipv4OtherQuota;
    }

    /**
     * Get BGP类型IPv4互联网地址已使用数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ipv4BgpNum BGP类型IPv4互联网地址已使用数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIpv4BgpNum() {
        return this.Ipv4BgpNum;
    }

    /**
     * Set BGP类型IPv4互联网地址已使用数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ipv4BgpNum BGP类型IPv4互联网地址已使用数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpv4BgpNum(Long Ipv4BgpNum) {
        this.Ipv4BgpNum = Ipv4BgpNum;
    }

    /**
     * Get 非BGP类型互联网地址已使用数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ipv4OtherNum 非BGP类型互联网地址已使用数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIpv4OtherNum() {
        return this.Ipv4OtherNum;
    }

    /**
     * Set 非BGP类型互联网地址已使用数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ipv4OtherNum 非BGP类型互联网地址已使用数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpv4OtherNum(Long Ipv4OtherNum) {
        this.Ipv4OtherNum = Ipv4OtherNum;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeInternetAddressQuotaResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInternetAddressQuotaResponse(DescribeInternetAddressQuotaResponse source) {
        if (source.Ipv6PrefixLen != null) {
            this.Ipv6PrefixLen = new Long(source.Ipv6PrefixLen);
        }
        if (source.Ipv4BgpQuota != null) {
            this.Ipv4BgpQuota = new Long(source.Ipv4BgpQuota);
        }
        if (source.Ipv4OtherQuota != null) {
            this.Ipv4OtherQuota = new Long(source.Ipv4OtherQuota);
        }
        if (source.Ipv4BgpNum != null) {
            this.Ipv4BgpNum = new Long(source.Ipv4BgpNum);
        }
        if (source.Ipv4OtherNum != null) {
            this.Ipv4OtherNum = new Long(source.Ipv4OtherNum);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ipv6PrefixLen", this.Ipv6PrefixLen);
        this.setParamSimple(map, prefix + "Ipv4BgpQuota", this.Ipv4BgpQuota);
        this.setParamSimple(map, prefix + "Ipv4OtherQuota", this.Ipv4OtherQuota);
        this.setParamSimple(map, prefix + "Ipv4BgpNum", this.Ipv4BgpNum);
        this.setParamSimple(map, prefix + "Ipv4OtherNum", this.Ipv4OtherNum);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

