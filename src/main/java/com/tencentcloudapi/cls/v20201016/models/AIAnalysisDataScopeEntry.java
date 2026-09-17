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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AIAnalysisDataScopeEntry extends AbstractModel {

    /**
    * <p>值类型</p><p>枚举值：</p><ul><li>TopicId： 日志主题ID</li><li>Region： 地域</li></ul>
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * <p>Key如果设置为TopicId，Value是对应日志主题topic_id 在https://cloud.tencent.com/document/product/614/56454 查询，Key如果设置为Region，Value是地域的英文名，在https://cloud.tencent.com/document/product/614/18940查询。</p>
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get <p>值类型</p><p>枚举值：</p><ul><li>TopicId： 日志主题ID</li><li>Region： 地域</li></ul> 
     * @return Key <p>值类型</p><p>枚举值：</p><ul><li>TopicId： 日志主题ID</li><li>Region： 地域</li></ul>
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set <p>值类型</p><p>枚举值：</p><ul><li>TopicId： 日志主题ID</li><li>Region： 地域</li></ul>
     * @param Key <p>值类型</p><p>枚举值：</p><ul><li>TopicId： 日志主题ID</li><li>Region： 地域</li></ul>
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get <p>Key如果设置为TopicId，Value是对应日志主题topic_id 在https://cloud.tencent.com/document/product/614/56454 查询，Key如果设置为Region，Value是地域的英文名，在https://cloud.tencent.com/document/product/614/18940查询。</p> 
     * @return Value <p>Key如果设置为TopicId，Value是对应日志主题topic_id 在https://cloud.tencent.com/document/product/614/56454 查询，Key如果设置为Region，Value是地域的英文名，在https://cloud.tencent.com/document/product/614/18940查询。</p>
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set <p>Key如果设置为TopicId，Value是对应日志主题topic_id 在https://cloud.tencent.com/document/product/614/56454 查询，Key如果设置为Region，Value是地域的英文名，在https://cloud.tencent.com/document/product/614/18940查询。</p>
     * @param Value <p>Key如果设置为TopicId，Value是对应日志主题topic_id 在https://cloud.tencent.com/document/product/614/56454 查询，Key如果设置为Region，Value是地域的英文名，在https://cloud.tencent.com/document/product/614/18940查询。</p>
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public AIAnalysisDataScopeEntry() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIAnalysisDataScopeEntry(AIAnalysisDataScopeEntry source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

