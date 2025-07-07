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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckFunctionRequest extends AbstractModel {

    /**
    * 用户输入的加工语句
    */
    @SerializedName("EtlContent")
    @Expose
    private String EtlContent;

    /**
    * 加工任务目的topic_id以及别名
    */
    @SerializedName("DstResources")
    @Expose
    private DataTransformResouceInfo [] DstResources;

    /**
    * 数据加工目标主题的类型. 1 固定主题 2动态创建
    */
    @SerializedName("FuncType")
    @Expose
    private Long FuncType;

    /**
     * Get 用户输入的加工语句 
     * @return EtlContent 用户输入的加工语句
     */
    public String getEtlContent() {
        return this.EtlContent;
    }

    /**
     * Set 用户输入的加工语句
     * @param EtlContent 用户输入的加工语句
     */
    public void setEtlContent(String EtlContent) {
        this.EtlContent = EtlContent;
    }

    /**
     * Get 加工任务目的topic_id以及别名 
     * @return DstResources 加工任务目的topic_id以及别名
     */
    public DataTransformResouceInfo [] getDstResources() {
        return this.DstResources;
    }

    /**
     * Set 加工任务目的topic_id以及别名
     * @param DstResources 加工任务目的topic_id以及别名
     */
    public void setDstResources(DataTransformResouceInfo [] DstResources) {
        this.DstResources = DstResources;
    }

    /**
     * Get 数据加工目标主题的类型. 1 固定主题 2动态创建 
     * @return FuncType 数据加工目标主题的类型. 1 固定主题 2动态创建
     */
    public Long getFuncType() {
        return this.FuncType;
    }

    /**
     * Set 数据加工目标主题的类型. 1 固定主题 2动态创建
     * @param FuncType 数据加工目标主题的类型. 1 固定主题 2动态创建
     */
    public void setFuncType(Long FuncType) {
        this.FuncType = FuncType;
    }

    public CheckFunctionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckFunctionRequest(CheckFunctionRequest source) {
        if (source.EtlContent != null) {
            this.EtlContent = new String(source.EtlContent);
        }
        if (source.DstResources != null) {
            this.DstResources = new DataTransformResouceInfo[source.DstResources.length];
            for (int i = 0; i < source.DstResources.length; i++) {
                this.DstResources[i] = new DataTransformResouceInfo(source.DstResources[i]);
            }
        }
        if (source.FuncType != null) {
            this.FuncType = new Long(source.FuncType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EtlContent", this.EtlContent);
        this.setParamArrayObj(map, prefix + "DstResources.", this.DstResources);
        this.setParamSimple(map, prefix + "FuncType", this.FuncType);

    }
}

