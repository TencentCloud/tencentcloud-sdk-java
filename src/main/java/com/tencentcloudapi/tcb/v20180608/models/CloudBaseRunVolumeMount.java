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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudBaseRunVolumeMount extends AbstractModel{

    /**
    * 资源名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 挂载路径
    */
    @SerializedName("MountPath")
    @Expose
    private String MountPath;

    /**
    * 是否只读
    */
    @SerializedName("ReadOnly")
    @Expose
    private Boolean ReadOnly;

    /**
    * Nfs挂载信息
    */
    @SerializedName("NfsVolumes")
    @Expose
    private CloudBaseRunNfsVolumeSource [] NfsVolumes;

    /**
     * Get 资源名 
     * @return Name 资源名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 资源名
     * @param Name 资源名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 挂载路径 
     * @return MountPath 挂载路径
     */
    public String getMountPath() {
        return this.MountPath;
    }

    /**
     * Set 挂载路径
     * @param MountPath 挂载路径
     */
    public void setMountPath(String MountPath) {
        this.MountPath = MountPath;
    }

    /**
     * Get 是否只读 
     * @return ReadOnly 是否只读
     */
    public Boolean getReadOnly() {
        return this.ReadOnly;
    }

    /**
     * Set 是否只读
     * @param ReadOnly 是否只读
     */
    public void setReadOnly(Boolean ReadOnly) {
        this.ReadOnly = ReadOnly;
    }

    /**
     * Get Nfs挂载信息 
     * @return NfsVolumes Nfs挂载信息
     */
    public CloudBaseRunNfsVolumeSource [] getNfsVolumes() {
        return this.NfsVolumes;
    }

    /**
     * Set Nfs挂载信息
     * @param NfsVolumes Nfs挂载信息
     */
    public void setNfsVolumes(CloudBaseRunNfsVolumeSource [] NfsVolumes) {
        this.NfsVolumes = NfsVolumes;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "MountPath", this.MountPath);
        this.setParamSimple(map, prefix + "ReadOnly", this.ReadOnly);
        this.setParamArrayObj(map, prefix + "NfsVolumes.", this.NfsVolumes);

    }
}

