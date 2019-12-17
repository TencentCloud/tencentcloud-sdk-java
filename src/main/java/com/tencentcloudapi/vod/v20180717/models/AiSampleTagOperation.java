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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AiSampleTagOperation extends AbstractModel{

    /**
    * 操作类型，可选值：add（添加）、delete（删除）、reset（重置）。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 标签，长度限制：128 个字符。
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
     * Get 操作类型，可选值：add（添加）、delete（删除）、reset（重置）。 
     * @return Type 操作类型，可选值：add（添加）、delete（删除）、reset（重置）。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 操作类型，可选值：add（添加）、delete（删除）、reset（重置）。
     * @param Type 操作类型，可选值：add（添加）、delete（删除）、reset（重置）。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 标签，长度限制：128 个字符。 
     * @return Tags 标签，长度限制：128 个字符。
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签，长度限制：128 个字符。
     * @param Tags 标签，长度限制：128 个字符。
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);

    }
}

