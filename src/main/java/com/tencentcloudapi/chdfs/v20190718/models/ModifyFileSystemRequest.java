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

public class ModifyFileSystemRequest  extends AbstractModel{

    /**
    * 文件系统ID
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * 文件系统名称
    */
    @SerializedName("FileSystemName")
    @Expose
    private String FileSystemName;

    /**
    * 文件系统描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 文件系统容量（byte），下限为1M，上限为1P，且必须是1M的整数倍
    */
    @SerializedName("CapacityQuota")
    @Expose
    private Long CapacityQuota;

    /**
     * 获取文件系统ID
     * @return FileSystemId 文件系统ID
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * 设置文件系统ID
     * @param FileSystemId 文件系统ID
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * 获取文件系统名称
     * @return FileSystemName 文件系统名称
     */
    public String getFileSystemName() {
        return this.FileSystemName;
    }

    /**
     * 设置文件系统名称
     * @param FileSystemName 文件系统名称
     */
    public void setFileSystemName(String FileSystemName) {
        this.FileSystemName = FileSystemName;
    }

    /**
     * 获取文件系统描述
     * @return Description 文件系统描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * 设置文件系统描述
     * @param Description 文件系统描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * 获取文件系统容量（byte），下限为1M，上限为1P，且必须是1M的整数倍
     * @return CapacityQuota 文件系统容量（byte），下限为1M，上限为1P，且必须是1M的整数倍
     */
    public Long getCapacityQuota() {
        return this.CapacityQuota;
    }

    /**
     * 设置文件系统容量（byte），下限为1M，上限为1P，且必须是1M的整数倍
     * @param CapacityQuota 文件系统容量（byte），下限为1M，上限为1P，且必须是1M的整数倍
     */
    public void setCapacityQuota(Long CapacityQuota) {
        this.CapacityQuota = CapacityQuota;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "FileSystemName", this.FileSystemName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CapacityQuota", this.CapacityQuota);

    }
}

