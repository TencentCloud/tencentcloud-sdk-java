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

public class ImageRegistryCredential extends AbstractModel{

    /**
    * 镜像仓库地址
    */
    @SerializedName("Server")
    @Expose
    private String Server;

    /**
    * 用户名
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * 密码
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * ImageRegistryCredential的名字
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get 镜像仓库地址 
     * @return Server 镜像仓库地址
     */
    public String getServer() {
        return this.Server;
    }

    /**
     * Set 镜像仓库地址
     * @param Server 镜像仓库地址
     */
    public void setServer(String Server) {
        this.Server = Server;
    }

    /**
     * Get 用户名 
     * @return Username 用户名
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set 用户名
     * @param Username 用户名
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get 密码 
     * @return Password 密码
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 密码
     * @param Password 密码
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get ImageRegistryCredential的名字 
     * @return Name ImageRegistryCredential的名字
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set ImageRegistryCredential的名字
     * @param Name ImageRegistryCredential的名字
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public ImageRegistryCredential() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageRegistryCredential(ImageRegistryCredential source) {
        if (source.Server != null) {
            this.Server = new String(source.Server);
        }
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Server", this.Server);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

