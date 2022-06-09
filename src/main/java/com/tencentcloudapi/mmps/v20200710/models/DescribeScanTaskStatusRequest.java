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
package com.tencentcloudapi.mmps.v20200710.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeScanTaskStatusRequest extends AbstractModel{

    /**
    * 任务类型, 0:基础版, 1:专家版, 2:本地化
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * 任务来源, 0:默认值(私域), 1:灵犀, 2:灵鲲;
    */
    @SerializedName("Source")
    @Expose
    private Long Source;

    /**
    * 任务id
    */
    @SerializedName("TaskID")
    @Expose
    private String TaskID;

    /**
    * 应用平台, 0:android, 1:ios, 2:小程序
    */
    @SerializedName("Platform")
    @Expose
    private Long Platform;

    /**
     * Get 任务类型, 0:基础版, 1:专家版, 2:本地化 
     * @return TaskType 任务类型, 0:基础版, 1:专家版, 2:本地化
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务类型, 0:基础版, 1:专家版, 2:本地化
     * @param TaskType 任务类型, 0:基础版, 1:专家版, 2:本地化
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 任务来源, 0:默认值(私域), 1:灵犀, 2:灵鲲; 
     * @return Source 任务来源, 0:默认值(私域), 1:灵犀, 2:灵鲲;
     */
    public Long getSource() {
        return this.Source;
    }

    /**
     * Set 任务来源, 0:默认值(私域), 1:灵犀, 2:灵鲲;
     * @param Source 任务来源, 0:默认值(私域), 1:灵犀, 2:灵鲲;
     */
    public void setSource(Long Source) {
        this.Source = Source;
    }

    /**
     * Get 任务id 
     * @return TaskID 任务id
     */
    public String getTaskID() {
        return this.TaskID;
    }

    /**
     * Set 任务id
     * @param TaskID 任务id
     */
    public void setTaskID(String TaskID) {
        this.TaskID = TaskID;
    }

    /**
     * Get 应用平台, 0:android, 1:ios, 2:小程序 
     * @return Platform 应用平台, 0:android, 1:ios, 2:小程序
     */
    public Long getPlatform() {
        return this.Platform;
    }

    /**
     * Set 应用平台, 0:android, 1:ios, 2:小程序
     * @param Platform 应用平台, 0:android, 1:ios, 2:小程序
     */
    public void setPlatform(Long Platform) {
        this.Platform = Platform;
    }

    public DescribeScanTaskStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeScanTaskStatusRequest(DescribeScanTaskStatusRequest source) {
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
        if (source.Source != null) {
            this.Source = new Long(source.Source);
        }
        if (source.TaskID != null) {
            this.TaskID = new String(source.TaskID);
        }
        if (source.Platform != null) {
            this.Platform = new Long(source.Platform);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "TaskID", this.TaskID);
        this.setParamSimple(map, prefix + "Platform", this.Platform);

    }
}

