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
package com.tencentcloudapi.bmlb.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTrafficMirrorsRequest extends AbstractModel {

    /**
    * 流量镜像实例ID的数组，支持批量查询
    */
    @SerializedName("TrafficMirrorIds")
    @Expose
    private String [] TrafficMirrorIds;

    /**
    * 流量镜像实例别名数组。
    */
    @SerializedName("Aliases")
    @Expose
    private String [] Aliases;

    /**
    * 流量镜像实例所属的私有网络ID数组，形如：vpc-xxx。
    */
    @SerializedName("VpcIds")
    @Expose
    private String [] VpcIds;

    /**
    * 分页的偏移量，也即从第几条记录开始查询
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 单次查询返回的条目数，默认值：500。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 排序字段。trafficMirrorId或者createTime。
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
    * 排序方式，取值：0:增序(默认)，1:降序
    */
    @SerializedName("Order")
    @Expose
    private Long Order;

    /**
    * 模糊匹配trafficMirrorId或者alias字段。
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
     * Get 流量镜像实例ID的数组，支持批量查询 
     * @return TrafficMirrorIds 流量镜像实例ID的数组，支持批量查询
     */
    public String [] getTrafficMirrorIds() {
        return this.TrafficMirrorIds;
    }

    /**
     * Set 流量镜像实例ID的数组，支持批量查询
     * @param TrafficMirrorIds 流量镜像实例ID的数组，支持批量查询
     */
    public void setTrafficMirrorIds(String [] TrafficMirrorIds) {
        this.TrafficMirrorIds = TrafficMirrorIds;
    }

    /**
     * Get 流量镜像实例别名数组。 
     * @return Aliases 流量镜像实例别名数组。
     */
    public String [] getAliases() {
        return this.Aliases;
    }

    /**
     * Set 流量镜像实例别名数组。
     * @param Aliases 流量镜像实例别名数组。
     */
    public void setAliases(String [] Aliases) {
        this.Aliases = Aliases;
    }

    /**
     * Get 流量镜像实例所属的私有网络ID数组，形如：vpc-xxx。 
     * @return VpcIds 流量镜像实例所属的私有网络ID数组，形如：vpc-xxx。
     */
    public String [] getVpcIds() {
        return this.VpcIds;
    }

    /**
     * Set 流量镜像实例所属的私有网络ID数组，形如：vpc-xxx。
     * @param VpcIds 流量镜像实例所属的私有网络ID数组，形如：vpc-xxx。
     */
    public void setVpcIds(String [] VpcIds) {
        this.VpcIds = VpcIds;
    }

    /**
     * Get 分页的偏移量，也即从第几条记录开始查询 
     * @return Offset 分页的偏移量，也即从第几条记录开始查询
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页的偏移量，也即从第几条记录开始查询
     * @param Offset 分页的偏移量，也即从第几条记录开始查询
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 单次查询返回的条目数，默认值：500。 
     * @return Limit 单次查询返回的条目数，默认值：500。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 单次查询返回的条目数，默认值：500。
     * @param Limit 单次查询返回的条目数，默认值：500。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 排序字段。trafficMirrorId或者createTime。 
     * @return OrderField 排序字段。trafficMirrorId或者createTime。
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set 排序字段。trafficMirrorId或者createTime。
     * @param OrderField 排序字段。trafficMirrorId或者createTime。
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    /**
     * Get 排序方式，取值：0:增序(默认)，1:降序 
     * @return Order 排序方式，取值：0:增序(默认)，1:降序
     */
    public Long getOrder() {
        return this.Order;
    }

    /**
     * Set 排序方式，取值：0:增序(默认)，1:降序
     * @param Order 排序方式，取值：0:增序(默认)，1:降序
     */
    public void setOrder(Long Order) {
        this.Order = Order;
    }

    /**
     * Get 模糊匹配trafficMirrorId或者alias字段。 
     * @return SearchKey 模糊匹配trafficMirrorId或者alias字段。
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * Set 模糊匹配trafficMirrorId或者alias字段。
     * @param SearchKey 模糊匹配trafficMirrorId或者alias字段。
     */
    public void setSearchKey(String SearchKey) {
        this.SearchKey = SearchKey;
    }

    public DescribeTrafficMirrorsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTrafficMirrorsRequest(DescribeTrafficMirrorsRequest source) {
        if (source.TrafficMirrorIds != null) {
            this.TrafficMirrorIds = new String[source.TrafficMirrorIds.length];
            for (int i = 0; i < source.TrafficMirrorIds.length; i++) {
                this.TrafficMirrorIds[i] = new String(source.TrafficMirrorIds[i]);
            }
        }
        if (source.Aliases != null) {
            this.Aliases = new String[source.Aliases.length];
            for (int i = 0; i < source.Aliases.length; i++) {
                this.Aliases[i] = new String(source.Aliases[i]);
            }
        }
        if (source.VpcIds != null) {
            this.VpcIds = new String[source.VpcIds.length];
            for (int i = 0; i < source.VpcIds.length; i++) {
                this.VpcIds[i] = new String(source.VpcIds[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.OrderField != null) {
            this.OrderField = new String(source.OrderField);
        }
        if (source.Order != null) {
            this.Order = new Long(source.Order);
        }
        if (source.SearchKey != null) {
            this.SearchKey = new String(source.SearchKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "TrafficMirrorIds.", this.TrafficMirrorIds);
        this.setParamArraySimple(map, prefix + "Aliases.", this.Aliases);
        this.setParamArraySimple(map, prefix + "VpcIds.", this.VpcIds);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "SearchKey", this.SearchKey);

    }
}

