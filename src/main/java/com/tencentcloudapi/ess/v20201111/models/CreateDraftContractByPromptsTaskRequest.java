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
    * <p>执行本接口操作的员工信息。 注: 在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</p>
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * <p>起草要求，范围要求 5-1000 字</p>
    */
    @SerializedName("Requirement")
    @Expose
    private String Requirement;

    /**
    * <p>参考模板文件资源id（PDF/Word格式），大小不超过1M，通过<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/UploadFiles">上传文件</a>接口来获取。</p>
    */
    @SerializedName("ReferenceTemplateId")
    @Expose
    private String ReferenceTemplateId;

    /**
    * <p>相关规定文件资源id列表（PDF/Word格式），最多3个文件，每个大小不超过1M，通过<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/UploadFiles">上传文件</a>接口来获取。</p>
    */
    @SerializedName("RequirementFileIds")
    @Expose
    private String [] RequirementFileIds;

    /**
    * <p>起草合同的语言要求（zh，en）默认zh</p>
    */
    @SerializedName("ContractLanguage")
    @Expose
    private String ContractLanguage;

    /**
    * <p>审查任务id，仅支持传入1个，通过<a href="https://qian.tencent.com/developers/companyApis/%E5%90%88%E5%90%8C%E6%99%BA%E8%83%BD%E7%9B%B8%E5%85%B3%E6%8E%A5%E5%8F%A3/CreateBatchContractReviewTask/">批量创建合同审查任务</a>接口来获取。</p>
    */
    @SerializedName("ReviewTaskId")
    @Expose
    private String ReviewTaskId;

    /**
     * Get <p>执行本接口操作的员工信息。 注: 在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</p> 
     * @return Operator <p>执行本接口操作的员工信息。 注: 在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</p>
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set <p>执行本接口操作的员工信息。 注: 在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</p>
     * @param Operator <p>执行本接口操作的员工信息。 注: 在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</p>
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get <p>起草要求，范围要求 5-1000 字</p> 
     * @return Requirement <p>起草要求，范围要求 5-1000 字</p>
     */
    public String getRequirement() {
        return this.Requirement;
    }

    /**
     * Set <p>起草要求，范围要求 5-1000 字</p>
     * @param Requirement <p>起草要求，范围要求 5-1000 字</p>
     */
    public void setRequirement(String Requirement) {
        this.Requirement = Requirement;
    }

    /**
     * Get <p>参考模板文件资源id（PDF/Word格式），大小不超过1M，通过<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/UploadFiles">上传文件</a>接口来获取。</p> 
     * @return ReferenceTemplateId <p>参考模板文件资源id（PDF/Word格式），大小不超过1M，通过<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/UploadFiles">上传文件</a>接口来获取。</p>
     */
    public String getReferenceTemplateId() {
        return this.ReferenceTemplateId;
    }

    /**
     * Set <p>参考模板文件资源id（PDF/Word格式），大小不超过1M，通过<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/UploadFiles">上传文件</a>接口来获取。</p>
     * @param ReferenceTemplateId <p>参考模板文件资源id（PDF/Word格式），大小不超过1M，通过<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/UploadFiles">上传文件</a>接口来获取。</p>
     */
    public void setReferenceTemplateId(String ReferenceTemplateId) {
        this.ReferenceTemplateId = ReferenceTemplateId;
    }

    /**
     * Get <p>相关规定文件资源id列表（PDF/Word格式），最多3个文件，每个大小不超过1M，通过<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/UploadFiles">上传文件</a>接口来获取。</p> 
     * @return RequirementFileIds <p>相关规定文件资源id列表（PDF/Word格式），最多3个文件，每个大小不超过1M，通过<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/UploadFiles">上传文件</a>接口来获取。</p>
     */
    public String [] getRequirementFileIds() {
        return this.RequirementFileIds;
    }

    /**
     * Set <p>相关规定文件资源id列表（PDF/Word格式），最多3个文件，每个大小不超过1M，通过<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/UploadFiles">上传文件</a>接口来获取。</p>
     * @param RequirementFileIds <p>相关规定文件资源id列表（PDF/Word格式），最多3个文件，每个大小不超过1M，通过<a href="https://qian.tencent.com/developers/companyApis/templatesAndFiles/UploadFiles">上传文件</a>接口来获取。</p>
     */
    public void setRequirementFileIds(String [] RequirementFileIds) {
        this.RequirementFileIds = RequirementFileIds;
    }

    /**
     * Get <p>起草合同的语言要求（zh，en）默认zh</p> 
     * @return ContractLanguage <p>起草合同的语言要求（zh，en）默认zh</p>
     */
    public String getContractLanguage() {
        return this.ContractLanguage;
    }

    /**
     * Set <p>起草合同的语言要求（zh，en）默认zh</p>
     * @param ContractLanguage <p>起草合同的语言要求（zh，en）默认zh</p>
     */
    public void setContractLanguage(String ContractLanguage) {
        this.ContractLanguage = ContractLanguage;
    }

    /**
     * Get <p>审查任务id，仅支持传入1个，通过<a href="https://qian.tencent.com/developers/companyApis/%E5%90%88%E5%90%8C%E6%99%BA%E8%83%BD%E7%9B%B8%E5%85%B3%E6%8E%A5%E5%8F%A3/CreateBatchContractReviewTask/">批量创建合同审查任务</a>接口来获取。</p> 
     * @return ReviewTaskId <p>审查任务id，仅支持传入1个，通过<a href="https://qian.tencent.com/developers/companyApis/%E5%90%88%E5%90%8C%E6%99%BA%E8%83%BD%E7%9B%B8%E5%85%B3%E6%8E%A5%E5%8F%A3/CreateBatchContractReviewTask/">批量创建合同审查任务</a>接口来获取。</p>
     */
    public String getReviewTaskId() {
        return this.ReviewTaskId;
    }

    /**
     * Set <p>审查任务id，仅支持传入1个，通过<a href="https://qian.tencent.com/developers/companyApis/%E5%90%88%E5%90%8C%E6%99%BA%E8%83%BD%E7%9B%B8%E5%85%B3%E6%8E%A5%E5%8F%A3/CreateBatchContractReviewTask/">批量创建合同审查任务</a>接口来获取。</p>
     * @param ReviewTaskId <p>审查任务id，仅支持传入1个，通过<a href="https://qian.tencent.com/developers/companyApis/%E5%90%88%E5%90%8C%E6%99%BA%E8%83%BD%E7%9B%B8%E5%85%B3%E6%8E%A5%E5%8F%A3/CreateBatchContractReviewTask/">批量创建合同审查任务</a>接口来获取。</p>
     */
    public void setReviewTaskId(String ReviewTaskId) {
        this.ReviewTaskId = ReviewTaskId;
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
        if (source.ReviewTaskId != null) {
            this.ReviewTaskId = new String(source.ReviewTaskId);
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
        this.setParamSimple(map, prefix + "ReviewTaskId", this.ReviewTaskId);

    }
}

