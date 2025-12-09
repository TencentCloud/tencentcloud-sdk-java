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
package com.tencentcloudapi.tms.v20201229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetFinancialLLMTaskResultRequest extends AbstractModel {

    /**
    * 该值对应创建任务接口里返回的TaskId字段值，创建任务接口见[创建金融大模型审校任务](https://cloud.tencent.com/document/product/1124/124463)。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
     * Get 该值对应创建任务接口里返回的TaskId字段值，创建任务接口见[创建金融大模型审校任务](https://cloud.tencent.com/document/product/1124/124463)。 
     * @return TaskId 该值对应创建任务接口里返回的TaskId字段值，创建任务接口见[创建金融大模型审校任务](https://cloud.tencent.com/document/product/1124/124463)。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 该值对应创建任务接口里返回的TaskId字段值，创建任务接口见[创建金融大模型审校任务](https://cloud.tencent.com/document/product/1124/124463)。
     * @param TaskId 该值对应创建任务接口里返回的TaskId字段值，创建任务接口见[创建金融大模型审校任务](https://cloud.tencent.com/document/product/1124/124463)。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    public GetFinancialLLMTaskResultRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetFinancialLLMTaskResultRequest(GetFinancialLLMTaskResultRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);

    }
}

