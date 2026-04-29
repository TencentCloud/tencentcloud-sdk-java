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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VolumeMount extends AbstractModel {

    /**
    * 挂载卷名称
    */
    @SerializedName("MountName")
    @Expose
    private String MountName;

    /**
    * 挂载路径
    */
    @SerializedName("MountPath")
    @Expose
    private String MountPath;

    /**
    * 挂载类型
    */
    @SerializedName("SubPathMode")
    @Expose
    private String SubPathMode;

    /**
    * 子路径
    */
    @SerializedName("SubPath")
    @Expose
    private String SubPath;

    /**
    * 挂载模式，仅支持ReadWrite和OnlyRead
    */
    @SerializedName("MountMode")
    @Expose
    private String MountMode;

    /**
     * Get 挂载卷名称 
     * @return MountName 挂载卷名称
     */
    public String getMountName() {
        return this.MountName;
    }

    /**
     * Set 挂载卷名称
     * @param MountName 挂载卷名称
     */
    public void setMountName(String MountName) {
        this.MountName = MountName;
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
     * Get 挂载类型 
     * @return SubPathMode 挂载类型
     */
    public String getSubPathMode() {
        return this.SubPathMode;
    }

    /**
     * Set 挂载类型
     * @param SubPathMode 挂载类型
     */
    public void setSubPathMode(String SubPathMode) {
        this.SubPathMode = SubPathMode;
    }

    /**
     * Get 子路径 
     * @return SubPath 子路径
     */
    public String getSubPath() {
        return this.SubPath;
    }

    /**
     * Set 子路径
     * @param SubPath 子路径
     */
    public void setSubPath(String SubPath) {
        this.SubPath = SubPath;
    }

    /**
     * Get 挂载模式，仅支持ReadWrite和OnlyRead 
     * @return MountMode 挂载模式，仅支持ReadWrite和OnlyRead
     */
    public String getMountMode() {
        return this.MountMode;
    }

    /**
     * Set 挂载模式，仅支持ReadWrite和OnlyRead
     * @param MountMode 挂载模式，仅支持ReadWrite和OnlyRead
     */
    public void setMountMode(String MountMode) {
        this.MountMode = MountMode;
    }

    public VolumeMount() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VolumeMount(VolumeMount source) {
        if (source.MountName != null) {
            this.MountName = new String(source.MountName);
        }
        if (source.MountPath != null) {
            this.MountPath = new String(source.MountPath);
        }
        if (source.SubPathMode != null) {
            this.SubPathMode = new String(source.SubPathMode);
        }
        if (source.SubPath != null) {
            this.SubPath = new String(source.SubPath);
        }
        if (source.MountMode != null) {
            this.MountMode = new String(source.MountMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MountName", this.MountName);
        this.setParamSimple(map, prefix + "MountPath", this.MountPath);
        this.setParamSimple(map, prefix + "SubPathMode", this.SubPathMode);
        this.setParamSimple(map, prefix + "SubPath", this.SubPath);
        this.setParamSimple(map, prefix + "MountMode", this.MountMode);

    }
}

