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
package com.tencentcloudapi.trabbit.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRabbitMQServerlessConnectionRequest extends AbstractModel {

    /**
    * 集群实例Id	
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * vhost名
    */
    @SerializedName("VirtualHost")
    @Expose
    private String VirtualHost;

    /**
    * 按哪个字段排序，支持：channel(channel数),incoming_bytes(入流量大小),outgoing_bytes(出流量大小)
    */
    @SerializedName("SortElement")
    @Expose
    private String SortElement;

    /**
    * 排序方式：ASC,DESC
    */
    @SerializedName("SortType")
    @Expose
    private String SortType;

    /**
    * 分页参数，从第几条数据开始
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 一页大小
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 连接名模糊搜索
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get 集群实例Id	 
     * @return InstanceId 集群实例Id	
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 集群实例Id	
     * @param InstanceId 集群实例Id	
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get vhost名 
     * @return VirtualHost vhost名
     */
    public String getVirtualHost() {
        return this.VirtualHost;
    }

    /**
     * Set vhost名
     * @param VirtualHost vhost名
     */
    public void setVirtualHost(String VirtualHost) {
        this.VirtualHost = VirtualHost;
    }

    /**
     * Get 按哪个字段排序，支持：channel(channel数),incoming_bytes(入流量大小),outgoing_bytes(出流量大小) 
     * @return SortElement 按哪个字段排序，支持：channel(channel数),incoming_bytes(入流量大小),outgoing_bytes(出流量大小)
     */
    public String getSortElement() {
        return this.SortElement;
    }

    /**
     * Set 按哪个字段排序，支持：channel(channel数),incoming_bytes(入流量大小),outgoing_bytes(出流量大小)
     * @param SortElement 按哪个字段排序，支持：channel(channel数),incoming_bytes(入流量大小),outgoing_bytes(出流量大小)
     */
    public void setSortElement(String SortElement) {
        this.SortElement = SortElement;
    }

    /**
     * Get 排序方式：ASC,DESC 
     * @return SortType 排序方式：ASC,DESC
     */
    public String getSortType() {
        return this.SortType;
    }

    /**
     * Set 排序方式：ASC,DESC
     * @param SortType 排序方式：ASC,DESC
     */
    public void setSortType(String SortType) {
        this.SortType = SortType;
    }

    /**
     * Get 分页参数，从第几条数据开始 
     * @return Offset 分页参数，从第几条数据开始
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页参数，从第几条数据开始
     * @param Offset 分页参数，从第几条数据开始
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 一页大小 
     * @return Limit 一页大小
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 一页大小
     * @param Limit 一页大小
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 连接名模糊搜索 
     * @return Name 连接名模糊搜索
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 连接名模糊搜索
     * @param Name 连接名模糊搜索
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public DescribeRabbitMQServerlessConnectionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRabbitMQServerlessConnectionRequest(DescribeRabbitMQServerlessConnectionRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.VirtualHost != null) {
            this.VirtualHost = new String(source.VirtualHost);
        }
        if (source.SortElement != null) {
            this.SortElement = new String(source.SortElement);
        }
        if (source.SortType != null) {
            this.SortType = new String(source.SortType);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "VirtualHost", this.VirtualHost);
        this.setParamSimple(map, prefix + "SortElement", this.SortElement);
        this.setParamSimple(map, prefix + "SortType", this.SortType);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

