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
package com.tencentcloudapi.trp.v20210515.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TraceItem extends AbstractModel {

    /**
    * 字段名称
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
    * 字段类型
text:文本类型, 
longtext:长文本类型, banner:单图片类型, image:多图片类型,
video:视频类型,
mp:小程序类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 多个值
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
    * 只读
    */
    @SerializedName("ReadOnly")
    @Expose
    private Boolean ReadOnly;

    /**
    * 扫码展示
    */
    @SerializedName("Hidden")
    @Expose
    private Boolean Hidden;

    /**
    * 类型标识
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 扩展字段
    */
    @SerializedName("Ext")
    @Expose
    private String Ext;

    /**
    * 额外属性
    */
    @SerializedName("Attrs")
    @Expose
    private TraceItem [] Attrs;

    /**
    * 子页面，只读
    */
    @SerializedName("List")
    @Expose
    private TraceData [] List;

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

    /**
     * Get 字段类型
text:文本类型, 
longtext:长文本类型, banner:单图片类型, image:多图片类型,
video:视频类型,
mp:小程序类型 
     * @return Type 字段类型
text:文本类型, 
longtext:长文本类型, banner:单图片类型, image:多图片类型,
video:视频类型,
mp:小程序类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 字段类型
text:文本类型, 
longtext:长文本类型, banner:单图片类型, image:多图片类型,
video:视频类型,
mp:小程序类型
     * @param Type 字段类型
text:文本类型, 
longtext:长文本类型, banner:单图片类型, image:多图片类型,
video:视频类型,
mp:小程序类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 多个值 
     * @return Values 多个值
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set 多个值
     * @param Values 多个值
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    /**
     * Get 只读 
     * @return ReadOnly 只读
     */
    public Boolean getReadOnly() {
        return this.ReadOnly;
    }

    /**
     * Set 只读
     * @param ReadOnly 只读
     */
    public void setReadOnly(Boolean ReadOnly) {
        this.ReadOnly = ReadOnly;
    }

    /**
     * Get 扫码展示 
     * @return Hidden 扫码展示
     */
    public Boolean getHidden() {
        return this.Hidden;
    }

    /**
     * Set 扫码展示
     * @param Hidden 扫码展示
     */
    public void setHidden(Boolean Hidden) {
        this.Hidden = Hidden;
    }

    /**
     * Get 类型标识 
     * @return Key 类型标识
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 类型标识
     * @param Key 类型标识
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 扩展字段 
     * @return Ext 扩展字段
     */
    public String getExt() {
        return this.Ext;
    }

    /**
     * Set 扩展字段
     * @param Ext 扩展字段
     */
    public void setExt(String Ext) {
        this.Ext = Ext;
    }

    /**
     * Get 额外属性 
     * @return Attrs 额外属性
     */
    public TraceItem [] getAttrs() {
        return this.Attrs;
    }

    /**
     * Set 额外属性
     * @param Attrs 额外属性
     */
    public void setAttrs(TraceItem [] Attrs) {
        this.Attrs = Attrs;
    }

    /**
     * Get 子页面，只读 
     * @return List 子页面，只读
     */
    public TraceData [] getList() {
        return this.List;
    }

    /**
     * Set 子页面，只读
     * @param List 子页面，只读
     */
    public void setList(TraceData [] List) {
        this.List = List;
    }

    public TraceItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TraceItem(TraceItem source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Values != null) {
            this.Values = new String[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new String(source.Values[i]);
            }
        }
        if (source.ReadOnly != null) {
            this.ReadOnly = new Boolean(source.ReadOnly);
        }
        if (source.Hidden != null) {
            this.Hidden = new Boolean(source.Hidden);
        }
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Ext != null) {
            this.Ext = new String(source.Ext);
        }
        if (source.Attrs != null) {
            this.Attrs = new TraceItem[source.Attrs.length];
            for (int i = 0; i < source.Attrs.length; i++) {
                this.Attrs[i] = new TraceItem(source.Attrs[i]);
            }
        }
        if (source.List != null) {
            this.List = new TraceData[source.List.length];
            for (int i = 0; i < source.List.length; i++) {
                this.List[i] = new TraceData(source.List[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);
        this.setParamSimple(map, prefix + "ReadOnly", this.ReadOnly);
        this.setParamSimple(map, prefix + "Hidden", this.Hidden);
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Ext", this.Ext);
        this.setParamArrayObj(map, prefix + "Attrs.", this.Attrs);
        this.setParamArrayObj(map, prefix + "List.", this.List);

    }
}

