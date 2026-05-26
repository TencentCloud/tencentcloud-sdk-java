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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AIOptimizerStatus extends AbstractModel {

    /**
    * <p>状态。closing-关闭中，closed-关闭，opening-开启中，training-训练中，trained-训练完成，train_failed-训练失败。</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>开启时间</p>
    */
    @SerializedName("OpenTime")
    @Expose
    private String OpenTime;

    /**
    * <p>训练进度</p>
    */
    @SerializedName("TrainingProgress")
    @Expose
    private Long TrainingProgress;

    /**
     * Get <p>状态。closing-关闭中，closed-关闭，opening-开启中，training-训练中，trained-训练完成，train_failed-训练失败。</p> 
     * @return Status <p>状态。closing-关闭中，closed-关闭，opening-开启中，training-训练中，trained-训练完成，train_failed-训练失败。</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态。closing-关闭中，closed-关闭，opening-开启中，training-训练中，trained-训练完成，train_failed-训练失败。</p>
     * @param Status <p>状态。closing-关闭中，closed-关闭，opening-开启中，training-训练中，trained-训练完成，train_failed-训练失败。</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>开启时间</p> 
     * @return OpenTime <p>开启时间</p>
     */
    public String getOpenTime() {
        return this.OpenTime;
    }

    /**
     * Set <p>开启时间</p>
     * @param OpenTime <p>开启时间</p>
     */
    public void setOpenTime(String OpenTime) {
        this.OpenTime = OpenTime;
    }

    /**
     * Get <p>训练进度</p> 
     * @return TrainingProgress <p>训练进度</p>
     */
    public Long getTrainingProgress() {
        return this.TrainingProgress;
    }

    /**
     * Set <p>训练进度</p>
     * @param TrainingProgress <p>训练进度</p>
     */
    public void setTrainingProgress(Long TrainingProgress) {
        this.TrainingProgress = TrainingProgress;
    }

    public AIOptimizerStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIOptimizerStatus(AIOptimizerStatus source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.OpenTime != null) {
            this.OpenTime = new String(source.OpenTime);
        }
        if (source.TrainingProgress != null) {
            this.TrainingProgress = new Long(source.TrainingProgress);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "OpenTime", this.OpenTime);
        this.setParamSimple(map, prefix + "TrainingProgress", this.TrainingProgress);

    }
}

