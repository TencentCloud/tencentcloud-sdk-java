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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class JsonInfo extends AbstractModel{

    /**
    * 启用标志
    */
    @SerializedName("EnableTag")
    @Expose
    private Boolean EnableTag;

    /**
    * 元数据信息列表, 可选值为 __SOURCE__、__FILENAME__、__TIMESTAMP__。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MetaFields")
    @Expose
    private String [] MetaFields;

    /**
     * Get 启用标志 
     * @return EnableTag 启用标志
     */
    public Boolean getEnableTag() {
        return this.EnableTag;
    }

    /**
     * Set 启用标志
     * @param EnableTag 启用标志
     */
    public void setEnableTag(Boolean EnableTag) {
        this.EnableTag = EnableTag;
    }

    /**
     * Get 元数据信息列表, 可选值为 __SOURCE__、__FILENAME__、__TIMESTAMP__。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MetaFields 元数据信息列表, 可选值为 __SOURCE__、__FILENAME__、__TIMESTAMP__。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getMetaFields() {
        return this.MetaFields;
    }

    /**
     * Set 元数据信息列表, 可选值为 __SOURCE__、__FILENAME__、__TIMESTAMP__。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MetaFields 元数据信息列表, 可选值为 __SOURCE__、__FILENAME__、__TIMESTAMP__。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetaFields(String [] MetaFields) {
        this.MetaFields = MetaFields;
    }

    public JsonInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public JsonInfo(JsonInfo source) {
        if (source.EnableTag != null) {
            this.EnableTag = new Boolean(source.EnableTag);
        }
        if (source.MetaFields != null) {
            this.MetaFields = new String[source.MetaFields.length];
            for (int i = 0; i < source.MetaFields.length; i++) {
                this.MetaFields[i] = new String(source.MetaFields[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnableTag", this.EnableTag);
        this.setParamArraySimple(map, prefix + "MetaFields.", this.MetaFields);

    }
}

