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

public class ComplexBillingItem extends AbstractModel {

    /**
    * <p>复合计费维度信息</p>
    */
    @SerializedName("BillingAttributeList")
    @Expose
    private BillingAttribute [] BillingAttributeList;

    /**
    * <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>UNKNOW</td><td>0</td><td></td></tr><tr><td>TOKEN</td><td>1</td><td>按token</td></tr><tr><td>PAGE_COUNT</td><td>2</td><td>按页数</td></tr><tr><td>TIMES</td><td>3</td><td>按次数</td></tr><tr><td>TIMES_THOUSAND</td><td>4</td><td>按千次数</td></tr><tr><td>SECOND</td><td>5</td><td>按时长</td></tr><tr><td>CHARACTER</td><td>6</td><td>按字符数</td></tr><tr><td>CHARACTER_THOUSAND</td><td>7</td><td>按千字符数</td></tr><tr><td>SHEET</td><td>8</td><td>按张</td></tr><tr><td>NUMBER</td><td>9</td><td>按个数</td></tr></tbody></table>
    */
    @SerializedName("BillingUnit")
    @Expose
    private Long BillingUnit;

    /**
    * <p>现金价格</p><p>单位：元</p>
    */
    @SerializedName("CashPrice")
    @Expose
    private Float CashPrice;

    /**
    * <p>pu价格</p><p>单位：pu</p>
    */
    @SerializedName("PuPrice")
    @Expose
    private Float PuPrice;

    /**
     * Get <p>复合计费维度信息</p> 
     * @return BillingAttributeList <p>复合计费维度信息</p>
     */
    public BillingAttribute [] getBillingAttributeList() {
        return this.BillingAttributeList;
    }

    /**
     * Set <p>复合计费维度信息</p>
     * @param BillingAttributeList <p>复合计费维度信息</p>
     */
    public void setBillingAttributeList(BillingAttribute [] BillingAttributeList) {
        this.BillingAttributeList = BillingAttributeList;
    }

    /**
     * Get <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>UNKNOW</td><td>0</td><td></td></tr><tr><td>TOKEN</td><td>1</td><td>按token</td></tr><tr><td>PAGE_COUNT</td><td>2</td><td>按页数</td></tr><tr><td>TIMES</td><td>3</td><td>按次数</td></tr><tr><td>TIMES_THOUSAND</td><td>4</td><td>按千次数</td></tr><tr><td>SECOND</td><td>5</td><td>按时长</td></tr><tr><td>CHARACTER</td><td>6</td><td>按字符数</td></tr><tr><td>CHARACTER_THOUSAND</td><td>7</td><td>按千字符数</td></tr><tr><td>SHEET</td><td>8</td><td>按张</td></tr><tr><td>NUMBER</td><td>9</td><td>按个数</td></tr></tbody></table> 
     * @return BillingUnit <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>UNKNOW</td><td>0</td><td></td></tr><tr><td>TOKEN</td><td>1</td><td>按token</td></tr><tr><td>PAGE_COUNT</td><td>2</td><td>按页数</td></tr><tr><td>TIMES</td><td>3</td><td>按次数</td></tr><tr><td>TIMES_THOUSAND</td><td>4</td><td>按千次数</td></tr><tr><td>SECOND</td><td>5</td><td>按时长</td></tr><tr><td>CHARACTER</td><td>6</td><td>按字符数</td></tr><tr><td>CHARACTER_THOUSAND</td><td>7</td><td>按千字符数</td></tr><tr><td>SHEET</td><td>8</td><td>按张</td></tr><tr><td>NUMBER</td><td>9</td><td>按个数</td></tr></tbody></table>
     */
    public Long getBillingUnit() {
        return this.BillingUnit;
    }

    /**
     * Set <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>UNKNOW</td><td>0</td><td></td></tr><tr><td>TOKEN</td><td>1</td><td>按token</td></tr><tr><td>PAGE_COUNT</td><td>2</td><td>按页数</td></tr><tr><td>TIMES</td><td>3</td><td>按次数</td></tr><tr><td>TIMES_THOUSAND</td><td>4</td><td>按千次数</td></tr><tr><td>SECOND</td><td>5</td><td>按时长</td></tr><tr><td>CHARACTER</td><td>6</td><td>按字符数</td></tr><tr><td>CHARACTER_THOUSAND</td><td>7</td><td>按千字符数</td></tr><tr><td>SHEET</td><td>8</td><td>按张</td></tr><tr><td>NUMBER</td><td>9</td><td>按个数</td></tr></tbody></table>
     * @param BillingUnit <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>UNKNOW</td><td>0</td><td></td></tr><tr><td>TOKEN</td><td>1</td><td>按token</td></tr><tr><td>PAGE_COUNT</td><td>2</td><td>按页数</td></tr><tr><td>TIMES</td><td>3</td><td>按次数</td></tr><tr><td>TIMES_THOUSAND</td><td>4</td><td>按千次数</td></tr><tr><td>SECOND</td><td>5</td><td>按时长</td></tr><tr><td>CHARACTER</td><td>6</td><td>按字符数</td></tr><tr><td>CHARACTER_THOUSAND</td><td>7</td><td>按千字符数</td></tr><tr><td>SHEET</td><td>8</td><td>按张</td></tr><tr><td>NUMBER</td><td>9</td><td>按个数</td></tr></tbody></table>
     */
    public void setBillingUnit(Long BillingUnit) {
        this.BillingUnit = BillingUnit;
    }

    /**
     * Get <p>现金价格</p><p>单位：元</p> 
     * @return CashPrice <p>现金价格</p><p>单位：元</p>
     */
    public Float getCashPrice() {
        return this.CashPrice;
    }

    /**
     * Set <p>现金价格</p><p>单位：元</p>
     * @param CashPrice <p>现金价格</p><p>单位：元</p>
     */
    public void setCashPrice(Float CashPrice) {
        this.CashPrice = CashPrice;
    }

    /**
     * Get <p>pu价格</p><p>单位：pu</p> 
     * @return PuPrice <p>pu价格</p><p>单位：pu</p>
     */
    public Float getPuPrice() {
        return this.PuPrice;
    }

    /**
     * Set <p>pu价格</p><p>单位：pu</p>
     * @param PuPrice <p>pu价格</p><p>单位：pu</p>
     */
    public void setPuPrice(Float PuPrice) {
        this.PuPrice = PuPrice;
    }

    public ComplexBillingItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComplexBillingItem(ComplexBillingItem source) {
        if (source.BillingAttributeList != null) {
            this.BillingAttributeList = new BillingAttribute[source.BillingAttributeList.length];
            for (int i = 0; i < source.BillingAttributeList.length; i++) {
                this.BillingAttributeList[i] = new BillingAttribute(source.BillingAttributeList[i]);
            }
        }
        if (source.BillingUnit != null) {
            this.BillingUnit = new Long(source.BillingUnit);
        }
        if (source.CashPrice != null) {
            this.CashPrice = new Float(source.CashPrice);
        }
        if (source.PuPrice != null) {
            this.PuPrice = new Float(source.PuPrice);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "BillingAttributeList.", this.BillingAttributeList);
        this.setParamSimple(map, prefix + "BillingUnit", this.BillingUnit);
        this.setParamSimple(map, prefix + "CashPrice", this.CashPrice);
        this.setParamSimple(map, prefix + "PuPrice", this.PuPrice);

    }
}

