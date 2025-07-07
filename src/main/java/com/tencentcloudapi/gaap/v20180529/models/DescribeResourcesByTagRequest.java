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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeResourcesByTagRequest extends AbstractModel {

    /**
    * 标签键。
    */
    @SerializedName("TagKey")
    @Expose
    private String TagKey;

    /**
    * 标签值。
    */
    @SerializedName("TagValue")
    @Expose
    private String TagValue;

    /**
    * 资源类型，其中：
Proxy表示通道；
ProxyGroup表示通道组；
RealServer表示源站。
不指定该字段则查询该标签下所有资源。
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
     * Get 标签键。 
     * @return TagKey 标签键。
     */
    public String getTagKey() {
        return this.TagKey;
    }

    /**
     * Set 标签键。
     * @param TagKey 标签键。
     */
    public void setTagKey(String TagKey) {
        this.TagKey = TagKey;
    }

    /**
     * Get 标签值。 
     * @return TagValue 标签值。
     */
    public String getTagValue() {
        return this.TagValue;
    }

    /**
     * Set 标签值。
     * @param TagValue 标签值。
     */
    public void setTagValue(String TagValue) {
        this.TagValue = TagValue;
    }

    /**
     * Get 资源类型，其中：
Proxy表示通道；
ProxyGroup表示通道组；
RealServer表示源站。
不指定该字段则查询该标签下所有资源。 
     * @return ResourceType 资源类型，其中：
Proxy表示通道；
ProxyGroup表示通道组；
RealServer表示源站。
不指定该字段则查询该标签下所有资源。
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set 资源类型，其中：
Proxy表示通道；
ProxyGroup表示通道组；
RealServer表示源站。
不指定该字段则查询该标签下所有资源。
     * @param ResourceType 资源类型，其中：
Proxy表示通道；
ProxyGroup表示通道组；
RealServer表示源站。
不指定该字段则查询该标签下所有资源。
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    public DescribeResourcesByTagRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeResourcesByTagRequest(DescribeResourcesByTagRequest source) {
        if (source.TagKey != null) {
            this.TagKey = new String(source.TagKey);
        }
        if (source.TagValue != null) {
            this.TagValue = new String(source.TagValue);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TagKey", this.TagKey);
        this.setParamSimple(map, prefix + "TagValue", this.TagValue);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);

    }
}

