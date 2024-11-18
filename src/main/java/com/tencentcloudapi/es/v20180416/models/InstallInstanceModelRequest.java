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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstallInstanceModelRequest extends AbstractModel {

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 客户上传到cos的模型地址，单次请求限制一个。cos文件为压缩文件，格式包括：zip、tgz和tar.gz
    */
    @SerializedName("UsrCosModelUrlList")
    @Expose
    private String [] UsrCosModelUrlList;

    /**
    * 客户指定安装的模型名称，可为空，默认为模型文件名
    */
    @SerializedName("ModelNames")
    @Expose
    private String [] ModelNames;

    /**
    * 模型使用的任务类型，包括：fill_mask, ner, question_answering, text_classification, text_embedding, text_expansion, text_similarity和zero_shot_classification，默认为text_embedding
    */
    @SerializedName("TaskTypes")
    @Expose
    private String [] TaskTypes;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 客户上传到cos的模型地址，单次请求限制一个。cos文件为压缩文件，格式包括：zip、tgz和tar.gz 
     * @return UsrCosModelUrlList 客户上传到cos的模型地址，单次请求限制一个。cos文件为压缩文件，格式包括：zip、tgz和tar.gz
     */
    public String [] getUsrCosModelUrlList() {
        return this.UsrCosModelUrlList;
    }

    /**
     * Set 客户上传到cos的模型地址，单次请求限制一个。cos文件为压缩文件，格式包括：zip、tgz和tar.gz
     * @param UsrCosModelUrlList 客户上传到cos的模型地址，单次请求限制一个。cos文件为压缩文件，格式包括：zip、tgz和tar.gz
     */
    public void setUsrCosModelUrlList(String [] UsrCosModelUrlList) {
        this.UsrCosModelUrlList = UsrCosModelUrlList;
    }

    /**
     * Get 客户指定安装的模型名称，可为空，默认为模型文件名 
     * @return ModelNames 客户指定安装的模型名称，可为空，默认为模型文件名
     */
    public String [] getModelNames() {
        return this.ModelNames;
    }

    /**
     * Set 客户指定安装的模型名称，可为空，默认为模型文件名
     * @param ModelNames 客户指定安装的模型名称，可为空，默认为模型文件名
     */
    public void setModelNames(String [] ModelNames) {
        this.ModelNames = ModelNames;
    }

    /**
     * Get 模型使用的任务类型，包括：fill_mask, ner, question_answering, text_classification, text_embedding, text_expansion, text_similarity和zero_shot_classification，默认为text_embedding 
     * @return TaskTypes 模型使用的任务类型，包括：fill_mask, ner, question_answering, text_classification, text_embedding, text_expansion, text_similarity和zero_shot_classification，默认为text_embedding
     */
    public String [] getTaskTypes() {
        return this.TaskTypes;
    }

    /**
     * Set 模型使用的任务类型，包括：fill_mask, ner, question_answering, text_classification, text_embedding, text_expansion, text_similarity和zero_shot_classification，默认为text_embedding
     * @param TaskTypes 模型使用的任务类型，包括：fill_mask, ner, question_answering, text_classification, text_embedding, text_expansion, text_similarity和zero_shot_classification，默认为text_embedding
     */
    public void setTaskTypes(String [] TaskTypes) {
        this.TaskTypes = TaskTypes;
    }

    public InstallInstanceModelRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstallInstanceModelRequest(InstallInstanceModelRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.UsrCosModelUrlList != null) {
            this.UsrCosModelUrlList = new String[source.UsrCosModelUrlList.length];
            for (int i = 0; i < source.UsrCosModelUrlList.length; i++) {
                this.UsrCosModelUrlList[i] = new String(source.UsrCosModelUrlList[i]);
            }
        }
        if (source.ModelNames != null) {
            this.ModelNames = new String[source.ModelNames.length];
            for (int i = 0; i < source.ModelNames.length; i++) {
                this.ModelNames[i] = new String(source.ModelNames[i]);
            }
        }
        if (source.TaskTypes != null) {
            this.TaskTypes = new String[source.TaskTypes.length];
            for (int i = 0; i < source.TaskTypes.length; i++) {
                this.TaskTypes[i] = new String(source.TaskTypes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "UsrCosModelUrlList.", this.UsrCosModelUrlList);
        this.setParamArraySimple(map, prefix + "ModelNames.", this.ModelNames);
        this.setParamArraySimple(map, prefix + "TaskTypes.", this.TaskTypes);

    }
}

