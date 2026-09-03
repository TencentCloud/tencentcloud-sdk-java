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
package com.tencentcloudapi.thpc.v20230321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EnableClusterDedicatedProxyRequest extends AbstractModel {

    /**
    * <p>集群ID。</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>私有网络ID，形如<code>vpc-xxx</code>。可通过调用<a href="https://cloud.tencent.com/document/api/215/15778">DescribeVpcs</a>获取。若不指定，则使用集群已绑定的VPC。</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>私有网络子网ID，形如<code>subnet-xxx</code>。可通过调用<a href="https://cloud.tencent.com/document/api/215/15784">DescribeSubnets</a>获取。与VpcId需同时指定或同时不指定。</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
     * Get <p>集群ID。</p> 
     * @return ClusterId <p>集群ID。</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群ID。</p>
     * @param ClusterId <p>集群ID。</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>私有网络ID，形如<code>vpc-xxx</code>。可通过调用<a href="https://cloud.tencent.com/document/api/215/15778">DescribeVpcs</a>获取。若不指定，则使用集群已绑定的VPC。</p> 
     * @return VpcId <p>私有网络ID，形如<code>vpc-xxx</code>。可通过调用<a href="https://cloud.tencent.com/document/api/215/15778">DescribeVpcs</a>获取。若不指定，则使用集群已绑定的VPC。</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>私有网络ID，形如<code>vpc-xxx</code>。可通过调用<a href="https://cloud.tencent.com/document/api/215/15778">DescribeVpcs</a>获取。若不指定，则使用集群已绑定的VPC。</p>
     * @param VpcId <p>私有网络ID，形如<code>vpc-xxx</code>。可通过调用<a href="https://cloud.tencent.com/document/api/215/15778">DescribeVpcs</a>获取。若不指定，则使用集群已绑定的VPC。</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>私有网络子网ID，形如<code>subnet-xxx</code>。可通过调用<a href="https://cloud.tencent.com/document/api/215/15784">DescribeSubnets</a>获取。与VpcId需同时指定或同时不指定。</p> 
     * @return SubnetId <p>私有网络子网ID，形如<code>subnet-xxx</code>。可通过调用<a href="https://cloud.tencent.com/document/api/215/15784">DescribeSubnets</a>获取。与VpcId需同时指定或同时不指定。</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>私有网络子网ID，形如<code>subnet-xxx</code>。可通过调用<a href="https://cloud.tencent.com/document/api/215/15784">DescribeSubnets</a>获取。与VpcId需同时指定或同时不指定。</p>
     * @param SubnetId <p>私有网络子网ID，形如<code>subnet-xxx</code>。可通过调用<a href="https://cloud.tencent.com/document/api/215/15784">DescribeSubnets</a>获取。与VpcId需同时指定或同时不指定。</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    public EnableClusterDedicatedProxyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EnableClusterDedicatedProxyRequest(EnableClusterDedicatedProxyRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
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
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);

    }
}

