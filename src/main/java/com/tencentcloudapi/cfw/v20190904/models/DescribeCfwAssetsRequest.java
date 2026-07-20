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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCfwAssetsRequest extends AbstractModel {

    /**
    * <p>资产类型。可选，默认 host；枚举 host 主机资产、vpc VPC 网络、subnet 子网。</p>
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * <p>IP 地址过滤。可选，支持部分匹配；适用于 host。</p>
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * <p>实例 ID 过滤。可选，适用于 host。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>VPC ID 过滤。可选，适用于 host、vpc、subnet。</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>子网 ID 过滤。可选，适用于 host、subnet。</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>实例类型过滤。可选，适用于 host；常见值包括 CVM、CLB、ENI、POD、MYSQL、REDIS、MARIADB、NAT、VPN、HAVIP、NATFW、GAAP、DC。</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * <p>最大返回资产数。可选，默认 100，最大 1000。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>上一页 Response.Data 返回的不透明资产或指纹续查 token。首次查询不传；续查时只传 NextToken，不能同时传 AssetType、过滤条件或 Limit。调用方无需区分 token 类型；无效、篡改或租户不匹配会被拒绝。</p>
    */
    @SerializedName("NextToken")
    @Expose
    private String NextToken;

    /**
     * Get <p>资产类型。可选，默认 host；枚举 host 主机资产、vpc VPC 网络、subnet 子网。</p> 
     * @return AssetType <p>资产类型。可选，默认 host；枚举 host 主机资产、vpc VPC 网络、subnet 子网。</p>
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set <p>资产类型。可选，默认 host；枚举 host 主机资产、vpc VPC 网络、subnet 子网。</p>
     * @param AssetType <p>资产类型。可选，默认 host；枚举 host 主机资产、vpc VPC 网络、subnet 子网。</p>
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get <p>IP 地址过滤。可选，支持部分匹配；适用于 host。</p> 
     * @return Ip <p>IP 地址过滤。可选，支持部分匹配；适用于 host。</p>
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set <p>IP 地址过滤。可选，支持部分匹配；适用于 host。</p>
     * @param Ip <p>IP 地址过滤。可选，支持部分匹配；适用于 host。</p>
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get <p>实例 ID 过滤。可选，适用于 host。</p> 
     * @return InstanceId <p>实例 ID 过滤。可选，适用于 host。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例 ID 过滤。可选，适用于 host。</p>
     * @param InstanceId <p>实例 ID 过滤。可选，适用于 host。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>VPC ID 过滤。可选，适用于 host、vpc、subnet。</p> 
     * @return VpcId <p>VPC ID 过滤。可选，适用于 host、vpc、subnet。</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>VPC ID 过滤。可选，适用于 host、vpc、subnet。</p>
     * @param VpcId <p>VPC ID 过滤。可选，适用于 host、vpc、subnet。</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>子网 ID 过滤。可选，适用于 host、subnet。</p> 
     * @return SubnetId <p>子网 ID 过滤。可选，适用于 host、subnet。</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>子网 ID 过滤。可选，适用于 host、subnet。</p>
     * @param SubnetId <p>子网 ID 过滤。可选，适用于 host、subnet。</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>实例类型过滤。可选，适用于 host；常见值包括 CVM、CLB、ENI、POD、MYSQL、REDIS、MARIADB、NAT、VPN、HAVIP、NATFW、GAAP、DC。</p> 
     * @return InstanceType <p>实例类型过滤。可选，适用于 host；常见值包括 CVM、CLB、ENI、POD、MYSQL、REDIS、MARIADB、NAT、VPN、HAVIP、NATFW、GAAP、DC。</p>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>实例类型过滤。可选，适用于 host；常见值包括 CVM、CLB、ENI、POD、MYSQL、REDIS、MARIADB、NAT、VPN、HAVIP、NATFW、GAAP、DC。</p>
     * @param InstanceType <p>实例类型过滤。可选，适用于 host；常见值包括 CVM、CLB、ENI、POD、MYSQL、REDIS、MARIADB、NAT、VPN、HAVIP、NATFW、GAAP、DC。</p>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>最大返回资产数。可选，默认 100，最大 1000。</p> 
     * @return Limit <p>最大返回资产数。可选，默认 100，最大 1000。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>最大返回资产数。可选，默认 100，最大 1000。</p>
     * @param Limit <p>最大返回资产数。可选，默认 100，最大 1000。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>上一页 Response.Data 返回的不透明资产或指纹续查 token。首次查询不传；续查时只传 NextToken，不能同时传 AssetType、过滤条件或 Limit。调用方无需区分 token 类型；无效、篡改或租户不匹配会被拒绝。</p> 
     * @return NextToken <p>上一页 Response.Data 返回的不透明资产或指纹续查 token。首次查询不传；续查时只传 NextToken，不能同时传 AssetType、过滤条件或 Limit。调用方无需区分 token 类型；无效、篡改或租户不匹配会被拒绝。</p>
     */
    public String getNextToken() {
        return this.NextToken;
    }

    /**
     * Set <p>上一页 Response.Data 返回的不透明资产或指纹续查 token。首次查询不传；续查时只传 NextToken，不能同时传 AssetType、过滤条件或 Limit。调用方无需区分 token 类型；无效、篡改或租户不匹配会被拒绝。</p>
     * @param NextToken <p>上一页 Response.Data 返回的不透明资产或指纹续查 token。首次查询不传；续查时只传 NextToken，不能同时传 AssetType、过滤条件或 Limit。调用方无需区分 token 类型；无效、篡改或租户不匹配会被拒绝。</p>
     */
    public void setNextToken(String NextToken) {
        this.NextToken = NextToken;
    }

    public DescribeCfwAssetsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCfwAssetsRequest(DescribeCfwAssetsRequest source) {
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.NextToken != null) {
            this.NextToken = new String(source.NextToken);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "NextToken", this.NextToken);

    }
}

