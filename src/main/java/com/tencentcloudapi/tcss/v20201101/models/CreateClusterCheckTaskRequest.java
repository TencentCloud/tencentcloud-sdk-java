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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateClusterCheckTaskRequest extends AbstractModel{

    /**
    * 指定要扫描的集群信息
    */
    @SerializedName("ClusterCheckTaskList")
    @Expose
    private ClusterCheckTaskItem [] ClusterCheckTaskList;

    /**
     * Get 指定要扫描的集群信息 
     * @return ClusterCheckTaskList 指定要扫描的集群信息
     */
    public ClusterCheckTaskItem [] getClusterCheckTaskList() {
        return this.ClusterCheckTaskList;
    }

    /**
     * Set 指定要扫描的集群信息
     * @param ClusterCheckTaskList 指定要扫描的集群信息
     */
    public void setClusterCheckTaskList(ClusterCheckTaskItem [] ClusterCheckTaskList) {
        this.ClusterCheckTaskList = ClusterCheckTaskList;
    }

    public CreateClusterCheckTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateClusterCheckTaskRequest(CreateClusterCheckTaskRequest source) {
        if (source.ClusterCheckTaskList != null) {
            this.ClusterCheckTaskList = new ClusterCheckTaskItem[source.ClusterCheckTaskList.length];
            for (int i = 0; i < source.ClusterCheckTaskList.length; i++) {
                this.ClusterCheckTaskList[i] = new ClusterCheckTaskItem(source.ClusterCheckTaskList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ClusterCheckTaskList.", this.ClusterCheckTaskList);

    }
}

