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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Docker extends AbstractModel{

    /**
    * Docker Hub 用户名或 Tencent Registry 用户名
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * Docker Hub 密码或 Tencent Registry 密码
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * Docker Hub填写“[user/repo]:[tag]”，Tencent Registry填写“ccr.ccs.tencentyun.com/[namespace/repo]:[tag]”
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * Docker Hub 可以不填，但确保具有公网访问能力。或者是 Tencent Registry 服务地址“ccr.ccs.tencentyun.com”
    */
    @SerializedName("Server")
    @Expose
    private String Server;

    /**
     * Get Docker Hub 用户名或 Tencent Registry 用户名 
     * @return User Docker Hub 用户名或 Tencent Registry 用户名
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set Docker Hub 用户名或 Tencent Registry 用户名
     * @param User Docker Hub 用户名或 Tencent Registry 用户名
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get Docker Hub 密码或 Tencent Registry 密码 
     * @return Password Docker Hub 密码或 Tencent Registry 密码
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Docker Hub 密码或 Tencent Registry 密码
     * @param Password Docker Hub 密码或 Tencent Registry 密码
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get Docker Hub填写“[user/repo]:[tag]”，Tencent Registry填写“ccr.ccs.tencentyun.com/[namespace/repo]:[tag]” 
     * @return Image Docker Hub填写“[user/repo]:[tag]”，Tencent Registry填写“ccr.ccs.tencentyun.com/[namespace/repo]:[tag]”
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set Docker Hub填写“[user/repo]:[tag]”，Tencent Registry填写“ccr.ccs.tencentyun.com/[namespace/repo]:[tag]”
     * @param Image Docker Hub填写“[user/repo]:[tag]”，Tencent Registry填写“ccr.ccs.tencentyun.com/[namespace/repo]:[tag]”
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * Get Docker Hub 可以不填，但确保具有公网访问能力。或者是 Tencent Registry 服务地址“ccr.ccs.tencentyun.com” 
     * @return Server Docker Hub 可以不填，但确保具有公网访问能力。或者是 Tencent Registry 服务地址“ccr.ccs.tencentyun.com”
     */
    public String getServer() {
        return this.Server;
    }

    /**
     * Set Docker Hub 可以不填，但确保具有公网访问能力。或者是 Tencent Registry 服务地址“ccr.ccs.tencentyun.com”
     * @param Server Docker Hub 可以不填，但确保具有公网访问能力。或者是 Tencent Registry 服务地址“ccr.ccs.tencentyun.com”
     */
    public void setServer(String Server) {
        this.Server = Server;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "Image", this.Image);
        this.setParamSimple(map, prefix + "Server", this.Server);

    }
}

