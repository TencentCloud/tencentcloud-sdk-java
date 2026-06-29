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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ToolBilling extends AbstractModel {

    /**
    * <p>基础计费信息</p>
    */
    @SerializedName("BasicBilling")
    @Expose
    private BasicBilling BasicBilling;

    /**
    * <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>BILLING_TYPE_FREE</td><td>0</td><td>免费</td></tr><tr><td>BILLING_TYPE_LIMITED_FREE</td><td>1</td><td>限时免费</td></tr><tr><td>BILLING_TYPE_OFFICIAL_PAID</td><td>2</td><td>官方收费</td></tr><tr><td>BILLING_TYPE_OFFICIAL_PAID_OLD_FREE</td><td>3</td><td>官方收费（新/升级用户收费，存量老用户限时免费）</td></tr></tbody></table>
    */
    @SerializedName("BillingType")
    @Expose
    private Long BillingType;

    /**
    * <p>复合类型计费信息</p>
    */
    @SerializedName("ComplexBilling")
    @Expose
    private ComplexBilling ComplexBilling;

    /**
    * <p>双向计费信息</p>
    */
    @SerializedName("DuplexBilling")
    @Expose
    private DuplexBilling DuplexBilling;

    /**
     * Get <p>基础计费信息</p> 
     * @return BasicBilling <p>基础计费信息</p>
     */
    public BasicBilling getBasicBilling() {
        return this.BasicBilling;
    }

    /**
     * Set <p>基础计费信息</p>
     * @param BasicBilling <p>基础计费信息</p>
     */
    public void setBasicBilling(BasicBilling BasicBilling) {
        this.BasicBilling = BasicBilling;
    }

    /**
     * Get <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>BILLING_TYPE_FREE</td><td>0</td><td>免费</td></tr><tr><td>BILLING_TYPE_LIMITED_FREE</td><td>1</td><td>限时免费</td></tr><tr><td>BILLING_TYPE_OFFICIAL_PAID</td><td>2</td><td>官方收费</td></tr><tr><td>BILLING_TYPE_OFFICIAL_PAID_OLD_FREE</td><td>3</td><td>官方收费（新/升级用户收费，存量老用户限时免费）</td></tr></tbody></table> 
     * @return BillingType <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>BILLING_TYPE_FREE</td><td>0</td><td>免费</td></tr><tr><td>BILLING_TYPE_LIMITED_FREE</td><td>1</td><td>限时免费</td></tr><tr><td>BILLING_TYPE_OFFICIAL_PAID</td><td>2</td><td>官方收费</td></tr><tr><td>BILLING_TYPE_OFFICIAL_PAID_OLD_FREE</td><td>3</td><td>官方收费（新/升级用户收费，存量老用户限时免费）</td></tr></tbody></table>
     */
    public Long getBillingType() {
        return this.BillingType;
    }

    /**
     * Set <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>BILLING_TYPE_FREE</td><td>0</td><td>免费</td></tr><tr><td>BILLING_TYPE_LIMITED_FREE</td><td>1</td><td>限时免费</td></tr><tr><td>BILLING_TYPE_OFFICIAL_PAID</td><td>2</td><td>官方收费</td></tr><tr><td>BILLING_TYPE_OFFICIAL_PAID_OLD_FREE</td><td>3</td><td>官方收费（新/升级用户收费，存量老用户限时免费）</td></tr></tbody></table>
     * @param BillingType <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>BILLING_TYPE_FREE</td><td>0</td><td>免费</td></tr><tr><td>BILLING_TYPE_LIMITED_FREE</td><td>1</td><td>限时免费</td></tr><tr><td>BILLING_TYPE_OFFICIAL_PAID</td><td>2</td><td>官方收费</td></tr><tr><td>BILLING_TYPE_OFFICIAL_PAID_OLD_FREE</td><td>3</td><td>官方收费（新/升级用户收费，存量老用户限时免费）</td></tr></tbody></table>
     */
    public void setBillingType(Long BillingType) {
        this.BillingType = BillingType;
    }

    /**
     * Get <p>复合类型计费信息</p> 
     * @return ComplexBilling <p>复合类型计费信息</p>
     */
    public ComplexBilling getComplexBilling() {
        return this.ComplexBilling;
    }

    /**
     * Set <p>复合类型计费信息</p>
     * @param ComplexBilling <p>复合类型计费信息</p>
     */
    public void setComplexBilling(ComplexBilling ComplexBilling) {
        this.ComplexBilling = ComplexBilling;
    }

    /**
     * Get <p>双向计费信息</p> 
     * @return DuplexBilling <p>双向计费信息</p>
     */
    public DuplexBilling getDuplexBilling() {
        return this.DuplexBilling;
    }

    /**
     * Set <p>双向计费信息</p>
     * @param DuplexBilling <p>双向计费信息</p>
     */
    public void setDuplexBilling(DuplexBilling DuplexBilling) {
        this.DuplexBilling = DuplexBilling;
    }

    public ToolBilling() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ToolBilling(ToolBilling source) {
        if (source.BasicBilling != null) {
            this.BasicBilling = new BasicBilling(source.BasicBilling);
        }
        if (source.BillingType != null) {
            this.BillingType = new Long(source.BillingType);
        }
        if (source.ComplexBilling != null) {
            this.ComplexBilling = new ComplexBilling(source.ComplexBilling);
        }
        if (source.DuplexBilling != null) {
            this.DuplexBilling = new DuplexBilling(source.DuplexBilling);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "BasicBilling.", this.BasicBilling);
        this.setParamSimple(map, prefix + "BillingType", this.BillingType);
        this.setParamObj(map, prefix + "ComplexBilling.", this.ComplexBilling);
        this.setParamObj(map, prefix + "DuplexBilling.", this.DuplexBilling);

    }
}

