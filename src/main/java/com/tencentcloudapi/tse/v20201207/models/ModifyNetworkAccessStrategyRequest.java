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
    * <p>云原生API网关实例ID。</p>
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * <p>分组id</p>
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * <p>网络类型： </p><ul><li>Open 公网</li><li>Internal 内网    （暂不支持）</li></ul>
    */
    @SerializedName("NetworkType")
    @Expose
    private String NetworkType;

    /**
    * <p>ip地址</p>
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * <p>访问控制策略</p>
    */
    @SerializedName("AccessControl")
    @Expose
    private NetworkAccessControl AccessControl;

    /**
    * <p>GlobalConfig / Custom；不传默认 Custom</p>
    */
    @SerializedName("AccessControlSource")
    @Expose
    private String AccessControlSource;

    /**
    * <p>全局配置ID</p>
    */
    @SerializedName("GlobalConfigId")
    @Expose
    private String GlobalConfigId;

    /**
     * Get <p>云原生API网关实例ID。</p> 
     * @return GatewayId <p>云原生API网关实例ID。</p>
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set <p>云原生API网关实例ID。</p>
     * @param GatewayId <p>云原生API网关实例ID。</p>
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get <p>分组id</p> 
     * @return GroupId <p>分组id</p>
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set <p>分组id</p>
     * @param GroupId <p>分组id</p>
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get <p>网络类型： </p><ul><li>Open 公网</li><li>Internal 内网    （暂不支持）</li></ul> 
     * @return NetworkType <p>网络类型： </p><ul><li>Open 公网</li><li>Internal 内网    （暂不支持）</li></ul>
     */
    public String getNetworkType() {
        return this.NetworkType;
    }

    /**
     * Set <p>网络类型： </p><ul><li>Open 公网</li><li>Internal 内网    （暂不支持）</li></ul>
     * @param NetworkType <p>网络类型： </p><ul><li>Open 公网</li><li>Internal 内网    （暂不支持）</li></ul>
     */
    public void setNetworkType(String NetworkType) {
        this.NetworkType = NetworkType;
    }

    /**
     * Get <p>ip地址</p> 
     * @return Vip <p>ip地址</p>
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set <p>ip地址</p>
     * @param Vip <p>ip地址</p>
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get <p>访问控制策略</p> 
     * @return AccessControl <p>访问控制策略</p>
     */
    public NetworkAccessControl getAccessControl() {
        return this.AccessControl;
    }

    /**
     * Set <p>访问控制策略</p>
     * @param AccessControl <p>访问控制策略</p>
     */
    public void setAccessControl(NetworkAccessControl AccessControl) {
        this.AccessControl = AccessControl;
    }

    /**
     * Get <p>GlobalConfig / Custom；不传默认 Custom</p> 
     * @return AccessControlSource <p>GlobalConfig / Custom；不传默认 Custom</p>
     */
    public String getAccessControlSource() {
        return this.AccessControlSource;
    }

    /**
     * Set <p>GlobalConfig / Custom；不传默认 Custom</p>
     * @param AccessControlSource <p>GlobalConfig / Custom；不传默认 Custom</p>
     */
    public void setAccessControlSource(String AccessControlSource) {
        this.AccessControlSource = AccessControlSource;
    }

    /**
     * Get <p>全局配置ID</p> 
     * @return GlobalConfigId <p>全局配置ID</p>
     */
    public String getGlobalConfigId() {
        return this.GlobalConfigId;
    }

    /**
     * Set <p>全局配置ID</p>
     * @param GlobalConfigId <p>全局配置ID</p>
     */
    public void setGlobalConfigId(String GlobalConfigId) {
        this.GlobalConfigId = GlobalConfigId;
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
        if (source.AccessControlSource != null) {
            this.AccessControlSource = new String(source.AccessControlSource);
        }
        if (source.GlobalConfigId != null) {
            this.GlobalConfigId = new String(source.GlobalConfigId);
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
        this.setParamSimple(map, prefix + "AccessControlSource", this.AccessControlSource);
        this.setParamSimple(map, prefix + "GlobalConfigId", this.GlobalConfigId);

    }
}

