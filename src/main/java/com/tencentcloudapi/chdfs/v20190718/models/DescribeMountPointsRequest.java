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
package com.tencentcloudapi.chdfs.v20190718.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMountPointsRequest extends AbstractModel{

    /**
    * 文件系统ID
注意：若根据AccessGroupId查看挂载点列表，则无需设置FileSystemId
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * 权限组ID
注意：若根据FileSystemId查看挂载点列表，则无需设置AccessGroupId
    */
    @SerializedName("AccessGroupId")
    @Expose
    private String AccessGroupId;

    /**
    * 偏移量，默认为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量，默认为所有
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 文件系统ID
注意：若根据AccessGroupId查看挂载点列表，则无需设置FileSystemId 
     * @return FileSystemId 文件系统ID
注意：若根据AccessGroupId查看挂载点列表，则无需设置FileSystemId
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set 文件系统ID
注意：若根据AccessGroupId查看挂载点列表，则无需设置FileSystemId
     * @param FileSystemId 文件系统ID
注意：若根据AccessGroupId查看挂载点列表，则无需设置FileSystemId
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get 权限组ID
注意：若根据FileSystemId查看挂载点列表，则无需设置AccessGroupId 
     * @return AccessGroupId 权限组ID
注意：若根据FileSystemId查看挂载点列表，则无需设置AccessGroupId
     */
    public String getAccessGroupId() {
        return this.AccessGroupId;
    }

    /**
     * Set 权限组ID
注意：若根据FileSystemId查看挂载点列表，则无需设置AccessGroupId
     * @param AccessGroupId 权限组ID
注意：若根据FileSystemId查看挂载点列表，则无需设置AccessGroupId
     */
    public void setAccessGroupId(String AccessGroupId) {
        this.AccessGroupId = AccessGroupId;
    }

    /**
     * Get 偏移量，默认为0 
     * @return Offset 偏移量，默认为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0
     * @param Offset 偏移量，默认为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量，默认为所有 
     * @return Limit 返回数量，默认为所有
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为所有
     * @param Limit 返回数量，默认为所有
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "AccessGroupId", this.AccessGroupId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

