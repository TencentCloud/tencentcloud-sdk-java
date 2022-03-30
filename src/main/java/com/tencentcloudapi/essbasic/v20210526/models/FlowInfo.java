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

public class FlowInfo extends AbstractModel{

    /**
    * 合同名字
    */
    @SerializedName("FlowName")
    @Expose
    private String FlowName;

    /**
    * 签署截止时间戳，超过有效签署时间则该签署流程失败，默认一年
    */
    @SerializedName("Deadline")
    @Expose
    private Long Deadline;

    /**
    * 模板ID
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * 合同类型：
1. “劳务”
2. “销售”
3. “租赁”
4. “其他”
    */
    @SerializedName("FlowType")
    @Expose
    private String FlowType;

    /**
    * 回调地址
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
    * 多个签署人信息，渠道侧目前不支持超过5个签署方信息
    */
    @SerializedName("FlowApprovers")
    @Expose
    private FlowApproverInfo [] FlowApprovers;

    /**
    * 表单K-V对列表
    */
    @SerializedName("FormFields")
    @Expose
    private FormField [] FormFields;

    /**
    * 合同描述
    */
    @SerializedName("FlowDescription")
    @Expose
    private String FlowDescription;

    /**
    * 渠道的业务信息，限制1024字符
    */
    @SerializedName("CustomerData")
    @Expose
    private String CustomerData;

    /**
    * 被抄送人的信息列表，抄送功能暂不开放
    */
    @SerializedName("CcInfos")
    @Expose
    private CcInfo [] CcInfos;

    /**
     * Get 合同名字 
     * @return FlowName 合同名字
     */
    public String getFlowName() {
        return this.FlowName;
    }

    /**
     * Set 合同名字
     * @param FlowName 合同名字
     */
    public void setFlowName(String FlowName) {
        this.FlowName = FlowName;
    }

    /**
     * Get 签署截止时间戳，超过有效签署时间则该签署流程失败，默认一年 
     * @return Deadline 签署截止时间戳，超过有效签署时间则该签署流程失败，默认一年
     */
    public Long getDeadline() {
        return this.Deadline;
    }

    /**
     * Set 签署截止时间戳，超过有效签署时间则该签署流程失败，默认一年
     * @param Deadline 签署截止时间戳，超过有效签署时间则该签署流程失败，默认一年
     */
    public void setDeadline(Long Deadline) {
        this.Deadline = Deadline;
    }

    /**
     * Get 模板ID 
     * @return TemplateId 模板ID
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 模板ID
     * @param TemplateId 模板ID
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 合同类型：
1. “劳务”
2. “销售”
3. “租赁”
4. “其他” 
     * @return FlowType 合同类型：
1. “劳务”
2. “销售”
3. “租赁”
4. “其他”
     */
    public String getFlowType() {
        return this.FlowType;
    }

    /**
     * Set 合同类型：
1. “劳务”
2. “销售”
3. “租赁”
4. “其他”
     * @param FlowType 合同类型：
1. “劳务”
2. “销售”
3. “租赁”
4. “其他”
     */
    public void setFlowType(String FlowType) {
        this.FlowType = FlowType;
    }

    /**
     * Get 回调地址 
     * @return CallbackUrl 回调地址
     */
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set 回调地址
     * @param CallbackUrl 回调地址
     */
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    /**
     * Get 多个签署人信息，渠道侧目前不支持超过5个签署方信息 
     * @return FlowApprovers 多个签署人信息，渠道侧目前不支持超过5个签署方信息
     */
    public FlowApproverInfo [] getFlowApprovers() {
        return this.FlowApprovers;
    }

    /**
     * Set 多个签署人信息，渠道侧目前不支持超过5个签署方信息
     * @param FlowApprovers 多个签署人信息，渠道侧目前不支持超过5个签署方信息
     */
    public void setFlowApprovers(FlowApproverInfo [] FlowApprovers) {
        this.FlowApprovers = FlowApprovers;
    }

    /**
     * Get 表单K-V对列表 
     * @return FormFields 表单K-V对列表
     */
    public FormField [] getFormFields() {
        return this.FormFields;
    }

    /**
     * Set 表单K-V对列表
     * @param FormFields 表单K-V对列表
     */
    public void setFormFields(FormField [] FormFields) {
        this.FormFields = FormFields;
    }

    /**
     * Get 合同描述 
     * @return FlowDescription 合同描述
     */
    public String getFlowDescription() {
        return this.FlowDescription;
    }

    /**
     * Set 合同描述
     * @param FlowDescription 合同描述
     */
    public void setFlowDescription(String FlowDescription) {
        this.FlowDescription = FlowDescription;
    }

    /**
     * Get 渠道的业务信息，限制1024字符 
     * @return CustomerData 渠道的业务信息，限制1024字符
     */
    public String getCustomerData() {
        return this.CustomerData;
    }

    /**
     * Set 渠道的业务信息，限制1024字符
     * @param CustomerData 渠道的业务信息，限制1024字符
     */
    public void setCustomerData(String CustomerData) {
        this.CustomerData = CustomerData;
    }

    /**
     * Get 被抄送人的信息列表，抄送功能暂不开放 
     * @return CcInfos 被抄送人的信息列表，抄送功能暂不开放
     */
    public CcInfo [] getCcInfos() {
        return this.CcInfos;
    }

    /**
     * Set 被抄送人的信息列表，抄送功能暂不开放
     * @param CcInfos 被抄送人的信息列表，抄送功能暂不开放
     */
    public void setCcInfos(CcInfo [] CcInfos) {
        this.CcInfos = CcInfos;
    }

    public FlowInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlowInfo(FlowInfo source) {
        if (source.FlowName != null) {
            this.FlowName = new String(source.FlowName);
        }
        if (source.Deadline != null) {
            this.Deadline = new Long(source.Deadline);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.FlowType != null) {
            this.FlowType = new String(source.FlowType);
        }
        if (source.CallbackUrl != null) {
            this.CallbackUrl = new String(source.CallbackUrl);
        }
        if (source.FlowApprovers != null) {
            this.FlowApprovers = new FlowApproverInfo[source.FlowApprovers.length];
            for (int i = 0; i < source.FlowApprovers.length; i++) {
                this.FlowApprovers[i] = new FlowApproverInfo(source.FlowApprovers[i]);
            }
        }
        if (source.FormFields != null) {
            this.FormFields = new FormField[source.FormFields.length];
            for (int i = 0; i < source.FormFields.length; i++) {
                this.FormFields[i] = new FormField(source.FormFields[i]);
            }
        }
        if (source.FlowDescription != null) {
            this.FlowDescription = new String(source.FlowDescription);
        }
        if (source.CustomerData != null) {
            this.CustomerData = new String(source.CustomerData);
        }
        if (source.CcInfos != null) {
            this.CcInfos = new CcInfo[source.CcInfos.length];
            for (int i = 0; i < source.CcInfos.length; i++) {
                this.CcInfos[i] = new CcInfo(source.CcInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowName", this.FlowName);
        this.setParamSimple(map, prefix + "Deadline", this.Deadline);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "FlowType", this.FlowType);
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);
        this.setParamArrayObj(map, prefix + "FlowApprovers.", this.FlowApprovers);
        this.setParamArrayObj(map, prefix + "FormFields.", this.FormFields);
        this.setParamSimple(map, prefix + "FlowDescription", this.FlowDescription);
        this.setParamSimple(map, prefix + "CustomerData", this.CustomerData);
        this.setParamArrayObj(map, prefix + "CcInfos.", this.CcInfos);

    }
}

