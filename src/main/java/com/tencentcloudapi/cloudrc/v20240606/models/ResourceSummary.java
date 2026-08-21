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
package com.tencentcloudapi.cloudrc.v20240606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceSummary extends AbstractModel {

    /**
    * <p>资源ID</p>
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * <p>资源别名</p>
    */
    @SerializedName("ResourceAlias")
    @Expose
    private String ResourceAlias;

    /**
    * <p>uin</p>
    */
    @SerializedName("Uin")
    @Expose
    private Long Uin;

    /**
    * <p>资源类型</p>
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * <p>地域编码</p>
    */
    @SerializedName("RegionCode")
    @Expose
    private String RegionCode;

    /**
    * <p>可用区编码</p>
    */
    @SerializedName("ZoneCode")
    @Expose
    private String ZoneCode;

    /**
    * <p>付费类型，包括后付费(0)、预付费(1)、预留实例(2)</p>
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * <p>资源创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>资源过期时间</p>
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * <p>内网IP</p>
    */
    @SerializedName("PrivateIpAddress")
    @Expose
    private String [] PrivateIpAddress;

    /**
    * <p>外网IP</p>
    */
    @SerializedName("PublicIpAddress")
    @Expose
    private String [] PublicIpAddress;

    /**
    * <p>标签</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get <p>资源ID</p> 
     * @return ResourceId <p>资源ID</p>
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set <p>资源ID</p>
     * @param ResourceId <p>资源ID</p>
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get <p>资源别名</p> 
     * @return ResourceAlias <p>资源别名</p>
     */
    public String getResourceAlias() {
        return this.ResourceAlias;
    }

    /**
     * Set <p>资源别名</p>
     * @param ResourceAlias <p>资源别名</p>
     */
    public void setResourceAlias(String ResourceAlias) {
        this.ResourceAlias = ResourceAlias;
    }

    /**
     * Get <p>uin</p> 
     * @return Uin <p>uin</p>
     */
    public Long getUin() {
        return this.Uin;
    }

    /**
     * Set <p>uin</p>
     * @param Uin <p>uin</p>
     */
    public void setUin(Long Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>资源类型</p> 
     * @return ResourceType <p>资源类型</p>
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set <p>资源类型</p>
     * @param ResourceType <p>资源类型</p>
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get <p>地域编码</p> 
     * @return RegionCode <p>地域编码</p>
     */
    public String getRegionCode() {
        return this.RegionCode;
    }

    /**
     * Set <p>地域编码</p>
     * @param RegionCode <p>地域编码</p>
     */
    public void setRegionCode(String RegionCode) {
        this.RegionCode = RegionCode;
    }

    /**
     * Get <p>可用区编码</p> 
     * @return ZoneCode <p>可用区编码</p>
     */
    public String getZoneCode() {
        return this.ZoneCode;
    }

    /**
     * Set <p>可用区编码</p>
     * @param ZoneCode <p>可用区编码</p>
     */
    public void setZoneCode(String ZoneCode) {
        this.ZoneCode = ZoneCode;
    }

    /**
     * Get <p>付费类型，包括后付费(0)、预付费(1)、预留实例(2)</p> 
     * @return PayMode <p>付费类型，包括后付费(0)、预付费(1)、预留实例(2)</p>
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>付费类型，包括后付费(0)、预付费(1)、预留实例(2)</p>
     * @param PayMode <p>付费类型，包括后付费(0)、预付费(1)、预留实例(2)</p>
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>资源创建时间</p> 
     * @return CreateTime <p>资源创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>资源创建时间</p>
     * @param CreateTime <p>资源创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>资源过期时间</p> 
     * @return ExpireTime <p>资源过期时间</p>
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>资源过期时间</p>
     * @param ExpireTime <p>资源过期时间</p>
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get <p>内网IP</p> 
     * @return PrivateIpAddress <p>内网IP</p>
     */
    public String [] getPrivateIpAddress() {
        return this.PrivateIpAddress;
    }

    /**
     * Set <p>内网IP</p>
     * @param PrivateIpAddress <p>内网IP</p>
     */
    public void setPrivateIpAddress(String [] PrivateIpAddress) {
        this.PrivateIpAddress = PrivateIpAddress;
    }

    /**
     * Get <p>外网IP</p> 
     * @return PublicIpAddress <p>外网IP</p>
     */
    public String [] getPublicIpAddress() {
        return this.PublicIpAddress;
    }

    /**
     * Set <p>外网IP</p>
     * @param PublicIpAddress <p>外网IP</p>
     */
    public void setPublicIpAddress(String [] PublicIpAddress) {
        this.PublicIpAddress = PublicIpAddress;
    }

    /**
     * Get <p>标签</p> 
     * @return Tags <p>标签</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签</p>
     * @param Tags <p>标签</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public ResourceSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceSummary(ResourceSummary source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.ResourceAlias != null) {
            this.ResourceAlias = new String(source.ResourceAlias);
        }
        if (source.Uin != null) {
            this.Uin = new Long(source.Uin);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.RegionCode != null) {
            this.RegionCode = new String(source.RegionCode);
        }
        if (source.ZoneCode != null) {
            this.ZoneCode = new String(source.ZoneCode);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.PrivateIpAddress != null) {
            this.PrivateIpAddress = new String[source.PrivateIpAddress.length];
            for (int i = 0; i < source.PrivateIpAddress.length; i++) {
                this.PrivateIpAddress[i] = new String(source.PrivateIpAddress[i]);
            }
        }
        if (source.PublicIpAddress != null) {
            this.PublicIpAddress = new String[source.PublicIpAddress.length];
            for (int i = 0; i < source.PublicIpAddress.length; i++) {
                this.PublicIpAddress[i] = new String(source.PublicIpAddress[i]);
            }
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
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ResourceAlias", this.ResourceAlias);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "RegionCode", this.RegionCode);
        this.setParamSimple(map, prefix + "ZoneCode", this.ZoneCode);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamArraySimple(map, prefix + "PrivateIpAddress.", this.PrivateIpAddress);
        this.setParamArraySimple(map, prefix + "PublicIpAddress.", this.PublicIpAddress);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

