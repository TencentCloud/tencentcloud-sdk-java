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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCfsSnapshotsRequest extends AbstractModel {

    /**
    * 文件系统ID
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * 快照ID
    */
    @SerializedName("SnapshotId")
    @Expose
    private String SnapshotId;

    /**
    * 分页起始位置，默认为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 页面长度，默认为20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 过滤条件。
<br>SnapshotId - Array of String - 是否必填：否 -（过滤条件）按快照ID过滤。
<br>SnapshotName - Array of String - 是否必填：否 -（过滤条件）按照快照名称过滤。
<br>FileSystemId - Array of String - 是否必填：否 -（过滤条件）按文件系统ID过滤。
<br>FsName - Array of String - 是否必填：否 -（过滤条件）按文件系统名过滤。
<br>Status - Array of String - 是否必填：否 -（过滤条件）按照快照状态过滤
(creating：创建中 | available：运行中| deleting: 删除中 | rollbacking_new：由快照创建新文件系统中| create-failed 创建失败）
<br>tag-key - Array of String - 是否必填：否 -（过滤条件）按照标签键进行过滤。
<br>tag:tag-key - Array of String - 是否必填：否 -（过滤条件）按照标签键值对进行过滤。 tag-key使用具体的标签键进行替换。
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 按创建时间排序取值
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
    * 排序 升序或者降序
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
     * Get 文件系统ID 
     * @return FileSystemId 文件系统ID
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set 文件系统ID
     * @param FileSystemId 文件系统ID
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get 快照ID 
     * @return SnapshotId 快照ID
     */
    public String getSnapshotId() {
        return this.SnapshotId;
    }

    /**
     * Set 快照ID
     * @param SnapshotId 快照ID
     */
    public void setSnapshotId(String SnapshotId) {
        this.SnapshotId = SnapshotId;
    }

    /**
     * Get 分页起始位置，默认为0 
     * @return Offset 分页起始位置，默认为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页起始位置，默认为0
     * @param Offset 分页起始位置，默认为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 页面长度，默认为20 
     * @return Limit 页面长度，默认为20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 页面长度，默认为20
     * @param Limit 页面长度，默认为20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 过滤条件。
<br>SnapshotId - Array of String - 是否必填：否 -（过滤条件）按快照ID过滤。
<br>SnapshotName - Array of String - 是否必填：否 -（过滤条件）按照快照名称过滤。
<br>FileSystemId - Array of String - 是否必填：否 -（过滤条件）按文件系统ID过滤。
<br>FsName - Array of String - 是否必填：否 -（过滤条件）按文件系统名过滤。
<br>Status - Array of String - 是否必填：否 -（过滤条件）按照快照状态过滤
(creating：创建中 | available：运行中| deleting: 删除中 | rollbacking_new：由快照创建新文件系统中| create-failed 创建失败）
<br>tag-key - Array of String - 是否必填：否 -（过滤条件）按照标签键进行过滤。
<br>tag:tag-key - Array of String - 是否必填：否 -（过滤条件）按照标签键值对进行过滤。 tag-key使用具体的标签键进行替换。 
     * @return Filters 过滤条件。
<br>SnapshotId - Array of String - 是否必填：否 -（过滤条件）按快照ID过滤。
<br>SnapshotName - Array of String - 是否必填：否 -（过滤条件）按照快照名称过滤。
<br>FileSystemId - Array of String - 是否必填：否 -（过滤条件）按文件系统ID过滤。
<br>FsName - Array of String - 是否必填：否 -（过滤条件）按文件系统名过滤。
<br>Status - Array of String - 是否必填：否 -（过滤条件）按照快照状态过滤
(creating：创建中 | available：运行中| deleting: 删除中 | rollbacking_new：由快照创建新文件系统中| create-failed 创建失败）
<br>tag-key - Array of String - 是否必填：否 -（过滤条件）按照标签键进行过滤。
<br>tag:tag-key - Array of String - 是否必填：否 -（过滤条件）按照标签键值对进行过滤。 tag-key使用具体的标签键进行替换。
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件。
<br>SnapshotId - Array of String - 是否必填：否 -（过滤条件）按快照ID过滤。
<br>SnapshotName - Array of String - 是否必填：否 -（过滤条件）按照快照名称过滤。
<br>FileSystemId - Array of String - 是否必填：否 -（过滤条件）按文件系统ID过滤。
<br>FsName - Array of String - 是否必填：否 -（过滤条件）按文件系统名过滤。
<br>Status - Array of String - 是否必填：否 -（过滤条件）按照快照状态过滤
(creating：创建中 | available：运行中| deleting: 删除中 | rollbacking_new：由快照创建新文件系统中| create-failed 创建失败）
<br>tag-key - Array of String - 是否必填：否 -（过滤条件）按照标签键进行过滤。
<br>tag:tag-key - Array of String - 是否必填：否 -（过滤条件）按照标签键值对进行过滤。 tag-key使用具体的标签键进行替换。
     * @param Filters 过滤条件。
<br>SnapshotId - Array of String - 是否必填：否 -（过滤条件）按快照ID过滤。
<br>SnapshotName - Array of String - 是否必填：否 -（过滤条件）按照快照名称过滤。
<br>FileSystemId - Array of String - 是否必填：否 -（过滤条件）按文件系统ID过滤。
<br>FsName - Array of String - 是否必填：否 -（过滤条件）按文件系统名过滤。
<br>Status - Array of String - 是否必填：否 -（过滤条件）按照快照状态过滤
(creating：创建中 | available：运行中| deleting: 删除中 | rollbacking_new：由快照创建新文件系统中| create-failed 创建失败）
<br>tag-key - Array of String - 是否必填：否 -（过滤条件）按照标签键进行过滤。
<br>tag:tag-key - Array of String - 是否必填：否 -（过滤条件）按照标签键值对进行过滤。 tag-key使用具体的标签键进行替换。
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 按创建时间排序取值 
     * @return OrderField 按创建时间排序取值
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set 按创建时间排序取值
     * @param OrderField 按创建时间排序取值
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    /**
     * Get 排序 升序或者降序 
     * @return Order 排序 升序或者降序
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 排序 升序或者降序
     * @param Order 排序 升序或者降序
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    public DescribeCfsSnapshotsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCfsSnapshotsRequest(DescribeCfsSnapshotsRequest source) {
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.SnapshotId != null) {
            this.SnapshotId = new String(source.SnapshotId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
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
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "SnapshotId", this.SnapshotId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);
        this.setParamSimple(map, prefix + "Order", this.Order);

    }
}

