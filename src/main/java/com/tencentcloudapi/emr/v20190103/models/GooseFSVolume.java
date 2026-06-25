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

public class GooseFSVolume extends AbstractModel {

    /**
    * <p>存储卷名</p>
    */
    @SerializedName("VolumeName")
    @Expose
    private String VolumeName;

    /**
    * <p>gooseFS实例ID</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>gooseFS 命名空间</p>
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * <p>在命名空间中的挂载路径</p>
    */
    @SerializedName("SubPath")
    @Expose
    private String SubPath;

    /**
    * <p>FuseVERSION描述</p>
    */
    @SerializedName("FuseVersion")
    @Expose
    private String FuseVersion;

    /**
    * <p>Client Version描述，例如 GOOSE-1.5.2</p>
    */
    @SerializedName("ClientVersion")
    @Expose
    private String ClientVersion;

    /**
    * <p>默认挂载参数</p>
    */
    @SerializedName("MountOptions")
    @Expose
    private String MountOptions;

    /**
    * <p>默认JVM参数</p>
    */
    @SerializedName("JvmOptions")
    @Expose
    private String JvmOptions;

    /**
     * Get <p>存储卷名</p> 
     * @return VolumeName <p>存储卷名</p>
     */
    public String getVolumeName() {
        return this.VolumeName;
    }

    /**
     * Set <p>存储卷名</p>
     * @param VolumeName <p>存储卷名</p>
     */
    public void setVolumeName(String VolumeName) {
        this.VolumeName = VolumeName;
    }

    /**
     * Get <p>gooseFS实例ID</p> 
     * @return ClusterId <p>gooseFS实例ID</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>gooseFS实例ID</p>
     * @param ClusterId <p>gooseFS实例ID</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>gooseFS 命名空间</p> 
     * @return Namespace <p>gooseFS 命名空间</p>
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set <p>gooseFS 命名空间</p>
     * @param Namespace <p>gooseFS 命名空间</p>
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get <p>在命名空间中的挂载路径</p> 
     * @return SubPath <p>在命名空间中的挂载路径</p>
     */
    public String getSubPath() {
        return this.SubPath;
    }

    /**
     * Set <p>在命名空间中的挂载路径</p>
     * @param SubPath <p>在命名空间中的挂载路径</p>
     */
    public void setSubPath(String SubPath) {
        this.SubPath = SubPath;
    }

    /**
     * Get <p>FuseVERSION描述</p> 
     * @return FuseVersion <p>FuseVERSION描述</p>
     */
    public String getFuseVersion() {
        return this.FuseVersion;
    }

    /**
     * Set <p>FuseVERSION描述</p>
     * @param FuseVersion <p>FuseVERSION描述</p>
     */
    public void setFuseVersion(String FuseVersion) {
        this.FuseVersion = FuseVersion;
    }

    /**
     * Get <p>Client Version描述，例如 GOOSE-1.5.2</p> 
     * @return ClientVersion <p>Client Version描述，例如 GOOSE-1.5.2</p>
     */
    public String getClientVersion() {
        return this.ClientVersion;
    }

    /**
     * Set <p>Client Version描述，例如 GOOSE-1.5.2</p>
     * @param ClientVersion <p>Client Version描述，例如 GOOSE-1.5.2</p>
     */
    public void setClientVersion(String ClientVersion) {
        this.ClientVersion = ClientVersion;
    }

    /**
     * Get <p>默认挂载参数</p> 
     * @return MountOptions <p>默认挂载参数</p>
     */
    public String getMountOptions() {
        return this.MountOptions;
    }

    /**
     * Set <p>默认挂载参数</p>
     * @param MountOptions <p>默认挂载参数</p>
     */
    public void setMountOptions(String MountOptions) {
        this.MountOptions = MountOptions;
    }

    /**
     * Get <p>默认JVM参数</p> 
     * @return JvmOptions <p>默认JVM参数</p>
     */
    public String getJvmOptions() {
        return this.JvmOptions;
    }

    /**
     * Set <p>默认JVM参数</p>
     * @param JvmOptions <p>默认JVM参数</p>
     */
    public void setJvmOptions(String JvmOptions) {
        this.JvmOptions = JvmOptions;
    }

    public GooseFSVolume() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GooseFSVolume(GooseFSVolume source) {
        if (source.VolumeName != null) {
            this.VolumeName = new String(source.VolumeName);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.SubPath != null) {
            this.SubPath = new String(source.SubPath);
        }
        if (source.FuseVersion != null) {
            this.FuseVersion = new String(source.FuseVersion);
        }
        if (source.ClientVersion != null) {
            this.ClientVersion = new String(source.ClientVersion);
        }
        if (source.MountOptions != null) {
            this.MountOptions = new String(source.MountOptions);
        }
        if (source.JvmOptions != null) {
            this.JvmOptions = new String(source.JvmOptions);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VolumeName", this.VolumeName);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "SubPath", this.SubPath);
        this.setParamSimple(map, prefix + "FuseVersion", this.FuseVersion);
        this.setParamSimple(map, prefix + "ClientVersion", this.ClientVersion);
        this.setParamSimple(map, prefix + "MountOptions", this.MountOptions);
        this.setParamSimple(map, prefix + "JvmOptions", this.JvmOptions);

    }
}

