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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyNetworkAccessStrategyRequest extends AbstractModel {

    /**
    * 云原生API网关实例ID。
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * 分组id
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 网络类型： 
- Open 公网
- Internal 内网	（暂不支持）
    */
    @SerializedName("NetworkType")
    @Expose
    private String NetworkType;

    /**
    * ip地址
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 访问控制策略
    */
    @SerializedName("AccessControl")
    @Expose
    private NetworkAccessControl AccessControl;

    /**
     * Get 云原生API网关实例ID。 
     * @return GatewayId 云原生API网关实例ID。
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set 云原生API网关实例ID。
     * @param GatewayId 云原生API网关实例ID。
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get 分组id 
     * @return GroupId 分组id
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 分组id
     * @param GroupId 分组id
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 网络类型： 
- Open 公网
- Internal 内网	（暂不支持） 
     * @return NetworkType 网络类型： 
- Open 公网
- Internal 内网	（暂不支持）
     */
    public String getNetworkType() {
        return this.NetworkType;
    }

    /**
     * Set 网络类型： 
- Open 公网
- Internal 内网	（暂不支持）
     * @param NetworkType 网络类型： 
- Open 公网
- Internal 内网	（暂不支持）
     */
    public void setNetworkType(String NetworkType) {
        this.NetworkType = NetworkType;
    }

    /**
     * Get ip地址 
     * @return Vip ip地址
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set ip地址
     * @param Vip ip地址
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 访问控制策略 
     * @return AccessControl 访问控制策略
     */
    public NetworkAccessControl getAccessControl() {
        return this.AccessControl;
    }

    /**
     * Set 访问控制策略
     * @param AccessControl 访问控制策略
     */
    public void setAccessControl(NetworkAccessControl AccessControl) {
        this.AccessControl = AccessControl;
    }

    public ModifyNetworkAccessStrategyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyNetworkAccessStrategyRequest(ModifyNetworkAccessStrategyRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.NetworkType != null) {
            this.NetworkType = new String(source.NetworkType);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.AccessControl != null) {
            this.AccessControl = new NetworkAccessControl(source.AccessControl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "NetworkType", this.NetworkType);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamObj(map, prefix + "AccessControl.", this.AccessControl);

    }
}

