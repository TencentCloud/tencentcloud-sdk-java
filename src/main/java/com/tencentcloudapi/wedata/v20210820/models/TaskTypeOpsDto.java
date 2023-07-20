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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskTypeOpsDto extends AbstractModel{

    /**
    * 任务类型描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TypeDesc")
    @Expose
    private String TypeDesc;

    /**
    * 任务类型id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TypeId")
    @Expose
    private Long TypeId;

    /**
    * 任务类型归类
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TypeSort")
    @Expose
    private String TypeSort;

    /**
     * Get 任务类型描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TypeDesc 任务类型描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTypeDesc() {
        return this.TypeDesc;
    }

    /**
     * Set 任务类型描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param TypeDesc 任务类型描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTypeDesc(String TypeDesc) {
        this.TypeDesc = TypeDesc;
    }

    /**
     * Get 任务类型id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TypeId 任务类型id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTypeId() {
        return this.TypeId;
    }

    /**
     * Set 任务类型id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TypeId 任务类型id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTypeId(Long TypeId) {
        this.TypeId = TypeId;
    }

    /**
     * Get 任务类型归类
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TypeSort 任务类型归类
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTypeSort() {
        return this.TypeSort;
    }

    /**
     * Set 任务类型归类
注意：此字段可能返回 null，表示取不到有效值。
     * @param TypeSort 任务类型归类
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTypeSort(String TypeSort) {
        this.TypeSort = TypeSort;
    }

    public TaskTypeOpsDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskTypeOpsDto(TaskTypeOpsDto source) {
        if (source.TypeDesc != null) {
            this.TypeDesc = new String(source.TypeDesc);
        }
        if (source.TypeId != null) {
            this.TypeId = new Long(source.TypeId);
        }
        if (source.TypeSort != null) {
            this.TypeSort = new String(source.TypeSort);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TypeDesc", this.TypeDesc);
        this.setParamSimple(map, prefix + "TypeId", this.TypeId);
        this.setParamSimple(map, prefix + "TypeSort", this.TypeSort);

    }
}

