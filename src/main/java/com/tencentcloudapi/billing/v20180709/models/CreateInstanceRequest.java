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

public class CreateInstanceRequest extends AbstractModel {

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
    * 可用区code
    */
    @SerializedName("ZoneCode")
    @Expose
    private String ZoneCode;

    /**
    * 付费类型，取值：  PrePay：预付费
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * 商品详情信息
    */
    @SerializedName("Parameter")
    @Expose
    private String Parameter;

    /**
    * 商品数量，默认取值1
    */
    @SerializedName("Quantity")
    @Expose
    private Long Quantity;

    /**
    * 项目id，默认取0
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 新购时长，取值上限：36，默认取值1
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 新购时长单位，取值：m：按月购买，y：按年购买，默认取值m
    */
    @SerializedName("PeriodUnit")
    @Expose
    private String PeriodUnit;

    /**
    * 自动续费标识，取值：NOTIFY_AND_MANUAL_RENEW：手动续费，NOTIFY_AND_AUTO_RENEW：自动续费，DISABLE_NOTIFY_AND_MANUAL_RENEW：到期不续，默认取值NOTIFY_AND_MANUAL_RENEW
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

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
     * Get 可用区code 
     * @return ZoneCode 可用区code
     */
    public String getZoneCode() {
        return this.ZoneCode;
    }

    /**
     * Set 可用区code
     * @param ZoneCode 可用区code
     */
    public void setZoneCode(String ZoneCode) {
        this.ZoneCode = ZoneCode;
    }

    /**
     * Get 付费类型，取值：  PrePay：预付费 
     * @return PayMode 付费类型，取值：  PrePay：预付费
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 付费类型，取值：  PrePay：预付费
     * @param PayMode 付费类型，取值：  PrePay：预付费
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 商品详情信息 
     * @return Parameter 商品详情信息
     */
    public String getParameter() {
        return this.Parameter;
    }

    /**
     * Set 商品详情信息
     * @param Parameter 商品详情信息
     */
    public void setParameter(String Parameter) {
        this.Parameter = Parameter;
    }

    /**
     * Get 商品数量，默认取值1 
     * @return Quantity 商品数量，默认取值1
     */
    public Long getQuantity() {
        return this.Quantity;
    }

    /**
     * Set 商品数量，默认取值1
     * @param Quantity 商品数量，默认取值1
     */
    public void setQuantity(Long Quantity) {
        this.Quantity = Quantity;
    }

    /**
     * Get 项目id，默认取0 
     * @return ProjectId 项目id，默认取0
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id，默认取0
     * @param ProjectId 项目id，默认取0
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 新购时长，取值上限：36，默认取值1 
     * @return Period 新购时长，取值上限：36，默认取值1
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 新购时长，取值上限：36，默认取值1
     * @param Period 新购时长，取值上限：36，默认取值1
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 新购时长单位，取值：m：按月购买，y：按年购买，默认取值m 
     * @return PeriodUnit 新购时长单位，取值：m：按月购买，y：按年购买，默认取值m
     */
    public String getPeriodUnit() {
        return this.PeriodUnit;
    }

    /**
     * Set 新购时长单位，取值：m：按月购买，y：按年购买，默认取值m
     * @param PeriodUnit 新购时长单位，取值：m：按月购买，y：按年购买，默认取值m
     */
    public void setPeriodUnit(String PeriodUnit) {
        this.PeriodUnit = PeriodUnit;
    }

    /**
     * Get 自动续费标识，取值：NOTIFY_AND_MANUAL_RENEW：手动续费，NOTIFY_AND_AUTO_RENEW：自动续费，DISABLE_NOTIFY_AND_MANUAL_RENEW：到期不续，默认取值NOTIFY_AND_MANUAL_RENEW 
     * @return RenewFlag 自动续费标识，取值：NOTIFY_AND_MANUAL_RENEW：手动续费，NOTIFY_AND_AUTO_RENEW：自动续费，DISABLE_NOTIFY_AND_MANUAL_RENEW：到期不续，默认取值NOTIFY_AND_MANUAL_RENEW
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set 自动续费标识，取值：NOTIFY_AND_MANUAL_RENEW：手动续费，NOTIFY_AND_AUTO_RENEW：自动续费，DISABLE_NOTIFY_AND_MANUAL_RENEW：到期不续，默认取值NOTIFY_AND_MANUAL_RENEW
     * @param RenewFlag 自动续费标识，取值：NOTIFY_AND_MANUAL_RENEW：手动续费，NOTIFY_AND_AUTO_RENEW：自动续费，DISABLE_NOTIFY_AND_MANUAL_RENEW：到期不续，默认取值NOTIFY_AND_MANUAL_RENEW
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    public CreateInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateInstanceRequest(CreateInstanceRequest source) {
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
        if (source.ZoneCode != null) {
            this.ZoneCode = new String(source.ZoneCode);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.Parameter != null) {
            this.Parameter = new String(source.Parameter);
        }
        if (source.Quantity != null) {
            this.Quantity = new Long(source.Quantity);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.PeriodUnit != null) {
            this.PeriodUnit = new String(source.PeriodUnit);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new String(source.RenewFlag);
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
        this.setParamSimple(map, prefix + "ZoneCode", this.ZoneCode);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "Parameter", this.Parameter);
        this.setParamSimple(map, prefix + "Quantity", this.Quantity);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "PeriodUnit", this.PeriodUnit);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);

    }
}

