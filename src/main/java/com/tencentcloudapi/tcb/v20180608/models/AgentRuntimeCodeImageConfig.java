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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AgentRuntimeCodeImageConfig extends AbstractModel {

    /**
    * 镜像仓库类型，个人版或者企业版：personal/enterprise
    */
    @SerializedName("ImageType")
    @Expose
    private String ImageType;

    /**
    * {domain}/{namespace}/{imageName}:{tag}@{digest}
    */
    @SerializedName("ImageUri")
    @Expose
    private String ImageUri;

    /**
    * 用于企业版TCR获取镜像拉取临时凭证，ImageType为"enterprise"时必填
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * 容器的启动命令。该参数为可选参数，如果不填写，则默认使用 Dockerfile 中的 Entrypoint。传入规范，填写可运行的指令，例如 python
    */
    @SerializedName("Command")
    @Expose
    private String Command;

    /**
    * 容器的启动参数。该参数为可选参数，如果不填写，则默认使用 Dockerfile 中的 CMD。传入规范，以“空格”作为参数的分割标识，例如 -u app.py
    */
    @SerializedName("Args")
    @Expose
    private String Args;

    /**
    * 镜像加速开关，默认False
    */
    @SerializedName("ContainerImageAccelerate")
    @Expose
    private Boolean ContainerImageAccelerate;

    /**
     * Get 镜像仓库类型，个人版或者企业版：personal/enterprise 
     * @return ImageType 镜像仓库类型，个人版或者企业版：personal/enterprise
     */
    public String getImageType() {
        return this.ImageType;
    }

    /**
     * Set 镜像仓库类型，个人版或者企业版：personal/enterprise
     * @param ImageType 镜像仓库类型，个人版或者企业版：personal/enterprise
     */
    public void setImageType(String ImageType) {
        this.ImageType = ImageType;
    }

    /**
     * Get {domain}/{namespace}/{imageName}:{tag}@{digest} 
     * @return ImageUri {domain}/{namespace}/{imageName}:{tag}@{digest}
     */
    public String getImageUri() {
        return this.ImageUri;
    }

    /**
     * Set {domain}/{namespace}/{imageName}:{tag}@{digest}
     * @param ImageUri {domain}/{namespace}/{imageName}:{tag}@{digest}
     */
    public void setImageUri(String ImageUri) {
        this.ImageUri = ImageUri;
    }

    /**
     * Get 用于企业版TCR获取镜像拉取临时凭证，ImageType为"enterprise"时必填 
     * @return RegistryId 用于企业版TCR获取镜像拉取临时凭证，ImageType为"enterprise"时必填
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set 用于企业版TCR获取镜像拉取临时凭证，ImageType为"enterprise"时必填
     * @param RegistryId 用于企业版TCR获取镜像拉取临时凭证，ImageType为"enterprise"时必填
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get 容器的启动命令。该参数为可选参数，如果不填写，则默认使用 Dockerfile 中的 Entrypoint。传入规范，填写可运行的指令，例如 python 
     * @return Command 容器的启动命令。该参数为可选参数，如果不填写，则默认使用 Dockerfile 中的 Entrypoint。传入规范，填写可运行的指令，例如 python
     */
    public String getCommand() {
        return this.Command;
    }

    /**
     * Set 容器的启动命令。该参数为可选参数，如果不填写，则默认使用 Dockerfile 中的 Entrypoint。传入规范，填写可运行的指令，例如 python
     * @param Command 容器的启动命令。该参数为可选参数，如果不填写，则默认使用 Dockerfile 中的 Entrypoint。传入规范，填写可运行的指令，例如 python
     */
    public void setCommand(String Command) {
        this.Command = Command;
    }

    /**
     * Get 容器的启动参数。该参数为可选参数，如果不填写，则默认使用 Dockerfile 中的 CMD。传入规范，以“空格”作为参数的分割标识，例如 -u app.py 
     * @return Args 容器的启动参数。该参数为可选参数，如果不填写，则默认使用 Dockerfile 中的 CMD。传入规范，以“空格”作为参数的分割标识，例如 -u app.py
     */
    public String getArgs() {
        return this.Args;
    }

    /**
     * Set 容器的启动参数。该参数为可选参数，如果不填写，则默认使用 Dockerfile 中的 CMD。传入规范，以“空格”作为参数的分割标识，例如 -u app.py
     * @param Args 容器的启动参数。该参数为可选参数，如果不填写，则默认使用 Dockerfile 中的 CMD。传入规范，以“空格”作为参数的分割标识，例如 -u app.py
     */
    public void setArgs(String Args) {
        this.Args = Args;
    }

    /**
     * Get 镜像加速开关，默认False 
     * @return ContainerImageAccelerate 镜像加速开关，默认False
     */
    public Boolean getContainerImageAccelerate() {
        return this.ContainerImageAccelerate;
    }

    /**
     * Set 镜像加速开关，默认False
     * @param ContainerImageAccelerate 镜像加速开关，默认False
     */
    public void setContainerImageAccelerate(Boolean ContainerImageAccelerate) {
        this.ContainerImageAccelerate = ContainerImageAccelerate;
    }

    public AgentRuntimeCodeImageConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentRuntimeCodeImageConfig(AgentRuntimeCodeImageConfig source) {
        if (source.ImageType != null) {
            this.ImageType = new String(source.ImageType);
        }
        if (source.ImageUri != null) {
            this.ImageUri = new String(source.ImageUri);
        }
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.Command != null) {
            this.Command = new String(source.Command);
        }
        if (source.Args != null) {
            this.Args = new String(source.Args);
        }
        if (source.ContainerImageAccelerate != null) {
            this.ContainerImageAccelerate = new Boolean(source.ContainerImageAccelerate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageType", this.ImageType);
        this.setParamSimple(map, prefix + "ImageUri", this.ImageUri);
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "Command", this.Command);
        this.setParamSimple(map, prefix + "Args", this.Args);
        this.setParamSimple(map, prefix + "ContainerImageAccelerate", this.ContainerImageAccelerate);

    }
}

