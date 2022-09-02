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
package com.tencentcloudapi.vm.v20210922.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskFilter extends AbstractModel{

    /**
    * 任务业务类型
    */
    @SerializedName("BizType")
    @Expose
    private String BizType;

    /**
    * 任务类型，可选：VIDEO，AUDIO， LIVE_VIDEO, LIVE_AUDIO
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 建议，可选：Pass, Review,Block
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * 状态，可选：PENDING，RUNNING，ERROR，FINISH，CANCELLED
    */
    @SerializedName("TaskStatus")
    @Expose
    private String TaskStatus;

    /**
     * Get 任务业务类型 
     * @return BizType 任务业务类型
     */
    public String getBizType() {
        return this.BizType;
    }

    /**
     * Set 任务业务类型
     * @param BizType 任务业务类型
     */
    public void setBizType(String BizType) {
        this.BizType = BizType;
    }

    /**
     * Get 任务类型，可选：VIDEO，AUDIO， LIVE_VIDEO, LIVE_AUDIO 
     * @return Type 任务类型，可选：VIDEO，AUDIO， LIVE_VIDEO, LIVE_AUDIO
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 任务类型，可选：VIDEO，AUDIO， LIVE_VIDEO, LIVE_AUDIO
     * @param Type 任务类型，可选：VIDEO，AUDIO， LIVE_VIDEO, LIVE_AUDIO
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 建议，可选：Pass, Review,Block 
     * @return Suggestion 建议，可选：Pass, Review,Block
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set 建议，可选：Pass, Review,Block
     * @param Suggestion 建议，可选：Pass, Review,Block
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get 状态，可选：PENDING，RUNNING，ERROR，FINISH，CANCELLED 
     * @return TaskStatus 状态，可选：PENDING，RUNNING，ERROR，FINISH，CANCELLED
     */
    public String getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set 状态，可选：PENDING，RUNNING，ERROR，FINISH，CANCELLED
     * @param TaskStatus 状态，可选：PENDING，RUNNING，ERROR，FINISH，CANCELLED
     */
    public void setTaskStatus(String TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    public TaskFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskFilter(TaskFilter source) {
        if (source.BizType != null) {
            this.BizType = new String(source.BizType);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new String(source.TaskStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BizType", this.BizType);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);

    }
}

