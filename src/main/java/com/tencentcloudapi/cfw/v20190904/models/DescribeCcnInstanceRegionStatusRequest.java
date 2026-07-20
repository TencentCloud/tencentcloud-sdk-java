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

public class DescribeCcnInstanceRegionStatusRequest extends AbstractModel {

    /**
    * <p>云联网ID</p>
    */
    @SerializedName("CcnId")
    @Expose
    private String CcnId;

    /**
    * <p>要查询引流网络部署状态的云联网关联的实例ID列表</p>
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * <p>引流路由方法 0:多路由表, 1:策略路由</p>
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
     * Get <p>要查询引流网络部署状态的云联网关联的实例ID列表</p> 
     * @return InstanceIds <p>要查询引流网络部署状态的云联网关联的实例ID列表</p>
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set <p>要查询引流网络部署状态的云联网关联的实例ID列表</p>
     * @param InstanceIds <p>要查询引流网络部署状态的云联网关联的实例ID列表</p>
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get <p>引流路由方法 0:多路由表, 1:策略路由</p> 
     * @return RoutingMode <p>引流路由方法 0:多路由表, 1:策略路由</p>
     */
    public Long getRoutingMode() {
        return this.RoutingMode;
    }

    /**
     * Set <p>引流路由方法 0:多路由表, 1:策略路由</p>
     * @param RoutingMode <p>引流路由方法 0:多路由表, 1:策略路由</p>
     */
    public void setRoutingMode(Long RoutingMode) {
        this.RoutingMode = RoutingMode;
    }

    public DescribeCcnInstanceRegionStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCcnInstanceRegionStatusRequest(DescribeCcnInstanceRegionStatusRequest source) {
        if (source.CcnId != null) {
            this.CcnId = new String(source.CcnId);
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
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
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "RoutingMode", this.RoutingMode);

    }
}

