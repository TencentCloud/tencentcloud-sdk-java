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
package com.tencentcloudapi.edgezone.v20260401.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreatePublicNetworkInstanceRequest extends AbstractModel {

    /**
    * <p>可用区</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>公网实例名称</p>
    */
    @SerializedName("NetworkInstanceName")
    @Expose
    private String NetworkInstanceName;

    /**
    * <p>网络线路</p>
    */
    @SerializedName("Line")
    @Expose
    private String Line;

    /**
    * <p>路由模式</p>
    */
    @SerializedName("RouteMode")
    @Expose
    private String RouteMode;

    /**
    * <p>公网带宽（Mbps）</p>
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * <p>BGP AS号</p>
    */
    @SerializedName("BgpAsNumber")
    @Expose
    private Long BgpAsNumber;

    /**
    * <p>BGP认证密码</p>
    */
    @SerializedName("BgpPassword")
    @Expose
    private String BgpPassword;

    /**
    * <p>公网实例类型</p><p>枚举值：</p><ul><li>standard： 标准型(默认)</li><li>custom： 自定义型(暂不支持创建)</li></ul>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
     * Get <p>可用区</p> 
     * @return ZoneId <p>可用区</p>
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>可用区</p>
     * @param ZoneId <p>可用区</p>
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>公网实例名称</p> 
     * @return NetworkInstanceName <p>公网实例名称</p>
     */
    public String getNetworkInstanceName() {
        return this.NetworkInstanceName;
    }

    /**
     * Set <p>公网实例名称</p>
     * @param NetworkInstanceName <p>公网实例名称</p>
     */
    public void setNetworkInstanceName(String NetworkInstanceName) {
        this.NetworkInstanceName = NetworkInstanceName;
    }

    /**
     * Get <p>网络线路</p> 
     * @return Line <p>网络线路</p>
     */
    public String getLine() {
        return this.Line;
    }

    /**
     * Set <p>网络线路</p>
     * @param Line <p>网络线路</p>
     */
    public void setLine(String Line) {
        this.Line = Line;
    }

    /**
     * Get <p>路由模式</p> 
     * @return RouteMode <p>路由模式</p>
     */
    public String getRouteMode() {
        return this.RouteMode;
    }

    /**
     * Set <p>路由模式</p>
     * @param RouteMode <p>路由模式</p>
     */
    public void setRouteMode(String RouteMode) {
        this.RouteMode = RouteMode;
    }

    /**
     * Get <p>公网带宽（Mbps）</p> 
     * @return Bandwidth <p>公网带宽（Mbps）</p>
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set <p>公网带宽（Mbps）</p>
     * @param Bandwidth <p>公网带宽（Mbps）</p>
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get <p>BGP AS号</p> 
     * @return BgpAsNumber <p>BGP AS号</p>
     */
    public Long getBgpAsNumber() {
        return this.BgpAsNumber;
    }

    /**
     * Set <p>BGP AS号</p>
     * @param BgpAsNumber <p>BGP AS号</p>
     */
    public void setBgpAsNumber(Long BgpAsNumber) {
        this.BgpAsNumber = BgpAsNumber;
    }

    /**
     * Get <p>BGP认证密码</p> 
     * @return BgpPassword <p>BGP认证密码</p>
     */
    public String getBgpPassword() {
        return this.BgpPassword;
    }

    /**
     * Set <p>BGP认证密码</p>
     * @param BgpPassword <p>BGP认证密码</p>
     */
    public void setBgpPassword(String BgpPassword) {
        this.BgpPassword = BgpPassword;
    }

    /**
     * Get <p>公网实例类型</p><p>枚举值：</p><ul><li>standard： 标准型(默认)</li><li>custom： 自定义型(暂不支持创建)</li></ul> 
     * @return InstanceType <p>公网实例类型</p><p>枚举值：</p><ul><li>standard： 标准型(默认)</li><li>custom： 自定义型(暂不支持创建)</li></ul>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>公网实例类型</p><p>枚举值：</p><ul><li>standard： 标准型(默认)</li><li>custom： 自定义型(暂不支持创建)</li></ul>
     * @param InstanceType <p>公网实例类型</p><p>枚举值：</p><ul><li>standard： 标准型(默认)</li><li>custom： 自定义型(暂不支持创建)</li></ul>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    public CreatePublicNetworkInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreatePublicNetworkInstanceRequest(CreatePublicNetworkInstanceRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.NetworkInstanceName != null) {
            this.NetworkInstanceName = new String(source.NetworkInstanceName);
        }
        if (source.Line != null) {
            this.Line = new String(source.Line);
        }
        if (source.RouteMode != null) {
            this.RouteMode = new String(source.RouteMode);
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
        if (source.BgpAsNumber != null) {
            this.BgpAsNumber = new Long(source.BgpAsNumber);
        }
        if (source.BgpPassword != null) {
            this.BgpPassword = new String(source.BgpPassword);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "NetworkInstanceName", this.NetworkInstanceName);
        this.setParamSimple(map, prefix + "Line", this.Line);
        this.setParamSimple(map, prefix + "RouteMode", this.RouteMode);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "BgpAsNumber", this.BgpAsNumber);
        this.setParamSimple(map, prefix + "BgpPassword", this.BgpPassword);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);

    }
}

