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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PayDataResult extends AbstractModel{

    /**
    * 支付标签（唯一性）
    */
    @SerializedName("PaymentTag")
    @Expose
    private String PaymentTag;

    /**
    * 添加合同时需要隐藏的选项（多个以小写逗号分开）
    */
    @SerializedName("PaymentOptionHide")
    @Expose
    private String PaymentOptionHide;

    /**
    * 支付方式图片url路径
    */
    @SerializedName("PaymentIcon")
    @Expose
    private String PaymentIcon;

    /**
    * 合同选项名称6
    */
    @SerializedName("PaymentOptionSix")
    @Expose
    private String PaymentOptionSix;

    /**
    * 付款方式名称
    */
    @SerializedName("PaymentName")
    @Expose
    private String PaymentName;

    /**
    * 合同选项名称7
    */
    @SerializedName("PaymentOptionSeven")
    @Expose
    private String PaymentOptionSeven;

    /**
    * 合同选项名称8
    */
    @SerializedName("PaymentOptionOther")
    @Expose
    private String PaymentOptionOther;

    /**
    * 合同选项名称2
    */
    @SerializedName("PaymentOptionTwo")
    @Expose
    private String PaymentOptionTwo;

    /**
    * 合同选项名称1
    */
    @SerializedName("PaymentOptionOne")
    @Expose
    private String PaymentOptionOne;

    /**
    * 是否开启智能扣率（1是，0否）
    */
    @SerializedName("PaymentDiscountFee")
    @Expose
    private String PaymentDiscountFee;

    /**
    * 支持的交易类型（多个以小写逗号分开，0现金，1刷卡，2主扫，3被扫，4JSPAY，5预授权）
    */
    @SerializedName("PaymentType")
    @Expose
    private String PaymentType;

    /**
    * 合同选项名称5
    */
    @SerializedName("PaymentOptionFive")
    @Expose
    private String PaymentOptionFive;

    /**
    * 合同选项名称9
    */
    @SerializedName("PaymentOptionNine")
    @Expose
    private String PaymentOptionNine;

    /**
    * 支付方式编号
    */
    @SerializedName("PaymentId")
    @Expose
    private String PaymentId;

    /**
    * 合同选项名称3
    */
    @SerializedName("PaymentOptionThree")
    @Expose
    private String PaymentOptionThree;

    /**
    * 付款方式名称（内部名称）
    */
    @SerializedName("PaymentInternalName")
    @Expose
    private String PaymentInternalName;

    /**
    * 合同选项名称4
    */
    @SerializedName("PaymentOptionFour")
    @Expose
    private String PaymentOptionFour;

    /**
    * 合同选项名称10
    */
    @SerializedName("PaymentOptionTen")
    @Expose
    private String PaymentOptionTen;

    /**
     * Get 支付标签（唯一性） 
     * @return PaymentTag 支付标签（唯一性）
     */
    public String getPaymentTag() {
        return this.PaymentTag;
    }

    /**
     * Set 支付标签（唯一性）
     * @param PaymentTag 支付标签（唯一性）
     */
    public void setPaymentTag(String PaymentTag) {
        this.PaymentTag = PaymentTag;
    }

    /**
     * Get 添加合同时需要隐藏的选项（多个以小写逗号分开） 
     * @return PaymentOptionHide 添加合同时需要隐藏的选项（多个以小写逗号分开）
     */
    public String getPaymentOptionHide() {
        return this.PaymentOptionHide;
    }

    /**
     * Set 添加合同时需要隐藏的选项（多个以小写逗号分开）
     * @param PaymentOptionHide 添加合同时需要隐藏的选项（多个以小写逗号分开）
     */
    public void setPaymentOptionHide(String PaymentOptionHide) {
        this.PaymentOptionHide = PaymentOptionHide;
    }

    /**
     * Get 支付方式图片url路径 
     * @return PaymentIcon 支付方式图片url路径
     */
    public String getPaymentIcon() {
        return this.PaymentIcon;
    }

    /**
     * Set 支付方式图片url路径
     * @param PaymentIcon 支付方式图片url路径
     */
    public void setPaymentIcon(String PaymentIcon) {
        this.PaymentIcon = PaymentIcon;
    }

    /**
     * Get 合同选项名称6 
     * @return PaymentOptionSix 合同选项名称6
     */
    public String getPaymentOptionSix() {
        return this.PaymentOptionSix;
    }

    /**
     * Set 合同选项名称6
     * @param PaymentOptionSix 合同选项名称6
     */
    public void setPaymentOptionSix(String PaymentOptionSix) {
        this.PaymentOptionSix = PaymentOptionSix;
    }

    /**
     * Get 付款方式名称 
     * @return PaymentName 付款方式名称
     */
    public String getPaymentName() {
        return this.PaymentName;
    }

    /**
     * Set 付款方式名称
     * @param PaymentName 付款方式名称
     */
    public void setPaymentName(String PaymentName) {
        this.PaymentName = PaymentName;
    }

    /**
     * Get 合同选项名称7 
     * @return PaymentOptionSeven 合同选项名称7
     */
    public String getPaymentOptionSeven() {
        return this.PaymentOptionSeven;
    }

    /**
     * Set 合同选项名称7
     * @param PaymentOptionSeven 合同选项名称7
     */
    public void setPaymentOptionSeven(String PaymentOptionSeven) {
        this.PaymentOptionSeven = PaymentOptionSeven;
    }

    /**
     * Get 合同选项名称8 
     * @return PaymentOptionOther 合同选项名称8
     */
    public String getPaymentOptionOther() {
        return this.PaymentOptionOther;
    }

    /**
     * Set 合同选项名称8
     * @param PaymentOptionOther 合同选项名称8
     */
    public void setPaymentOptionOther(String PaymentOptionOther) {
        this.PaymentOptionOther = PaymentOptionOther;
    }

    /**
     * Get 合同选项名称2 
     * @return PaymentOptionTwo 合同选项名称2
     */
    public String getPaymentOptionTwo() {
        return this.PaymentOptionTwo;
    }

    /**
     * Set 合同选项名称2
     * @param PaymentOptionTwo 合同选项名称2
     */
    public void setPaymentOptionTwo(String PaymentOptionTwo) {
        this.PaymentOptionTwo = PaymentOptionTwo;
    }

    /**
     * Get 合同选项名称1 
     * @return PaymentOptionOne 合同选项名称1
     */
    public String getPaymentOptionOne() {
        return this.PaymentOptionOne;
    }

    /**
     * Set 合同选项名称1
     * @param PaymentOptionOne 合同选项名称1
     */
    public void setPaymentOptionOne(String PaymentOptionOne) {
        this.PaymentOptionOne = PaymentOptionOne;
    }

    /**
     * Get 是否开启智能扣率（1是，0否） 
     * @return PaymentDiscountFee 是否开启智能扣率（1是，0否）
     */
    public String getPaymentDiscountFee() {
        return this.PaymentDiscountFee;
    }

    /**
     * Set 是否开启智能扣率（1是，0否）
     * @param PaymentDiscountFee 是否开启智能扣率（1是，0否）
     */
    public void setPaymentDiscountFee(String PaymentDiscountFee) {
        this.PaymentDiscountFee = PaymentDiscountFee;
    }

    /**
     * Get 支持的交易类型（多个以小写逗号分开，0现金，1刷卡，2主扫，3被扫，4JSPAY，5预授权） 
     * @return PaymentType 支持的交易类型（多个以小写逗号分开，0现金，1刷卡，2主扫，3被扫，4JSPAY，5预授权）
     */
    public String getPaymentType() {
        return this.PaymentType;
    }

    /**
     * Set 支持的交易类型（多个以小写逗号分开，0现金，1刷卡，2主扫，3被扫，4JSPAY，5预授权）
     * @param PaymentType 支持的交易类型（多个以小写逗号分开，0现金，1刷卡，2主扫，3被扫，4JSPAY，5预授权）
     */
    public void setPaymentType(String PaymentType) {
        this.PaymentType = PaymentType;
    }

    /**
     * Get 合同选项名称5 
     * @return PaymentOptionFive 合同选项名称5
     */
    public String getPaymentOptionFive() {
        return this.PaymentOptionFive;
    }

    /**
     * Set 合同选项名称5
     * @param PaymentOptionFive 合同选项名称5
     */
    public void setPaymentOptionFive(String PaymentOptionFive) {
        this.PaymentOptionFive = PaymentOptionFive;
    }

    /**
     * Get 合同选项名称9 
     * @return PaymentOptionNine 合同选项名称9
     */
    public String getPaymentOptionNine() {
        return this.PaymentOptionNine;
    }

    /**
     * Set 合同选项名称9
     * @param PaymentOptionNine 合同选项名称9
     */
    public void setPaymentOptionNine(String PaymentOptionNine) {
        this.PaymentOptionNine = PaymentOptionNine;
    }

    /**
     * Get 支付方式编号 
     * @return PaymentId 支付方式编号
     */
    public String getPaymentId() {
        return this.PaymentId;
    }

    /**
     * Set 支付方式编号
     * @param PaymentId 支付方式编号
     */
    public void setPaymentId(String PaymentId) {
        this.PaymentId = PaymentId;
    }

    /**
     * Get 合同选项名称3 
     * @return PaymentOptionThree 合同选项名称3
     */
    public String getPaymentOptionThree() {
        return this.PaymentOptionThree;
    }

    /**
     * Set 合同选项名称3
     * @param PaymentOptionThree 合同选项名称3
     */
    public void setPaymentOptionThree(String PaymentOptionThree) {
        this.PaymentOptionThree = PaymentOptionThree;
    }

    /**
     * Get 付款方式名称（内部名称） 
     * @return PaymentInternalName 付款方式名称（内部名称）
     */
    public String getPaymentInternalName() {
        return this.PaymentInternalName;
    }

    /**
     * Set 付款方式名称（内部名称）
     * @param PaymentInternalName 付款方式名称（内部名称）
     */
    public void setPaymentInternalName(String PaymentInternalName) {
        this.PaymentInternalName = PaymentInternalName;
    }

    /**
     * Get 合同选项名称4 
     * @return PaymentOptionFour 合同选项名称4
     */
    public String getPaymentOptionFour() {
        return this.PaymentOptionFour;
    }

    /**
     * Set 合同选项名称4
     * @param PaymentOptionFour 合同选项名称4
     */
    public void setPaymentOptionFour(String PaymentOptionFour) {
        this.PaymentOptionFour = PaymentOptionFour;
    }

    /**
     * Get 合同选项名称10 
     * @return PaymentOptionTen 合同选项名称10
     */
    public String getPaymentOptionTen() {
        return this.PaymentOptionTen;
    }

    /**
     * Set 合同选项名称10
     * @param PaymentOptionTen 合同选项名称10
     */
    public void setPaymentOptionTen(String PaymentOptionTen) {
        this.PaymentOptionTen = PaymentOptionTen;
    }

    public PayDataResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PayDataResult(PayDataResult source) {
        if (source.PaymentTag != null) {
            this.PaymentTag = new String(source.PaymentTag);
        }
        if (source.PaymentOptionHide != null) {
            this.PaymentOptionHide = new String(source.PaymentOptionHide);
        }
        if (source.PaymentIcon != null) {
            this.PaymentIcon = new String(source.PaymentIcon);
        }
        if (source.PaymentOptionSix != null) {
            this.PaymentOptionSix = new String(source.PaymentOptionSix);
        }
        if (source.PaymentName != null) {
            this.PaymentName = new String(source.PaymentName);
        }
        if (source.PaymentOptionSeven != null) {
            this.PaymentOptionSeven = new String(source.PaymentOptionSeven);
        }
        if (source.PaymentOptionOther != null) {
            this.PaymentOptionOther = new String(source.PaymentOptionOther);
        }
        if (source.PaymentOptionTwo != null) {
            this.PaymentOptionTwo = new String(source.PaymentOptionTwo);
        }
        if (source.PaymentOptionOne != null) {
            this.PaymentOptionOne = new String(source.PaymentOptionOne);
        }
        if (source.PaymentDiscountFee != null) {
            this.PaymentDiscountFee = new String(source.PaymentDiscountFee);
        }
        if (source.PaymentType != null) {
            this.PaymentType = new String(source.PaymentType);
        }
        if (source.PaymentOptionFive != null) {
            this.PaymentOptionFive = new String(source.PaymentOptionFive);
        }
        if (source.PaymentOptionNine != null) {
            this.PaymentOptionNine = new String(source.PaymentOptionNine);
        }
        if (source.PaymentId != null) {
            this.PaymentId = new String(source.PaymentId);
        }
        if (source.PaymentOptionThree != null) {
            this.PaymentOptionThree = new String(source.PaymentOptionThree);
        }
        if (source.PaymentInternalName != null) {
            this.PaymentInternalName = new String(source.PaymentInternalName);
        }
        if (source.PaymentOptionFour != null) {
            this.PaymentOptionFour = new String(source.PaymentOptionFour);
        }
        if (source.PaymentOptionTen != null) {
            this.PaymentOptionTen = new String(source.PaymentOptionTen);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PaymentTag", this.PaymentTag);
        this.setParamSimple(map, prefix + "PaymentOptionHide", this.PaymentOptionHide);
        this.setParamSimple(map, prefix + "PaymentIcon", this.PaymentIcon);
        this.setParamSimple(map, prefix + "PaymentOptionSix", this.PaymentOptionSix);
        this.setParamSimple(map, prefix + "PaymentName", this.PaymentName);
        this.setParamSimple(map, prefix + "PaymentOptionSeven", this.PaymentOptionSeven);
        this.setParamSimple(map, prefix + "PaymentOptionOther", this.PaymentOptionOther);
        this.setParamSimple(map, prefix + "PaymentOptionTwo", this.PaymentOptionTwo);
        this.setParamSimple(map, prefix + "PaymentOptionOne", this.PaymentOptionOne);
        this.setParamSimple(map, prefix + "PaymentDiscountFee", this.PaymentDiscountFee);
        this.setParamSimple(map, prefix + "PaymentType", this.PaymentType);
        this.setParamSimple(map, prefix + "PaymentOptionFive", this.PaymentOptionFive);
        this.setParamSimple(map, prefix + "PaymentOptionNine", this.PaymentOptionNine);
        this.setParamSimple(map, prefix + "PaymentId", this.PaymentId);
        this.setParamSimple(map, prefix + "PaymentOptionThree", this.PaymentOptionThree);
        this.setParamSimple(map, prefix + "PaymentInternalName", this.PaymentInternalName);
        this.setParamSimple(map, prefix + "PaymentOptionFour", this.PaymentOptionFour);
        this.setParamSimple(map, prefix + "PaymentOptionTen", this.PaymentOptionTen);

    }
}

