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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ParameterTaskInDsDto extends AbstractModel {

    /**
    * 唯一标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 任务id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 参数名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParamKey")
    @Expose
    private String ParamKey;

    /**
    * 参数描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParamDesc")
    @Expose
    private String ParamDesc;

    /**
    * 父任务id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FromTaskId")
    @Expose
    private String FromTaskId;

    /**
    * 父任务参数key
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FromParamKey")
    @Expose
    private String FromParamKey;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 升级时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 父任务名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FromTaskName")
    @Expose
    private String FromTaskName;

    /**
    * 父任务项目id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FromProjectId")
    @Expose
    private String FromProjectId;

    /**
    * 父任务项目名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FromProjectName")
    @Expose
    private String FromProjectName;

    /**
     * Get 唯一标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 任务id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId 任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId 任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 参数名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParamKey 参数名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParamKey() {
        return this.ParamKey;
    }

    /**
     * Set 参数名
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParamKey 参数名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParamKey(String ParamKey) {
        this.ParamKey = ParamKey;
    }

    /**
     * Get 参数描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParamDesc 参数描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParamDesc() {
        return this.ParamDesc;
    }

    /**
     * Set 参数描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParamDesc 参数描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParamDesc(String ParamDesc) {
        this.ParamDesc = ParamDesc;
    }

    /**
     * Get 父任务id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FromTaskId 父任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFromTaskId() {
        return this.FromTaskId;
    }

    /**
     * Set 父任务id
注意：此字段可能返回 null，表示取不到有效值。
     * @param FromTaskId 父任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFromTaskId(String FromTaskId) {
        this.FromTaskId = FromTaskId;
    }

    /**
     * Get 父任务参数key
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FromParamKey 父任务参数key
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFromParamKey() {
        return this.FromParamKey;
    }

    /**
     * Set 父任务参数key
注意：此字段可能返回 null，表示取不到有效值。
     * @param FromParamKey 父任务参数key
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFromParamKey(String FromParamKey) {
        this.FromParamKey = FromParamKey;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 升级时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 升级时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 升级时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 升级时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 父任务名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FromTaskName 父任务名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFromTaskName() {
        return this.FromTaskName;
    }

    /**
     * Set 父任务名
注意：此字段可能返回 null，表示取不到有效值。
     * @param FromTaskName 父任务名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFromTaskName(String FromTaskName) {
        this.FromTaskName = FromTaskName;
    }

    /**
     * Get 父任务项目id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FromProjectId 父任务项目id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFromProjectId() {
        return this.FromProjectId;
    }

    /**
     * Set 父任务项目id
注意：此字段可能返回 null，表示取不到有效值。
     * @param FromProjectId 父任务项目id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFromProjectId(String FromProjectId) {
        this.FromProjectId = FromProjectId;
    }

    /**
     * Get 父任务项目名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FromProjectName 父任务项目名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFromProjectName() {
        return this.FromProjectName;
    }

    /**
     * Set 父任务项目名
注意：此字段可能返回 null，表示取不到有效值。
     * @param FromProjectName 父任务项目名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFromProjectName(String FromProjectName) {
        this.FromProjectName = FromProjectName;
    }

    public ParameterTaskInDsDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ParameterTaskInDsDto(ParameterTaskInDsDto source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.ParamKey != null) {
            this.ParamKey = new String(source.ParamKey);
        }
        if (source.ParamDesc != null) {
            this.ParamDesc = new String(source.ParamDesc);
        }
        if (source.FromTaskId != null) {
            this.FromTaskId = new String(source.FromTaskId);
        }
        if (source.FromParamKey != null) {
            this.FromParamKey = new String(source.FromParamKey);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.FromTaskName != null) {
            this.FromTaskName = new String(source.FromTaskName);
        }
        if (source.FromProjectId != null) {
            this.FromProjectId = new String(source.FromProjectId);
        }
        if (source.FromProjectName != null) {
            this.FromProjectName = new String(source.FromProjectName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "ParamKey", this.ParamKey);
        this.setParamSimple(map, prefix + "ParamDesc", this.ParamDesc);
        this.setParamSimple(map, prefix + "FromTaskId", this.FromTaskId);
        this.setParamSimple(map, prefix + "FromParamKey", this.FromParamKey);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "FromTaskName", this.FromTaskName);
        this.setParamSimple(map, prefix + "FromProjectId", this.FromProjectId);
        this.setParamSimple(map, prefix + "FromProjectName", this.FromProjectName);

    }
}

