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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSnapshotsRequest extends AbstractModel {

    /**
    * 要查询快照的ID列表。参数不支持同时指定`SnapshotIds`和`Filters`。
    */
    @SerializedName("SnapshotIds")
    @Expose
    private String [] SnapshotIds;

    /**
    * 过滤条件。参数不支持同时指定SnapshotIds和Filters。<br><ul><li>snapshot-id<ul><li>按照云硬盘快照ID进行过滤</li><li>类型：String</li><li>必选：否</li></ul></li><li>snapshot-name<ul><li>按照云硬盘快照名称进行过滤</li><li>类型：String</li><li>必选：否</li></ul></li><li>snapshot-state<ul><li>按照云硬盘快照状态进行过滤</li><li>类型：String</li><li>必选：否</li><li>取值范围：<ul><li><code>NORMAL</code>：正常 </li><li><code>CREATING</code>：创建中 </li><li><code>ROLLBACKING</code>：回滚中 </li><li><code>COPYING_FROM_REMOTE</code>：跨地域复制中 </li><li><code>CHECKING_COPIED</code>：复制校验中</li><li><code>TORECYCLE</code>：待回收</li></ul></li></ul></li><li>disk-usage<ul><li>按照云硬盘使用用途进行过滤</li><li>类型：String</li><li>必选：否</li><li>取值范围：<ul><li><code>SYSTEM_DISK</code>：代表系统盘</li><li><code>DATA_DISK</code>：代表数据盘</li></ul></li></ul></li><li>project-id<ul><li>按云硬盘所属项目ID过滤</li><li>类型：String</li><li>必选：否</li></ul></li><li>disk-id<ul><li>按照云硬盘ID进行过滤，一次最多只能传入10个值</li><li>类型：String</li><li>必选：否</li></ul></li><li>encrypt<ul><li>按是否加密进行过滤</li><li>类型：String</li><li>必选：否</li></ul></li><li>snapshot-type<ul><li>按快照归属类型查询</li><li>类型：String</li><li>必选：否</li><li>取值范围：<ul><li><code>SHARED_SNAPSHOT</code>：表示共享过来的快照</li><li><code>PRIVATE_SNAPSHOT</code>：表示自己的私有快照</li></ul></li></ul></li></ul>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 返回数量，默认为20，最大值为100。关于`Limit`的更进一步介绍请参考 API [简介](/document/product/362/15633)中的相关小节。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 快照列表排序的依据字段。取值范围：
<ul>
<li>CREATE_TIME：依据快照的创建时间排序</li>
<li>默认按创建时间排序</li>
</ul>
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
    * 偏移量，默认为0。关于`Offset`的更进一步介绍请参考API[简介](/document/product/362/15633)中的相关小节。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 输出云盘列表的排列顺序。取值范围：
<ul>
    <li>ASC：升序排列</li>
    <li>DESC：降序排列。</li>
</ul>

    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
     * Get 要查询快照的ID列表。参数不支持同时指定`SnapshotIds`和`Filters`。 
     * @return SnapshotIds 要查询快照的ID列表。参数不支持同时指定`SnapshotIds`和`Filters`。
     */
    public String [] getSnapshotIds() {
        return this.SnapshotIds;
    }

    /**
     * Set 要查询快照的ID列表。参数不支持同时指定`SnapshotIds`和`Filters`。
     * @param SnapshotIds 要查询快照的ID列表。参数不支持同时指定`SnapshotIds`和`Filters`。
     */
    public void setSnapshotIds(String [] SnapshotIds) {
        this.SnapshotIds = SnapshotIds;
    }

    /**
     * Get 过滤条件。参数不支持同时指定SnapshotIds和Filters。<br><ul><li>snapshot-id<ul><li>按照云硬盘快照ID进行过滤</li><li>类型：String</li><li>必选：否</li></ul></li><li>snapshot-name<ul><li>按照云硬盘快照名称进行过滤</li><li>类型：String</li><li>必选：否</li></ul></li><li>snapshot-state<ul><li>按照云硬盘快照状态进行过滤</li><li>类型：String</li><li>必选：否</li><li>取值范围：<ul><li><code>NORMAL</code>：正常 </li><li><code>CREATING</code>：创建中 </li><li><code>ROLLBACKING</code>：回滚中 </li><li><code>COPYING_FROM_REMOTE</code>：跨地域复制中 </li><li><code>CHECKING_COPIED</code>：复制校验中</li><li><code>TORECYCLE</code>：待回收</li></ul></li></ul></li><li>disk-usage<ul><li>按照云硬盘使用用途进行过滤</li><li>类型：String</li><li>必选：否</li><li>取值范围：<ul><li><code>SYSTEM_DISK</code>：代表系统盘</li><li><code>DATA_DISK</code>：代表数据盘</li></ul></li></ul></li><li>project-id<ul><li>按云硬盘所属项目ID过滤</li><li>类型：String</li><li>必选：否</li></ul></li><li>disk-id<ul><li>按照云硬盘ID进行过滤，一次最多只能传入10个值</li><li>类型：String</li><li>必选：否</li></ul></li><li>encrypt<ul><li>按是否加密进行过滤</li><li>类型：String</li><li>必选：否</li></ul></li><li>snapshot-type<ul><li>按快照归属类型查询</li><li>类型：String</li><li>必选：否</li><li>取值范围：<ul><li><code>SHARED_SNAPSHOT</code>：表示共享过来的快照</li><li><code>PRIVATE_SNAPSHOT</code>：表示自己的私有快照</li></ul></li></ul></li></ul> 
     * @return Filters 过滤条件。参数不支持同时指定SnapshotIds和Filters。<br><ul><li>snapshot-id<ul><li>按照云硬盘快照ID进行过滤</li><li>类型：String</li><li>必选：否</li></ul></li><li>snapshot-name<ul><li>按照云硬盘快照名称进行过滤</li><li>类型：String</li><li>必选：否</li></ul></li><li>snapshot-state<ul><li>按照云硬盘快照状态进行过滤</li><li>类型：String</li><li>必选：否</li><li>取值范围：<ul><li><code>NORMAL</code>：正常 </li><li><code>CREATING</code>：创建中 </li><li><code>ROLLBACKING</code>：回滚中 </li><li><code>COPYING_FROM_REMOTE</code>：跨地域复制中 </li><li><code>CHECKING_COPIED</code>：复制校验中</li><li><code>TORECYCLE</code>：待回收</li></ul></li></ul></li><li>disk-usage<ul><li>按照云硬盘使用用途进行过滤</li><li>类型：String</li><li>必选：否</li><li>取值范围：<ul><li><code>SYSTEM_DISK</code>：代表系统盘</li><li><code>DATA_DISK</code>：代表数据盘</li></ul></li></ul></li><li>project-id<ul><li>按云硬盘所属项目ID过滤</li><li>类型：String</li><li>必选：否</li></ul></li><li>disk-id<ul><li>按照云硬盘ID进行过滤，一次最多只能传入10个值</li><li>类型：String</li><li>必选：否</li></ul></li><li>encrypt<ul><li>按是否加密进行过滤</li><li>类型：String</li><li>必选：否</li></ul></li><li>snapshot-type<ul><li>按快照归属类型查询</li><li>类型：String</li><li>必选：否</li><li>取值范围：<ul><li><code>SHARED_SNAPSHOT</code>：表示共享过来的快照</li><li><code>PRIVATE_SNAPSHOT</code>：表示自己的私有快照</li></ul></li></ul></li></ul>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件。参数不支持同时指定SnapshotIds和Filters。<br><ul><li>snapshot-id<ul><li>按照云硬盘快照ID进行过滤</li><li>类型：String</li><li>必选：否</li></ul></li><li>snapshot-name<ul><li>按照云硬盘快照名称进行过滤</li><li>类型：String</li><li>必选：否</li></ul></li><li>snapshot-state<ul><li>按照云硬盘快照状态进行过滤</li><li>类型：String</li><li>必选：否</li><li>取值范围：<ul><li><code>NORMAL</code>：正常 </li><li><code>CREATING</code>：创建中 </li><li><code>ROLLBACKING</code>：回滚中 </li><li><code>COPYING_FROM_REMOTE</code>：跨地域复制中 </li><li><code>CHECKING_COPIED</code>：复制校验中</li><li><code>TORECYCLE</code>：待回收</li></ul></li></ul></li><li>disk-usage<ul><li>按照云硬盘使用用途进行过滤</li><li>类型：String</li><li>必选：否</li><li>取值范围：<ul><li><code>SYSTEM_DISK</code>：代表系统盘</li><li><code>DATA_DISK</code>：代表数据盘</li></ul></li></ul></li><li>project-id<ul><li>按云硬盘所属项目ID过滤</li><li>类型：String</li><li>必选：否</li></ul></li><li>disk-id<ul><li>按照云硬盘ID进行过滤，一次最多只能传入10个值</li><li>类型：String</li><li>必选：否</li></ul></li><li>encrypt<ul><li>按是否加密进行过滤</li><li>类型：String</li><li>必选：否</li></ul></li><li>snapshot-type<ul><li>按快照归属类型查询</li><li>类型：String</li><li>必选：否</li><li>取值范围：<ul><li><code>SHARED_SNAPSHOT</code>：表示共享过来的快照</li><li><code>PRIVATE_SNAPSHOT</code>：表示自己的私有快照</li></ul></li></ul></li></ul>
     * @param Filters 过滤条件。参数不支持同时指定SnapshotIds和Filters。<br><ul><li>snapshot-id<ul><li>按照云硬盘快照ID进行过滤</li><li>类型：String</li><li>必选：否</li></ul></li><li>snapshot-name<ul><li>按照云硬盘快照名称进行过滤</li><li>类型：String</li><li>必选：否</li></ul></li><li>snapshot-state<ul><li>按照云硬盘快照状态进行过滤</li><li>类型：String</li><li>必选：否</li><li>取值范围：<ul><li><code>NORMAL</code>：正常 </li><li><code>CREATING</code>：创建中 </li><li><code>ROLLBACKING</code>：回滚中 </li><li><code>COPYING_FROM_REMOTE</code>：跨地域复制中 </li><li><code>CHECKING_COPIED</code>：复制校验中</li><li><code>TORECYCLE</code>：待回收</li></ul></li></ul></li><li>disk-usage<ul><li>按照云硬盘使用用途进行过滤</li><li>类型：String</li><li>必选：否</li><li>取值范围：<ul><li><code>SYSTEM_DISK</code>：代表系统盘</li><li><code>DATA_DISK</code>：代表数据盘</li></ul></li></ul></li><li>project-id<ul><li>按云硬盘所属项目ID过滤</li><li>类型：String</li><li>必选：否</li></ul></li><li>disk-id<ul><li>按照云硬盘ID进行过滤，一次最多只能传入10个值</li><li>类型：String</li><li>必选：否</li></ul></li><li>encrypt<ul><li>按是否加密进行过滤</li><li>类型：String</li><li>必选：否</li></ul></li><li>snapshot-type<ul><li>按快照归属类型查询</li><li>类型：String</li><li>必选：否</li><li>取值范围：<ul><li><code>SHARED_SNAPSHOT</code>：表示共享过来的快照</li><li><code>PRIVATE_SNAPSHOT</code>：表示自己的私有快照</li></ul></li></ul></li></ul>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 返回数量，默认为20，最大值为100。关于`Limit`的更进一步介绍请参考 API [简介](/document/product/362/15633)中的相关小节。 
     * @return Limit 返回数量，默认为20，最大值为100。关于`Limit`的更进一步介绍请参考 API [简介](/document/product/362/15633)中的相关小节。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为20，最大值为100。关于`Limit`的更进一步介绍请参考 API [简介](/document/product/362/15633)中的相关小节。
     * @param Limit 返回数量，默认为20，最大值为100。关于`Limit`的更进一步介绍请参考 API [简介](/document/product/362/15633)中的相关小节。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 快照列表排序的依据字段。取值范围：
<ul>
<li>CREATE_TIME：依据快照的创建时间排序</li>
<li>默认按创建时间排序</li>
</ul> 
     * @return OrderField 快照列表排序的依据字段。取值范围：
<ul>
<li>CREATE_TIME：依据快照的创建时间排序</li>
<li>默认按创建时间排序</li>
</ul>
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set 快照列表排序的依据字段。取值范围：
<ul>
<li>CREATE_TIME：依据快照的创建时间排序</li>
<li>默认按创建时间排序</li>
</ul>
     * @param OrderField 快照列表排序的依据字段。取值范围：
<ul>
<li>CREATE_TIME：依据快照的创建时间排序</li>
<li>默认按创建时间排序</li>
</ul>
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    /**
     * Get 偏移量，默认为0。关于`Offset`的更进一步介绍请参考API[简介](/document/product/362/15633)中的相关小节。 
     * @return Offset 偏移量，默认为0。关于`Offset`的更进一步介绍请参考API[简介](/document/product/362/15633)中的相关小节。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0。关于`Offset`的更进一步介绍请参考API[简介](/document/product/362/15633)中的相关小节。
     * @param Offset 偏移量，默认为0。关于`Offset`的更进一步介绍请参考API[简介](/document/product/362/15633)中的相关小节。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 输出云盘列表的排列顺序。取值范围：
<ul>
    <li>ASC：升序排列</li>
    <li>DESC：降序排列。</li>
</ul>
 
     * @return Order 输出云盘列表的排列顺序。取值范围：
<ul>
    <li>ASC：升序排列</li>
    <li>DESC：降序排列。</li>
</ul>

     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 输出云盘列表的排列顺序。取值范围：
<ul>
    <li>ASC：升序排列</li>
    <li>DESC：降序排列。</li>
</ul>

     * @param Order 输出云盘列表的排列顺序。取值范围：
<ul>
    <li>ASC：升序排列</li>
    <li>DESC：降序排列。</li>
</ul>

     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    public DescribeSnapshotsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSnapshotsRequest(DescribeSnapshotsRequest source) {
        if (source.SnapshotIds != null) {
            this.SnapshotIds = new String[source.SnapshotIds.length];
            for (int i = 0; i < source.SnapshotIds.length; i++) {
                this.SnapshotIds[i] = new String(source.SnapshotIds[i]);
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
        if (source.OrderField != null) {
            this.OrderField = new String(source.OrderField);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "SnapshotIds.", this.SnapshotIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Order", this.Order);

    }
}

