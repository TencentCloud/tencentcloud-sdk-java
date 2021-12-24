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
package com.tencentcloudapi.iecp.v20210914.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VolumeNFS extends AbstractModel{

    /**
    * 服务地址
    */
    @SerializedName("Server")
    @Expose
    private String Server;

    /**
    * 对应服务器路径
    */
    @SerializedName("ServerPath")
    @Expose
    private String ServerPath;

    /**
    * 对应本地路径
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
     * Get 服务地址 
     * @return Server 服务地址
     */
    public String getServer() {
        return this.Server;
    }

    /**
     * Set 服务地址
     * @param Server 服务地址
     */
    public void setServer(String Server) {
        this.Server = Server;
    }

    /**
     * Get 对应服务器路径 
     * @return ServerPath 对应服务器路径
     */
    public String getServerPath() {
        return this.ServerPath;
    }

    /**
     * Set 对应服务器路径
     * @param ServerPath 对应服务器路径
     */
    public void setServerPath(String ServerPath) {
        this.ServerPath = ServerPath;
    }

    /**
     * Get 对应本地路径 
     * @return Path 对应本地路径
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set 对应本地路径
     * @param Path 对应本地路径
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    public VolumeNFS() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VolumeNFS(VolumeNFS source) {
        if (source.Server != null) {
            this.Server = new String(source.Server);
        }
        if (source.ServerPath != null) {
            this.ServerPath = new String(source.ServerPath);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Server", this.Server);
        this.setParamSimple(map, prefix + "ServerPath", this.ServerPath);
        this.setParamSimple(map, prefix + "Path", this.Path);

    }
}

