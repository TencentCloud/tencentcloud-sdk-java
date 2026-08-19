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

public class CcnInstance extends AbstractModel {

    /**
    * <p>关联实例ID。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>关联实例ID所属大区，例如：ap-guangzhou。</p>
    */
    @SerializedName("InstanceRegion")
    @Expose
    private String InstanceRegion;

    /**
    * <p>关联实例类型，可选值：</p><li><code>VPC</code>：私有网络</li><li><code>DIRECTCONNECT</code>：专线网关</li><li><code>BMVPC</code>：黑石私有网络</li><li><code>VPNGW</code>：VPNGW类型</li>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * <p>备注</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>实例关联的路由表ID。</p>
    */
    @SerializedName("RouteTableId")
    @Expose
    private String RouteTableId;

    /**
    * <p>实例付费方式</p><p>枚举值：</p><ul><li>PayByCcnOwner： CCN所在账号付费</li><li>PayByInstanceOwner： 关联实例所在账号付费</li></ul>
    */
    @SerializedName("OrderType")
    @Expose
    private String OrderType;

    /**
     * Get <p>关联实例ID。</p> 
     * @return InstanceId <p>关联实例ID。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>关联实例ID。</p>
     * @param InstanceId <p>关联实例ID。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>关联实例ID所属大区，例如：ap-guangzhou。</p> 
     * @return InstanceRegion <p>关联实例ID所属大区，例如：ap-guangzhou。</p>
     */
    public String getInstanceRegion() {
        return this.InstanceRegion;
    }

    /**
     * Set <p>关联实例ID所属大区，例如：ap-guangzhou。</p>
     * @param InstanceRegion <p>关联实例ID所属大区，例如：ap-guangzhou。</p>
     */
    public void setInstanceRegion(String InstanceRegion) {
        this.InstanceRegion = InstanceRegion;
    }

    /**
     * Get <p>关联实例类型，可选值：</p><li><code>VPC</code>：私有网络</li><li><code>DIRECTCONNECT</code>：专线网关</li><li><code>BMVPC</code>：黑石私有网络</li><li><code>VPNGW</code>：VPNGW类型</li> 
     * @return InstanceType <p>关联实例类型，可选值：</p><li><code>VPC</code>：私有网络</li><li><code>DIRECTCONNECT</code>：专线网关</li><li><code>BMVPC</code>：黑石私有网络</li><li><code>VPNGW</code>：VPNGW类型</li>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>关联实例类型，可选值：</p><li><code>VPC</code>：私有网络</li><li><code>DIRECTCONNECT</code>：专线网关</li><li><code>BMVPC</code>：黑石私有网络</li><li><code>VPNGW</code>：VPNGW类型</li>
     * @param InstanceType <p>关联实例类型，可选值：</p><li><code>VPC</code>：私有网络</li><li><code>DIRECTCONNECT</code>：专线网关</li><li><code>BMVPC</code>：黑石私有网络</li><li><code>VPNGW</code>：VPNGW类型</li>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>备注</p> 
     * @return Description <p>备注</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>备注</p>
     * @param Description <p>备注</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>实例关联的路由表ID。</p> 
     * @return RouteTableId <p>实例关联的路由表ID。</p>
     */
    public String getRouteTableId() {
        return this.RouteTableId;
    }

    /**
     * Set <p>实例关联的路由表ID。</p>
     * @param RouteTableId <p>实例关联的路由表ID。</p>
     */
    public void setRouteTableId(String RouteTableId) {
        this.RouteTableId = RouteTableId;
    }

    /**
     * Get <p>实例付费方式</p><p>枚举值：</p><ul><li>PayByCcnOwner： CCN所在账号付费</li><li>PayByInstanceOwner： 关联实例所在账号付费</li></ul> 
     * @return OrderType <p>实例付费方式</p><p>枚举值：</p><ul><li>PayByCcnOwner： CCN所在账号付费</li><li>PayByInstanceOwner： 关联实例所在账号付费</li></ul>
     */
    public String getOrderType() {
        return this.OrderType;
    }

    /**
     * Set <p>实例付费方式</p><p>枚举值：</p><ul><li>PayByCcnOwner： CCN所在账号付费</li><li>PayByInstanceOwner： 关联实例所在账号付费</li></ul>
     * @param OrderType <p>实例付费方式</p><p>枚举值：</p><ul><li>PayByCcnOwner： CCN所在账号付费</li><li>PayByInstanceOwner： 关联实例所在账号付费</li></ul>
     */
    public void setOrderType(String OrderType) {
        this.OrderType = OrderType;
    }

    public CcnInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CcnInstance(CcnInstance source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceRegion != null) {
            this.InstanceRegion = new String(source.InstanceRegion);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.RouteTableId != null) {
            this.RouteTableId = new String(source.RouteTableId);
        }
        if (source.OrderType != null) {
            this.OrderType = new String(source.OrderType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceRegion", this.InstanceRegion);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "RouteTableId", this.RouteTableId);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);

    }
}

