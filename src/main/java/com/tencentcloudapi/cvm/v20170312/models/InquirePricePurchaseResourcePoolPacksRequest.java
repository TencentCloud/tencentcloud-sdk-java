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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquirePricePurchaseResourcePoolPacksRequest extends AbstractModel {

    /**
    * 实例资源池预扣包所在可用区。形如：ap-guangzhou-6。可通过[DescribeZones](https://cloud.tencent.com/document/product/213/15707)接口获取可用区列表。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 实例资源池的规格，仅支持整机/半整机规格。形如：SA9.96XLARGE1152。
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 实例资源池的数量。1个数量代表1个半整机/整机资源池。
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * 实例资源池的时长，单位：月。取值范围：1-60。
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
     * Get 实例资源池预扣包所在可用区。形如：ap-guangzhou-6。可通过[DescribeZones](https://cloud.tencent.com/document/product/213/15707)接口获取可用区列表。 
     * @return Zone 实例资源池预扣包所在可用区。形如：ap-guangzhou-6。可通过[DescribeZones](https://cloud.tencent.com/document/product/213/15707)接口获取可用区列表。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 实例资源池预扣包所在可用区。形如：ap-guangzhou-6。可通过[DescribeZones](https://cloud.tencent.com/document/product/213/15707)接口获取可用区列表。
     * @param Zone 实例资源池预扣包所在可用区。形如：ap-guangzhou-6。可通过[DescribeZones](https://cloud.tencent.com/document/product/213/15707)接口获取可用区列表。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 实例资源池的规格，仅支持整机/半整机规格。形如：SA9.96XLARGE1152。 
     * @return InstanceType 实例资源池的规格，仅支持整机/半整机规格。形如：SA9.96XLARGE1152。
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例资源池的规格，仅支持整机/半整机规格。形如：SA9.96XLARGE1152。
     * @param InstanceType 实例资源池的规格，仅支持整机/半整机规格。形如：SA9.96XLARGE1152。
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 实例资源池的数量。1个数量代表1个半整机/整机资源池。 
     * @return InstanceCount 实例资源池的数量。1个数量代表1个半整机/整机资源池。
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set 实例资源池的数量。1个数量代表1个半整机/整机资源池。
     * @param InstanceCount 实例资源池的数量。1个数量代表1个半整机/整机资源池。
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get 实例资源池的时长，单位：月。取值范围：1-60。 
     * @return Period 实例资源池的时长，单位：月。取值范围：1-60。
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 实例资源池的时长，单位：月。取值范围：1-60。
     * @param Period 实例资源池的时长，单位：月。取值范围：1-60。
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    public InquirePricePurchaseResourcePoolPacksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquirePricePurchaseResourcePoolPacksRequest(InquirePricePurchaseResourcePoolPacksRequest source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.InstanceCount != null) {
            this.InstanceCount = new Long(source.InstanceCount);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamSimple(map, prefix + "Period", this.Period);

    }
}

