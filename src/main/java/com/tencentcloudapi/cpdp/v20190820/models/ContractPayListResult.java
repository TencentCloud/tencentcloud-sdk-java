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

public class ContractPayListResult extends AbstractModel{

    /**
    * 支付方式编号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PaymentId")
    @Expose
    private String PaymentId;

    /**
    * 支持的交易类型（多个以小写逗号分开，0现金，1刷卡，2主扫，3被扫，4JSPAY，5预授权）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PaymentType")
    @Expose
    private String PaymentType;

    /**
    * 支付标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PaymentTag")
    @Expose
    private String PaymentTag;

    /**
    * 支付方式图片url路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PaymentIcon")
    @Expose
    private String PaymentIcon;

    /**
    * 付款方式名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PaymentName")
    @Expose
    private String PaymentName;

    /**
    * 付款方式名称（内部名称）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PaymentInternalName")
    @Expose
    private String PaymentInternalName;

    /**
    * 支付方式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PaymentOptionOne")
    @Expose
    private String PaymentOptionOne;

    /**
    * 支付方式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PaymentOptionTwo")
    @Expose
    private String PaymentOptionTwo;

    /**
    * 支付方式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PaymentOptionThree")
    @Expose
    private String PaymentOptionThree;

    /**
    * 支付方式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PaymentOptionFour")
    @Expose
    private String PaymentOptionFour;

    /**
    * 支付方式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PaymentOptionFive")
    @Expose
    private String PaymentOptionFive;

    /**
    * 支付方式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PaymentOptionSix")
    @Expose
    private String PaymentOptionSix;

    /**
    * 支付方式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PaymentOptionSeven")
    @Expose
    private String PaymentOptionSeven;

    /**
    * 支付方式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PaymentOptionOther")
    @Expose
    private String PaymentOptionOther;

    /**
    * 支付方式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PaymentOptionNine")
    @Expose
    private String PaymentOptionNine;

    /**
    * 支付方式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PaymentOptionTen")
    @Expose
    private String PaymentOptionTen;

    /**
     * Get 支付方式编号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PaymentId 支付方式编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPaymentId() {
        return this.PaymentId;
    }

    /**
     * Set 支付方式编号
注意：此字段可能返回 null，表示取不到有效值。
     * @param PaymentId 支付方式编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPaymentId(String PaymentId) {
        this.PaymentId = PaymentId;
    }

    /**
     * Get 支持的交易类型（多个以小写逗号分开，0现金，1刷卡，2主扫，3被扫，4JSPAY，5预授权）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PaymentType 支持的交易类型（多个以小写逗号分开，0现金，1刷卡，2主扫，3被扫，4JSPAY，5预授权）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPaymentType() {
        return this.PaymentType;
    }

    /**
     * Set 支持的交易类型（多个以小写逗号分开，0现金，1刷卡，2主扫，3被扫，4JSPAY，5预授权）
注意：此字段可能返回 null，表示取不到有效值。
     * @param PaymentType 支持的交易类型（多个以小写逗号分开，0现金，1刷卡，2主扫，3被扫，4JSPAY，5预授权）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPaymentType(String PaymentType) {
        this.PaymentType = PaymentType;
    }

    /**
     * Get 支付标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PaymentTag 支付标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPaymentTag() {
        return this.PaymentTag;
    }

    /**
     * Set 支付标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param PaymentTag 支付标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPaymentTag(String PaymentTag) {
        this.PaymentTag = PaymentTag;
    }

    /**
     * Get 支付方式图片url路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PaymentIcon 支付方式图片url路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPaymentIcon() {
        return this.PaymentIcon;
    }

    /**
     * Set 支付方式图片url路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param PaymentIcon 支付方式图片url路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPaymentIcon(String PaymentIcon) {
        this.PaymentIcon = PaymentIcon;
    }

    /**
     * Get 付款方式名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PaymentName 付款方式名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPaymentName() {
        return this.PaymentName;
    }

    /**
     * Set 付款方式名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param PaymentName 付款方式名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPaymentName(String PaymentName) {
        this.PaymentName = PaymentName;
    }

    /**
     * Get 付款方式名称（内部名称）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PaymentInternalName 付款方式名称（内部名称）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPaymentInternalName() {
        return this.PaymentInternalName;
    }

    /**
     * Set 付款方式名称（内部名称）
注意：此字段可能返回 null，表示取不到有效值。
     * @param PaymentInternalName 付款方式名称（内部名称）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPaymentInternalName(String PaymentInternalName) {
        this.PaymentInternalName = PaymentInternalName;
    }

    /**
     * Get 支付方式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PaymentOptionOne 支付方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPaymentOptionOne() {
        return this.PaymentOptionOne;
    }

    /**
     * Set 支付方式
注意：此字段可能返回 null，表示取不到有效值。
     * @param PaymentOptionOne 支付方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPaymentOptionOne(String PaymentOptionOne) {
        this.PaymentOptionOne = PaymentOptionOne;
    }

    /**
     * Get 支付方式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PaymentOptionTwo 支付方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPaymentOptionTwo() {
        return this.PaymentOptionTwo;
    }

    /**
     * Set 支付方式
注意：此字段可能返回 null，表示取不到有效值。
     * @param PaymentOptionTwo 支付方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPaymentOptionTwo(String PaymentOptionTwo) {
        this.PaymentOptionTwo = PaymentOptionTwo;
    }

    /**
     * Get 支付方式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PaymentOptionThree 支付方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPaymentOptionThree() {
        return this.PaymentOptionThree;
    }

    /**
     * Set 支付方式
注意：此字段可能返回 null，表示取不到有效值。
     * @param PaymentOptionThree 支付方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPaymentOptionThree(String PaymentOptionThree) {
        this.PaymentOptionThree = PaymentOptionThree;
    }

    /**
     * Get 支付方式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PaymentOptionFour 支付方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPaymentOptionFour() {
        return this.PaymentOptionFour;
    }

    /**
     * Set 支付方式
注意：此字段可能返回 null，表示取不到有效值。
     * @param PaymentOptionFour 支付方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPaymentOptionFour(String PaymentOptionFour) {
        this.PaymentOptionFour = PaymentOptionFour;
    }

    /**
     * Get 支付方式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PaymentOptionFive 支付方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPaymentOptionFive() {
        return this.PaymentOptionFive;
    }

    /**
     * Set 支付方式
注意：此字段可能返回 null，表示取不到有效值。
     * @param PaymentOptionFive 支付方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPaymentOptionFive(String PaymentOptionFive) {
        this.PaymentOptionFive = PaymentOptionFive;
    }

    /**
     * Get 支付方式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PaymentOptionSix 支付方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPaymentOptionSix() {
        return this.PaymentOptionSix;
    }

    /**
     * Set 支付方式
注意：此字段可能返回 null，表示取不到有效值。
     * @param PaymentOptionSix 支付方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPaymentOptionSix(String PaymentOptionSix) {
        this.PaymentOptionSix = PaymentOptionSix;
    }

    /**
     * Get 支付方式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PaymentOptionSeven 支付方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPaymentOptionSeven() {
        return this.PaymentOptionSeven;
    }

    /**
     * Set 支付方式
注意：此字段可能返回 null，表示取不到有效值。
     * @param PaymentOptionSeven 支付方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPaymentOptionSeven(String PaymentOptionSeven) {
        this.PaymentOptionSeven = PaymentOptionSeven;
    }

    /**
     * Get 支付方式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PaymentOptionOther 支付方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPaymentOptionOther() {
        return this.PaymentOptionOther;
    }

    /**
     * Set 支付方式
注意：此字段可能返回 null，表示取不到有效值。
     * @param PaymentOptionOther 支付方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPaymentOptionOther(String PaymentOptionOther) {
        this.PaymentOptionOther = PaymentOptionOther;
    }

    /**
     * Get 支付方式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PaymentOptionNine 支付方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPaymentOptionNine() {
        return this.PaymentOptionNine;
    }

    /**
     * Set 支付方式
注意：此字段可能返回 null，表示取不到有效值。
     * @param PaymentOptionNine 支付方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPaymentOptionNine(String PaymentOptionNine) {
        this.PaymentOptionNine = PaymentOptionNine;
    }

    /**
     * Get 支付方式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PaymentOptionTen 支付方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPaymentOptionTen() {
        return this.PaymentOptionTen;
    }

    /**
     * Set 支付方式
注意：此字段可能返回 null，表示取不到有效值。
     * @param PaymentOptionTen 支付方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPaymentOptionTen(String PaymentOptionTen) {
        this.PaymentOptionTen = PaymentOptionTen;
    }

    public ContractPayListResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ContractPayListResult(ContractPayListResult source) {
        if (source.PaymentId != null) {
            this.PaymentId = new String(source.PaymentId);
        }
        if (source.PaymentType != null) {
            this.PaymentType = new String(source.PaymentType);
        }
        if (source.PaymentTag != null) {
            this.PaymentTag = new String(source.PaymentTag);
        }
        if (source.PaymentIcon != null) {
            this.PaymentIcon = new String(source.PaymentIcon);
        }
        if (source.PaymentName != null) {
            this.PaymentName = new String(source.PaymentName);
        }
        if (source.PaymentInternalName != null) {
            this.PaymentInternalName = new String(source.PaymentInternalName);
        }
        if (source.PaymentOptionOne != null) {
            this.PaymentOptionOne = new String(source.PaymentOptionOne);
        }
        if (source.PaymentOptionTwo != null) {
            this.PaymentOptionTwo = new String(source.PaymentOptionTwo);
        }
        if (source.PaymentOptionThree != null) {
            this.PaymentOptionThree = new String(source.PaymentOptionThree);
        }
        if (source.PaymentOptionFour != null) {
            this.PaymentOptionFour = new String(source.PaymentOptionFour);
        }
        if (source.PaymentOptionFive != null) {
            this.PaymentOptionFive = new String(source.PaymentOptionFive);
        }
        if (source.PaymentOptionSix != null) {
            this.PaymentOptionSix = new String(source.PaymentOptionSix);
        }
        if (source.PaymentOptionSeven != null) {
            this.PaymentOptionSeven = new String(source.PaymentOptionSeven);
        }
        if (source.PaymentOptionOther != null) {
            this.PaymentOptionOther = new String(source.PaymentOptionOther);
        }
        if (source.PaymentOptionNine != null) {
            this.PaymentOptionNine = new String(source.PaymentOptionNine);
        }
        if (source.PaymentOptionTen != null) {
            this.PaymentOptionTen = new String(source.PaymentOptionTen);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PaymentId", this.PaymentId);
        this.setParamSimple(map, prefix + "PaymentType", this.PaymentType);
        this.setParamSimple(map, prefix + "PaymentTag", this.PaymentTag);
        this.setParamSimple(map, prefix + "PaymentIcon", this.PaymentIcon);
        this.setParamSimple(map, prefix + "PaymentName", this.PaymentName);
        this.setParamSimple(map, prefix + "PaymentInternalName", this.PaymentInternalName);
        this.setParamSimple(map, prefix + "PaymentOptionOne", this.PaymentOptionOne);
        this.setParamSimple(map, prefix + "PaymentOptionTwo", this.PaymentOptionTwo);
        this.setParamSimple(map, prefix + "PaymentOptionThree", this.PaymentOptionThree);
        this.setParamSimple(map, prefix + "PaymentOptionFour", this.PaymentOptionFour);
        this.setParamSimple(map, prefix + "PaymentOptionFive", this.PaymentOptionFive);
        this.setParamSimple(map, prefix + "PaymentOptionSix", this.PaymentOptionSix);
        this.setParamSimple(map, prefix + "PaymentOptionSeven", this.PaymentOptionSeven);
        this.setParamSimple(map, prefix + "PaymentOptionOther", this.PaymentOptionOther);
        this.setParamSimple(map, prefix + "PaymentOptionNine", this.PaymentOptionNine);
        this.setParamSimple(map, prefix + "PaymentOptionTen", this.PaymentOptionTen);

    }
}

