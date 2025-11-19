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
package com.tencentcloudapi.svp.v20240125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SavingPlanOverviewDetail extends AbstractModel {

    /**
    * 节省计划资源id
    */
    @SerializedName("SpId")
    @Expose
    private String SpId;

    /**
    * 节省计划类型
    */
    @SerializedName("SpType")
    @Expose
    private String SpType;

    /**
    * 支付金额（单位：元）
    */
    @SerializedName("PayAmount")
    @Expose
    private String PayAmount;

    /**
    * 开始时间 yyyy-mm-dd HH:mm:ss格式
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间 yyyy-mm-dd HH:mm:ss格式
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 1 生效 2 失效 3 作废
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 累计节省金额（单位：元）
    */
    @SerializedName("SavingAmount")
    @Expose
    private String SavingAmount;

    /**
    * 地域
    */
    @SerializedName("Region")
    @Expose
    private String [] Region;

    /**
    * 1 全预付 2 部分预付 3 全不预付
    */
    @SerializedName("PayType")
    @Expose
    private Long PayType;

    /**
    * 购买时间 yyyy-mm-dd HH:mm:ss格式
    */
    @SerializedName("BuyTime")
    @Expose
    private String BuyTime;

    /**
    * 承诺金额
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PromiseAmount")
    @Expose
    private String PromiseAmount;

    /**
     * Get 节省计划资源id 
     * @return SpId 节省计划资源id
     */
    public String getSpId() {
        return this.SpId;
    }

    /**
     * Set 节省计划资源id
     * @param SpId 节省计划资源id
     */
    public void setSpId(String SpId) {
        this.SpId = SpId;
    }

    /**
     * Get 节省计划类型 
     * @return SpType 节省计划类型
     */
    public String getSpType() {
        return this.SpType;
    }

    /**
     * Set 节省计划类型
     * @param SpType 节省计划类型
     */
    public void setSpType(String SpType) {
        this.SpType = SpType;
    }

    /**
     * Get 支付金额（单位：元） 
     * @return PayAmount 支付金额（单位：元）
     */
    public String getPayAmount() {
        return this.PayAmount;
    }

    /**
     * Set 支付金额（单位：元）
     * @param PayAmount 支付金额（单位：元）
     */
    public void setPayAmount(String PayAmount) {
        this.PayAmount = PayAmount;
    }

    /**
     * Get 开始时间 yyyy-mm-dd HH:mm:ss格式 
     * @return StartTime 开始时间 yyyy-mm-dd HH:mm:ss格式
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间 yyyy-mm-dd HH:mm:ss格式
     * @param StartTime 开始时间 yyyy-mm-dd HH:mm:ss格式
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间 yyyy-mm-dd HH:mm:ss格式 
     * @return EndTime 结束时间 yyyy-mm-dd HH:mm:ss格式
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间 yyyy-mm-dd HH:mm:ss格式
     * @param EndTime 结束时间 yyyy-mm-dd HH:mm:ss格式
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 1 生效 2 失效 3 作废 
     * @return Status 1 生效 2 失效 3 作废
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 1 生效 2 失效 3 作废
     * @param Status 1 生效 2 失效 3 作废
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 累计节省金额（单位：元） 
     * @return SavingAmount 累计节省金额（单位：元）
     */
    public String getSavingAmount() {
        return this.SavingAmount;
    }

    /**
     * Set 累计节省金额（单位：元）
     * @param SavingAmount 累计节省金额（单位：元）
     */
    public void setSavingAmount(String SavingAmount) {
        this.SavingAmount = SavingAmount;
    }

    /**
     * Get 地域 
     * @return Region 地域
     */
    public String [] getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
     * @param Region 地域
     */
    public void setRegion(String [] Region) {
        this.Region = Region;
    }

    /**
     * Get 1 全预付 2 部分预付 3 全不预付 
     * @return PayType 1 全预付 2 部分预付 3 全不预付
     */
    public Long getPayType() {
        return this.PayType;
    }

    /**
     * Set 1 全预付 2 部分预付 3 全不预付
     * @param PayType 1 全预付 2 部分预付 3 全不预付
     */
    public void setPayType(Long PayType) {
        this.PayType = PayType;
    }

    /**
     * Get 购买时间 yyyy-mm-dd HH:mm:ss格式 
     * @return BuyTime 购买时间 yyyy-mm-dd HH:mm:ss格式
     */
    public String getBuyTime() {
        return this.BuyTime;
    }

    /**
     * Set 购买时间 yyyy-mm-dd HH:mm:ss格式
     * @param BuyTime 购买时间 yyyy-mm-dd HH:mm:ss格式
     */
    public void setBuyTime(String BuyTime) {
        this.BuyTime = BuyTime;
    }

    /**
     * Get 承诺金额
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PromiseAmount 承诺金额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPromiseAmount() {
        return this.PromiseAmount;
    }

    /**
     * Set 承诺金额
注意：此字段可能返回 null，表示取不到有效值。
     * @param PromiseAmount 承诺金额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPromiseAmount(String PromiseAmount) {
        this.PromiseAmount = PromiseAmount;
    }

    public SavingPlanOverviewDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SavingPlanOverviewDetail(SavingPlanOverviewDetail source) {
        if (source.SpId != null) {
            this.SpId = new String(source.SpId);
        }
        if (source.SpType != null) {
            this.SpType = new String(source.SpType);
        }
        if (source.PayAmount != null) {
            this.PayAmount = new String(source.PayAmount);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.SavingAmount != null) {
            this.SavingAmount = new String(source.SavingAmount);
        }
        if (source.Region != null) {
            this.Region = new String[source.Region.length];
            for (int i = 0; i < source.Region.length; i++) {
                this.Region[i] = new String(source.Region[i]);
            }
        }
        if (source.PayType != null) {
            this.PayType = new Long(source.PayType);
        }
        if (source.BuyTime != null) {
            this.BuyTime = new String(source.BuyTime);
        }
        if (source.PromiseAmount != null) {
            this.PromiseAmount = new String(source.PromiseAmount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpId", this.SpId);
        this.setParamSimple(map, prefix + "SpType", this.SpType);
        this.setParamSimple(map, prefix + "PayAmount", this.PayAmount);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "SavingAmount", this.SavingAmount);
        this.setParamArraySimple(map, prefix + "Region.", this.Region);
        this.setParamSimple(map, prefix + "PayType", this.PayType);
        this.setParamSimple(map, prefix + "BuyTime", this.BuyTime);
        this.setParamSimple(map, prefix + "PromiseAmount", this.PromiseAmount);

    }
}

