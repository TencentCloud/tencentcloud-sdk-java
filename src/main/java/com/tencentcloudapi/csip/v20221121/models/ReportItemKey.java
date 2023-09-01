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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReportItemKey extends AbstractModel{

    /**
    * 日志Id列表
    */
    @SerializedName("TaskLogList")
    @Expose
    private String [] TaskLogList;

    /**
     * Get 日志Id列表 
     * @return TaskLogList 日志Id列表
     */
    public String [] getTaskLogList() {
        return this.TaskLogList;
    }

    /**
     * Set 日志Id列表
     * @param TaskLogList 日志Id列表
     */
    public void setTaskLogList(String [] TaskLogList) {
        this.TaskLogList = TaskLogList;
    }

    public ReportItemKey() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReportItemKey(ReportItemKey source) {
        if (source.TaskLogList != null) {
            this.TaskLogList = new String[source.TaskLogList.length];
            for (int i = 0; i < source.TaskLogList.length; i++) {
                this.TaskLogList[i] = new String(source.TaskLogList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "TaskLogList.", this.TaskLogList);

    }
}

