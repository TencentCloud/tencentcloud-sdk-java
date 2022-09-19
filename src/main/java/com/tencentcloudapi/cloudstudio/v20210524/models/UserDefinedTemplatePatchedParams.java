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
package com.tencentcloudapi.cloudstudio.v20210524.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserDefinedTemplatePatchedParams extends AbstractModel{

    /**
    * 模板来源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 模板名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 模板图标地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Icon")
    @Expose
    private String Icon;

    /**
    * 模板描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 模板标签列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
     * Get 模板来源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Source 模板来源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 模板来源
注意：此字段可能返回 null，表示取不到有效值。
     * @param Source 模板来源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 模板名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 模板名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 模板名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 模板名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 模板图标地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Icon 模板图标地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIcon() {
        return this.Icon;
    }

    /**
     * Set 模板图标地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param Icon 模板图标地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIcon(String Icon) {
        this.Icon = Icon;
    }

    /**
     * Get 模板描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 模板描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 模板描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 模板描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 模板标签列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 模板标签列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set 模板标签列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 模板标签列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    public UserDefinedTemplatePatchedParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserDefinedTemplatePatchedParams(UserDefinedTemplatePatchedParams source) {
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Icon != null) {
            this.Icon = new String(source.Icon);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Icon", this.Icon);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);

    }
}

