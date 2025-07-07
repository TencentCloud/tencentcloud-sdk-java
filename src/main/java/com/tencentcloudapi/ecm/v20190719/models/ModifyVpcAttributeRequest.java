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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyVpcAttributeRequest extends AbstractModel {

    /**
    * VPC实例ID。形如：vpc-f49l6u0z。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * ECM 地域
    */
    @SerializedName("EcmRegion")
    @Expose
    private String EcmRegion;

    /**
    * 私有网络名称，可任意命名，但不得超过60个字符。
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * 标签
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 私有网络描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * DNS地址，最多支持4个，第1个默认为主，其余为备。	
    */
    @SerializedName("DnsServers")
    @Expose
    private String [] DnsServers;

    /**
    * 域名。
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
     * Get VPC实例ID。形如：vpc-f49l6u0z。 
     * @return VpcId VPC实例ID。形如：vpc-f49l6u0z。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC实例ID。形如：vpc-f49l6u0z。
     * @param VpcId VPC实例ID。形如：vpc-f49l6u0z。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get ECM 地域 
     * @return EcmRegion ECM 地域
     */
    public String getEcmRegion() {
        return this.EcmRegion;
    }

    /**
     * Set ECM 地域
     * @param EcmRegion ECM 地域
     */
    public void setEcmRegion(String EcmRegion) {
        this.EcmRegion = EcmRegion;
    }

    /**
     * Get 私有网络名称，可任意命名，但不得超过60个字符。 
     * @return VpcName 私有网络名称，可任意命名，但不得超过60个字符。
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set 私有网络名称，可任意命名，但不得超过60个字符。
     * @param VpcName 私有网络名称，可任意命名，但不得超过60个字符。
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get 标签 
     * @return Tags 标签
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签
     * @param Tags 标签
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 私有网络描述 
     * @return Description 私有网络描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 私有网络描述
     * @param Description 私有网络描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get DNS地址，最多支持4个，第1个默认为主，其余为备。	 
     * @return DnsServers DNS地址，最多支持4个，第1个默认为主，其余为备。	
     */
    public String [] getDnsServers() {
        return this.DnsServers;
    }

    /**
     * Set DNS地址，最多支持4个，第1个默认为主，其余为备。	
     * @param DnsServers DNS地址，最多支持4个，第1个默认为主，其余为备。	
     */
    public void setDnsServers(String [] DnsServers) {
        this.DnsServers = DnsServers;
    }

    /**
     * Get 域名。 
     * @return DomainName 域名。
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set 域名。
     * @param DomainName 域名。
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    public ModifyVpcAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyVpcAttributeRequest(ModifyVpcAttributeRequest source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.EcmRegion != null) {
            this.EcmRegion = new String(source.EcmRegion);
        }
        if (source.VpcName != null) {
            this.VpcName = new String(source.VpcName);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.DnsServers != null) {
            this.DnsServers = new String[source.DnsServers.length];
            for (int i = 0; i < source.DnsServers.length; i++) {
                this.DnsServers[i] = new String(source.DnsServers[i]);
            }
        }
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "EcmRegion", this.EcmRegion);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArraySimple(map, prefix + "DnsServers.", this.DnsServers);
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);

    }
}

