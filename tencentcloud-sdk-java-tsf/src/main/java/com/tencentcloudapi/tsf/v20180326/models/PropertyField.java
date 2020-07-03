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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PropertyField extends AbstractModel{

    /**
    * 属性名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 属性类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 属性描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 属性名称 
     * @return Name 属性名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 属性名称
     * @param Name 属性名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 属性类型 
     * @return Type 属性类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 属性类型
     * @param Type 属性类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 属性描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 属性描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 属性描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 属性描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

