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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateHaVipRequest extends AbstractModel {

    /**
    * `HAVIP`所在私有网络`ID`。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * `HAVIP`名称。
    */
    @SerializedName("HaVipName")
    @Expose
    private String HaVipName;

    /**
    * `HAVIP`所在子网`ID`。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 指定虚拟IP地址，必须在`VPC`网段内且未被占用。不指定则自动分配。
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * `HAVIP`所在弹性网卡`ID`。
    */
    @SerializedName("NetworkInterfaceId")
    @Expose
    private String NetworkInterfaceId;

    /**
    * 是否开启`HAVIP`漂移时子机或网卡范围的校验。默认不开启。
    */
    @SerializedName("CheckAssociate")
    @Expose
    private Boolean CheckAssociate;

    /**
    * 指定绑定的标签列表，例如：[{"Key": "city", "Value": "shanghai"}]。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * HaVip绑定的子机或网卡。最多支持10个实例。
    */
    @SerializedName("HaVipAssociationSet")
    @Expose
    private HaVipAssociation [] HaVipAssociationSet;

    /**
    * 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
     * Get `HAVIP`所在私有网络`ID`。 
     * @return VpcId `HAVIP`所在私有网络`ID`。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set `HAVIP`所在私有网络`ID`。
     * @param VpcId `HAVIP`所在私有网络`ID`。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get `HAVIP`名称。 
     * @return HaVipName `HAVIP`名称。
     */
    public String getHaVipName() {
        return this.HaVipName;
    }

    /**
     * Set `HAVIP`名称。
     * @param HaVipName `HAVIP`名称。
     */
    public void setHaVipName(String HaVipName) {
        this.HaVipName = HaVipName;
    }

    /**
     * Get `HAVIP`所在子网`ID`。 
     * @return SubnetId `HAVIP`所在子网`ID`。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set `HAVIP`所在子网`ID`。
     * @param SubnetId `HAVIP`所在子网`ID`。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 指定虚拟IP地址，必须在`VPC`网段内且未被占用。不指定则自动分配。 
     * @return Vip 指定虚拟IP地址，必须在`VPC`网段内且未被占用。不指定则自动分配。
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 指定虚拟IP地址，必须在`VPC`网段内且未被占用。不指定则自动分配。
     * @param Vip 指定虚拟IP地址，必须在`VPC`网段内且未被占用。不指定则自动分配。
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get `HAVIP`所在弹性网卡`ID`。 
     * @return NetworkInterfaceId `HAVIP`所在弹性网卡`ID`。
     */
    public String getNetworkInterfaceId() {
        return this.NetworkInterfaceId;
    }

    /**
     * Set `HAVIP`所在弹性网卡`ID`。
     * @param NetworkInterfaceId `HAVIP`所在弹性网卡`ID`。
     */
    public void setNetworkInterfaceId(String NetworkInterfaceId) {
        this.NetworkInterfaceId = NetworkInterfaceId;
    }

    /**
     * Get 是否开启`HAVIP`漂移时子机或网卡范围的校验。默认不开启。 
     * @return CheckAssociate 是否开启`HAVIP`漂移时子机或网卡范围的校验。默认不开启。
     */
    public Boolean getCheckAssociate() {
        return this.CheckAssociate;
    }

    /**
     * Set 是否开启`HAVIP`漂移时子机或网卡范围的校验。默认不开启。
     * @param CheckAssociate 是否开启`HAVIP`漂移时子机或网卡范围的校验。默认不开启。
     */
    public void setCheckAssociate(Boolean CheckAssociate) {
        this.CheckAssociate = CheckAssociate;
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
     * Get HaVip绑定的子机或网卡。最多支持10个实例。 
     * @return HaVipAssociationSet HaVip绑定的子机或网卡。最多支持10个实例。
     */
    public HaVipAssociation [] getHaVipAssociationSet() {
        return this.HaVipAssociationSet;
    }

    /**
     * Set HaVip绑定的子机或网卡。最多支持10个实例。
     * @param HaVipAssociationSet HaVip绑定的子机或网卡。最多支持10个实例。
     */
    public void setHaVipAssociationSet(HaVipAssociation [] HaVipAssociationSet) {
        this.HaVipAssociationSet = HaVipAssociationSet;
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

    public CreateHaVipRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateHaVipRequest(CreateHaVipRequest source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.HaVipName != null) {
            this.HaVipName = new String(source.HaVipName);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.NetworkInterfaceId != null) {
            this.NetworkInterfaceId = new String(source.NetworkInterfaceId);
        }
        if (source.CheckAssociate != null) {
            this.CheckAssociate = new Boolean(source.CheckAssociate);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.HaVipAssociationSet != null) {
            this.HaVipAssociationSet = new HaVipAssociation[source.HaVipAssociationSet.length];
            for (int i = 0; i < source.HaVipAssociationSet.length; i++) {
                this.HaVipAssociationSet[i] = new HaVipAssociation(source.HaVipAssociationSet[i]);
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
        this.setParamSimple(map, prefix + "HaVipName", this.HaVipName);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "NetworkInterfaceId", this.NetworkInterfaceId);
        this.setParamSimple(map, prefix + "CheckAssociate", this.CheckAssociate);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamArrayObj(map, prefix + "HaVipAssociationSet.", this.HaVipAssociationSet);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);

    }
}

