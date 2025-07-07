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
package com.tencentcloudapi.chdfs.v20190718.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateFileSystemRequest extends AbstractModel {

    /**
    * 文件系统名称
    */
    @SerializedName("FileSystemName")
    @Expose
    private String FileSystemName;

    /**
    * 文件系统容量（byte），下限为1G，上限为1P，且必须是1G的整数倍
    */
    @SerializedName("CapacityQuota")
    @Expose
    private Long CapacityQuota;

    /**
    * 文件系统描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 文件系统名称 
     * @return FileSystemName 文件系统名称
     */
    public String getFileSystemName() {
        return this.FileSystemName;
    }

    /**
     * Set 文件系统名称
     * @param FileSystemName 文件系统名称
     */
    public void setFileSystemName(String FileSystemName) {
        this.FileSystemName = FileSystemName;
    }

    /**
     * Get 文件系统容量（byte），下限为1G，上限为1P，且必须是1G的整数倍 
     * @return CapacityQuota 文件系统容量（byte），下限为1G，上限为1P，且必须是1G的整数倍
     */
    public Long getCapacityQuota() {
        return this.CapacityQuota;
    }

    /**
     * Set 文件系统容量（byte），下限为1G，上限为1P，且必须是1G的整数倍
     * @param CapacityQuota 文件系统容量（byte），下限为1G，上限为1P，且必须是1G的整数倍
     */
    public void setCapacityQuota(Long CapacityQuota) {
        this.CapacityQuota = CapacityQuota;
    }

    /**
     * Get 文件系统描述 
     * @return Description 文件系统描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 文件系统描述
     * @param Description 文件系统描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public CreateFileSystemRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateFileSystemRequest(CreateFileSystemRequest source) {
        if (source.FileSystemName != null) {
            this.FileSystemName = new String(source.FileSystemName);
        }
        if (source.CapacityQuota != null) {
            this.CapacityQuota = new Long(source.CapacityQuota);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileSystemName", this.FileSystemName);
        this.setParamSimple(map, prefix + "CapacityQuota", this.CapacityQuota);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

