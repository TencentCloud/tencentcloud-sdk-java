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
package com.tencentcloudapi.tdai.v20250717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VDBFieldMap extends AbstractModel {

    /**
    * <p>vdb document字段名</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>vdb document字段值</p>
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * <p>vdb document字段类型</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>字段描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get <p>vdb document字段名</p> 
     * @return Name <p>vdb document字段名</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>vdb document字段名</p>
     * @param Name <p>vdb document字段名</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>vdb document字段值</p> 
     * @return Value <p>vdb document字段值</p>
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set <p>vdb document字段值</p>
     * @param Value <p>vdb document字段值</p>
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get <p>vdb document字段类型</p> 
     * @return Type <p>vdb document字段类型</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>vdb document字段类型</p>
     * @param Type <p>vdb document字段类型</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>字段描述</p> 
     * @return Description <p>字段描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>字段描述</p>
     * @param Description <p>字段描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public VDBFieldMap() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VDBFieldMap(VDBFieldMap source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

