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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Fragment extends AbstractModel {

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
    * 表字段描述
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 片段内容
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 片段语言
    */
    @SerializedName("Lang")
    @Expose
    private String Lang;

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
     * Get 表字段描述 
     * @return Comment 表字段描述
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 表字段描述
     * @param Comment 表字段描述
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 片段内容 
     * @return Content 片段内容
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 片段内容
     * @param Content 片段内容
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 片段语言 
     * @return Lang 片段语言
     */
    public String getLang() {
        return this.Lang;
    }

    /**
     * Set 片段语言
     * @param Lang 片段语言
     */
    public void setLang(String Lang) {
        this.Lang = Lang;
    }

    public Fragment() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Fragment(Fragment source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Lang != null) {
            this.Lang = new String(source.Lang);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Lang", this.Lang);

    }
}

