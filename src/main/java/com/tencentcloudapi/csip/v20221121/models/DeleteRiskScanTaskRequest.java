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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteRiskScanTaskRequest extends AbstractModel {

    /**
    * 任务id 和目标AppID列表
    */
    @SerializedName("TaskIdList")
    @Expose
    private TaskIdListKey [] TaskIdList;

    /**
    * 集团账号的成员id
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
     * Get 任务id 和目标AppID列表 
     * @return TaskIdList 任务id 和目标AppID列表
     */
    public TaskIdListKey [] getTaskIdList() {
        return this.TaskIdList;
    }

    /**
     * Set 任务id 和目标AppID列表
     * @param TaskIdList 任务id 和目标AppID列表
     */
    public void setTaskIdList(TaskIdListKey [] TaskIdList) {
        this.TaskIdList = TaskIdList;
    }

    /**
     * Get 集团账号的成员id 
     * @return MemberId 集团账号的成员id
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set 集团账号的成员id
     * @param MemberId 集团账号的成员id
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    public DeleteRiskScanTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteRiskScanTaskRequest(DeleteRiskScanTaskRequest source) {
        if (source.TaskIdList != null) {
            this.TaskIdList = new TaskIdListKey[source.TaskIdList.length];
            for (int i = 0; i < source.TaskIdList.length; i++) {
                this.TaskIdList[i] = new TaskIdListKey(source.TaskIdList[i]);
            }
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "TaskIdList.", this.TaskIdList);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);

    }
}

