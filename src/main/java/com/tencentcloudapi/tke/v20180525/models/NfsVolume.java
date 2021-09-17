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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NfsVolume extends AbstractModel{

    /**
    * nfs volume 数据卷名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * NFS 服务器地址
    */
    @SerializedName("Server")
    @Expose
    private String Server;

    /**
    * NFS 数据卷路径
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * 默认为 False
    */
    @SerializedName("ReadOnly")
    @Expose
    private Boolean ReadOnly;

    /**
     * Get nfs volume 数据卷名称 
     * @return Name nfs volume 数据卷名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set nfs volume 数据卷名称
     * @param Name nfs volume 数据卷名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get NFS 服务器地址 
     * @return Server NFS 服务器地址
     */
    public String getServer() {
        return this.Server;
    }

    /**
     * Set NFS 服务器地址
     * @param Server NFS 服务器地址
     */
    public void setServer(String Server) {
        this.Server = Server;
    }

    /**
     * Get NFS 数据卷路径 
     * @return Path NFS 数据卷路径
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set NFS 数据卷路径
     * @param Path NFS 数据卷路径
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get 默认为 False 
     * @return ReadOnly 默认为 False
     */
    public Boolean getReadOnly() {
        return this.ReadOnly;
    }

    /**
     * Set 默认为 False
     * @param ReadOnly 默认为 False
     */
    public void setReadOnly(Boolean ReadOnly) {
        this.ReadOnly = ReadOnly;
    }

    public NfsVolume() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NfsVolume(NfsVolume source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Server != null) {
            this.Server = new String(source.Server);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.ReadOnly != null) {
            this.ReadOnly = new Boolean(source.ReadOnly);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Server", this.Server);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "ReadOnly", this.ReadOnly);

    }
}

