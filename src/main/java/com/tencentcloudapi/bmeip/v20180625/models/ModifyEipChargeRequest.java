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
package com.tencentcloudapi.bmeip.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyEipChargeRequest extends AbstractModel {

    /**
    * EIP计费方式，flow-流量计费；bandwidth-带宽计费
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * Eip实例ID列表
    */
    @SerializedName("EipIds")
    @Expose
    private String [] EipIds;

    /**
    * 带宽设定值（只在带宽计费时生效）
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
     * Get EIP计费方式，flow-流量计费；bandwidth-带宽计费 
     * @return PayMode EIP计费方式，flow-流量计费；bandwidth-带宽计费
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set EIP计费方式，flow-流量计费；bandwidth-带宽计费
     * @param PayMode EIP计费方式，flow-流量计费；bandwidth-带宽计费
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Eip实例ID列表 
     * @return EipIds Eip实例ID列表
     */
    public String [] getEipIds() {
        return this.EipIds;
    }

    /**
     * Set Eip实例ID列表
     * @param EipIds Eip实例ID列表
     */
    public void setEipIds(String [] EipIds) {
        this.EipIds = EipIds;
    }

    /**
     * Get 带宽设定值（只在带宽计费时生效） 
     * @return Bandwidth 带宽设定值（只在带宽计费时生效）
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set 带宽设定值（只在带宽计费时生效）
     * @param Bandwidth 带宽设定值（只在带宽计费时生效）
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    public ModifyEipChargeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyEipChargeRequest(ModifyEipChargeRequest source) {
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.EipIds != null) {
            this.EipIds = new String[source.EipIds.length];
            for (int i = 0; i < source.EipIds.length; i++) {
                this.EipIds[i] = new String(source.EipIds[i]);
            }
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamArraySimple(map, prefix + "EipIds.", this.EipIds);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);

    }
}

