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

public class CreateVpcRequest extends AbstractModel{

    /**
    * vpc名称，最大长度不能超过60个字节。
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * vpc的cidr，只能为10.0.0.0/16，172.16.0.0/16，192.168.0.0/16这三个内网网段内。
    */
    @SerializedName("CidrBlock")
    @Expose
    private String CidrBlock;

    /**
    * 是否开启组播。true: 开启, false: 不开启。
    */
    @SerializedName("EnableMulticast")
    @Expose
    private String EnableMulticast;

    /**
    * DNS地址，最多支持4个
    */
    @SerializedName("DnsServers")
    @Expose
    private String [] DnsServers;

    /**
    * 域名
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * 指定绑定的标签列表，例如：[{"Key": "city", "Value": "shanghai"}]
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get vpc名称，最大长度不能超过60个字节。 
     * @return VpcName vpc名称，最大长度不能超过60个字节。
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set vpc名称，最大长度不能超过60个字节。
     * @param VpcName vpc名称，最大长度不能超过60个字节。
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get vpc的cidr，只能为10.0.0.0/16，172.16.0.0/16，192.168.0.0/16这三个内网网段内。 
     * @return CidrBlock vpc的cidr，只能为10.0.0.0/16，172.16.0.0/16，192.168.0.0/16这三个内网网段内。
     */
    public String getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * Set vpc的cidr，只能为10.0.0.0/16，172.16.0.0/16，192.168.0.0/16这三个内网网段内。
     * @param CidrBlock vpc的cidr，只能为10.0.0.0/16，172.16.0.0/16，192.168.0.0/16这三个内网网段内。
     */
    public void setCidrBlock(String CidrBlock) {
        this.CidrBlock = CidrBlock;
    }

    /**
     * Get 是否开启组播。true: 开启, false: 不开启。 
     * @return EnableMulticast 是否开启组播。true: 开启, false: 不开启。
     */
    public String getEnableMulticast() {
        return this.EnableMulticast;
    }

    /**
     * Set 是否开启组播。true: 开启, false: 不开启。
     * @param EnableMulticast 是否开启组播。true: 开启, false: 不开启。
     */
    public void setEnableMulticast(String EnableMulticast) {
        this.EnableMulticast = EnableMulticast;
    }

    /**
     * Get DNS地址，最多支持4个 
     * @return DnsServers DNS地址，最多支持4个
     */
    public String [] getDnsServers() {
        return this.DnsServers;
    }

    /**
     * Set DNS地址，最多支持4个
     * @param DnsServers DNS地址，最多支持4个
     */
    public void setDnsServers(String [] DnsServers) {
        this.DnsServers = DnsServers;
    }

    /**
     * Get 域名 
     * @return DomainName 域名
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set 域名
     * @param DomainName 域名
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get 指定绑定的标签列表，例如：[{"Key": "city", "Value": "shanghai"}] 
     * @return Tags 指定绑定的标签列表，例如：[{"Key": "city", "Value": "shanghai"}]
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 指定绑定的标签列表，例如：[{"Key": "city", "Value": "shanghai"}]
     * @param Tags 指定绑定的标签列表，例如：[{"Key": "city", "Value": "shanghai"}]
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "CidrBlock", this.CidrBlock);
        this.setParamSimple(map, prefix + "EnableMulticast", this.EnableMulticast);
        this.setParamArraySimple(map, prefix + "DnsServers.", this.DnsServers);
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

