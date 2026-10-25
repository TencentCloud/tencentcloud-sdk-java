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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListLocationsRequest extends AbstractModel {

    /**
    * <p>调用时所在workspace唯一id，必填</p>
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * <p>存储位置名匹配模式，支持SQL LIKE语法</p>
    */
    @SerializedName("LocationNamePattern")
    @Expose
    private String LocationNamePattern;

    /**
    * <p>是否基于快照分页</p>
    */
    @SerializedName("SnapshotBased")
    @Expose
    private Boolean SnapshotBased;

    /**
    * <p>快照ID</p>
    */
    @SerializedName("SnapshotId")
    @Expose
    private String SnapshotId;

    /**
    * <p>页码，从1开始，可选，默认1</p>
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * <p>每页大小，默认10，取值范围 1~500</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get <p>调用时所在workspace唯一id，必填</p> 
     * @return WorkspaceId <p>调用时所在workspace唯一id，必填</p>
     */
    public String getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set <p>调用时所在workspace唯一id，必填</p>
     * @param WorkspaceId <p>调用时所在workspace唯一id，必填</p>
     */
    public void setWorkspaceId(String WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get <p>存储位置名匹配模式，支持SQL LIKE语法</p> 
     * @return LocationNamePattern <p>存储位置名匹配模式，支持SQL LIKE语法</p>
     */
    public String getLocationNamePattern() {
        return this.LocationNamePattern;
    }

    /**
     * Set <p>存储位置名匹配模式，支持SQL LIKE语法</p>
     * @param LocationNamePattern <p>存储位置名匹配模式，支持SQL LIKE语法</p>
     */
    public void setLocationNamePattern(String LocationNamePattern) {
        this.LocationNamePattern = LocationNamePattern;
    }

    /**
     * Get <p>是否基于快照分页</p> 
     * @return SnapshotBased <p>是否基于快照分页</p>
     */
    public Boolean getSnapshotBased() {
        return this.SnapshotBased;
    }

    /**
     * Set <p>是否基于快照分页</p>
     * @param SnapshotBased <p>是否基于快照分页</p>
     */
    public void setSnapshotBased(Boolean SnapshotBased) {
        this.SnapshotBased = SnapshotBased;
    }

    /**
     * Get <p>快照ID</p> 
     * @return SnapshotId <p>快照ID</p>
     */
    public String getSnapshotId() {
        return this.SnapshotId;
    }

    /**
     * Set <p>快照ID</p>
     * @param SnapshotId <p>快照ID</p>
     */
    public void setSnapshotId(String SnapshotId) {
        this.SnapshotId = SnapshotId;
    }

    /**
     * Get <p>页码，从1开始，可选，默认1</p> 
     * @return PageNumber <p>页码，从1开始，可选，默认1</p>
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set <p>页码，从1开始，可选，默认1</p>
     * @param PageNumber <p>页码，从1开始，可选，默认1</p>
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get <p>每页大小，默认10，取值范围 1~500</p> 
     * @return PageSize <p>每页大小，默认10，取值范围 1~500</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>每页大小，默认10，取值范围 1~500</p>
     * @param PageSize <p>每页大小，默认10，取值范围 1~500</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public ListLocationsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListLocationsRequest(ListLocationsRequest source) {
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.LocationNamePattern != null) {
            this.LocationNamePattern = new String(source.LocationNamePattern);
        }
        if (source.SnapshotBased != null) {
            this.SnapshotBased = new Boolean(source.SnapshotBased);
        }
        if (source.SnapshotId != null) {
            this.SnapshotId = new String(source.SnapshotId);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "LocationNamePattern", this.LocationNamePattern);
        this.setParamSimple(map, prefix + "SnapshotBased", this.SnapshotBased);
        this.setParamSimple(map, prefix + "SnapshotId", this.SnapshotId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

