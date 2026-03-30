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
package com.tencentcloudapi.monitor.v20230616.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AIWorkbenchSREDigitalTwinTask extends AbstractModel {

    /**
    * 任务名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 任务类型
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * 任务配置
    */
    @SerializedName("TaskConfig")
    @Expose
    private String TaskConfig;

    /**
    * 唯一标识
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * 创建时间
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * 所属数字分身ID
    */
    @SerializedName("TwinID")
    @Expose
    private Long TwinID;

    /**
     * Get 任务名称 
     * @return Name 任务名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 任务名称
     * @param Name 任务名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 任务类型 
     * @return TaskType 任务类型
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务类型
     * @param TaskType 任务类型
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 任务配置 
     * @return TaskConfig 任务配置
     */
    public String getTaskConfig() {
        return this.TaskConfig;
    }

    /**
     * Set 任务配置
     * @param TaskConfig 任务配置
     */
    public void setTaskConfig(String TaskConfig) {
        this.TaskConfig = TaskConfig;
    }

    /**
     * Get 唯一标识 
     * @return ID 唯一标识
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set 唯一标识
     * @param ID 唯一标识
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get 创建时间 
     * @return CreatedAt 创建时间
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 创建时间
     * @param CreatedAt 创建时间
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get 所属数字分身ID 
     * @return TwinID 所属数字分身ID
     */
    public Long getTwinID() {
        return this.TwinID;
    }

    /**
     * Set 所属数字分身ID
     * @param TwinID 所属数字分身ID
     */
    public void setTwinID(Long TwinID) {
        this.TwinID = TwinID;
    }

    public AIWorkbenchSREDigitalTwinTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIWorkbenchSREDigitalTwinTask(AIWorkbenchSREDigitalTwinTask source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.TaskConfig != null) {
            this.TaskConfig = new String(source.TaskConfig);
        }
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.TwinID != null) {
            this.TwinID = new Long(source.TwinID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "TaskConfig", this.TaskConfig);
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "TwinID", this.TwinID);

    }
}

