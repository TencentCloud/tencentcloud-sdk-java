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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AdhocRecordInfoDto extends AbstractModel {

    /**
    * 任务提交记录
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 脚本内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScriptContent")
    @Expose
    private String ScriptContent;

    /**
    * 任务创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 任务状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 子任务执行记录
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Details")
    @Expose
    private AdhocSubTaskDto [] Details;

    /**
    * 任务实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 任务执行者Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutorId")
    @Expose
    private String ExecutorId;

    /**
    * 任务执行者显示名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutorDisplayName")
    @Expose
    private String ExecutorDisplayName;

    /**
     * Get 任务提交记录 
     * @return Id 任务提交记录
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 任务提交记录
     * @param Id 任务提交记录
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 脚本内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScriptContent 脚本内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScriptContent() {
        return this.ScriptContent;
    }

    /**
     * Set 脚本内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScriptContent 脚本内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScriptContent(String ScriptContent) {
        this.ScriptContent = ScriptContent;
    }

    /**
     * Get 任务创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 任务创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 任务创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 任务创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 任务状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 任务状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 任务状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 子任务执行记录
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Details 子任务执行记录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AdhocSubTaskDto [] getDetails() {
        return this.Details;
    }

    /**
     * Set 子任务执行记录
注意：此字段可能返回 null，表示取不到有效值。
     * @param Details 子任务执行记录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDetails(AdhocSubTaskDto [] Details) {
        this.Details = Details;
    }

    /**
     * Get 任务实例id 
     * @return InstanceId 任务实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 任务实例id
     * @param InstanceId 任务实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 任务执行者Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutorId 任务执行者Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutorId() {
        return this.ExecutorId;
    }

    /**
     * Set 任务执行者Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutorId 任务执行者Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutorId(String ExecutorId) {
        this.ExecutorId = ExecutorId;
    }

    /**
     * Get 任务执行者显示名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutorDisplayName 任务执行者显示名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutorDisplayName() {
        return this.ExecutorDisplayName;
    }

    /**
     * Set 任务执行者显示名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutorDisplayName 任务执行者显示名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutorDisplayName(String ExecutorDisplayName) {
        this.ExecutorDisplayName = ExecutorDisplayName;
    }

    public AdhocRecordInfoDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AdhocRecordInfoDto(AdhocRecordInfoDto source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.ScriptContent != null) {
            this.ScriptContent = new String(source.ScriptContent);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Details != null) {
            this.Details = new AdhocSubTaskDto[source.Details.length];
            for (int i = 0; i < source.Details.length; i++) {
                this.Details[i] = new AdhocSubTaskDto(source.Details[i]);
            }
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ExecutorId != null) {
            this.ExecutorId = new String(source.ExecutorId);
        }
        if (source.ExecutorDisplayName != null) {
            this.ExecutorDisplayName = new String(source.ExecutorDisplayName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "ScriptContent", this.ScriptContent);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "Details.", this.Details);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ExecutorId", this.ExecutorId);
        this.setParamSimple(map, prefix + "ExecutorDisplayName", this.ExecutorDisplayName);

    }
}

