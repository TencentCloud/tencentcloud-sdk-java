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
package com.tencentcloudapi.cat.v20180409.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Label extends AbstractModel{

    /**
    * 自定义字段编号
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * 自定义字段名称/说明
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 字段值
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get 自定义字段编号 
     * @return ID 自定义字段编号
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set 自定义字段编号
     * @param ID 自定义字段编号
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get 自定义字段名称/说明 
     * @return Name 自定义字段名称/说明
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 自定义字段名称/说明
     * @param Name 自定义字段名称/说明
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 字段值 
     * @return Value 字段值
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 字段值
     * @param Value 字段值
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public Label() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Label(Label source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

