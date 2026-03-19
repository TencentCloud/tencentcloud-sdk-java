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
package com.tencentcloudapi.ga2.v20250115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCrossBorderSettlementRequest extends AbstractModel {

    /**
    * 全球加速实例ID。
    */
    @SerializedName("GlobalAcceleratorId")
    @Expose
    private String GlobalAcceleratorId;

    /**
    * 加速地域。
    */
    @SerializedName("AccelerateRegion")
    @Expose
    private String AccelerateRegion;

    /**
    * 终端节点组地域。
    */
    @SerializedName("EndpointGroupRegion")
    @Expose
    private String EndpointGroupRegion;

    /**
    * 账单年月时间。
    */
    @SerializedName("SettlementMonth")
    @Expose
    private Long SettlementMonth;

    /**
     * Get 全球加速实例ID。 
     * @return GlobalAcceleratorId 全球加速实例ID。
     */
    public String getGlobalAcceleratorId() {
        return this.GlobalAcceleratorId;
    }

    /**
     * Set 全球加速实例ID。
     * @param GlobalAcceleratorId 全球加速实例ID。
     */
    public void setGlobalAcceleratorId(String GlobalAcceleratorId) {
        this.GlobalAcceleratorId = GlobalAcceleratorId;
    }

    /**
     * Get 加速地域。 
     * @return AccelerateRegion 加速地域。
     */
    public String getAccelerateRegion() {
        return this.AccelerateRegion;
    }

    /**
     * Set 加速地域。
     * @param AccelerateRegion 加速地域。
     */
    public void setAccelerateRegion(String AccelerateRegion) {
        this.AccelerateRegion = AccelerateRegion;
    }

    /**
     * Get 终端节点组地域。 
     * @return EndpointGroupRegion 终端节点组地域。
     */
    public String getEndpointGroupRegion() {
        return this.EndpointGroupRegion;
    }

    /**
     * Set 终端节点组地域。
     * @param EndpointGroupRegion 终端节点组地域。
     */
    public void setEndpointGroupRegion(String EndpointGroupRegion) {
        this.EndpointGroupRegion = EndpointGroupRegion;
    }

    /**
     * Get 账单年月时间。 
     * @return SettlementMonth 账单年月时间。
     */
    public Long getSettlementMonth() {
        return this.SettlementMonth;
    }

    /**
     * Set 账单年月时间。
     * @param SettlementMonth 账单年月时间。
     */
    public void setSettlementMonth(Long SettlementMonth) {
        this.SettlementMonth = SettlementMonth;
    }

    public DescribeCrossBorderSettlementRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCrossBorderSettlementRequest(DescribeCrossBorderSettlementRequest source) {
        if (source.GlobalAcceleratorId != null) {
            this.GlobalAcceleratorId = new String(source.GlobalAcceleratorId);
        }
        if (source.AccelerateRegion != null) {
            this.AccelerateRegion = new String(source.AccelerateRegion);
        }
        if (source.EndpointGroupRegion != null) {
            this.EndpointGroupRegion = new String(source.EndpointGroupRegion);
        }
        if (source.SettlementMonth != null) {
            this.SettlementMonth = new Long(source.SettlementMonth);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GlobalAcceleratorId", this.GlobalAcceleratorId);
        this.setParamSimple(map, prefix + "AccelerateRegion", this.AccelerateRegion);
        this.setParamSimple(map, prefix + "EndpointGroupRegion", this.EndpointGroupRegion);
        this.setParamSimple(map, prefix + "SettlementMonth", this.SettlementMonth);

    }
}

