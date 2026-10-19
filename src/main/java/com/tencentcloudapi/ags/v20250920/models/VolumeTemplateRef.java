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
package com.tencentcloudapi.ags.v20250920.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VolumeTemplateRef extends AbstractModel {

    /**
    * <p>VolumeTemplate 名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VolumeTemplateName")
    @Expose
    private String VolumeTemplateName;

    /**
    * <p>复用键，可为字面量或 ${metadata.xxx}</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReuseKey")
    @Expose
    private String ReuseKey;

    /**
     * Get <p>VolumeTemplate 名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VolumeTemplateName <p>VolumeTemplate 名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVolumeTemplateName() {
        return this.VolumeTemplateName;
    }

    /**
     * Set <p>VolumeTemplate 名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param VolumeTemplateName <p>VolumeTemplate 名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVolumeTemplateName(String VolumeTemplateName) {
        this.VolumeTemplateName = VolumeTemplateName;
    }

    /**
     * Get <p>复用键，可为字面量或 ${metadata.xxx}</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReuseKey <p>复用键，可为字面量或 ${metadata.xxx}</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReuseKey() {
        return this.ReuseKey;
    }

    /**
     * Set <p>复用键，可为字面量或 ${metadata.xxx}</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReuseKey <p>复用键，可为字面量或 ${metadata.xxx}</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReuseKey(String ReuseKey) {
        this.ReuseKey = ReuseKey;
    }

    public VolumeTemplateRef() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VolumeTemplateRef(VolumeTemplateRef source) {
        if (source.VolumeTemplateName != null) {
            this.VolumeTemplateName = new String(source.VolumeTemplateName);
        }
        if (source.ReuseKey != null) {
            this.ReuseKey = new String(source.ReuseKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VolumeTemplateName", this.VolumeTemplateName);
        this.setParamSimple(map, prefix + "ReuseKey", this.ReuseKey);

    }
}

