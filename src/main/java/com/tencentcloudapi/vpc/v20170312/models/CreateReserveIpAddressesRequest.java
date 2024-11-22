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

public class CreateReserveIpAddressesRequest extends AbstractModel {

    /**
    * VPC唯一 ID。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 指定IP申请的内网保留IP地址。
    */
    @SerializedName("IpAddresses")
    @Expose
    private String [] IpAddresses;

    /**
    * 不指定IP地址，指定个数自动分配保留内网IP。
    */
    @SerializedName("IpAddressCount")
    @Expose
    private Long IpAddressCount;

    /**
    * 子网唯一 ID。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 内网保留 IP名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 内网保留 IP描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 指定绑定的标签列表，例如：[{"Key": "city", "Value": "shanghai"}]。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
     * Get VPC唯一 ID。 
     * @return VpcId VPC唯一 ID。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC唯一 ID。
     * @param VpcId VPC唯一 ID。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 指定IP申请的内网保留IP地址。 
     * @return IpAddresses 指定IP申请的内网保留IP地址。
     */
    public String [] getIpAddresses() {
        return this.IpAddresses;
    }

    /**
     * Set 指定IP申请的内网保留IP地址。
     * @param IpAddresses 指定IP申请的内网保留IP地址。
     */
    public void setIpAddresses(String [] IpAddresses) {
        this.IpAddresses = IpAddresses;
    }

    /**
     * Get 不指定IP地址，指定个数自动分配保留内网IP。 
     * @return IpAddressCount 不指定IP地址，指定个数自动分配保留内网IP。
     */
    public Long getIpAddressCount() {
        return this.IpAddressCount;
    }

    /**
     * Set 不指定IP地址，指定个数自动分配保留内网IP。
     * @param IpAddressCount 不指定IP地址，指定个数自动分配保留内网IP。
     */
    public void setIpAddressCount(Long IpAddressCount) {
        this.IpAddressCount = IpAddressCount;
    }

    /**
     * Get 子网唯一 ID。 
     * @return SubnetId 子网唯一 ID。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网唯一 ID。
     * @param SubnetId 子网唯一 ID。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 内网保留 IP名称。 
     * @return Name 内网保留 IP名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 内网保留 IP名称。
     * @param Name 内网保留 IP名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 内网保留 IP描述。 
     * @return Description 内网保留 IP描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 内网保留 IP描述。
     * @param Description 内网保留 IP描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
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

    /**
     * Get 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。 
     * @return ClientToken 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。
     * @param ClientToken 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    public CreateReserveIpAddressesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateReserveIpAddressesRequest(CreateReserveIpAddressesRequest source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.IpAddresses != null) {
            this.IpAddresses = new String[source.IpAddresses.length];
            for (int i = 0; i < source.IpAddresses.length; i++) {
                this.IpAddresses[i] = new String(source.IpAddresses[i]);
            }
        }
        if (source.IpAddressCount != null) {
            this.IpAddressCount = new Long(source.IpAddressCount);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamArraySimple(map, prefix + "IpAddresses.", this.IpAddresses);
        this.setParamSimple(map, prefix + "IpAddressCount", this.IpAddressCount);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);

    }
}

