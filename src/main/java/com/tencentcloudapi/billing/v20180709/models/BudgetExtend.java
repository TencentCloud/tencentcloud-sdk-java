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

public class BudgetExtend extends AbstractModel {

    /**
    * 预算名称
    */
    @SerializedName("BudgetName")
    @Expose
    private String BudgetName;

    /**
    * 预算额度
    */
    @SerializedName("BudgetQuota")
    @Expose
    private String BudgetQuota;

    /**
    * DAY 天，MONTH 月度，QUARTER 季度 ，YEAR 年度
    */
    @SerializedName("CycleType")
    @Expose
    private String CycleType;

    /**
    * BILL  系统账单，CONSUMPTION  消耗账单
    */
    @SerializedName("BillType")
    @Expose
    private String BillType;

    /**
    * COST 原价，REAL_COST 实际费用，CASH 现金，INCENTIVE 赠送金，VOUCHER 代金券，TRANSFER 分成金，TAX 税，AMOUNT_BEFORE_TAX 现金支付(税前)
    */
    @SerializedName("FeeType")
    @Expose
    private String FeeType;

    /**
    * 有效期起始时间 2025-01-01
    */
    @SerializedName("PeriodBegin")
    @Expose
    private String PeriodBegin;

    /**
    * 有效期结束时间  2025-12-01
    */
    @SerializedName("PeriodEnd")
    @Expose
    private String PeriodEnd;

    /**
    * COST，USAGE，RI，SP
    */
    @SerializedName("Dimensions")
    @Expose
    private String Dimensions;

    /**
    * FIX 固定值，CYCLE 不同值
    */
    @SerializedName("PlanType")
    @Expose
    private String PlanType;

    /**
    * 阈值提醒
    */
    @SerializedName("WarnJson")
    @Expose
    private BudgetWarn [] WarnJson;

    /**
    * 用户Uin
    */
    @SerializedName("PayerUin")
    @Expose
    private Long PayerUin;

    /**
    * 波动提醒
    */
    @SerializedName("WaveThresholdJson")
    @Expose
    private WaveThresholdForm [] WaveThresholdJson;

    /**
    * 预算备注
    */
    @SerializedName("BudgetNote")
    @Expose
    private String BudgetNote;

    /**
    * 自定义发送对象信息
    */
    @SerializedName("SendDetail")
    @Expose
    private String SendDetail;

    /**
    * 0:默认uin发送
    */
    @SerializedName("DefaultMode")
    @Expose
    private Long DefaultMode;

    /**
    * CUS 自定义预算，ZERO_COST 零支出预算模板，BY_MONTH 按月费用预算模板
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TemplateType")
    @Expose
    private String TemplateType;

    /**
    * (1, "未超支"),
(2, "超支")
    */
    @SerializedName("MoneyStatus")
    @Expose
    private Long MoneyStatus;

    /**
    * 提醒次数
    */
    @SerializedName("RemindTimes")
    @Expose
    private Long RemindTimes;

    /**
    * 创建预算时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新预算时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 预算关联Id
    */
    @SerializedName("BudgetId")
    @Expose
    private String BudgetId;

    /**
    * NO_FORECAST(没有设置预测),
 FORECAST_NO_DATA(设置了预测,但是没有数据),
FORECAST_HAS_DATA(设置了预测,且有预测数据)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HasForecast")
    @Expose
    private String HasForecast;

    /**
    * 预测费用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ForecastCost")
    @Expose
    private String ForecastCost;

    /**
    * 预测进度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ForecastProgress")
    @Expose
    private String ForecastProgress;

    /**
    * 实际费用
    */
    @SerializedName("RealCost")
    @Expose
    private String RealCost;

    /**
    * 自定义发送
    */
    @SerializedName("BudgetSendInfoForm")
    @Expose
    private BudgetSendInfoDto [] BudgetSendInfoForm;

    /**
    * 当前周期
    */
    @SerializedName("CurDateDesc")
    @Expose
    private String CurDateDesc;

    /**
    *  EXPIRED  已过期
ACTIVE 生效中
UNACTIVATED 已失效
ACTIVATED 待生效
    */
    @SerializedName("BudgetStatus")
    @Expose
    private String BudgetStatus;

    /**
    * 预算维度范围条件
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DimensionsRange")
    @Expose
    private BudgetConditionsForm DimensionsRange;

    /**
    * 预算进度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BudgetProgress")
    @Expose
    private String BudgetProgress;

    /**
    * 预算类型设置为计划预算时返回预算额度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BudgetQuotaJson")
    @Expose
    private BudgetPlan [] BudgetQuotaJson;

    /**
     * Get 预算名称 
     * @return BudgetName 预算名称
     */
    public String getBudgetName() {
        return this.BudgetName;
    }

    /**
     * Set 预算名称
     * @param BudgetName 预算名称
     */
    public void setBudgetName(String BudgetName) {
        this.BudgetName = BudgetName;
    }

    /**
     * Get 预算额度 
     * @return BudgetQuota 预算额度
     */
    public String getBudgetQuota() {
        return this.BudgetQuota;
    }

    /**
     * Set 预算额度
     * @param BudgetQuota 预算额度
     */
    public void setBudgetQuota(String BudgetQuota) {
        this.BudgetQuota = BudgetQuota;
    }

    /**
     * Get DAY 天，MONTH 月度，QUARTER 季度 ，YEAR 年度 
     * @return CycleType DAY 天，MONTH 月度，QUARTER 季度 ，YEAR 年度
     */
    public String getCycleType() {
        return this.CycleType;
    }

    /**
     * Set DAY 天，MONTH 月度，QUARTER 季度 ，YEAR 年度
     * @param CycleType DAY 天，MONTH 月度，QUARTER 季度 ，YEAR 年度
     */
    public void setCycleType(String CycleType) {
        this.CycleType = CycleType;
    }

    /**
     * Get BILL  系统账单，CONSUMPTION  消耗账单 
     * @return BillType BILL  系统账单，CONSUMPTION  消耗账单
     */
    public String getBillType() {
        return this.BillType;
    }

    /**
     * Set BILL  系统账单，CONSUMPTION  消耗账单
     * @param BillType BILL  系统账单，CONSUMPTION  消耗账单
     */
    public void setBillType(String BillType) {
        this.BillType = BillType;
    }

    /**
     * Get COST 原价，REAL_COST 实际费用，CASH 现金，INCENTIVE 赠送金，VOUCHER 代金券，TRANSFER 分成金，TAX 税，AMOUNT_BEFORE_TAX 现金支付(税前) 
     * @return FeeType COST 原价，REAL_COST 实际费用，CASH 现金，INCENTIVE 赠送金，VOUCHER 代金券，TRANSFER 分成金，TAX 税，AMOUNT_BEFORE_TAX 现金支付(税前)
     */
    public String getFeeType() {
        return this.FeeType;
    }

    /**
     * Set COST 原价，REAL_COST 实际费用，CASH 现金，INCENTIVE 赠送金，VOUCHER 代金券，TRANSFER 分成金，TAX 税，AMOUNT_BEFORE_TAX 现金支付(税前)
     * @param FeeType COST 原价，REAL_COST 实际费用，CASH 现金，INCENTIVE 赠送金，VOUCHER 代金券，TRANSFER 分成金，TAX 税，AMOUNT_BEFORE_TAX 现金支付(税前)
     */
    public void setFeeType(String FeeType) {
        this.FeeType = FeeType;
    }

    /**
     * Get 有效期起始时间 2025-01-01 
     * @return PeriodBegin 有效期起始时间 2025-01-01
     */
    public String getPeriodBegin() {
        return this.PeriodBegin;
    }

    /**
     * Set 有效期起始时间 2025-01-01
     * @param PeriodBegin 有效期起始时间 2025-01-01
     */
    public void setPeriodBegin(String PeriodBegin) {
        this.PeriodBegin = PeriodBegin;
    }

    /**
     * Get 有效期结束时间  2025-12-01 
     * @return PeriodEnd 有效期结束时间  2025-12-01
     */
    public String getPeriodEnd() {
        return this.PeriodEnd;
    }

    /**
     * Set 有效期结束时间  2025-12-01
     * @param PeriodEnd 有效期结束时间  2025-12-01
     */
    public void setPeriodEnd(String PeriodEnd) {
        this.PeriodEnd = PeriodEnd;
    }

    /**
     * Get COST，USAGE，RI，SP 
     * @return Dimensions COST，USAGE，RI，SP
     */
    public String getDimensions() {
        return this.Dimensions;
    }

    /**
     * Set COST，USAGE，RI，SP
     * @param Dimensions COST，USAGE，RI，SP
     */
    public void setDimensions(String Dimensions) {
        this.Dimensions = Dimensions;
    }

    /**
     * Get FIX 固定值，CYCLE 不同值 
     * @return PlanType FIX 固定值，CYCLE 不同值
     */
    public String getPlanType() {
        return this.PlanType;
    }

    /**
     * Set FIX 固定值，CYCLE 不同值
     * @param PlanType FIX 固定值，CYCLE 不同值
     */
    public void setPlanType(String PlanType) {
        this.PlanType = PlanType;
    }

    /**
     * Get 阈值提醒 
     * @return WarnJson 阈值提醒
     */
    public BudgetWarn [] getWarnJson() {
        return this.WarnJson;
    }

    /**
     * Set 阈值提醒
     * @param WarnJson 阈值提醒
     */
    public void setWarnJson(BudgetWarn [] WarnJson) {
        this.WarnJson = WarnJson;
    }

    /**
     * Get 用户Uin 
     * @return PayerUin 用户Uin
     */
    public Long getPayerUin() {
        return this.PayerUin;
    }

    /**
     * Set 用户Uin
     * @param PayerUin 用户Uin
     */
    public void setPayerUin(Long PayerUin) {
        this.PayerUin = PayerUin;
    }

    /**
     * Get 波动提醒 
     * @return WaveThresholdJson 波动提醒
     */
    public WaveThresholdForm [] getWaveThresholdJson() {
        return this.WaveThresholdJson;
    }

    /**
     * Set 波动提醒
     * @param WaveThresholdJson 波动提醒
     */
    public void setWaveThresholdJson(WaveThresholdForm [] WaveThresholdJson) {
        this.WaveThresholdJson = WaveThresholdJson;
    }

    /**
     * Get 预算备注 
     * @return BudgetNote 预算备注
     */
    public String getBudgetNote() {
        return this.BudgetNote;
    }

    /**
     * Set 预算备注
     * @param BudgetNote 预算备注
     */
    public void setBudgetNote(String BudgetNote) {
        this.BudgetNote = BudgetNote;
    }

    /**
     * Get 自定义发送对象信息 
     * @return SendDetail 自定义发送对象信息
     */
    public String getSendDetail() {
        return this.SendDetail;
    }

    /**
     * Set 自定义发送对象信息
     * @param SendDetail 自定义发送对象信息
     */
    public void setSendDetail(String SendDetail) {
        this.SendDetail = SendDetail;
    }

    /**
     * Get 0:默认uin发送 
     * @return DefaultMode 0:默认uin发送
     */
    public Long getDefaultMode() {
        return this.DefaultMode;
    }

    /**
     * Set 0:默认uin发送
     * @param DefaultMode 0:默认uin发送
     */
    public void setDefaultMode(Long DefaultMode) {
        this.DefaultMode = DefaultMode;
    }

    /**
     * Get CUS 自定义预算，ZERO_COST 零支出预算模板，BY_MONTH 按月费用预算模板
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TemplateType CUS 自定义预算，ZERO_COST 零支出预算模板，BY_MONTH 按月费用预算模板
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTemplateType() {
        return this.TemplateType;
    }

    /**
     * Set CUS 自定义预算，ZERO_COST 零支出预算模板，BY_MONTH 按月费用预算模板
注意：此字段可能返回 null，表示取不到有效值。
     * @param TemplateType CUS 自定义预算，ZERO_COST 零支出预算模板，BY_MONTH 按月费用预算模板
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTemplateType(String TemplateType) {
        this.TemplateType = TemplateType;
    }

    /**
     * Get (1, "未超支"),
(2, "超支") 
     * @return MoneyStatus (1, "未超支"),
(2, "超支")
     */
    public Long getMoneyStatus() {
        return this.MoneyStatus;
    }

    /**
     * Set (1, "未超支"),
(2, "超支")
     * @param MoneyStatus (1, "未超支"),
(2, "超支")
     */
    public void setMoneyStatus(Long MoneyStatus) {
        this.MoneyStatus = MoneyStatus;
    }

    /**
     * Get 提醒次数 
     * @return RemindTimes 提醒次数
     */
    public Long getRemindTimes() {
        return this.RemindTimes;
    }

    /**
     * Set 提醒次数
     * @param RemindTimes 提醒次数
     */
    public void setRemindTimes(Long RemindTimes) {
        this.RemindTimes = RemindTimes;
    }

    /**
     * Get 创建预算时间 
     * @return CreateTime 创建预算时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建预算时间
     * @param CreateTime 创建预算时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新预算时间 
     * @return UpdateTime 更新预算时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新预算时间
     * @param UpdateTime 更新预算时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 预算关联Id 
     * @return BudgetId 预算关联Id
     */
    public String getBudgetId() {
        return this.BudgetId;
    }

    /**
     * Set 预算关联Id
     * @param BudgetId 预算关联Id
     */
    public void setBudgetId(String BudgetId) {
        this.BudgetId = BudgetId;
    }

    /**
     * Get NO_FORECAST(没有设置预测),
 FORECAST_NO_DATA(设置了预测,但是没有数据),
FORECAST_HAS_DATA(设置了预测,且有预测数据)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HasForecast NO_FORECAST(没有设置预测),
 FORECAST_NO_DATA(设置了预测,但是没有数据),
FORECAST_HAS_DATA(设置了预测,且有预测数据)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHasForecast() {
        return this.HasForecast;
    }

    /**
     * Set NO_FORECAST(没有设置预测),
 FORECAST_NO_DATA(设置了预测,但是没有数据),
FORECAST_HAS_DATA(设置了预测,且有预测数据)
注意：此字段可能返回 null，表示取不到有效值。
     * @param HasForecast NO_FORECAST(没有设置预测),
 FORECAST_NO_DATA(设置了预测,但是没有数据),
FORECAST_HAS_DATA(设置了预测,且有预测数据)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHasForecast(String HasForecast) {
        this.HasForecast = HasForecast;
    }

    /**
     * Get 预测费用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ForecastCost 预测费用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getForecastCost() {
        return this.ForecastCost;
    }

    /**
     * Set 预测费用
注意：此字段可能返回 null，表示取不到有效值。
     * @param ForecastCost 预测费用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setForecastCost(String ForecastCost) {
        this.ForecastCost = ForecastCost;
    }

    /**
     * Get 预测进度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ForecastProgress 预测进度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getForecastProgress() {
        return this.ForecastProgress;
    }

    /**
     * Set 预测进度
注意：此字段可能返回 null，表示取不到有效值。
     * @param ForecastProgress 预测进度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setForecastProgress(String ForecastProgress) {
        this.ForecastProgress = ForecastProgress;
    }

    /**
     * Get 实际费用 
     * @return RealCost 实际费用
     */
    public String getRealCost() {
        return this.RealCost;
    }

    /**
     * Set 实际费用
     * @param RealCost 实际费用
     */
    public void setRealCost(String RealCost) {
        this.RealCost = RealCost;
    }

    /**
     * Get 自定义发送 
     * @return BudgetSendInfoForm 自定义发送
     */
    public BudgetSendInfoDto [] getBudgetSendInfoForm() {
        return this.BudgetSendInfoForm;
    }

    /**
     * Set 自定义发送
     * @param BudgetSendInfoForm 自定义发送
     */
    public void setBudgetSendInfoForm(BudgetSendInfoDto [] BudgetSendInfoForm) {
        this.BudgetSendInfoForm = BudgetSendInfoForm;
    }

    /**
     * Get 当前周期 
     * @return CurDateDesc 当前周期
     */
    public String getCurDateDesc() {
        return this.CurDateDesc;
    }

    /**
     * Set 当前周期
     * @param CurDateDesc 当前周期
     */
    public void setCurDateDesc(String CurDateDesc) {
        this.CurDateDesc = CurDateDesc;
    }

    /**
     * Get  EXPIRED  已过期
ACTIVE 生效中
UNACTIVATED 已失效
ACTIVATED 待生效 
     * @return BudgetStatus  EXPIRED  已过期
ACTIVE 生效中
UNACTIVATED 已失效
ACTIVATED 待生效
     */
    public String getBudgetStatus() {
        return this.BudgetStatus;
    }

    /**
     * Set  EXPIRED  已过期
ACTIVE 生效中
UNACTIVATED 已失效
ACTIVATED 待生效
     * @param BudgetStatus  EXPIRED  已过期
ACTIVE 生效中
UNACTIVATED 已失效
ACTIVATED 待生效
     */
    public void setBudgetStatus(String BudgetStatus) {
        this.BudgetStatus = BudgetStatus;
    }

    /**
     * Get 预算维度范围条件
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DimensionsRange 预算维度范围条件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BudgetConditionsForm getDimensionsRange() {
        return this.DimensionsRange;
    }

    /**
     * Set 预算维度范围条件
注意：此字段可能返回 null，表示取不到有效值。
     * @param DimensionsRange 预算维度范围条件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDimensionsRange(BudgetConditionsForm DimensionsRange) {
        this.DimensionsRange = DimensionsRange;
    }

    /**
     * Get 预算进度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BudgetProgress 预算进度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBudgetProgress() {
        return this.BudgetProgress;
    }

    /**
     * Set 预算进度
注意：此字段可能返回 null，表示取不到有效值。
     * @param BudgetProgress 预算进度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBudgetProgress(String BudgetProgress) {
        this.BudgetProgress = BudgetProgress;
    }

    /**
     * Get 预算类型设置为计划预算时返回预算额度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BudgetQuotaJson 预算类型设置为计划预算时返回预算额度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BudgetPlan [] getBudgetQuotaJson() {
        return this.BudgetQuotaJson;
    }

    /**
     * Set 预算类型设置为计划预算时返回预算额度
注意：此字段可能返回 null，表示取不到有效值。
     * @param BudgetQuotaJson 预算类型设置为计划预算时返回预算额度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBudgetQuotaJson(BudgetPlan [] BudgetQuotaJson) {
        this.BudgetQuotaJson = BudgetQuotaJson;
    }

    public BudgetExtend() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BudgetExtend(BudgetExtend source) {
        if (source.BudgetName != null) {
            this.BudgetName = new String(source.BudgetName);
        }
        if (source.BudgetQuota != null) {
            this.BudgetQuota = new String(source.BudgetQuota);
        }
        if (source.CycleType != null) {
            this.CycleType = new String(source.CycleType);
        }
        if (source.BillType != null) {
            this.BillType = new String(source.BillType);
        }
        if (source.FeeType != null) {
            this.FeeType = new String(source.FeeType);
        }
        if (source.PeriodBegin != null) {
            this.PeriodBegin = new String(source.PeriodBegin);
        }
        if (source.PeriodEnd != null) {
            this.PeriodEnd = new String(source.PeriodEnd);
        }
        if (source.Dimensions != null) {
            this.Dimensions = new String(source.Dimensions);
        }
        if (source.PlanType != null) {
            this.PlanType = new String(source.PlanType);
        }
        if (source.WarnJson != null) {
            this.WarnJson = new BudgetWarn[source.WarnJson.length];
            for (int i = 0; i < source.WarnJson.length; i++) {
                this.WarnJson[i] = new BudgetWarn(source.WarnJson[i]);
            }
        }
        if (source.PayerUin != null) {
            this.PayerUin = new Long(source.PayerUin);
        }
        if (source.WaveThresholdJson != null) {
            this.WaveThresholdJson = new WaveThresholdForm[source.WaveThresholdJson.length];
            for (int i = 0; i < source.WaveThresholdJson.length; i++) {
                this.WaveThresholdJson[i] = new WaveThresholdForm(source.WaveThresholdJson[i]);
            }
        }
        if (source.BudgetNote != null) {
            this.BudgetNote = new String(source.BudgetNote);
        }
        if (source.SendDetail != null) {
            this.SendDetail = new String(source.SendDetail);
        }
        if (source.DefaultMode != null) {
            this.DefaultMode = new Long(source.DefaultMode);
        }
        if (source.TemplateType != null) {
            this.TemplateType = new String(source.TemplateType);
        }
        if (source.MoneyStatus != null) {
            this.MoneyStatus = new Long(source.MoneyStatus);
        }
        if (source.RemindTimes != null) {
            this.RemindTimes = new Long(source.RemindTimes);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.BudgetId != null) {
            this.BudgetId = new String(source.BudgetId);
        }
        if (source.HasForecast != null) {
            this.HasForecast = new String(source.HasForecast);
        }
        if (source.ForecastCost != null) {
            this.ForecastCost = new String(source.ForecastCost);
        }
        if (source.ForecastProgress != null) {
            this.ForecastProgress = new String(source.ForecastProgress);
        }
        if (source.RealCost != null) {
            this.RealCost = new String(source.RealCost);
        }
        if (source.BudgetSendInfoForm != null) {
            this.BudgetSendInfoForm = new BudgetSendInfoDto[source.BudgetSendInfoForm.length];
            for (int i = 0; i < source.BudgetSendInfoForm.length; i++) {
                this.BudgetSendInfoForm[i] = new BudgetSendInfoDto(source.BudgetSendInfoForm[i]);
            }
        }
        if (source.CurDateDesc != null) {
            this.CurDateDesc = new String(source.CurDateDesc);
        }
        if (source.BudgetStatus != null) {
            this.BudgetStatus = new String(source.BudgetStatus);
        }
        if (source.DimensionsRange != null) {
            this.DimensionsRange = new BudgetConditionsForm(source.DimensionsRange);
        }
        if (source.BudgetProgress != null) {
            this.BudgetProgress = new String(source.BudgetProgress);
        }
        if (source.BudgetQuotaJson != null) {
            this.BudgetQuotaJson = new BudgetPlan[source.BudgetQuotaJson.length];
            for (int i = 0; i < source.BudgetQuotaJson.length; i++) {
                this.BudgetQuotaJson[i] = new BudgetPlan(source.BudgetQuotaJson[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BudgetName", this.BudgetName);
        this.setParamSimple(map, prefix + "BudgetQuota", this.BudgetQuota);
        this.setParamSimple(map, prefix + "CycleType", this.CycleType);
        this.setParamSimple(map, prefix + "BillType", this.BillType);
        this.setParamSimple(map, prefix + "FeeType", this.FeeType);
        this.setParamSimple(map, prefix + "PeriodBegin", this.PeriodBegin);
        this.setParamSimple(map, prefix + "PeriodEnd", this.PeriodEnd);
        this.setParamSimple(map, prefix + "Dimensions", this.Dimensions);
        this.setParamSimple(map, prefix + "PlanType", this.PlanType);
        this.setParamArrayObj(map, prefix + "WarnJson.", this.WarnJson);
        this.setParamSimple(map, prefix + "PayerUin", this.PayerUin);
        this.setParamArrayObj(map, prefix + "WaveThresholdJson.", this.WaveThresholdJson);
        this.setParamSimple(map, prefix + "BudgetNote", this.BudgetNote);
        this.setParamSimple(map, prefix + "SendDetail", this.SendDetail);
        this.setParamSimple(map, prefix + "DefaultMode", this.DefaultMode);
        this.setParamSimple(map, prefix + "TemplateType", this.TemplateType);
        this.setParamSimple(map, prefix + "MoneyStatus", this.MoneyStatus);
        this.setParamSimple(map, prefix + "RemindTimes", this.RemindTimes);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "BudgetId", this.BudgetId);
        this.setParamSimple(map, prefix + "HasForecast", this.HasForecast);
        this.setParamSimple(map, prefix + "ForecastCost", this.ForecastCost);
        this.setParamSimple(map, prefix + "ForecastProgress", this.ForecastProgress);
        this.setParamSimple(map, prefix + "RealCost", this.RealCost);
        this.setParamArrayObj(map, prefix + "BudgetSendInfoForm.", this.BudgetSendInfoForm);
        this.setParamSimple(map, prefix + "CurDateDesc", this.CurDateDesc);
        this.setParamSimple(map, prefix + "BudgetStatus", this.BudgetStatus);
        this.setParamObj(map, prefix + "DimensionsRange.", this.DimensionsRange);
        this.setParamSimple(map, prefix + "BudgetProgress", this.BudgetProgress);
        this.setParamArrayObj(map, prefix + "BudgetQuotaJson.", this.BudgetQuotaJson);

    }
}

