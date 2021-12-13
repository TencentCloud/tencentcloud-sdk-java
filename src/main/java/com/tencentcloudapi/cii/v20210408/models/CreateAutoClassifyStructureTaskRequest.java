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
package com.tencentcloudapi.cii.v20210408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAutoClassifyStructureTaskRequest extends AbstractModel{

    /**
    * 服务类型
Structured 仅结构化
Underwrite 结构化+核保
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * 创建任务时可以上传多个报告，后台生成多个识别子任务，子任务的详细信息
    */
    @SerializedName("TaskInfos")
    @Expose
    private CreateAutoClassifyStructureTaskInfo [] TaskInfos;

    /**
    * 保单号
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
    * 核保触发方式
Auto 自动
Manual 手动
    */
    @SerializedName("TriggerType")
    @Expose
    private String TriggerType;

    /**
    * 险种，如果是体检报告类型，此参数是必填，类型说明如下：
CriticalDiseaseInsurance:重疾险
LifeInsurance：寿险
AccidentInsurance：意外险
    */
    @SerializedName("InsuranceTypes")
    @Expose
    private String [] InsuranceTypes;

    /**
    * 回调地址，接收Post请求传送结果
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
     * Get 服务类型
Structured 仅结构化
Underwrite 结构化+核保 
     * @return ServiceType 服务类型
Structured 仅结构化
Underwrite 结构化+核保
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set 服务类型
Structured 仅结构化
Underwrite 结构化+核保
     * @param ServiceType 服务类型
Structured 仅结构化
Underwrite 结构化+核保
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get 创建任务时可以上传多个报告，后台生成多个识别子任务，子任务的详细信息 
     * @return TaskInfos 创建任务时可以上传多个报告，后台生成多个识别子任务，子任务的详细信息
     */
    public CreateAutoClassifyStructureTaskInfo [] getTaskInfos() {
        return this.TaskInfos;
    }

    /**
     * Set 创建任务时可以上传多个报告，后台生成多个识别子任务，子任务的详细信息
     * @param TaskInfos 创建任务时可以上传多个报告，后台生成多个识别子任务，子任务的详细信息
     */
    public void setTaskInfos(CreateAutoClassifyStructureTaskInfo [] TaskInfos) {
        this.TaskInfos = TaskInfos;
    }

    /**
     * Get 保单号 
     * @return PolicyId 保单号
     */
    public String getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set 保单号
     * @param PolicyId 保单号
     */
    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get 核保触发方式
Auto 自动
Manual 手动 
     * @return TriggerType 核保触发方式
Auto 自动
Manual 手动
     */
    public String getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set 核保触发方式
Auto 自动
Manual 手动
     * @param TriggerType 核保触发方式
Auto 自动
Manual 手动
     */
    public void setTriggerType(String TriggerType) {
        this.TriggerType = TriggerType;
    }

    /**
     * Get 险种，如果是体检报告类型，此参数是必填，类型说明如下：
CriticalDiseaseInsurance:重疾险
LifeInsurance：寿险
AccidentInsurance：意外险 
     * @return InsuranceTypes 险种，如果是体检报告类型，此参数是必填，类型说明如下：
CriticalDiseaseInsurance:重疾险
LifeInsurance：寿险
AccidentInsurance：意外险
     */
    public String [] getInsuranceTypes() {
        return this.InsuranceTypes;
    }

    /**
     * Set 险种，如果是体检报告类型，此参数是必填，类型说明如下：
CriticalDiseaseInsurance:重疾险
LifeInsurance：寿险
AccidentInsurance：意外险
     * @param InsuranceTypes 险种，如果是体检报告类型，此参数是必填，类型说明如下：
CriticalDiseaseInsurance:重疾险
LifeInsurance：寿险
AccidentInsurance：意外险
     */
    public void setInsuranceTypes(String [] InsuranceTypes) {
        this.InsuranceTypes = InsuranceTypes;
    }

    /**
     * Get 回调地址，接收Post请求传送结果 
     * @return CallbackUrl 回调地址，接收Post请求传送结果
     */
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set 回调地址，接收Post请求传送结果
     * @param CallbackUrl 回调地址，接收Post请求传送结果
     */
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    public CreateAutoClassifyStructureTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAutoClassifyStructureTaskRequest(CreateAutoClassifyStructureTaskRequest source) {
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.TaskInfos != null) {
            this.TaskInfos = new CreateAutoClassifyStructureTaskInfo[source.TaskInfos.length];
            for (int i = 0; i < source.TaskInfos.length; i++) {
                this.TaskInfos[i] = new CreateAutoClassifyStructureTaskInfo(source.TaskInfos[i]);
            }
        }
        if (source.PolicyId != null) {
            this.PolicyId = new String(source.PolicyId);
        }
        if (source.TriggerType != null) {
            this.TriggerType = new String(source.TriggerType);
        }
        if (source.InsuranceTypes != null) {
            this.InsuranceTypes = new String[source.InsuranceTypes.length];
            for (int i = 0; i < source.InsuranceTypes.length; i++) {
                this.InsuranceTypes[i] = new String(source.InsuranceTypes[i]);
            }
        }
        if (source.CallbackUrl != null) {
            this.CallbackUrl = new String(source.CallbackUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamArrayObj(map, prefix + "TaskInfos.", this.TaskInfos);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "TriggerType", this.TriggerType);
        this.setParamArraySimple(map, prefix + "InsuranceTypes.", this.InsuranceTypes);
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);

    }
}

