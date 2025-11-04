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
package com.tencentcloudapi.omics.v20221128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NextflowConfig extends AbstractModel {

    /**
    * 工作流任务并发数
    */
    @SerializedName("ExecutorQueueSize")
    @Expose
    private Long ExecutorQueueSize;

    /**
     * Get 工作流任务并发数 
     * @return ExecutorQueueSize 工作流任务并发数
     */
    public Long getExecutorQueueSize() {
        return this.ExecutorQueueSize;
    }

    /**
     * Set 工作流任务并发数
     * @param ExecutorQueueSize 工作流任务并发数
     */
    public void setExecutorQueueSize(Long ExecutorQueueSize) {
        this.ExecutorQueueSize = ExecutorQueueSize;
    }

    public NextflowConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NextflowConfig(NextflowConfig source) {
        if (source.ExecutorQueueSize != null) {
            this.ExecutorQueueSize = new Long(source.ExecutorQueueSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExecutorQueueSize", this.ExecutorQueueSize);

    }
}

