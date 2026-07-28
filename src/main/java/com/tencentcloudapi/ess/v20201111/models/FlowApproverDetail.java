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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FlowApproverDetail extends AbstractModel {

    /**
    * <p>签署时的相关信息</p>
    */
    @SerializedName("ApproveMessage")
    @Expose
    private String ApproveMessage;

    /**
    * <p>签署方姓名</p>
    */
    @SerializedName("ApproveName")
    @Expose
    private String ApproveName;

    /**
    * <p>签署方的签署状态<br>0：还没有发起<br>1：流程中 没有开始处理<br>2：待签署<br>3：已签署<br>4：已拒绝<br>5：已过期<br>6：已撤销<br>7：还没有预发起<br>8：待填写<br>9：因为各种原因而终止<br>10：填写完成<br>15：已解除<br>19：转他人处理</p>
    */
    @SerializedName("ApproveStatus")
    @Expose
    private Long ApproveStatus;

    /**
    * <p>模板配置中的参与方ID,与控件绑定</p>
    */
    @SerializedName("ReceiptId")
    @Expose
    private String ReceiptId;

    /**
    * <p>客户自定义的用户ID</p>
    */
    @SerializedName("CustomUserId")
    @Expose
    private String CustomUserId;

    /**
    * <p>签署人手机号</p>
    */
    @SerializedName("Mobile")
    @Expose
    private String Mobile;

    /**
    * <p>签署顺序，如果是有序签署，签署顺序从小到大</p>
    */
    @SerializedName("SignOrder")
    @Expose
    private Long SignOrder;

    /**
    * <p>签署人签署时间，时间戳，单位秒</p>
    */
    @SerializedName("ApproveTime")
    @Expose
    private Long ApproveTime;

    /**
    * <p>签署方类型，ORGANIZATION-企业员工，PERSON-个人，ENTERPRISESERVER-企业静默签</p>
    */
    @SerializedName("ApproveType")
    @Expose
    private String ApproveType;

    /**
    * <p>签署方侧用户来源，如WEWORKAPP-企业微信等</p>
    */
    @SerializedName("ApproverSource")
    @Expose
    private String ApproverSource;

    /**
    * <p>客户自定义签署方标识</p>
    */
    @SerializedName("CustomApproverTag")
    @Expose
    private String CustomApproverTag;

    /**
    * <p>签署方企业Id</p>
    */
    @SerializedName("OrganizationId")
    @Expose
    private String OrganizationId;

    /**
    * <p>签署方企业名称</p>
    */
    @SerializedName("OrganizationName")
    @Expose
    private String OrganizationName;

    /**
    * <p>签署参与人在本流程中的编号ID（每个流程不同），可用此ID来定位签署参与人在本流程的签署节点，也可用于后续创建签署链接等操作。</p>
    */
    @SerializedName("SignId")
    @Expose
    private String SignId;

    /**
    * <p>自定义签署人角色</p>
    */
    @SerializedName("ApproverRoleName")
    @Expose
    private String ApproverRoleName;

    /**
    * <p>模板配置中的参与方ID,与控件绑定</p>
    */
    @SerializedName("RecipientId")
    @Expose
    private String RecipientId;

    /**
    * <p>签署方转交记录列表，标识该签署方是由谁转交而来，按转交时间由远到近进行排序</p>
    */
    @SerializedName("ForwardRecords")
    @Expose
    private ForwardRecord [] ForwardRecords;

    /**
     * Get <p>签署时的相关信息</p> 
     * @return ApproveMessage <p>签署时的相关信息</p>
     */
    public String getApproveMessage() {
        return this.ApproveMessage;
    }

    /**
     * Set <p>签署时的相关信息</p>
     * @param ApproveMessage <p>签署时的相关信息</p>
     */
    public void setApproveMessage(String ApproveMessage) {
        this.ApproveMessage = ApproveMessage;
    }

    /**
     * Get <p>签署方姓名</p> 
     * @return ApproveName <p>签署方姓名</p>
     */
    public String getApproveName() {
        return this.ApproveName;
    }

    /**
     * Set <p>签署方姓名</p>
     * @param ApproveName <p>签署方姓名</p>
     */
    public void setApproveName(String ApproveName) {
        this.ApproveName = ApproveName;
    }

    /**
     * Get <p>签署方的签署状态<br>0：还没有发起<br>1：流程中 没有开始处理<br>2：待签署<br>3：已签署<br>4：已拒绝<br>5：已过期<br>6：已撤销<br>7：还没有预发起<br>8：待填写<br>9：因为各种原因而终止<br>10：填写完成<br>15：已解除<br>19：转他人处理</p> 
     * @return ApproveStatus <p>签署方的签署状态<br>0：还没有发起<br>1：流程中 没有开始处理<br>2：待签署<br>3：已签署<br>4：已拒绝<br>5：已过期<br>6：已撤销<br>7：还没有预发起<br>8：待填写<br>9：因为各种原因而终止<br>10：填写完成<br>15：已解除<br>19：转他人处理</p>
     */
    public Long getApproveStatus() {
        return this.ApproveStatus;
    }

    /**
     * Set <p>签署方的签署状态<br>0：还没有发起<br>1：流程中 没有开始处理<br>2：待签署<br>3：已签署<br>4：已拒绝<br>5：已过期<br>6：已撤销<br>7：还没有预发起<br>8：待填写<br>9：因为各种原因而终止<br>10：填写完成<br>15：已解除<br>19：转他人处理</p>
     * @param ApproveStatus <p>签署方的签署状态<br>0：还没有发起<br>1：流程中 没有开始处理<br>2：待签署<br>3：已签署<br>4：已拒绝<br>5：已过期<br>6：已撤销<br>7：还没有预发起<br>8：待填写<br>9：因为各种原因而终止<br>10：填写完成<br>15：已解除<br>19：转他人处理</p>
     */
    public void setApproveStatus(Long ApproveStatus) {
        this.ApproveStatus = ApproveStatus;
    }

    /**
     * Get <p>模板配置中的参与方ID,与控件绑定</p> 
     * @return ReceiptId <p>模板配置中的参与方ID,与控件绑定</p>
     * @deprecated
     */
    @Deprecated
    public String getReceiptId() {
        return this.ReceiptId;
    }

    /**
     * Set <p>模板配置中的参与方ID,与控件绑定</p>
     * @param ReceiptId <p>模板配置中的参与方ID,与控件绑定</p>
     * @deprecated
     */
    @Deprecated
    public void setReceiptId(String ReceiptId) {
        this.ReceiptId = ReceiptId;
    }

    /**
     * Get <p>客户自定义的用户ID</p> 
     * @return CustomUserId <p>客户自定义的用户ID</p>
     */
    public String getCustomUserId() {
        return this.CustomUserId;
    }

    /**
     * Set <p>客户自定义的用户ID</p>
     * @param CustomUserId <p>客户自定义的用户ID</p>
     */
    public void setCustomUserId(String CustomUserId) {
        this.CustomUserId = CustomUserId;
    }

    /**
     * Get <p>签署人手机号</p> 
     * @return Mobile <p>签署人手机号</p>
     */
    public String getMobile() {
        return this.Mobile;
    }

    /**
     * Set <p>签署人手机号</p>
     * @param Mobile <p>签署人手机号</p>
     */
    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    /**
     * Get <p>签署顺序，如果是有序签署，签署顺序从小到大</p> 
     * @return SignOrder <p>签署顺序，如果是有序签署，签署顺序从小到大</p>
     */
    public Long getSignOrder() {
        return this.SignOrder;
    }

    /**
     * Set <p>签署顺序，如果是有序签署，签署顺序从小到大</p>
     * @param SignOrder <p>签署顺序，如果是有序签署，签署顺序从小到大</p>
     */
    public void setSignOrder(Long SignOrder) {
        this.SignOrder = SignOrder;
    }

    /**
     * Get <p>签署人签署时间，时间戳，单位秒</p> 
     * @return ApproveTime <p>签署人签署时间，时间戳，单位秒</p>
     */
    public Long getApproveTime() {
        return this.ApproveTime;
    }

    /**
     * Set <p>签署人签署时间，时间戳，单位秒</p>
     * @param ApproveTime <p>签署人签署时间，时间戳，单位秒</p>
     */
    public void setApproveTime(Long ApproveTime) {
        this.ApproveTime = ApproveTime;
    }

    /**
     * Get <p>签署方类型，ORGANIZATION-企业员工，PERSON-个人，ENTERPRISESERVER-企业静默签</p> 
     * @return ApproveType <p>签署方类型，ORGANIZATION-企业员工，PERSON-个人，ENTERPRISESERVER-企业静默签</p>
     */
    public String getApproveType() {
        return this.ApproveType;
    }

    /**
     * Set <p>签署方类型，ORGANIZATION-企业员工，PERSON-个人，ENTERPRISESERVER-企业静默签</p>
     * @param ApproveType <p>签署方类型，ORGANIZATION-企业员工，PERSON-个人，ENTERPRISESERVER-企业静默签</p>
     */
    public void setApproveType(String ApproveType) {
        this.ApproveType = ApproveType;
    }

    /**
     * Get <p>签署方侧用户来源，如WEWORKAPP-企业微信等</p> 
     * @return ApproverSource <p>签署方侧用户来源，如WEWORKAPP-企业微信等</p>
     */
    public String getApproverSource() {
        return this.ApproverSource;
    }

    /**
     * Set <p>签署方侧用户来源，如WEWORKAPP-企业微信等</p>
     * @param ApproverSource <p>签署方侧用户来源，如WEWORKAPP-企业微信等</p>
     */
    public void setApproverSource(String ApproverSource) {
        this.ApproverSource = ApproverSource;
    }

    /**
     * Get <p>客户自定义签署方标识</p> 
     * @return CustomApproverTag <p>客户自定义签署方标识</p>
     */
    public String getCustomApproverTag() {
        return this.CustomApproverTag;
    }

    /**
     * Set <p>客户自定义签署方标识</p>
     * @param CustomApproverTag <p>客户自定义签署方标识</p>
     */
    public void setCustomApproverTag(String CustomApproverTag) {
        this.CustomApproverTag = CustomApproverTag;
    }

    /**
     * Get <p>签署方企业Id</p> 
     * @return OrganizationId <p>签署方企业Id</p>
     */
    public String getOrganizationId() {
        return this.OrganizationId;
    }

    /**
     * Set <p>签署方企业Id</p>
     * @param OrganizationId <p>签署方企业Id</p>
     */
    public void setOrganizationId(String OrganizationId) {
        this.OrganizationId = OrganizationId;
    }

    /**
     * Get <p>签署方企业名称</p> 
     * @return OrganizationName <p>签署方企业名称</p>
     */
    public String getOrganizationName() {
        return this.OrganizationName;
    }

    /**
     * Set <p>签署方企业名称</p>
     * @param OrganizationName <p>签署方企业名称</p>
     */
    public void setOrganizationName(String OrganizationName) {
        this.OrganizationName = OrganizationName;
    }

    /**
     * Get <p>签署参与人在本流程中的编号ID（每个流程不同），可用此ID来定位签署参与人在本流程的签署节点，也可用于后续创建签署链接等操作。</p> 
     * @return SignId <p>签署参与人在本流程中的编号ID（每个流程不同），可用此ID来定位签署参与人在本流程的签署节点，也可用于后续创建签署链接等操作。</p>
     */
    public String getSignId() {
        return this.SignId;
    }

    /**
     * Set <p>签署参与人在本流程中的编号ID（每个流程不同），可用此ID来定位签署参与人在本流程的签署节点，也可用于后续创建签署链接等操作。</p>
     * @param SignId <p>签署参与人在本流程中的编号ID（每个流程不同），可用此ID来定位签署参与人在本流程的签署节点，也可用于后续创建签署链接等操作。</p>
     */
    public void setSignId(String SignId) {
        this.SignId = SignId;
    }

    /**
     * Get <p>自定义签署人角色</p> 
     * @return ApproverRoleName <p>自定义签署人角色</p>
     */
    public String getApproverRoleName() {
        return this.ApproverRoleName;
    }

    /**
     * Set <p>自定义签署人角色</p>
     * @param ApproverRoleName <p>自定义签署人角色</p>
     */
    public void setApproverRoleName(String ApproverRoleName) {
        this.ApproverRoleName = ApproverRoleName;
    }

    /**
     * Get <p>模板配置中的参与方ID,与控件绑定</p> 
     * @return RecipientId <p>模板配置中的参与方ID,与控件绑定</p>
     */
    public String getRecipientId() {
        return this.RecipientId;
    }

    /**
     * Set <p>模板配置中的参与方ID,与控件绑定</p>
     * @param RecipientId <p>模板配置中的参与方ID,与控件绑定</p>
     */
    public void setRecipientId(String RecipientId) {
        this.RecipientId = RecipientId;
    }

    /**
     * Get <p>签署方转交记录列表，标识该签署方是由谁转交而来，按转交时间由远到近进行排序</p> 
     * @return ForwardRecords <p>签署方转交记录列表，标识该签署方是由谁转交而来，按转交时间由远到近进行排序</p>
     */
    public ForwardRecord [] getForwardRecords() {
        return this.ForwardRecords;
    }

    /**
     * Set <p>签署方转交记录列表，标识该签署方是由谁转交而来，按转交时间由远到近进行排序</p>
     * @param ForwardRecords <p>签署方转交记录列表，标识该签署方是由谁转交而来，按转交时间由远到近进行排序</p>
     */
    public void setForwardRecords(ForwardRecord [] ForwardRecords) {
        this.ForwardRecords = ForwardRecords;
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
        if (source.SignId != null) {
            this.SignId = new String(source.SignId);
        }
        if (source.ApproverRoleName != null) {
            this.ApproverRoleName = new String(source.ApproverRoleName);
        }
        if (source.RecipientId != null) {
            this.RecipientId = new String(source.RecipientId);
        }
        if (source.ForwardRecords != null) {
            this.ForwardRecords = new ForwardRecord[source.ForwardRecords.length];
            for (int i = 0; i < source.ForwardRecords.length; i++) {
                this.ForwardRecords[i] = new ForwardRecord(source.ForwardRecords[i]);
            }
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
        this.setParamSimple(map, prefix + "SignId", this.SignId);
        this.setParamSimple(map, prefix + "ApproverRoleName", this.ApproverRoleName);
        this.setParamSimple(map, prefix + "RecipientId", this.RecipientId);
        this.setParamArrayObj(map, prefix + "ForwardRecords.", this.ForwardRecords);

    }
}

