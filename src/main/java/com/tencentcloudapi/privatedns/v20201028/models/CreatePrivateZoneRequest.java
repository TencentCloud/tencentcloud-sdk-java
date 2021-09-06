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
package com.tencentcloudapi.privatedns.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreatePrivateZoneRequest extends AbstractModel{

    /**
    * 域名，格式必须是标准的TLD
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 创建私有域的同时，为其打上标签
    */
    @SerializedName("TagSet")
    @Expose
    private TagInfo [] TagSet;

    /**
    * 创建私有域的同时，将其关联至VPC
    */
    @SerializedName("VpcSet")
    @Expose
    private VpcInfo [] VpcSet;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 是否开启子域名递归, ENABLED， DISABLED。默认值为DISABLED
    */
    @SerializedName("DnsForwardStatus")
    @Expose
    private String DnsForwardStatus;

    /**
    * 创建私有域的同时，将其关联至VPC
    */
    @SerializedName("Vpcs")
    @Expose
    private VpcInfo [] Vpcs;

    /**
    * 创建私有域同时绑定关联账号的VPC
    */
    @SerializedName("AccountVpcSet")
    @Expose
    private AccountVpcInfo [] AccountVpcSet;

    /**
     * Get 域名，格式必须是标准的TLD 
     * @return Domain 域名，格式必须是标准的TLD
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名，格式必须是标准的TLD
     * @param Domain 域名，格式必须是标准的TLD
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 创建私有域的同时，为其打上标签 
     * @return TagSet 创建私有域的同时，为其打上标签
     */
    public TagInfo [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set 创建私有域的同时，为其打上标签
     * @param TagSet 创建私有域的同时，为其打上标签
     */
    public void setTagSet(TagInfo [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get 创建私有域的同时，将其关联至VPC 
     * @return VpcSet 创建私有域的同时，将其关联至VPC
     */
    public VpcInfo [] getVpcSet() {
        return this.VpcSet;
    }

    /**
     * Set 创建私有域的同时，将其关联至VPC
     * @param VpcSet 创建私有域的同时，将其关联至VPC
     */
    public void setVpcSet(VpcInfo [] VpcSet) {
        this.VpcSet = VpcSet;
    }

    /**
     * Get 备注 
     * @return Remark 备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
     * @param Remark 备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 是否开启子域名递归, ENABLED， DISABLED。默认值为DISABLED 
     * @return DnsForwardStatus 是否开启子域名递归, ENABLED， DISABLED。默认值为DISABLED
     */
    public String getDnsForwardStatus() {
        return this.DnsForwardStatus;
    }

    /**
     * Set 是否开启子域名递归, ENABLED， DISABLED。默认值为DISABLED
     * @param DnsForwardStatus 是否开启子域名递归, ENABLED， DISABLED。默认值为DISABLED
     */
    public void setDnsForwardStatus(String DnsForwardStatus) {
        this.DnsForwardStatus = DnsForwardStatus;
    }

    /**
     * Get 创建私有域的同时，将其关联至VPC 
     * @return Vpcs 创建私有域的同时，将其关联至VPC
     */
    public VpcInfo [] getVpcs() {
        return this.Vpcs;
    }

    /**
     * Set 创建私有域的同时，将其关联至VPC
     * @param Vpcs 创建私有域的同时，将其关联至VPC
     */
    public void setVpcs(VpcInfo [] Vpcs) {
        this.Vpcs = Vpcs;
    }

    /**
     * Get 创建私有域同时绑定关联账号的VPC 
     * @return AccountVpcSet 创建私有域同时绑定关联账号的VPC
     */
    public AccountVpcInfo [] getAccountVpcSet() {
        return this.AccountVpcSet;
    }

    /**
     * Set 创建私有域同时绑定关联账号的VPC
     * @param AccountVpcSet 创建私有域同时绑定关联账号的VPC
     */
    public void setAccountVpcSet(AccountVpcInfo [] AccountVpcSet) {
        this.AccountVpcSet = AccountVpcSet;
    }

    public CreatePrivateZoneRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePrivateZoneRequest(CreatePrivateZoneRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.TagSet != null) {
            this.TagSet = new TagInfo[source.TagSet.length];
            for (int i = 0; i < source.TagSet.length; i++) {
                this.TagSet[i] = new TagInfo(source.TagSet[i]);
            }
        }
        if (source.VpcSet != null) {
            this.VpcSet = new VpcInfo[source.VpcSet.length];
            for (int i = 0; i < source.VpcSet.length; i++) {
                this.VpcSet[i] = new VpcInfo(source.VpcSet[i]);
            }
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.DnsForwardStatus != null) {
            this.DnsForwardStatus = new String(source.DnsForwardStatus);
        }
        if (source.Vpcs != null) {
            this.Vpcs = new VpcInfo[source.Vpcs.length];
            for (int i = 0; i < source.Vpcs.length; i++) {
                this.Vpcs[i] = new VpcInfo(source.Vpcs[i]);
            }
        }
        if (source.AccountVpcSet != null) {
            this.AccountVpcSet = new AccountVpcInfo[source.AccountVpcSet.length];
            for (int i = 0; i < source.AccountVpcSet.length; i++) {
                this.AccountVpcSet[i] = new AccountVpcInfo(source.AccountVpcSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);
        this.setParamArrayObj(map, prefix + "VpcSet.", this.VpcSet);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "DnsForwardStatus", this.DnsForwardStatus);
        this.setParamArrayObj(map, prefix + "Vpcs.", this.Vpcs);
        this.setParamArrayObj(map, prefix + "AccountVpcSet.", this.AccountVpcSet);

    }
}

