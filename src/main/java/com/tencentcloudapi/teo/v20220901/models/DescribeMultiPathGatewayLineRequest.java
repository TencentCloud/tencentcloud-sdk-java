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

public class DescribeMultiPathGatewayLineRequest extends AbstractModel {

    /**
    * 站点 ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 网关 ID。
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * 线路 ID。
    */
    @SerializedName("LineId")
    @Expose
    private String LineId;

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
     * Get 线路 ID。 
     * @return LineId 线路 ID。
     */
    public String getLineId() {
        return this.LineId;
    }

    /**
     * Set 线路 ID。
     * @param LineId 线路 ID。
     */
    public void setLineId(String LineId) {
        this.LineId = LineId;
    }

    public DescribeMultiPathGatewayLineRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMultiPathGatewayLineRequest(DescribeMultiPathGatewayLineRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.LineId != null) {
            this.LineId = new String(source.LineId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "LineId", this.LineId);

    }
}

