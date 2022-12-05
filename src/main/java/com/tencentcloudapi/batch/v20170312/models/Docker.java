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
    * 拉取Docker镜像重试次数。默认值：0。
    */
    @SerializedName("MaxRetryCount")
    @Expose
    private Long MaxRetryCount;

    /**
    * 拉取Docker镜像失败时延迟时间。单位：秒。
    */
    @SerializedName("DelayOnRetry")
    @Expose
    private Long DelayOnRetry;

    /**
    * Docker命令运行参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DockerRunOption")
    @Expose
    private String DockerRunOption;

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
     * Get 拉取Docker镜像重试次数。默认值：0。 
     * @return MaxRetryCount 拉取Docker镜像重试次数。默认值：0。
     */
    public Long getMaxRetryCount() {
        return this.MaxRetryCount;
    }

    /**
     * Set 拉取Docker镜像重试次数。默认值：0。
     * @param MaxRetryCount 拉取Docker镜像重试次数。默认值：0。
     */
    public void setMaxRetryCount(Long MaxRetryCount) {
        this.MaxRetryCount = MaxRetryCount;
    }

    /**
     * Get 拉取Docker镜像失败时延迟时间。单位：秒。 
     * @return DelayOnRetry 拉取Docker镜像失败时延迟时间。单位：秒。
     */
    public Long getDelayOnRetry() {
        return this.DelayOnRetry;
    }

    /**
     * Set 拉取Docker镜像失败时延迟时间。单位：秒。
     * @param DelayOnRetry 拉取Docker镜像失败时延迟时间。单位：秒。
     */
    public void setDelayOnRetry(Long DelayOnRetry) {
        this.DelayOnRetry = DelayOnRetry;
    }

    /**
     * Get Docker命令运行参数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DockerRunOption Docker命令运行参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDockerRunOption() {
        return this.DockerRunOption;
    }

    /**
     * Set Docker命令运行参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DockerRunOption Docker命令运行参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDockerRunOption(String DockerRunOption) {
        this.DockerRunOption = DockerRunOption;
    }

    public Docker() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Docker(Docker source) {
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.Image != null) {
            this.Image = new String(source.Image);
        }
        if (source.Server != null) {
            this.Server = new String(source.Server);
        }
        if (source.MaxRetryCount != null) {
            this.MaxRetryCount = new Long(source.MaxRetryCount);
        }
        if (source.DelayOnRetry != null) {
            this.DelayOnRetry = new Long(source.DelayOnRetry);
        }
        if (source.DockerRunOption != null) {
            this.DockerRunOption = new String(source.DockerRunOption);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "Image", this.Image);
        this.setParamSimple(map, prefix + "Server", this.Server);
        this.setParamSimple(map, prefix + "MaxRetryCount", this.MaxRetryCount);
        this.setParamSimple(map, prefix + "DelayOnRetry", this.DelayOnRetry);
        this.setParamSimple(map, prefix + "DockerRunOption", this.DockerRunOption);

    }
}

