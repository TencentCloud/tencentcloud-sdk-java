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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NatGatewayAddress extends AbstractModel{

    /**
    * 弹性公网IP（EIP）的唯一 ID，形如：`eip-11112222`。
    */
    @SerializedName("AddressId")
    @Expose
    private String AddressId;

    /**
    * 外网IP地址，形如：`123.121.34.33`。
    */
    @SerializedName("PublicIpAddress")
    @Expose
    private String PublicIpAddress;

    /**
    * 资源封堵状态。true表示弹性ip处于封堵状态，false表示弹性ip处于未封堵状态。
    */
    @SerializedName("IsBlocked")
    @Expose
    private Boolean IsBlocked;

    /**
     * Get 弹性公网IP（EIP）的唯一 ID，形如：`eip-11112222`。 
     * @return AddressId 弹性公网IP（EIP）的唯一 ID，形如：`eip-11112222`。
     */
    public String getAddressId() {
        return this.AddressId;
    }

    /**
     * Set 弹性公网IP（EIP）的唯一 ID，形如：`eip-11112222`。
     * @param AddressId 弹性公网IP（EIP）的唯一 ID，形如：`eip-11112222`。
     */
    public void setAddressId(String AddressId) {
        this.AddressId = AddressId;
    }

    /**
     * Get 外网IP地址，形如：`123.121.34.33`。 
     * @return PublicIpAddress 外网IP地址，形如：`123.121.34.33`。
     */
    public String getPublicIpAddress() {
        return this.PublicIpAddress;
    }

    /**
     * Set 外网IP地址，形如：`123.121.34.33`。
     * @param PublicIpAddress 外网IP地址，形如：`123.121.34.33`。
     */
    public void setPublicIpAddress(String PublicIpAddress) {
        this.PublicIpAddress = PublicIpAddress;
    }

    /**
     * Get 资源封堵状态。true表示弹性ip处于封堵状态，false表示弹性ip处于未封堵状态。 
     * @return IsBlocked 资源封堵状态。true表示弹性ip处于封堵状态，false表示弹性ip处于未封堵状态。
     */
    public Boolean getIsBlocked() {
        return this.IsBlocked;
    }

    /**
     * Set 资源封堵状态。true表示弹性ip处于封堵状态，false表示弹性ip处于未封堵状态。
     * @param IsBlocked 资源封堵状态。true表示弹性ip处于封堵状态，false表示弹性ip处于未封堵状态。
     */
    public void setIsBlocked(Boolean IsBlocked) {
        this.IsBlocked = IsBlocked;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AddressId", this.AddressId);
        this.setParamSimple(map, prefix + "PublicIpAddress", this.PublicIpAddress);
        this.setParamSimple(map, prefix + "IsBlocked", this.IsBlocked);

    }
}

