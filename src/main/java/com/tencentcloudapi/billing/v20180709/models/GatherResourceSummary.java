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

public class GatherResourceSummary extends AbstractModel {

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
    * 资源命中公摊规则ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * 资源命中公摊规则名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

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
    * 分账标签：资源绑定的标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tag")
    @Expose
    private BillTag [] Tag;

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
    * 当前归属单元信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BelongTreeNodeUniqKey")
    @Expose
    private AllocationTreeNode BelongTreeNodeUniqKey;

    /**
    * 当前资源命中公摊规则信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BelongRule")
    @Expose
    private AllocationRule BelongRule;

    /**
    * 其它归属单元信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OtherTreeNodeUniqKeys")
    @Expose
    private AllocationTreeNode [] OtherTreeNodeUniqKeys;

    /**
    * 其他命中规则信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OtherRules")
    @Expose
    private AllocationRule [] OtherRules;

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
     * Get 资源命中公摊规则ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleId 资源命中公摊规则ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 资源命中公摊规则ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleId 资源命中公摊规则ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 资源命中公摊规则名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleName 资源命中公摊规则名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 资源命中公摊规则名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleName 资源命中公摊规则名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
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
     * Get 当前归属单元信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BelongTreeNodeUniqKey 当前归属单元信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AllocationTreeNode getBelongTreeNodeUniqKey() {
        return this.BelongTreeNodeUniqKey;
    }

    /**
     * Set 当前归属单元信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param BelongTreeNodeUniqKey 当前归属单元信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBelongTreeNodeUniqKey(AllocationTreeNode BelongTreeNodeUniqKey) {
        this.BelongTreeNodeUniqKey = BelongTreeNodeUniqKey;
    }

    /**
     * Get 当前资源命中公摊规则信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BelongRule 当前资源命中公摊规则信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AllocationRule getBelongRule() {
        return this.BelongRule;
    }

    /**
     * Set 当前资源命中公摊规则信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param BelongRule 当前资源命中公摊规则信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBelongRule(AllocationRule BelongRule) {
        this.BelongRule = BelongRule;
    }

    /**
     * Get 其它归属单元信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OtherTreeNodeUniqKeys 其它归属单元信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AllocationTreeNode [] getOtherTreeNodeUniqKeys() {
        return this.OtherTreeNodeUniqKeys;
    }

    /**
     * Set 其它归属单元信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param OtherTreeNodeUniqKeys 其它归属单元信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOtherTreeNodeUniqKeys(AllocationTreeNode [] OtherTreeNodeUniqKeys) {
        this.OtherTreeNodeUniqKeys = OtherTreeNodeUniqKeys;
    }

    /**
     * Get 其他命中规则信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OtherRules 其他命中规则信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AllocationRule [] getOtherRules() {
        return this.OtherRules;
    }

    /**
     * Set 其他命中规则信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param OtherRules 其他命中规则信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOtherRules(AllocationRule [] OtherRules) {
        this.OtherRules = OtherRules;
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

    public GatherResourceSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GatherResourceSummary(GatherResourceSummary source) {
        if (source.PayerUin != null) {
            this.PayerUin = new String(source.PayerUin);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new String(source.OwnerUin);
        }
        if (source.OperateUin != null) {
            this.OperateUin = new String(source.OperateUin);
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
        if (source.TreeNodeUniqKey != null) {
            this.TreeNodeUniqKey = new String(source.TreeNodeUniqKey);
        }
        if (source.TreeNodeUniqKeyName != null) {
            this.TreeNodeUniqKeyName = new String(source.TreeNodeUniqKeyName);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.BusinessCode != null) {
            this.BusinessCode = new String(source.BusinessCode);
        }
        if (source.BusinessCodeName != null) {
            this.BusinessCodeName = new String(source.BusinessCodeName);
        }
        if (source.ItemCode != null) {
            this.ItemCode = new String(source.ItemCode);
        }
        if (source.ItemCodeName != null) {
            this.ItemCodeName = new String(source.ItemCodeName);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
        if (source.Tag != null) {
            this.Tag = new BillTag[source.Tag.length];
            for (int i = 0; i < source.Tag.length; i++) {
                this.Tag[i] = new BillTag(source.Tag[i]);
            }
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
        if (source.AllocationType != null) {
            this.AllocationType = new Long(source.AllocationType);
        }
        if (source.BelongTreeNodeUniqKey != null) {
            this.BelongTreeNodeUniqKey = new AllocationTreeNode(source.BelongTreeNodeUniqKey);
        }
        if (source.BelongRule != null) {
            this.BelongRule = new AllocationRule(source.BelongRule);
        }
        if (source.OtherTreeNodeUniqKeys != null) {
            this.OtherTreeNodeUniqKeys = new AllocationTreeNode[source.OtherTreeNodeUniqKeys.length];
            for (int i = 0; i < source.OtherTreeNodeUniqKeys.length; i++) {
                this.OtherTreeNodeUniqKeys[i] = new AllocationTreeNode(source.OtherTreeNodeUniqKeys[i]);
            }
        }
        if (source.OtherRules != null) {
            this.OtherRules = new AllocationRule[source.OtherRules.length];
            for (int i = 0; i < source.OtherRules.length; i++) {
                this.OtherRules[i] = new AllocationRule(source.OtherRules[i]);
            }
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.ProductCode != null) {
            this.ProductCode = new String(source.ProductCode);
        }
        if (source.ProductCodeName != null) {
            this.ProductCodeName = new String(source.ProductCodeName);
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
        if (source.SplitItemId != null) {
            this.SplitItemId = new String(source.SplitItemId);
        }
        if (source.SplitItemName != null) {
            this.SplitItemName = new String(source.SplitItemName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PayerUin", this.PayerUin);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "OperateUin", this.OperateUin);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceTypeName", this.InstanceTypeName);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);
        this.setParamSimple(map, prefix + "TreeNodeUniqKey", this.TreeNodeUniqKey);
        this.setParamSimple(map, prefix + "TreeNodeUniqKeyName", this.TreeNodeUniqKeyName);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "BusinessCode", this.BusinessCode);
        this.setParamSimple(map, prefix + "BusinessCodeName", this.BusinessCodeName);
        this.setParamSimple(map, prefix + "ItemCode", this.ItemCode);
        this.setParamSimple(map, prefix + "ItemCodeName", this.ItemCodeName);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamArrayObj(map, prefix + "Tag.", this.Tag);
        this.setParamSimple(map, prefix + "RealTotalCost", this.RealTotalCost);
        this.setParamSimple(map, prefix + "CashPayAmount", this.CashPayAmount);
        this.setParamSimple(map, prefix + "VoucherPayAmount", this.VoucherPayAmount);
        this.setParamSimple(map, prefix + "IncentivePayAmount", this.IncentivePayAmount);
        this.setParamSimple(map, prefix + "TransferPayAmount", this.TransferPayAmount);
        this.setParamSimple(map, prefix + "AllocationType", this.AllocationType);
        this.setParamObj(map, prefix + "BelongTreeNodeUniqKey.", this.BelongTreeNodeUniqKey);
        this.setParamObj(map, prefix + "BelongRule.", this.BelongRule);
        this.setParamArrayObj(map, prefix + "OtherTreeNodeUniqKeys.", this.OtherTreeNodeUniqKeys);
        this.setParamArrayObj(map, prefix + "OtherRules.", this.OtherRules);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "ProductCode", this.ProductCode);
        this.setParamSimple(map, prefix + "ProductCodeName", this.ProductCodeName);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "PayModeName", this.PayModeName);
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);
        this.setParamSimple(map, prefix + "ActionTypeName", this.ActionTypeName);
        this.setParamSimple(map, prefix + "SplitItemId", this.SplitItemId);
        this.setParamSimple(map, prefix + "SplitItemName", this.SplitItemName);

    }
}

