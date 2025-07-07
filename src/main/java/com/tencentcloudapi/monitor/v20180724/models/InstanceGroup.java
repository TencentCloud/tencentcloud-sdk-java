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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceGroup extends AbstractModel {

    /**
    * 实例组ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceGroupId")
    @Expose
    private Long InstanceGroupId;

    /**
    * 实例组名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceGroupName")
    @Expose
    private String InstanceGroupName;

    /**
     * Get 实例组ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceGroupId 实例组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInstanceGroupId() {
        return this.InstanceGroupId;
    }

    /**
     * Set 实例组ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceGroupId 实例组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceGroupId(Long InstanceGroupId) {
        this.InstanceGroupId = InstanceGroupId;
    }

    /**
     * Get 实例组名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceGroupName 实例组名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceGroupName() {
        return this.InstanceGroupName;
    }

    /**
     * Set 实例组名
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceGroupName 实例组名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceGroupName(String InstanceGroupName) {
        this.InstanceGroupName = InstanceGroupName;
    }

    public InstanceGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceGroup(InstanceGroup source) {
        if (source.InstanceGroupId != null) {
            this.InstanceGroupId = new Long(source.InstanceGroupId);
        }
        if (source.InstanceGroupName != null) {
            this.InstanceGroupName = new String(source.InstanceGroupName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceGroupId", this.InstanceGroupId);
        this.setParamSimple(map, prefix + "InstanceGroupName", this.InstanceGroupName);

    }
}

