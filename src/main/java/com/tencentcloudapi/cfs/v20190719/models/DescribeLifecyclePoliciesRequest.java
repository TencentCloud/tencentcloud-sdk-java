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

public class DescribeLifecyclePoliciesRequest extends AbstractModel {

    /**
    * 生命周期管理策略名称
    */
    @SerializedName("LifecyclePolicyName")
    @Expose
    private String LifecyclePolicyName;

    /**
    * 每个分页包含的生命周期管理策略个数
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 列表的分页页码
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 文件系统ID
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * 生命周期管理策略ID
    */
    @SerializedName("LifecyclePolicyID")
    @Expose
    private String LifecyclePolicyID;

    /**
     * Get 生命周期管理策略名称 
     * @return LifecyclePolicyName 生命周期管理策略名称
     */
    public String getLifecyclePolicyName() {
        return this.LifecyclePolicyName;
    }

    /**
     * Set 生命周期管理策略名称
     * @param LifecyclePolicyName 生命周期管理策略名称
     */
    public void setLifecyclePolicyName(String LifecyclePolicyName) {
        this.LifecyclePolicyName = LifecyclePolicyName;
    }

    /**
     * Get 每个分页包含的生命周期管理策略个数 
     * @return PageSize 每个分页包含的生命周期管理策略个数
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每个分页包含的生命周期管理策略个数
     * @param PageSize 每个分页包含的生命周期管理策略个数
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 列表的分页页码 
     * @return PageNumber 列表的分页页码
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 列表的分页页码
     * @param PageNumber 列表的分页页码
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

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
     * Get 生命周期管理策略ID 
     * @return LifecyclePolicyID 生命周期管理策略ID
     */
    public String getLifecyclePolicyID() {
        return this.LifecyclePolicyID;
    }

    /**
     * Set 生命周期管理策略ID
     * @param LifecyclePolicyID 生命周期管理策略ID
     */
    public void setLifecyclePolicyID(String LifecyclePolicyID) {
        this.LifecyclePolicyID = LifecyclePolicyID;
    }

    public DescribeLifecyclePoliciesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLifecyclePoliciesRequest(DescribeLifecyclePoliciesRequest source) {
        if (source.LifecyclePolicyName != null) {
            this.LifecyclePolicyName = new String(source.LifecyclePolicyName);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.LifecyclePolicyID != null) {
            this.LifecyclePolicyID = new String(source.LifecyclePolicyID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LifecyclePolicyName", this.LifecyclePolicyName);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "LifecyclePolicyID", this.LifecyclePolicyID);

    }
}

