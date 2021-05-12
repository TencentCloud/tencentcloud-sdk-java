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

public class DescribeInternetAddressResponse extends AbstractModel{

    /**
    * 互联网公网地址数量
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 互联网公网地址列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Subnets")
    @Expose
    private InternetAddressDetail [] Subnets;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 互联网公网地址数量 
     * @return TotalCount 互联网公网地址数量
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 互联网公网地址数量
     * @param TotalCount 互联网公网地址数量
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 互联网公网地址列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Subnets 互联网公网地址列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InternetAddressDetail [] getSubnets() {
        return this.Subnets;
    }

    /**
     * Set 互联网公网地址列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Subnets 互联网公网地址列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnets(InternetAddressDetail [] Subnets) {
        this.Subnets = Subnets;
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

    public DescribeInternetAddressResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInternetAddressResponse(DescribeInternetAddressResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Subnets != null) {
            this.Subnets = new InternetAddressDetail[source.Subnets.length];
            for (int i = 0; i < source.Subnets.length; i++) {
                this.Subnets[i] = new InternetAddressDetail(source.Subnets[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "Subnets.", this.Subnets);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

