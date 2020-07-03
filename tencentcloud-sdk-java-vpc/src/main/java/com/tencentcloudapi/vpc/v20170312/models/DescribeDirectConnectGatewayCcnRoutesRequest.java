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

public class DescribeDirectConnectGatewayCcnRoutesRequest extends AbstractModel{

    /**
    * 专线网关ID，形如：`dcg-prpqlmg1`。
    */
    @SerializedName("DirectConnectGatewayId")
    @Expose
    private String DirectConnectGatewayId;

    /**
    * 云联网路由学习类型，可选值：
<li>`BGP` - 自动学习。</li>
<li>`STATIC` - 静态，即用户配置，默认值。</li>
    */
    @SerializedName("CcnRouteType")
    @Expose
    private String CcnRouteType;

    /**
    * 偏移量。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 专线网关ID，形如：`dcg-prpqlmg1`。 
     * @return DirectConnectGatewayId 专线网关ID，形如：`dcg-prpqlmg1`。
     */
    public String getDirectConnectGatewayId() {
        return this.DirectConnectGatewayId;
    }

    /**
     * Set 专线网关ID，形如：`dcg-prpqlmg1`。
     * @param DirectConnectGatewayId 专线网关ID，形如：`dcg-prpqlmg1`。
     */
    public void setDirectConnectGatewayId(String DirectConnectGatewayId) {
        this.DirectConnectGatewayId = DirectConnectGatewayId;
    }

    /**
     * Get 云联网路由学习类型，可选值：
<li>`BGP` - 自动学习。</li>
<li>`STATIC` - 静态，即用户配置，默认值。</li> 
     * @return CcnRouteType 云联网路由学习类型，可选值：
<li>`BGP` - 自动学习。</li>
<li>`STATIC` - 静态，即用户配置，默认值。</li>
     */
    public String getCcnRouteType() {
        return this.CcnRouteType;
    }

    /**
     * Set 云联网路由学习类型，可选值：
<li>`BGP` - 自动学习。</li>
<li>`STATIC` - 静态，即用户配置，默认值。</li>
     * @param CcnRouteType 云联网路由学习类型，可选值：
<li>`BGP` - 自动学习。</li>
<li>`STATIC` - 静态，即用户配置，默认值。</li>
     */
    public void setCcnRouteType(String CcnRouteType) {
        this.CcnRouteType = CcnRouteType;
    }

    /**
     * Get 偏移量。 
     * @return Offset 偏移量。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量。
     * @param Offset 偏移量。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量。 
     * @return Limit 返回数量。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量。
     * @param Limit 返回数量。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DirectConnectGatewayId", this.DirectConnectGatewayId);
        this.setParamSimple(map, prefix + "CcnRouteType", this.CcnRouteType);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

