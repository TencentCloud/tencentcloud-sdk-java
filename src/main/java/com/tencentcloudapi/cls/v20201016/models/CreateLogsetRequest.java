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

public class CreateLogsetRequest extends AbstractModel {

    /**
    * 日志集名字。

- 最大支持255个字符。不支持`|`字符。
    */
    @SerializedName("LogsetName")
    @Expose
    private String LogsetName;

    /**
    * 标签描述列表。最大支持10个标签键值对，并且不能有重复的键值对
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 日志集ID，格式为：用户自定义部分-用户APPID。未填写该参数时将自动生成ID。

- 用户自定义部分仅支持小写字母、数字和-，且不能以-开头和结尾，长度为3至40字符。
- 尾部需要使用-拼接用户APPID，APPID可在https://console.cloud.tencent.com/developer页面查询。
- 如果指定该字段，需保证全地域唯一
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
     * Get 日志集名字。

- 最大支持255个字符。不支持`|`字符。 
     * @return LogsetName 日志集名字。

- 最大支持255个字符。不支持`|`字符。
     */
    public String getLogsetName() {
        return this.LogsetName;
    }

    /**
     * Set 日志集名字。

- 最大支持255个字符。不支持`|`字符。
     * @param LogsetName 日志集名字。

- 最大支持255个字符。不支持`|`字符。
     */
    public void setLogsetName(String LogsetName) {
        this.LogsetName = LogsetName;
    }

    /**
     * Get 标签描述列表。最大支持10个标签键值对，并且不能有重复的键值对 
     * @return Tags 标签描述列表。最大支持10个标签键值对，并且不能有重复的键值对
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签描述列表。最大支持10个标签键值对，并且不能有重复的键值对
     * @param Tags 标签描述列表。最大支持10个标签键值对，并且不能有重复的键值对
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 日志集ID，格式为：用户自定义部分-用户APPID。未填写该参数时将自动生成ID。

- 用户自定义部分仅支持小写字母、数字和-，且不能以-开头和结尾，长度为3至40字符。
- 尾部需要使用-拼接用户APPID，APPID可在https://console.cloud.tencent.com/developer页面查询。
- 如果指定该字段，需保证全地域唯一 
     * @return LogsetId 日志集ID，格式为：用户自定义部分-用户APPID。未填写该参数时将自动生成ID。

- 用户自定义部分仅支持小写字母、数字和-，且不能以-开头和结尾，长度为3至40字符。
- 尾部需要使用-拼接用户APPID，APPID可在https://console.cloud.tencent.com/developer页面查询。
- 如果指定该字段，需保证全地域唯一
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set 日志集ID，格式为：用户自定义部分-用户APPID。未填写该参数时将自动生成ID。

- 用户自定义部分仅支持小写字母、数字和-，且不能以-开头和结尾，长度为3至40字符。
- 尾部需要使用-拼接用户APPID，APPID可在https://console.cloud.tencent.com/developer页面查询。
- 如果指定该字段，需保证全地域唯一
     * @param LogsetId 日志集ID，格式为：用户自定义部分-用户APPID。未填写该参数时将自动生成ID。

- 用户自定义部分仅支持小写字母、数字和-，且不能以-开头和结尾，长度为3至40字符。
- 尾部需要使用-拼接用户APPID，APPID可在https://console.cloud.tencent.com/developer页面查询。
- 如果指定该字段，需保证全地域唯一
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    public CreateLogsetRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLogsetRequest(CreateLogsetRequest source) {
        if (source.LogsetName != null) {
            this.LogsetName = new String(source.LogsetName);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogsetName", this.LogsetName);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);

    }
}

