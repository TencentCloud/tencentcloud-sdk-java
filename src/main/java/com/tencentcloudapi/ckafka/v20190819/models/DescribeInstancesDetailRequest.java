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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstancesDetailRequest extends AbstractModel {

    /**
    * <p>（过滤条件）按照实例ID过滤</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>（过滤条件）按照实例名,实例Id,可用区,私有网络id,子网id 过滤，支持模糊查询</p>
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
    * <p>（过滤条件）实例的状态，不填默认返回全部</p><p>枚举值：</p><ul><li>-1： 创建失败</li><li>0： 创建中</li><li>1： 运行中</li><li>2： 删除中</li><li>3： 已删除</li><li>4： 删除失败</li><li>5： 隔离中</li><li>7： 升级中</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long [] Status;

    /**
    * <p>偏移量，不填默认为0。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>返回数量，不填则默认10，最大值20。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>匹配标签key值。</p>
    */
    @SerializedName("TagKey")
    @Expose
    private String TagKey;

    /**
    * <p>过滤器。filter.Name 支持(&#39;Ip&#39;, &#39;VpcId&#39;, &#39;SubNetId&#39;, &#39;InstanceType&#39;,&#39;InstanceId&#39;) ,filter.Values最多传递10个值.</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * <p>已经废弃， 使用InstanceIdList</p>
    */
    @SerializedName("InstanceIds")
    @Expose
    private String InstanceIds;

    /**
    * <p>按照实例ID过滤</p>
    */
    @SerializedName("InstanceIdList")
    @Expose
    private String [] InstanceIdList;

    /**
    * <p>根据标签列表过滤实例（取交集）</p>
    */
    @SerializedName("TagList")
    @Expose
    private Tag [] TagList;

    /**
     * Get <p>（过滤条件）按照实例ID过滤</p> 
     * @return InstanceId <p>（过滤条件）按照实例ID过滤</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>（过滤条件）按照实例ID过滤</p>
     * @param InstanceId <p>（过滤条件）按照实例ID过滤</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>（过滤条件）按照实例名,实例Id,可用区,私有网络id,子网id 过滤，支持模糊查询</p> 
     * @return SearchWord <p>（过滤条件）按照实例名,实例Id,可用区,私有网络id,子网id 过滤，支持模糊查询</p>
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set <p>（过滤条件）按照实例名,实例Id,可用区,私有网络id,子网id 过滤，支持模糊查询</p>
     * @param SearchWord <p>（过滤条件）按照实例名,实例Id,可用区,私有网络id,子网id 过滤，支持模糊查询</p>
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    /**
     * Get <p>（过滤条件）实例的状态，不填默认返回全部</p><p>枚举值：</p><ul><li>-1： 创建失败</li><li>0： 创建中</li><li>1： 运行中</li><li>2： 删除中</li><li>3： 已删除</li><li>4： 删除失败</li><li>5： 隔离中</li><li>7： 升级中</li></ul> 
     * @return Status <p>（过滤条件）实例的状态，不填默认返回全部</p><p>枚举值：</p><ul><li>-1： 创建失败</li><li>0： 创建中</li><li>1： 运行中</li><li>2： 删除中</li><li>3： 已删除</li><li>4： 删除失败</li><li>5： 隔离中</li><li>7： 升级中</li></ul>
     */
    public Long [] getStatus() {
        return this.Status;
    }

    /**
     * Set <p>（过滤条件）实例的状态，不填默认返回全部</p><p>枚举值：</p><ul><li>-1： 创建失败</li><li>0： 创建中</li><li>1： 运行中</li><li>2： 删除中</li><li>3： 已删除</li><li>4： 删除失败</li><li>5： 隔离中</li><li>7： 升级中</li></ul>
     * @param Status <p>（过滤条件）实例的状态，不填默认返回全部</p><p>枚举值：</p><ul><li>-1： 创建失败</li><li>0： 创建中</li><li>1： 运行中</li><li>2： 删除中</li><li>3： 已删除</li><li>4： 删除失败</li><li>5： 隔离中</li><li>7： 升级中</li></ul>
     */
    public void setStatus(Long [] Status) {
        this.Status = Status;
    }

    /**
     * Get <p>偏移量，不填默认为0。</p> 
     * @return Offset <p>偏移量，不填默认为0。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量，不填默认为0。</p>
     * @param Offset <p>偏移量，不填默认为0。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>返回数量，不填则默认10，最大值20。</p> 
     * @return Limit <p>返回数量，不填则默认10，最大值20。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>返回数量，不填则默认10，最大值20。</p>
     * @param Limit <p>返回数量，不填则默认10，最大值20。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>匹配标签key值。</p> 
     * @return TagKey <p>匹配标签key值。</p>
     */
    public String getTagKey() {
        return this.TagKey;
    }

    /**
     * Set <p>匹配标签key值。</p>
     * @param TagKey <p>匹配标签key值。</p>
     */
    public void setTagKey(String TagKey) {
        this.TagKey = TagKey;
    }

    /**
     * Get <p>过滤器。filter.Name 支持(&#39;Ip&#39;, &#39;VpcId&#39;, &#39;SubNetId&#39;, &#39;InstanceType&#39;,&#39;InstanceId&#39;) ,filter.Values最多传递10个值.</p> 
     * @return Filters <p>过滤器。filter.Name 支持(&#39;Ip&#39;, &#39;VpcId&#39;, &#39;SubNetId&#39;, &#39;InstanceType&#39;,&#39;InstanceId&#39;) ,filter.Values最多传递10个值.</p>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤器。filter.Name 支持(&#39;Ip&#39;, &#39;VpcId&#39;, &#39;SubNetId&#39;, &#39;InstanceType&#39;,&#39;InstanceId&#39;) ,filter.Values最多传递10个值.</p>
     * @param Filters <p>过滤器。filter.Name 支持(&#39;Ip&#39;, &#39;VpcId&#39;, &#39;SubNetId&#39;, &#39;InstanceType&#39;,&#39;InstanceId&#39;) ,filter.Values最多传递10个值.</p>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>已经废弃， 使用InstanceIdList</p> 
     * @return InstanceIds <p>已经废弃， 使用InstanceIdList</p>
     * @deprecated
     */
    @Deprecated
    public String getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set <p>已经废弃， 使用InstanceIdList</p>
     * @param InstanceIds <p>已经废弃， 使用InstanceIdList</p>
     * @deprecated
     */
    @Deprecated
    public void setInstanceIds(String InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get <p>按照实例ID过滤</p> 
     * @return InstanceIdList <p>按照实例ID过滤</p>
     */
    public String [] getInstanceIdList() {
        return this.InstanceIdList;
    }

    /**
     * Set <p>按照实例ID过滤</p>
     * @param InstanceIdList <p>按照实例ID过滤</p>
     */
    public void setInstanceIdList(String [] InstanceIdList) {
        this.InstanceIdList = InstanceIdList;
    }

    /**
     * Get <p>根据标签列表过滤实例（取交集）</p> 
     * @return TagList <p>根据标签列表过滤实例（取交集）</p>
     */
    public Tag [] getTagList() {
        return this.TagList;
    }

    /**
     * Set <p>根据标签列表过滤实例（取交集）</p>
     * @param TagList <p>根据标签列表过滤实例（取交集）</p>
     */
    public void setTagList(Tag [] TagList) {
        this.TagList = TagList;
    }

    public DescribeInstancesDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstancesDetailRequest(DescribeInstancesDetailRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.SearchWord != null) {
            this.SearchWord = new String(source.SearchWord);
        }
        if (source.Status != null) {
            this.Status = new Long[source.Status.length];
            for (int i = 0; i < source.Status.length; i++) {
                this.Status[i] = new Long(source.Status[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.TagKey != null) {
            this.TagKey = new String(source.TagKey);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String(source.InstanceIds);
        }
        if (source.InstanceIdList != null) {
            this.InstanceIdList = new String[source.InstanceIdList.length];
            for (int i = 0; i < source.InstanceIdList.length; i++) {
                this.InstanceIdList[i] = new String(source.InstanceIdList[i]);
            }
        }
        if (source.TagList != null) {
            this.TagList = new Tag[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new Tag(source.TagList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "SearchWord", this.SearchWord);
        this.setParamArraySimple(map, prefix + "Status.", this.Status);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "TagKey", this.TagKey);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "InstanceIds", this.InstanceIds);
        this.setParamArraySimple(map, prefix + "InstanceIdList.", this.InstanceIdList);
        this.setParamArrayObj(map, prefix + "TagList.", this.TagList);

    }
}

