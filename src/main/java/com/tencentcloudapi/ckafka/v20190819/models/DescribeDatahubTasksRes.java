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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDatahubTasksRes extends AbstractModel {

    /**
    * 任务总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Datahub任务信息列表
    */
    @SerializedName("TaskList")
    @Expose
    private DatahubTaskInfo [] TaskList;

    /**
     * Get 任务总数 
     * @return TotalCount 任务总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 任务总数
     * @param TotalCount 任务总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Datahub任务信息列表 
     * @return TaskList Datahub任务信息列表
     */
    public DatahubTaskInfo [] getTaskList() {
        return this.TaskList;
    }

    /**
     * Set Datahub任务信息列表
     * @param TaskList Datahub任务信息列表
     */
    public void setTaskList(DatahubTaskInfo [] TaskList) {
        this.TaskList = TaskList;
    }

    public DescribeDatahubTasksRes() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDatahubTasksRes(DescribeDatahubTasksRes source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.TaskList != null) {
            this.TaskList = new DatahubTaskInfo[source.TaskList.length];
            for (int i = 0; i < source.TaskList.length; i++) {
                this.TaskList[i] = new DatahubTaskInfo(source.TaskList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "TaskList.", this.TaskList);

    }
}

