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

public class TaskInfoWithInstance extends AbstractModel {

    /**
    * 任务ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParentId")
    @Expose
    private String ParentId;

    /**
    * 实例时间列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceRunDateList")
    @Expose
    private String [] InstanceRunDateList;

    /**
    * 实例个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * 调度描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SchedulerDescription")
    @Expose
    private String SchedulerDescription;

    /**
     * Get 任务ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParentId 任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParentId() {
        return this.ParentId;
    }

    /**
     * Set 任务ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParentId 任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParentId(String ParentId) {
        this.ParentId = ParentId;
    }

    /**
     * Get 实例时间列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceRunDateList 实例时间列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getInstanceRunDateList() {
        return this.InstanceRunDateList;
    }

    /**
     * Set 实例时间列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceRunDateList 实例时间列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceRunDateList(String [] InstanceRunDateList) {
        this.InstanceRunDateList = InstanceRunDateList;
    }

    /**
     * Get 实例个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceCount 实例个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set 实例个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceCount 实例个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get 调度描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SchedulerDescription 调度描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSchedulerDescription() {
        return this.SchedulerDescription;
    }

    /**
     * Set 调度描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param SchedulerDescription 调度描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSchedulerDescription(String SchedulerDescription) {
        this.SchedulerDescription = SchedulerDescription;
    }

    public TaskInfoWithInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskInfoWithInstance(TaskInfoWithInstance source) {
        if (source.ParentId != null) {
            this.ParentId = new String(source.ParentId);
        }
        if (source.InstanceRunDateList != null) {
            this.InstanceRunDateList = new String[source.InstanceRunDateList.length];
            for (int i = 0; i < source.InstanceRunDateList.length; i++) {
                this.InstanceRunDateList[i] = new String(source.InstanceRunDateList[i]);
            }
        }
        if (source.InstanceCount != null) {
            this.InstanceCount = new Long(source.InstanceCount);
        }
        if (source.SchedulerDescription != null) {
            this.SchedulerDescription = new String(source.SchedulerDescription);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ParentId", this.ParentId);
        this.setParamArraySimple(map, prefix + "InstanceRunDateList.", this.InstanceRunDateList);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamSimple(map, prefix + "SchedulerDescription", this.SchedulerDescription);

    }
}

