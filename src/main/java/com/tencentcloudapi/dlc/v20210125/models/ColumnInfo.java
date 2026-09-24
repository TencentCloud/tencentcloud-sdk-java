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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ColumnInfo extends AbstractModel {

    /**
    * <p>字段名</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>字段类型</p><p>枚举值：</p><ul><li>integer： 数值类型</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>字段描述</p>
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * <p>字段设置（已废弃）</p>
    */
    @SerializedName("FieldSetting")
    @Expose
    private String FieldSetting;

    /**
    * <p>是否为主键（已废弃）</p><p>枚举值：</p><ul><li>true： 是主键</li></ul>
    */
    @SerializedName("IsPrimaryKey")
    @Expose
    private Boolean IsPrimaryKey;

    /**
    * <p>字段类型 sqlType 格式</p>
    */
    @SerializedName("TypeText")
    @Expose
    private String TypeText;

    /**
     * Get <p>字段名</p> 
     * @return Name <p>字段名</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>字段名</p>
     * @param Name <p>字段名</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>字段类型</p><p>枚举值：</p><ul><li>integer： 数值类型</li></ul> 
     * @return Type <p>字段类型</p><p>枚举值：</p><ul><li>integer： 数值类型</li></ul>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>字段类型</p><p>枚举值：</p><ul><li>integer： 数值类型</li></ul>
     * @param Type <p>字段类型</p><p>枚举值：</p><ul><li>integer： 数值类型</li></ul>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>字段描述</p> 
     * @return Comment <p>字段描述</p>
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set <p>字段描述</p>
     * @param Comment <p>字段描述</p>
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get <p>字段设置（已废弃）</p> 
     * @return FieldSetting <p>字段设置（已废弃）</p>
     */
    public String getFieldSetting() {
        return this.FieldSetting;
    }

    /**
     * Set <p>字段设置（已废弃）</p>
     * @param FieldSetting <p>字段设置（已废弃）</p>
     */
    public void setFieldSetting(String FieldSetting) {
        this.FieldSetting = FieldSetting;
    }

    /**
     * Get <p>是否为主键（已废弃）</p><p>枚举值：</p><ul><li>true： 是主键</li></ul> 
     * @return IsPrimaryKey <p>是否为主键（已废弃）</p><p>枚举值：</p><ul><li>true： 是主键</li></ul>
     */
    public Boolean getIsPrimaryKey() {
        return this.IsPrimaryKey;
    }

    /**
     * Set <p>是否为主键（已废弃）</p><p>枚举值：</p><ul><li>true： 是主键</li></ul>
     * @param IsPrimaryKey <p>是否为主键（已废弃）</p><p>枚举值：</p><ul><li>true： 是主键</li></ul>
     */
    public void setIsPrimaryKey(Boolean IsPrimaryKey) {
        this.IsPrimaryKey = IsPrimaryKey;
    }

    /**
     * Get <p>字段类型 sqlType 格式</p> 
     * @return TypeText <p>字段类型 sqlType 格式</p>
     */
    public String getTypeText() {
        return this.TypeText;
    }

    /**
     * Set <p>字段类型 sqlType 格式</p>
     * @param TypeText <p>字段类型 sqlType 格式</p>
     */
    public void setTypeText(String TypeText) {
        this.TypeText = TypeText;
    }

    public ColumnInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ColumnInfo(ColumnInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.FieldSetting != null) {
            this.FieldSetting = new String(source.FieldSetting);
        }
        if (source.IsPrimaryKey != null) {
            this.IsPrimaryKey = new Boolean(source.IsPrimaryKey);
        }
        if (source.TypeText != null) {
            this.TypeText = new String(source.TypeText);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "FieldSetting", this.FieldSetting);
        this.setParamSimple(map, prefix + "IsPrimaryKey", this.IsPrimaryKey);
        this.setParamSimple(map, prefix + "TypeText", this.TypeText);

    }
}

