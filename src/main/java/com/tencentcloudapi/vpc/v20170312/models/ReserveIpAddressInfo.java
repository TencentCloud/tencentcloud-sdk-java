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

public class ReserveIpAddressInfo extends AbstractModel {

    /**
    * 内网保留IP唯一 ID。
    */
    @SerializedName("ReserveIpId")
    @Expose
    private String ReserveIpId;

    /**
    * VPC唯一 ID。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网唯一 ID。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 内网保留IP地址。
    */
    @SerializedName("ReserveIpAddress")
    @Expose
    private String ReserveIpAddress;

    /**
    * 内网保留 IP绑定的资源实例 ID。
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 产品申请的IpType。
    */
    @SerializedName("IpType")
    @Expose
    private Long IpType;

    /**
    * 绑定状态，UnBind-未绑定， Bind-绑定。
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 保留 IP名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 保留 IP描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 创建时间。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 标签键值对。
    */
    @SerializedName("TagSet")
    @Expose
    private Tag [] TagSet;

    /**
     * Get 内网保留IP唯一 ID。 
     * @return ReserveIpId 内网保留IP唯一 ID。
     */
    public String getReserveIpId() {
        return this.ReserveIpId;
    }

    /**
     * Set 内网保留IP唯一 ID。
     * @param ReserveIpId 内网保留IP唯一 ID。
     */
    public void setReserveIpId(String ReserveIpId) {
        this.ReserveIpId = ReserveIpId;
    }

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
     * Get 内网保留IP地址。 
     * @return ReserveIpAddress 内网保留IP地址。
     */
    public String getReserveIpAddress() {
        return this.ReserveIpAddress;
    }

    /**
     * Set 内网保留IP地址。
     * @param ReserveIpAddress 内网保留IP地址。
     */
    public void setReserveIpAddress(String ReserveIpAddress) {
        this.ReserveIpAddress = ReserveIpAddress;
    }

    /**
     * Get 内网保留 IP绑定的资源实例 ID。 
     * @return ResourceId 内网保留 IP绑定的资源实例 ID。
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 内网保留 IP绑定的资源实例 ID。
     * @param ResourceId 内网保留 IP绑定的资源实例 ID。
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 产品申请的IpType。 
     * @return IpType 产品申请的IpType。
     */
    public Long getIpType() {
        return this.IpType;
    }

    /**
     * Set 产品申请的IpType。
     * @param IpType 产品申请的IpType。
     */
    public void setIpType(Long IpType) {
        this.IpType = IpType;
    }

    /**
     * Get 绑定状态，UnBind-未绑定， Bind-绑定。 
     * @return State 绑定状态，UnBind-未绑定， Bind-绑定。
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 绑定状态，UnBind-未绑定， Bind-绑定。
     * @param State 绑定状态，UnBind-未绑定， Bind-绑定。
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 保留 IP名称。 
     * @return Name 保留 IP名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 保留 IP名称。
     * @param Name 保留 IP名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 保留 IP描述。 
     * @return Description 保留 IP描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 保留 IP描述。
     * @param Description 保留 IP描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 创建时间。 
     * @return CreatedTime 创建时间。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间。
     * @param CreatedTime 创建时间。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 标签键值对。 
     * @return TagSet 标签键值对。
     */
    public Tag [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set 标签键值对。
     * @param TagSet 标签键值对。
     */
    public void setTagSet(Tag [] TagSet) {
        this.TagSet = TagSet;
    }

    public ReserveIpAddressInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReserveIpAddressInfo(ReserveIpAddressInfo source) {
        if (source.ReserveIpId != null) {
            this.ReserveIpId = new String(source.ReserveIpId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.ReserveIpAddress != null) {
            this.ReserveIpAddress = new String(source.ReserveIpAddress);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.IpType != null) {
            this.IpType = new Long(source.IpType);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
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
        this.setParamSimple(map, prefix + "ReserveIpId", this.ReserveIpId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "ReserveIpAddress", this.ReserveIpAddress);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "IpType", this.IpType);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);

    }
}

