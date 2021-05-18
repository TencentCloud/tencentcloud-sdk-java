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
package com.tencentcloudapi.privatedns.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FlowUsage extends AbstractModel{

    /**
    * 流量包类型：ZONE 私有域；TRAFFIC 解析流量包
    */
    @SerializedName("FlowType")
    @Expose
    private String FlowType;

    /**
    * 流量包总额度
    */
    @SerializedName("TotalQuantity")
    @Expose
    private Long TotalQuantity;

    /**
    * 流量包可用额度
    */
    @SerializedName("AvailableQuantity")
    @Expose
    private Long AvailableQuantity;

    /**
     * Get 流量包类型：ZONE 私有域；TRAFFIC 解析流量包 
     * @return FlowType 流量包类型：ZONE 私有域；TRAFFIC 解析流量包
     */
    public String getFlowType() {
        return this.FlowType;
    }

    /**
     * Set 流量包类型：ZONE 私有域；TRAFFIC 解析流量包
     * @param FlowType 流量包类型：ZONE 私有域；TRAFFIC 解析流量包
     */
    public void setFlowType(String FlowType) {
        this.FlowType = FlowType;
    }

    /**
     * Get 流量包总额度 
     * @return TotalQuantity 流量包总额度
     */
    public Long getTotalQuantity() {
        return this.TotalQuantity;
    }

    /**
     * Set 流量包总额度
     * @param TotalQuantity 流量包总额度
     */
    public void setTotalQuantity(Long TotalQuantity) {
        this.TotalQuantity = TotalQuantity;
    }

    /**
     * Get 流量包可用额度 
     * @return AvailableQuantity 流量包可用额度
     */
    public Long getAvailableQuantity() {
        return this.AvailableQuantity;
    }

    /**
     * Set 流量包可用额度
     * @param AvailableQuantity 流量包可用额度
     */
    public void setAvailableQuantity(Long AvailableQuantity) {
        this.AvailableQuantity = AvailableQuantity;
    }

    public FlowUsage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlowUsage(FlowUsage source) {
        if (source.FlowType != null) {
            this.FlowType = new String(source.FlowType);
        }
        if (source.TotalQuantity != null) {
            this.TotalQuantity = new Long(source.TotalQuantity);
        }
        if (source.AvailableQuantity != null) {
            this.AvailableQuantity = new Long(source.AvailableQuantity);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowType", this.FlowType);
        this.setParamSimple(map, prefix + "TotalQuantity", this.TotalQuantity);
        this.setParamSimple(map, prefix + "AvailableQuantity", this.AvailableQuantity);

    }
}

