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
package com.tencentcloudapi.ie.v20200304.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaQualityRestorationTaskResult extends AbstractModel{

    /**
    * 画质重生任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 画质重生处理后文件的详细信息。
    */
    @SerializedName("SubTaskResult")
    @Expose
    private SubTaskResultItem [] SubTaskResult;

    /**
     * Get 画质重生任务ID 
     * @return TaskId 画质重生任务ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 画质重生任务ID
     * @param TaskId 画质重生任务ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 画质重生处理后文件的详细信息。 
     * @return SubTaskResult 画质重生处理后文件的详细信息。
     */
    public SubTaskResultItem [] getSubTaskResult() {
        return this.SubTaskResult;
    }

    /**
     * Set 画质重生处理后文件的详细信息。
     * @param SubTaskResult 画质重生处理后文件的详细信息。
     */
    public void setSubTaskResult(SubTaskResultItem [] SubTaskResult) {
        this.SubTaskResult = SubTaskResult;
    }

    public MediaQualityRestorationTaskResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaQualityRestorationTaskResult(MediaQualityRestorationTaskResult source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.SubTaskResult != null) {
            this.SubTaskResult = new SubTaskResultItem[source.SubTaskResult.length];
            for (int i = 0; i < source.SubTaskResult.length; i++) {
                this.SubTaskResult[i] = new SubTaskResultItem(source.SubTaskResult[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamArrayObj(map, prefix + "SubTaskResult.", this.SubTaskResult);

    }
}

