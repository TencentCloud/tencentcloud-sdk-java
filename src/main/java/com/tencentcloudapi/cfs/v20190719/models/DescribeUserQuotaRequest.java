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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUserQuotaRequest extends AbstractModel{

    /**
    * 文件系统 ID
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * 过滤条件。
<br><li>UserType - Array of String - 是否必填：否 -（过滤条件）按配额类型过滤。(Uid| Gid )
<br><li>UserId - Array of String - 是否必填：否 -（过滤条件）按UID/GID过滤。
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Offset 分页码
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Limit 页面大小，可填范围为大于0的整数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 文件系统 ID 
     * @return FileSystemId 文件系统 ID
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set 文件系统 ID
     * @param FileSystemId 文件系统 ID
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get 过滤条件。
<br><li>UserType - Array of String - 是否必填：否 -（过滤条件）按配额类型过滤。(Uid| Gid )
<br><li>UserId - Array of String - 是否必填：否 -（过滤条件）按UID/GID过滤。 
     * @return Filters 过滤条件。
<br><li>UserType - Array of String - 是否必填：否 -（过滤条件）按配额类型过滤。(Uid| Gid )
<br><li>UserId - Array of String - 是否必填：否 -（过滤条件）按UID/GID过滤。
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件。
<br><li>UserType - Array of String - 是否必填：否 -（过滤条件）按配额类型过滤。(Uid| Gid )
<br><li>UserId - Array of String - 是否必填：否 -（过滤条件）按UID/GID过滤。
     * @param Filters 过滤条件。
<br><li>UserType - Array of String - 是否必填：否 -（过滤条件）按配额类型过滤。(Uid| Gid )
<br><li>UserId - Array of String - 是否必填：否 -（过滤条件）按UID/GID过滤。
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Offset 分页码 
     * @return Offset Offset 分页码
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset 分页码
     * @param Offset Offset 分页码
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Limit 页面大小，可填范围为大于0的整数 
     * @return Limit Limit 页面大小，可填范围为大于0的整数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Limit 页面大小，可填范围为大于0的整数
     * @param Limit Limit 页面大小，可填范围为大于0的整数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeUserQuotaRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUserQuotaRequest(DescribeUserQuotaRequest source) {
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

