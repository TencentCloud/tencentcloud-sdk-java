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
package com.tencentcloudapi.bda.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSegmentationTaskRequest extends AbstractModel{

    /**
    * 在提交分割任务成功时返回的任务标识ID。
    */
    @SerializedName("TaskID")
    @Expose
    private String TaskID;

    /**
     * Get 在提交分割任务成功时返回的任务标识ID。 
     * @return TaskID 在提交分割任务成功时返回的任务标识ID。
     */
    public String getTaskID() {
        return this.TaskID;
    }

    /**
     * Set 在提交分割任务成功时返回的任务标识ID。
     * @param TaskID 在提交分割任务成功时返回的任务标识ID。
     */
    public void setTaskID(String TaskID) {
        this.TaskID = TaskID;
    }

    public DescribeSegmentationTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSegmentationTaskRequest(DescribeSegmentationTaskRequest source) {
        if (source.TaskID != null) {
            this.TaskID = new String(source.TaskID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskID", this.TaskID);

    }
}

