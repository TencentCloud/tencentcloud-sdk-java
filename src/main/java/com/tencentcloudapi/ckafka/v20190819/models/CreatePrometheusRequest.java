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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreatePrometheusRequest extends AbstractModel {

    /**
    * ckafka集群实例Id,可通过[DescribeInstances](https://cloud.tencent.com/document/product/597/40835)接口获取
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 私有网络Id,可通过[DescribeVpcs](https://cloud.tencent.com/document/product/215/15778)接口获取

    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网Id,可通过[DescribeSubnets](https://cloud.tencent.com/document/product/215/15784)接口获取
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
     * Get ckafka集群实例Id,可通过[DescribeInstances](https://cloud.tencent.com/document/product/597/40835)接口获取 
     * @return InstanceId ckafka集群实例Id,可通过[DescribeInstances](https://cloud.tencent.com/document/product/597/40835)接口获取
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ckafka集群实例Id,可通过[DescribeInstances](https://cloud.tencent.com/document/product/597/40835)接口获取
     * @param InstanceId ckafka集群实例Id,可通过[DescribeInstances](https://cloud.tencent.com/document/product/597/40835)接口获取
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 私有网络Id,可通过[DescribeVpcs](https://cloud.tencent.com/document/product/215/15778)接口获取
 
     * @return VpcId 私有网络Id,可通过[DescribeVpcs](https://cloud.tencent.com/document/product/215/15778)接口获取

     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络Id,可通过[DescribeVpcs](https://cloud.tencent.com/document/product/215/15778)接口获取

     * @param VpcId 私有网络Id,可通过[DescribeVpcs](https://cloud.tencent.com/document/product/215/15778)接口获取

     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网Id,可通过[DescribeSubnets](https://cloud.tencent.com/document/product/215/15784)接口获取 
     * @return SubnetId 子网Id,可通过[DescribeSubnets](https://cloud.tencent.com/document/product/215/15784)接口获取
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网Id,可通过[DescribeSubnets](https://cloud.tencent.com/document/product/215/15784)接口获取
     * @param SubnetId 子网Id,可通过[DescribeSubnets](https://cloud.tencent.com/document/product/215/15784)接口获取
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    public CreatePrometheusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePrometheusRequest(CreatePrometheusRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);

    }
}

