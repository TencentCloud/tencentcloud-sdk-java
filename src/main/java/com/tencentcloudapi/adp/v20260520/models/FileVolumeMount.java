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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FileVolumeMount extends AbstractModel {

    /**
    * <p>访问模式：RO=只读，RW=读写；必填。挂载到 /workdir 时只能使用 RW。</p>
    */
    @SerializedName("AccessMode")
    @Expose
    private String AccessMode;

    /**
    * <p>沙箱内的绝对挂载目录；/workdir 最多挂载一条且只能使用 RW。</p>
    */
    @SerializedName("MountPath")
    @Expose
    private String MountPath;

    /**
    * <p>云盘标识</p>
    */
    @SerializedName("VolumeId")
    @Expose
    private String VolumeId;

    /**
    * <p>服务端生成的挂载标识，修改保留，新增可不传</p>
    */
    @SerializedName("MountId")
    @Expose
    private String MountId;

    /**
    * <p>相对云盘 data 根目录的路径；空字符串表示挂载整个 data 根目录。</p>
    */
    @SerializedName("RelativePath")
    @Expose
    private String RelativePath;

    /**
    * <p>云盘名称，仅在查询应用配置时由服务端补充，修改时忽略；不可获取时为空且不影响挂载配置</p>
    */
    @SerializedName("VolumeName")
    @Expose
    private String VolumeName;

    /**
     * Get <p>访问模式：RO=只读，RW=读写；必填。挂载到 /workdir 时只能使用 RW。</p> 
     * @return AccessMode <p>访问模式：RO=只读，RW=读写；必填。挂载到 /workdir 时只能使用 RW。</p>
     */
    public String getAccessMode() {
        return this.AccessMode;
    }

    /**
     * Set <p>访问模式：RO=只读，RW=读写；必填。挂载到 /workdir 时只能使用 RW。</p>
     * @param AccessMode <p>访问模式：RO=只读，RW=读写；必填。挂载到 /workdir 时只能使用 RW。</p>
     */
    public void setAccessMode(String AccessMode) {
        this.AccessMode = AccessMode;
    }

    /**
     * Get <p>沙箱内的绝对挂载目录；/workdir 最多挂载一条且只能使用 RW。</p> 
     * @return MountPath <p>沙箱内的绝对挂载目录；/workdir 最多挂载一条且只能使用 RW。</p>
     */
    public String getMountPath() {
        return this.MountPath;
    }

    /**
     * Set <p>沙箱内的绝对挂载目录；/workdir 最多挂载一条且只能使用 RW。</p>
     * @param MountPath <p>沙箱内的绝对挂载目录；/workdir 最多挂载一条且只能使用 RW。</p>
     */
    public void setMountPath(String MountPath) {
        this.MountPath = MountPath;
    }

    /**
     * Get <p>云盘标识</p> 
     * @return VolumeId <p>云盘标识</p>
     */
    public String getVolumeId() {
        return this.VolumeId;
    }

    /**
     * Set <p>云盘标识</p>
     * @param VolumeId <p>云盘标识</p>
     */
    public void setVolumeId(String VolumeId) {
        this.VolumeId = VolumeId;
    }

    /**
     * Get <p>服务端生成的挂载标识，修改保留，新增可不传</p> 
     * @return MountId <p>服务端生成的挂载标识，修改保留，新增可不传</p>
     */
    public String getMountId() {
        return this.MountId;
    }

    /**
     * Set <p>服务端生成的挂载标识，修改保留，新增可不传</p>
     * @param MountId <p>服务端生成的挂载标识，修改保留，新增可不传</p>
     */
    public void setMountId(String MountId) {
        this.MountId = MountId;
    }

    /**
     * Get <p>相对云盘 data 根目录的路径；空字符串表示挂载整个 data 根目录。</p> 
     * @return RelativePath <p>相对云盘 data 根目录的路径；空字符串表示挂载整个 data 根目录。</p>
     */
    public String getRelativePath() {
        return this.RelativePath;
    }

    /**
     * Set <p>相对云盘 data 根目录的路径；空字符串表示挂载整个 data 根目录。</p>
     * @param RelativePath <p>相对云盘 data 根目录的路径；空字符串表示挂载整个 data 根目录。</p>
     */
    public void setRelativePath(String RelativePath) {
        this.RelativePath = RelativePath;
    }

    /**
     * Get <p>云盘名称，仅在查询应用配置时由服务端补充，修改时忽略；不可获取时为空且不影响挂载配置</p> 
     * @return VolumeName <p>云盘名称，仅在查询应用配置时由服务端补充，修改时忽略；不可获取时为空且不影响挂载配置</p>
     */
    public String getVolumeName() {
        return this.VolumeName;
    }

    /**
     * Set <p>云盘名称，仅在查询应用配置时由服务端补充，修改时忽略；不可获取时为空且不影响挂载配置</p>
     * @param VolumeName <p>云盘名称，仅在查询应用配置时由服务端补充，修改时忽略；不可获取时为空且不影响挂载配置</p>
     */
    public void setVolumeName(String VolumeName) {
        this.VolumeName = VolumeName;
    }

    public FileVolumeMount() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FileVolumeMount(FileVolumeMount source) {
        if (source.AccessMode != null) {
            this.AccessMode = new String(source.AccessMode);
        }
        if (source.MountPath != null) {
            this.MountPath = new String(source.MountPath);
        }
        if (source.VolumeId != null) {
            this.VolumeId = new String(source.VolumeId);
        }
        if (source.MountId != null) {
            this.MountId = new String(source.MountId);
        }
        if (source.RelativePath != null) {
            this.RelativePath = new String(source.RelativePath);
        }
        if (source.VolumeName != null) {
            this.VolumeName = new String(source.VolumeName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccessMode", this.AccessMode);
        this.setParamSimple(map, prefix + "MountPath", this.MountPath);
        this.setParamSimple(map, prefix + "VolumeId", this.VolumeId);
        this.setParamSimple(map, prefix + "MountId", this.MountId);
        this.setParamSimple(map, prefix + "RelativePath", this.RelativePath);
        this.setParamSimple(map, prefix + "VolumeName", this.VolumeName);

    }
}

