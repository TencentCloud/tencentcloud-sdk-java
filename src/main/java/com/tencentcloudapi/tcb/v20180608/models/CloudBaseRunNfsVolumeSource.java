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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Server", this.Server);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "ReadOnly", this.ReadOnly);

    }
}

