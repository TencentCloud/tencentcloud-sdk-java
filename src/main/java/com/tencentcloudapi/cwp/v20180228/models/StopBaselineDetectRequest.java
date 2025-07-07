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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StopBaselineDetectRequest extends AbstractModel {

    /**
    * 取消任务ID集合
    */
    @SerializedName("TaskIds")
    @Expose
    private Long [] TaskIds;

    /**
     * Get 取消任务ID集合 
     * @return TaskIds 取消任务ID集合
     */
    public Long [] getTaskIds() {
        return this.TaskIds;
    }

    /**
     * Set 取消任务ID集合
     * @param TaskIds 取消任务ID集合
     */
    public void setTaskIds(Long [] TaskIds) {
        this.TaskIds = TaskIds;
    }

    public StopBaselineDetectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StopBaselineDetectRequest(StopBaselineDetectRequest source) {
        if (source.TaskIds != null) {
            this.TaskIds = new Long[source.TaskIds.length];
            for (int i = 0; i < source.TaskIds.length; i++) {
                this.TaskIds[i] = new Long(source.TaskIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "TaskIds.", this.TaskIds);

    }
}

