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

public class AgentTaxPayment extends AbstractModel{

    /**
    * 主播银行账号
    */
    @SerializedName("AnchorId")
    @Expose
    private String AnchorId;

    /**
    * 主播姓名
    */
    @SerializedName("AnchorName")
    @Expose
    private String AnchorName;

    /**
    * 主播身份证
    */
    @SerializedName("AnchorIDCard")
    @Expose
    private String AnchorIDCard;

    /**
    * 纳税的开始时间，格式yyyy-MM-dd
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 纳税的结束时间，格式yyyy-MM-dd
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 流水金额。以“分”为单位
    */
    @SerializedName("Amount")
    @Expose
    private Long Amount;

    /**
    * 应缴税款。以“分”为单位
    */
    @SerializedName("Tax")
    @Expose
    private Long Tax;

    /**
     * Get 主播银行账号 
     * @return AnchorId 主播银行账号
     */
    public String getAnchorId() {
        return this.AnchorId;
    }

    /**
     * Set 主播银行账号
     * @param AnchorId 主播银行账号
     */
    public void setAnchorId(String AnchorId) {
        this.AnchorId = AnchorId;
    }

    /**
     * Get 主播姓名 
     * @return AnchorName 主播姓名
     */
    public String getAnchorName() {
        return this.AnchorName;
    }

    /**
     * Set 主播姓名
     * @param AnchorName 主播姓名
     */
    public void setAnchorName(String AnchorName) {
        this.AnchorName = AnchorName;
    }

    /**
     * Get 主播身份证 
     * @return AnchorIDCard 主播身份证
     */
    public String getAnchorIDCard() {
        return this.AnchorIDCard;
    }

    /**
     * Set 主播身份证
     * @param AnchorIDCard 主播身份证
     */
    public void setAnchorIDCard(String AnchorIDCard) {
        this.AnchorIDCard = AnchorIDCard;
    }

    /**
     * Get 纳税的开始时间，格式yyyy-MM-dd 
     * @return StartTime 纳税的开始时间，格式yyyy-MM-dd
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 纳税的开始时间，格式yyyy-MM-dd
     * @param StartTime 纳税的开始时间，格式yyyy-MM-dd
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 纳税的结束时间，格式yyyy-MM-dd 
     * @return EndTime 纳税的结束时间，格式yyyy-MM-dd
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 纳税的结束时间，格式yyyy-MM-dd
     * @param EndTime 纳税的结束时间，格式yyyy-MM-dd
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 流水金额。以“分”为单位 
     * @return Amount 流水金额。以“分”为单位
     */
    public Long getAmount() {
        return this.Amount;
    }

    /**
     * Set 流水金额。以“分”为单位
     * @param Amount 流水金额。以“分”为单位
     */
    public void setAmount(Long Amount) {
        this.Amount = Amount;
    }

    /**
     * Get 应缴税款。以“分”为单位 
     * @return Tax 应缴税款。以“分”为单位
     */
    public Long getTax() {
        return this.Tax;
    }

    /**
     * Set 应缴税款。以“分”为单位
     * @param Tax 应缴税款。以“分”为单位
     */
    public void setTax(Long Tax) {
        this.Tax = Tax;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AnchorId", this.AnchorId);
        this.setParamSimple(map, prefix + "AnchorName", this.AnchorName);
        this.setParamSimple(map, prefix + "AnchorIDCard", this.AnchorIDCard);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Amount", this.Amount);
        this.setParamSimple(map, prefix + "Tax", this.Tax);

    }
}

