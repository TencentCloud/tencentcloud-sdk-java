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

public class ModifyLogsetRequest extends AbstractModel {

    /**
    * <p>日志集Id。通过 <a href="https://cloud.tencent.com/document/product/614/58624">获取日志集列表</a>获取日志集Id。</p>
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * <p>日志集名字。- 最大支持255个字符。不支持&quot;|&quot;字符。</p>
    */
    @SerializedName("LogsetName")
    @Expose
    private String LogsetName;

    /**
    * <p>日志集的绑定的标签键值对。最大支持10个标签键值对，同一个资源只能同时绑定一个标签键。</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get <p>日志集Id。通过 <a href="https://cloud.tencent.com/document/product/614/58624">获取日志集列表</a>获取日志集Id。</p> 
     * @return LogsetId <p>日志集Id。通过 <a href="https://cloud.tencent.com/document/product/614/58624">获取日志集列表</a>获取日志集Id。</p>
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set <p>日志集Id。通过 <a href="https://cloud.tencent.com/document/product/614/58624">获取日志集列表</a>获取日志集Id。</p>
     * @param LogsetId <p>日志集Id。通过 <a href="https://cloud.tencent.com/document/product/614/58624">获取日志集列表</a>获取日志集Id。</p>
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get <p>日志集名字。- 最大支持255个字符。不支持&quot;|&quot;字符。</p> 
     * @return LogsetName <p>日志集名字。- 最大支持255个字符。不支持&quot;|&quot;字符。</p>
     */
    public String getLogsetName() {
        return this.LogsetName;
    }

    /**
     * Set <p>日志集名字。- 最大支持255个字符。不支持&quot;|&quot;字符。</p>
     * @param LogsetName <p>日志集名字。- 最大支持255个字符。不支持&quot;|&quot;字符。</p>
     */
    public void setLogsetName(String LogsetName) {
        this.LogsetName = LogsetName;
    }

    /**
     * Get <p>日志集的绑定的标签键值对。最大支持10个标签键值对，同一个资源只能同时绑定一个标签键。</p> 
     * @return Tags <p>日志集的绑定的标签键值对。最大支持10个标签键值对，同一个资源只能同时绑定一个标签键。</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>日志集的绑定的标签键值对。最大支持10个标签键值对，同一个资源只能同时绑定一个标签键。</p>
     * @param Tags <p>日志集的绑定的标签键值对。最大支持10个标签键值对，同一个资源只能同时绑定一个标签键。</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public ModifyLogsetRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLogsetRequest(ModifyLogsetRequest source) {
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.LogsetName != null) {
            this.LogsetName = new String(source.LogsetName);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "LogsetName", this.LogsetName);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

