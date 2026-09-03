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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskOptions extends AbstractModel {

    /**
    * <p>模型类型</p>
    */
    @SerializedName("ModelType")
    @Expose
    private String ModelType;

    /**
    * <p>任务场景</p>
    */
    @SerializedName("Tasks")
    @Expose
    private String [] Tasks;

    /**
     * Get <p>模型类型</p> 
     * @return ModelType <p>模型类型</p>
     */
    public String getModelType() {
        return this.ModelType;
    }

    /**
     * Set <p>模型类型</p>
     * @param ModelType <p>模型类型</p>
     */
    public void setModelType(String ModelType) {
        this.ModelType = ModelType;
    }

    /**
     * Get <p>任务场景</p> 
     * @return Tasks <p>任务场景</p>
     */
    public String [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set <p>任务场景</p>
     * @param Tasks <p>任务场景</p>
     */
    public void setTasks(String [] Tasks) {
        this.Tasks = Tasks;
    }

    public TaskOptions() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskOptions(TaskOptions source) {
        if (source.ModelType != null) {
            this.ModelType = new String(source.ModelType);
        }
        if (source.Tasks != null) {
            this.Tasks = new String[source.Tasks.length];
            for (int i = 0; i < source.Tasks.length; i++) {
                this.Tasks[i] = new String(source.Tasks[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelType", this.ModelType);
        this.setParamArraySimple(map, prefix + "Tasks.", this.Tasks);

    }
}

