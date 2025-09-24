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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TokenRuleEntryValue extends AbstractModel {

    /**
    * 布尔类型值
    */
    @SerializedName("LogicValue")
    @Expose
    private Boolean LogicValue;

    /**
    * 数组类型值
可以存储字符串/数值
如果只有一个元素，则为长度为1的数组
    */
    @SerializedName("MultiValue")
    @Expose
    private String [] MultiValue;

    /**
    * 指示有效的字段
    */
    @SerializedName("ValidKey")
    @Expose
    private String ValidKey;

    /**
     * Get 布尔类型值 
     * @return LogicValue 布尔类型值
     */
    public Boolean getLogicValue() {
        return this.LogicValue;
    }

    /**
     * Set 布尔类型值
     * @param LogicValue 布尔类型值
     */
    public void setLogicValue(Boolean LogicValue) {
        this.LogicValue = LogicValue;
    }

    /**
     * Get 数组类型值
可以存储字符串/数值
如果只有一个元素，则为长度为1的数组 
     * @return MultiValue 数组类型值
可以存储字符串/数值
如果只有一个元素，则为长度为1的数组
     */
    public String [] getMultiValue() {
        return this.MultiValue;
    }

    /**
     * Set 数组类型值
可以存储字符串/数值
如果只有一个元素，则为长度为1的数组
     * @param MultiValue 数组类型值
可以存储字符串/数值
如果只有一个元素，则为长度为1的数组
     */
    public void setMultiValue(String [] MultiValue) {
        this.MultiValue = MultiValue;
    }

    /**
     * Get 指示有效的字段 
     * @return ValidKey 指示有效的字段
     */
    public String getValidKey() {
        return this.ValidKey;
    }

    /**
     * Set 指示有效的字段
     * @param ValidKey 指示有效的字段
     */
    public void setValidKey(String ValidKey) {
        this.ValidKey = ValidKey;
    }

    public TokenRuleEntryValue() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TokenRuleEntryValue(TokenRuleEntryValue source) {
        if (source.LogicValue != null) {
            this.LogicValue = new Boolean(source.LogicValue);
        }
        if (source.MultiValue != null) {
            this.MultiValue = new String[source.MultiValue.length];
            for (int i = 0; i < source.MultiValue.length; i++) {
                this.MultiValue[i] = new String(source.MultiValue[i]);
            }
        }
        if (source.ValidKey != null) {
            this.ValidKey = new String(source.ValidKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogicValue", this.LogicValue);
        this.setParamArraySimple(map, prefix + "MultiValue.", this.MultiValue);
        this.setParamSimple(map, prefix + "ValidKey", this.ValidKey);

    }
}

