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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TemplateScope extends AbstractModel {

    /**
    * 站点ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 实例状态列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EntityStatus")
    @Expose
    private EntityStatus [] EntityStatus;

    /**
     * Get 站点ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ZoneId 站点ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ZoneId 站点ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 实例状态列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EntityStatus 实例状态列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EntityStatus [] getEntityStatus() {
        return this.EntityStatus;
    }

    /**
     * Set 实例状态列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param EntityStatus 实例状态列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEntityStatus(EntityStatus [] EntityStatus) {
        this.EntityStatus = EntityStatus;
    }

    public TemplateScope() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TemplateScope(TemplateScope source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.EntityStatus != null) {
            this.EntityStatus = new EntityStatus[source.EntityStatus.length];
            for (int i = 0; i < source.EntityStatus.length; i++) {
                this.EntityStatus[i] = new EntityStatus(source.EntityStatus[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArrayObj(map, prefix + "EntityStatus.", this.EntityStatus);

    }
}

