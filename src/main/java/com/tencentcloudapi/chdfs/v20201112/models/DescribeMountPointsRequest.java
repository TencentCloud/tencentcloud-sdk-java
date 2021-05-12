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
package com.tencentcloudapi.chdfs.v20201112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMountPointsRequest extends AbstractModel{

    /**
    * 文件系统ID
备注：入参只能指定AccessGroupId、FileSystemId和OwnerUin的其中一个
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * 权限组ID
    */
    @SerializedName("AccessGroupId")
    @Expose
    private String AccessGroupId;

    /**
    * 资源所属者Uin
    */
    @SerializedName("OwnerUin")
    @Expose
    private Long OwnerUin;

    /**
     * Get 文件系统ID
备注：入参只能指定AccessGroupId、FileSystemId和OwnerUin的其中一个 
     * @return FileSystemId 文件系统ID
备注：入参只能指定AccessGroupId、FileSystemId和OwnerUin的其中一个
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set 文件系统ID
备注：入参只能指定AccessGroupId、FileSystemId和OwnerUin的其中一个
     * @param FileSystemId 文件系统ID
备注：入参只能指定AccessGroupId、FileSystemId和OwnerUin的其中一个
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get 权限组ID 
     * @return AccessGroupId 权限组ID
     */
    public String getAccessGroupId() {
        return this.AccessGroupId;
    }

    /**
     * Set 权限组ID
     * @param AccessGroupId 权限组ID
     */
    public void setAccessGroupId(String AccessGroupId) {
        this.AccessGroupId = AccessGroupId;
    }

    /**
     * Get 资源所属者Uin 
     * @return OwnerUin 资源所属者Uin
     */
    public Long getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * Set 资源所属者Uin
     * @param OwnerUin 资源所属者Uin
     */
    public void setOwnerUin(Long OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    public DescribeMountPointsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMountPointsRequest(DescribeMountPointsRequest source) {
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.AccessGroupId != null) {
            this.AccessGroupId = new String(source.AccessGroupId);
        }
        if (source.OwnerUin != null) {
            this.OwnerUin = new Long(source.OwnerUin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "AccessGroupId", this.AccessGroupId);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);

    }
}

