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

public class NatGatewayAddress extends AbstractModel {

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
    * 资源封堵类型。NORMAL表示未封禁，SECURITY表示安全封禁，USER表示用户封禁，OTHER表示其他封禁，多个原因封禁时用&连接，比如：SECURITY&USER&OTHER。
    */
    @SerializedName("BlockType")
    @Expose
    private String BlockType;

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
     * Get 资源封堵类型。NORMAL表示未封禁，SECURITY表示安全封禁，USER表示用户封禁，OTHER表示其他封禁，多个原因封禁时用&连接，比如：SECURITY&USER&OTHER。 
     * @return BlockType 资源封堵类型。NORMAL表示未封禁，SECURITY表示安全封禁，USER表示用户封禁，OTHER表示其他封禁，多个原因封禁时用&连接，比如：SECURITY&USER&OTHER。
     */
    public String getBlockType() {
        return this.BlockType;
    }

    /**
     * Set 资源封堵类型。NORMAL表示未封禁，SECURITY表示安全封禁，USER表示用户封禁，OTHER表示其他封禁，多个原因封禁时用&连接，比如：SECURITY&USER&OTHER。
     * @param BlockType 资源封堵类型。NORMAL表示未封禁，SECURITY表示安全封禁，USER表示用户封禁，OTHER表示其他封禁，多个原因封禁时用&连接，比如：SECURITY&USER&OTHER。
     */
    public void setBlockType(String BlockType) {
        this.BlockType = BlockType;
    }

    public NatGatewayAddress() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NatGatewayAddress(NatGatewayAddress source) {
        if (source.AddressId != null) {
            this.AddressId = new String(source.AddressId);
        }
        if (source.PublicIpAddress != null) {
            this.PublicIpAddress = new String(source.PublicIpAddress);
        }
        if (source.IsBlocked != null) {
            this.IsBlocked = new Boolean(source.IsBlocked);
        }
        if (source.BlockType != null) {
            this.BlockType = new String(source.BlockType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AddressId", this.AddressId);
        this.setParamSimple(map, prefix + "PublicIpAddress", this.PublicIpAddress);
        this.setParamSimple(map, prefix + "IsBlocked", this.IsBlocked);
        this.setParamSimple(map, prefix + "BlockType", this.BlockType);

    }
}

