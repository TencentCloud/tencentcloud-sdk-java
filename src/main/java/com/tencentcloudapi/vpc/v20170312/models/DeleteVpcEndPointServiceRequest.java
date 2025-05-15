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

public class DeleteVpcEndPointServiceRequest extends AbstractModel {

    /**
    * 终端节点ID。可通过[DescribeVpcEndPointService](https://cloud.tencent.com/document/product/215/54678)接口获取。
    */
    @SerializedName("EndPointServiceId")
    @Expose
    private String EndPointServiceId;

    /**
    * 协议类型，支持 Ipv4，Ipv6，默认 Ipv4。
    */
    @SerializedName("IpAddressType")
    @Expose
    private String IpAddressType;

    /**
     * Get 终端节点ID。可通过[DescribeVpcEndPointService](https://cloud.tencent.com/document/product/215/54678)接口获取。 
     * @return EndPointServiceId 终端节点ID。可通过[DescribeVpcEndPointService](https://cloud.tencent.com/document/product/215/54678)接口获取。
     */
    public String getEndPointServiceId() {
        return this.EndPointServiceId;
    }

    /**
     * Set 终端节点ID。可通过[DescribeVpcEndPointService](https://cloud.tencent.com/document/product/215/54678)接口获取。
     * @param EndPointServiceId 终端节点ID。可通过[DescribeVpcEndPointService](https://cloud.tencent.com/document/product/215/54678)接口获取。
     */
    public void setEndPointServiceId(String EndPointServiceId) {
        this.EndPointServiceId = EndPointServiceId;
    }

    /**
     * Get 协议类型，支持 Ipv4，Ipv6，默认 Ipv4。 
     * @return IpAddressType 协议类型，支持 Ipv4，Ipv6，默认 Ipv4。
     */
    public String getIpAddressType() {
        return this.IpAddressType;
    }

    /**
     * Set 协议类型，支持 Ipv4，Ipv6，默认 Ipv4。
     * @param IpAddressType 协议类型，支持 Ipv4，Ipv6，默认 Ipv4。
     */
    public void setIpAddressType(String IpAddressType) {
        this.IpAddressType = IpAddressType;
    }

    public DeleteVpcEndPointServiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteVpcEndPointServiceRequest(DeleteVpcEndPointServiceRequest source) {
        if (source.EndPointServiceId != null) {
            this.EndPointServiceId = new String(source.EndPointServiceId);
        }
        if (source.IpAddressType != null) {
            this.IpAddressType = new String(source.IpAddressType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EndPointServiceId", this.EndPointServiceId);
        this.setParamSimple(map, prefix + "IpAddressType", this.IpAddressType);

    }
}

