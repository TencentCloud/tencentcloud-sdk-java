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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImportSourceClusterConsumerGroupsRequest extends AbstractModel {

    /**
    * 任务ID，可在[DescribeSmoothMigrationTaskList](https://cloud.tencent.com/document/api/1493/119997)接口返回的[SmoothMigrationTaskItem](https://cloud.tencent.com/document/api/1493/96031#SmoothMigrationTaskItem)或控制台中获得。

    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 待导入的消费组列表
    */
    @SerializedName("GroupList")
    @Expose
    private SourceClusterGroupConfig [] GroupList;

    /**
     * Get 任务ID，可在[DescribeSmoothMigrationTaskList](https://cloud.tencent.com/document/api/1493/119997)接口返回的[SmoothMigrationTaskItem](https://cloud.tencent.com/document/api/1493/96031#SmoothMigrationTaskItem)或控制台中获得。
 
     * @return TaskId 任务ID，可在[DescribeSmoothMigrationTaskList](https://cloud.tencent.com/document/api/1493/119997)接口返回的[SmoothMigrationTaskItem](https://cloud.tencent.com/document/api/1493/96031#SmoothMigrationTaskItem)或控制台中获得。

     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID，可在[DescribeSmoothMigrationTaskList](https://cloud.tencent.com/document/api/1493/119997)接口返回的[SmoothMigrationTaskItem](https://cloud.tencent.com/document/api/1493/96031#SmoothMigrationTaskItem)或控制台中获得。

     * @param TaskId 任务ID，可在[DescribeSmoothMigrationTaskList](https://cloud.tencent.com/document/api/1493/119997)接口返回的[SmoothMigrationTaskItem](https://cloud.tencent.com/document/api/1493/96031#SmoothMigrationTaskItem)或控制台中获得。

     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 待导入的消费组列表 
     * @return GroupList 待导入的消费组列表
     */
    public SourceClusterGroupConfig [] getGroupList() {
        return this.GroupList;
    }

    /**
     * Set 待导入的消费组列表
     * @param GroupList 待导入的消费组列表
     */
    public void setGroupList(SourceClusterGroupConfig [] GroupList) {
        this.GroupList = GroupList;
    }

    public ImportSourceClusterConsumerGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImportSourceClusterConsumerGroupsRequest(ImportSourceClusterConsumerGroupsRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.GroupList != null) {
            this.GroupList = new SourceClusterGroupConfig[source.GroupList.length];
            for (int i = 0; i < source.GroupList.length; i++) {
                this.GroupList[i] = new SourceClusterGroupConfig(source.GroupList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamArrayObj(map, prefix + "GroupList.", this.GroupList);

    }
}

