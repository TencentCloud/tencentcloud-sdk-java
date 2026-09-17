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

public class CustomerGateway extends AbstractModel {

    /**
    * <p>用户网关唯一ID</p>
    */
    @SerializedName("CustomerGatewayId")
    @Expose
    private String CustomerGatewayId;

    /**
    * <p>网关名称</p>
    */
    @SerializedName("CustomerGatewayName")
    @Expose
    private String CustomerGatewayName;

    /**
    * <p>公网地址</p>
    */
    @SerializedName("IpAddress")
    @Expose
    private String IpAddress;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * <p>BGP ASN。</p>
    */
    @SerializedName("BgpAsn")
    @Expose
    private Long BgpAsn;

    /**
    * <p>关联通道数</p>
    */
    @SerializedName("VpnConnNum")
    @Expose
    private Long VpnConnNum;

    /**
    * <p>标签信息</p>
    */
    @SerializedName("TagSet")
    @Expose
    private Tag [] TagSet;

    /**
     * Get <p>用户网关唯一ID</p> 
     * @return CustomerGatewayId <p>用户网关唯一ID</p>
     */
    public String getCustomerGatewayId() {
        return this.CustomerGatewayId;
    }

    /**
     * Set <p>用户网关唯一ID</p>
     * @param CustomerGatewayId <p>用户网关唯一ID</p>
     */
    public void setCustomerGatewayId(String CustomerGatewayId) {
        this.CustomerGatewayId = CustomerGatewayId;
    }

    /**
     * Get <p>网关名称</p> 
     * @return CustomerGatewayName <p>网关名称</p>
     */
    public String getCustomerGatewayName() {
        return this.CustomerGatewayName;
    }

    /**
     * Set <p>网关名称</p>
     * @param CustomerGatewayName <p>网关名称</p>
     */
    public void setCustomerGatewayName(String CustomerGatewayName) {
        this.CustomerGatewayName = CustomerGatewayName;
    }

    /**
     * Get <p>公网地址</p> 
     * @return IpAddress <p>公网地址</p>
     */
    public String getIpAddress() {
        return this.IpAddress;
    }

    /**
     * Set <p>公网地址</p>
     * @param IpAddress <p>公网地址</p>
     */
    public void setIpAddress(String IpAddress) {
        this.IpAddress = IpAddress;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreatedTime <p>创建时间</p>
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreatedTime <p>创建时间</p>
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get <p>BGP ASN。</p> 
     * @return BgpAsn <p>BGP ASN。</p>
     */
    public Long getBgpAsn() {
        return this.BgpAsn;
    }

    /**
     * Set <p>BGP ASN。</p>
     * @param BgpAsn <p>BGP ASN。</p>
     */
    public void setBgpAsn(Long BgpAsn) {
        this.BgpAsn = BgpAsn;
    }

    /**
     * Get <p>关联通道数</p> 
     * @return VpnConnNum <p>关联通道数</p>
     */
    public Long getVpnConnNum() {
        return this.VpnConnNum;
    }

    /**
     * Set <p>关联通道数</p>
     * @param VpnConnNum <p>关联通道数</p>
     */
    public void setVpnConnNum(Long VpnConnNum) {
        this.VpnConnNum = VpnConnNum;
    }

    /**
     * Get <p>标签信息</p> 
     * @return TagSet <p>标签信息</p>
     */
    public Tag [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set <p>标签信息</p>
     * @param TagSet <p>标签信息</p>
     */
    public void setTagSet(Tag [] TagSet) {
        this.TagSet = TagSet;
    }

    public CustomerGateway() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomerGateway(CustomerGateway source) {
        if (source.CustomerGatewayId != null) {
            this.CustomerGatewayId = new String(source.CustomerGatewayId);
        }
        if (source.CustomerGatewayName != null) {
            this.CustomerGatewayName = new String(source.CustomerGatewayName);
        }
        if (source.IpAddress != null) {
            this.IpAddress = new String(source.IpAddress);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.BgpAsn != null) {
            this.BgpAsn = new Long(source.BgpAsn);
        }
        if (source.VpnConnNum != null) {
            this.VpnConnNum = new Long(source.VpnConnNum);
        }
        if (source.TagSet != null) {
            this.TagSet = new Tag[source.TagSet.length];
            for (int i = 0; i < source.TagSet.length; i++) {
                this.TagSet[i] = new Tag(source.TagSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CustomerGatewayId", this.CustomerGatewayId);
        this.setParamSimple(map, prefix + "CustomerGatewayName", this.CustomerGatewayName);
        this.setParamSimple(map, prefix + "IpAddress", this.IpAddress);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "BgpAsn", this.BgpAsn);
        this.setParamSimple(map, prefix + "VpnConnNum", this.VpnConnNum);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);

    }
}

