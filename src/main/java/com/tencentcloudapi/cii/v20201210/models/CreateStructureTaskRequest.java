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
package com.tencentcloudapi.cii.v20201210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateStructureTaskRequest extends AbstractModel{

    /**
    * 保单号
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
    * 客户号
    */
    @SerializedName("CustomerId")
    @Expose
    private String CustomerId;

    /**
    * 客户姓名
    */
    @SerializedName("CustomerName")
    @Expose
    private String CustomerName;

    /**
    * 文件类型，目前只支持体检报告类型，对应的值为：HealthReport
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * 报告年份
    */
    @SerializedName("Year")
    @Expose
    private String Year;

    /**
    * 报告文件上传的地址列表，需按顺序排列。如果使用ImageList参数，置为空数组即可
    */
    @SerializedName("FileList")
    @Expose
    private String [] FileList;

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
    * 报告上传的图片内容数组，图片内容采用base64编码，需按顺序排列
    */
    @SerializedName("ImageList")
    @Expose
    private String [] ImageList;

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
     * Get 客户号 
     * @return CustomerId 客户号
     */
    public String getCustomerId() {
        return this.CustomerId;
    }

    /**
     * Set 客户号
     * @param CustomerId 客户号
     */
    public void setCustomerId(String CustomerId) {
        this.CustomerId = CustomerId;
    }

    /**
     * Get 客户姓名 
     * @return CustomerName 客户姓名
     */
    public String getCustomerName() {
        return this.CustomerName;
    }

    /**
     * Set 客户姓名
     * @param CustomerName 客户姓名
     */
    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    /**
     * Get 文件类型，目前只支持体检报告类型，对应的值为：HealthReport 
     * @return TaskType 文件类型，目前只支持体检报告类型，对应的值为：HealthReport
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 文件类型，目前只支持体检报告类型，对应的值为：HealthReport
     * @param TaskType 文件类型，目前只支持体检报告类型，对应的值为：HealthReport
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 报告年份 
     * @return Year 报告年份
     */
    public String getYear() {
        return this.Year;
    }

    /**
     * Set 报告年份
     * @param Year 报告年份
     */
    public void setYear(String Year) {
        this.Year = Year;
    }

    /**
     * Get 报告文件上传的地址列表，需按顺序排列。如果使用ImageList参数，置为空数组即可 
     * @return FileList 报告文件上传的地址列表，需按顺序排列。如果使用ImageList参数，置为空数组即可
     */
    public String [] getFileList() {
        return this.FileList;
    }

    /**
     * Set 报告文件上传的地址列表，需按顺序排列。如果使用ImageList参数，置为空数组即可
     * @param FileList 报告文件上传的地址列表，需按顺序排列。如果使用ImageList参数，置为空数组即可
     */
    public void setFileList(String [] FileList) {
        this.FileList = FileList;
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
     * Get 报告上传的图片内容数组，图片内容采用base64编码，需按顺序排列 
     * @return ImageList 报告上传的图片内容数组，图片内容采用base64编码，需按顺序排列
     */
    public String [] getImageList() {
        return this.ImageList;
    }

    /**
     * Set 报告上传的图片内容数组，图片内容采用base64编码，需按顺序排列
     * @param ImageList 报告上传的图片内容数组，图片内容采用base64编码，需按顺序排列
     */
    public void setImageList(String [] ImageList) {
        this.ImageList = ImageList;
    }

    public CreateStructureTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateStructureTaskRequest(CreateStructureTaskRequest source) {
        if (source.PolicyId != null) {
            this.PolicyId = new String(source.PolicyId);
        }
        if (source.CustomerId != null) {
            this.CustomerId = new String(source.CustomerId);
        }
        if (source.CustomerName != null) {
            this.CustomerName = new String(source.CustomerName);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.Year != null) {
            this.Year = new String(source.Year);
        }
        if (source.FileList != null) {
            this.FileList = new String[source.FileList.length];
            for (int i = 0; i < source.FileList.length; i++) {
                this.FileList[i] = new String(source.FileList[i]);
            }
        }
        if (source.InsuranceTypes != null) {
            this.InsuranceTypes = new String[source.InsuranceTypes.length];
            for (int i = 0; i < source.InsuranceTypes.length; i++) {
                this.InsuranceTypes[i] = new String(source.InsuranceTypes[i]);
            }
        }
        if (source.ImageList != null) {
            this.ImageList = new String[source.ImageList.length];
            for (int i = 0; i < source.ImageList.length; i++) {
                this.ImageList[i] = new String(source.ImageList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "CustomerId", this.CustomerId);
        this.setParamSimple(map, prefix + "CustomerName", this.CustomerName);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "Year", this.Year);
        this.setParamArraySimple(map, prefix + "FileList.", this.FileList);
        this.setParamArraySimple(map, prefix + "InsuranceTypes.", this.InsuranceTypes);
        this.setParamArraySimple(map, prefix + "ImageList.", this.ImageList);

    }
}

