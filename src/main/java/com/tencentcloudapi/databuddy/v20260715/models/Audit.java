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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Audit extends AbstractModel {

    /**
    * 创建者。注意：此字段可能返回null，表示取不到有效值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * 创建时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * 最后修改者。注意：此字段可能返回null，表示取不到有效值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastModifier")
    @Expose
    private String LastModifier;

    /**
    * 最后修改时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastModifiedAt")
    @Expose
    private String LastModifiedAt;

    /**
    * 创建者名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatorName")
    @Expose
    private String CreatorName;

    /**
    * 最后修改者名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastModifierName")
    @Expose
    private String LastModifierName;

    /**
     * Get 创建者。注意：此字段可能返回null，表示取不到有效值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Creator 创建者。注意：此字段可能返回null，表示取不到有效值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set 创建者。注意：此字段可能返回null，表示取不到有效值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Creator 创建者。注意：此字段可能返回null，表示取不到有效值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get 创建时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedAt 创建时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 创建时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedAt 创建时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get 最后修改者。注意：此字段可能返回null，表示取不到有效值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastModifier 最后修改者。注意：此字段可能返回null，表示取不到有效值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastModifier() {
        return this.LastModifier;
    }

    /**
     * Set 最后修改者。注意：此字段可能返回null，表示取不到有效值
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastModifier 最后修改者。注意：此字段可能返回null，表示取不到有效值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastModifier(String LastModifier) {
        this.LastModifier = LastModifier;
    }

    /**
     * Get 最后修改时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastModifiedAt 最后修改时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastModifiedAt() {
        return this.LastModifiedAt;
    }

    /**
     * Set 最后修改时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastModifiedAt 最后修改时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastModifiedAt(String LastModifiedAt) {
        this.LastModifiedAt = LastModifiedAt;
    }

    /**
     * Get 创建者名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatorName 创建者名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatorName() {
        return this.CreatorName;
    }

    /**
     * Set 创建者名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatorName 创建者名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatorName(String CreatorName) {
        this.CreatorName = CreatorName;
    }

    /**
     * Get 最后修改者名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastModifierName 最后修改者名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastModifierName() {
        return this.LastModifierName;
    }

    /**
     * Set 最后修改者名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastModifierName 最后修改者名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastModifierName(String LastModifierName) {
        this.LastModifierName = LastModifierName;
    }

    public Audit() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Audit(Audit source) {
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.LastModifier != null) {
            this.LastModifier = new String(source.LastModifier);
        }
        if (source.LastModifiedAt != null) {
            this.LastModifiedAt = new String(source.LastModifiedAt);
        }
        if (source.CreatorName != null) {
            this.CreatorName = new String(source.CreatorName);
        }
        if (source.LastModifierName != null) {
            this.LastModifierName = new String(source.LastModifierName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "LastModifier", this.LastModifier);
        this.setParamSimple(map, prefix + "LastModifiedAt", this.LastModifiedAt);
        this.setParamSimple(map, prefix + "CreatorName", this.CreatorName);
        this.setParamSimple(map, prefix + "LastModifierName", this.LastModifierName);

    }
}

