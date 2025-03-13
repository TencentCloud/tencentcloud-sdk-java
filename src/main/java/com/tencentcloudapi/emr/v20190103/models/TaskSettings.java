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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskSettings extends AbstractModel {

    /**
    * 参数名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 参数值
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 参数唯一标记
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 是否可编辑，”true" "false"
    */
    @SerializedName("Editable")
    @Expose
    private String Editable;

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
     * Get 参数值 
     * @return Value 参数值
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 参数值
     * @param Value 参数值
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get 参数唯一标记 
     * @return Key 参数唯一标记
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 参数唯一标记
     * @param Key 参数唯一标记
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 是否可编辑，”true" "false" 
     * @return Editable 是否可编辑，”true" "false"
     */
    public String getEditable() {
        return this.Editable;
    }

    /**
     * Set 是否可编辑，”true" "false"
     * @param Editable 是否可编辑，”true" "false"
     */
    public void setEditable(String Editable) {
        this.Editable = Editable;
    }

    public TaskSettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskSettings(TaskSettings source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Editable != null) {
            this.Editable = new String(source.Editable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Editable", this.Editable);

    }
}

