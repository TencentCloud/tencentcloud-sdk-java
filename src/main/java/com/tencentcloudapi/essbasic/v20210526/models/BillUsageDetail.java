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

public class BillUsageDetail extends AbstractModel {

    /**
    * 合同流程ID，为32位字符串。
建议开发者妥善保存此流程ID，以便于顺利进行后续操作。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * 合同经办人名称
如果有多个经办人用分号隔开。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OperatorName")
    @Expose
    private String OperatorName;

    /**
    * 发起方组织机构名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateOrganizationName")
    @Expose
    private String CreateOrganizationName;

    /**
    * 合同流程的名称（可自定义此名称），长度不能超过200，只能由中文、字母、数字和下划线组成。
该名称还将用于合同签署完成后的下载文件名。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FlowName")
    @Expose
    private String FlowName;

    /**
    * 当前合同状态,如下是状态码对应的状态。
0-还没有发起
1-等待签署
2-部分签署 
3-拒签
4-已签署 
5-已过期 
6-已撤销 
7-还没有预发起
8-等待填写
9-部分填写 
10-拒填
11-已解除
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 套餐类型
对应关系如下
CloudEnterprise-企业版合同
SingleSignature-单方签章
CloudProve-签署报告
CloudOnlineSign-腾讯会议在线签约
ChannelWeCard-微工卡
SignFlow-合同套餐
SignFace-签署意愿（人脸识别）
SignPassword-签署意愿（密码）
SignSMS-签署意愿（短信）
PersonalEssAuth-签署人实名（腾讯电子签认证）
PersonalThirdAuth-签署人实名（信任第三方认证）
OrgEssAuth-签署企业实名
FlowNotify-短信通知
AuthService-企业工商信息查询
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QuotaType")
    @Expose
    private String QuotaType;

    /**
    * 合同使用量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UseCount")
    @Expose
    private Long UseCount;

    /**
    * 消耗的时间戳，格式为Unix标准时间戳（秒）。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CostTime")
    @Expose
    private Long CostTime;

    /**
    * 消耗的套餐名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QuotaName")
    @Expose
    private String QuotaName;

    /**
    * 消耗类型
1.扣费 2.撤销返还
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CostType")
    @Expose
    private Long CostType;

    /**
    * 备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get 合同流程ID，为32位字符串。
建议开发者妥善保存此流程ID，以便于顺利进行后续操作。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FlowId 合同流程ID，为32位字符串。
建议开发者妥善保存此流程ID，以便于顺利进行后续操作。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set 合同流程ID，为32位字符串。
建议开发者妥善保存此流程ID，以便于顺利进行后续操作。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FlowId 合同流程ID，为32位字符串。
建议开发者妥善保存此流程ID，以便于顺利进行后续操作。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get 合同经办人名称
如果有多个经办人用分号隔开。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OperatorName 合同经办人名称
如果有多个经办人用分号隔开。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOperatorName() {
        return this.OperatorName;
    }

    /**
     * Set 合同经办人名称
如果有多个经办人用分号隔开。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OperatorName 合同经办人名称
如果有多个经办人用分号隔开。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperatorName(String OperatorName) {
        this.OperatorName = OperatorName;
    }

    /**
     * Get 发起方组织机构名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateOrganizationName 发起方组织机构名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateOrganizationName() {
        return this.CreateOrganizationName;
    }

    /**
     * Set 发起方组织机构名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateOrganizationName 发起方组织机构名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateOrganizationName(String CreateOrganizationName) {
        this.CreateOrganizationName = CreateOrganizationName;
    }

    /**
     * Get 合同流程的名称（可自定义此名称），长度不能超过200，只能由中文、字母、数字和下划线组成。
该名称还将用于合同签署完成后的下载文件名。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FlowName 合同流程的名称（可自定义此名称），长度不能超过200，只能由中文、字母、数字和下划线组成。
该名称还将用于合同签署完成后的下载文件名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFlowName() {
        return this.FlowName;
    }

    /**
     * Set 合同流程的名称（可自定义此名称），长度不能超过200，只能由中文、字母、数字和下划线组成。
该名称还将用于合同签署完成后的下载文件名。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FlowName 合同流程的名称（可自定义此名称），长度不能超过200，只能由中文、字母、数字和下划线组成。
该名称还将用于合同签署完成后的下载文件名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFlowName(String FlowName) {
        this.FlowName = FlowName;
    }

    /**
     * Get 当前合同状态,如下是状态码对应的状态。
0-还没有发起
1-等待签署
2-部分签署 
3-拒签
4-已签署 
5-已过期 
6-已撤销 
7-还没有预发起
8-等待填写
9-部分填写 
10-拒填
11-已解除
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 当前合同状态,如下是状态码对应的状态。
0-还没有发起
1-等待签署
2-部分签署 
3-拒签
4-已签署 
5-已过期 
6-已撤销 
7-还没有预发起
8-等待填写
9-部分填写 
10-拒填
11-已解除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 当前合同状态,如下是状态码对应的状态。
0-还没有发起
1-等待签署
2-部分签署 
3-拒签
4-已签署 
5-已过期 
6-已撤销 
7-还没有预发起
8-等待填写
9-部分填写 
10-拒填
11-已解除
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 当前合同状态,如下是状态码对应的状态。
0-还没有发起
1-等待签署
2-部分签署 
3-拒签
4-已签署 
5-已过期 
6-已撤销 
7-还没有预发起
8-等待填写
9-部分填写 
10-拒填
11-已解除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 套餐类型
对应关系如下
CloudEnterprise-企业版合同
SingleSignature-单方签章
CloudProve-签署报告
CloudOnlineSign-腾讯会议在线签约
ChannelWeCard-微工卡
SignFlow-合同套餐
SignFace-签署意愿（人脸识别）
SignPassword-签署意愿（密码）
SignSMS-签署意愿（短信）
PersonalEssAuth-签署人实名（腾讯电子签认证）
PersonalThirdAuth-签署人实名（信任第三方认证）
OrgEssAuth-签署企业实名
FlowNotify-短信通知
AuthService-企业工商信息查询
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QuotaType 套餐类型
对应关系如下
CloudEnterprise-企业版合同
SingleSignature-单方签章
CloudProve-签署报告
CloudOnlineSign-腾讯会议在线签约
ChannelWeCard-微工卡
SignFlow-合同套餐
SignFace-签署意愿（人脸识别）
SignPassword-签署意愿（密码）
SignSMS-签署意愿（短信）
PersonalEssAuth-签署人实名（腾讯电子签认证）
PersonalThirdAuth-签署人实名（信任第三方认证）
OrgEssAuth-签署企业实名
FlowNotify-短信通知
AuthService-企业工商信息查询
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getQuotaType() {
        return this.QuotaType;
    }

    /**
     * Set 套餐类型
对应关系如下
CloudEnterprise-企业版合同
SingleSignature-单方签章
CloudProve-签署报告
CloudOnlineSign-腾讯会议在线签约
ChannelWeCard-微工卡
SignFlow-合同套餐
SignFace-签署意愿（人脸识别）
SignPassword-签署意愿（密码）
SignSMS-签署意愿（短信）
PersonalEssAuth-签署人实名（腾讯电子签认证）
PersonalThirdAuth-签署人实名（信任第三方认证）
OrgEssAuth-签署企业实名
FlowNotify-短信通知
AuthService-企业工商信息查询
注意：此字段可能返回 null，表示取不到有效值。
     * @param QuotaType 套餐类型
对应关系如下
CloudEnterprise-企业版合同
SingleSignature-单方签章
CloudProve-签署报告
CloudOnlineSign-腾讯会议在线签约
ChannelWeCard-微工卡
SignFlow-合同套餐
SignFace-签署意愿（人脸识别）
SignPassword-签署意愿（密码）
SignSMS-签署意愿（短信）
PersonalEssAuth-签署人实名（腾讯电子签认证）
PersonalThirdAuth-签署人实名（信任第三方认证）
OrgEssAuth-签署企业实名
FlowNotify-短信通知
AuthService-企业工商信息查询
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQuotaType(String QuotaType) {
        this.QuotaType = QuotaType;
    }

    /**
     * Get 合同使用量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UseCount 合同使用量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUseCount() {
        return this.UseCount;
    }

    /**
     * Set 合同使用量
注意：此字段可能返回 null，表示取不到有效值。
     * @param UseCount 合同使用量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUseCount(Long UseCount) {
        this.UseCount = UseCount;
    }

    /**
     * Get 消耗的时间戳，格式为Unix标准时间戳（秒）。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CostTime 消耗的时间戳，格式为Unix标准时间戳（秒）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCostTime() {
        return this.CostTime;
    }

    /**
     * Set 消耗的时间戳，格式为Unix标准时间戳（秒）。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CostTime 消耗的时间戳，格式为Unix标准时间戳（秒）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCostTime(Long CostTime) {
        this.CostTime = CostTime;
    }

    /**
     * Get 消耗的套餐名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QuotaName 消耗的套餐名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getQuotaName() {
        return this.QuotaName;
    }

    /**
     * Set 消耗的套餐名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param QuotaName 消耗的套餐名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQuotaName(String QuotaName) {
        this.QuotaName = QuotaName;
    }

    /**
     * Get 消耗类型
1.扣费 2.撤销返还
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CostType 消耗类型
1.扣费 2.撤销返还
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCostType() {
        return this.CostType;
    }

    /**
     * Set 消耗类型
1.扣费 2.撤销返还
注意：此字段可能返回 null，表示取不到有效值。
     * @param CostType 消耗类型
1.扣费 2.撤销返还
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCostType(Long CostType) {
        this.CostType = CostType;
    }

    /**
     * Get 备注
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark 备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark 备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public BillUsageDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BillUsageDetail(BillUsageDetail source) {
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
        if (source.OperatorName != null) {
            this.OperatorName = new String(source.OperatorName);
        }
        if (source.CreateOrganizationName != null) {
            this.CreateOrganizationName = new String(source.CreateOrganizationName);
        }
        if (source.FlowName != null) {
            this.FlowName = new String(source.FlowName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.QuotaType != null) {
            this.QuotaType = new String(source.QuotaType);
        }
        if (source.UseCount != null) {
            this.UseCount = new Long(source.UseCount);
        }
        if (source.CostTime != null) {
            this.CostTime = new Long(source.CostTime);
        }
        if (source.QuotaName != null) {
            this.QuotaName = new String(source.QuotaName);
        }
        if (source.CostType != null) {
            this.CostType = new Long(source.CostType);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamSimple(map, prefix + "OperatorName", this.OperatorName);
        this.setParamSimple(map, prefix + "CreateOrganizationName", this.CreateOrganizationName);
        this.setParamSimple(map, prefix + "FlowName", this.FlowName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "QuotaType", this.QuotaType);
        this.setParamSimple(map, prefix + "UseCount", this.UseCount);
        this.setParamSimple(map, prefix + "CostTime", this.CostTime);
        this.setParamSimple(map, prefix + "QuotaName", this.QuotaName);
        this.setParamSimple(map, prefix + "CostType", this.CostType);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

