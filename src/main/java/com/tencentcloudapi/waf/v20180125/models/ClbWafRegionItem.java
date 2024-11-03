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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClbWafRegionItem extends AbstractModel {

    /**
    * 地域ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 地域中文说明
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 地域英文全拼
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 地域编码
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
     * Get 地域ID 
     * @return Id 地域ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 地域ID
     * @param Id 地域ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 地域中文说明 
     * @return Text 地域中文说明
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 地域中文说明
     * @param Text 地域中文说明
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get 地域英文全拼 
     * @return Value 地域英文全拼
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 地域英文全拼
     * @param Value 地域英文全拼
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get 地域编码 
     * @return Code 地域编码
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set 地域编码
     * @param Code 地域编码
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    public ClbWafRegionItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClbWafRegionItem(ClbWafRegionItem source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Code", this.Code);

    }
}

