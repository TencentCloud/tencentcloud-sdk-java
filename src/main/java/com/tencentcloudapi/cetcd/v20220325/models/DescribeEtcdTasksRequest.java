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
package com.tencentcloudapi.cetcd.v20220325.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEtcdTasksRequest extends AbstractModel {

    /**
    * 任务ID
    */
    @SerializedName("TaskID")
    @Expose
    private String TaskID;

    /**
    * taskType：
    按照任务类型过滤，当前支持enable_internet，disable_internet, restore_remote_snapshot
resourceId：
    按照资源ID过滤
lifeState：
    按照任务状态过滤，当前支持process， done
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get 任务ID 
     * @return TaskID 任务ID
     */
    public String getTaskID() {
        return this.TaskID;
    }

    /**
     * Set 任务ID
     * @param TaskID 任务ID
     */
    public void setTaskID(String TaskID) {
        this.TaskID = TaskID;
    }

    /**
     * Get taskType：
    按照任务类型过滤，当前支持enable_internet，disable_internet, restore_remote_snapshot
resourceId：
    按照资源ID过滤
lifeState：
    按照任务状态过滤，当前支持process， done 
     * @return Filters taskType：
    按照任务类型过滤，当前支持enable_internet，disable_internet, restore_remote_snapshot
resourceId：
    按照资源ID过滤
lifeState：
    按照任务状态过滤，当前支持process， done
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set taskType：
    按照任务类型过滤，当前支持enable_internet，disable_internet, restore_remote_snapshot
resourceId：
    按照资源ID过滤
lifeState：
    按照任务状态过滤，当前支持process， done
     * @param Filters taskType：
    按照任务类型过滤，当前支持enable_internet，disable_internet, restore_remote_snapshot
resourceId：
    按照资源ID过滤
lifeState：
    按照任务状态过滤，当前支持process， done
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeEtcdTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEtcdTasksRequest(DescribeEtcdTasksRequest source) {
        if (source.TaskID != null) {
            this.TaskID = new String(source.TaskID);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskID", this.TaskID);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

