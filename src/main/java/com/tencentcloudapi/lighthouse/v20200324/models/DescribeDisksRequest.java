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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDisksRequest extends AbstractModel{

    /**
    * 云硬盘ID列表。
    */
    @SerializedName("DiskIds")
    @Expose
    private String [] DiskIds;

    /**
    * 过滤器列表。
disk-id
按照【云硬盘 ID】进行过滤。
类型：String
必选：否
instance-id
按照【实例ID】进行过滤。
类型：String
必选：否
disk-name
按照【云硬盘名称】进行过滤。
类型：String
必选：否
zone
按照【可用区】进行过滤。
类型：String
必选：否
disk-usage
按照【云硬盘类型】进行过滤。
类型：String
必选：否
disk-state
按照【云硬盘状态】进行过滤。
类型：String
必选：否
每次请求的 Filters 的上限为 10，Filter.Values 的上限为 5。参数不支持同时指定 DiskIds 和 Filters。
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 返回数量，默认为20，最大值为100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 云硬盘列表排序的依据字段。取值范围："CREATED_TIME"：依据云硬盘的创建时间排序。 "EXPIRED_TIME"：依据云硬盘的到期时间排序。"DISK_SIZE"：依据云硬盘的大小排序。默认按云硬盘创建时间排序。
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
    * 输出云硬盘列表的排列顺序。取值范围："ASC"：升序排列。 "DESC"：降序排列。默认按降序排列。
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
     * Get 云硬盘ID列表。 
     * @return DiskIds 云硬盘ID列表。
     */
    public String [] getDiskIds() {
        return this.DiskIds;
    }

    /**
     * Set 云硬盘ID列表。
     * @param DiskIds 云硬盘ID列表。
     */
    public void setDiskIds(String [] DiskIds) {
        this.DiskIds = DiskIds;
    }

    /**
     * Get 过滤器列表。
disk-id
按照【云硬盘 ID】进行过滤。
类型：String
必选：否
instance-id
按照【实例ID】进行过滤。
类型：String
必选：否
disk-name
按照【云硬盘名称】进行过滤。
类型：String
必选：否
zone
按照【可用区】进行过滤。
类型：String
必选：否
disk-usage
按照【云硬盘类型】进行过滤。
类型：String
必选：否
disk-state
按照【云硬盘状态】进行过滤。
类型：String
必选：否
每次请求的 Filters 的上限为 10，Filter.Values 的上限为 5。参数不支持同时指定 DiskIds 和 Filters。 
     * @return Filters 过滤器列表。
disk-id
按照【云硬盘 ID】进行过滤。
类型：String
必选：否
instance-id
按照【实例ID】进行过滤。
类型：String
必选：否
disk-name
按照【云硬盘名称】进行过滤。
类型：String
必选：否
zone
按照【可用区】进行过滤。
类型：String
必选：否
disk-usage
按照【云硬盘类型】进行过滤。
类型：String
必选：否
disk-state
按照【云硬盘状态】进行过滤。
类型：String
必选：否
每次请求的 Filters 的上限为 10，Filter.Values 的上限为 5。参数不支持同时指定 DiskIds 和 Filters。
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤器列表。
disk-id
按照【云硬盘 ID】进行过滤。
类型：String
必选：否
instance-id
按照【实例ID】进行过滤。
类型：String
必选：否
disk-name
按照【云硬盘名称】进行过滤。
类型：String
必选：否
zone
按照【可用区】进行过滤。
类型：String
必选：否
disk-usage
按照【云硬盘类型】进行过滤。
类型：String
必选：否
disk-state
按照【云硬盘状态】进行过滤。
类型：String
必选：否
每次请求的 Filters 的上限为 10，Filter.Values 的上限为 5。参数不支持同时指定 DiskIds 和 Filters。
     * @param Filters 过滤器列表。
disk-id
按照【云硬盘 ID】进行过滤。
类型：String
必选：否
instance-id
按照【实例ID】进行过滤。
类型：String
必选：否
disk-name
按照【云硬盘名称】进行过滤。
类型：String
必选：否
zone
按照【可用区】进行过滤。
类型：String
必选：否
disk-usage
按照【云硬盘类型】进行过滤。
类型：String
必选：否
disk-state
按照【云硬盘状态】进行过滤。
类型：String
必选：否
每次请求的 Filters 的上限为 10，Filter.Values 的上限为 5。参数不支持同时指定 DiskIds 和 Filters。
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
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
     * Get 云硬盘列表排序的依据字段。取值范围："CREATED_TIME"：依据云硬盘的创建时间排序。 "EXPIRED_TIME"：依据云硬盘的到期时间排序。"DISK_SIZE"：依据云硬盘的大小排序。默认按云硬盘创建时间排序。 
     * @return OrderField 云硬盘列表排序的依据字段。取值范围："CREATED_TIME"：依据云硬盘的创建时间排序。 "EXPIRED_TIME"：依据云硬盘的到期时间排序。"DISK_SIZE"：依据云硬盘的大小排序。默认按云硬盘创建时间排序。
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set 云硬盘列表排序的依据字段。取值范围："CREATED_TIME"：依据云硬盘的创建时间排序。 "EXPIRED_TIME"：依据云硬盘的到期时间排序。"DISK_SIZE"：依据云硬盘的大小排序。默认按云硬盘创建时间排序。
     * @param OrderField 云硬盘列表排序的依据字段。取值范围："CREATED_TIME"：依据云硬盘的创建时间排序。 "EXPIRED_TIME"：依据云硬盘的到期时间排序。"DISK_SIZE"：依据云硬盘的大小排序。默认按云硬盘创建时间排序。
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    /**
     * Get 输出云硬盘列表的排列顺序。取值范围："ASC"：升序排列。 "DESC"：降序排列。默认按降序排列。 
     * @return Order 输出云硬盘列表的排列顺序。取值范围："ASC"：升序排列。 "DESC"：降序排列。默认按降序排列。
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 输出云硬盘列表的排列顺序。取值范围："ASC"：升序排列。 "DESC"：降序排列。默认按降序排列。
     * @param Order 输出云硬盘列表的排列顺序。取值范围："ASC"：升序排列。 "DESC"：降序排列。默认按降序排列。
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    public DescribeDisksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDisksRequest(DescribeDisksRequest source) {
        if (source.DiskIds != null) {
            this.DiskIds = new String[source.DiskIds.length];
            for (int i = 0; i < source.DiskIds.length; i++) {
                this.DiskIds[i] = new String(source.DiskIds[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.OrderField != null) {
            this.OrderField = new String(source.OrderField);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DiskIds.", this.DiskIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);
        this.setParamSimple(map, prefix + "Order", this.Order);

    }
}

