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

public class FieldInfo extends AbstractModel {

    /**
    * <p>字段名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>字段描述</p>
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * <p>字段类型</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>语言类型</p>
    */
    @SerializedName("Lang")
    @Expose
    private String Lang;

    /**
    * <p>字段内容或代码片段</p>
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * <p>字段采样值</p>
    */
    @SerializedName("SampleValues")
    @Expose
    private String [] SampleValues;

    /**
     * Get <p>字段名称</p> 
     * @return Name <p>字段名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>字段名称</p>
     * @param Name <p>字段名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
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
     * Get <p>字段类型</p> 
     * @return Type <p>字段类型</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>字段类型</p>
     * @param Type <p>字段类型</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>语言类型</p> 
     * @return Lang <p>语言类型</p>
     */
    public String getLang() {
        return this.Lang;
    }

    /**
     * Set <p>语言类型</p>
     * @param Lang <p>语言类型</p>
     */
    public void setLang(String Lang) {
        this.Lang = Lang;
    }

    /**
     * Get <p>字段内容或代码片段</p> 
     * @return Content <p>字段内容或代码片段</p>
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set <p>字段内容或代码片段</p>
     * @param Content <p>字段内容或代码片段</p>
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get <p>字段采样值</p> 
     * @return SampleValues <p>字段采样值</p>
     */
    public String [] getSampleValues() {
        return this.SampleValues;
    }

    /**
     * Set <p>字段采样值</p>
     * @param SampleValues <p>字段采样值</p>
     */
    public void setSampleValues(String [] SampleValues) {
        this.SampleValues = SampleValues;
    }

    public FieldInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FieldInfo(FieldInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Lang != null) {
            this.Lang = new String(source.Lang);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.SampleValues != null) {
            this.SampleValues = new String[source.SampleValues.length];
            for (int i = 0; i < source.SampleValues.length; i++) {
                this.SampleValues[i] = new String(source.SampleValues[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Lang", this.Lang);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamArraySimple(map, prefix + "SampleValues.", this.SampleValues);

    }
}

