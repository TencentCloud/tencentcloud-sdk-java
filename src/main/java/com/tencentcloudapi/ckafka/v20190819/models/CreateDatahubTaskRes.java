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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDatahubTaskRes extends AbstractModel {

    /**
    * 转储任务id
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 数据转储Id
    */
    @SerializedName("DatahubId")
    @Expose
    private String DatahubId;

    /**
     * Get 转储任务id 
     * @return TaskId 转储任务id
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 转储任务id
     * @param TaskId 转储任务id
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 数据转储Id 
     * @return DatahubId 数据转储Id
     */
    public String getDatahubId() {
        return this.DatahubId;
    }

    /**
     * Set 数据转储Id
     * @param DatahubId 数据转储Id
     */
    public void setDatahubId(String DatahubId) {
        this.DatahubId = DatahubId;
    }

    public CreateDatahubTaskRes() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDatahubTaskRes(CreateDatahubTaskRes source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.DatahubId != null) {
            this.DatahubId = new String(source.DatahubId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "DatahubId", this.DatahubId);

    }
}

