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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeContainerEventsRequest extends AbstractModel {

    /**
    * event 的资源类型, group 或者 instance
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * event 的资源 id
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 偏移量，取值从0开始
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页个数，默认为20， 取值应为1~50
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 当类型是 instance 时需要
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * event的资源kind
    */
    @SerializedName("Kind")
    @Expose
    private String Kind;

    /**
    * event 的type
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 资源名称
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * 关键词查询
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
     * Get event 的资源类型, group 或者 instance 
     * @return ResourceType event 的资源类型, group 或者 instance
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set event 的资源类型, group 或者 instance
     * @param ResourceType event 的资源类型, group 或者 instance
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get event 的资源 id 
     * @return ResourceId event 的资源 id
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set event 的资源 id
     * @param ResourceId event 的资源 id
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 偏移量，取值从0开始 
     * @return Offset 偏移量，取值从0开始
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，取值从0开始
     * @param Offset 偏移量，取值从0开始
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页个数，默认为20， 取值应为1~50 
     * @return Limit 分页个数，默认为20， 取值应为1~50
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页个数，默认为20， 取值应为1~50
     * @param Limit 分页个数，默认为20， 取值应为1~50
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 当类型是 instance 时需要 
     * @return GroupId 当类型是 instance 时需要
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 当类型是 instance 时需要
     * @param GroupId 当类型是 instance 时需要
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get event的资源kind 
     * @return Kind event的资源kind
     */
    public String getKind() {
        return this.Kind;
    }

    /**
     * Set event的资源kind
     * @param Kind event的资源kind
     */
    public void setKind(String Kind) {
        this.Kind = Kind;
    }

    /**
     * Get event 的type 
     * @return Type event 的type
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set event 的type
     * @param Type event 的type
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 资源名称 
     * @return ResourceName 资源名称
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set 资源名称
     * @param ResourceName 资源名称
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get 关键词查询 
     * @return SearchWord 关键词查询
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set 关键词查询
     * @param SearchWord 关键词查询
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    public DescribeContainerEventsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeContainerEventsRequest(DescribeContainerEventsRequest source) {
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.Kind != null) {
            this.Kind = new String(source.Kind);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ResourceName != null) {
            this.ResourceName = new String(source.ResourceName);
        }
        if (source.SearchWord != null) {
            this.SearchWord = new String(source.SearchWord);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);
        this.setParamSimple(map, prefix + "SearchWord", this.SearchWord);

    }
}

