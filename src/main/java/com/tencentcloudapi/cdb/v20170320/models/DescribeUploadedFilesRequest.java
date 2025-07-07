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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUploadedFilesRequest extends AbstractModel {

    /**
    * 文件路径。该字段应填用户主账号的OwnerUin信息。
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * 记录偏移量，默认值为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 单次请求返回的数量，默认值为20。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 文件路径。该字段应填用户主账号的OwnerUin信息。 
     * @return Path 文件路径。该字段应填用户主账号的OwnerUin信息。
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set 文件路径。该字段应填用户主账号的OwnerUin信息。
     * @param Path 文件路径。该字段应填用户主账号的OwnerUin信息。
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get 记录偏移量，默认值为0。 
     * @return Offset 记录偏移量，默认值为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 记录偏移量，默认值为0。
     * @param Offset 记录偏移量，默认值为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 单次请求返回的数量，默认值为20。 
     * @return Limit 单次请求返回的数量，默认值为20。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 单次请求返回的数量，默认值为20。
     * @param Limit 单次请求返回的数量，默认值为20。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeUploadedFilesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUploadedFilesRequest(DescribeUploadedFilesRequest source) {
        if (source.Path != null) {
            this.Path = new String(source.Path);
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
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

