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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModelRouterResourcePackageDeduction extends AbstractModel {

    /**
    * <p>实际抵扣量</p>
    */
    @SerializedName("ActualDosage")
    @Expose
    private String ActualDosage;

    /**
    * <p>抵扣后包剩余量</p>
    */
    @SerializedName("AfterDeductionRemain")
    @Expose
    private String AfterDeductionRemain;

    /**
    * <p>抵扣前包剩余量</p>
    */
    @SerializedName("BeforeDeductionRemain")
    @Expose
    private String BeforeDeductionRemain;

    /**
    * <p>抵扣时间</p>
    */
    @SerializedName("DeductionTime")
    @Expose
    private String DeductionTime;

    /**
    * <p>原始用量</p>
    */
    @SerializedName("Dosage")
    @Expose
    private String Dosage;

    /**
    * <p>用量结束时间</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>产生用量的模型路由实例Id</p>
    */
    @SerializedName("ModelRouterId")
    @Expose
    private String ModelRouterId;

    /**
    * <p>模型路由资源包Id</p>
    */
    @SerializedName("ModelRouterResourcePackageId")
    @Expose
    private String ModelRouterResourcePackageId;

    /**
    * <p>用量开始时间</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
     * Get <p>实际抵扣量</p> 
     * @return ActualDosage <p>实际抵扣量</p>
     */
    public String getActualDosage() {
        return this.ActualDosage;
    }

    /**
     * Set <p>实际抵扣量</p>
     * @param ActualDosage <p>实际抵扣量</p>
     */
    public void setActualDosage(String ActualDosage) {
        this.ActualDosage = ActualDosage;
    }

    /**
     * Get <p>抵扣后包剩余量</p> 
     * @return AfterDeductionRemain <p>抵扣后包剩余量</p>
     */
    public String getAfterDeductionRemain() {
        return this.AfterDeductionRemain;
    }

    /**
     * Set <p>抵扣后包剩余量</p>
     * @param AfterDeductionRemain <p>抵扣后包剩余量</p>
     */
    public void setAfterDeductionRemain(String AfterDeductionRemain) {
        this.AfterDeductionRemain = AfterDeductionRemain;
    }

    /**
     * Get <p>抵扣前包剩余量</p> 
     * @return BeforeDeductionRemain <p>抵扣前包剩余量</p>
     */
    public String getBeforeDeductionRemain() {
        return this.BeforeDeductionRemain;
    }

    /**
     * Set <p>抵扣前包剩余量</p>
     * @param BeforeDeductionRemain <p>抵扣前包剩余量</p>
     */
    public void setBeforeDeductionRemain(String BeforeDeductionRemain) {
        this.BeforeDeductionRemain = BeforeDeductionRemain;
    }

    /**
     * Get <p>抵扣时间</p> 
     * @return DeductionTime <p>抵扣时间</p>
     */
    public String getDeductionTime() {
        return this.DeductionTime;
    }

    /**
     * Set <p>抵扣时间</p>
     * @param DeductionTime <p>抵扣时间</p>
     */
    public void setDeductionTime(String DeductionTime) {
        this.DeductionTime = DeductionTime;
    }

    /**
     * Get <p>原始用量</p> 
     * @return Dosage <p>原始用量</p>
     */
    public String getDosage() {
        return this.Dosage;
    }

    /**
     * Set <p>原始用量</p>
     * @param Dosage <p>原始用量</p>
     */
    public void setDosage(String Dosage) {
        this.Dosage = Dosage;
    }

    /**
     * Get <p>用量结束时间</p> 
     * @return EndTime <p>用量结束时间</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>用量结束时间</p>
     * @param EndTime <p>用量结束时间</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>产生用量的模型路由实例Id</p> 
     * @return ModelRouterId <p>产生用量的模型路由实例Id</p>
     */
    public String getModelRouterId() {
        return this.ModelRouterId;
    }

    /**
     * Set <p>产生用量的模型路由实例Id</p>
     * @param ModelRouterId <p>产生用量的模型路由实例Id</p>
     */
    public void setModelRouterId(String ModelRouterId) {
        this.ModelRouterId = ModelRouterId;
    }

    /**
     * Get <p>模型路由资源包Id</p> 
     * @return ModelRouterResourcePackageId <p>模型路由资源包Id</p>
     */
    public String getModelRouterResourcePackageId() {
        return this.ModelRouterResourcePackageId;
    }

    /**
     * Set <p>模型路由资源包Id</p>
     * @param ModelRouterResourcePackageId <p>模型路由资源包Id</p>
     */
    public void setModelRouterResourcePackageId(String ModelRouterResourcePackageId) {
        this.ModelRouterResourcePackageId = ModelRouterResourcePackageId;
    }

    /**
     * Get <p>用量开始时间</p> 
     * @return StartTime <p>用量开始时间</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>用量开始时间</p>
     * @param StartTime <p>用量开始时间</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    public ModelRouterResourcePackageDeduction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModelRouterResourcePackageDeduction(ModelRouterResourcePackageDeduction source) {
        if (source.ActualDosage != null) {
            this.ActualDosage = new String(source.ActualDosage);
        }
        if (source.AfterDeductionRemain != null) {
            this.AfterDeductionRemain = new String(source.AfterDeductionRemain);
        }
        if (source.BeforeDeductionRemain != null) {
            this.BeforeDeductionRemain = new String(source.BeforeDeductionRemain);
        }
        if (source.DeductionTime != null) {
            this.DeductionTime = new String(source.DeductionTime);
        }
        if (source.Dosage != null) {
            this.Dosage = new String(source.Dosage);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.ModelRouterId != null) {
            this.ModelRouterId = new String(source.ModelRouterId);
        }
        if (source.ModelRouterResourcePackageId != null) {
            this.ModelRouterResourcePackageId = new String(source.ModelRouterResourcePackageId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ActualDosage", this.ActualDosage);
        this.setParamSimple(map, prefix + "AfterDeductionRemain", this.AfterDeductionRemain);
        this.setParamSimple(map, prefix + "BeforeDeductionRemain", this.BeforeDeductionRemain);
        this.setParamSimple(map, prefix + "DeductionTime", this.DeductionTime);
        this.setParamSimple(map, prefix + "Dosage", this.Dosage);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ModelRouterId", this.ModelRouterId);
        this.setParamSimple(map, prefix + "ModelRouterResourcePackageId", this.ModelRouterResourcePackageId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);

    }
}

