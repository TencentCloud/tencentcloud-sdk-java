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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateScdnFailedLogTaskRequest extends AbstractModel{

    /**
    * 重试失败任务的taskID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 地域：mainland或overseas
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
     * Get 重试失败任务的taskID 
     * @return TaskId 重试失败任务的taskID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 重试失败任务的taskID
     * @param TaskId 重试失败任务的taskID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 地域：mainland或overseas 
     * @return Area 地域：mainland或overseas
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 地域：mainland或overseas
     * @param Area 地域：mainland或overseas
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    public CreateScdnFailedLogTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateScdnFailedLogTaskRequest(CreateScdnFailedLogTaskRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Area", this.Area);

    }
}

