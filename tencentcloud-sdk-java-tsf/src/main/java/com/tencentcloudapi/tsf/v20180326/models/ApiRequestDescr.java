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

public class ApiRequestDescr extends AbstractModel{

    /**
    * 参数名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 参数类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 参数位置
    */
    @SerializedName("In")
    @Expose
    private String In;

    /**
    * 参数描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 参数是否必须
    */
    @SerializedName("Required")
    @Expose
    private Boolean Required;

    /**
    * 参数的默认值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DefaultValue")
    @Expose
    private String DefaultValue;

    /**
     * Get 参数名称 
     * @return Name 参数名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 参数名称
     * @param Name 参数名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 参数类型 
     * @return Type 参数类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 参数类型
     * @param Type 参数类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 参数位置 
     * @return In 参数位置
     */
    public String getIn() {
        return this.In;
    }

    /**
     * Set 参数位置
     * @param In 参数位置
     */
    public void setIn(String In) {
        this.In = In;
    }

    /**
     * Get 参数描述 
     * @return Description 参数描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 参数描述
     * @param Description 参数描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 参数是否必须 
     * @return Required 参数是否必须
     */
    public Boolean getRequired() {
        return this.Required;
    }

    /**
     * Set 参数是否必须
     * @param Required 参数是否必须
     */
    public void setRequired(Boolean Required) {
        this.Required = Required;
    }

    /**
     * Get 参数的默认值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DefaultValue 参数的默认值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDefaultValue() {
        return this.DefaultValue;
    }

    /**
     * Set 参数的默认值
注意：此字段可能返回 null，表示取不到有效值。
     * @param DefaultValue 参数的默认值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDefaultValue(String DefaultValue) {
        this.DefaultValue = DefaultValue;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "In", this.In);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Required", this.Required);
        this.setParamSimple(map, prefix + "DefaultValue", this.DefaultValue);

    }
}

