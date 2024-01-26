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

public class ChannelBillUsageDetail extends AbstractModel {

    /**
    * 合同流程ID，为32位字符串。
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * 合同经办人名称
如果有多个经办人用分号隔开。
    */
    @SerializedName("OperatorName")
    @Expose
    private String OperatorName;

    /**
    * 发起方组织机构名称
    */
    @SerializedName("CreateOrganizationName")
    @Expose
    private String CreateOrganizationName;

    /**
    * 合同流程的名称。
    */
    @SerializedName("FlowName")
    @Expose
    private String FlowName;

    /**
    * 合同流程当前的签署状态, 会存在下列的状态值
<ul>
<li>**INIT**: 合同创建</li>
<li>**PART**: 合同签署中(至少有一个签署方已经签署)</li>
<li>**REJECT**: 合同拒签</li>
<li>**ALL**: 合同签署完成</li>
<li>**DEADLINE**: 合同流签(合同过期)</li>
<li>**CANCEL**: 合同撤回</li>
<li>**RELIEVED**: 解除协议（已解除）</li>
<li>**WILLEXPIRE**: 合同即将过期</li>
<li>**EXCEPTION**: 合同异常</li>
</ul>
    */
    @SerializedName("FlowStatus")
    @Expose
    private String FlowStatus;

    /**
    * 查询的套餐类型
对应关系如下:
<ul>
<li>**CloudEnterprise**: 企业版合同</li>
<li>**SingleSignature**: 单方签章</li>
<li>**CloudProve**: 签署报告</li>
<li>**CloudOnlineSign**: 腾讯会议在线签约</li>
<li>**ChannelWeCard**: 微工卡</li>
<li>**SignFlow**: 合同套餐</li>
<li>**SignFace**: 签署意愿（人脸识别）</li>
<li>**SignPassword**: 签署意愿（密码）</li>
<li>**SignSMS**: 签署意愿（短信）</li>
<li>**PersonalEssAuth**: 签署人实名（腾讯电子签认证）</li>
<li>**PersonalThirdAuth**: 签署人实名（信任第三方认证）</li>
<li>**OrgEssAuth**: 签署企业实名</li>
<li>**FlowNotify**: 短信通知</li>
<li>**AuthService**: 企业工商信息查询</li>
<li>**NoAuthSign**: 形式签</li>
</ul>
    */
    @SerializedName("QuotaType")
    @Expose
    private String QuotaType;

    /**
    * 合同使用量
注: `如果消耗类型是撤销返还，此值为负值代表返还的合同数量`
    */
    @SerializedName("UseCount")
    @Expose
    private Long UseCount;

    /**
    * 消耗的时间戳，格式为Unix标准时间戳（秒）。
    */
    @SerializedName("CostTime")
    @Expose
    private Long CostTime;

    /**
    * 消耗的套餐名称
    */
    @SerializedName("QuotaName")
    @Expose
    private String QuotaName;

    /**
    * 消耗类型
**1**.扣费 
**2**.撤销返还
    */
    @SerializedName("CostType")
    @Expose
    private Long CostType;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get 合同流程ID，为32位字符串。 
     * @return FlowId 合同流程ID，为32位字符串。
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set 合同流程ID，为32位字符串。
     * @param FlowId 合同流程ID，为32位字符串。
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
    }

    /**
     * Get 合同经办人名称
如果有多个经办人用分号隔开。 
     * @return OperatorName 合同经办人名称
如果有多个经办人用分号隔开。
     */
    public String getOperatorName() {
        return this.OperatorName;
    }

    /**
     * Set 合同经办人名称
如果有多个经办人用分号隔开。
     * @param OperatorName 合同经办人名称
如果有多个经办人用分号隔开。
     */
    public void setOperatorName(String OperatorName) {
        this.OperatorName = OperatorName;
    }

    /**
     * Get 发起方组织机构名称 
     * @return CreateOrganizationName 发起方组织机构名称
     */
    public String getCreateOrganizationName() {
        return this.CreateOrganizationName;
    }

    /**
     * Set 发起方组织机构名称
     * @param CreateOrganizationName 发起方组织机构名称
     */
    public void setCreateOrganizationName(String CreateOrganizationName) {
        this.CreateOrganizationName = CreateOrganizationName;
    }

    /**
     * Get 合同流程的名称。 
     * @return FlowName 合同流程的名称。
     */
    public String getFlowName() {
        return this.FlowName;
    }

    /**
     * Set 合同流程的名称。
     * @param FlowName 合同流程的名称。
     */
    public void setFlowName(String FlowName) {
        this.FlowName = FlowName;
    }

    /**
     * Get 合同流程当前的签署状态, 会存在下列的状态值
<ul>
<li>**INIT**: 合同创建</li>
<li>**PART**: 合同签署中(至少有一个签署方已经签署)</li>
<li>**REJECT**: 合同拒签</li>
<li>**ALL**: 合同签署完成</li>
<li>**DEADLINE**: 合同流签(合同过期)</li>
<li>**CANCEL**: 合同撤回</li>
<li>**RELIEVED**: 解除协议（已解除）</li>
<li>**WILLEXPIRE**: 合同即将过期</li>
<li>**EXCEPTION**: 合同异常</li>
</ul> 
     * @return FlowStatus 合同流程当前的签署状态, 会存在下列的状态值
<ul>
<li>**INIT**: 合同创建</li>
<li>**PART**: 合同签署中(至少有一个签署方已经签署)</li>
<li>**REJECT**: 合同拒签</li>
<li>**ALL**: 合同签署完成</li>
<li>**DEADLINE**: 合同流签(合同过期)</li>
<li>**CANCEL**: 合同撤回</li>
<li>**RELIEVED**: 解除协议（已解除）</li>
<li>**WILLEXPIRE**: 合同即将过期</li>
<li>**EXCEPTION**: 合同异常</li>
</ul>
     */
    public String getFlowStatus() {
        return this.FlowStatus;
    }

    /**
     * Set 合同流程当前的签署状态, 会存在下列的状态值
<ul>
<li>**INIT**: 合同创建</li>
<li>**PART**: 合同签署中(至少有一个签署方已经签署)</li>
<li>**REJECT**: 合同拒签</li>
<li>**ALL**: 合同签署完成</li>
<li>**DEADLINE**: 合同流签(合同过期)</li>
<li>**CANCEL**: 合同撤回</li>
<li>**RELIEVED**: 解除协议（已解除）</li>
<li>**WILLEXPIRE**: 合同即将过期</li>
<li>**EXCEPTION**: 合同异常</li>
</ul>
     * @param FlowStatus 合同流程当前的签署状态, 会存在下列的状态值
<ul>
<li>**INIT**: 合同创建</li>
<li>**PART**: 合同签署中(至少有一个签署方已经签署)</li>
<li>**REJECT**: 合同拒签</li>
<li>**ALL**: 合同签署完成</li>
<li>**DEADLINE**: 合同流签(合同过期)</li>
<li>**CANCEL**: 合同撤回</li>
<li>**RELIEVED**: 解除协议（已解除）</li>
<li>**WILLEXPIRE**: 合同即将过期</li>
<li>**EXCEPTION**: 合同异常</li>
</ul>
     */
    public void setFlowStatus(String FlowStatus) {
        this.FlowStatus = FlowStatus;
    }

    /**
     * Get 查询的套餐类型
对应关系如下:
<ul>
<li>**CloudEnterprise**: 企业版合同</li>
<li>**SingleSignature**: 单方签章</li>
<li>**CloudProve**: 签署报告</li>
<li>**CloudOnlineSign**: 腾讯会议在线签约</li>
<li>**ChannelWeCard**: 微工卡</li>
<li>**SignFlow**: 合同套餐</li>
<li>**SignFace**: 签署意愿（人脸识别）</li>
<li>**SignPassword**: 签署意愿（密码）</li>
<li>**SignSMS**: 签署意愿（短信）</li>
<li>**PersonalEssAuth**: 签署人实名（腾讯电子签认证）</li>
<li>**PersonalThirdAuth**: 签署人实名（信任第三方认证）</li>
<li>**OrgEssAuth**: 签署企业实名</li>
<li>**FlowNotify**: 短信通知</li>
<li>**AuthService**: 企业工商信息查询</li>
<li>**NoAuthSign**: 形式签</li>
</ul> 
     * @return QuotaType 查询的套餐类型
对应关系如下:
<ul>
<li>**CloudEnterprise**: 企业版合同</li>
<li>**SingleSignature**: 单方签章</li>
<li>**CloudProve**: 签署报告</li>
<li>**CloudOnlineSign**: 腾讯会议在线签约</li>
<li>**ChannelWeCard**: 微工卡</li>
<li>**SignFlow**: 合同套餐</li>
<li>**SignFace**: 签署意愿（人脸识别）</li>
<li>**SignPassword**: 签署意愿（密码）</li>
<li>**SignSMS**: 签署意愿（短信）</li>
<li>**PersonalEssAuth**: 签署人实名（腾讯电子签认证）</li>
<li>**PersonalThirdAuth**: 签署人实名（信任第三方认证）</li>
<li>**OrgEssAuth**: 签署企业实名</li>
<li>**FlowNotify**: 短信通知</li>
<li>**AuthService**: 企业工商信息查询</li>
<li>**NoAuthSign**: 形式签</li>
</ul>
     */
    public String getQuotaType() {
        return this.QuotaType;
    }

    /**
     * Set 查询的套餐类型
对应关系如下:
<ul>
<li>**CloudEnterprise**: 企业版合同</li>
<li>**SingleSignature**: 单方签章</li>
<li>**CloudProve**: 签署报告</li>
<li>**CloudOnlineSign**: 腾讯会议在线签约</li>
<li>**ChannelWeCard**: 微工卡</li>
<li>**SignFlow**: 合同套餐</li>
<li>**SignFace**: 签署意愿（人脸识别）</li>
<li>**SignPassword**: 签署意愿（密码）</li>
<li>**SignSMS**: 签署意愿（短信）</li>
<li>**PersonalEssAuth**: 签署人实名（腾讯电子签认证）</li>
<li>**PersonalThirdAuth**: 签署人实名（信任第三方认证）</li>
<li>**OrgEssAuth**: 签署企业实名</li>
<li>**FlowNotify**: 短信通知</li>
<li>**AuthService**: 企业工商信息查询</li>
<li>**NoAuthSign**: 形式签</li>
</ul>
     * @param QuotaType 查询的套餐类型
对应关系如下:
<ul>
<li>**CloudEnterprise**: 企业版合同</li>
<li>**SingleSignature**: 单方签章</li>
<li>**CloudProve**: 签署报告</li>
<li>**CloudOnlineSign**: 腾讯会议在线签约</li>
<li>**ChannelWeCard**: 微工卡</li>
<li>**SignFlow**: 合同套餐</li>
<li>**SignFace**: 签署意愿（人脸识别）</li>
<li>**SignPassword**: 签署意愿（密码）</li>
<li>**SignSMS**: 签署意愿（短信）</li>
<li>**PersonalEssAuth**: 签署人实名（腾讯电子签认证）</li>
<li>**PersonalThirdAuth**: 签署人实名（信任第三方认证）</li>
<li>**OrgEssAuth**: 签署企业实名</li>
<li>**FlowNotify**: 短信通知</li>
<li>**AuthService**: 企业工商信息查询</li>
<li>**NoAuthSign**: 形式签</li>
</ul>
     */
    public void setQuotaType(String QuotaType) {
        this.QuotaType = QuotaType;
    }

    /**
     * Get 合同使用量
注: `如果消耗类型是撤销返还，此值为负值代表返还的合同数量` 
     * @return UseCount 合同使用量
注: `如果消耗类型是撤销返还，此值为负值代表返还的合同数量`
     */
    public Long getUseCount() {
        return this.UseCount;
    }

    /**
     * Set 合同使用量
注: `如果消耗类型是撤销返还，此值为负值代表返还的合同数量`
     * @param UseCount 合同使用量
注: `如果消耗类型是撤销返还，此值为负值代表返还的合同数量`
     */
    public void setUseCount(Long UseCount) {
        this.UseCount = UseCount;
    }

    /**
     * Get 消耗的时间戳，格式为Unix标准时间戳（秒）。 
     * @return CostTime 消耗的时间戳，格式为Unix标准时间戳（秒）。
     */
    public Long getCostTime() {
        return this.CostTime;
    }

    /**
     * Set 消耗的时间戳，格式为Unix标准时间戳（秒）。
     * @param CostTime 消耗的时间戳，格式为Unix标准时间戳（秒）。
     */
    public void setCostTime(Long CostTime) {
        this.CostTime = CostTime;
    }

    /**
     * Get 消耗的套餐名称 
     * @return QuotaName 消耗的套餐名称
     */
    public String getQuotaName() {
        return this.QuotaName;
    }

    /**
     * Set 消耗的套餐名称
     * @param QuotaName 消耗的套餐名称
     */
    public void setQuotaName(String QuotaName) {
        this.QuotaName = QuotaName;
    }

    /**
     * Get 消耗类型
**1**.扣费 
**2**.撤销返还 
     * @return CostType 消耗类型
**1**.扣费 
**2**.撤销返还
     */
    public Long getCostType() {
        return this.CostType;
    }

    /**
     * Set 消耗类型
**1**.扣费 
**2**.撤销返还
     * @param CostType 消耗类型
**1**.扣费 
**2**.撤销返还
     */
    public void setCostType(Long CostType) {
        this.CostType = CostType;
    }

    /**
     * Get 备注 
     * @return Remark 备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
     * @param Remark 备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public ChannelBillUsageDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChannelBillUsageDetail(ChannelBillUsageDetail source) {
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
        if (source.FlowStatus != null) {
            this.FlowStatus = new String(source.FlowStatus);
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
        this.setParamSimple(map, prefix + "FlowStatus", this.FlowStatus);
        this.setParamSimple(map, prefix + "QuotaType", this.QuotaType);
        this.setParamSimple(map, prefix + "UseCount", this.UseCount);
        this.setParamSimple(map, prefix + "CostTime", this.CostTime);
        this.setParamSimple(map, prefix + "QuotaName", this.QuotaName);
        this.setParamSimple(map, prefix + "CostType", this.CostType);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

