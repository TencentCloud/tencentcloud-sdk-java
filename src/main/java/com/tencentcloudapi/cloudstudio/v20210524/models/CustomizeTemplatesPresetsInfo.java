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

public class CustomizeTemplatesPresetsInfo extends AbstractModel{

    /**
    * 模板tag列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * 模板图标列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Icons")
    @Expose
    private String [] Icons;

    /**
    * 无
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Templates")
    @Expose
    private UserDefinedTemplateParams Templates;

    /**
     * Get 模板tag列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 模板tag列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set 模板tag列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 模板tag列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 模板图标列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Icons 模板图标列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getIcons() {
        return this.Icons;
    }

    /**
     * Set 模板图标列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Icons 模板图标列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIcons(String [] Icons) {
        this.Icons = Icons;
    }

    /**
     * Get 无
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Templates 无
注意：此字段可能返回 null，表示取不到有效值。
     */
    public UserDefinedTemplateParams getTemplates() {
        return this.Templates;
    }

    /**
     * Set 无
注意：此字段可能返回 null，表示取不到有效值。
     * @param Templates 无
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTemplates(UserDefinedTemplateParams Templates) {
        this.Templates = Templates;
    }

    public CustomizeTemplatesPresetsInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomizeTemplatesPresetsInfo(CustomizeTemplatesPresetsInfo source) {
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.Icons != null) {
            this.Icons = new String[source.Icons.length];
            for (int i = 0; i < source.Icons.length; i++) {
                this.Icons[i] = new String(source.Icons[i]);
            }
        }
        if (source.Templates != null) {
            this.Templates = new UserDefinedTemplateParams(source.Templates);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamArraySimple(map, prefix + "Icons.", this.Icons);
        this.setParamObj(map, prefix + "Templates.", this.Templates);

    }
}

