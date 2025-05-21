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
package com.tencentcloudapi.goosefs.v20220519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateFilesetGeneralConfigRequest extends AbstractModel {

    /**
    * 文件系统id
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * 配额对root用户生效
    */
    @SerializedName("EnforceQuotaOnRoot")
    @Expose
    private String EnforceQuotaOnRoot;

    /**
     * Get 文件系统id 
     * @return FileSystemId 文件系统id
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set 文件系统id
     * @param FileSystemId 文件系统id
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get 配额对root用户生效 
     * @return EnforceQuotaOnRoot 配额对root用户生效
     */
    public String getEnforceQuotaOnRoot() {
        return this.EnforceQuotaOnRoot;
    }

    /**
     * Set 配额对root用户生效
     * @param EnforceQuotaOnRoot 配额对root用户生效
     */
    public void setEnforceQuotaOnRoot(String EnforceQuotaOnRoot) {
        this.EnforceQuotaOnRoot = EnforceQuotaOnRoot;
    }

    public UpdateFilesetGeneralConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateFilesetGeneralConfigRequest(UpdateFilesetGeneralConfigRequest source) {
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.EnforceQuotaOnRoot != null) {
            this.EnforceQuotaOnRoot = new String(source.EnforceQuotaOnRoot);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "EnforceQuotaOnRoot", this.EnforceQuotaOnRoot);

    }
}

