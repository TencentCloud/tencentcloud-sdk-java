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

public class CreateVirusScanAgainRequest extends AbstractModel{

    /**
    * 任务id
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 需要扫描的容器id集合
    */
    @SerializedName("ContainerIds")
    @Expose
    private String [] ContainerIds;

    /**
    * 是否是扫描全部超时的
    */
    @SerializedName("TimeoutAll")
    @Expose
    private Boolean TimeoutAll;

    /**
    * 重新设置的超时时长
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
     * Get 任务id 
     * @return TaskId 任务id
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务id
     * @param TaskId 任务id
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 需要扫描的容器id集合 
     * @return ContainerIds 需要扫描的容器id集合
     */
    public String [] getContainerIds() {
        return this.ContainerIds;
    }

    /**
     * Set 需要扫描的容器id集合
     * @param ContainerIds 需要扫描的容器id集合
     */
    public void setContainerIds(String [] ContainerIds) {
        this.ContainerIds = ContainerIds;
    }

    /**
     * Get 是否是扫描全部超时的 
     * @return TimeoutAll 是否是扫描全部超时的
     */
    public Boolean getTimeoutAll() {
        return this.TimeoutAll;
    }

    /**
     * Set 是否是扫描全部超时的
     * @param TimeoutAll 是否是扫描全部超时的
     */
    public void setTimeoutAll(Boolean TimeoutAll) {
        this.TimeoutAll = TimeoutAll;
    }

    /**
     * Get 重新设置的超时时长 
     * @return Timeout 重新设置的超时时长
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set 重新设置的超时时长
     * @param Timeout 重新设置的超时时长
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    public CreateVirusScanAgainRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateVirusScanAgainRequest(CreateVirusScanAgainRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.ContainerIds != null) {
            this.ContainerIds = new String[source.ContainerIds.length];
            for (int i = 0; i < source.ContainerIds.length; i++) {
                this.ContainerIds[i] = new String(source.ContainerIds[i]);
            }
        }
        if (source.TimeoutAll != null) {
            this.TimeoutAll = new Boolean(source.TimeoutAll);
        }
        if (source.Timeout != null) {
            this.Timeout = new Long(source.Timeout);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamArraySimple(map, prefix + "ContainerIds.", this.ContainerIds);
        this.setParamSimple(map, prefix + "TimeoutAll", this.TimeoutAll);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);

    }
}

