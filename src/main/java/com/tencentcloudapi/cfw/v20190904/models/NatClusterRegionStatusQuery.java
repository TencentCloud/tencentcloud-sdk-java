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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NatClusterRegionStatusQuery extends AbstractModel {

    /**
    * <p>云联网ID</p>
    */
    @SerializedName("CcnId")
    @Expose
    private String CcnId;

    /**
    * <p>NAT网关ID</p>
    */
    @SerializedName("NatInsId")
    @Expose
    private String NatInsId;

    /**
    * <p>资产类型，取值：nat_ccn-CCN+NAT场景，nat-独立NAT场景</p>
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * <p>引流路由方法，0-多路由表模式，1-策略路由模式</p>
    */
    @SerializedName("RoutingMode")
    @Expose
    private Long RoutingMode;

    /**
     * Get <p>云联网ID</p> 
     * @return CcnId <p>云联网ID</p>
     */
    public String getCcnId() {
        return this.CcnId;
    }

    /**
     * Set <p>云联网ID</p>
     * @param CcnId <p>云联网ID</p>
     */
    public void setCcnId(String CcnId) {
        this.CcnId = CcnId;
    }

    /**
     * Get <p>NAT网关ID</p> 
     * @return NatInsId <p>NAT网关ID</p>
     */
    public String getNatInsId() {
        return this.NatInsId;
    }

    /**
     * Set <p>NAT网关ID</p>
     * @param NatInsId <p>NAT网关ID</p>
     */
    public void setNatInsId(String NatInsId) {
        this.NatInsId = NatInsId;
    }

    /**
     * Get <p>资产类型，取值：nat_ccn-CCN+NAT场景，nat-独立NAT场景</p> 
     * @return AssetType <p>资产类型，取值：nat_ccn-CCN+NAT场景，nat-独立NAT场景</p>
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set <p>资产类型，取值：nat_ccn-CCN+NAT场景，nat-独立NAT场景</p>
     * @param AssetType <p>资产类型，取值：nat_ccn-CCN+NAT场景，nat-独立NAT场景</p>
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get <p>引流路由方法，0-多路由表模式，1-策略路由模式</p> 
     * @return RoutingMode <p>引流路由方法，0-多路由表模式，1-策略路由模式</p>
     */
    public Long getRoutingMode() {
        return this.RoutingMode;
    }

    /**
     * Set <p>引流路由方法，0-多路由表模式，1-策略路由模式</p>
     * @param RoutingMode <p>引流路由方法，0-多路由表模式，1-策略路由模式</p>
     */
    public void setRoutingMode(Long RoutingMode) {
        this.RoutingMode = RoutingMode;
    }

    public NatClusterRegionStatusQuery() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NatClusterRegionStatusQuery(NatClusterRegionStatusQuery source) {
        if (source.CcnId != null) {
            this.CcnId = new String(source.CcnId);
        }
        if (source.NatInsId != null) {
            this.NatInsId = new String(source.NatInsId);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.RoutingMode != null) {
            this.RoutingMode = new Long(source.RoutingMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CcnId", this.CcnId);
        this.setParamSimple(map, prefix + "NatInsId", this.NatInsId);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "RoutingMode", this.RoutingMode);

    }
}

