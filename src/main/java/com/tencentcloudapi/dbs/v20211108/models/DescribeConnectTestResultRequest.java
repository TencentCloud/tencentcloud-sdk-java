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
package com.tencentcloudapi.dbs.v20211108.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeConnectTestResultRequest extends AbstractModel {

    /**
    * <p>连通性检测任务 ID。</p>
    */
    @SerializedName("TaskIds")
    @Expose
    private Long [] TaskIds;

    /**
     * Get <p>连通性检测任务 ID。</p> 
     * @return TaskIds <p>连通性检测任务 ID。</p>
     */
    public Long [] getTaskIds() {
        return this.TaskIds;
    }

    /**
     * Set <p>连通性检测任务 ID。</p>
     * @param TaskIds <p>连通性检测任务 ID。</p>
     */
    public void setTaskIds(Long [] TaskIds) {
        this.TaskIds = TaskIds;
    }

    public DescribeConnectTestResultRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeConnectTestResultRequest(DescribeConnectTestResultRequest source) {
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

