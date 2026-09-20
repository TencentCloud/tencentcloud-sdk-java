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
package com.tencentcloudapi.ags.v20250920.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SessionState extends AbstractModel {

    /**
    * <p>自定义状态 JSON 对象字符串</p>
    */
    @SerializedName("CustomState")
    @Expose
    private String CustomState;

    /**
     * Get <p>自定义状态 JSON 对象字符串</p> 
     * @return CustomState <p>自定义状态 JSON 对象字符串</p>
     */
    public String getCustomState() {
        return this.CustomState;
    }

    /**
     * Set <p>自定义状态 JSON 对象字符串</p>
     * @param CustomState <p>自定义状态 JSON 对象字符串</p>
     */
    public void setCustomState(String CustomState) {
        this.CustomState = CustomState;
    }

    public SessionState() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SessionState(SessionState source) {
        if (source.CustomState != null) {
            this.CustomState = new String(source.CustomState);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CustomState", this.CustomState);

    }
}

