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
package com.tencentcloudapi.cvd.v20201104.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSnapshotsRequest extends AbstractModel {

    /**
    * <p>快照所在的地域</p>
    */
    @SerializedName("SnapshotRegion")
    @Expose
    private String SnapshotRegion;

    /**
    * <p>页号</p>
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * <p>每页大小，最大100，默认20</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>检索条件，Filter的name取值：<br>InstanceId：实例ID，返回当前实例挂载的云硬盘关联的快照信息<br>DiskId：云硬盘ID，返回当前云硬盘关联的快照信息</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get <p>快照所在的地域</p> 
     * @return SnapshotRegion <p>快照所在的地域</p>
     */
    public String getSnapshotRegion() {
        return this.SnapshotRegion;
    }

    /**
     * Set <p>快照所在的地域</p>
     * @param SnapshotRegion <p>快照所在的地域</p>
     */
    public void setSnapshotRegion(String SnapshotRegion) {
        this.SnapshotRegion = SnapshotRegion;
    }

    /**
     * Get <p>页号</p> 
     * @return PageNumber <p>页号</p>
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set <p>页号</p>
     * @param PageNumber <p>页号</p>
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get <p>每页大小，最大100，默认20</p> 
     * @return PageSize <p>每页大小，最大100，默认20</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>每页大小，最大100，默认20</p>
     * @param PageSize <p>每页大小，最大100，默认20</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>检索条件，Filter的name取值：<br>InstanceId：实例ID，返回当前实例挂载的云硬盘关联的快照信息<br>DiskId：云硬盘ID，返回当前云硬盘关联的快照信息</p> 
     * @return Filters <p>检索条件，Filter的name取值：<br>InstanceId：实例ID，返回当前实例挂载的云硬盘关联的快照信息<br>DiskId：云硬盘ID，返回当前云硬盘关联的快照信息</p>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>检索条件，Filter的name取值：<br>InstanceId：实例ID，返回当前实例挂载的云硬盘关联的快照信息<br>DiskId：云硬盘ID，返回当前云硬盘关联的快照信息</p>
     * @param Filters <p>检索条件，Filter的name取值：<br>InstanceId：实例ID，返回当前实例挂载的云硬盘关联的快照信息<br>DiskId：云硬盘ID，返回当前云硬盘关联的快照信息</p>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeSnapshotsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSnapshotsRequest(DescribeSnapshotsRequest source) {
        if (source.SnapshotRegion != null) {
            this.SnapshotRegion = new String(source.SnapshotRegion);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SnapshotRegion", this.SnapshotRegion);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

