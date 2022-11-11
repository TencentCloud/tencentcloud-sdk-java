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

public class DeleteUserQuotaRequest extends AbstractModel{

    /**
    * 文件系统 ID
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * 指定配额类型，包括Uid、Gid
    */
    @SerializedName("UserType")
    @Expose
    private String UserType;

    /**
    * UID/GID信息
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

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
     * Get 指定配额类型，包括Uid、Gid 
     * @return UserType 指定配额类型，包括Uid、Gid
     */
    public String getUserType() {
        return this.UserType;
    }

    /**
     * Set 指定配额类型，包括Uid、Gid
     * @param UserType 指定配额类型，包括Uid、Gid
     */
    public void setUserType(String UserType) {
        this.UserType = UserType;
    }

    /**
     * Get UID/GID信息 
     * @return UserId UID/GID信息
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set UID/GID信息
     * @param UserId UID/GID信息
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "UserType", this.UserType);
        this.setParamSimple(map, prefix + "UserId", this.UserId);

    }
}

