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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VoucherInfos extends AbstractModel{

    /**
    * 代金券拥有者
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * 券状态：待使用：unUsed，已使用： used，已发货：delivered，已作废： cancel，已过期：overdue
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 代金券面额（微分）
    */
    @SerializedName("NominalValue")
    @Expose
    private Long NominalValue;

    /**
    * 剩余金额（微分）
    */
    @SerializedName("Balance")
    @Expose
    private Long Balance;

    /**
    * 代金券id
    */
    @SerializedName("VoucherId")
    @Expose
    private String VoucherId;

    /**
    * postPay后付费/prePay预付费/riPay预留实例/空字符串或者'*'表示全部模式
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * 付费场景PayMode=postPay时：spotpay-竞价实例,"settle account"-普通后付费PayMode=prePay时：purchase-包年包月新购，renew-包年包月续费（自动续费），modify-包年包月配置变更(变配）PayMode=riPay时：oneOffFee-预留实例预付，hourlyFee-预留实例每小时扣费，*-支持全部付费场景
    */
    @SerializedName("PayScene")
    @Expose
    private String PayScene;

    /**
    * 有效期生效时间
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * 有效期截止时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 适用商品信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplicableProducts")
    @Expose
    private ApplicableProducts ApplicableProducts;

    /**
    * 不适用商品信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExcludedProducts")
    @Expose
    private ExcludedProducts [] ExcludedProducts;

    /**
     * Get 代金券拥有者 
     * @return OwnerUin 代金券拥有者
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set 代金券拥有者
     * @param OwnerUin 代金券拥有者
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get 券状态：待使用：unUsed，已使用： used，已发货：delivered，已作废： cancel，已过期：overdue 
     * @return Status 券状态：待使用：unUsed，已使用： used，已发货：delivered，已作废： cancel，已过期：overdue
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 券状态：待使用：unUsed，已使用： used，已发货：delivered，已作废： cancel，已过期：overdue
     * @param Status 券状态：待使用：unUsed，已使用： used，已发货：delivered，已作废： cancel，已过期：overdue
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 代金券面额（微分） 
     * @return NominalValue 代金券面额（微分）
     */
    public Long getNominalValue() {
        return this.NominalValue;
    }

    /**
     * Set 代金券面额（微分）
     * @param NominalValue 代金券面额（微分）
     */
    public void setNominalValue(Long NominalValue) {
        this.NominalValue = NominalValue;
    }

    /**
     * Get 剩余金额（微分） 
     * @return Balance 剩余金额（微分）
     */
    public Long getBalance() {
        return this.Balance;
    }

    /**
     * Set 剩余金额（微分）
     * @param Balance 剩余金额（微分）
     */
    public void setBalance(Long Balance) {
        this.Balance = Balance;
    }

    /**
     * Get 代金券id 
     * @return VoucherId 代金券id
     */
    public String getVoucherId() {
        return this.VoucherId;
    }

    /**
     * Set 代金券id
     * @param VoucherId 代金券id
     */
    public void setVoucherId(String VoucherId) {
        this.VoucherId = VoucherId;
    }

    /**
     * Get postPay后付费/prePay预付费/riPay预留实例/空字符串或者'*'表示全部模式 
     * @return PayMode postPay后付费/prePay预付费/riPay预留实例/空字符串或者'*'表示全部模式
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set postPay后付费/prePay预付费/riPay预留实例/空字符串或者'*'表示全部模式
     * @param PayMode postPay后付费/prePay预付费/riPay预留实例/空字符串或者'*'表示全部模式
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 付费场景PayMode=postPay时：spotpay-竞价实例,"settle account"-普通后付费PayMode=prePay时：purchase-包年包月新购，renew-包年包月续费（自动续费），modify-包年包月配置变更(变配）PayMode=riPay时：oneOffFee-预留实例预付，hourlyFee-预留实例每小时扣费，*-支持全部付费场景 
     * @return PayScene 付费场景PayMode=postPay时：spotpay-竞价实例,"settle account"-普通后付费PayMode=prePay时：purchase-包年包月新购，renew-包年包月续费（自动续费），modify-包年包月配置变更(变配）PayMode=riPay时：oneOffFee-预留实例预付，hourlyFee-预留实例每小时扣费，*-支持全部付费场景
     */
    public String getPayScene() {
        return this.PayScene;
    }

    /**
     * Set 付费场景PayMode=postPay时：spotpay-竞价实例,"settle account"-普通后付费PayMode=prePay时：purchase-包年包月新购，renew-包年包月续费（自动续费），modify-包年包月配置变更(变配）PayMode=riPay时：oneOffFee-预留实例预付，hourlyFee-预留实例每小时扣费，*-支持全部付费场景
     * @param PayScene 付费场景PayMode=postPay时：spotpay-竞价实例,"settle account"-普通后付费PayMode=prePay时：purchase-包年包月新购，renew-包年包月续费（自动续费），modify-包年包月配置变更(变配）PayMode=riPay时：oneOffFee-预留实例预付，hourlyFee-预留实例每小时扣费，*-支持全部付费场景
     */
    public void setPayScene(String PayScene) {
        this.PayScene = PayScene;
    }

    /**
     * Get 有效期生效时间 
     * @return BeginTime 有效期生效时间
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set 有效期生效时间
     * @param BeginTime 有效期生效时间
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get 有效期截止时间 
     * @return EndTime 有效期截止时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 有效期截止时间
     * @param EndTime 有效期截止时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 适用商品信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplicableProducts 适用商品信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ApplicableProducts getApplicableProducts() {
        return this.ApplicableProducts;
    }

    /**
     * Set 适用商品信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicableProducts 适用商品信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicableProducts(ApplicableProducts ApplicableProducts) {
        this.ApplicableProducts = ApplicableProducts;
    }

    /**
     * Get 不适用商品信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExcludedProducts 不适用商品信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ExcludedProducts [] getExcludedProducts() {
        return this.ExcludedProducts;
    }

    /**
     * Set 不适用商品信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExcludedProducts 不适用商品信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExcludedProducts(ExcludedProducts [] ExcludedProducts) {
        this.ExcludedProducts = ExcludedProducts;
    }

    public VoucherInfos() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VoucherInfos(VoucherInfos source) {
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.NominalValue != null) {
            this.NominalValue = new Long(source.NominalValue);
        }
        if (source.Balance != null) {
            this.Balance = new Long(source.Balance);
        }
        if (source.VoucherId != null) {
            this.VoucherId = new String(source.VoucherId);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.PayScene != null) {
            this.PayScene = new String(source.PayScene);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.ApplicableProducts != null) {
            this.ApplicableProducts = new ApplicableProducts(source.ApplicableProducts);
        }
        if (source.ExcludedProducts != null) {
            this.ExcludedProducts = new ExcludedProducts[source.ExcludedProducts.length];
            for (int i = 0; i < source.ExcludedProducts.length; i++) {
                this.ExcludedProducts[i] = new ExcludedProducts(source.ExcludedProducts[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "NominalValue", this.NominalValue);
        this.setParamSimple(map, prefix + "Balance", this.Balance);
        this.setParamSimple(map, prefix + "VoucherId", this.VoucherId);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "PayScene", this.PayScene);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamObj(map, prefix + "ApplicableProducts.", this.ApplicableProducts);
        this.setParamArrayObj(map, prefix + "ExcludedProducts.", this.ExcludedProducts);

    }
}

