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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FlowApproverDetail extends AbstractModel{

    /**
    * 模板配置时候的签署人id,与控件绑定
    */
    @SerializedName("ReceiptId")
    @Expose
    private String ReceiptId;

    /**
    * 渠道侧企业的第三方id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProxyOrganizationOpenId")
    @Expose
    private String ProxyOrganizationOpenId;

    /**
    * 渠道侧企业操作人的第三方id
    */
    @SerializedName("ProxyOperatorOpenId")
    @Expose
    private String ProxyOperatorOpenId;

    /**
    * 渠道侧企业名称
    */
    @SerializedName("ProxyOrganizationName")
    @Expose
    private String ProxyOrganizationName;

    /**
    * 签署人手机号
    */
    @SerializedName("Mobile")
    @Expose
    private String Mobile;

    /**
    * 签署人签署顺序
    */
    @SerializedName("SignOrder")
    @Expose
    private Long SignOrder;

    /**
    * 签署人姓名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApproveName")
    @Expose
    private String ApproveName;

    /**
    * 当前签署人的状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApproveStatus")
    @Expose
    private String ApproveStatus;

    /**
    * 签署人信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApproveMessage")
    @Expose
    private String ApproveMessage;

    /**
    * 签署人签署时间
    */
    @SerializedName("ApproveTime")
    @Expose
    private Long ApproveTime;

    /**
    * 参与者类型 (ORGANIZATION企业/PERSON个人)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApproveType")
    @Expose
    private String ApproveType;

    /**
     * Get 模板配置时候的签署人id,与控件绑定 
     * @return ReceiptId 模板配置时候的签署人id,与控件绑定
     */
    public String getReceiptId() {
        return this.ReceiptId;
    }

    /**
     * Set 模板配置时候的签署人id,与控件绑定
     * @param ReceiptId 模板配置时候的签署人id,与控件绑定
     */
    public void setReceiptId(String ReceiptId) {
        this.ReceiptId = ReceiptId;
    }

    /**
     * Get 渠道侧企业的第三方id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProxyOrganizationOpenId 渠道侧企业的第三方id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProxyOrganizationOpenId() {
        return this.ProxyOrganizationOpenId;
    }

    /**
     * Set 渠道侧企业的第三方id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProxyOrganizationOpenId 渠道侧企业的第三方id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProxyOrganizationOpenId(String ProxyOrganizationOpenId) {
        this.ProxyOrganizationOpenId = ProxyOrganizationOpenId;
    }

    /**
     * Get 渠道侧企业操作人的第三方id 
     * @return ProxyOperatorOpenId 渠道侧企业操作人的第三方id
     */
    public String getProxyOperatorOpenId() {
        return this.ProxyOperatorOpenId;
    }

    /**
     * Set 渠道侧企业操作人的第三方id
     * @param ProxyOperatorOpenId 渠道侧企业操作人的第三方id
     */
    public void setProxyOperatorOpenId(String ProxyOperatorOpenId) {
        this.ProxyOperatorOpenId = ProxyOperatorOpenId;
    }

    /**
     * Get 渠道侧企业名称 
     * @return ProxyOrganizationName 渠道侧企业名称
     */
    public String getProxyOrganizationName() {
        return this.ProxyOrganizationName;
    }

    /**
     * Set 渠道侧企业名称
     * @param ProxyOrganizationName 渠道侧企业名称
     */
    public void setProxyOrganizationName(String ProxyOrganizationName) {
        this.ProxyOrganizationName = ProxyOrganizationName;
    }

    /**
     * Get 签署人手机号 
     * @return Mobile 签署人手机号
     */
    public String getMobile() {
        return this.Mobile;
    }

    /**
     * Set 签署人手机号
     * @param Mobile 签署人手机号
     */
    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    /**
     * Get 签署人签署顺序 
     * @return SignOrder 签署人签署顺序
     */
    public Long getSignOrder() {
        return this.SignOrder;
    }

    /**
     * Set 签署人签署顺序
     * @param SignOrder 签署人签署顺序
     */
    public void setSignOrder(Long SignOrder) {
        this.SignOrder = SignOrder;
    }

    /**
     * Get 签署人姓名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApproveName 签署人姓名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApproveName() {
        return this.ApproveName;
    }

    /**
     * Set 签署人姓名
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApproveName 签署人姓名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApproveName(String ApproveName) {
        this.ApproveName = ApproveName;
    }

    /**
     * Get 当前签署人的状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApproveStatus 当前签署人的状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApproveStatus() {
        return this.ApproveStatus;
    }

    /**
     * Set 当前签署人的状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApproveStatus 当前签署人的状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApproveStatus(String ApproveStatus) {
        this.ApproveStatus = ApproveStatus;
    }

    /**
     * Get 签署人信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApproveMessage 签署人信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApproveMessage() {
        return this.ApproveMessage;
    }

    /**
     * Set 签署人信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApproveMessage 签署人信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApproveMessage(String ApproveMessage) {
        this.ApproveMessage = ApproveMessage;
    }

    /**
     * Get 签署人签署时间 
     * @return ApproveTime 签署人签署时间
     */
    public Long getApproveTime() {
        return this.ApproveTime;
    }

    /**
     * Set 签署人签署时间
     * @param ApproveTime 签署人签署时间
     */
    public void setApproveTime(Long ApproveTime) {
        this.ApproveTime = ApproveTime;
    }

    /**
     * Get 参与者类型 (ORGANIZATION企业/PERSON个人)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApproveType 参与者类型 (ORGANIZATION企业/PERSON个人)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApproveType() {
        return this.ApproveType;
    }

    /**
     * Set 参与者类型 (ORGANIZATION企业/PERSON个人)
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApproveType 参与者类型 (ORGANIZATION企业/PERSON个人)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApproveType(String ApproveType) {
        this.ApproveType = ApproveType;
    }

    public FlowApproverDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlowApproverDetail(FlowApproverDetail source) {
        if (source.ReceiptId != null) {
            this.ReceiptId = new String(source.ReceiptId);
        }
        if (source.ProxyOrganizationOpenId != null) {
            this.ProxyOrganizationOpenId = new String(source.ProxyOrganizationOpenId);
        }
        if (source.ProxyOperatorOpenId != null) {
            this.ProxyOperatorOpenId = new String(source.ProxyOperatorOpenId);
        }
        if (source.ProxyOrganizationName != null) {
            this.ProxyOrganizationName = new String(source.ProxyOrganizationName);
        }
        if (source.Mobile != null) {
            this.Mobile = new String(source.Mobile);
        }
        if (source.SignOrder != null) {
            this.SignOrder = new Long(source.SignOrder);
        }
        if (source.ApproveName != null) {
            this.ApproveName = new String(source.ApproveName);
        }
        if (source.ApproveStatus != null) {
            this.ApproveStatus = new String(source.ApproveStatus);
        }
        if (source.ApproveMessage != null) {
            this.ApproveMessage = new String(source.ApproveMessage);
        }
        if (source.ApproveTime != null) {
            this.ApproveTime = new Long(source.ApproveTime);
        }
        if (source.ApproveType != null) {
            this.ApproveType = new String(source.ApproveType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReceiptId", this.ReceiptId);
        this.setParamSimple(map, prefix + "ProxyOrganizationOpenId", this.ProxyOrganizationOpenId);
        this.setParamSimple(map, prefix + "ProxyOperatorOpenId", this.ProxyOperatorOpenId);
        this.setParamSimple(map, prefix + "ProxyOrganizationName", this.ProxyOrganizationName);
        this.setParamSimple(map, prefix + "Mobile", this.Mobile);
        this.setParamSimple(map, prefix + "SignOrder", this.SignOrder);
        this.setParamSimple(map, prefix + "ApproveName", this.ApproveName);
        this.setParamSimple(map, prefix + "ApproveStatus", this.ApproveStatus);
        this.setParamSimple(map, prefix + "ApproveMessage", this.ApproveMessage);
        this.setParamSimple(map, prefix + "ApproveTime", this.ApproveTime);
        this.setParamSimple(map, prefix + "ApproveType", this.ApproveType);

    }
}

