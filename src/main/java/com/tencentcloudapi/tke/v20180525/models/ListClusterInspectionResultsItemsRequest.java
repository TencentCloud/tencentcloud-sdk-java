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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListClusterInspectionResultsItemsRequest extends AbstractModel{

    /**
    * 目标集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 查询历史结果的开始时间，Unix时间戳
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 查询历史结果的结束时间，默认当前距离开始时间3天，Unix时间戳
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get 目标集群ID 
     * @return ClusterId 目标集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 目标集群ID
     * @param ClusterId 目标集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 查询历史结果的开始时间，Unix时间戳 
     * @return StartTime 查询历史结果的开始时间，Unix时间戳
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 查询历史结果的开始时间，Unix时间戳
     * @param StartTime 查询历史结果的开始时间，Unix时间戳
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 查询历史结果的结束时间，默认当前距离开始时间3天，Unix时间戳 
     * @return EndTime 查询历史结果的结束时间，默认当前距离开始时间3天，Unix时间戳
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 查询历史结果的结束时间，默认当前距离开始时间3天，Unix时间戳
     * @param EndTime 查询历史结果的结束时间，默认当前距离开始时间3天，Unix时间戳
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public ListClusterInspectionResultsItemsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListClusterInspectionResultsItemsRequest(ListClusterInspectionResultsItemsRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

