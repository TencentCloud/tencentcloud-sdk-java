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

public class PrivateIpAddressSpecification extends AbstractModel {

    /**
    * 内网IP地址。
    */
    @SerializedName("PrivateIpAddress")
    @Expose
    private String PrivateIpAddress;

    /**
    * 是否是主IP。
    */
    @SerializedName("Primary")
    @Expose
    private Boolean Primary;

    /**
    * 公网IP地址。
    */
    @SerializedName("PublicIpAddress")
    @Expose
    private String PublicIpAddress;

    /**
    * EIP实例ID，例如：eip-11112222。
    */
    @SerializedName("AddressId")
    @Expose
    private String AddressId;

    /**
    * 内网IP描述信息。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 公网IP是否被封堵。
    */
    @SerializedName("IsWanIpBlocked")
    @Expose
    private Boolean IsWanIpBlocked;

    /**
    * IP状态：
PENDING：生产中
MIGRATING：迁移中
DELETING：删除中
AVAILABLE：可用的
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * IP服务质量等级，可选值：PT（云金）、AU（云银）、AG(云铜）、DEFAULT（默认）。
    */
    @SerializedName("QosLevel")
    @Expose
    private String QosLevel;

    /**
     * Get 内网IP地址。 
     * @return PrivateIpAddress 内网IP地址。
     */
    public String getPrivateIpAddress() {
        return this.PrivateIpAddress;
    }

    /**
     * Set 内网IP地址。
     * @param PrivateIpAddress 内网IP地址。
     */
    public void setPrivateIpAddress(String PrivateIpAddress) {
        this.PrivateIpAddress = PrivateIpAddress;
    }

    /**
     * Get 是否是主IP。 
     * @return Primary 是否是主IP。
     */
    public Boolean getPrimary() {
        return this.Primary;
    }

    /**
     * Set 是否是主IP。
     * @param Primary 是否是主IP。
     */
    public void setPrimary(Boolean Primary) {
        this.Primary = Primary;
    }

    /**
     * Get 公网IP地址。 
     * @return PublicIpAddress 公网IP地址。
     */
    public String getPublicIpAddress() {
        return this.PublicIpAddress;
    }

    /**
     * Set 公网IP地址。
     * @param PublicIpAddress 公网IP地址。
     */
    public void setPublicIpAddress(String PublicIpAddress) {
        this.PublicIpAddress = PublicIpAddress;
    }

    /**
     * Get EIP实例ID，例如：eip-11112222。 
     * @return AddressId EIP实例ID，例如：eip-11112222。
     */
    public String getAddressId() {
        return this.AddressId;
    }

    /**
     * Set EIP实例ID，例如：eip-11112222。
     * @param AddressId EIP实例ID，例如：eip-11112222。
     */
    public void setAddressId(String AddressId) {
        this.AddressId = AddressId;
    }

    /**
     * Get 内网IP描述信息。 
     * @return Description 内网IP描述信息。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 内网IP描述信息。
     * @param Description 内网IP描述信息。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 公网IP是否被封堵。 
     * @return IsWanIpBlocked 公网IP是否被封堵。
     */
    public Boolean getIsWanIpBlocked() {
        return this.IsWanIpBlocked;
    }

    /**
     * Set 公网IP是否被封堵。
     * @param IsWanIpBlocked 公网IP是否被封堵。
     */
    public void setIsWanIpBlocked(Boolean IsWanIpBlocked) {
        this.IsWanIpBlocked = IsWanIpBlocked;
    }

    /**
     * Get IP状态：
PENDING：生产中
MIGRATING：迁移中
DELETING：删除中
AVAILABLE：可用的 
     * @return State IP状态：
PENDING：生产中
MIGRATING：迁移中
DELETING：删除中
AVAILABLE：可用的
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set IP状态：
PENDING：生产中
MIGRATING：迁移中
DELETING：删除中
AVAILABLE：可用的
     * @param State IP状态：
PENDING：生产中
MIGRATING：迁移中
DELETING：删除中
AVAILABLE：可用的
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get IP服务质量等级，可选值：PT（云金）、AU（云银）、AG(云铜）、DEFAULT（默认）。 
     * @return QosLevel IP服务质量等级，可选值：PT（云金）、AU（云银）、AG(云铜）、DEFAULT（默认）。
     */
    public String getQosLevel() {
        return this.QosLevel;
    }

    /**
     * Set IP服务质量等级，可选值：PT（云金）、AU（云银）、AG(云铜）、DEFAULT（默认）。
     * @param QosLevel IP服务质量等级，可选值：PT（云金）、AU（云银）、AG(云铜）、DEFAULT（默认）。
     */
    public void setQosLevel(String QosLevel) {
        this.QosLevel = QosLevel;
    }

    public PrivateIpAddressSpecification() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrivateIpAddressSpecification(PrivateIpAddressSpecification source) {
        if (source.PrivateIpAddress != null) {
            this.PrivateIpAddress = new String(source.PrivateIpAddress);
        }
        if (source.Primary != null) {
            this.Primary = new Boolean(source.Primary);
        }
        if (source.PublicIpAddress != null) {
            this.PublicIpAddress = new String(source.PublicIpAddress);
        }
        if (source.AddressId != null) {
            this.AddressId = new String(source.AddressId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.IsWanIpBlocked != null) {
            this.IsWanIpBlocked = new Boolean(source.IsWanIpBlocked);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.QosLevel != null) {
            this.QosLevel = new String(source.QosLevel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PrivateIpAddress", this.PrivateIpAddress);
        this.setParamSimple(map, prefix + "Primary", this.Primary);
        this.setParamSimple(map, prefix + "PublicIpAddress", this.PublicIpAddress);
        this.setParamSimple(map, prefix + "AddressId", this.AddressId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "IsWanIpBlocked", this.IsWanIpBlocked);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "QosLevel", this.QosLevel);

    }
}

