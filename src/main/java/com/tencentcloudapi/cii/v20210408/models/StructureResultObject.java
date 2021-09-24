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

public class StructureResultObject extends AbstractModel{

    /**
    * 0表示正常返回
    */
    @SerializedName("Code")
    @Expose
    private Long Code;

    /**
    * 报告类型
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * 结构化结果
    */
    @SerializedName("StructureResult")
    @Expose
    private String StructureResult;

    /**
    * 子任务ID
    */
    @SerializedName("SubTaskId")
    @Expose
    private String SubTaskId;

    /**
     * Get 0表示正常返回 
     * @return Code 0表示正常返回
     */
    public Long getCode() {
        return this.Code;
    }

    /**
     * Set 0表示正常返回
     * @param Code 0表示正常返回
     */
    public void setCode(Long Code) {
        this.Code = Code;
    }

    /**
     * Get 报告类型 
     * @return TaskType 报告类型
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 报告类型
     * @param TaskType 报告类型
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 结构化结果 
     * @return StructureResult 结构化结果
     */
    public String getStructureResult() {
        return this.StructureResult;
    }

    /**
     * Set 结构化结果
     * @param StructureResult 结构化结果
     */
    public void setStructureResult(String StructureResult) {
        this.StructureResult = StructureResult;
    }

    /**
     * Get 子任务ID 
     * @return SubTaskId 子任务ID
     */
    public String getSubTaskId() {
        return this.SubTaskId;
    }

    /**
     * Set 子任务ID
     * @param SubTaskId 子任务ID
     */
    public void setSubTaskId(String SubTaskId) {
        this.SubTaskId = SubTaskId;
    }

    public StructureResultObject() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StructureResultObject(StructureResultObject source) {
        if (source.Code != null) {
            this.Code = new Long(source.Code);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.StructureResult != null) {
            this.StructureResult = new String(source.StructureResult);
        }
        if (source.SubTaskId != null) {
            this.SubTaskId = new String(source.SubTaskId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "StructureResult", this.StructureResult);
        this.setParamSimple(map, prefix + "SubTaskId", this.SubTaskId);

    }
}

