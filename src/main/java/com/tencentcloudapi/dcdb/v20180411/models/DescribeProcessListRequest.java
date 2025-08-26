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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProcessListRequest extends AbstractModel {

    /**
    * 实例ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 节点ID。
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
    * 分片ID，与ShardSerialId设置一个。
    */
    @SerializedName("ShardId")
    @Expose
    private String ShardId;

    /**
    * 分片序列ID，与ShardId设置一个。
    */
    @SerializedName("ShardSerialId")
    @Expose
    private String ShardSerialId;

    /**
    * <li><strong>id</strong></li>
    <p style="padding-left: 30px;">按照【<strong>会话ID</strong>】进行过滤。会话ID例如：125700。</p>
    <p style="padding-left: 30px;">类型：String</p>
    <p style="padding-left: 30px;">必选：否</p>
    <p style="padding-left: 30px;">匹配类型：精确匹配</p>

<li><strong>user</strong></li>
    <p style="padding-left: 30px;">按照【<strong>用户名</strong>】进行过滤。用户名例如：root。</p>
    <p style="padding-left: 30px;">类型：String</p>
    <p style="padding-left: 30px;">必选：否</p>
    <p style="padding-left: 30px;">匹配类型：精确匹配</p>
<li><strong>host</strong></li>
    <p style="padding-left: 30px;">按照【<strong>客户端Host</strong>】进行过滤。客户端Host例如：127.0.0.1:46295。</p>
    <p style="padding-left: 30px;">类型：String</p>
    <p style="padding-left: 30px;">必选：否</p>
    <p style="padding-left: 30px;">匹配类型：前缀匹配，例如可以查询客户端IP不加端口：127.0.0.1。</p>
<li><strong>state</strong></li>
    <p style="padding-left: 30px;">按照【<strong>线程状态</strong>】进行过滤。线程状态例如：Updating。</p>
    <p style="padding-left: 30px;">类型：String</p>
    <p style="padding-left: 30px;">必选：否</p>
    <p style="padding-left: 30px;">匹配类型：精确匹配</p>
<li><strong>db</strong></li>
    <p style="padding-left: 30px;">按照【<strong>数据库名称</strong>】进行过滤。数据库名称例如：mysql。</p>
    <p style="padding-left: 30px;">类型：String</p>
    <p style="padding-left: 30px;">必选：否</p>
    <p style="padding-left: 30px;">匹配类型：精确匹配</p>
<li><strong>command</strong></li>
    <p style="padding-left: 30px;">按照【<strong>命令类型</strong>】进行过滤。命令类型例如：Query。</p>
    <p style="padding-left: 30px;">类型：String</p>
    <p style="padding-left: 30px;">必选：否</p>
    <p style="padding-left: 30px;">匹配类型：精确匹配</p>
<li><strong>info</strong></li>
    <p style="padding-left: 30px;">按照【<strong>执行语句</strong>】进行过滤。执行语句例如：select id, name from demo.table1 where id > 10。</p>
    <p style="padding-left: 30px;">类型：String</p>
    <p style="padding-left: 30px;">必选：否</p>
    <p style="padding-left: 30px;">匹配类型：前缀匹配，例如SQL较长，可以输入SQL前缀：select  id, name from demo.table1。</p>
<li><strong>time</strong></li>
    <p style="padding-left: 30px;">按照【<strong>执行时间大于多少（秒）</strong>】进行过滤。例如：10，表示查询执行时间超过10秒的会话。</p>
    <p style="padding-left: 30px;">类型：Integer</p>
    <p style="padding-left: 30px;">必选：否</p>
    <p style="padding-left: 30px;">匹配类型：范围匹配，Values值只支持输入1个。</p>
每次请求的`Filters`的上限为10，`Filter.Values`的上限为50。
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 偏移量，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量，默认为20，最大值为100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 实例ID。 
     * @return InstanceId 实例ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID。
     * @param InstanceId 实例ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 节点ID。 
     * @return NodeId 节点ID。
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set 节点ID。
     * @param NodeId 节点ID。
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get 分片ID，与ShardSerialId设置一个。 
     * @return ShardId 分片ID，与ShardSerialId设置一个。
     */
    public String getShardId() {
        return this.ShardId;
    }

    /**
     * Set 分片ID，与ShardSerialId设置一个。
     * @param ShardId 分片ID，与ShardSerialId设置一个。
     */
    public void setShardId(String ShardId) {
        this.ShardId = ShardId;
    }

    /**
     * Get 分片序列ID，与ShardId设置一个。 
     * @return ShardSerialId 分片序列ID，与ShardId设置一个。
     */
    public String getShardSerialId() {
        return this.ShardSerialId;
    }

    /**
     * Set 分片序列ID，与ShardId设置一个。
     * @param ShardSerialId 分片序列ID，与ShardId设置一个。
     */
    public void setShardSerialId(String ShardSerialId) {
        this.ShardSerialId = ShardSerialId;
    }

    /**
     * Get <li><strong>id</strong></li>
    <p style="padding-left: 30px;">按照【<strong>会话ID</strong>】进行过滤。会话ID例如：125700。</p>
    <p style="padding-left: 30px;">类型：String</p>
    <p style="padding-left: 30px;">必选：否</p>
    <p style="padding-left: 30px;">匹配类型：精确匹配</p>

<li><strong>user</strong></li>
    <p style="padding-left: 30px;">按照【<strong>用户名</strong>】进行过滤。用户名例如：root。</p>
    <p style="padding-left: 30px;">类型：String</p>
    <p style="padding-left: 30px;">必选：否</p>
    <p style="padding-left: 30px;">匹配类型：精确匹配</p>
<li><strong>host</strong></li>
    <p style="padding-left: 30px;">按照【<strong>客户端Host</strong>】进行过滤。客户端Host例如：127.0.0.1:46295。</p>
    <p style="padding-left: 30px;">类型：String</p>
    <p style="padding-left: 30px;">必选：否</p>
    <p style="padding-left: 30px;">匹配类型：前缀匹配，例如可以查询客户端IP不加端口：127.0.0.1。</p>
<li><strong>state</strong></li>
    <p style="padding-left: 30px;">按照【<strong>线程状态</strong>】进行过滤。线程状态例如：Updating。</p>
    <p style="padding-left: 30px;">类型：String</p>
    <p style="padding-left: 30px;">必选：否</p>
    <p style="padding-left: 30px;">匹配类型：精确匹配</p>
<li><strong>db</strong></li>
    <p style="padding-left: 30px;">按照【<strong>数据库名称</strong>】进行过滤。数据库名称例如：mysql。</p>
    <p style="padding-left: 30px;">类型：String</p>
    <p style="padding-left: 30px;">必选：否</p>
    <p style="padding-left: 30px;">匹配类型：精确匹配</p>
<li><strong>command</strong></li>
    <p style="padding-left: 30px;">按照【<strong>命令类型</strong>】进行过滤。命令类型例如：Query。</p>
    <p style="padding-left: 30px;">类型：String</p>
    <p style="padding-left: 30px;">必选：否</p>
    <p style="padding-left: 30px;">匹配类型：精确匹配</p>
<li><strong>info</strong></li>
    <p style="padding-left: 30px;">按照【<strong>执行语句</strong>】进行过滤。执行语句例如：select id, name from demo.table1 where id > 10。</p>
    <p style="padding-left: 30px;">类型：String</p>
    <p style="padding-left: 30px;">必选：否</p>
    <p style="padding-left: 30px;">匹配类型：前缀匹配，例如SQL较长，可以输入SQL前缀：select  id, name from demo.table1。</p>
<li><strong>time</strong></li>
    <p style="padding-left: 30px;">按照【<strong>执行时间大于多少（秒）</strong>】进行过滤。例如：10，表示查询执行时间超过10秒的会话。</p>
    <p style="padding-left: 30px;">类型：Integer</p>
    <p style="padding-left: 30px;">必选：否</p>
    <p style="padding-left: 30px;">匹配类型：范围匹配，Values值只支持输入1个。</p>
每次请求的`Filters`的上限为10，`Filter.Values`的上限为50。 
     * @return Filters <li><strong>id</strong></li>
    <p style="padding-left: 30px;">按照【<strong>会话ID</strong>】进行过滤。会话ID例如：125700。</p>
    <p style="padding-left: 30px;">类型：String</p>
    <p style="padding-left: 30px;">必选：否</p>
    <p style="padding-left: 30px;">匹配类型：精确匹配</p>

<li><strong>user</strong></li>
    <p style="padding-left: 30px;">按照【<strong>用户名</strong>】进行过滤。用户名例如：root。</p>
    <p style="padding-left: 30px;">类型：String</p>
    <p style="padding-left: 30px;">必选：否</p>
    <p style="padding-left: 30px;">匹配类型：精确匹配</p>
<li><strong>host</strong></li>
    <p style="padding-left: 30px;">按照【<strong>客户端Host</strong>】进行过滤。客户端Host例如：127.0.0.1:46295。</p>
    <p style="padding-left: 30px;">类型：String</p>
    <p style="padding-left: 30px;">必选：否</p>
    <p style="padding-left: 30px;">匹配类型：前缀匹配，例如可以查询客户端IP不加端口：127.0.0.1。</p>
<li><strong>state</strong></li>
    <p style="padding-left: 30px;">按照【<strong>线程状态</strong>】进行过滤。线程状态例如：Updating。</p>
    <p style="padding-left: 30px;">类型：String</p>
    <p style="padding-left: 30px;">必选：否</p>
    <p style="padding-left: 30px;">匹配类型：精确匹配</p>
<li><strong>db</strong></li>
    <p style="padding-left: 30px;">按照【<strong>数据库名称</strong>】进行过滤。数据库名称例如：mysql。</p>
    <p style="padding-left: 30px;">类型：String</p>
    <p style="padding-left: 30px;">必选：否</p>
    <p style="padding-left: 30px;">匹配类型：精确匹配</p>
<li><strong>command</strong></li>
    <p style="padding-left: 30px;">按照【<strong>命令类型</strong>】进行过滤。命令类型例如：Query。</p>
    <p style="padding-left: 30px;">类型：String</p>
    <p style="padding-left: 30px;">必选：否</p>
    <p style="padding-left: 30px;">匹配类型：精确匹配</p>
<li><strong>info</strong></li>
    <p style="padding-left: 30px;">按照【<strong>执行语句</strong>】进行过滤。执行语句例如：select id, name from demo.table1 where id > 10。</p>
    <p style="padding-left: 30px;">类型：String</p>
    <p style="padding-left: 30px;">必选：否</p>
    <p style="padding-left: 30px;">匹配类型：前缀匹配，例如SQL较长，可以输入SQL前缀：select  id, name from demo.table1。</p>
<li><strong>time</strong></li>
    <p style="padding-left: 30px;">按照【<strong>执行时间大于多少（秒）</strong>】进行过滤。例如：10，表示查询执行时间超过10秒的会话。</p>
    <p style="padding-left: 30px;">类型：Integer</p>
    <p style="padding-left: 30px;">必选：否</p>
    <p style="padding-left: 30px;">匹配类型：范围匹配，Values值只支持输入1个。</p>
每次请求的`Filters`的上限为10，`Filter.Values`的上限为50。
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <li><strong>id</strong></li>
    <p style="padding-left: 30px;">按照【<strong>会话ID</strong>】进行过滤。会话ID例如：125700。</p>
    <p style="padding-left: 30px;">类型：String</p>
    <p style="padding-left: 30px;">必选：否</p>
    <p style="padding-left: 30px;">匹配类型：精确匹配</p>

<li><strong>user</strong></li>
    <p style="padding-left: 30px;">按照【<strong>用户名</strong>】进行过滤。用户名例如：root。</p>
    <p style="padding-left: 30px;">类型：String</p>
    <p style="padding-left: 30px;">必选：否</p>
    <p style="padding-left: 30px;">匹配类型：精确匹配</p>
<li><strong>host</strong></li>
    <p style="padding-left: 30px;">按照【<strong>客户端Host</strong>】进行过滤。客户端Host例如：127.0.0.1:46295。</p>
    <p style="padding-left: 30px;">类型：String</p>
    <p style="padding-left: 30px;">必选：否</p>
    <p style="padding-left: 30px;">匹配类型：前缀匹配，例如可以查询客户端IP不加端口：127.0.0.1。</p>
<li><strong>state</strong></li>
    <p style="padding-left: 30px;">按照【<strong>线程状态</strong>】进行过滤。线程状态例如：Updating。</p>
    <p style="padding-left: 30px;">类型：String</p>
    <p style="padding-left: 30px;">必选：否</p>
    <p style="padding-left: 30px;">匹配类型：精确匹配</p>
<li><strong>db</strong></li>
    <p style="padding-left: 30px;">按照【<strong>数据库名称</strong>】进行过滤。数据库名称例如：mysql。</p>
    <p style="padding-left: 30px;">类型：String</p>
    <p style="padding-left: 30px;">必选：否</p>
    <p style="padding-left: 30px;">匹配类型：精确匹配</p>
<li><strong>command</strong></li>
    <p style="padding-left: 30px;">按照【<strong>命令类型</strong>】进行过滤。命令类型例如：Query。</p>
    <p style="padding-left: 30px;">类型：String</p>
    <p style="padding-left: 30px;">必选：否</p>
    <p style="padding-left: 30px;">匹配类型：精确匹配</p>
<li><strong>info</strong></li>
    <p style="padding-left: 30px;">按照【<strong>执行语句</strong>】进行过滤。执行语句例如：select id, name from demo.table1 where id > 10。</p>
    <p style="padding-left: 30px;">类型：String</p>
    <p style="padding-left: 30px;">必选：否</p>
    <p style="padding-left: 30px;">匹配类型：前缀匹配，例如SQL较长，可以输入SQL前缀：select  id, name from demo.table1。</p>
<li><strong>time</strong></li>
    <p style="padding-left: 30px;">按照【<strong>执行时间大于多少（秒）</strong>】进行过滤。例如：10，表示查询执行时间超过10秒的会话。</p>
    <p style="padding-left: 30px;">类型：Integer</p>
    <p style="padding-left: 30px;">必选：否</p>
    <p style="padding-left: 30px;">匹配类型：范围匹配，Values值只支持输入1个。</p>
每次请求的`Filters`的上限为10，`Filter.Values`的上限为50。
     * @param Filters <li><strong>id</strong></li>
    <p style="padding-left: 30px;">按照【<strong>会话ID</strong>】进行过滤。会话ID例如：125700。</p>
    <p style="padding-left: 30px;">类型：String</p>
    <p style="padding-left: 30px;">必选：否</p>
    <p style="padding-left: 30px;">匹配类型：精确匹配</p>

<li><strong>user</strong></li>
    <p style="padding-left: 30px;">按照【<strong>用户名</strong>】进行过滤。用户名例如：root。</p>
    <p style="padding-left: 30px;">类型：String</p>
    <p style="padding-left: 30px;">必选：否</p>
    <p style="padding-left: 30px;">匹配类型：精确匹配</p>
<li><strong>host</strong></li>
    <p style="padding-left: 30px;">按照【<strong>客户端Host</strong>】进行过滤。客户端Host例如：127.0.0.1:46295。</p>
    <p style="padding-left: 30px;">类型：String</p>
    <p style="padding-left: 30px;">必选：否</p>
    <p style="padding-left: 30px;">匹配类型：前缀匹配，例如可以查询客户端IP不加端口：127.0.0.1。</p>
<li><strong>state</strong></li>
    <p style="padding-left: 30px;">按照【<strong>线程状态</strong>】进行过滤。线程状态例如：Updating。</p>
    <p style="padding-left: 30px;">类型：String</p>
    <p style="padding-left: 30px;">必选：否</p>
    <p style="padding-left: 30px;">匹配类型：精确匹配</p>
<li><strong>db</strong></li>
    <p style="padding-left: 30px;">按照【<strong>数据库名称</strong>】进行过滤。数据库名称例如：mysql。</p>
    <p style="padding-left: 30px;">类型：String</p>
    <p style="padding-left: 30px;">必选：否</p>
    <p style="padding-left: 30px;">匹配类型：精确匹配</p>
<li><strong>command</strong></li>
    <p style="padding-left: 30px;">按照【<strong>命令类型</strong>】进行过滤。命令类型例如：Query。</p>
    <p style="padding-left: 30px;">类型：String</p>
    <p style="padding-left: 30px;">必选：否</p>
    <p style="padding-left: 30px;">匹配类型：精确匹配</p>
<li><strong>info</strong></li>
    <p style="padding-left: 30px;">按照【<strong>执行语句</strong>】进行过滤。执行语句例如：select id, name from demo.table1 where id > 10。</p>
    <p style="padding-left: 30px;">类型：String</p>
    <p style="padding-left: 30px;">必选：否</p>
    <p style="padding-left: 30px;">匹配类型：前缀匹配，例如SQL较长，可以输入SQL前缀：select  id, name from demo.table1。</p>
<li><strong>time</strong></li>
    <p style="padding-left: 30px;">按照【<strong>执行时间大于多少（秒）</strong>】进行过滤。例如：10，表示查询执行时间超过10秒的会话。</p>
    <p style="padding-left: 30px;">类型：Integer</p>
    <p style="padding-left: 30px;">必选：否</p>
    <p style="padding-left: 30px;">匹配类型：范围匹配，Values值只支持输入1个。</p>
每次请求的`Filters`的上限为10，`Filter.Values`的上限为50。
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 偏移量，默认为0。 
     * @return Offset 偏移量，默认为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0。
     * @param Offset 偏移量，默认为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量，默认为20，最大值为100。 
     * @return Limit 返回数量，默认为20，最大值为100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为20，最大值为100。
     * @param Limit 返回数量，默认为20，最大值为100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeProcessListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProcessListRequest(DescribeProcessListRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.NodeId != null) {
            this.NodeId = new String(source.NodeId);
        }
        if (source.ShardId != null) {
            this.ShardId = new String(source.ShardId);
        }
        if (source.ShardSerialId != null) {
            this.ShardSerialId = new String(source.ShardSerialId);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
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
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "ShardId", this.ShardId);
        this.setParamSimple(map, prefix + "ShardSerialId", this.ShardSerialId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

