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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HTTPServiceHeaderToAdd extends AbstractModel {

    /**
    * 添加头部的key
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 添加头部的值
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 添加头部的处理行为。默认：OVERWRITE_IF_EXISTS_OR_ADD。APPEND_IF_EXISTS_OR_ADD: 已存在时追加值，不存在时添加，ADD_IF_ABSENT:  仅在 header 不存在时添加，已存在时不做任何操作，OVERWRITE_IF_EXISTS_OR_ADD: 已存在时覆盖值，不存在时添加（默认值），OVERWRITE_IF_EXISTS: 仅在 header 已存在时覆盖值，不存在时不做任何操作
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
     * Get 添加头部的key 
     * @return Key 添加头部的key
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 添加头部的key
     * @param Key 添加头部的key
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 添加头部的值 
     * @return Value 添加头部的值
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 添加头部的值
     * @param Value 添加头部的值
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get 添加头部的处理行为。默认：OVERWRITE_IF_EXISTS_OR_ADD。APPEND_IF_EXISTS_OR_ADD: 已存在时追加值，不存在时添加，ADD_IF_ABSENT:  仅在 header 不存在时添加，已存在时不做任何操作，OVERWRITE_IF_EXISTS_OR_ADD: 已存在时覆盖值，不存在时添加（默认值），OVERWRITE_IF_EXISTS: 仅在 header 已存在时覆盖值，不存在时不做任何操作 
     * @return Action 添加头部的处理行为。默认：OVERWRITE_IF_EXISTS_OR_ADD。APPEND_IF_EXISTS_OR_ADD: 已存在时追加值，不存在时添加，ADD_IF_ABSENT:  仅在 header 不存在时添加，已存在时不做任何操作，OVERWRITE_IF_EXISTS_OR_ADD: 已存在时覆盖值，不存在时添加（默认值），OVERWRITE_IF_EXISTS: 仅在 header 已存在时覆盖值，不存在时不做任何操作
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 添加头部的处理行为。默认：OVERWRITE_IF_EXISTS_OR_ADD。APPEND_IF_EXISTS_OR_ADD: 已存在时追加值，不存在时添加，ADD_IF_ABSENT:  仅在 header 不存在时添加，已存在时不做任何操作，OVERWRITE_IF_EXISTS_OR_ADD: 已存在时覆盖值，不存在时添加（默认值），OVERWRITE_IF_EXISTS: 仅在 header 已存在时覆盖值，不存在时不做任何操作
     * @param Action 添加头部的处理行为。默认：OVERWRITE_IF_EXISTS_OR_ADD。APPEND_IF_EXISTS_OR_ADD: 已存在时追加值，不存在时添加，ADD_IF_ABSENT:  仅在 header 不存在时添加，已存在时不做任何操作，OVERWRITE_IF_EXISTS_OR_ADD: 已存在时覆盖值，不存在时添加（默认值），OVERWRITE_IF_EXISTS: 仅在 header 已存在时覆盖值，不存在时不做任何操作
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    public HTTPServiceHeaderToAdd() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HTTPServiceHeaderToAdd(HTTPServiceHeaderToAdd source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Action", this.Action);

    }
}

