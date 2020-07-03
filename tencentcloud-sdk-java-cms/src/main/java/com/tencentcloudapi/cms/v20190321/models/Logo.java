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
package com.tencentcloudapi.cms.v20190321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Logo extends AbstractModel{

    /**
    * logo图标坐标信息
    */
    @SerializedName("RrectF")
    @Expose
    private RrectF RrectF;

    /**
    * logo图标置信度
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * logo图标名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get logo图标坐标信息 
     * @return RrectF logo图标坐标信息
     */
    public RrectF getRrectF() {
        return this.RrectF;
    }

    /**
     * Set logo图标坐标信息
     * @param RrectF logo图标坐标信息
     */
    public void setRrectF(RrectF RrectF) {
        this.RrectF = RrectF;
    }

    /**
     * Get logo图标置信度 
     * @return Confidence logo图标置信度
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set logo图标置信度
     * @param Confidence logo图标置信度
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get logo图标名称 
     * @return Name logo图标名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set logo图标名称
     * @param Name logo图标名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "RrectF.", this.RrectF);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

