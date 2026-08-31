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

public class CcnRoute extends AbstractModel {

    /**
    * <p>路由策略ID</p>
    */
    @SerializedName("RouteId")
    @Expose
    private String RouteId;

    /**
    * <p>目的端</p>
    */
    @SerializedName("DestinationCidrBlock")
    @Expose
    private String DestinationCidrBlock;

    /**
    * <p>下一跳类型（关联实例类型），所有类型：VPC、DIRECTCONNECT</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * <p>下一跳（关联实例）</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>下一跳名称（关联实例名称）</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>下一跳所属地域（关联实例所属地域）</p>
    */
    @SerializedName("InstanceRegion")
    @Expose
    private String InstanceRegion;

    /**
    * <p>更新时间</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>路由是否启用</p>
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * <p>关联实例所属UIN（根账号）</p>
    */
    @SerializedName("InstanceUin")
    @Expose
    private String InstanceUin;

    /**
    * <p>路由的扩展状态</p>
    */
    @SerializedName("ExtraState")
    @Expose
    private String ExtraState;

    /**
    * <p>是否动态路由</p>
    */
    @SerializedName("IsBgp")
    @Expose
    private Boolean IsBgp;

    /**
    * <p>路由优先级</p>
    */
    @SerializedName("RoutePriority")
    @Expose
    private Long RoutePriority;

    /**
    * <p>下一跳扩展名称（关联实例的扩展名称）</p>
    */
    @SerializedName("InstanceExtraName")
    @Expose
    private String InstanceExtraName;

    /**
    * <p>实例类型</p>
    */
    @SerializedName("AliasType")
    @Expose
    private String AliasType;

    /**
    * <p>实例id</p>
    */
    @SerializedName("AliasInstanceId")
    @Expose
    private String AliasInstanceId;

    /**
    * <p>路由表ID</p>
    */
    @SerializedName("RouteTableId")
    @Expose
    private String RouteTableId;

    /**
    * <p>AS-PATH</p>
    */
    @SerializedName("AsPath")
    @Expose
    private String AsPath;

    /**
     * Get <p>路由策略ID</p> 
     * @return RouteId <p>路由策略ID</p>
     */
    public String getRouteId() {
        return this.RouteId;
    }

    /**
     * Set <p>路由策略ID</p>
     * @param RouteId <p>路由策略ID</p>
     */
    public void setRouteId(String RouteId) {
        this.RouteId = RouteId;
    }

    /**
     * Get <p>目的端</p> 
     * @return DestinationCidrBlock <p>目的端</p>
     */
    public String getDestinationCidrBlock() {
        return this.DestinationCidrBlock;
    }

    /**
     * Set <p>目的端</p>
     * @param DestinationCidrBlock <p>目的端</p>
     */
    public void setDestinationCidrBlock(String DestinationCidrBlock) {
        this.DestinationCidrBlock = DestinationCidrBlock;
    }

    /**
     * Get <p>下一跳类型（关联实例类型），所有类型：VPC、DIRECTCONNECT</p> 
     * @return InstanceType <p>下一跳类型（关联实例类型），所有类型：VPC、DIRECTCONNECT</p>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>下一跳类型（关联实例类型），所有类型：VPC、DIRECTCONNECT</p>
     * @param InstanceType <p>下一跳类型（关联实例类型），所有类型：VPC、DIRECTCONNECT</p>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>下一跳（关联实例）</p> 
     * @return InstanceId <p>下一跳（关联实例）</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>下一跳（关联实例）</p>
     * @param InstanceId <p>下一跳（关联实例）</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>下一跳名称（关联实例名称）</p> 
     * @return InstanceName <p>下一跳名称（关联实例名称）</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>下一跳名称（关联实例名称）</p>
     * @param InstanceName <p>下一跳名称（关联实例名称）</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>下一跳所属地域（关联实例所属地域）</p> 
     * @return InstanceRegion <p>下一跳所属地域（关联实例所属地域）</p>
     */
    public String getInstanceRegion() {
        return this.InstanceRegion;
    }

    /**
     * Set <p>下一跳所属地域（关联实例所属地域）</p>
     * @param InstanceRegion <p>下一跳所属地域（关联实例所属地域）</p>
     */
    public void setInstanceRegion(String InstanceRegion) {
        this.InstanceRegion = InstanceRegion;
    }

    /**
     * Get <p>更新时间</p> 
     * @return UpdateTime <p>更新时间</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间</p>
     * @param UpdateTime <p>更新时间</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>路由是否启用</p> 
     * @return Enabled <p>路由是否启用</p>
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set <p>路由是否启用</p>
     * @param Enabled <p>路由是否启用</p>
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get <p>关联实例所属UIN（根账号）</p> 
     * @return InstanceUin <p>关联实例所属UIN（根账号）</p>
     */
    public String getInstanceUin() {
        return this.InstanceUin;
    }

    /**
     * Set <p>关联实例所属UIN（根账号）</p>
     * @param InstanceUin <p>关联实例所属UIN（根账号）</p>
     */
    public void setInstanceUin(String InstanceUin) {
        this.InstanceUin = InstanceUin;
    }

    /**
     * Get <p>路由的扩展状态</p> 
     * @return ExtraState <p>路由的扩展状态</p>
     */
    public String getExtraState() {
        return this.ExtraState;
    }

    /**
     * Set <p>路由的扩展状态</p>
     * @param ExtraState <p>路由的扩展状态</p>
     */
    public void setExtraState(String ExtraState) {
        this.ExtraState = ExtraState;
    }

    /**
     * Get <p>是否动态路由</p> 
     * @return IsBgp <p>是否动态路由</p>
     */
    public Boolean getIsBgp() {
        return this.IsBgp;
    }

    /**
     * Set <p>是否动态路由</p>
     * @param IsBgp <p>是否动态路由</p>
     */
    public void setIsBgp(Boolean IsBgp) {
        this.IsBgp = IsBgp;
    }

    /**
     * Get <p>路由优先级</p> 
     * @return RoutePriority <p>路由优先级</p>
     */
    public Long getRoutePriority() {
        return this.RoutePriority;
    }

    /**
     * Set <p>路由优先级</p>
     * @param RoutePriority <p>路由优先级</p>
     */
    public void setRoutePriority(Long RoutePriority) {
        this.RoutePriority = RoutePriority;
    }

    /**
     * Get <p>下一跳扩展名称（关联实例的扩展名称）</p> 
     * @return InstanceExtraName <p>下一跳扩展名称（关联实例的扩展名称）</p>
     */
    public String getInstanceExtraName() {
        return this.InstanceExtraName;
    }

    /**
     * Set <p>下一跳扩展名称（关联实例的扩展名称）</p>
     * @param InstanceExtraName <p>下一跳扩展名称（关联实例的扩展名称）</p>
     */
    public void setInstanceExtraName(String InstanceExtraName) {
        this.InstanceExtraName = InstanceExtraName;
    }

    /**
     * Get <p>实例类型</p> 
     * @return AliasType <p>实例类型</p>
     */
    public String getAliasType() {
        return this.AliasType;
    }

    /**
     * Set <p>实例类型</p>
     * @param AliasType <p>实例类型</p>
     */
    public void setAliasType(String AliasType) {
        this.AliasType = AliasType;
    }

    /**
     * Get <p>实例id</p> 
     * @return AliasInstanceId <p>实例id</p>
     */
    public String getAliasInstanceId() {
        return this.AliasInstanceId;
    }

    /**
     * Set <p>实例id</p>
     * @param AliasInstanceId <p>实例id</p>
     */
    public void setAliasInstanceId(String AliasInstanceId) {
        this.AliasInstanceId = AliasInstanceId;
    }

    /**
     * Get <p>路由表ID</p> 
     * @return RouteTableId <p>路由表ID</p>
     */
    public String getRouteTableId() {
        return this.RouteTableId;
    }

    /**
     * Set <p>路由表ID</p>
     * @param RouteTableId <p>路由表ID</p>
     */
    public void setRouteTableId(String RouteTableId) {
        this.RouteTableId = RouteTableId;
    }

    /**
     * Get <p>AS-PATH</p> 
     * @return AsPath <p>AS-PATH</p>
     */
    public String getAsPath() {
        return this.AsPath;
    }

    /**
     * Set <p>AS-PATH</p>
     * @param AsPath <p>AS-PATH</p>
     */
    public void setAsPath(String AsPath) {
        this.AsPath = AsPath;
    }

    public CcnRoute() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CcnRoute(CcnRoute source) {
        if (source.RouteId != null) {
            this.RouteId = new String(source.RouteId);
        }
        if (source.DestinationCidrBlock != null) {
            this.DestinationCidrBlock = new String(source.DestinationCidrBlock);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceRegion != null) {
            this.InstanceRegion = new String(source.InstanceRegion);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.InstanceUin != null) {
            this.InstanceUin = new String(source.InstanceUin);
        }
        if (source.ExtraState != null) {
            this.ExtraState = new String(source.ExtraState);
        }
        if (source.IsBgp != null) {
            this.IsBgp = new Boolean(source.IsBgp);
        }
        if (source.RoutePriority != null) {
            this.RoutePriority = new Long(source.RoutePriority);
        }
        if (source.InstanceExtraName != null) {
            this.InstanceExtraName = new String(source.InstanceExtraName);
        }
        if (source.AliasType != null) {
            this.AliasType = new String(source.AliasType);
        }
        if (source.AliasInstanceId != null) {
            this.AliasInstanceId = new String(source.AliasInstanceId);
        }
        if (source.RouteTableId != null) {
            this.RouteTableId = new String(source.RouteTableId);
        }
        if (source.AsPath != null) {
            this.AsPath = new String(source.AsPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RouteId", this.RouteId);
        this.setParamSimple(map, prefix + "DestinationCidrBlock", this.DestinationCidrBlock);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceRegion", this.InstanceRegion);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "InstanceUin", this.InstanceUin);
        this.setParamSimple(map, prefix + "ExtraState", this.ExtraState);
        this.setParamSimple(map, prefix + "IsBgp", this.IsBgp);
        this.setParamSimple(map, prefix + "RoutePriority", this.RoutePriority);
        this.setParamSimple(map, prefix + "InstanceExtraName", this.InstanceExtraName);
        this.setParamSimple(map, prefix + "AliasType", this.AliasType);
        this.setParamSimple(map, prefix + "AliasInstanceId", this.AliasInstanceId);
        this.setParamSimple(map, prefix + "RouteTableId", this.RouteTableId);
        this.setParamSimple(map, prefix + "AsPath", this.AsPath);

    }
}

