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

public class McpToolAnnotation extends AbstractModel {

    /**
    * title for the tool
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * If true, the tool does not modify its environment
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReadOnlyHint")
    @Expose
    private Boolean ReadOnlyHint;

    /**
    * If true, the tool may perform destructive updates
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DestructiveHint")
    @Expose
    private Boolean DestructiveHint;

    /**
    * If true, repeated calls with same args have no additional effect
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IdempotentHint")
    @Expose
    private Boolean IdempotentHint;

    /**
    * If true, tool interacts with external entities
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OpenWorldHint")
    @Expose
    private Boolean OpenWorldHint;

    /**
     * Get title for the tool
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Title title for the tool
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set title for the tool
注意：此字段可能返回 null，表示取不到有效值。
     * @param Title title for the tool
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get If true, the tool does not modify its environment
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReadOnlyHint If true, the tool does not modify its environment
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getReadOnlyHint() {
        return this.ReadOnlyHint;
    }

    /**
     * Set If true, the tool does not modify its environment
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReadOnlyHint If true, the tool does not modify its environment
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReadOnlyHint(Boolean ReadOnlyHint) {
        this.ReadOnlyHint = ReadOnlyHint;
    }

    /**
     * Get If true, the tool may perform destructive updates
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DestructiveHint If true, the tool may perform destructive updates
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getDestructiveHint() {
        return this.DestructiveHint;
    }

    /**
     * Set If true, the tool may perform destructive updates
注意：此字段可能返回 null，表示取不到有效值。
     * @param DestructiveHint If true, the tool may perform destructive updates
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDestructiveHint(Boolean DestructiveHint) {
        this.DestructiveHint = DestructiveHint;
    }

    /**
     * Get If true, repeated calls with same args have no additional effect
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IdempotentHint If true, repeated calls with same args have no additional effect
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIdempotentHint() {
        return this.IdempotentHint;
    }

    /**
     * Set If true, repeated calls with same args have no additional effect
注意：此字段可能返回 null，表示取不到有效值。
     * @param IdempotentHint If true, repeated calls with same args have no additional effect
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIdempotentHint(Boolean IdempotentHint) {
        this.IdempotentHint = IdempotentHint;
    }

    /**
     * Get If true, tool interacts with external entities
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OpenWorldHint If true, tool interacts with external entities
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getOpenWorldHint() {
        return this.OpenWorldHint;
    }

    /**
     * Set If true, tool interacts with external entities
注意：此字段可能返回 null，表示取不到有效值。
     * @param OpenWorldHint If true, tool interacts with external entities
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOpenWorldHint(Boolean OpenWorldHint) {
        this.OpenWorldHint = OpenWorldHint;
    }

    public McpToolAnnotation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public McpToolAnnotation(McpToolAnnotation source) {
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.ReadOnlyHint != null) {
            this.ReadOnlyHint = new Boolean(source.ReadOnlyHint);
        }
        if (source.DestructiveHint != null) {
            this.DestructiveHint = new Boolean(source.DestructiveHint);
        }
        if (source.IdempotentHint != null) {
            this.IdempotentHint = new Boolean(source.IdempotentHint);
        }
        if (source.OpenWorldHint != null) {
            this.OpenWorldHint = new Boolean(source.OpenWorldHint);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "ReadOnlyHint", this.ReadOnlyHint);
        this.setParamSimple(map, prefix + "DestructiveHint", this.DestructiveHint);
        this.setParamSimple(map, prefix + "IdempotentHint", this.IdempotentHint);
        this.setParamSimple(map, prefix + "OpenWorldHint", this.OpenWorldHint);

    }
}

