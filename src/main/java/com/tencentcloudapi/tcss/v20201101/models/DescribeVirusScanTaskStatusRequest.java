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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVirusScanTaskStatusRequest extends AbstractModel{

    /**
    * 任务id
    */
    @SerializedName("TaskID")
    @Expose
    private String TaskID;

    /**
     * Get 任务id 
     * @return TaskID 任务id
     */
    public String getTaskID() {
        return this.TaskID;
    }

    /**
     * Set 任务id
     * @param TaskID 任务id
     */
    public void setTaskID(String TaskID) {
        this.TaskID = TaskID;
    }

    public DescribeVirusScanTaskStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVirusScanTaskStatusRequest(DescribeVirusScanTaskStatusRequest source) {
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

