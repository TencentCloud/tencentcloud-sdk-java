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
    * <p>文件系统ID，通过查询文件系统列表获取；<a href="https://cloud.tencent.com/document/product/582/38170">DescribeCfsFileSystems</a></p>
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * <p>指定配额类型，包括Uid（按用户ID限制）、Gid（按用户组ID限制）、Dir（按目录限制）</p>
    */
    @SerializedName("UserType")
    @Expose
    private String UserType;

    /**
    * <p>UID/GID信息，和DirectoryPath参数，两者必须填写一个</p>
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * <p>需删除配额的目录路径，必须以 /cfs/ 开头，代表文件存储实例内部的逻辑路径，而非本地挂载点路径。该参数与 UserId 参数至少填写一个。<br>示例：</p><ul><li>若挂载的是CFS根目录 /，需删除挂载路径下 test1/test2 的配额，则入参值为 /cfs/test1/test2</li><li>若挂载的是CFS子目录 /subdir，需删除挂载路径下 test1/test2 的配额，则入参值为 /cfs/subdir/test1/test2</li></ul>
    */
    @SerializedName("DirectoryPath")
    @Expose
    private String DirectoryPath;

    /**
     * Get <p>文件系统ID，通过查询文件系统列表获取；<a href="https://cloud.tencent.com/document/product/582/38170">DescribeCfsFileSystems</a></p> 
     * @return FileSystemId <p>文件系统ID，通过查询文件系统列表获取；<a href="https://cloud.tencent.com/document/product/582/38170">DescribeCfsFileSystems</a></p>
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set <p>文件系统ID，通过查询文件系统列表获取；<a href="https://cloud.tencent.com/document/product/582/38170">DescribeCfsFileSystems</a></p>
     * @param FileSystemId <p>文件系统ID，通过查询文件系统列表获取；<a href="https://cloud.tencent.com/document/product/582/38170">DescribeCfsFileSystems</a></p>
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get <p>指定配额类型，包括Uid（按用户ID限制）、Gid（按用户组ID限制）、Dir（按目录限制）</p> 
     * @return UserType <p>指定配额类型，包括Uid（按用户ID限制）、Gid（按用户组ID限制）、Dir（按目录限制）</p>
     */
    public String getUserType() {
        return this.UserType;
    }

    /**
     * Set <p>指定配额类型，包括Uid（按用户ID限制）、Gid（按用户组ID限制）、Dir（按目录限制）</p>
     * @param UserType <p>指定配额类型，包括Uid（按用户ID限制）、Gid（按用户组ID限制）、Dir（按目录限制）</p>
     */
    public void setUserType(String UserType) {
        this.UserType = UserType;
    }

    /**
     * Get <p>UID/GID信息，和DirectoryPath参数，两者必须填写一个</p> 
     * @return UserId <p>UID/GID信息，和DirectoryPath参数，两者必须填写一个</p>
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set <p>UID/GID信息，和DirectoryPath参数，两者必须填写一个</p>
     * @param UserId <p>UID/GID信息，和DirectoryPath参数，两者必须填写一个</p>
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get <p>需删除配额的目录路径，必须以 /cfs/ 开头，代表文件存储实例内部的逻辑路径，而非本地挂载点路径。该参数与 UserId 参数至少填写一个。<br>示例：</p><ul><li>若挂载的是CFS根目录 /，需删除挂载路径下 test1/test2 的配额，则入参值为 /cfs/test1/test2</li><li>若挂载的是CFS子目录 /subdir，需删除挂载路径下 test1/test2 的配额，则入参值为 /cfs/subdir/test1/test2</li></ul> 
     * @return DirectoryPath <p>需删除配额的目录路径，必须以 /cfs/ 开头，代表文件存储实例内部的逻辑路径，而非本地挂载点路径。该参数与 UserId 参数至少填写一个。<br>示例：</p><ul><li>若挂载的是CFS根目录 /，需删除挂载路径下 test1/test2 的配额，则入参值为 /cfs/test1/test2</li><li>若挂载的是CFS子目录 /subdir，需删除挂载路径下 test1/test2 的配额，则入参值为 /cfs/subdir/test1/test2</li></ul>
     */
    public String getDirectoryPath() {
        return this.DirectoryPath;
    }

    /**
     * Set <p>需删除配额的目录路径，必须以 /cfs/ 开头，代表文件存储实例内部的逻辑路径，而非本地挂载点路径。该参数与 UserId 参数至少填写一个。<br>示例：</p><ul><li>若挂载的是CFS根目录 /，需删除挂载路径下 test1/test2 的配额，则入参值为 /cfs/test1/test2</li><li>若挂载的是CFS子目录 /subdir，需删除挂载路径下 test1/test2 的配额，则入参值为 /cfs/subdir/test1/test2</li></ul>
     * @param DirectoryPath <p>需删除配额的目录路径，必须以 /cfs/ 开头，代表文件存储实例内部的逻辑路径，而非本地挂载点路径。该参数与 UserId 参数至少填写一个。<br>示例：</p><ul><li>若挂载的是CFS根目录 /，需删除挂载路径下 test1/test2 的配额，则入参值为 /cfs/test1/test2</li><li>若挂载的是CFS子目录 /subdir，需删除挂载路径下 test1/test2 的配额，则入参值为 /cfs/subdir/test1/test2</li></ul>
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

