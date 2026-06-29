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

public class DuplexBilling extends AbstractModel {

    /**
    * <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>UNKNOW</td><td>0</td><td></td></tr><tr><td>TOKEN</td><td>1</td><td>按token</td></tr><tr><td>PAGE_COUNT</td><td>2</td><td>按页数</td></tr><tr><td>TIMES</td><td>3</td><td>按次数</td></tr><tr><td>TIMES_THOUSAND</td><td>4</td><td>按千次数</td></tr><tr><td>SECOND</td><td>5</td><td>按时长</td></tr><tr><td>CHARACTER</td><td>6</td><td>按字符数</td></tr><tr><td>CHARACTER_THOUSAND</td><td>7</td><td>按千字符数</td></tr><tr><td>SHEET</td><td>8</td><td>按张</td></tr><tr><td>NUMBER</td><td>9</td><td>按个数</td></tr></tbody></table>
    */
    @SerializedName("BillingUnit")
    @Expose
    private Long BillingUnit;

    /**
    * <p>输入现金价格</p><p>单位：元</p>
    */
    @SerializedName("InputCashPrice")
    @Expose
    private Float InputCashPrice;

    /**
    * <p>输入pu价格</p><p>单位：pu</p>
    */
    @SerializedName("InputPuPrice")
    @Expose
    private Float InputPuPrice;

    /**
    * <p>输出现金价格</p><p>单位：元</p>
    */
    @SerializedName("OutputCashPrice")
    @Expose
    private Float OutputCashPrice;

    /**
    * <p>输出pu价格</p><p>单位：pu</p>
    */
    @SerializedName("OutputPuPrice")
    @Expose
    private Float OutputPuPrice;

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
     * Get <p>输入现金价格</p><p>单位：元</p> 
     * @return InputCashPrice <p>输入现金价格</p><p>单位：元</p>
     */
    public Float getInputCashPrice() {
        return this.InputCashPrice;
    }

    /**
     * Set <p>输入现金价格</p><p>单位：元</p>
     * @param InputCashPrice <p>输入现金价格</p><p>单位：元</p>
     */
    public void setInputCashPrice(Float InputCashPrice) {
        this.InputCashPrice = InputCashPrice;
    }

    /**
     * Get <p>输入pu价格</p><p>单位：pu</p> 
     * @return InputPuPrice <p>输入pu价格</p><p>单位：pu</p>
     */
    public Float getInputPuPrice() {
        return this.InputPuPrice;
    }

    /**
     * Set <p>输入pu价格</p><p>单位：pu</p>
     * @param InputPuPrice <p>输入pu价格</p><p>单位：pu</p>
     */
    public void setInputPuPrice(Float InputPuPrice) {
        this.InputPuPrice = InputPuPrice;
    }

    /**
     * Get <p>输出现金价格</p><p>单位：元</p> 
     * @return OutputCashPrice <p>输出现金价格</p><p>单位：元</p>
     */
    public Float getOutputCashPrice() {
        return this.OutputCashPrice;
    }

    /**
     * Set <p>输出现金价格</p><p>单位：元</p>
     * @param OutputCashPrice <p>输出现金价格</p><p>单位：元</p>
     */
    public void setOutputCashPrice(Float OutputCashPrice) {
        this.OutputCashPrice = OutputCashPrice;
    }

    /**
     * Get <p>输出pu价格</p><p>单位：pu</p> 
     * @return OutputPuPrice <p>输出pu价格</p><p>单位：pu</p>
     */
    public Float getOutputPuPrice() {
        return this.OutputPuPrice;
    }

    /**
     * Set <p>输出pu价格</p><p>单位：pu</p>
     * @param OutputPuPrice <p>输出pu价格</p><p>单位：pu</p>
     */
    public void setOutputPuPrice(Float OutputPuPrice) {
        this.OutputPuPrice = OutputPuPrice;
    }

    public DuplexBilling() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DuplexBilling(DuplexBilling source) {
        if (source.BillingUnit != null) {
            this.BillingUnit = new Long(source.BillingUnit);
        }
        if (source.InputCashPrice != null) {
            this.InputCashPrice = new Float(source.InputCashPrice);
        }
        if (source.InputPuPrice != null) {
            this.InputPuPrice = new Float(source.InputPuPrice);
        }
        if (source.OutputCashPrice != null) {
            this.OutputCashPrice = new Float(source.OutputCashPrice);
        }
        if (source.OutputPuPrice != null) {
            this.OutputPuPrice = new Float(source.OutputPuPrice);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BillingUnit", this.BillingUnit);
        this.setParamSimple(map, prefix + "InputCashPrice", this.InputCashPrice);
        this.setParamSimple(map, prefix + "InputPuPrice", this.InputPuPrice);
        this.setParamSimple(map, prefix + "OutputCashPrice", this.OutputCashPrice);
        this.setParamSimple(map, prefix + "OutputPuPrice", this.OutputPuPrice);

    }
}

