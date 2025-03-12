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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CheckStepInfo extends AbstractModel {

    /**
    * 任务开始时间
    */
    @SerializedName("StartAt")
    @Expose
    private String StartAt;

    /**
    * 任务结束时间
    */
    @SerializedName("EndAt")
    @Expose
    private String EndAt;

    /**
    * 任务步骤信息
    */
    @SerializedName("Progress")
    @Expose
    private ProcessProgress Progress;

    /**
     * Get 任务开始时间 
     * @return StartAt 任务开始时间
     */
    public String getStartAt() {
        return this.StartAt;
    }

    /**
     * Set 任务开始时间
     * @param StartAt 任务开始时间
     */
    public void setStartAt(String StartAt) {
        this.StartAt = StartAt;
    }

    /**
     * Get 任务结束时间 
     * @return EndAt 任务结束时间
     */
    public String getEndAt() {
        return this.EndAt;
    }

    /**
     * Set 任务结束时间
     * @param EndAt 任务结束时间
     */
    public void setEndAt(String EndAt) {
        this.EndAt = EndAt;
    }

    /**
     * Get 任务步骤信息 
     * @return Progress 任务步骤信息
     */
    public ProcessProgress getProgress() {
        return this.Progress;
    }

    /**
     * Set 任务步骤信息
     * @param Progress 任务步骤信息
     */
    public void setProgress(ProcessProgress Progress) {
        this.Progress = Progress;
    }

    public CheckStepInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckStepInfo(CheckStepInfo source) {
        if (source.StartAt != null) {
            this.StartAt = new String(source.StartAt);
        }
        if (source.EndAt != null) {
            this.EndAt = new String(source.EndAt);
        }
        if (source.Progress != null) {
            this.Progress = new ProcessProgress(source.Progress);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartAt", this.StartAt);
        this.setParamSimple(map, prefix + "EndAt", this.EndAt);
        this.setParamObj(map, prefix + "Progress.", this.Progress);

    }
}

