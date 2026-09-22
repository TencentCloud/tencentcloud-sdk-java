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
package com.tencentcloudapi.workbuddyenterprise.v20260709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class A2ASkillInput extends AbstractModel {

    /**
    * <p>A2A skill ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("A2ASkillId")
    @Expose
    private String A2ASkillId;

    /**
    * <p>skill 名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>skill 描述</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>标签</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * <p>示例</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Examples")
    @Expose
    private String [] Examples;

    /**
     * Get <p>A2A skill ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return A2ASkillId <p>A2A skill ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getA2ASkillId() {
        return this.A2ASkillId;
    }

    /**
     * Set <p>A2A skill ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param A2ASkillId <p>A2A skill ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setA2ASkillId(String A2ASkillId) {
        this.A2ASkillId = A2ASkillId;
    }

    /**
     * Get <p>skill 名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name <p>skill 名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>skill 名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name <p>skill 名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>skill 描述</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description <p>skill 描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>skill 描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description <p>skill 描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>标签</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags <p>标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags <p>标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>示例</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Examples <p>示例</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getExamples() {
        return this.Examples;
    }

    /**
     * Set <p>示例</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Examples <p>示例</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExamples(String [] Examples) {
        this.Examples = Examples;
    }

    public A2ASkillInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public A2ASkillInput(A2ASkillInput source) {
        if (source.A2ASkillId != null) {
            this.A2ASkillId = new String(source.A2ASkillId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.Examples != null) {
            this.Examples = new String[source.Examples.length];
            for (int i = 0; i < source.Examples.length; i++) {
                this.Examples[i] = new String(source.Examples[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "A2ASkillId", this.A2ASkillId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamArraySimple(map, prefix + "Examples.", this.Examples);

    }
}

