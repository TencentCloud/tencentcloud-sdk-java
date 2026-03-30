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

public class CreateDraftContractByPromptsTaskRequest extends AbstractModel {

    /**
    * 执行本接口操作的员工信息。 注: 在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 起草要求
    */
    @SerializedName("Requirement")
    @Expose
    private String Requirement;

    /**
    * 参考模板文件资源id（PDF/Word格式）
    */
    @SerializedName("ReferenceTemplateId")
    @Expose
    private String ReferenceTemplateId;

    /**
    * 相关规定文件资源id列表（PDF/Word格式）
    */
    @SerializedName("RequirementFileIds")
    @Expose
    private String [] RequirementFileIds;

    /**
    * 起草合同的语言要求（zh，en）默认zh
    */
    @SerializedName("ContractLanguage")
    @Expose
    private String ContractLanguage;

    /**
     * Get 执行本接口操作的员工信息。 注: 在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。 
     * @return Operator 执行本接口操作的员工信息。 注: 在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 执行本接口操作的员工信息。 注: 在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。
     * @param Operator 执行本接口操作的员工信息。 注: 在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 起草要求 
     * @return Requirement 起草要求
     */
    public String getRequirement() {
        return this.Requirement;
    }

    /**
     * Set 起草要求
     * @param Requirement 起草要求
     */
    public void setRequirement(String Requirement) {
        this.Requirement = Requirement;
    }

    /**
     * Get 参考模板文件资源id（PDF/Word格式） 
     * @return ReferenceTemplateId 参考模板文件资源id（PDF/Word格式）
     */
    public String getReferenceTemplateId() {
        return this.ReferenceTemplateId;
    }

    /**
     * Set 参考模板文件资源id（PDF/Word格式）
     * @param ReferenceTemplateId 参考模板文件资源id（PDF/Word格式）
     */
    public void setReferenceTemplateId(String ReferenceTemplateId) {
        this.ReferenceTemplateId = ReferenceTemplateId;
    }

    /**
     * Get 相关规定文件资源id列表（PDF/Word格式） 
     * @return RequirementFileIds 相关规定文件资源id列表（PDF/Word格式）
     */
    public String [] getRequirementFileIds() {
        return this.RequirementFileIds;
    }

    /**
     * Set 相关规定文件资源id列表（PDF/Word格式）
     * @param RequirementFileIds 相关规定文件资源id列表（PDF/Word格式）
     */
    public void setRequirementFileIds(String [] RequirementFileIds) {
        this.RequirementFileIds = RequirementFileIds;
    }

    /**
     * Get 起草合同的语言要求（zh，en）默认zh 
     * @return ContractLanguage 起草合同的语言要求（zh，en）默认zh
     */
    public String getContractLanguage() {
        return this.ContractLanguage;
    }

    /**
     * Set 起草合同的语言要求（zh，en）默认zh
     * @param ContractLanguage 起草合同的语言要求（zh，en）默认zh
     */
    public void setContractLanguage(String ContractLanguage) {
        this.ContractLanguage = ContractLanguage;
    }

    public CreateDraftContractByPromptsTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDraftContractByPromptsTaskRequest(CreateDraftContractByPromptsTaskRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.Requirement != null) {
            this.Requirement = new String(source.Requirement);
        }
        if (source.ReferenceTemplateId != null) {
            this.ReferenceTemplateId = new String(source.ReferenceTemplateId);
        }
        if (source.RequirementFileIds != null) {
            this.RequirementFileIds = new String[source.RequirementFileIds.length];
            for (int i = 0; i < source.RequirementFileIds.length; i++) {
                this.RequirementFileIds[i] = new String(source.RequirementFileIds[i]);
            }
        }
        if (source.ContractLanguage != null) {
            this.ContractLanguage = new String(source.ContractLanguage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "Requirement", this.Requirement);
        this.setParamSimple(map, prefix + "ReferenceTemplateId", this.ReferenceTemplateId);
        this.setParamArraySimple(map, prefix + "RequirementFileIds.", this.RequirementFileIds);
        this.setParamSimple(map, prefix + "ContractLanguage", this.ContractLanguage);

    }
}

