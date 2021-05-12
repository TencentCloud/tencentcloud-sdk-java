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

public class CloudBaseRunNfsVolumeSource extends AbstractModel{

    /**
    * NFS挂载Server
    */
    @SerializedName("Server")
    @Expose
    private String Server;

    /**
    * Server路径
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * 是否只读
    */
    @SerializedName("ReadOnly")
    @Expose
    private Boolean ReadOnly;

    /**
    * secret名称
    */
    @SerializedName("SecretName")
    @Expose
    private String SecretName;

    /**
    * 临时目录
    */
    @SerializedName("EnableEmptyDirVolume")
    @Expose
    private Boolean EnableEmptyDirVolume;

    /**
     * Get NFS挂载Server 
     * @return Server NFS挂载Server
     */
    public String getServer() {
        return this.Server;
    }

    /**
     * Set NFS挂载Server
     * @param Server NFS挂载Server
     */
    public void setServer(String Server) {
        this.Server = Server;
    }

    /**
     * Get Server路径 
     * @return Path Server路径
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set Server路径
     * @param Path Server路径
     */
    public void setPath(String Path) {
        this.Path = Path;
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
     * Get secret名称 
     * @return SecretName secret名称
     */
    public String getSecretName() {
        return this.SecretName;
    }

    /**
     * Set secret名称
     * @param SecretName secret名称
     */
    public void setSecretName(String SecretName) {
        this.SecretName = SecretName;
    }

    /**
     * Get 临时目录 
     * @return EnableEmptyDirVolume 临时目录
     */
    public Boolean getEnableEmptyDirVolume() {
        return this.EnableEmptyDirVolume;
    }

    /**
     * Set 临时目录
     * @param EnableEmptyDirVolume 临时目录
     */
    public void setEnableEmptyDirVolume(Boolean EnableEmptyDirVolume) {
        this.EnableEmptyDirVolume = EnableEmptyDirVolume;
    }

    public CloudBaseRunNfsVolumeSource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudBaseRunNfsVolumeSource(CloudBaseRunNfsVolumeSource source) {
        if (source.Server != null) {
            this.Server = new String(source.Server);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.ReadOnly != null) {
            this.ReadOnly = new Boolean(source.ReadOnly);
        }
        if (source.SecretName != null) {
            this.SecretName = new String(source.SecretName);
        }
        if (source.EnableEmptyDirVolume != null) {
            this.EnableEmptyDirVolume = new Boolean(source.EnableEmptyDirVolume);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Server", this.Server);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "ReadOnly", this.ReadOnly);
        this.setParamSimple(map, prefix + "SecretName", this.SecretName);
        this.setParamSimple(map, prefix + "EnableEmptyDirVolume", this.EnableEmptyDirVolume);

    }
}

