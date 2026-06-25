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
package com.tencentcloudapi.cngw.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CNAPIGwMCPToolParam extends AbstractModel {

    /**
    * <p>名字</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>参数类型</p><p>枚举值：</p><ul><li>string： 字符串</li><li>number： 数字</li><li>boolean： 布尔</li><li>array： 数组</li><li>object： 对象</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>必填</p>
    */
    @SerializedName("Required")
    @Expose
    private Boolean Required;

    /**
    * <p>位置</p><p>枚举值：</p><ul><li>query： query</li><li>path： query</li><li>header： header</li><li>body： body</li></ul>
    */
    @SerializedName("Position")
    @Expose
    private String Position;

    /**
    * <p>描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>默认值</p>
    */
    @SerializedName("Default")
    @Expose
    private String Default;

    /**
    * <p>数组子项</p>
    */
    @SerializedName("Items")
    @Expose
    private CNAPIGwMCPToolParam Items;

    /**
    * <p>对象属性</p>
    */
    @SerializedName("Properties")
    @Expose
    private CNAPIGwMCPToolParam [] Properties;

    /**
    * <p>转发到后端的名称</p><p>不填则使用原始名称</p>
    */
    @SerializedName("BackendName")
    @Expose
    private String BackendName;

    /**
     * Get <p>名字</p> 
     * @return Name <p>名字</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>名字</p>
     * @param Name <p>名字</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>参数类型</p><p>枚举值：</p><ul><li>string： 字符串</li><li>number： 数字</li><li>boolean： 布尔</li><li>array： 数组</li><li>object： 对象</li></ul> 
     * @return Type <p>参数类型</p><p>枚举值：</p><ul><li>string： 字符串</li><li>number： 数字</li><li>boolean： 布尔</li><li>array： 数组</li><li>object： 对象</li></ul>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>参数类型</p><p>枚举值：</p><ul><li>string： 字符串</li><li>number： 数字</li><li>boolean： 布尔</li><li>array： 数组</li><li>object： 对象</li></ul>
     * @param Type <p>参数类型</p><p>枚举值：</p><ul><li>string： 字符串</li><li>number： 数字</li><li>boolean： 布尔</li><li>array： 数组</li><li>object： 对象</li></ul>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>必填</p> 
     * @return Required <p>必填</p>
     */
    public Boolean getRequired() {
        return this.Required;
    }

    /**
     * Set <p>必填</p>
     * @param Required <p>必填</p>
     */
    public void setRequired(Boolean Required) {
        this.Required = Required;
    }

    /**
     * Get <p>位置</p><p>枚举值：</p><ul><li>query： query</li><li>path： query</li><li>header： header</li><li>body： body</li></ul> 
     * @return Position <p>位置</p><p>枚举值：</p><ul><li>query： query</li><li>path： query</li><li>header： header</li><li>body： body</li></ul>
     */
    public String getPosition() {
        return this.Position;
    }

    /**
     * Set <p>位置</p><p>枚举值：</p><ul><li>query： query</li><li>path： query</li><li>header： header</li><li>body： body</li></ul>
     * @param Position <p>位置</p><p>枚举值：</p><ul><li>query： query</li><li>path： query</li><li>header： header</li><li>body： body</li></ul>
     */
    public void setPosition(String Position) {
        this.Position = Position;
    }

    /**
     * Get <p>描述</p> 
     * @return Description <p>描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述</p>
     * @param Description <p>描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>默认值</p> 
     * @return Default <p>默认值</p>
     */
    public String getDefault() {
        return this.Default;
    }

    /**
     * Set <p>默认值</p>
     * @param Default <p>默认值</p>
     */
    public void setDefault(String Default) {
        this.Default = Default;
    }

    /**
     * Get <p>数组子项</p> 
     * @return Items <p>数组子项</p>
     */
    public CNAPIGwMCPToolParam getItems() {
        return this.Items;
    }

    /**
     * Set <p>数组子项</p>
     * @param Items <p>数组子项</p>
     */
    public void setItems(CNAPIGwMCPToolParam Items) {
        this.Items = Items;
    }

    /**
     * Get <p>对象属性</p> 
     * @return Properties <p>对象属性</p>
     */
    public CNAPIGwMCPToolParam [] getProperties() {
        return this.Properties;
    }

    /**
     * Set <p>对象属性</p>
     * @param Properties <p>对象属性</p>
     */
    public void setProperties(CNAPIGwMCPToolParam [] Properties) {
        this.Properties = Properties;
    }

    /**
     * Get <p>转发到后端的名称</p><p>不填则使用原始名称</p> 
     * @return BackendName <p>转发到后端的名称</p><p>不填则使用原始名称</p>
     */
    public String getBackendName() {
        return this.BackendName;
    }

    /**
     * Set <p>转发到后端的名称</p><p>不填则使用原始名称</p>
     * @param BackendName <p>转发到后端的名称</p><p>不填则使用原始名称</p>
     */
    public void setBackendName(String BackendName) {
        this.BackendName = BackendName;
    }

    public CNAPIGwMCPToolParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CNAPIGwMCPToolParam(CNAPIGwMCPToolParam source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Required != null) {
            this.Required = new Boolean(source.Required);
        }
        if (source.Position != null) {
            this.Position = new String(source.Position);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Default != null) {
            this.Default = new String(source.Default);
        }
        if (source.Items != null) {
            this.Items = new CNAPIGwMCPToolParam(source.Items);
        }
        if (source.Properties != null) {
            this.Properties = new CNAPIGwMCPToolParam[source.Properties.length];
            for (int i = 0; i < source.Properties.length; i++) {
                this.Properties[i] = new CNAPIGwMCPToolParam(source.Properties[i]);
            }
        }
        if (source.BackendName != null) {
            this.BackendName = new String(source.BackendName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Required", this.Required);
        this.setParamSimple(map, prefix + "Position", this.Position);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Default", this.Default);
        this.setParamObj(map, prefix + "Items.", this.Items);
        this.setParamArrayObj(map, prefix + "Properties.", this.Properties);
        this.setParamSimple(map, prefix + "BackendName", this.BackendName);

    }
}

