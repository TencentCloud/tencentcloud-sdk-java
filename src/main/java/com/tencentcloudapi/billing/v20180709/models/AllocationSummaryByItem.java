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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AllocationSummaryByItem extends AbstractModel {

    /**
    * 分账单元唯一标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TreeNodeUniqKey")
    @Expose
    private String TreeNodeUniqKey;

    /**
    * 分账单元名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TreeNodeUniqKeyName")
    @Expose
    private String TreeNodeUniqKeyName;

    /**
    * 日期：结算日期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BillDate")
    @Expose
    private String BillDate;

    /**
    * 支付者 UIN：支付者的账号 ID，账号 ID 是用户在腾讯云的唯一账号标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PayerUin")
    @Expose
    private String PayerUin;

    /**
    * 使用者 UIN：实际使用资源的账号 ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * 操作者 UIN：操作者账号 ID（预付费资源下单或后付费操作开通资源账号的ID或者角色 ID）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OperateUin")
    @Expose
    private String OperateUin;

    /**
    * 计费模式编码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * 计费模式：资源的计费模式，区分为包年包月和按量计费
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PayModeName")
    @Expose
    private String PayModeName;

    /**
    * 交易类型编码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ActionType")
    @Expose
    private String ActionType;

    /**
    * 交易类型：明细交易类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ActionTypeName")
    @Expose
    private String ActionTypeName;

    /**
    * 产品编码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BusinessCode")
    @Expose
    private String BusinessCode;

    /**
    * 产品名称：用户所采购的各类云产品
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BusinessCodeName")
    @Expose
    private String BusinessCodeName;

    /**
    * 子产品编码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductCode")
    @Expose
    private String ProductCode;

    /**
    * 子产品名称：用户采购的具体产品细分类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProductCodeName")
    @Expose
    private String ProductCodeName;

    /**
    * 地域ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * 地域名称：资源所属地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * 可用区ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * 可用区：资源所属可用区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * 实例类型编码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 实例类型：购买的产品服务对应的实例类型，包括资源包、RI、SP、竞价实例。常规实例默认展示“-”
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceTypeName")
    @Expose
    private String InstanceTypeName;

    /**
    * 资源ID：不同产品因资源形态不同，资源内容不完全相同，如云服务器 CVM 为对应的实例 ID； 若该产品被分拆，则展示产品分拆后的分拆项 ID，如 COS 桶 ID，CDN 域名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 实例名称：用户在控制台为资源设置的名称，如未设置默认为空；若该产品被分拆，则展示分拆产品分拆后的分拆项资源别名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * 分账标签：资源绑定的标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tag")
    @Expose
    private BillTag [] Tag;

    /**
    * 项目ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 项目名称：资源归属的项目，用户在控制台给资源自主分配项目，未分配则是默认项目
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * 费用归集类型：费用来源类型，分摊、归集、未分配
0 - 分摊
1 - 归集
-1 - 未分配
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AllocationType")
    @Expose
    private Long AllocationType;

    /**
    * 组件原价：原价 = 组件刊例价 * 组件用量 * 使用时长（如客户享受一口价/合同价则默认不展示，退费类场景也默认不展示），指定价模式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalCost")
    @Expose
    private String TotalCost;

    /**
    * 预留实例抵扣时长：本产品或服务使用预留实例抵扣的使用时长
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiTimeSpan")
    @Expose
    private String RiTimeSpan;

    /**
    * 预留实例抵扣原价：本产品或服务使用预留实例抵扣的组件原价金额
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiCost")
    @Expose
    private String RiCost;

    /**
    * 优惠后总价：优惠后总价 =（原价 - 预留实例抵扣原价 - 节省计划抵扣原价）* 折扣率
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RealTotalCost")
    @Expose
    private String RealTotalCost;

    /**
    * 现金账户支出(元)：通过现金账户支付的金额
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CashPayAmount")
    @Expose
    private String CashPayAmount;

    /**
    * 代金券支出(元)：使用各类优惠券（如代金券、现金券等）支付的金额
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VoucherPayAmount")
    @Expose
    private String VoucherPayAmount;

    /**
    * 赠送账户支出(元)：使用赠送金支付的金额
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IncentivePayAmount")
    @Expose
    private String IncentivePayAmount;

    /**
    * 分成账户支出(元)：通过分成金账户支付的金额
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TransferPayAmount")
    @Expose
    private String TransferPayAmount;

    /**
    * 组件名称编码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ItemCode")
    @Expose
    private String ItemCode;

    /**
    * 组件名称：用户购买的产品或服务，所包含的具体组件
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ItemCodeName")
    @Expose
    private String ItemCodeName;

    /**
    * 组件类型编码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ComponentCode")
    @Expose
    private String ComponentCode;

    /**
    * 组件类型：用户购买的产品或服务对应的组件大类
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ComponentCodeName")
    @Expose
    private String ComponentCodeName;

    /**
    * 分拆项 ID：涉及分拆产品的分拆后的分拆项 ID，如 COS 桶 ID，CDN 域名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SplitItemId")
    @Expose
    private String SplitItemId;

    /**
    * 分拆项名称：涉及分拆产品的分拆后的分拆项
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SplitItemName")
    @Expose
    private String SplitItemName;

    /**
    * 开始使用时间：产品服务开始使用时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FeeBeginTime")
    @Expose
    private String FeeBeginTime;

    /**
    * 结束使用时间：产品服务结束使用时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FeeEndTime")
    @Expose
    private String FeeEndTime;

    /**
    * 节省计划抵扣原价：节省计划抵扣原价 = 节省计划包抵扣面值 / 节省计划抵扣率
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SPCost")
    @Expose
    private String SPCost;

    /**
    * 国内国际编码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegionType")
    @Expose
    private String RegionType;

    /**
    * 国内国际：资源所属区域类型（国内、国际）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegionTypeName")
    @Expose
    private String RegionTypeName;

    /**
    * 组件刊例价：组件的官网原始单价（如客户享受一口价/合同价则默认不展示）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SinglePrice")
    @Expose
    private String SinglePrice;

    /**
    * 组件单价：组件的折后单价，组件单价 = 刊例价 * 折扣
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContractPrice")
    @Expose
    private String ContractPrice;

    /**
    * 组件价格单位：组件价格的单位，单位构成：元/用量单位/时长单位
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SinglePriceUnit")
    @Expose
    private String SinglePriceUnit;

    /**
    * 组件用量：该组件实际结算用量，组件用量=组件原始用量-抵扣用量（含资源包）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UsedAmount")
    @Expose
    private String UsedAmount;

    /**
    * 组件用量单位：组件用量对应的单位
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UsedAmountUnit")
    @Expose
    private String UsedAmountUnit;

    /**
    * 使用时长：资源使用的时长，组件用量=组件原始使用时长-抵扣时长（含资源包）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeSpan")
    @Expose
    private String TimeSpan;

    /**
    * 时长单位：资源使用时长的单位
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * 备注属性（实例配置）：其他备注信息，如预留实例的预留实例类型和交易类型、CCN 产品的两端地域信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReserveDetail")
    @Expose
    private String ReserveDetail;

    /**
    * 原始用量/时长：组件被资源包抵扣前的原始用量
（目前仅实时音视频、弹性微服务、云呼叫中心及专属可用区产品支持该信息外显，其他产品尚在接入中）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RealTotalMeasure")
    @Expose
    private String RealTotalMeasure;

    /**
    * 抵扣用量/时长（含资源包）：组件被资源包抵扣的用量
（目前仅实时音视频、弹性微服务、云呼叫中心及专属可用区产品支持该信息外显，其他产品尚在接入中）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeductedMeasure")
    @Expose
    private String DeductedMeasure;

    /**
    * 折扣率：本资源享受的折扣率（如客户享受一口价/合同价则默认不展示，退费场景也默认不展示）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Discount")
    @Expose
    private String Discount;

    /**
    * 混合折扣率：综合各类折扣抵扣信息后的最终折扣率，混合折扣率=优惠后总价/原价
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BlendedDiscount")
    @Expose
    private String BlendedDiscount;

    /**
    * 价格属性：该组件除单价、时长外的其他影响折扣定价的属性信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PriceInfo")
    @Expose
    private String [] PriceInfo;

    /**
    * 计算规则说明：特殊交易类型计费结算的详细计算说明，如退费及变配
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Formula")
    @Expose
    private String Formula;

    /**
    * 计费规则：各产品详细的计费规则官网说明链接
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FormulaUrl")
    @Expose
    private String FormulaUrl;

    /**
    * 配置描述：资源配置规格信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ComponentConfig")
    @Expose
    private String ComponentConfig;

    /**
    * SPDeduction
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SPDeduction")
    @Expose
    private String SPDeduction;

    /**
    * 节省计划抵扣率：节省计划可用余额额度范围内，节省计划对于此组件打的折扣率
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SPDeductionRate")
    @Expose
    private String SPDeductionRate;

    /**
    * AssociatedOrder
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssociatedOrder")
    @Expose
    private String AssociatedOrder;

    /**
    * 当前消费项的优惠对象，例如：官网折扣、用户折扣、活动折扣。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiscountObject")
    @Expose
    private String DiscountObject;

    /**
    * 当前消费项的优惠类型，例如：折扣、合同价。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiscountType")
    @Expose
    private String DiscountType;

    /**
    * 对优惠类型的补充描述，例如：商务折扣8折，则优惠类型为“折扣”，优惠内容为“0.8”。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiscountContent")
    @Expose
    private String DiscountContent;

    /**
    * 账单月
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BillMonth")
    @Expose
    private String BillMonth;

    /**
     * Get 分账单元唯一标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TreeNodeUniqKey 分账单元唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTreeNodeUniqKey() {
        return this.TreeNodeUniqKey;
    }

    /**
     * Set 分账单元唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param TreeNodeUniqKey 分账单元唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTreeNodeUniqKey(String TreeNodeUniqKey) {
        this.TreeNodeUniqKey = TreeNodeUniqKey;
    }

    /**
     * Get 分账单元名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TreeNodeUniqKeyName 分账单元名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTreeNodeUniqKeyName() {
        return this.TreeNodeUniqKeyName;
    }

    /**
     * Set 分账单元名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TreeNodeUniqKeyName 分账单元名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTreeNodeUniqKeyName(String TreeNodeUniqKeyName) {
        this.TreeNodeUniqKeyName = TreeNodeUniqKeyName;
    }

    /**
     * Get 日期：结算日期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BillDate 日期：结算日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBillDate() {
        return this.BillDate;
    }

    /**
     * Set 日期：结算日期
注意：此字段可能返回 null，表示取不到有效值。
     * @param BillDate 日期：结算日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBillDate(String BillDate) {
        this.BillDate = BillDate;
    }

    /**
     * Get 支付者 UIN：支付者的账号 ID，账号 ID 是用户在腾讯云的唯一账号标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PayerUin 支付者 UIN：支付者的账号 ID，账号 ID 是用户在腾讯云的唯一账号标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPayerUin() {
        return this.PayerUin;
    }

    /**
     * Set 支付者 UIN：支付者的账号 ID，账号 ID 是用户在腾讯云的唯一账号标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param PayerUin 支付者 UIN：支付者的账号 ID，账号 ID 是用户在腾讯云的唯一账号标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPayerUin(String PayerUin) {
        this.PayerUin = PayerUin;
    }

    /**
     * Get 使用者 UIN：实际使用资源的账号 ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerUin 使用者 UIN：实际使用资源的账号 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set 使用者 UIN：实际使用资源的账号 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerUin 使用者 UIN：实际使用资源的账号 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get 操作者 UIN：操作者账号 ID（预付费资源下单或后付费操作开通资源账号的ID或者角色 ID）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OperateUin 操作者 UIN：操作者账号 ID（预付费资源下单或后付费操作开通资源账号的ID或者角色 ID）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOperateUin() {
        return this.OperateUin;
    }

    /**
     * Set 操作者 UIN：操作者账号 ID（预付费资源下单或后付费操作开通资源账号的ID或者角色 ID）
注意：此字段可能返回 null，表示取不到有效值。
     * @param OperateUin 操作者 UIN：操作者账号 ID（预付费资源下单或后付费操作开通资源账号的ID或者角色 ID）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperateUin(String OperateUin) {
        this.OperateUin = OperateUin;
    }

    /**
     * Get 计费模式编码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PayMode 计费模式编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 计费模式编码
注意：此字段可能返回 null，表示取不到有效值。
     * @param PayMode 计费模式编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 计费模式：资源的计费模式，区分为包年包月和按量计费
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PayModeName 计费模式：资源的计费模式，区分为包年包月和按量计费
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPayModeName() {
        return this.PayModeName;
    }

    /**
     * Set 计费模式：资源的计费模式，区分为包年包月和按量计费
注意：此字段可能返回 null，表示取不到有效值。
     * @param PayModeName 计费模式：资源的计费模式，区分为包年包月和按量计费
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPayModeName(String PayModeName) {
        this.PayModeName = PayModeName;
    }

    /**
     * Get 交易类型编码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ActionType 交易类型编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getActionType() {
        return this.ActionType;
    }

    /**
     * Set 交易类型编码
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActionType 交易类型编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActionType(String ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get 交易类型：明细交易类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ActionTypeName 交易类型：明细交易类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getActionTypeName() {
        return this.ActionTypeName;
    }

    /**
     * Set 交易类型：明细交易类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActionTypeName 交易类型：明细交易类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActionTypeName(String ActionTypeName) {
        this.ActionTypeName = ActionTypeName;
    }

    /**
     * Get 产品编码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BusinessCode 产品编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBusinessCode() {
        return this.BusinessCode;
    }

    /**
     * Set 产品编码
注意：此字段可能返回 null，表示取不到有效值。
     * @param BusinessCode 产品编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBusinessCode(String BusinessCode) {
        this.BusinessCode = BusinessCode;
    }

    /**
     * Get 产品名称：用户所采购的各类云产品
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BusinessCodeName 产品名称：用户所采购的各类云产品
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBusinessCodeName() {
        return this.BusinessCodeName;
    }

    /**
     * Set 产品名称：用户所采购的各类云产品
注意：此字段可能返回 null，表示取不到有效值。
     * @param BusinessCodeName 产品名称：用户所采购的各类云产品
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBusinessCodeName(String BusinessCodeName) {
        this.BusinessCodeName = BusinessCodeName;
    }

    /**
     * Get 子产品编码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductCode 子产品编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProductCode() {
        return this.ProductCode;
    }

    /**
     * Set 子产品编码
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductCode 子产品编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductCode(String ProductCode) {
        this.ProductCode = ProductCode;
    }

    /**
     * Get 子产品名称：用户采购的具体产品细分类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProductCodeName 子产品名称：用户采购的具体产品细分类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProductCodeName() {
        return this.ProductCodeName;
    }

    /**
     * Set 子产品名称：用户采购的具体产品细分类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProductCodeName 子产品名称：用户采购的具体产品细分类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProductCodeName(String ProductCodeName) {
        this.ProductCodeName = ProductCodeName;
    }

    /**
     * Get 地域ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegionId 地域ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 地域ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegionId 地域ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 地域名称：资源所属地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegionName 地域名称：资源所属地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set 地域名称：资源所属地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegionName 地域名称：资源所属地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get 可用区ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ZoneId 可用区ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 可用区ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ZoneId 可用区ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 可用区：资源所属可用区
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ZoneName 可用区：资源所属可用区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set 可用区：资源所属可用区
注意：此字段可能返回 null，表示取不到有效值。
     * @param ZoneName 可用区：资源所属可用区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get 实例类型编码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceType 实例类型编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例类型编码
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceType 实例类型编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 实例类型：购买的产品服务对应的实例类型，包括资源包、RI、SP、竞价实例。常规实例默认展示“-”
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceTypeName 实例类型：购买的产品服务对应的实例类型，包括资源包、RI、SP、竞价实例。常规实例默认展示“-”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceTypeName() {
        return this.InstanceTypeName;
    }

    /**
     * Set 实例类型：购买的产品服务对应的实例类型，包括资源包、RI、SP、竞价实例。常规实例默认展示“-”
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceTypeName 实例类型：购买的产品服务对应的实例类型，包括资源包、RI、SP、竞价实例。常规实例默认展示“-”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceTypeName(String InstanceTypeName) {
        this.InstanceTypeName = InstanceTypeName;
    }

    /**
     * Get 资源ID：不同产品因资源形态不同，资源内容不完全相同，如云服务器 CVM 为对应的实例 ID； 若该产品被分拆，则展示产品分拆后的分拆项 ID，如 COS 桶 ID，CDN 域名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceId 资源ID：不同产品因资源形态不同，资源内容不完全相同，如云服务器 CVM 为对应的实例 ID； 若该产品被分拆，则展示产品分拆后的分拆项 ID，如 COS 桶 ID，CDN 域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源ID：不同产品因资源形态不同，资源内容不完全相同，如云服务器 CVM 为对应的实例 ID； 若该产品被分拆，则展示产品分拆后的分拆项 ID，如 COS 桶 ID，CDN 域名
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceId 资源ID：不同产品因资源形态不同，资源内容不完全相同，如云服务器 CVM 为对应的实例 ID； 若该产品被分拆，则展示产品分拆后的分拆项 ID，如 COS 桶 ID，CDN 域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 实例名称：用户在控制台为资源设置的名称，如未设置默认为空；若该产品被分拆，则展示分拆产品分拆后的分拆项资源别名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceName 实例名称：用户在控制台为资源设置的名称，如未设置默认为空；若该产品被分拆，则展示分拆产品分拆后的分拆项资源别名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set 实例名称：用户在控制台为资源设置的名称，如未设置默认为空；若该产品被分拆，则展示分拆产品分拆后的分拆项资源别名
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceName 实例名称：用户在控制台为资源设置的名称，如未设置默认为空；若该产品被分拆，则展示分拆产品分拆后的分拆项资源别名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get 分账标签：资源绑定的标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tag 分账标签：资源绑定的标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BillTag [] getTag() {
        return this.Tag;
    }

    /**
     * Set 分账标签：资源绑定的标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tag 分账标签：资源绑定的标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTag(BillTag [] Tag) {
        this.Tag = Tag;
    }

    /**
     * Get 项目ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId 项目ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId 项目ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 项目名称：资源归属的项目，用户在控制台给资源自主分配项目，未分配则是默认项目
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectName 项目名称：资源归属的项目，用户在控制台给资源自主分配项目，未分配则是默认项目
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set 项目名称：资源归属的项目，用户在控制台给资源自主分配项目，未分配则是默认项目
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectName 项目名称：资源归属的项目，用户在控制台给资源自主分配项目，未分配则是默认项目
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get 费用归集类型：费用来源类型，分摊、归集、未分配
0 - 分摊
1 - 归集
-1 - 未分配
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AllocationType 费用归集类型：费用来源类型，分摊、归集、未分配
0 - 分摊
1 - 归集
-1 - 未分配
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAllocationType() {
        return this.AllocationType;
    }

    /**
     * Set 费用归集类型：费用来源类型，分摊、归集、未分配
0 - 分摊
1 - 归集
-1 - 未分配
注意：此字段可能返回 null，表示取不到有效值。
     * @param AllocationType 费用归集类型：费用来源类型，分摊、归集、未分配
0 - 分摊
1 - 归集
-1 - 未分配
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAllocationType(Long AllocationType) {
        this.AllocationType = AllocationType;
    }

    /**
     * Get 组件原价：原价 = 组件刊例价 * 组件用量 * 使用时长（如客户享受一口价/合同价则默认不展示，退费类场景也默认不展示），指定价模式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalCost 组件原价：原价 = 组件刊例价 * 组件用量 * 使用时长（如客户享受一口价/合同价则默认不展示，退费类场景也默认不展示），指定价模式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTotalCost() {
        return this.TotalCost;
    }

    /**
     * Set 组件原价：原价 = 组件刊例价 * 组件用量 * 使用时长（如客户享受一口价/合同价则默认不展示，退费类场景也默认不展示），指定价模式
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCost 组件原价：原价 = 组件刊例价 * 组件用量 * 使用时长（如客户享受一口价/合同价则默认不展示，退费类场景也默认不展示），指定价模式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalCost(String TotalCost) {
        this.TotalCost = TotalCost;
    }

    /**
     * Get 预留实例抵扣时长：本产品或服务使用预留实例抵扣的使用时长
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiTimeSpan 预留实例抵扣时长：本产品或服务使用预留实例抵扣的使用时长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRiTimeSpan() {
        return this.RiTimeSpan;
    }

    /**
     * Set 预留实例抵扣时长：本产品或服务使用预留实例抵扣的使用时长
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiTimeSpan 预留实例抵扣时长：本产品或服务使用预留实例抵扣的使用时长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiTimeSpan(String RiTimeSpan) {
        this.RiTimeSpan = RiTimeSpan;
    }

    /**
     * Get 预留实例抵扣原价：本产品或服务使用预留实例抵扣的组件原价金额
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiCost 预留实例抵扣原价：本产品或服务使用预留实例抵扣的组件原价金额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRiCost() {
        return this.RiCost;
    }

    /**
     * Set 预留实例抵扣原价：本产品或服务使用预留实例抵扣的组件原价金额
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiCost 预留实例抵扣原价：本产品或服务使用预留实例抵扣的组件原价金额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiCost(String RiCost) {
        this.RiCost = RiCost;
    }

    /**
     * Get 优惠后总价：优惠后总价 =（原价 - 预留实例抵扣原价 - 节省计划抵扣原价）* 折扣率
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RealTotalCost 优惠后总价：优惠后总价 =（原价 - 预留实例抵扣原价 - 节省计划抵扣原价）* 折扣率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRealTotalCost() {
        return this.RealTotalCost;
    }

    /**
     * Set 优惠后总价：优惠后总价 =（原价 - 预留实例抵扣原价 - 节省计划抵扣原价）* 折扣率
注意：此字段可能返回 null，表示取不到有效值。
     * @param RealTotalCost 优惠后总价：优惠后总价 =（原价 - 预留实例抵扣原价 - 节省计划抵扣原价）* 折扣率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRealTotalCost(String RealTotalCost) {
        this.RealTotalCost = RealTotalCost;
    }

    /**
     * Get 现金账户支出(元)：通过现金账户支付的金额
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CashPayAmount 现金账户支出(元)：通过现金账户支付的金额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCashPayAmount() {
        return this.CashPayAmount;
    }

    /**
     * Set 现金账户支出(元)：通过现金账户支付的金额
注意：此字段可能返回 null，表示取不到有效值。
     * @param CashPayAmount 现金账户支出(元)：通过现金账户支付的金额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCashPayAmount(String CashPayAmount) {
        this.CashPayAmount = CashPayAmount;
    }

    /**
     * Get 代金券支出(元)：使用各类优惠券（如代金券、现金券等）支付的金额
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VoucherPayAmount 代金券支出(元)：使用各类优惠券（如代金券、现金券等）支付的金额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVoucherPayAmount() {
        return this.VoucherPayAmount;
    }

    /**
     * Set 代金券支出(元)：使用各类优惠券（如代金券、现金券等）支付的金额
注意：此字段可能返回 null，表示取不到有效值。
     * @param VoucherPayAmount 代金券支出(元)：使用各类优惠券（如代金券、现金券等）支付的金额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVoucherPayAmount(String VoucherPayAmount) {
        this.VoucherPayAmount = VoucherPayAmount;
    }

    /**
     * Get 赠送账户支出(元)：使用赠送金支付的金额
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IncentivePayAmount 赠送账户支出(元)：使用赠送金支付的金额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIncentivePayAmount() {
        return this.IncentivePayAmount;
    }

    /**
     * Set 赠送账户支出(元)：使用赠送金支付的金额
注意：此字段可能返回 null，表示取不到有效值。
     * @param IncentivePayAmount 赠送账户支出(元)：使用赠送金支付的金额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIncentivePayAmount(String IncentivePayAmount) {
        this.IncentivePayAmount = IncentivePayAmount;
    }

    /**
     * Get 分成账户支出(元)：通过分成金账户支付的金额
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TransferPayAmount 分成账户支出(元)：通过分成金账户支付的金额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTransferPayAmount() {
        return this.TransferPayAmount;
    }

    /**
     * Set 分成账户支出(元)：通过分成金账户支付的金额
注意：此字段可能返回 null，表示取不到有效值。
     * @param TransferPayAmount 分成账户支出(元)：通过分成金账户支付的金额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTransferPayAmount(String TransferPayAmount) {
        this.TransferPayAmount = TransferPayAmount;
    }

    /**
     * Get 组件名称编码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ItemCode 组件名称编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getItemCode() {
        return this.ItemCode;
    }

    /**
     * Set 组件名称编码
注意：此字段可能返回 null，表示取不到有效值。
     * @param ItemCode 组件名称编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setItemCode(String ItemCode) {
        this.ItemCode = ItemCode;
    }

    /**
     * Get 组件名称：用户购买的产品或服务，所包含的具体组件
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ItemCodeName 组件名称：用户购买的产品或服务，所包含的具体组件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getItemCodeName() {
        return this.ItemCodeName;
    }

    /**
     * Set 组件名称：用户购买的产品或服务，所包含的具体组件
注意：此字段可能返回 null，表示取不到有效值。
     * @param ItemCodeName 组件名称：用户购买的产品或服务，所包含的具体组件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setItemCodeName(String ItemCodeName) {
        this.ItemCodeName = ItemCodeName;
    }

    /**
     * Get 组件类型编码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ComponentCode 组件类型编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getComponentCode() {
        return this.ComponentCode;
    }

    /**
     * Set 组件类型编码
注意：此字段可能返回 null，表示取不到有效值。
     * @param ComponentCode 组件类型编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComponentCode(String ComponentCode) {
        this.ComponentCode = ComponentCode;
    }

    /**
     * Get 组件类型：用户购买的产品或服务对应的组件大类
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ComponentCodeName 组件类型：用户购买的产品或服务对应的组件大类
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getComponentCodeName() {
        return this.ComponentCodeName;
    }

    /**
     * Set 组件类型：用户购买的产品或服务对应的组件大类
注意：此字段可能返回 null，表示取不到有效值。
     * @param ComponentCodeName 组件类型：用户购买的产品或服务对应的组件大类
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComponentCodeName(String ComponentCodeName) {
        this.ComponentCodeName = ComponentCodeName;
    }

    /**
     * Get 分拆项 ID：涉及分拆产品的分拆后的分拆项 ID，如 COS 桶 ID，CDN 域名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SplitItemId 分拆项 ID：涉及分拆产品的分拆后的分拆项 ID，如 COS 桶 ID，CDN 域名
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public String getSplitItemId() {
        return this.SplitItemId;
    }

    /**
     * Set 分拆项 ID：涉及分拆产品的分拆后的分拆项 ID，如 COS 桶 ID，CDN 域名
注意：此字段可能返回 null，表示取不到有效值。
     * @param SplitItemId 分拆项 ID：涉及分拆产品的分拆后的分拆项 ID，如 COS 桶 ID，CDN 域名
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setSplitItemId(String SplitItemId) {
        this.SplitItemId = SplitItemId;
    }

    /**
     * Get 分拆项名称：涉及分拆产品的分拆后的分拆项
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SplitItemName 分拆项名称：涉及分拆产品的分拆后的分拆项
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public String getSplitItemName() {
        return this.SplitItemName;
    }

    /**
     * Set 分拆项名称：涉及分拆产品的分拆后的分拆项
注意：此字段可能返回 null，表示取不到有效值。
     * @param SplitItemName 分拆项名称：涉及分拆产品的分拆后的分拆项
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setSplitItemName(String SplitItemName) {
        this.SplitItemName = SplitItemName;
    }

    /**
     * Get 开始使用时间：产品服务开始使用时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FeeBeginTime 开始使用时间：产品服务开始使用时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFeeBeginTime() {
        return this.FeeBeginTime;
    }

    /**
     * Set 开始使用时间：产品服务开始使用时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param FeeBeginTime 开始使用时间：产品服务开始使用时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFeeBeginTime(String FeeBeginTime) {
        this.FeeBeginTime = FeeBeginTime;
    }

    /**
     * Get 结束使用时间：产品服务结束使用时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FeeEndTime 结束使用时间：产品服务结束使用时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFeeEndTime() {
        return this.FeeEndTime;
    }

    /**
     * Set 结束使用时间：产品服务结束使用时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param FeeEndTime 结束使用时间：产品服务结束使用时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFeeEndTime(String FeeEndTime) {
        this.FeeEndTime = FeeEndTime;
    }

    /**
     * Get 节省计划抵扣原价：节省计划抵扣原价 = 节省计划包抵扣面值 / 节省计划抵扣率
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SPCost 节省计划抵扣原价：节省计划抵扣原价 = 节省计划包抵扣面值 / 节省计划抵扣率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSPCost() {
        return this.SPCost;
    }

    /**
     * Set 节省计划抵扣原价：节省计划抵扣原价 = 节省计划包抵扣面值 / 节省计划抵扣率
注意：此字段可能返回 null，表示取不到有效值。
     * @param SPCost 节省计划抵扣原价：节省计划抵扣原价 = 节省计划包抵扣面值 / 节省计划抵扣率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSPCost(String SPCost) {
        this.SPCost = SPCost;
    }

    /**
     * Get 国内国际编码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegionType 国内国际编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegionType() {
        return this.RegionType;
    }

    /**
     * Set 国内国际编码
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegionType 国内国际编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegionType(String RegionType) {
        this.RegionType = RegionType;
    }

    /**
     * Get 国内国际：资源所属区域类型（国内、国际）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegionTypeName 国内国际：资源所属区域类型（国内、国际）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegionTypeName() {
        return this.RegionTypeName;
    }

    /**
     * Set 国内国际：资源所属区域类型（国内、国际）
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegionTypeName 国内国际：资源所属区域类型（国内、国际）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegionTypeName(String RegionTypeName) {
        this.RegionTypeName = RegionTypeName;
    }

    /**
     * Get 组件刊例价：组件的官网原始单价（如客户享受一口价/合同价则默认不展示）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SinglePrice 组件刊例价：组件的官网原始单价（如客户享受一口价/合同价则默认不展示）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSinglePrice() {
        return this.SinglePrice;
    }

    /**
     * Set 组件刊例价：组件的官网原始单价（如客户享受一口价/合同价则默认不展示）
注意：此字段可能返回 null，表示取不到有效值。
     * @param SinglePrice 组件刊例价：组件的官网原始单价（如客户享受一口价/合同价则默认不展示）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSinglePrice(String SinglePrice) {
        this.SinglePrice = SinglePrice;
    }

    /**
     * Get 组件单价：组件的折后单价，组件单价 = 刊例价 * 折扣
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContractPrice 组件单价：组件的折后单价，组件单价 = 刊例价 * 折扣
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContractPrice() {
        return this.ContractPrice;
    }

    /**
     * Set 组件单价：组件的折后单价，组件单价 = 刊例价 * 折扣
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContractPrice 组件单价：组件的折后单价，组件单价 = 刊例价 * 折扣
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContractPrice(String ContractPrice) {
        this.ContractPrice = ContractPrice;
    }

    /**
     * Get 组件价格单位：组件价格的单位，单位构成：元/用量单位/时长单位
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SinglePriceUnit 组件价格单位：组件价格的单位，单位构成：元/用量单位/时长单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSinglePriceUnit() {
        return this.SinglePriceUnit;
    }

    /**
     * Set 组件价格单位：组件价格的单位，单位构成：元/用量单位/时长单位
注意：此字段可能返回 null，表示取不到有效值。
     * @param SinglePriceUnit 组件价格单位：组件价格的单位，单位构成：元/用量单位/时长单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSinglePriceUnit(String SinglePriceUnit) {
        this.SinglePriceUnit = SinglePriceUnit;
    }

    /**
     * Get 组件用量：该组件实际结算用量，组件用量=组件原始用量-抵扣用量（含资源包）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UsedAmount 组件用量：该组件实际结算用量，组件用量=组件原始用量-抵扣用量（含资源包）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUsedAmount() {
        return this.UsedAmount;
    }

    /**
     * Set 组件用量：该组件实际结算用量，组件用量=组件原始用量-抵扣用量（含资源包）
注意：此字段可能返回 null，表示取不到有效值。
     * @param UsedAmount 组件用量：该组件实际结算用量，组件用量=组件原始用量-抵扣用量（含资源包）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUsedAmount(String UsedAmount) {
        this.UsedAmount = UsedAmount;
    }

    /**
     * Get 组件用量单位：组件用量对应的单位
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UsedAmountUnit 组件用量单位：组件用量对应的单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUsedAmountUnit() {
        return this.UsedAmountUnit;
    }

    /**
     * Set 组件用量单位：组件用量对应的单位
注意：此字段可能返回 null，表示取不到有效值。
     * @param UsedAmountUnit 组件用量单位：组件用量对应的单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUsedAmountUnit(String UsedAmountUnit) {
        this.UsedAmountUnit = UsedAmountUnit;
    }

    /**
     * Get 使用时长：资源使用的时长，组件用量=组件原始使用时长-抵扣时长（含资源包）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeSpan 使用时长：资源使用的时长，组件用量=组件原始使用时长-抵扣时长（含资源包）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set 使用时长：资源使用的时长，组件用量=组件原始使用时长-抵扣时长（含资源包）
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeSpan 使用时长：资源使用的时长，组件用量=组件原始使用时长-抵扣时长（含资源包）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeSpan(String TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get 时长单位：资源使用时长的单位
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeUnit 时长单位：资源使用时长的单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set 时长单位：资源使用时长的单位
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeUnit 时长单位：资源使用时长的单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get 备注属性（实例配置）：其他备注信息，如预留实例的预留实例类型和交易类型、CCN 产品的两端地域信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReserveDetail 备注属性（实例配置）：其他备注信息，如预留实例的预留实例类型和交易类型、CCN 产品的两端地域信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReserveDetail() {
        return this.ReserveDetail;
    }

    /**
     * Set 备注属性（实例配置）：其他备注信息，如预留实例的预留实例类型和交易类型、CCN 产品的两端地域信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReserveDetail 备注属性（实例配置）：其他备注信息，如预留实例的预留实例类型和交易类型、CCN 产品的两端地域信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReserveDetail(String ReserveDetail) {
        this.ReserveDetail = ReserveDetail;
    }

    /**
     * Get 原始用量/时长：组件被资源包抵扣前的原始用量
（目前仅实时音视频、弹性微服务、云呼叫中心及专属可用区产品支持该信息外显，其他产品尚在接入中）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RealTotalMeasure 原始用量/时长：组件被资源包抵扣前的原始用量
（目前仅实时音视频、弹性微服务、云呼叫中心及专属可用区产品支持该信息外显，其他产品尚在接入中）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRealTotalMeasure() {
        return this.RealTotalMeasure;
    }

    /**
     * Set 原始用量/时长：组件被资源包抵扣前的原始用量
（目前仅实时音视频、弹性微服务、云呼叫中心及专属可用区产品支持该信息外显，其他产品尚在接入中）
注意：此字段可能返回 null，表示取不到有效值。
     * @param RealTotalMeasure 原始用量/时长：组件被资源包抵扣前的原始用量
（目前仅实时音视频、弹性微服务、云呼叫中心及专属可用区产品支持该信息外显，其他产品尚在接入中）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRealTotalMeasure(String RealTotalMeasure) {
        this.RealTotalMeasure = RealTotalMeasure;
    }

    /**
     * Get 抵扣用量/时长（含资源包）：组件被资源包抵扣的用量
（目前仅实时音视频、弹性微服务、云呼叫中心及专属可用区产品支持该信息外显，其他产品尚在接入中）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeductedMeasure 抵扣用量/时长（含资源包）：组件被资源包抵扣的用量
（目前仅实时音视频、弹性微服务、云呼叫中心及专属可用区产品支持该信息外显，其他产品尚在接入中）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeductedMeasure() {
        return this.DeductedMeasure;
    }

    /**
     * Set 抵扣用量/时长（含资源包）：组件被资源包抵扣的用量
（目前仅实时音视频、弹性微服务、云呼叫中心及专属可用区产品支持该信息外显，其他产品尚在接入中）
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeductedMeasure 抵扣用量/时长（含资源包）：组件被资源包抵扣的用量
（目前仅实时音视频、弹性微服务、云呼叫中心及专属可用区产品支持该信息外显，其他产品尚在接入中）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeductedMeasure(String DeductedMeasure) {
        this.DeductedMeasure = DeductedMeasure;
    }

    /**
     * Get 折扣率：本资源享受的折扣率（如客户享受一口价/合同价则默认不展示，退费场景也默认不展示）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Discount 折扣率：本资源享受的折扣率（如客户享受一口价/合同价则默认不展示，退费场景也默认不展示）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDiscount() {
        return this.Discount;
    }

    /**
     * Set 折扣率：本资源享受的折扣率（如客户享受一口价/合同价则默认不展示，退费场景也默认不展示）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Discount 折扣率：本资源享受的折扣率（如客户享受一口价/合同价则默认不展示，退费场景也默认不展示）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiscount(String Discount) {
        this.Discount = Discount;
    }

    /**
     * Get 混合折扣率：综合各类折扣抵扣信息后的最终折扣率，混合折扣率=优惠后总价/原价
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BlendedDiscount 混合折扣率：综合各类折扣抵扣信息后的最终折扣率，混合折扣率=优惠后总价/原价
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBlendedDiscount() {
        return this.BlendedDiscount;
    }

    /**
     * Set 混合折扣率：综合各类折扣抵扣信息后的最终折扣率，混合折扣率=优惠后总价/原价
注意：此字段可能返回 null，表示取不到有效值。
     * @param BlendedDiscount 混合折扣率：综合各类折扣抵扣信息后的最终折扣率，混合折扣率=优惠后总价/原价
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBlendedDiscount(String BlendedDiscount) {
        this.BlendedDiscount = BlendedDiscount;
    }

    /**
     * Get 价格属性：该组件除单价、时长外的其他影响折扣定价的属性信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PriceInfo 价格属性：该组件除单价、时长外的其他影响折扣定价的属性信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getPriceInfo() {
        return this.PriceInfo;
    }

    /**
     * Set 价格属性：该组件除单价、时长外的其他影响折扣定价的属性信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param PriceInfo 价格属性：该组件除单价、时长外的其他影响折扣定价的属性信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPriceInfo(String [] PriceInfo) {
        this.PriceInfo = PriceInfo;
    }

    /**
     * Get 计算规则说明：特殊交易类型计费结算的详细计算说明，如退费及变配
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Formula 计算规则说明：特殊交易类型计费结算的详细计算说明，如退费及变配
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFormula() {
        return this.Formula;
    }

    /**
     * Set 计算规则说明：特殊交易类型计费结算的详细计算说明，如退费及变配
注意：此字段可能返回 null，表示取不到有效值。
     * @param Formula 计算规则说明：特殊交易类型计费结算的详细计算说明，如退费及变配
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFormula(String Formula) {
        this.Formula = Formula;
    }

    /**
     * Get 计费规则：各产品详细的计费规则官网说明链接
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FormulaUrl 计费规则：各产品详细的计费规则官网说明链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFormulaUrl() {
        return this.FormulaUrl;
    }

    /**
     * Set 计费规则：各产品详细的计费规则官网说明链接
注意：此字段可能返回 null，表示取不到有效值。
     * @param FormulaUrl 计费规则：各产品详细的计费规则官网说明链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFormulaUrl(String FormulaUrl) {
        this.FormulaUrl = FormulaUrl;
    }

    /**
     * Get 配置描述：资源配置规格信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ComponentConfig 配置描述：资源配置规格信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getComponentConfig() {
        return this.ComponentConfig;
    }

    /**
     * Set 配置描述：资源配置规格信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ComponentConfig 配置描述：资源配置规格信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComponentConfig(String ComponentConfig) {
        this.ComponentConfig = ComponentConfig;
    }

    /**
     * Get SPDeduction
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SPDeduction SPDeduction
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSPDeduction() {
        return this.SPDeduction;
    }

    /**
     * Set SPDeduction
注意：此字段可能返回 null，表示取不到有效值。
     * @param SPDeduction SPDeduction
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSPDeduction(String SPDeduction) {
        this.SPDeduction = SPDeduction;
    }

    /**
     * Get 节省计划抵扣率：节省计划可用余额额度范围内，节省计划对于此组件打的折扣率
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SPDeductionRate 节省计划抵扣率：节省计划可用余额额度范围内，节省计划对于此组件打的折扣率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSPDeductionRate() {
        return this.SPDeductionRate;
    }

    /**
     * Set 节省计划抵扣率：节省计划可用余额额度范围内，节省计划对于此组件打的折扣率
注意：此字段可能返回 null，表示取不到有效值。
     * @param SPDeductionRate 节省计划抵扣率：节省计划可用余额额度范围内，节省计划对于此组件打的折扣率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSPDeductionRate(String SPDeductionRate) {
        this.SPDeductionRate = SPDeductionRate;
    }

    /**
     * Get AssociatedOrder
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssociatedOrder AssociatedOrder
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAssociatedOrder() {
        return this.AssociatedOrder;
    }

    /**
     * Set AssociatedOrder
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssociatedOrder AssociatedOrder
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssociatedOrder(String AssociatedOrder) {
        this.AssociatedOrder = AssociatedOrder;
    }

    /**
     * Get 当前消费项的优惠对象，例如：官网折扣、用户折扣、活动折扣。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiscountObject 当前消费项的优惠对象，例如：官网折扣、用户折扣、活动折扣。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDiscountObject() {
        return this.DiscountObject;
    }

    /**
     * Set 当前消费项的优惠对象，例如：官网折扣、用户折扣、活动折扣。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiscountObject 当前消费项的优惠对象，例如：官网折扣、用户折扣、活动折扣。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiscountObject(String DiscountObject) {
        this.DiscountObject = DiscountObject;
    }

    /**
     * Get 当前消费项的优惠类型，例如：折扣、合同价。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiscountType 当前消费项的优惠类型，例如：折扣、合同价。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDiscountType() {
        return this.DiscountType;
    }

    /**
     * Set 当前消费项的优惠类型，例如：折扣、合同价。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiscountType 当前消费项的优惠类型，例如：折扣、合同价。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiscountType(String DiscountType) {
        this.DiscountType = DiscountType;
    }

    /**
     * Get 对优惠类型的补充描述，例如：商务折扣8折，则优惠类型为“折扣”，优惠内容为“0.8”。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiscountContent 对优惠类型的补充描述，例如：商务折扣8折，则优惠类型为“折扣”，优惠内容为“0.8”。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDiscountContent() {
        return this.DiscountContent;
    }

    /**
     * Set 对优惠类型的补充描述，例如：商务折扣8折，则优惠类型为“折扣”，优惠内容为“0.8”。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiscountContent 对优惠类型的补充描述，例如：商务折扣8折，则优惠类型为“折扣”，优惠内容为“0.8”。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiscountContent(String DiscountContent) {
        this.DiscountContent = DiscountContent;
    }

    /**
     * Get 账单月
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BillMonth 账单月
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBillMonth() {
        return this.BillMonth;
    }

    /**
     * Set 账单月
注意：此字段可能返回 null，表示取不到有效值。
     * @param BillMonth 账单月
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBillMonth(String BillMonth) {
        this.BillMonth = BillMonth;
    }

    public AllocationSummaryByItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AllocationSummaryByItem(AllocationSummaryByItem source) {
        if (source.TreeNodeUniqKey != null) {
            this.TreeNodeUniqKey = new String(source.TreeNodeUniqKey);
        }
        if (source.TreeNodeUniqKeyName != null) {
            this.TreeNodeUniqKeyName = new String(source.TreeNodeUniqKeyName);
        }
        if (source.BillDate != null) {
            this.BillDate = new String(source.BillDate);
        }
        if (source.PayerUin != null) {
            this.PayerUin = new String(source.PayerUin);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.OperateUin != null) {
            this.OperateUin = new String(source.OperateUin);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.PayModeName != null) {
            this.PayModeName = new String(source.PayModeName);
        }
        if (source.ActionType != null) {
            this.ActionType = new String(source.ActionType);
        }
        if (source.ActionTypeName != null) {
            this.ActionTypeName = new String(source.ActionTypeName);
        }
        if (source.BusinessCode != null) {
            this.BusinessCode = new String(source.BusinessCode);
        }
        if (source.BusinessCodeName != null) {
            this.BusinessCodeName = new String(source.BusinessCodeName);
        }
        if (source.ProductCode != null) {
            this.ProductCode = new String(source.ProductCode);
        }
        if (source.ProductCodeName != null) {
            this.ProductCodeName = new String(source.ProductCodeName);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.InstanceTypeName != null) {
            this.InstanceTypeName = new String(source.InstanceTypeName);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.ResourceName != null) {
            this.ResourceName = new String(source.ResourceName);
        }
        if (source.Tag != null) {
            this.Tag = new BillTag[source.Tag.length];
            for (int i = 0; i < source.Tag.length; i++) {
                this.Tag[i] = new BillTag(source.Tag[i]);
            }
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.AllocationType != null) {
            this.AllocationType = new Long(source.AllocationType);
        }
        if (source.TotalCost != null) {
            this.TotalCost = new String(source.TotalCost);
        }
        if (source.RiTimeSpan != null) {
            this.RiTimeSpan = new String(source.RiTimeSpan);
        }
        if (source.RiCost != null) {
            this.RiCost = new String(source.RiCost);
        }
        if (source.RealTotalCost != null) {
            this.RealTotalCost = new String(source.RealTotalCost);
        }
        if (source.CashPayAmount != null) {
            this.CashPayAmount = new String(source.CashPayAmount);
        }
        if (source.VoucherPayAmount != null) {
            this.VoucherPayAmount = new String(source.VoucherPayAmount);
        }
        if (source.IncentivePayAmount != null) {
            this.IncentivePayAmount = new String(source.IncentivePayAmount);
        }
        if (source.TransferPayAmount != null) {
            this.TransferPayAmount = new String(source.TransferPayAmount);
        }
        if (source.ItemCode != null) {
            this.ItemCode = new String(source.ItemCode);
        }
        if (source.ItemCodeName != null) {
            this.ItemCodeName = new String(source.ItemCodeName);
        }
        if (source.ComponentCode != null) {
            this.ComponentCode = new String(source.ComponentCode);
        }
        if (source.ComponentCodeName != null) {
            this.ComponentCodeName = new String(source.ComponentCodeName);
        }
        if (source.SplitItemId != null) {
            this.SplitItemId = new String(source.SplitItemId);
        }
        if (source.SplitItemName != null) {
            this.SplitItemName = new String(source.SplitItemName);
        }
        if (source.FeeBeginTime != null) {
            this.FeeBeginTime = new String(source.FeeBeginTime);
        }
        if (source.FeeEndTime != null) {
            this.FeeEndTime = new String(source.FeeEndTime);
        }
        if (source.SPCost != null) {
            this.SPCost = new String(source.SPCost);
        }
        if (source.RegionType != null) {
            this.RegionType = new String(source.RegionType);
        }
        if (source.RegionTypeName != null) {
            this.RegionTypeName = new String(source.RegionTypeName);
        }
        if (source.SinglePrice != null) {
            this.SinglePrice = new String(source.SinglePrice);
        }
        if (source.ContractPrice != null) {
            this.ContractPrice = new String(source.ContractPrice);
        }
        if (source.SinglePriceUnit != null) {
            this.SinglePriceUnit = new String(source.SinglePriceUnit);
        }
        if (source.UsedAmount != null) {
            this.UsedAmount = new String(source.UsedAmount);
        }
        if (source.UsedAmountUnit != null) {
            this.UsedAmountUnit = new String(source.UsedAmountUnit);
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new String(source.TimeSpan);
        }
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
        }
        if (source.ReserveDetail != null) {
            this.ReserveDetail = new String(source.ReserveDetail);
        }
        if (source.RealTotalMeasure != null) {
            this.RealTotalMeasure = new String(source.RealTotalMeasure);
        }
        if (source.DeductedMeasure != null) {
            this.DeductedMeasure = new String(source.DeductedMeasure);
        }
        if (source.Discount != null) {
            this.Discount = new String(source.Discount);
        }
        if (source.BlendedDiscount != null) {
            this.BlendedDiscount = new String(source.BlendedDiscount);
        }
        if (source.PriceInfo != null) {
            this.PriceInfo = new String[source.PriceInfo.length];
            for (int i = 0; i < source.PriceInfo.length; i++) {
                this.PriceInfo[i] = new String(source.PriceInfo[i]);
            }
        }
        if (source.Formula != null) {
            this.Formula = new String(source.Formula);
        }
        if (source.FormulaUrl != null) {
            this.FormulaUrl = new String(source.FormulaUrl);
        }
        if (source.ComponentConfig != null) {
            this.ComponentConfig = new String(source.ComponentConfig);
        }
        if (source.SPDeduction != null) {
            this.SPDeduction = new String(source.SPDeduction);
        }
        if (source.SPDeductionRate != null) {
            this.SPDeductionRate = new String(source.SPDeductionRate);
        }
        if (source.AssociatedOrder != null) {
            this.AssociatedOrder = new String(source.AssociatedOrder);
        }
        if (source.DiscountObject != null) {
            this.DiscountObject = new String(source.DiscountObject);
        }
        if (source.DiscountType != null) {
            this.DiscountType = new String(source.DiscountType);
        }
        if (source.DiscountContent != null) {
            this.DiscountContent = new String(source.DiscountContent);
        }
        if (source.BillMonth != null) {
            this.BillMonth = new String(source.BillMonth);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TreeNodeUniqKey", this.TreeNodeUniqKey);
        this.setParamSimple(map, prefix + "TreeNodeUniqKeyName", this.TreeNodeUniqKeyName);
        this.setParamSimple(map, prefix + "BillDate", this.BillDate);
        this.setParamSimple(map, prefix + "PayerUin", this.PayerUin);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "OperateUin", this.OperateUin);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "PayModeName", this.PayModeName);
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);
        this.setParamSimple(map, prefix + "ActionTypeName", this.ActionTypeName);
        this.setParamSimple(map, prefix + "BusinessCode", this.BusinessCode);
        this.setParamSimple(map, prefix + "BusinessCodeName", this.BusinessCodeName);
        this.setParamSimple(map, prefix + "ProductCode", this.ProductCode);
        this.setParamSimple(map, prefix + "ProductCodeName", this.ProductCodeName);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceTypeName", this.InstanceTypeName);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);
        this.setParamArrayObj(map, prefix + "Tag.", this.Tag);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "AllocationType", this.AllocationType);
        this.setParamSimple(map, prefix + "TotalCost", this.TotalCost);
        this.setParamSimple(map, prefix + "RiTimeSpan", this.RiTimeSpan);
        this.setParamSimple(map, prefix + "RiCost", this.RiCost);
        this.setParamSimple(map, prefix + "RealTotalCost", this.RealTotalCost);
        this.setParamSimple(map, prefix + "CashPayAmount", this.CashPayAmount);
        this.setParamSimple(map, prefix + "VoucherPayAmount", this.VoucherPayAmount);
        this.setParamSimple(map, prefix + "IncentivePayAmount", this.IncentivePayAmount);
        this.setParamSimple(map, prefix + "TransferPayAmount", this.TransferPayAmount);
        this.setParamSimple(map, prefix + "ItemCode", this.ItemCode);
        this.setParamSimple(map, prefix + "ItemCodeName", this.ItemCodeName);
        this.setParamSimple(map, prefix + "ComponentCode", this.ComponentCode);
        this.setParamSimple(map, prefix + "ComponentCodeName", this.ComponentCodeName);
        this.setParamSimple(map, prefix + "SplitItemId", this.SplitItemId);
        this.setParamSimple(map, prefix + "SplitItemName", this.SplitItemName);
        this.setParamSimple(map, prefix + "FeeBeginTime", this.FeeBeginTime);
        this.setParamSimple(map, prefix + "FeeEndTime", this.FeeEndTime);
        this.setParamSimple(map, prefix + "SPCost", this.SPCost);
        this.setParamSimple(map, prefix + "RegionType", this.RegionType);
        this.setParamSimple(map, prefix + "RegionTypeName", this.RegionTypeName);
        this.setParamSimple(map, prefix + "SinglePrice", this.SinglePrice);
        this.setParamSimple(map, prefix + "ContractPrice", this.ContractPrice);
        this.setParamSimple(map, prefix + "SinglePriceUnit", this.SinglePriceUnit);
        this.setParamSimple(map, prefix + "UsedAmount", this.UsedAmount);
        this.setParamSimple(map, prefix + "UsedAmountUnit", this.UsedAmountUnit);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "ReserveDetail", this.ReserveDetail);
        this.setParamSimple(map, prefix + "RealTotalMeasure", this.RealTotalMeasure);
        this.setParamSimple(map, prefix + "DeductedMeasure", this.DeductedMeasure);
        this.setParamSimple(map, prefix + "Discount", this.Discount);
        this.setParamSimple(map, prefix + "BlendedDiscount", this.BlendedDiscount);
        this.setParamArraySimple(map, prefix + "PriceInfo.", this.PriceInfo);
        this.setParamSimple(map, prefix + "Formula", this.Formula);
        this.setParamSimple(map, prefix + "FormulaUrl", this.FormulaUrl);
        this.setParamSimple(map, prefix + "ComponentConfig", this.ComponentConfig);
        this.setParamSimple(map, prefix + "SPDeduction", this.SPDeduction);
        this.setParamSimple(map, prefix + "SPDeductionRate", this.SPDeductionRate);
        this.setParamSimple(map, prefix + "AssociatedOrder", this.AssociatedOrder);
        this.setParamSimple(map, prefix + "DiscountObject", this.DiscountObject);
        this.setParamSimple(map, prefix + "DiscountType", this.DiscountType);
        this.setParamSimple(map, prefix + "DiscountContent", this.DiscountContent);
        this.setParamSimple(map, prefix + "BillMonth", this.BillMonth);

    }
}

