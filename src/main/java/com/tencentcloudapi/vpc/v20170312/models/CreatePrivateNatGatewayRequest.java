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

public class CreatePrivateNatGatewayRequest extends AbstractModel {

    /**
    * 私网网关名称
    */
    @SerializedName("NatGatewayName")
    @Expose
    private String NatGatewayName;

    /**
    * 私有网络实例ID。当创建VPC类型私网NAT网关或者专线网关类型私网NAT网关时，此参数必填。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 跨域参数。仅当取值为True时，才会支持跨域绑定VPC。
    */
    @SerializedName("CrossDomain")
    @Expose
    private Boolean CrossDomain;

    /**
    * 实例标签
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * VPC类型私网NAT网关。仅当取值为True时，才会创建VPC类型私网NAT网关。
    */
    @SerializedName("VpcType")
    @Expose
    private Boolean VpcType;

    /**
    * 云联网类型私网NAT网关需要绑定的云联网实例ID。
    */
    @SerializedName("CcnId")
    @Expose
    private String CcnId;

    /**
    * 私网NAT实例是否开启删除保护
    */
    @SerializedName("DeletionProtectionEnabled")
    @Expose
    private Boolean DeletionProtectionEnabled;

    /**
     * Get 私网网关名称 
     * @return NatGatewayName 私网网关名称
     */
    public String getNatGatewayName() {
        return this.NatGatewayName;
    }

    /**
     * Set 私网网关名称
     * @param NatGatewayName 私网网关名称
     */
    public void setNatGatewayName(String NatGatewayName) {
        this.NatGatewayName = NatGatewayName;
    }

    /**
     * Get 私有网络实例ID。当创建VPC类型私网NAT网关或者专线网关类型私网NAT网关时，此参数必填。 
     * @return VpcId 私有网络实例ID。当创建VPC类型私网NAT网关或者专线网关类型私网NAT网关时，此参数必填。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络实例ID。当创建VPC类型私网NAT网关或者专线网关类型私网NAT网关时，此参数必填。
     * @param VpcId 私有网络实例ID。当创建VPC类型私网NAT网关或者专线网关类型私网NAT网关时，此参数必填。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 跨域参数。仅当取值为True时，才会支持跨域绑定VPC。 
     * @return CrossDomain 跨域参数。仅当取值为True时，才会支持跨域绑定VPC。
     */
    public Boolean getCrossDomain() {
        return this.CrossDomain;
    }

    /**
     * Set 跨域参数。仅当取值为True时，才会支持跨域绑定VPC。
     * @param CrossDomain 跨域参数。仅当取值为True时，才会支持跨域绑定VPC。
     */
    public void setCrossDomain(Boolean CrossDomain) {
        this.CrossDomain = CrossDomain;
    }

    /**
     * Get 实例标签 
     * @return Tags 实例标签
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 实例标签
     * @param Tags 实例标签
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get VPC类型私网NAT网关。仅当取值为True时，才会创建VPC类型私网NAT网关。 
     * @return VpcType VPC类型私网NAT网关。仅当取值为True时，才会创建VPC类型私网NAT网关。
     */
    public Boolean getVpcType() {
        return this.VpcType;
    }

    /**
     * Set VPC类型私网NAT网关。仅当取值为True时，才会创建VPC类型私网NAT网关。
     * @param VpcType VPC类型私网NAT网关。仅当取值为True时，才会创建VPC类型私网NAT网关。
     */
    public void setVpcType(Boolean VpcType) {
        this.VpcType = VpcType;
    }

    /**
     * Get 云联网类型私网NAT网关需要绑定的云联网实例ID。 
     * @return CcnId 云联网类型私网NAT网关需要绑定的云联网实例ID。
     */
    public String getCcnId() {
        return this.CcnId;
    }

    /**
     * Set 云联网类型私网NAT网关需要绑定的云联网实例ID。
     * @param CcnId 云联网类型私网NAT网关需要绑定的云联网实例ID。
     */
    public void setCcnId(String CcnId) {
        this.CcnId = CcnId;
    }

    /**
     * Get 私网NAT实例是否开启删除保护 
     * @return DeletionProtectionEnabled 私网NAT实例是否开启删除保护
     */
    public Boolean getDeletionProtectionEnabled() {
        return this.DeletionProtectionEnabled;
    }

    /**
     * Set 私网NAT实例是否开启删除保护
     * @param DeletionProtectionEnabled 私网NAT实例是否开启删除保护
     */
    public void setDeletionProtectionEnabled(Boolean DeletionProtectionEnabled) {
        this.DeletionProtectionEnabled = DeletionProtectionEnabled;
    }

    public CreatePrivateNatGatewayRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePrivateNatGatewayRequest(CreatePrivateNatGatewayRequest source) {
        if (source.NatGatewayName != null) {
            this.NatGatewayName = new String(source.NatGatewayName);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.CrossDomain != null) {
            this.CrossDomain = new Boolean(source.CrossDomain);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.VpcType != null) {
            this.VpcType = new Boolean(source.VpcType);
        }
        if (source.CcnId != null) {
            this.CcnId = new String(source.CcnId);
        }
        if (source.DeletionProtectionEnabled != null) {
            this.DeletionProtectionEnabled = new Boolean(source.DeletionProtectionEnabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NatGatewayName", this.NatGatewayName);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "CrossDomain", this.CrossDomain);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "VpcType", this.VpcType);
        this.setParamSimple(map, prefix + "CcnId", this.CcnId);
        this.setParamSimple(map, prefix + "DeletionProtectionEnabled", this.DeletionProtectionEnabled);

    }
}

