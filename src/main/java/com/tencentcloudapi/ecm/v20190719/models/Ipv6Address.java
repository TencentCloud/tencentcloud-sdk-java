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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Ipv6Address extends AbstractModel{

    /**
    * IPv6地址，形如：3402:4e00:20:100:0:8cd9:2a67:71f3
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * 是否是主IP。
    */
    @SerializedName("Primary")
    @Expose
    private Boolean Primary;

    /**
    * EIP实例ID，形如：eip-hxlqja90。
    */
    @SerializedName("AddressId")
    @Expose
    private String AddressId;

    /**
    * 描述信息。
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
    * IPv6地址状态：
PENDING：生产中
MIGRATING：迁移中
DELETING：删除中
AVAILABLE：可用的
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
     * Get IPv6地址，形如：3402:4e00:20:100:0:8cd9:2a67:71f3 
     * @return Address IPv6地址，形如：3402:4e00:20:100:0:8cd9:2a67:71f3
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set IPv6地址，形如：3402:4e00:20:100:0:8cd9:2a67:71f3
     * @param Address IPv6地址，形如：3402:4e00:20:100:0:8cd9:2a67:71f3
     */
    public void setAddress(String Address) {
        this.Address = Address;
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
     * Get EIP实例ID，形如：eip-hxlqja90。 
     * @return AddressId EIP实例ID，形如：eip-hxlqja90。
     */
    public String getAddressId() {
        return this.AddressId;
    }

    /**
     * Set EIP实例ID，形如：eip-hxlqja90。
     * @param AddressId EIP实例ID，形如：eip-hxlqja90。
     */
    public void setAddressId(String AddressId) {
        this.AddressId = AddressId;
    }

    /**
     * Get 描述信息。 
     * @return Description 描述信息。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述信息。
     * @param Description 描述信息。
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
     * Get IPv6地址状态：
PENDING：生产中
MIGRATING：迁移中
DELETING：删除中
AVAILABLE：可用的 
     * @return State IPv6地址状态：
PENDING：生产中
MIGRATING：迁移中
DELETING：删除中
AVAILABLE：可用的
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set IPv6地址状态：
PENDING：生产中
MIGRATING：迁移中
DELETING：删除中
AVAILABLE：可用的
     * @param State IPv6地址状态：
PENDING：生产中
MIGRATING：迁移中
DELETING：删除中
AVAILABLE：可用的
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "Primary", this.Primary);
        this.setParamSimple(map, prefix + "AddressId", this.AddressId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "IsWanIpBlocked", this.IsWanIpBlocked);
        this.setParamSimple(map, prefix + "State", this.State);

    }
}

