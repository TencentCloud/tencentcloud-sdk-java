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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NatSnatRuleItem extends AbstractModel {

    /**
    * <p>网关SNat ID</p>
    */
    @SerializedName("NatGatewaySnatId")
    @Expose
    private String NatGatewaySnatId;

    /**
    * <p>资源ID</p>
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * <p>资源类型</p>
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * <p>内网IP地址</p>
    */
    @SerializedName("PrivateIpAddress")
    @Expose
    private String PrivateIpAddress;

    /**
    * <p>公网IP地址</p>
    */
    @SerializedName("PublicIpAddresses")
    @Expose
    private String PublicIpAddresses;

    /**
    * <p>描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
     * Get <p>网关SNat ID</p> 
     * @return NatGatewaySnatId <p>网关SNat ID</p>
     */
    public String getNatGatewaySnatId() {
        return this.NatGatewaySnatId;
    }

    /**
     * Set <p>网关SNat ID</p>
     * @param NatGatewaySnatId <p>网关SNat ID</p>
     */
    public void setNatGatewaySnatId(String NatGatewaySnatId) {
        this.NatGatewaySnatId = NatGatewaySnatId;
    }

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
     * Get <p>内网IP地址</p> 
     * @return PrivateIpAddress <p>内网IP地址</p>
     */
    public String getPrivateIpAddress() {
        return this.PrivateIpAddress;
    }

    /**
     * Set <p>内网IP地址</p>
     * @param PrivateIpAddress <p>内网IP地址</p>
     */
    public void setPrivateIpAddress(String PrivateIpAddress) {
        this.PrivateIpAddress = PrivateIpAddress;
    }

    /**
     * Get <p>公网IP地址</p> 
     * @return PublicIpAddresses <p>公网IP地址</p>
     */
    public String getPublicIpAddresses() {
        return this.PublicIpAddresses;
    }

    /**
     * Set <p>公网IP地址</p>
     * @param PublicIpAddresses <p>公网IP地址</p>
     */
    public void setPublicIpAddresses(String PublicIpAddresses) {
        this.PublicIpAddresses = PublicIpAddresses;
    }

    /**
     * Get <p>描述</p> 
     * @return Description <p>描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述</p>
     * @param Description <p>描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
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

    public NatSnatRuleItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NatSnatRuleItem(NatSnatRuleItem source) {
        if (source.NatGatewaySnatId != null) {
            this.NatGatewaySnatId = new String(source.NatGatewaySnatId);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.PrivateIpAddress != null) {
            this.PrivateIpAddress = new String(source.PrivateIpAddress);
        }
        if (source.PublicIpAddresses != null) {
            this.PublicIpAddresses = new String(source.PublicIpAddresses);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NatGatewaySnatId", this.NatGatewaySnatId);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "PrivateIpAddress", this.PrivateIpAddress);
        this.setParamSimple(map, prefix + "PublicIpAddresses", this.PublicIpAddresses);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);

    }
}

