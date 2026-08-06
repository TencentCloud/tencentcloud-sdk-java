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

public class GatherResourceSummary extends AbstractModel {

    /**
    * <p>支付者 UIN：支付者的账号 ID，账号 ID 是用户在腾讯云的唯一账号标识</p>
    */
    @SerializedName("PayerUin")
    @Expose
    private String PayerUin;

    /**
    * <p>使用者 UIN：实际使用资源的账号 ID</p>
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * <p>操作者 UIN：操作者账号 ID（预付费资源下单或后付费操作开通资源账号的ID或者角色 ID）</p>
    */
    @SerializedName("OperateUin")
    @Expose
    private String OperateUin;

    /**
    * <p>实例类型编码</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * <p>实例类型：购买的产品服务对应的实例类型，包括资源包、RI、SP、竞价实例。常规实例默认展示“-”</p>
    */
    @SerializedName("InstanceTypeName")
    @Expose
    private String InstanceTypeName;

    /**
    * <p>资源ID：不同产品因资源形态不同，资源内容不完全相同，如云服务器 CVM 为对应的实例 ID； 若该产品被分拆，则展示产品分拆后的分拆项 ID，如 COS 桶 ID，CDN 域名</p>
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * <p>实例名称：用户在控制台为资源设置的名称，如未设置默认为空；若该产品被分拆，则展示分拆产品分拆后的分拆项资源别名</p>
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * <p>分账单元唯一标识</p>
    */
    @SerializedName("TreeNodeUniqKey")
    @Expose
    private String TreeNodeUniqKey;

    /**
    * <p>分账单元名称</p>
    */
    @SerializedName("TreeNodeUniqKeyName")
    @Expose
    private String TreeNodeUniqKeyName;

    /**
    * <p>资源命中公摊规则ID</p>
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * <p>资源命中公摊规则名称</p>
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * <p>产品编码</p>
    */
    @SerializedName("BusinessCode")
    @Expose
    private String BusinessCode;

    /**
    * <p>产品名称：用户所采购的各类云产品</p>
    */
    @SerializedName("BusinessCodeName")
    @Expose
    private String BusinessCodeName;

    /**
    * <p>组件名称编码</p>
    */
    @SerializedName("ItemCode")
    @Expose
    private String ItemCode;

    /**
    * <p>组件名称：用户购买的产品或服务，所包含的具体组件</p>
    */
    @SerializedName("ItemCodeName")
    @Expose
    private String ItemCodeName;

    /**
    * <p>地域ID</p>
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * <p>地域名称：资源所属地域</p>
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * <p>分账标签：资源绑定的标签</p>
    */
    @SerializedName("Tag")
    @Expose
    private BillTag [] Tag;

    /**
    * <p>优惠后总价：优惠后总价 =（原价 - 预留实例抵扣原价 - 节省计划抵扣原价）* 折扣率</p>
    */
    @SerializedName("RealTotalCost")
    @Expose
    private String RealTotalCost;

    /**
    * <p>现金账户支出(元)：通过现金账户支付的金额</p>
    */
    @SerializedName("CashPayAmount")
    @Expose
    private String CashPayAmount;

    /**
    * <p>代金券支出(元)：使用各类优惠券（如代金券、现金券等）支付的金额</p>
    */
    @SerializedName("VoucherPayAmount")
    @Expose
    private String VoucherPayAmount;

    /**
    * <p>赠送账户支出(元)：使用赠送金支付的金额</p>
    */
    @SerializedName("IncentivePayAmount")
    @Expose
    private String IncentivePayAmount;

    /**
    * <p>分成账户支出(元)：通过分成金账户支付的金额</p>
    */
    @SerializedName("TransferPayAmount")
    @Expose
    private String TransferPayAmount;

    /**
    * <p>费用归集类型：费用来源类型，分摊、归集、未分配<br>0 - 分摊<br>1 - 归集<br>-1 - 未分配</p>
    */
    @SerializedName("AllocationType")
    @Expose
    private Long AllocationType;

    /**
    * <p>当前归属单元信息</p>
    */
    @SerializedName("BelongTreeNodeUniqKey")
    @Expose
    private AllocationTreeNode BelongTreeNodeUniqKey;

    /**
    * <p>当前资源命中公摊规则信息</p>
    */
    @SerializedName("BelongRule")
    @Expose
    private AllocationRule BelongRule;

    /**
    * <p>其它归属单元信息</p>
    */
    @SerializedName("OtherTreeNodeUniqKeys")
    @Expose
    private AllocationTreeNode [] OtherTreeNodeUniqKeys;

    /**
    * <p>其他命中规则信息</p>
    */
    @SerializedName("OtherRules")
    @Expose
    private AllocationRule [] OtherRules;

    /**
    * <p>项目ID</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * <p>项目名称：资源归属的项目，用户在控制台给资源自主分配项目，未分配则是默认项目</p>
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * <p>子产品编码</p>
    */
    @SerializedName("ProductCode")
    @Expose
    private String ProductCode;

    /**
    * <p>子产品名称：用户采购的具体产品细分类型</p>
    */
    @SerializedName("ProductCodeName")
    @Expose
    private String ProductCodeName;

    /**
    * <p>计费模式编码</p>
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * <p>计费模式：资源的计费模式，区分为包年包月和按量计费</p>
    */
    @SerializedName("PayModeName")
    @Expose
    private String PayModeName;

    /**
    * <p>交易类型编码</p>
    */
    @SerializedName("ActionType")
    @Expose
    private String ActionType;

    /**
    * <p>交易类型：明细交易类型</p>
    */
    @SerializedName("ActionTypeName")
    @Expose
    private String ActionTypeName;

    /**
    * <p>分拆项 ID：涉及分拆产品的分拆后的分拆项 ID，如 COS 桶 ID，CDN 域名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SplitItemId")
    @Expose
    private String SplitItemId;

    /**
    * <p>分拆项名称：涉及分拆产品的分拆后的分拆项</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SplitItemName")
    @Expose
    private String SplitItemName;

    /**
    * <p>归集方式</p><p>枚举值：</p><ul><li>0： 未归集</li><li>1： 自动命中</li><li>2： 手动分配待生效</li><li>3： 手动分配已生效</li></ul>
    */
    @SerializedName("EffectiveMode")
    @Expose
    private String EffectiveMode;

    /**
     * Get <p>支付者 UIN：支付者的账号 ID，账号 ID 是用户在腾讯云的唯一账号标识</p> 
     * @return PayerUin <p>支付者 UIN：支付者的账号 ID，账号 ID 是用户在腾讯云的唯一账号标识</p>
     */
    public String getPayerUin() {
        return this.PayerUin;
    }

    /**
     * Set <p>支付者 UIN：支付者的账号 ID，账号 ID 是用户在腾讯云的唯一账号标识</p>
     * @param PayerUin <p>支付者 UIN：支付者的账号 ID，账号 ID 是用户在腾讯云的唯一账号标识</p>
     */
    public void setPayerUin(String PayerUin) {
        this.PayerUin = PayerUin;
    }

    /**
     * Get <p>使用者 UIN：实际使用资源的账号 ID</p> 
     * @return OwnerUin <p>使用者 UIN：实际使用资源的账号 ID</p>
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set <p>使用者 UIN：实际使用资源的账号 ID</p>
     * @param OwnerUin <p>使用者 UIN：实际使用资源的账号 ID</p>
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * Get <p>操作者 UIN：操作者账号 ID（预付费资源下单或后付费操作开通资源账号的ID或者角色 ID）</p> 
     * @return OperateUin <p>操作者 UIN：操作者账号 ID（预付费资源下单或后付费操作开通资源账号的ID或者角色 ID）</p>
     */
    public String getOperateUin() {
        return this.OperateUin;
    }

    /**
     * Set <p>操作者 UIN：操作者账号 ID（预付费资源下单或后付费操作开通资源账号的ID或者角色 ID）</p>
     * @param OperateUin <p>操作者 UIN：操作者账号 ID（预付费资源下单或后付费操作开通资源账号的ID或者角色 ID）</p>
     */
    public void setOperateUin(String OperateUin) {
        this.OperateUin = OperateUin;
    }

    /**
     * Get <p>实例类型编码</p> 
     * @return InstanceType <p>实例类型编码</p>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>实例类型编码</p>
     * @param InstanceType <p>实例类型编码</p>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get <p>实例类型：购买的产品服务对应的实例类型，包括资源包、RI、SP、竞价实例。常规实例默认展示“-”</p> 
     * @return InstanceTypeName <p>实例类型：购买的产品服务对应的实例类型，包括资源包、RI、SP、竞价实例。常规实例默认展示“-”</p>
     */
    public String getInstanceTypeName() {
        return this.InstanceTypeName;
    }

    /**
     * Set <p>实例类型：购买的产品服务对应的实例类型，包括资源包、RI、SP、竞价实例。常规实例默认展示“-”</p>
     * @param InstanceTypeName <p>实例类型：购买的产品服务对应的实例类型，包括资源包、RI、SP、竞价实例。常规实例默认展示“-”</p>
     */
    public void setInstanceTypeName(String InstanceTypeName) {
        this.InstanceTypeName = InstanceTypeName;
    }

    /**
     * Get <p>资源ID：不同产品因资源形态不同，资源内容不完全相同，如云服务器 CVM 为对应的实例 ID； 若该产品被分拆，则展示产品分拆后的分拆项 ID，如 COS 桶 ID，CDN 域名</p> 
     * @return ResourceId <p>资源ID：不同产品因资源形态不同，资源内容不完全相同，如云服务器 CVM 为对应的实例 ID； 若该产品被分拆，则展示产品分拆后的分拆项 ID，如 COS 桶 ID，CDN 域名</p>
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set <p>资源ID：不同产品因资源形态不同，资源内容不完全相同，如云服务器 CVM 为对应的实例 ID； 若该产品被分拆，则展示产品分拆后的分拆项 ID，如 COS 桶 ID，CDN 域名</p>
     * @param ResourceId <p>资源ID：不同产品因资源形态不同，资源内容不完全相同，如云服务器 CVM 为对应的实例 ID； 若该产品被分拆，则展示产品分拆后的分拆项 ID，如 COS 桶 ID，CDN 域名</p>
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get <p>实例名称：用户在控制台为资源设置的名称，如未设置默认为空；若该产品被分拆，则展示分拆产品分拆后的分拆项资源别名</p> 
     * @return ResourceName <p>实例名称：用户在控制台为资源设置的名称，如未设置默认为空；若该产品被分拆，则展示分拆产品分拆后的分拆项资源别名</p>
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set <p>实例名称：用户在控制台为资源设置的名称，如未设置默认为空；若该产品被分拆，则展示分拆产品分拆后的分拆项资源别名</p>
     * @param ResourceName <p>实例名称：用户在控制台为资源设置的名称，如未设置默认为空；若该产品被分拆，则展示分拆产品分拆后的分拆项资源别名</p>
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get <p>分账单元唯一标识</p> 
     * @return TreeNodeUniqKey <p>分账单元唯一标识</p>
     */
    public String getTreeNodeUniqKey() {
        return this.TreeNodeUniqKey;
    }

    /**
     * Set <p>分账单元唯一标识</p>
     * @param TreeNodeUniqKey <p>分账单元唯一标识</p>
     */
    public void setTreeNodeUniqKey(String TreeNodeUniqKey) {
        this.TreeNodeUniqKey = TreeNodeUniqKey;
    }

    /**
     * Get <p>分账单元名称</p> 
     * @return TreeNodeUniqKeyName <p>分账单元名称</p>
     */
    public String getTreeNodeUniqKeyName() {
        return this.TreeNodeUniqKeyName;
    }

    /**
     * Set <p>分账单元名称</p>
     * @param TreeNodeUniqKeyName <p>分账单元名称</p>
     */
    public void setTreeNodeUniqKeyName(String TreeNodeUniqKeyName) {
        this.TreeNodeUniqKeyName = TreeNodeUniqKeyName;
    }

    /**
     * Get <p>资源命中公摊规则ID</p> 
     * @return RuleId <p>资源命中公摊规则ID</p>
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set <p>资源命中公摊规则ID</p>
     * @param RuleId <p>资源命中公摊规则ID</p>
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get <p>资源命中公摊规则名称</p> 
     * @return RuleName <p>资源命中公摊规则名称</p>
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set <p>资源命中公摊规则名称</p>
     * @param RuleName <p>资源命中公摊规则名称</p>
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get <p>产品编码</p> 
     * @return BusinessCode <p>产品编码</p>
     */
    public String getBusinessCode() {
        return this.BusinessCode;
    }

    /**
     * Set <p>产品编码</p>
     * @param BusinessCode <p>产品编码</p>
     */
    public void setBusinessCode(String BusinessCode) {
        this.BusinessCode = BusinessCode;
    }

    /**
     * Get <p>产品名称：用户所采购的各类云产品</p> 
     * @return BusinessCodeName <p>产品名称：用户所采购的各类云产品</p>
     */
    public String getBusinessCodeName() {
        return this.BusinessCodeName;
    }

    /**
     * Set <p>产品名称：用户所采购的各类云产品</p>
     * @param BusinessCodeName <p>产品名称：用户所采购的各类云产品</p>
     */
    public void setBusinessCodeName(String BusinessCodeName) {
        this.BusinessCodeName = BusinessCodeName;
    }

    /**
     * Get <p>组件名称编码</p> 
     * @return ItemCode <p>组件名称编码</p>
     */
    public String getItemCode() {
        return this.ItemCode;
    }

    /**
     * Set <p>组件名称编码</p>
     * @param ItemCode <p>组件名称编码</p>
     */
    public void setItemCode(String ItemCode) {
        this.ItemCode = ItemCode;
    }

    /**
     * Get <p>组件名称：用户购买的产品或服务，所包含的具体组件</p> 
     * @return ItemCodeName <p>组件名称：用户购买的产品或服务，所包含的具体组件</p>
     */
    public String getItemCodeName() {
        return this.ItemCodeName;
    }

    /**
     * Set <p>组件名称：用户购买的产品或服务，所包含的具体组件</p>
     * @param ItemCodeName <p>组件名称：用户购买的产品或服务，所包含的具体组件</p>
     */
    public void setItemCodeName(String ItemCodeName) {
        this.ItemCodeName = ItemCodeName;
    }

    /**
     * Get <p>地域ID</p> 
     * @return RegionId <p>地域ID</p>
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set <p>地域ID</p>
     * @param RegionId <p>地域ID</p>
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get <p>地域名称：资源所属地域</p> 
     * @return RegionName <p>地域名称：资源所属地域</p>
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set <p>地域名称：资源所属地域</p>
     * @param RegionName <p>地域名称：资源所属地域</p>
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get <p>分账标签：资源绑定的标签</p> 
     * @return Tag <p>分账标签：资源绑定的标签</p>
     */
    public BillTag [] getTag() {
        return this.Tag;
    }

    /**
     * Set <p>分账标签：资源绑定的标签</p>
     * @param Tag <p>分账标签：资源绑定的标签</p>
     */
    public void setTag(BillTag [] Tag) {
        this.Tag = Tag;
    }

    /**
     * Get <p>优惠后总价：优惠后总价 =（原价 - 预留实例抵扣原价 - 节省计划抵扣原价）* 折扣率</p> 
     * @return RealTotalCost <p>优惠后总价：优惠后总价 =（原价 - 预留实例抵扣原价 - 节省计划抵扣原价）* 折扣率</p>
     */
    public String getRealTotalCost() {
        return this.RealTotalCost;
    }

    /**
     * Set <p>优惠后总价：优惠后总价 =（原价 - 预留实例抵扣原价 - 节省计划抵扣原价）* 折扣率</p>
     * @param RealTotalCost <p>优惠后总价：优惠后总价 =（原价 - 预留实例抵扣原价 - 节省计划抵扣原价）* 折扣率</p>
     */
    public void setRealTotalCost(String RealTotalCost) {
        this.RealTotalCost = RealTotalCost;
    }

    /**
     * Get <p>现金账户支出(元)：通过现金账户支付的金额</p> 
     * @return CashPayAmount <p>现金账户支出(元)：通过现金账户支付的金额</p>
     */
    public String getCashPayAmount() {
        return this.CashPayAmount;
    }

    /**
     * Set <p>现金账户支出(元)：通过现金账户支付的金额</p>
     * @param CashPayAmount <p>现金账户支出(元)：通过现金账户支付的金额</p>
     */
    public void setCashPayAmount(String CashPayAmount) {
        this.CashPayAmount = CashPayAmount;
    }

    /**
     * Get <p>代金券支出(元)：使用各类优惠券（如代金券、现金券等）支付的金额</p> 
     * @return VoucherPayAmount <p>代金券支出(元)：使用各类优惠券（如代金券、现金券等）支付的金额</p>
     */
    public String getVoucherPayAmount() {
        return this.VoucherPayAmount;
    }

    /**
     * Set <p>代金券支出(元)：使用各类优惠券（如代金券、现金券等）支付的金额</p>
     * @param VoucherPayAmount <p>代金券支出(元)：使用各类优惠券（如代金券、现金券等）支付的金额</p>
     */
    public void setVoucherPayAmount(String VoucherPayAmount) {
        this.VoucherPayAmount = VoucherPayAmount;
    }

    /**
     * Get <p>赠送账户支出(元)：使用赠送金支付的金额</p> 
     * @return IncentivePayAmount <p>赠送账户支出(元)：使用赠送金支付的金额</p>
     */
    public String getIncentivePayAmount() {
        return this.IncentivePayAmount;
    }

    /**
     * Set <p>赠送账户支出(元)：使用赠送金支付的金额</p>
     * @param IncentivePayAmount <p>赠送账户支出(元)：使用赠送金支付的金额</p>
     */
    public void setIncentivePayAmount(String IncentivePayAmount) {
        this.IncentivePayAmount = IncentivePayAmount;
    }

    /**
     * Get <p>分成账户支出(元)：通过分成金账户支付的金额</p> 
     * @return TransferPayAmount <p>分成账户支出(元)：通过分成金账户支付的金额</p>
     */
    public String getTransferPayAmount() {
        return this.TransferPayAmount;
    }

    /**
     * Set <p>分成账户支出(元)：通过分成金账户支付的金额</p>
     * @param TransferPayAmount <p>分成账户支出(元)：通过分成金账户支付的金额</p>
     */
    public void setTransferPayAmount(String TransferPayAmount) {
        this.TransferPayAmount = TransferPayAmount;
    }

    /**
     * Get <p>费用归集类型：费用来源类型，分摊、归集、未分配<br>0 - 分摊<br>1 - 归集<br>-1 - 未分配</p> 
     * @return AllocationType <p>费用归集类型：费用来源类型，分摊、归集、未分配<br>0 - 分摊<br>1 - 归集<br>-1 - 未分配</p>
     */
    public Long getAllocationType() {
        return this.AllocationType;
    }

    /**
     * Set <p>费用归集类型：费用来源类型，分摊、归集、未分配<br>0 - 分摊<br>1 - 归集<br>-1 - 未分配</p>
     * @param AllocationType <p>费用归集类型：费用来源类型，分摊、归集、未分配<br>0 - 分摊<br>1 - 归集<br>-1 - 未分配</p>
     */
    public void setAllocationType(Long AllocationType) {
        this.AllocationType = AllocationType;
    }

    /**
     * Get <p>当前归属单元信息</p> 
     * @return BelongTreeNodeUniqKey <p>当前归属单元信息</p>
     */
    public AllocationTreeNode getBelongTreeNodeUniqKey() {
        return this.BelongTreeNodeUniqKey;
    }

    /**
     * Set <p>当前归属单元信息</p>
     * @param BelongTreeNodeUniqKey <p>当前归属单元信息</p>
     */
    public void setBelongTreeNodeUniqKey(AllocationTreeNode BelongTreeNodeUniqKey) {
        this.BelongTreeNodeUniqKey = BelongTreeNodeUniqKey;
    }

    /**
     * Get <p>当前资源命中公摊规则信息</p> 
     * @return BelongRule <p>当前资源命中公摊规则信息</p>
     */
    public AllocationRule getBelongRule() {
        return this.BelongRule;
    }

    /**
     * Set <p>当前资源命中公摊规则信息</p>
     * @param BelongRule <p>当前资源命中公摊规则信息</p>
     */
    public void setBelongRule(AllocationRule BelongRule) {
        this.BelongRule = BelongRule;
    }

    /**
     * Get <p>其它归属单元信息</p> 
     * @return OtherTreeNodeUniqKeys <p>其它归属单元信息</p>
     */
    public AllocationTreeNode [] getOtherTreeNodeUniqKeys() {
        return this.OtherTreeNodeUniqKeys;
    }

    /**
     * Set <p>其它归属单元信息</p>
     * @param OtherTreeNodeUniqKeys <p>其它归属单元信息</p>
     */
    public void setOtherTreeNodeUniqKeys(AllocationTreeNode [] OtherTreeNodeUniqKeys) {
        this.OtherTreeNodeUniqKeys = OtherTreeNodeUniqKeys;
    }

    /**
     * Get <p>其他命中规则信息</p> 
     * @return OtherRules <p>其他命中规则信息</p>
     */
    public AllocationRule [] getOtherRules() {
        return this.OtherRules;
    }

    /**
     * Set <p>其他命中规则信息</p>
     * @param OtherRules <p>其他命中规则信息</p>
     */
    public void setOtherRules(AllocationRule [] OtherRules) {
        this.OtherRules = OtherRules;
    }

    /**
     * Get <p>项目ID</p> 
     * @return ProjectId <p>项目ID</p>
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目ID</p>
     * @param ProjectId <p>项目ID</p>
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>项目名称：资源归属的项目，用户在控制台给资源自主分配项目，未分配则是默认项目</p> 
     * @return ProjectName <p>项目名称：资源归属的项目，用户在控制台给资源自主分配项目，未分配则是默认项目</p>
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set <p>项目名称：资源归属的项目，用户在控制台给资源自主分配项目，未分配则是默认项目</p>
     * @param ProjectName <p>项目名称：资源归属的项目，用户在控制台给资源自主分配项目，未分配则是默认项目</p>
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get <p>子产品编码</p> 
     * @return ProductCode <p>子产品编码</p>
     */
    public String getProductCode() {
        return this.ProductCode;
    }

    /**
     * Set <p>子产品编码</p>
     * @param ProductCode <p>子产品编码</p>
     */
    public void setProductCode(String ProductCode) {
        this.ProductCode = ProductCode;
    }

    /**
     * Get <p>子产品名称：用户采购的具体产品细分类型</p> 
     * @return ProductCodeName <p>子产品名称：用户采购的具体产品细分类型</p>
     */
    public String getProductCodeName() {
        return this.ProductCodeName;
    }

    /**
     * Set <p>子产品名称：用户采购的具体产品细分类型</p>
     * @param ProductCodeName <p>子产品名称：用户采购的具体产品细分类型</p>
     */
    public void setProductCodeName(String ProductCodeName) {
        this.ProductCodeName = ProductCodeName;
    }

    /**
     * Get <p>计费模式编码</p> 
     * @return PayMode <p>计费模式编码</p>
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set <p>计费模式编码</p>
     * @param PayMode <p>计费模式编码</p>
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get <p>计费模式：资源的计费模式，区分为包年包月和按量计费</p> 
     * @return PayModeName <p>计费模式：资源的计费模式，区分为包年包月和按量计费</p>
     */
    public String getPayModeName() {
        return this.PayModeName;
    }

    /**
     * Set <p>计费模式：资源的计费模式，区分为包年包月和按量计费</p>
     * @param PayModeName <p>计费模式：资源的计费模式，区分为包年包月和按量计费</p>
     */
    public void setPayModeName(String PayModeName) {
        this.PayModeName = PayModeName;
    }

    /**
     * Get <p>交易类型编码</p> 
     * @return ActionType <p>交易类型编码</p>
     */
    public String getActionType() {
        return this.ActionType;
    }

    /**
     * Set <p>交易类型编码</p>
     * @param ActionType <p>交易类型编码</p>
     */
    public void setActionType(String ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get <p>交易类型：明细交易类型</p> 
     * @return ActionTypeName <p>交易类型：明细交易类型</p>
     */
    public String getActionTypeName() {
        return this.ActionTypeName;
    }

    /**
     * Set <p>交易类型：明细交易类型</p>
     * @param ActionTypeName <p>交易类型：明细交易类型</p>
     */
    public void setActionTypeName(String ActionTypeName) {
        this.ActionTypeName = ActionTypeName;
    }

    /**
     * Get <p>分拆项 ID：涉及分拆产品的分拆后的分拆项 ID，如 COS 桶 ID，CDN 域名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SplitItemId <p>分拆项 ID：涉及分拆产品的分拆后的分拆项 ID，如 COS 桶 ID，CDN 域名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public String getSplitItemId() {
        return this.SplitItemId;
    }

    /**
     * Set <p>分拆项 ID：涉及分拆产品的分拆后的分拆项 ID，如 COS 桶 ID，CDN 域名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SplitItemId <p>分拆项 ID：涉及分拆产品的分拆后的分拆项 ID，如 COS 桶 ID，CDN 域名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setSplitItemId(String SplitItemId) {
        this.SplitItemId = SplitItemId;
    }

    /**
     * Get <p>分拆项名称：涉及分拆产品的分拆后的分拆项</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SplitItemName <p>分拆项名称：涉及分拆产品的分拆后的分拆项</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public String getSplitItemName() {
        return this.SplitItemName;
    }

    /**
     * Set <p>分拆项名称：涉及分拆产品的分拆后的分拆项</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SplitItemName <p>分拆项名称：涉及分拆产品的分拆后的分拆项</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setSplitItemName(String SplitItemName) {
        this.SplitItemName = SplitItemName;
    }

    /**
     * Get <p>归集方式</p><p>枚举值：</p><ul><li>0： 未归集</li><li>1： 自动命中</li><li>2： 手动分配待生效</li><li>3： 手动分配已生效</li></ul> 
     * @return EffectiveMode <p>归集方式</p><p>枚举值：</p><ul><li>0： 未归集</li><li>1： 自动命中</li><li>2： 手动分配待生效</li><li>3： 手动分配已生效</li></ul>
     */
    public String getEffectiveMode() {
        return this.EffectiveMode;
    }

    /**
     * Set <p>归集方式</p><p>枚举值：</p><ul><li>0： 未归集</li><li>1： 自动命中</li><li>2： 手动分配待生效</li><li>3： 手动分配已生效</li></ul>
     * @param EffectiveMode <p>归集方式</p><p>枚举值：</p><ul><li>0： 未归集</li><li>1： 自动命中</li><li>2： 手动分配待生效</li><li>3： 手动分配已生效</li></ul>
     */
    public void setEffectiveMode(String EffectiveMode) {
        this.EffectiveMode = EffectiveMode;
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
        if (source.EffectiveMode != null) {
            this.EffectiveMode = new String(source.EffectiveMode);
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
        this.setParamSimple(map, prefix + "EffectiveMode", this.EffectiveMode);

    }
}

