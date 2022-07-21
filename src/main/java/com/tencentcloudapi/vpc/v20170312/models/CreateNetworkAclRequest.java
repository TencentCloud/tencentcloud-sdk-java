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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateNetworkAclRequest extends AbstractModel{

    /**
    * VPC实例ID。可通过DescribeVpcs接口返回值中的VpcId获取。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 网络ACL名称，最大长度不能超过60个字节。
    */
    @SerializedName("NetworkAclName")
    @Expose
    private String NetworkAclName;

    /**
    * 网络ACL类型，三元组(TRIPLE)或五元组(QUINTUPLE)
    */
    @SerializedName("NetworkAclType")
    @Expose
    private String NetworkAclType;

    /**
    * 指定绑定的标签列表，例如：[{"Key": "city", "Value": "shanghai"}]。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get VPC实例ID。可通过DescribeVpcs接口返回值中的VpcId获取。 
     * @return VpcId VPC实例ID。可通过DescribeVpcs接口返回值中的VpcId获取。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC实例ID。可通过DescribeVpcs接口返回值中的VpcId获取。
     * @param VpcId VPC实例ID。可通过DescribeVpcs接口返回值中的VpcId获取。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 网络ACL名称，最大长度不能超过60个字节。 
     * @return NetworkAclName 网络ACL名称，最大长度不能超过60个字节。
     */
    public String getNetworkAclName() {
        return this.NetworkAclName;
    }

    /**
     * Set 网络ACL名称，最大长度不能超过60个字节。
     * @param NetworkAclName 网络ACL名称，最大长度不能超过60个字节。
     */
    public void setNetworkAclName(String NetworkAclName) {
        this.NetworkAclName = NetworkAclName;
    }

    /**
     * Get 网络ACL类型，三元组(TRIPLE)或五元组(QUINTUPLE) 
     * @return NetworkAclType 网络ACL类型，三元组(TRIPLE)或五元组(QUINTUPLE)
     */
    public String getNetworkAclType() {
        return this.NetworkAclType;
    }

    /**
     * Set 网络ACL类型，三元组(TRIPLE)或五元组(QUINTUPLE)
     * @param NetworkAclType 网络ACL类型，三元组(TRIPLE)或五元组(QUINTUPLE)
     */
    public void setNetworkAclType(String NetworkAclType) {
        this.NetworkAclType = NetworkAclType;
    }

    /**
     * Get 指定绑定的标签列表，例如：[{"Key": "city", "Value": "shanghai"}]。 
     * @return Tags 指定绑定的标签列表，例如：[{"Key": "city", "Value": "shanghai"}]。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 指定绑定的标签列表，例如：[{"Key": "city", "Value": "shanghai"}]。
     * @param Tags 指定绑定的标签列表，例如：[{"Key": "city", "Value": "shanghai"}]。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public CreateNetworkAclRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateNetworkAclRequest(CreateNetworkAclRequest source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.NetworkAclName != null) {
            this.NetworkAclName = new String(source.NetworkAclName);
        }
        if (source.NetworkAclType != null) {
            this.NetworkAclType = new String(source.NetworkAclType);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "NetworkAclName", this.NetworkAclName);
        this.setParamSimple(map, prefix + "NetworkAclType", this.NetworkAclType);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

