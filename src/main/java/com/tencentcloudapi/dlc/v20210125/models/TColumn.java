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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TColumn extends AbstractModel{

    /**
    * 字段名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 字段类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 字段描述
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 字段默认值
    */
    @SerializedName("Default")
    @Expose
    private String Default;

    /**
    * 字段是否是非空
    */
    @SerializedName("NotNull")
    @Expose
    private Boolean NotNull;

    /**
     * Get 字段名称 
     * @return Name 字段名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 字段名称
     * @param Name 字段名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 字段类型 
     * @return Type 字段类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 字段类型
     * @param Type 字段类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 字段描述 
     * @return Comment 字段描述
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 字段描述
     * @param Comment 字段描述
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 字段默认值 
     * @return Default 字段默认值
     */
    public String getDefault() {
        return this.Default;
    }

    /**
     * Set 字段默认值
     * @param Default 字段默认值
     */
    public void setDefault(String Default) {
        this.Default = Default;
    }

    /**
     * Get 字段是否是非空 
     * @return NotNull 字段是否是非空
     */
    public Boolean getNotNull() {
        return this.NotNull;
    }

    /**
     * Set 字段是否是非空
     * @param NotNull 字段是否是非空
     */
    public void setNotNull(Boolean NotNull) {
        this.NotNull = NotNull;
    }

    public TColumn() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TColumn(TColumn source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.Default != null) {
            this.Default = new String(source.Default);
        }
        if (source.NotNull != null) {
            this.NotNull = new Boolean(source.NotNull);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "Default", this.Default);
        this.setParamSimple(map, prefix + "NotNull", this.NotNull);

    }
}

