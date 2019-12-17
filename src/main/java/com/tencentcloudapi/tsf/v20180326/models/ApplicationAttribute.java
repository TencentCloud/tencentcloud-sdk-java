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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApplicationAttribute extends AbstractModel{

    /**
    * 总实例个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * 运行实例个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunInstanceCount")
    @Expose
    private Long RunInstanceCount;

    /**
    * 应用下部署组个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupCount")
    @Expose
    private Long GroupCount;

    /**
     * Get 总实例个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceCount 总实例个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set 总实例个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceCount 总实例个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get 运行实例个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunInstanceCount 运行实例个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRunInstanceCount() {
        return this.RunInstanceCount;
    }

    /**
     * Set 运行实例个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunInstanceCount 运行实例个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunInstanceCount(Long RunInstanceCount) {
        this.RunInstanceCount = RunInstanceCount;
    }

    /**
     * Get 应用下部署组个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupCount 应用下部署组个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getGroupCount() {
        return this.GroupCount;
    }

    /**
     * Set 应用下部署组个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupCount 应用下部署组个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupCount(Long GroupCount) {
        this.GroupCount = GroupCount;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamSimple(map, prefix + "RunInstanceCount", this.RunInstanceCount);
        this.setParamSimple(map, prefix + "GroupCount", this.GroupCount);

    }
}

