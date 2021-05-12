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

public class DescribeSubAppIdsRequest extends AbstractModel{

    /**
    * 子应用名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 标签信息，查询指定标签的子应用列表。
    */
    @SerializedName("Tags")
    @Expose
    private ResourceTag [] Tags;

    /**
    * 分页拉取的起始偏移量。默认值：0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页拉取的最大返回结果数。默认值：200；最大值：200。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 子应用名称。 
     * @return Name 子应用名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 子应用名称。
     * @param Name 子应用名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 标签信息，查询指定标签的子应用列表。 
     * @return Tags 标签信息，查询指定标签的子应用列表。
     */
    public ResourceTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签信息，查询指定标签的子应用列表。
     * @param Tags 标签信息，查询指定标签的子应用列表。
     */
    public void setTags(ResourceTag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 分页拉取的起始偏移量。默认值：0。 
     * @return Offset 分页拉取的起始偏移量。默认值：0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页拉取的起始偏移量。默认值：0。
     * @param Offset 分页拉取的起始偏移量。默认值：0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页拉取的最大返回结果数。默认值：200；最大值：200。 
     * @return Limit 分页拉取的最大返回结果数。默认值：200；最大值：200。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页拉取的最大返回结果数。默认值：200；最大值：200。
     * @param Limit 分页拉取的最大返回结果数。默认值：200；最大值：200。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeSubAppIdsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSubAppIdsRequest(DescribeSubAppIdsRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Tags != null) {
            this.Tags = new ResourceTag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new ResourceTag(source.Tags[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

