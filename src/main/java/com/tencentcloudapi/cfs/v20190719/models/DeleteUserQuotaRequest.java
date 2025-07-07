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

public class DeleteUserQuotaRequest extends AbstractModel {

    /**
    * 文件系统ID，通过查询文件系统列表获取；[DescribeCfsFileSystems](https://cloud.tencent.com/document/product/582/38170)
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * 指定配额类型，包括Uid（按用户ID限制）、Gid（按用户组ID限制）、Dir（按目录限制）
    */
    @SerializedName("UserType")
    @Expose
    private String UserType;

    /**
    * UID/GID信息，和DirectoryPath参数，两者必须填写一个
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 设置目录配额的目录的绝对路径，和UserId参数，两者必须填写一个
    */
    @SerializedName("DirectoryPath")
    @Expose
    private String DirectoryPath;

    /**
     * Get 文件系统ID，通过查询文件系统列表获取；[DescribeCfsFileSystems](https://cloud.tencent.com/document/product/582/38170) 
     * @return FileSystemId 文件系统ID，通过查询文件系统列表获取；[DescribeCfsFileSystems](https://cloud.tencent.com/document/product/582/38170)
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set 文件系统ID，通过查询文件系统列表获取；[DescribeCfsFileSystems](https://cloud.tencent.com/document/product/582/38170)
     * @param FileSystemId 文件系统ID，通过查询文件系统列表获取；[DescribeCfsFileSystems](https://cloud.tencent.com/document/product/582/38170)
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get 指定配额类型，包括Uid（按用户ID限制）、Gid（按用户组ID限制）、Dir（按目录限制） 
     * @return UserType 指定配额类型，包括Uid（按用户ID限制）、Gid（按用户组ID限制）、Dir（按目录限制）
     */
    public String getUserType() {
        return this.UserType;
    }

    /**
     * Set 指定配额类型，包括Uid（按用户ID限制）、Gid（按用户组ID限制）、Dir（按目录限制）
     * @param UserType 指定配额类型，包括Uid（按用户ID限制）、Gid（按用户组ID限制）、Dir（按目录限制）
     */
    public void setUserType(String UserType) {
        this.UserType = UserType;
    }

    /**
     * Get UID/GID信息，和DirectoryPath参数，两者必须填写一个 
     * @return UserId UID/GID信息，和DirectoryPath参数，两者必须填写一个
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set UID/GID信息，和DirectoryPath参数，两者必须填写一个
     * @param UserId UID/GID信息，和DirectoryPath参数，两者必须填写一个
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 设置目录配额的目录的绝对路径，和UserId参数，两者必须填写一个 
     * @return DirectoryPath 设置目录配额的目录的绝对路径，和UserId参数，两者必须填写一个
     */
    public String getDirectoryPath() {
        return this.DirectoryPath;
    }

    /**
     * Set 设置目录配额的目录的绝对路径，和UserId参数，两者必须填写一个
     * @param DirectoryPath 设置目录配额的目录的绝对路径，和UserId参数，两者必须填写一个
     */
    public void setDirectoryPath(String DirectoryPath) {
        this.DirectoryPath = DirectoryPath;
    }

    public DeleteUserQuotaRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteUserQuotaRequest(DeleteUserQuotaRequest source) {
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.UserType != null) {
            this.UserType = new String(source.UserType);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.DirectoryPath != null) {
            this.DirectoryPath = new String(source.DirectoryPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "UserType", this.UserType);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "DirectoryPath", this.DirectoryPath);

    }
}

