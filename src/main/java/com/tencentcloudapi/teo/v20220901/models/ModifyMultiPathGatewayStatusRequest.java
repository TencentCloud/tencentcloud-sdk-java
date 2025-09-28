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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyMultiPathGatewayStatusRequest extends AbstractModel {

    /**
    * 网关 ID。
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * 站点 ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 修改网关的启用停用状态，取值有：<li> offline：停用；</li><li> online：启用。</li>
    */
    @SerializedName("GatewayStatus")
    @Expose
    private String GatewayStatus;

    /**
     * Get 网关 ID。 
     * @return GatewayId 网关 ID。
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set 网关 ID。
     * @param GatewayId 网关 ID。
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get 站点 ID。 
     * @return ZoneId 站点 ID。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点 ID。
     * @param ZoneId 站点 ID。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 修改网关的启用停用状态，取值有：<li> offline：停用；</li><li> online：启用。</li> 
     * @return GatewayStatus 修改网关的启用停用状态，取值有：<li> offline：停用；</li><li> online：启用。</li>
     */
    public String getGatewayStatus() {
        return this.GatewayStatus;
    }

    /**
     * Set 修改网关的启用停用状态，取值有：<li> offline：停用；</li><li> online：启用。</li>
     * @param GatewayStatus 修改网关的启用停用状态，取值有：<li> offline：停用；</li><li> online：启用。</li>
     */
    public void setGatewayStatus(String GatewayStatus) {
        this.GatewayStatus = GatewayStatus;
    }

    public ModifyMultiPathGatewayStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyMultiPathGatewayStatusRequest(ModifyMultiPathGatewayStatusRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.GatewayStatus != null) {
            this.GatewayStatus = new String(source.GatewayStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "GatewayStatus", this.GatewayStatus);

    }
}

