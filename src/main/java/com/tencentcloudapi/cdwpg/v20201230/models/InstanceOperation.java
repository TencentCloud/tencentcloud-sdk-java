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
package com.tencentcloudapi.cdwpg.v20201230.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceOperation extends AbstractModel {

    /**
    * 操作名称，例如“create_instance"、“scaleout_instance”等
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 集群ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 操作名称描述，例如“创建”，“修改集群名称”等
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 操作开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 操作结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 操作上下文
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
    * 操作更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 操作UIN
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
     * Get 操作名称，例如“create_instance"、“scaleout_instance”等 
     * @return Id 操作名称，例如“create_instance"、“scaleout_instance”等
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 操作名称，例如“create_instance"、“scaleout_instance”等
     * @param Id 操作名称，例如“create_instance"、“scaleout_instance”等
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 集群ID 
     * @return InstanceId 集群ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 集群ID
     * @param InstanceId 集群ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 操作名称描述，例如“创建”，“修改集群名称”等 
     * @return Action 操作名称描述，例如“创建”，“修改集群名称”等
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 操作名称描述，例如“创建”，“修改集群名称”等
     * @param Action 操作名称描述，例如“创建”，“修改集群名称”等
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 状态 
     * @return Status 状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
     * @param Status 状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 操作开始时间 
     * @return StartTime 操作开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 操作开始时间
     * @param StartTime 操作开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 操作结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 操作结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 操作结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 操作结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 操作上下文
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Context 操作上下文
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set 操作上下文
注意：此字段可能返回 null，表示取不到有效值。
     * @param Context 操作上下文
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    /**
     * Get 操作更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 操作更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 操作更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 操作更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 操作UIN
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Uin 操作UIN
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 操作UIN
注意：此字段可能返回 null，表示取不到有效值。
     * @param Uin 操作UIN
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    public InstanceOperation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceOperation(InstanceOperation source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Context != null) {
            this.Context = new String(source.Context);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Context", this.Context);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Uin", this.Uin);

    }
}

