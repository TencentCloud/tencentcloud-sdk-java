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
package com.tencentcloudapi.hasim.v20210716.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OrderInfo extends AbstractModel{

    /**
    * 子订单ID
    */
    @SerializedName("DealName")
    @Expose
    private String DealName;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * 订单账户
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 购买数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BuyNum")
    @Expose
    private Long BuyNum;

    /**
    * 行业代码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IndustryCode")
    @Expose
    private String IndustryCode;

    /**
    * 地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * 联系人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Contact")
    @Expose
    private String Contact;

    /**
    * 电话号码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Msisdn")
    @Expose
    private String Msisdn;

    /**
    * 卡片规格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Specification")
    @Expose
    private String Specification;

    /**
    * 用户订单备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 大订单号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BigDealId")
    @Expose
    private String BigDealId;

    /**
    * 审批状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuditStatus")
    @Expose
    private String AuditStatus;

    /**
    * 发货状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FlowStatus")
    @Expose
    private String FlowStatus;

    /**
    * 审批备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 退费订单
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RefundBigDealId")
    @Expose
    private String RefundBigDealId;

    /**
     * Get 子订单ID 
     * @return DealName 子订单ID
     */
    public String getDealName() {
        return this.DealName;
    }

    /**
     * Set 子订单ID
     * @param DealName 子订单ID
     */
    public void setDealName(String DealName) {
        this.DealName = DealName;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedAt 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedAt 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get 订单账户 
     * @return Uin 订单账户
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 订单账户
     * @param Uin 订单账户
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 购买数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BuyNum 购买数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBuyNum() {
        return this.BuyNum;
    }

    /**
     * Set 购买数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param BuyNum 购买数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBuyNum(Long BuyNum) {
        this.BuyNum = BuyNum;
    }

    /**
     * Get 行业代码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IndustryCode 行业代码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIndustryCode() {
        return this.IndustryCode;
    }

    /**
     * Set 行业代码
注意：此字段可能返回 null，表示取不到有效值。
     * @param IndustryCode 行业代码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndustryCode(String IndustryCode) {
        this.IndustryCode = IndustryCode;
    }

    /**
     * Get 地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Address 地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set 地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param Address 地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get 联系人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Contact 联系人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContact() {
        return this.Contact;
    }

    /**
     * Set 联系人
注意：此字段可能返回 null，表示取不到有效值。
     * @param Contact 联系人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContact(String Contact) {
        this.Contact = Contact;
    }

    /**
     * Get 电话号码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Msisdn 电话号码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMsisdn() {
        return this.Msisdn;
    }

    /**
     * Set 电话号码
注意：此字段可能返回 null，表示取不到有效值。
     * @param Msisdn 电话号码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMsisdn(String Msisdn) {
        this.Msisdn = Msisdn;
    }

    /**
     * Get 卡片规格
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Specification 卡片规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSpecification() {
        return this.Specification;
    }

    /**
     * Set 卡片规格
注意：此字段可能返回 null，表示取不到有效值。
     * @param Specification 卡片规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSpecification(String Specification) {
        this.Specification = Specification;
    }

    /**
     * Get 用户订单备注
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Comment 用户订单备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 用户订单备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param Comment 用户订单备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 大订单号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BigDealId 大订单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBigDealId() {
        return this.BigDealId;
    }

    /**
     * Set 大订单号
注意：此字段可能返回 null，表示取不到有效值。
     * @param BigDealId 大订单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBigDealId(String BigDealId) {
        this.BigDealId = BigDealId;
    }

    /**
     * Get 审批状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuditStatus 审批状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAuditStatus() {
        return this.AuditStatus;
    }

    /**
     * Set 审批状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuditStatus 审批状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuditStatus(String AuditStatus) {
        this.AuditStatus = AuditStatus;
    }

    /**
     * Get 发货状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FlowStatus 发货状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFlowStatus() {
        return this.FlowStatus;
    }

    /**
     * Set 发货状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param FlowStatus 发货状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFlowStatus(String FlowStatus) {
        this.FlowStatus = FlowStatus;
    }

    /**
     * Get 审批备注
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark 审批备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 审批备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark 审批备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 退费订单
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RefundBigDealId 退费订单
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRefundBigDealId() {
        return this.RefundBigDealId;
    }

    /**
     * Set 退费订单
注意：此字段可能返回 null，表示取不到有效值。
     * @param RefundBigDealId 退费订单
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRefundBigDealId(String RefundBigDealId) {
        this.RefundBigDealId = RefundBigDealId;
    }

    public OrderInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OrderInfo(OrderInfo source) {
        if (source.DealName != null) {
            this.DealName = new String(source.DealName);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.BuyNum != null) {
            this.BuyNum = new Long(source.BuyNum);
        }
        if (source.IndustryCode != null) {
            this.IndustryCode = new String(source.IndustryCode);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.Contact != null) {
            this.Contact = new String(source.Contact);
        }
        if (source.Msisdn != null) {
            this.Msisdn = new String(source.Msisdn);
        }
        if (source.Specification != null) {
            this.Specification = new String(source.Specification);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.BigDealId != null) {
            this.BigDealId = new String(source.BigDealId);
        }
        if (source.AuditStatus != null) {
            this.AuditStatus = new String(source.AuditStatus);
        }
        if (source.FlowStatus != null) {
            this.FlowStatus = new String(source.FlowStatus);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.RefundBigDealId != null) {
            this.RefundBigDealId = new String(source.RefundBigDealId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DealName", this.DealName);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "BuyNum", this.BuyNum);
        this.setParamSimple(map, prefix + "IndustryCode", this.IndustryCode);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "Contact", this.Contact);
        this.setParamSimple(map, prefix + "Msisdn", this.Msisdn);
        this.setParamSimple(map, prefix + "Specification", this.Specification);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "BigDealId", this.BigDealId);
        this.setParamSimple(map, prefix + "AuditStatus", this.AuditStatus);
        this.setParamSimple(map, prefix + "FlowStatus", this.FlowStatus);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "RefundBigDealId", this.RefundBigDealId);

    }
}

