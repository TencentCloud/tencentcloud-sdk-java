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

public class DisassociateVpcEndPointSecurityGroupsRequest extends AbstractModel {

    /**
    * 安全组ID数组。可通过[DescribeSecurityGroups](https://cloud.tencent.com/document/product/215/15808)接口获取。
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * 终端节点ID。可通过[DescribeVpcEndPoint](https://cloud.tencent.com/document/product/215/54679) 获取。
    */
    @SerializedName("EndPointId")
    @Expose
    private String EndPointId;

    /**
     * Get 安全组ID数组。可通过[DescribeSecurityGroups](https://cloud.tencent.com/document/product/215/15808)接口获取。 
     * @return SecurityGroupIds 安全组ID数组。可通过[DescribeSecurityGroups](https://cloud.tencent.com/document/product/215/15808)接口获取。
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set 安全组ID数组。可通过[DescribeSecurityGroups](https://cloud.tencent.com/document/product/215/15808)接口获取。
     * @param SecurityGroupIds 安全组ID数组。可通过[DescribeSecurityGroups](https://cloud.tencent.com/document/product/215/15808)接口获取。
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get 终端节点ID。可通过[DescribeVpcEndPoint](https://cloud.tencent.com/document/product/215/54679) 获取。 
     * @return EndPointId 终端节点ID。可通过[DescribeVpcEndPoint](https://cloud.tencent.com/document/product/215/54679) 获取。
     */
    public String getEndPointId() {
        return this.EndPointId;
    }

    /**
     * Set 终端节点ID。可通过[DescribeVpcEndPoint](https://cloud.tencent.com/document/product/215/54679) 获取。
     * @param EndPointId 终端节点ID。可通过[DescribeVpcEndPoint](https://cloud.tencent.com/document/product/215/54679) 获取。
     */
    public void setEndPointId(String EndPointId) {
        this.EndPointId = EndPointId;
    }

    public DisassociateVpcEndPointSecurityGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DisassociateVpcEndPointSecurityGroupsRequest(DisassociateVpcEndPointSecurityGroupsRequest source) {
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.EndPointId != null) {
            this.EndPointId = new String(source.EndPointId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamSimple(map, prefix + "EndPointId", this.EndPointId);

    }
}

