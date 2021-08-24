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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAgeDetectTaskRequest extends AbstractModel{

    /**
    * 应用id
    */
    @SerializedName("BizId")
    @Expose
    private Long BizId;

    /**
    * 创建年龄语音识别任务时返回的taskid
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
     * Get 应用id 
     * @return BizId 应用id
     */
    public Long getBizId() {
        return this.BizId;
    }

    /**
     * Set 应用id
     * @param BizId 应用id
     */
    public void setBizId(Long BizId) {
        this.BizId = BizId;
    }

    /**
     * Get 创建年龄语音识别任务时返回的taskid 
     * @return TaskId 创建年龄语音识别任务时返回的taskid
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 创建年龄语音识别任务时返回的taskid
     * @param TaskId 创建年龄语音识别任务时返回的taskid
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    public DescribeAgeDetectTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAgeDetectTaskRequest(DescribeAgeDetectTaskRequest source) {
        if (source.BizId != null) {
            this.BizId = new Long(source.BizId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BizId", this.BizId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);

    }
}

