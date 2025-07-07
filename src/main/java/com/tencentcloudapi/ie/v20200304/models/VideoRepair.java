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
package com.tencentcloudapi.ie.v20200304.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VideoRepair extends AbstractModel {

    /**
    * 画质修复类型，可选值：weak，normal，strong;
默认值: weak
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get 画质修复类型，可选值：weak，normal，strong;
默认值: weak 
     * @return Type 画质修复类型，可选值：weak，normal，strong;
默认值: weak
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 画质修复类型，可选值：weak，normal，strong;
默认值: weak
     * @param Type 画质修复类型，可选值：weak，normal，strong;
默认值: weak
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public VideoRepair() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoRepair(VideoRepair source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

