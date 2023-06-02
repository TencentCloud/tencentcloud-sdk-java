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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FlowApproverDetail extends AbstractModel{

    /**
    * 签署时的相关信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApproveMessage")
    @Expose
    private String ApproveMessage;

    /**
    * 签署方姓名
    */
    @SerializedName("ApproveName")
    @Expose
    private String ApproveName;

    /**
    * 签署方的签署状态
0：还没有发起
1：流程中 没有开始处理
2：待签署
3：已签署
4：已拒绝
5：已过期
6：已撤销
7：还没有预发起
8：待填写
9：因为各种原因而终止
10：填写完成
15：已解除
19：转他人处理
    */
    @SerializedName("ApproveStatus")
    @Expose
    private Long ApproveStatus;

    /**
    * 模板配置中的参与方ID,与控件绑定
    */
    @SerializedName("ReceiptId")
    @Expose
    private String ReceiptId;

    /**
    * 客户自定义的用户ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CustomUserId")
    @Expose
    private String CustomUserId;

    /**
    * 签署人手机号
    */
    @SerializedName("Mobile")
    @Expose
    private String Mobile;

    /**
    * 签署顺序，如果是有序签署，签署顺序从小到大
    */
    @SerializedName("SignOrder")
    @Expose
    private Long SignOrder;

    /**
    * 签署人签署时间，时间戳，单位秒
    */
    @SerializedName("ApproveTime")
    @Expose
    private Long ApproveTime;

    /**
    * 签署方类型，ORGANIZATION-企业员工，PERSON-个人，ENTERPRISESERVER-企业静默签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApproveType")
    @Expose
    private String ApproveType;

    /**
    * 签署方侧用户来源，如WEWORKAPP-企业微信等
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApproverSource")
    @Expose
    private String ApproverSource;

    /**
    * 客户自定义签署方标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CustomApproverTag")
    @Expose
    private String CustomApproverTag;

    /**
    * 签署方企业Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrganizationId")
    @Expose
    private String OrganizationId;

    /**
    * 签署方企业名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrganizationName")
    @Expose
    private String OrganizationName;

    /**
     * Get 签署时的相关信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApproveMessage 签署时的相关信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApproveMessage() {
        return this.ApproveMessage;
    }

    /**
     * Set 签署时的相关信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApproveMessage 签署时的相关信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApproveMessage(String ApproveMessage) {
        this.ApproveMessage = ApproveMessage;
    }

    /**
     * Get 签署方姓名 
     * @return ApproveName 签署方姓名
     */
    public String getApproveName() {
        return this.ApproveName;
    }

    /**
     * Set 签署方姓名
     * @param ApproveName 签署方姓名
     */
    public void setApproveName(String ApproveName) {
        this.ApproveName = ApproveName;
    }

    /**
     * Get 签署方的签署状态
0：还没有发起
1：流程中 没有开始处理
2：待签署
3：已签署
4：已拒绝
5：已过期
6：已撤销
7：还没有预发起
8：待填写
9：因为各种原因而终止
10：填写完成
15：已解除
19：转他人处理 
     * @return ApproveStatus 签署方的签署状态
0：还没有发起
1：流程中 没有开始处理
2：待签署
3：已签署
4：已拒绝
5：已过期
6：已撤销
7：还没有预发起
8：待填写
9：因为各种原因而终止
10：填写完成
15：已解除
19：转他人处理
     */
    public Long getApproveStatus() {
        return this.ApproveStatus;
    }

    /**
     * Set 签署方的签署状态
0：还没有发起
1：流程中 没有开始处理
2：待签署
3：已签署
4：已拒绝
5：已过期
6：已撤销
7：还没有预发起
8：待填写
9：因为各种原因而终止
10：填写完成
15：已解除
19：转他人处理
     * @param ApproveStatus 签署方的签署状态
0：还没有发起
1：流程中 没有开始处理
2：待签署
3：已签署
4：已拒绝
5：已过期
6：已撤销
7：还没有预发起
8：待填写
9：因为各种原因而终止
10：填写完成
15：已解除
19：转他人处理
     */
    public void setApproveStatus(Long ApproveStatus) {
        this.ApproveStatus = ApproveStatus;
    }

    /**
     * Get 模板配置中的参与方ID,与控件绑定 
     * @return ReceiptId 模板配置中的参与方ID,与控件绑定
     */
    public String getReceiptId() {
        return this.ReceiptId;
    }

    /**
     * Set 模板配置中的参与方ID,与控件绑定
     * @param ReceiptId 模板配置中的参与方ID,与控件绑定
     */
    public void setReceiptId(String ReceiptId) {
        this.ReceiptId = ReceiptId;
    }

    /**
     * Get 客户自定义的用户ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CustomUserId 客户自定义的用户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCustomUserId() {
        return this.CustomUserId;
    }

    /**
     * Set 客户自定义的用户ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param CustomUserId 客户自定义的用户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCustomUserId(String CustomUserId) {
        this.CustomUserId = CustomUserId;
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
     * Get 签署顺序，如果是有序签署，签署顺序从小到大 
     * @return SignOrder 签署顺序，如果是有序签署，签署顺序从小到大
     */
    public Long getSignOrder() {
        return this.SignOrder;
    }

    /**
     * Set 签署顺序，如果是有序签署，签署顺序从小到大
     * @param SignOrder 签署顺序，如果是有序签署，签署顺序从小到大
     */
    public void setSignOrder(Long SignOrder) {
        this.SignOrder = SignOrder;
    }

    /**
     * Get 签署人签署时间，时间戳，单位秒 
     * @return ApproveTime 签署人签署时间，时间戳，单位秒
     */
    public Long getApproveTime() {
        return this.ApproveTime;
    }

    /**
     * Set 签署人签署时间，时间戳，单位秒
     * @param ApproveTime 签署人签署时间，时间戳，单位秒
     */
    public void setApproveTime(Long ApproveTime) {
        this.ApproveTime = ApproveTime;
    }

    /**
     * Get 签署方类型，ORGANIZATION-企业员工，PERSON-个人，ENTERPRISESERVER-企业静默签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApproveType 签署方类型，ORGANIZATION-企业员工，PERSON-个人，ENTERPRISESERVER-企业静默签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApproveType() {
        return this.ApproveType;
    }

    /**
     * Set 签署方类型，ORGANIZATION-企业员工，PERSON-个人，ENTERPRISESERVER-企业静默签
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApproveType 签署方类型，ORGANIZATION-企业员工，PERSON-个人，ENTERPRISESERVER-企业静默签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApproveType(String ApproveType) {
        this.ApproveType = ApproveType;
    }

    /**
     * Get 签署方侧用户来源，如WEWORKAPP-企业微信等
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApproverSource 签署方侧用户来源，如WEWORKAPP-企业微信等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApproverSource() {
        return this.ApproverSource;
    }

    /**
     * Set 签署方侧用户来源，如WEWORKAPP-企业微信等
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApproverSource 签署方侧用户来源，如WEWORKAPP-企业微信等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApproverSource(String ApproverSource) {
        this.ApproverSource = ApproverSource;
    }

    /**
     * Get 客户自定义签署方标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CustomApproverTag 客户自定义签署方标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCustomApproverTag() {
        return this.CustomApproverTag;
    }

    /**
     * Set 客户自定义签署方标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param CustomApproverTag 客户自定义签署方标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCustomApproverTag(String CustomApproverTag) {
        this.CustomApproverTag = CustomApproverTag;
    }

    /**
     * Get 签署方企业Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrganizationId 签署方企业Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOrganizationId() {
        return this.OrganizationId;
    }

    /**
     * Set 签署方企业Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrganizationId 签署方企业Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrganizationId(String OrganizationId) {
        this.OrganizationId = OrganizationId;
    }

    /**
     * Get 签署方企业名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrganizationName 签署方企业名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOrganizationName() {
        return this.OrganizationName;
    }

    /**
     * Set 签署方企业名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrganizationName 签署方企业名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrganizationName(String OrganizationName) {
        this.OrganizationName = OrganizationName;
    }

    public FlowApproverDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlowApproverDetail(FlowApproverDetail source) {
        if (source.ApproveMessage != null) {
            this.ApproveMessage = new String(source.ApproveMessage);
        }
        if (source.ApproveName != null) {
            this.ApproveName = new String(source.ApproveName);
        }
        if (source.ApproveStatus != null) {
            this.ApproveStatus = new Long(source.ApproveStatus);
        }
        if (source.ReceiptId != null) {
            this.ReceiptId = new String(source.ReceiptId);
        }
        if (source.CustomUserId != null) {
            this.CustomUserId = new String(source.CustomUserId);
        }
        if (source.Mobile != null) {
            this.Mobile = new String(source.Mobile);
        }
        if (source.SignOrder != null) {
            this.SignOrder = new Long(source.SignOrder);
        }
        if (source.ApproveTime != null) {
            this.ApproveTime = new Long(source.ApproveTime);
        }
        if (source.ApproveType != null) {
            this.ApproveType = new String(source.ApproveType);
        }
        if (source.ApproverSource != null) {
            this.ApproverSource = new String(source.ApproverSource);
        }
        if (source.CustomApproverTag != null) {
            this.CustomApproverTag = new String(source.CustomApproverTag);
        }
        if (source.OrganizationId != null) {
            this.OrganizationId = new String(source.OrganizationId);
        }
        if (source.OrganizationName != null) {
            this.OrganizationName = new String(source.OrganizationName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApproveMessage", this.ApproveMessage);
        this.setParamSimple(map, prefix + "ApproveName", this.ApproveName);
        this.setParamSimple(map, prefix + "ApproveStatus", this.ApproveStatus);
        this.setParamSimple(map, prefix + "ReceiptId", this.ReceiptId);
        this.setParamSimple(map, prefix + "CustomUserId", this.CustomUserId);
        this.setParamSimple(map, prefix + "Mobile", this.Mobile);
        this.setParamSimple(map, prefix + "SignOrder", this.SignOrder);
        this.setParamSimple(map, prefix + "ApproveTime", this.ApproveTime);
        this.setParamSimple(map, prefix + "ApproveType", this.ApproveType);
        this.setParamSimple(map, prefix + "ApproverSource", this.ApproverSource);
        this.setParamSimple(map, prefix + "CustomApproverTag", this.CustomApproverTag);
        this.setParamSimple(map, prefix + "OrganizationId", this.OrganizationId);
        this.setParamSimple(map, prefix + "OrganizationName", this.OrganizationName);

    }
}

