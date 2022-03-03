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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StopJobsRequest extends AbstractModel{

    /**
    * 批量停止作业的描述信息
    */
    @SerializedName("StopJobDescriptions")
    @Expose
    private StopJobDescription [] StopJobDescriptions;

    /**
    * 工作空间 SerialId
    */
    @SerializedName("WorkSpaceId")
    @Expose
    private String WorkSpaceId;

    /**
     * Get 批量停止作业的描述信息 
     * @return StopJobDescriptions 批量停止作业的描述信息
     */
    public StopJobDescription [] getStopJobDescriptions() {
        return this.StopJobDescriptions;
    }

    /**
     * Set 批量停止作业的描述信息
     * @param StopJobDescriptions 批量停止作业的描述信息
     */
    public void setStopJobDescriptions(StopJobDescription [] StopJobDescriptions) {
        this.StopJobDescriptions = StopJobDescriptions;
    }

    /**
     * Get 工作空间 SerialId 
     * @return WorkSpaceId 工作空间 SerialId
     */
    public String getWorkSpaceId() {
        return this.WorkSpaceId;
    }

    /**
     * Set 工作空间 SerialId
     * @param WorkSpaceId 工作空间 SerialId
     */
    public void setWorkSpaceId(String WorkSpaceId) {
        this.WorkSpaceId = WorkSpaceId;
    }

    public StopJobsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StopJobsRequest(StopJobsRequest source) {
        if (source.StopJobDescriptions != null) {
            this.StopJobDescriptions = new StopJobDescription[source.StopJobDescriptions.length];
            for (int i = 0; i < source.StopJobDescriptions.length; i++) {
                this.StopJobDescriptions[i] = new StopJobDescription(source.StopJobDescriptions[i]);
            }
        }
        if (source.WorkSpaceId != null) {
            this.WorkSpaceId = new String(source.WorkSpaceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "StopJobDescriptions.", this.StopJobDescriptions);
        this.setParamSimple(map, prefix + "WorkSpaceId", this.WorkSpaceId);

    }
}

