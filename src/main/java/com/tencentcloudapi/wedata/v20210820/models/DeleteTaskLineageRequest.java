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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteTaskLineageRequest extends AbstractModel {

    /**
    * 任务信息
    */
    @SerializedName("Task")
    @Expose
    private LineageTask Task;

    /**
    * wedata内部任务默认SQL
    */
    @SerializedName("ChannelType")
    @Expose
    private String ChannelType;

    /**
     * Get 任务信息 
     * @return Task 任务信息
     */
    public LineageTask getTask() {
        return this.Task;
    }

    /**
     * Set 任务信息
     * @param Task 任务信息
     */
    public void setTask(LineageTask Task) {
        this.Task = Task;
    }

    /**
     * Get wedata内部任务默认SQL 
     * @return ChannelType wedata内部任务默认SQL
     */
    public String getChannelType() {
        return this.ChannelType;
    }

    /**
     * Set wedata内部任务默认SQL
     * @param ChannelType wedata内部任务默认SQL
     */
    public void setChannelType(String ChannelType) {
        this.ChannelType = ChannelType;
    }

    public DeleteTaskLineageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteTaskLineageRequest(DeleteTaskLineageRequest source) {
        if (source.Task != null) {
            this.Task = new LineageTask(source.Task);
        }
        if (source.ChannelType != null) {
            this.ChannelType = new String(source.ChannelType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Task.", this.Task);
        this.setParamSimple(map, prefix + "ChannelType", this.ChannelType);

    }
}

