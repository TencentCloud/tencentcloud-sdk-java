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
package com.tencentcloudapi.hai.v20230812.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TemplateDetail extends AbstractModel {

    /**
    * 模板id
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * 部署方式
    */
    @SerializedName("DeployMode")
    @Expose
    private String DeployMode;

    /**
    * 推理引擎
    */
    @SerializedName("EngineType")
    @Expose
    private String EngineType;

    /**
    * 算力详情
    */
    @SerializedName("ComputeSet")
    @Expose
    private ComputeDetail [] ComputeSet;

    /**
    * 当前部署模板所支持的增强功能
    */
    @SerializedName("SupportFunc")
    @Expose
    private String [] SupportFunc;

    /**
     * Get 模板id 
     * @return TemplateId 模板id
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 模板id
     * @param TemplateId 模板id
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 部署方式 
     * @return DeployMode 部署方式
     */
    public String getDeployMode() {
        return this.DeployMode;
    }

    /**
     * Set 部署方式
     * @param DeployMode 部署方式
     */
    public void setDeployMode(String DeployMode) {
        this.DeployMode = DeployMode;
    }

    /**
     * Get 推理引擎 
     * @return EngineType 推理引擎
     */
    public String getEngineType() {
        return this.EngineType;
    }

    /**
     * Set 推理引擎
     * @param EngineType 推理引擎
     */
    public void setEngineType(String EngineType) {
        this.EngineType = EngineType;
    }

    /**
     * Get 算力详情 
     * @return ComputeSet 算力详情
     */
    public ComputeDetail [] getComputeSet() {
        return this.ComputeSet;
    }

    /**
     * Set 算力详情
     * @param ComputeSet 算力详情
     */
    public void setComputeSet(ComputeDetail [] ComputeSet) {
        this.ComputeSet = ComputeSet;
    }

    /**
     * Get 当前部署模板所支持的增强功能 
     * @return SupportFunc 当前部署模板所支持的增强功能
     */
    public String [] getSupportFunc() {
        return this.SupportFunc;
    }

    /**
     * Set 当前部署模板所支持的增强功能
     * @param SupportFunc 当前部署模板所支持的增强功能
     */
    public void setSupportFunc(String [] SupportFunc) {
        this.SupportFunc = SupportFunc;
    }

    public TemplateDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TemplateDetail(TemplateDetail source) {
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.DeployMode != null) {
            this.DeployMode = new String(source.DeployMode);
        }
        if (source.EngineType != null) {
            this.EngineType = new String(source.EngineType);
        }
        if (source.ComputeSet != null) {
            this.ComputeSet = new ComputeDetail[source.ComputeSet.length];
            for (int i = 0; i < source.ComputeSet.length; i++) {
                this.ComputeSet[i] = new ComputeDetail(source.ComputeSet[i]);
            }
        }
        if (source.SupportFunc != null) {
            this.SupportFunc = new String[source.SupportFunc.length];
            for (int i = 0; i < source.SupportFunc.length; i++) {
                this.SupportFunc[i] = new String(source.SupportFunc[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "DeployMode", this.DeployMode);
        this.setParamSimple(map, prefix + "EngineType", this.EngineType);
        this.setParamArrayObj(map, prefix + "ComputeSet.", this.ComputeSet);
        this.setParamArraySimple(map, prefix + "SupportFunc.", this.SupportFunc);

    }
}

