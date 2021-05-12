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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FleetRelatedResource extends AbstractModel{

    /**
    * 资源类型。
- ALIAS：别名
- QUEUE：队列
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 资源ID，目前仅支持别名ID和队列名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 资源所在区域，如ap-shanghai、na-siliconvalley等
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceRegion")
    @Expose
    private String ResourceRegion;

    /**
     * Get 资源类型。
- ALIAS：别名
- QUEUE：队列
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 资源类型。
- ALIAS：别名
- QUEUE：队列
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 资源类型。
- ALIAS：别名
- QUEUE：队列
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 资源类型。
- ALIAS：别名
- QUEUE：队列
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 资源ID，目前仅支持别名ID和队列名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceId 资源ID，目前仅支持别名ID和队列名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源ID，目前仅支持别名ID和队列名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceId 资源ID，目前仅支持别名ID和队列名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 资源所在区域，如ap-shanghai、na-siliconvalley等
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceRegion 资源所在区域，如ap-shanghai、na-siliconvalley等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceRegion() {
        return this.ResourceRegion;
    }

    /**
     * Set 资源所在区域，如ap-shanghai、na-siliconvalley等
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceRegion 资源所在区域，如ap-shanghai、na-siliconvalley等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceRegion(String ResourceRegion) {
        this.ResourceRegion = ResourceRegion;
    }

    public FleetRelatedResource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FleetRelatedResource(FleetRelatedResource source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.ResourceRegion != null) {
            this.ResourceRegion = new String(source.ResourceRegion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ResourceRegion", this.ResourceRegion);

    }
}

