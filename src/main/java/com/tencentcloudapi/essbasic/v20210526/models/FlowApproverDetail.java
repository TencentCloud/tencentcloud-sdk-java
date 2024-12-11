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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FlowApproverDetail extends AbstractModel {

    /**
    * 模板配置时候的签署人角色ID(用PDF文件发起也可以指定,如果不指定则自动生成此角色ID), 所有的填写控件和签署控件都归属不同的角色
    */
    @SerializedName("ReceiptId")
    @Expose
    private String ReceiptId;

    /**
    * 第三方平台子客企业的唯一标识，定义Agent中的ProxyOrganizationOpenId一样, 可以参考<a href="https://qian.tencent.com/developers/partnerApis/dataTypes/#agent" target="_blank">Agent结构体</a>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProxyOrganizationOpenId")
    @Expose
    private String ProxyOrganizationOpenId;

    /**
    * 第三方平台子客企业员工的唯一标识
    */
    @SerializedName("ProxyOperatorOpenId")
    @Expose
    private String ProxyOperatorOpenId;

    /**
    * 第三方平台子客企业名称，与企业营业执照中注册的名称一致。
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
    * 签署顺序，如果是有序签署，签署顺序从小到大
    */
    @SerializedName("SignOrder")
    @Expose
    private Long SignOrder;

    /**
    * 签署方经办人的姓名。
经办人的姓名将用于身份认证和电子签名，请确保填写的姓名为签署方的真实姓名，而非昵称等代名。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApproveName")
    @Expose
    private String ApproveName;

    /**
    * 当前签署人的状态, 状态如下
<ul><li> **PENDING** :待签署</li>
<li> **FILLPENDING** :待填写</li>
<li> **FILLACCEPT** :填写完成</li>
<li> **FILLREJECT** :拒绝填写</li>
<li> **WAITPICKUP** :待领取</li>
<li> **ACCEPT** :已签署</li>
<li> **REJECT** :拒签</li>
<li> **DEADLINE** :过期没人处理</li>
<li> **CANCEL** :流程已撤回</li>
<li> **FORWARD** :已经转他人处理</li>
<li> **STOP** :流程已终止</li>
<li> **RELIEVED** :解除协议（已解除）</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApproveStatus")
    @Expose
    private String ApproveStatus;

    /**
    * 签署人拒签等情况的时候填写的原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApproveMessage")
    @Expose
    private String ApproveMessage;

    /**
    * 签署人签署时间戳，单位秒
    */
    @SerializedName("ApproveTime")
    @Expose
    private Long ApproveTime;

    /**
    * 参与者类型 
<ul><li> **ORGANIZATION** :企业签署人</li>
<li> **PERSON** :个人签署人</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApproveType")
    @Expose
    private String ApproveType;

    /**
    * 自定义签署人的角色名, 如: 收款人、开具人、见证人等
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApproverRoleName")
    @Expose
    private String ApproverRoleName;

    /**
    * 签署参与人在本流程中的编号ID（每个流程不同），可用此ID来定位签署参与人在本流程的签署节点。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SignId")
    @Expose
    private String SignId;

    /**
     * Get 模板配置时候的签署人角色ID(用PDF文件发起也可以指定,如果不指定则自动生成此角色ID), 所有的填写控件和签署控件都归属不同的角色 
     * @return ReceiptId 模板配置时候的签署人角色ID(用PDF文件发起也可以指定,如果不指定则自动生成此角色ID), 所有的填写控件和签署控件都归属不同的角色
     */
    public String getReceiptId() {
        return this.ReceiptId;
    }

    /**
     * Set 模板配置时候的签署人角色ID(用PDF文件发起也可以指定,如果不指定则自动生成此角色ID), 所有的填写控件和签署控件都归属不同的角色
     * @param ReceiptId 模板配置时候的签署人角色ID(用PDF文件发起也可以指定,如果不指定则自动生成此角色ID), 所有的填写控件和签署控件都归属不同的角色
     */
    public void setReceiptId(String ReceiptId) {
        this.ReceiptId = ReceiptId;
    }

    /**
     * Get 第三方平台子客企业的唯一标识，定义Agent中的ProxyOrganizationOpenId一样, 可以参考<a href="https://qian.tencent.com/developers/partnerApis/dataTypes/#agent" target="_blank">Agent结构体</a>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProxyOrganizationOpenId 第三方平台子客企业的唯一标识，定义Agent中的ProxyOrganizationOpenId一样, 可以参考<a href="https://qian.tencent.com/developers/partnerApis/dataTypes/#agent" target="_blank">Agent结构体</a>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProxyOrganizationOpenId() {
        return this.ProxyOrganizationOpenId;
    }

    /**
     * Set 第三方平台子客企业的唯一标识，定义Agent中的ProxyOrganizationOpenId一样, 可以参考<a href="https://qian.tencent.com/developers/partnerApis/dataTypes/#agent" target="_blank">Agent结构体</a>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProxyOrganizationOpenId 第三方平台子客企业的唯一标识，定义Agent中的ProxyOrganizationOpenId一样, 可以参考<a href="https://qian.tencent.com/developers/partnerApis/dataTypes/#agent" target="_blank">Agent结构体</a>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProxyOrganizationOpenId(String ProxyOrganizationOpenId) {
        this.ProxyOrganizationOpenId = ProxyOrganizationOpenId;
    }

    /**
     * Get 第三方平台子客企业员工的唯一标识 
     * @return ProxyOperatorOpenId 第三方平台子客企业员工的唯一标识
     */
    public String getProxyOperatorOpenId() {
        return this.ProxyOperatorOpenId;
    }

    /**
     * Set 第三方平台子客企业员工的唯一标识
     * @param ProxyOperatorOpenId 第三方平台子客企业员工的唯一标识
     */
    public void setProxyOperatorOpenId(String ProxyOperatorOpenId) {
        this.ProxyOperatorOpenId = ProxyOperatorOpenId;
    }

    /**
     * Get 第三方平台子客企业名称，与企业营业执照中注册的名称一致。 
     * @return ProxyOrganizationName 第三方平台子客企业名称，与企业营业执照中注册的名称一致。
     */
    public String getProxyOrganizationName() {
        return this.ProxyOrganizationName;
    }

    /**
     * Set 第三方平台子客企业名称，与企业营业执照中注册的名称一致。
     * @param ProxyOrganizationName 第三方平台子客企业名称，与企业营业执照中注册的名称一致。
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
     * Get 签署方经办人的姓名。
经办人的姓名将用于身份认证和电子签名，请确保填写的姓名为签署方的真实姓名，而非昵称等代名。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApproveName 签署方经办人的姓名。
经办人的姓名将用于身份认证和电子签名，请确保填写的姓名为签署方的真实姓名，而非昵称等代名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApproveName() {
        return this.ApproveName;
    }

    /**
     * Set 签署方经办人的姓名。
经办人的姓名将用于身份认证和电子签名，请确保填写的姓名为签署方的真实姓名，而非昵称等代名。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApproveName 签署方经办人的姓名。
经办人的姓名将用于身份认证和电子签名，请确保填写的姓名为签署方的真实姓名，而非昵称等代名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApproveName(String ApproveName) {
        this.ApproveName = ApproveName;
    }

    /**
     * Get 当前签署人的状态, 状态如下
<ul><li> **PENDING** :待签署</li>
<li> **FILLPENDING** :待填写</li>
<li> **FILLACCEPT** :填写完成</li>
<li> **FILLREJECT** :拒绝填写</li>
<li> **WAITPICKUP** :待领取</li>
<li> **ACCEPT** :已签署</li>
<li> **REJECT** :拒签</li>
<li> **DEADLINE** :过期没人处理</li>
<li> **CANCEL** :流程已撤回</li>
<li> **FORWARD** :已经转他人处理</li>
<li> **STOP** :流程已终止</li>
<li> **RELIEVED** :解除协议（已解除）</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApproveStatus 当前签署人的状态, 状态如下
<ul><li> **PENDING** :待签署</li>
<li> **FILLPENDING** :待填写</li>
<li> **FILLACCEPT** :填写完成</li>
<li> **FILLREJECT** :拒绝填写</li>
<li> **WAITPICKUP** :待领取</li>
<li> **ACCEPT** :已签署</li>
<li> **REJECT** :拒签</li>
<li> **DEADLINE** :过期没人处理</li>
<li> **CANCEL** :流程已撤回</li>
<li> **FORWARD** :已经转他人处理</li>
<li> **STOP** :流程已终止</li>
<li> **RELIEVED** :解除协议（已解除）</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApproveStatus() {
        return this.ApproveStatus;
    }

    /**
     * Set 当前签署人的状态, 状态如下
<ul><li> **PENDING** :待签署</li>
<li> **FILLPENDING** :待填写</li>
<li> **FILLACCEPT** :填写完成</li>
<li> **FILLREJECT** :拒绝填写</li>
<li> **WAITPICKUP** :待领取</li>
<li> **ACCEPT** :已签署</li>
<li> **REJECT** :拒签</li>
<li> **DEADLINE** :过期没人处理</li>
<li> **CANCEL** :流程已撤回</li>
<li> **FORWARD** :已经转他人处理</li>
<li> **STOP** :流程已终止</li>
<li> **RELIEVED** :解除协议（已解除）</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApproveStatus 当前签署人的状态, 状态如下
<ul><li> **PENDING** :待签署</li>
<li> **FILLPENDING** :待填写</li>
<li> **FILLACCEPT** :填写完成</li>
<li> **FILLREJECT** :拒绝填写</li>
<li> **WAITPICKUP** :待领取</li>
<li> **ACCEPT** :已签署</li>
<li> **REJECT** :拒签</li>
<li> **DEADLINE** :过期没人处理</li>
<li> **CANCEL** :流程已撤回</li>
<li> **FORWARD** :已经转他人处理</li>
<li> **STOP** :流程已终止</li>
<li> **RELIEVED** :解除协议（已解除）</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApproveStatus(String ApproveStatus) {
        this.ApproveStatus = ApproveStatus;
    }

    /**
     * Get 签署人拒签等情况的时候填写的原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApproveMessage 签署人拒签等情况的时候填写的原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApproveMessage() {
        return this.ApproveMessage;
    }

    /**
     * Set 签署人拒签等情况的时候填写的原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApproveMessage 签署人拒签等情况的时候填写的原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApproveMessage(String ApproveMessage) {
        this.ApproveMessage = ApproveMessage;
    }

    /**
     * Get 签署人签署时间戳，单位秒 
     * @return ApproveTime 签署人签署时间戳，单位秒
     */
    public Long getApproveTime() {
        return this.ApproveTime;
    }

    /**
     * Set 签署人签署时间戳，单位秒
     * @param ApproveTime 签署人签署时间戳，单位秒
     */
    public void setApproveTime(Long ApproveTime) {
        this.ApproveTime = ApproveTime;
    }

    /**
     * Get 参与者类型 
<ul><li> **ORGANIZATION** :企业签署人</li>
<li> **PERSON** :个人签署人</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApproveType 参与者类型 
<ul><li> **ORGANIZATION** :企业签署人</li>
<li> **PERSON** :个人签署人</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApproveType() {
        return this.ApproveType;
    }

    /**
     * Set 参与者类型 
<ul><li> **ORGANIZATION** :企业签署人</li>
<li> **PERSON** :个人签署人</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApproveType 参与者类型 
<ul><li> **ORGANIZATION** :企业签署人</li>
<li> **PERSON** :个人签署人</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApproveType(String ApproveType) {
        this.ApproveType = ApproveType;
    }

    /**
     * Get 自定义签署人的角色名, 如: 收款人、开具人、见证人等
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApproverRoleName 自定义签署人的角色名, 如: 收款人、开具人、见证人等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApproverRoleName() {
        return this.ApproverRoleName;
    }

    /**
     * Set 自定义签署人的角色名, 如: 收款人、开具人、见证人等
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApproverRoleName 自定义签署人的角色名, 如: 收款人、开具人、见证人等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApproverRoleName(String ApproverRoleName) {
        this.ApproverRoleName = ApproverRoleName;
    }

    /**
     * Get 签署参与人在本流程中的编号ID（每个流程不同），可用此ID来定位签署参与人在本流程的签署节点。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SignId 签署参与人在本流程中的编号ID（每个流程不同），可用此ID来定位签署参与人在本流程的签署节点。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSignId() {
        return this.SignId;
    }

    /**
     * Set 签署参与人在本流程中的编号ID（每个流程不同），可用此ID来定位签署参与人在本流程的签署节点。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SignId 签署参与人在本流程中的编号ID（每个流程不同），可用此ID来定位签署参与人在本流程的签署节点。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSignId(String SignId) {
        this.SignId = SignId;
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
        if (source.ApproverRoleName != null) {
            this.ApproverRoleName = new String(source.ApproverRoleName);
        }
        if (source.SignId != null) {
            this.SignId = new String(source.SignId);
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
        this.setParamSimple(map, prefix + "ApproverRoleName", this.ApproverRoleName);
        this.setParamSimple(map, prefix + "SignId", this.SignId);

    }
}

