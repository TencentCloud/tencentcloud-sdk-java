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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListTasksData extends AbstractModel {

    /**
    * 任务列表
    */
    @SerializedName("List")
    @Expose
    private TaskData [] List;

    /**
    * 任务数量
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
     * Get 任务列表 
     * @return List 任务列表
     */
    public TaskData [] getList() {
        return this.List;
    }

    /**
     * Set 任务列表
     * @param List 任务列表
     */
    public void setList(TaskData [] List) {
        this.List = List;
    }

    /**
     * Get 任务数量 
     * @return TotalCount 任务数量
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 任务数量
     * @param TotalCount 任务数量
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    public ListTasksData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListTasksData(ListTasksData source) {
        if (source.List != null) {
            this.List = new TaskData[source.List.length];
            for (int i = 0; i < source.List.length; i++) {
                this.List[i] = new TaskData(source.List[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "List.", this.List);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);

    }
}

