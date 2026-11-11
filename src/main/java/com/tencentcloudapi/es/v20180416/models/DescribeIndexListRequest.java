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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIndexListRequest extends AbstractModel {

    /**
    * <p>索引类型。auto：自治索引；normal：普通索引</p>
    */
    @SerializedName("IndexType")
    @Expose
    private String IndexType;

    /**
    * <p>ES集群ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>索引名，若填空则获取所有索引</p>
    */
    @SerializedName("IndexName")
    @Expose
    private String IndexName;

    /**
    * <p>集群访问用户名</p>
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * <p>集群访问密码</p>
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * <p>分页起始位置</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>一页展示数量</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>排序字段，支持索引名：IndexName、索引存储量：IndexStorage、索引创建时间：IndexCreateTime</p>
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * <p>过滤索引状态</p>
    */
    @SerializedName("IndexStatusList")
    @Expose
    private String [] IndexStatusList;

    /**
    * <p>排序顺序，支持asc、desc，默认为desc 数据格式&quot;asc&quot;,&quot;desc&quot;</p>
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * <p>索引名称过滤列表。仅返回列表中指定的索引，常用于事件中心跳转时筛选受影响的索引；不填返回全部索引。单次最多支持100个索引名称。</p>
    */
    @SerializedName("FilterIndexNames")
    @Expose
    private String [] FilterIndexNames;

    /**
     * Get <p>索引类型。auto：自治索引；normal：普通索引</p> 
     * @return IndexType <p>索引类型。auto：自治索引；normal：普通索引</p>
     */
    public String getIndexType() {
        return this.IndexType;
    }

    /**
     * Set <p>索引类型。auto：自治索引；normal：普通索引</p>
     * @param IndexType <p>索引类型。auto：自治索引；normal：普通索引</p>
     */
    public void setIndexType(String IndexType) {
        this.IndexType = IndexType;
    }

    /**
     * Get <p>ES集群ID</p> 
     * @return InstanceId <p>ES集群ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>ES集群ID</p>
     * @param InstanceId <p>ES集群ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>索引名，若填空则获取所有索引</p> 
     * @return IndexName <p>索引名，若填空则获取所有索引</p>
     */
    public String getIndexName() {
        return this.IndexName;
    }

    /**
     * Set <p>索引名，若填空则获取所有索引</p>
     * @param IndexName <p>索引名，若填空则获取所有索引</p>
     */
    public void setIndexName(String IndexName) {
        this.IndexName = IndexName;
    }

    /**
     * Get <p>集群访问用户名</p> 
     * @return Username <p>集群访问用户名</p>
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set <p>集群访问用户名</p>
     * @param Username <p>集群访问用户名</p>
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get <p>集群访问密码</p> 
     * @return Password <p>集群访问密码</p>
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set <p>集群访问密码</p>
     * @param Password <p>集群访问密码</p>
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get <p>分页起始位置</p> 
     * @return Offset <p>分页起始位置</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页起始位置</p>
     * @param Offset <p>分页起始位置</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>一页展示数量</p> 
     * @return Limit <p>一页展示数量</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>一页展示数量</p>
     * @param Limit <p>一页展示数量</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>排序字段，支持索引名：IndexName、索引存储量：IndexStorage、索引创建时间：IndexCreateTime</p> 
     * @return OrderBy <p>排序字段，支持索引名：IndexName、索引存储量：IndexStorage、索引创建时间：IndexCreateTime</p>
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set <p>排序字段，支持索引名：IndexName、索引存储量：IndexStorage、索引创建时间：IndexCreateTime</p>
     * @param OrderBy <p>排序字段，支持索引名：IndexName、索引存储量：IndexStorage、索引创建时间：IndexCreateTime</p>
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get <p>过滤索引状态</p> 
     * @return IndexStatusList <p>过滤索引状态</p>
     */
    public String [] getIndexStatusList() {
        return this.IndexStatusList;
    }

    /**
     * Set <p>过滤索引状态</p>
     * @param IndexStatusList <p>过滤索引状态</p>
     */
    public void setIndexStatusList(String [] IndexStatusList) {
        this.IndexStatusList = IndexStatusList;
    }

    /**
     * Get <p>排序顺序，支持asc、desc，默认为desc 数据格式&quot;asc&quot;,&quot;desc&quot;</p> 
     * @return Order <p>排序顺序，支持asc、desc，默认为desc 数据格式&quot;asc&quot;,&quot;desc&quot;</p>
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set <p>排序顺序，支持asc、desc，默认为desc 数据格式&quot;asc&quot;,&quot;desc&quot;</p>
     * @param Order <p>排序顺序，支持asc、desc，默认为desc 数据格式&quot;asc&quot;,&quot;desc&quot;</p>
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get <p>索引名称过滤列表。仅返回列表中指定的索引，常用于事件中心跳转时筛选受影响的索引；不填返回全部索引。单次最多支持100个索引名称。</p> 
     * @return FilterIndexNames <p>索引名称过滤列表。仅返回列表中指定的索引，常用于事件中心跳转时筛选受影响的索引；不填返回全部索引。单次最多支持100个索引名称。</p>
     */
    public String [] getFilterIndexNames() {
        return this.FilterIndexNames;
    }

    /**
     * Set <p>索引名称过滤列表。仅返回列表中指定的索引，常用于事件中心跳转时筛选受影响的索引；不填返回全部索引。单次最多支持100个索引名称。</p>
     * @param FilterIndexNames <p>索引名称过滤列表。仅返回列表中指定的索引，常用于事件中心跳转时筛选受影响的索引；不填返回全部索引。单次最多支持100个索引名称。</p>
     */
    public void setFilterIndexNames(String [] FilterIndexNames) {
        this.FilterIndexNames = FilterIndexNames;
    }

    public DescribeIndexListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIndexListRequest(DescribeIndexListRequest source) {
        if (source.IndexType != null) {
            this.IndexType = new String(source.IndexType);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.IndexName != null) {
            this.IndexName = new String(source.IndexName);
        }
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.IndexStatusList != null) {
            this.IndexStatusList = new String[source.IndexStatusList.length];
            for (int i = 0; i < source.IndexStatusList.length; i++) {
                this.IndexStatusList[i] = new String(source.IndexStatusList[i]);
            }
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.FilterIndexNames != null) {
            this.FilterIndexNames = new String[source.FilterIndexNames.length];
            for (int i = 0; i < source.FilterIndexNames.length; i++) {
                this.FilterIndexNames[i] = new String(source.FilterIndexNames[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IndexType", this.IndexType);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "IndexName", this.IndexName);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamArraySimple(map, prefix + "IndexStatusList.", this.IndexStatusList);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamArraySimple(map, prefix + "FilterIndexNames.", this.FilterIndexNames);

    }
}

