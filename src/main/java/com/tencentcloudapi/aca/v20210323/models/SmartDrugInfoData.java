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
package com.tencentcloudapi.aca.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SmartDrugInfoData extends AbstractModel {

    /**
    * 药品名称
    */
    @SerializedName("DrugName")
    @Expose
    private String DrugName;

    /**
    * 规格
    */
    @SerializedName("Specifications")
    @Expose
    private String Specifications;

    /**
    * 批准文号
    */
    @SerializedName("ApprovalNumber")
    @Expose
    private String ApprovalNumber;

    /**
    * 生产厂家
    */
    @SerializedName("Manufacturer")
    @Expose
    private String Manufacturer;

    /**
    * 药品ID
    */
    @SerializedName("DrugId")
    @Expose
    private String DrugId;

    /**
    * 诊断
    */
    @SerializedName("Diagnosis")
    @Expose
    private String Diagnosis;

    /**
    * 年龄
    */
    @SerializedName("Age")
    @Expose
    private Float Age;

    /**
     * Get 药品名称 
     * @return DrugName 药品名称
     */
    public String getDrugName() {
        return this.DrugName;
    }

    /**
     * Set 药品名称
     * @param DrugName 药品名称
     */
    public void setDrugName(String DrugName) {
        this.DrugName = DrugName;
    }

    /**
     * Get 规格 
     * @return Specifications 规格
     */
    public String getSpecifications() {
        return this.Specifications;
    }

    /**
     * Set 规格
     * @param Specifications 规格
     */
    public void setSpecifications(String Specifications) {
        this.Specifications = Specifications;
    }

    /**
     * Get 批准文号 
     * @return ApprovalNumber 批准文号
     */
    public String getApprovalNumber() {
        return this.ApprovalNumber;
    }

    /**
     * Set 批准文号
     * @param ApprovalNumber 批准文号
     */
    public void setApprovalNumber(String ApprovalNumber) {
        this.ApprovalNumber = ApprovalNumber;
    }

    /**
     * Get 生产厂家 
     * @return Manufacturer 生产厂家
     */
    public String getManufacturer() {
        return this.Manufacturer;
    }

    /**
     * Set 生产厂家
     * @param Manufacturer 生产厂家
     */
    public void setManufacturer(String Manufacturer) {
        this.Manufacturer = Manufacturer;
    }

    /**
     * Get 药品ID 
     * @return DrugId 药品ID
     */
    public String getDrugId() {
        return this.DrugId;
    }

    /**
     * Set 药品ID
     * @param DrugId 药品ID
     */
    public void setDrugId(String DrugId) {
        this.DrugId = DrugId;
    }

    /**
     * Get 诊断 
     * @return Diagnosis 诊断
     */
    public String getDiagnosis() {
        return this.Diagnosis;
    }

    /**
     * Set 诊断
     * @param Diagnosis 诊断
     */
    public void setDiagnosis(String Diagnosis) {
        this.Diagnosis = Diagnosis;
    }

    /**
     * Get 年龄 
     * @return Age 年龄
     */
    public Float getAge() {
        return this.Age;
    }

    /**
     * Set 年龄
     * @param Age 年龄
     */
    public void setAge(Float Age) {
        this.Age = Age;
    }

    public SmartDrugInfoData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SmartDrugInfoData(SmartDrugInfoData source) {
        if (source.DrugName != null) {
            this.DrugName = new String(source.DrugName);
        }
        if (source.Specifications != null) {
            this.Specifications = new String(source.Specifications);
        }
        if (source.ApprovalNumber != null) {
            this.ApprovalNumber = new String(source.ApprovalNumber);
        }
        if (source.Manufacturer != null) {
            this.Manufacturer = new String(source.Manufacturer);
        }
        if (source.DrugId != null) {
            this.DrugId = new String(source.DrugId);
        }
        if (source.Diagnosis != null) {
            this.Diagnosis = new String(source.Diagnosis);
        }
        if (source.Age != null) {
            this.Age = new Float(source.Age);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DrugName", this.DrugName);
        this.setParamSimple(map, prefix + "Specifications", this.Specifications);
        this.setParamSimple(map, prefix + "ApprovalNumber", this.ApprovalNumber);
        this.setParamSimple(map, prefix + "Manufacturer", this.Manufacturer);
        this.setParamSimple(map, prefix + "DrugId", this.DrugId);
        this.setParamSimple(map, prefix + "Diagnosis", this.Diagnosis);
        this.setParamSimple(map, prefix + "Age", this.Age);

    }
}

