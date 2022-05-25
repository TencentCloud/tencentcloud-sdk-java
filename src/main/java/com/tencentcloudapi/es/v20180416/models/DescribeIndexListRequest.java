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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIndexListRequest extends AbstractModel{

    /**
    * 索引类型。auto：自治索引；normal：普通索引
    */
    @SerializedName("IndexType")
    @Expose
    private String IndexType;

    /**
    * ES集群ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 索引名，若填空则获取所有索引
    */
    @SerializedName("IndexName")
    @Expose
    private String IndexName;

    /**
    * 集群访问用户名
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * 集群访问密码
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 分页起始位置
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 一页展示数量
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 排序字段，支持索引名：IndexName、索引存储量：IndexStorage、索引创建时间：IndexCreateTime
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 过滤索引状态
    */
    @SerializedName("IndexStatusList")
    @Expose
    private String [] IndexStatusList;

    /**
    * 排序顺序，支持asc、desc
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
     * Get 索引类型。auto：自治索引；normal：普通索引 
     * @return IndexType 索引类型。auto：自治索引；normal：普通索引
     */
    public String getIndexType() {
        return this.IndexType;
    }

    /**
     * Set 索引类型。auto：自治索引；normal：普通索引
     * @param IndexType 索引类型。auto：自治索引；normal：普通索引
     */
    public void setIndexType(String IndexType) {
        this.IndexType = IndexType;
    }

    /**
     * Get ES集群ID 
     * @return InstanceId ES集群ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ES集群ID
     * @param InstanceId ES集群ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 索引名，若填空则获取所有索引 
     * @return IndexName 索引名，若填空则获取所有索引
     */
    public String getIndexName() {
        return this.IndexName;
    }

    /**
     * Set 索引名，若填空则获取所有索引
     * @param IndexName 索引名，若填空则获取所有索引
     */
    public void setIndexName(String IndexName) {
        this.IndexName = IndexName;
    }

    /**
     * Get 集群访问用户名 
     * @return Username 集群访问用户名
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set 集群访问用户名
     * @param Username 集群访问用户名
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get 集群访问密码 
     * @return Password 集群访问密码
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 集群访问密码
     * @param Password 集群访问密码
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 分页起始位置 
     * @return Offset 分页起始位置
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页起始位置
     * @param Offset 分页起始位置
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 一页展示数量 
     * @return Limit 一页展示数量
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 一页展示数量
     * @param Limit 一页展示数量
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 排序字段，支持索引名：IndexName、索引存储量：IndexStorage、索引创建时间：IndexCreateTime 
     * @return OrderBy 排序字段，支持索引名：IndexName、索引存储量：IndexStorage、索引创建时间：IndexCreateTime
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 排序字段，支持索引名：IndexName、索引存储量：IndexStorage、索引创建时间：IndexCreateTime
     * @param OrderBy 排序字段，支持索引名：IndexName、索引存储量：IndexStorage、索引创建时间：IndexCreateTime
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 过滤索引状态 
     * @return IndexStatusList 过滤索引状态
     */
    public String [] getIndexStatusList() {
        return this.IndexStatusList;
    }

    /**
     * Set 过滤索引状态
     * @param IndexStatusList 过滤索引状态
     */
    public void setIndexStatusList(String [] IndexStatusList) {
        this.IndexStatusList = IndexStatusList;
    }

    /**
     * Get 排序顺序，支持asc、desc 
     * @return Order 排序顺序，支持asc、desc
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 排序顺序，支持asc、desc
     * @param Order 排序顺序，支持asc、desc
     */
    public void setOrder(String Order) {
        this.Order = Order;
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

    }
}

