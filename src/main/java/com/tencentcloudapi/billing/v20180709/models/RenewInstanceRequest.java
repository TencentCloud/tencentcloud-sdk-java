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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RenewInstanceRequest extends AbstractModel {

    /**
    * ClientToken是一个由客户端生成的唯一的、区分大小写、不超过64个ASCII字符的字符串。例如，ClientToken=123e4567-e89b-12d3-a456-42665544****。
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * 产品一层code
    */
    @SerializedName("ProductCode")
    @Expose
    private String ProductCode;

    /**
    * 产品二层code
    */
    @SerializedName("SubProductCode")
    @Expose
    private String SubProductCode;

    /**
    * 地域code
    */
    @SerializedName("RegionCode")
    @Expose
    private String RegionCode;

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 手动续费时长，取值上限：36，默认取值1
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 手动续费时长单位，取值：m：按月续费，y：按年续费，默认取值m
    */
    @SerializedName("PeriodUnit")
    @Expose
    private String PeriodUnit;

    /**
     * Get ClientToken是一个由客户端生成的唯一的、区分大小写、不超过64个ASCII字符的字符串。例如，ClientToken=123e4567-e89b-12d3-a456-42665544****。 
     * @return ClientToken ClientToken是一个由客户端生成的唯一的、区分大小写、不超过64个ASCII字符的字符串。例如，ClientToken=123e4567-e89b-12d3-a456-42665544****。
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set ClientToken是一个由客户端生成的唯一的、区分大小写、不超过64个ASCII字符的字符串。例如，ClientToken=123e4567-e89b-12d3-a456-42665544****。
     * @param ClientToken ClientToken是一个由客户端生成的唯一的、区分大小写、不超过64个ASCII字符的字符串。例如，ClientToken=123e4567-e89b-12d3-a456-42665544****。
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get 产品一层code 
     * @return ProductCode 产品一层code
     */
    public String getProductCode() {
        return this.ProductCode;
    }

    /**
     * Set 产品一层code
     * @param ProductCode 产品一层code
     */
    public void setProductCode(String ProductCode) {
        this.ProductCode = ProductCode;
    }

    /**
     * Get 产品二层code 
     * @return SubProductCode 产品二层code
     */
    public String getSubProductCode() {
        return this.SubProductCode;
    }

    /**
     * Set 产品二层code
     * @param SubProductCode 产品二层code
     */
    public void setSubProductCode(String SubProductCode) {
        this.SubProductCode = SubProductCode;
    }

    /**
     * Get 地域code 
     * @return RegionCode 地域code
     */
    public String getRegionCode() {
        return this.RegionCode;
    }

    /**
     * Set 地域code
     * @param RegionCode 地域code
     */
    public void setRegionCode(String RegionCode) {
        this.RegionCode = RegionCode;
    }

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 手动续费时长，取值上限：36，默认取值1 
     * @return Period 手动续费时长，取值上限：36，默认取值1
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 手动续费时长，取值上限：36，默认取值1
     * @param Period 手动续费时长，取值上限：36，默认取值1
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 手动续费时长单位，取值：m：按月续费，y：按年续费，默认取值m 
     * @return PeriodUnit 手动续费时长单位，取值：m：按月续费，y：按年续费，默认取值m
     */
    public String getPeriodUnit() {
        return this.PeriodUnit;
    }

    /**
     * Set 手动续费时长单位，取值：m：按月续费，y：按年续费，默认取值m
     * @param PeriodUnit 手动续费时长单位，取值：m：按月续费，y：按年续费，默认取值m
     */
    public void setPeriodUnit(String PeriodUnit) {
        this.PeriodUnit = PeriodUnit;
    }

    public RenewInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RenewInstanceRequest(RenewInstanceRequest source) {
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
        if (source.ProductCode != null) {
            this.ProductCode = new String(source.ProductCode);
        }
        if (source.SubProductCode != null) {
            this.SubProductCode = new String(source.SubProductCode);
        }
        if (source.RegionCode != null) {
            this.RegionCode = new String(source.RegionCode);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.PeriodUnit != null) {
            this.PeriodUnit = new String(source.PeriodUnit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamSimple(map, prefix + "ProductCode", this.ProductCode);
        this.setParamSimple(map, prefix + "SubProductCode", this.SubProductCode);
        this.setParamSimple(map, prefix + "RegionCode", this.RegionCode);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "PeriodUnit", this.PeriodUnit);

    }
}

