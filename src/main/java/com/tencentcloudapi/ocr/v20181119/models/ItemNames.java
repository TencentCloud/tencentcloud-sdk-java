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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ItemNames extends AbstractModel {

    /**
    * <p>自定义抽取功能需返回的字段名称。</p>
    */
    @SerializedName("KeyName")
    @Expose
    private String KeyName;

    /**
    * <p>默认 0；0表示kv对  1表示 表格字段。</p>
    */
    @SerializedName("KeyType")
    @Expose
    private Long KeyType;

    /**
    * <p>抽取字段的描述内容。</p>
    */
    @SerializedName("KeyPrompt")
    @Expose
    private String KeyPrompt;

    /**
    * <p>自定义字段对应期望的值内容（这个一般需要对字段审核比对才需要输入）。</p>
    */
    @SerializedName("KeyExpectedValue")
    @Expose
    private String KeyExpectedValue;

    /**
    * <p>自定义字段审核比对的规则prompt。</p><p>比如keyname是姓名，KeyExpectedValue 张三，KeyAuditPrompt设置为“字符需要完全匹配则审核返回正确”/“字符匹配90%就审核返回正确”</p>
    */
    @SerializedName("KeyAuditPrompt")
    @Expose
    private String KeyAuditPrompt;

    /**
     * Get <p>自定义抽取功能需返回的字段名称。</p> 
     * @return KeyName <p>自定义抽取功能需返回的字段名称。</p>
     */
    public String getKeyName() {
        return this.KeyName;
    }

    /**
     * Set <p>自定义抽取功能需返回的字段名称。</p>
     * @param KeyName <p>自定义抽取功能需返回的字段名称。</p>
     */
    public void setKeyName(String KeyName) {
        this.KeyName = KeyName;
    }

    /**
     * Get <p>默认 0；0表示kv对  1表示 表格字段。</p> 
     * @return KeyType <p>默认 0；0表示kv对  1表示 表格字段。</p>
     */
    public Long getKeyType() {
        return this.KeyType;
    }

    /**
     * Set <p>默认 0；0表示kv对  1表示 表格字段。</p>
     * @param KeyType <p>默认 0；0表示kv对  1表示 表格字段。</p>
     */
    public void setKeyType(Long KeyType) {
        this.KeyType = KeyType;
    }

    /**
     * Get <p>抽取字段的描述内容。</p> 
     * @return KeyPrompt <p>抽取字段的描述内容。</p>
     */
    public String getKeyPrompt() {
        return this.KeyPrompt;
    }

    /**
     * Set <p>抽取字段的描述内容。</p>
     * @param KeyPrompt <p>抽取字段的描述内容。</p>
     */
    public void setKeyPrompt(String KeyPrompt) {
        this.KeyPrompt = KeyPrompt;
    }

    /**
     * Get <p>自定义字段对应期望的值内容（这个一般需要对字段审核比对才需要输入）。</p> 
     * @return KeyExpectedValue <p>自定义字段对应期望的值内容（这个一般需要对字段审核比对才需要输入）。</p>
     */
    public String getKeyExpectedValue() {
        return this.KeyExpectedValue;
    }

    /**
     * Set <p>自定义字段对应期望的值内容（这个一般需要对字段审核比对才需要输入）。</p>
     * @param KeyExpectedValue <p>自定义字段对应期望的值内容（这个一般需要对字段审核比对才需要输入）。</p>
     */
    public void setKeyExpectedValue(String KeyExpectedValue) {
        this.KeyExpectedValue = KeyExpectedValue;
    }

    /**
     * Get <p>自定义字段审核比对的规则prompt。</p><p>比如keyname是姓名，KeyExpectedValue 张三，KeyAuditPrompt设置为“字符需要完全匹配则审核返回正确”/“字符匹配90%就审核返回正确”</p> 
     * @return KeyAuditPrompt <p>自定义字段审核比对的规则prompt。</p><p>比如keyname是姓名，KeyExpectedValue 张三，KeyAuditPrompt设置为“字符需要完全匹配则审核返回正确”/“字符匹配90%就审核返回正确”</p>
     */
    public String getKeyAuditPrompt() {
        return this.KeyAuditPrompt;
    }

    /**
     * Set <p>自定义字段审核比对的规则prompt。</p><p>比如keyname是姓名，KeyExpectedValue 张三，KeyAuditPrompt设置为“字符需要完全匹配则审核返回正确”/“字符匹配90%就审核返回正确”</p>
     * @param KeyAuditPrompt <p>自定义字段审核比对的规则prompt。</p><p>比如keyname是姓名，KeyExpectedValue 张三，KeyAuditPrompt设置为“字符需要完全匹配则审核返回正确”/“字符匹配90%就审核返回正确”</p>
     */
    public void setKeyAuditPrompt(String KeyAuditPrompt) {
        this.KeyAuditPrompt = KeyAuditPrompt;
    }

    public ItemNames() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ItemNames(ItemNames source) {
        if (source.KeyName != null) {
            this.KeyName = new String(source.KeyName);
        }
        if (source.KeyType != null) {
            this.KeyType = new Long(source.KeyType);
        }
        if (source.KeyPrompt != null) {
            this.KeyPrompt = new String(source.KeyPrompt);
        }
        if (source.KeyExpectedValue != null) {
            this.KeyExpectedValue = new String(source.KeyExpectedValue);
        }
        if (source.KeyAuditPrompt != null) {
            this.KeyAuditPrompt = new String(source.KeyAuditPrompt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyName", this.KeyName);
        this.setParamSimple(map, prefix + "KeyType", this.KeyType);
        this.setParamSimple(map, prefix + "KeyPrompt", this.KeyPrompt);
        this.setParamSimple(map, prefix + "KeyExpectedValue", this.KeyExpectedValue);
        this.setParamSimple(map, prefix + "KeyAuditPrompt", this.KeyAuditPrompt);

    }
}

