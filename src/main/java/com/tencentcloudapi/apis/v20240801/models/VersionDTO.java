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
package com.tencentcloudapi.apis.v20240801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VersionDTO extends AbstractModel {

    /**
    * Version版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 目标路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetPath")
    @Expose
    private String TargetPath;

    /**
     * Get Version版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Version Version版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set Version版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param Version Version版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 目标路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetPath 目标路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetPath() {
        return this.TargetPath;
    }

    /**
     * Set 目标路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetPath 目标路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetPath(String TargetPath) {
        this.TargetPath = TargetPath;
    }

    public VersionDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VersionDTO(VersionDTO source) {
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.TargetPath != null) {
            this.TargetPath = new String(source.TargetPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "TargetPath", this.TargetPath);

    }
}

