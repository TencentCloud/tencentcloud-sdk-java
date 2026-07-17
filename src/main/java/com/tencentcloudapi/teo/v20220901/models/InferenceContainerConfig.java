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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InferenceContainerConfig extends AbstractModel {

    /**
    * 镜像类型。取值有：<li>TCR：腾讯云容器镜像服务的镜像。</li>
    */
    @SerializedName("ImageType")
    @Expose
    private String ImageType;

    /**
    * TCR 镜像仓库信息。当 ImageType 为 TCR 时必填。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TcrRepositoryConfig")
    @Expose
    private InferenceTCRRepositoryConfig TcrRepositoryConfig;

    /**
    * 容器启动时执行的命令，未填写时默认使用镜像的 Entrypoint/CMD。最长支持 1024 字符。
    */
    @SerializedName("StartupCommand")
    @Expose
    private String StartupCommand;

    /**
    * 容器运行时的环境变量。最多支持 10 个变量。
    */
    @SerializedName("EnvironmentVariables")
    @Expose
    private InferenceEnvironmentVariable [] EnvironmentVariables;

    /**
     * Get 镜像类型。取值有：<li>TCR：腾讯云容器镜像服务的镜像。</li> 
     * @return ImageType 镜像类型。取值有：<li>TCR：腾讯云容器镜像服务的镜像。</li>
     */
    public String getImageType() {
        return this.ImageType;
    }

    /**
     * Set 镜像类型。取值有：<li>TCR：腾讯云容器镜像服务的镜像。</li>
     * @param ImageType 镜像类型。取值有：<li>TCR：腾讯云容器镜像服务的镜像。</li>
     */
    public void setImageType(String ImageType) {
        this.ImageType = ImageType;
    }

    /**
     * Get TCR 镜像仓库信息。当 ImageType 为 TCR 时必填。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TcrRepositoryConfig TCR 镜像仓库信息。当 ImageType 为 TCR 时必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InferenceTCRRepositoryConfig getTcrRepositoryConfig() {
        return this.TcrRepositoryConfig;
    }

    /**
     * Set TCR 镜像仓库信息。当 ImageType 为 TCR 时必填。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TcrRepositoryConfig TCR 镜像仓库信息。当 ImageType 为 TCR 时必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTcrRepositoryConfig(InferenceTCRRepositoryConfig TcrRepositoryConfig) {
        this.TcrRepositoryConfig = TcrRepositoryConfig;
    }

    /**
     * Get 容器启动时执行的命令，未填写时默认使用镜像的 Entrypoint/CMD。最长支持 1024 字符。 
     * @return StartupCommand 容器启动时执行的命令，未填写时默认使用镜像的 Entrypoint/CMD。最长支持 1024 字符。
     */
    public String getStartupCommand() {
        return this.StartupCommand;
    }

    /**
     * Set 容器启动时执行的命令，未填写时默认使用镜像的 Entrypoint/CMD。最长支持 1024 字符。
     * @param StartupCommand 容器启动时执行的命令，未填写时默认使用镜像的 Entrypoint/CMD。最长支持 1024 字符。
     */
    public void setStartupCommand(String StartupCommand) {
        this.StartupCommand = StartupCommand;
    }

    /**
     * Get 容器运行时的环境变量。最多支持 10 个变量。 
     * @return EnvironmentVariables 容器运行时的环境变量。最多支持 10 个变量。
     */
    public InferenceEnvironmentVariable [] getEnvironmentVariables() {
        return this.EnvironmentVariables;
    }

    /**
     * Set 容器运行时的环境变量。最多支持 10 个变量。
     * @param EnvironmentVariables 容器运行时的环境变量。最多支持 10 个变量。
     */
    public void setEnvironmentVariables(InferenceEnvironmentVariable [] EnvironmentVariables) {
        this.EnvironmentVariables = EnvironmentVariables;
    }

    public InferenceContainerConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InferenceContainerConfig(InferenceContainerConfig source) {
        if (source.ImageType != null) {
            this.ImageType = new String(source.ImageType);
        }
        if (source.TcrRepositoryConfig != null) {
            this.TcrRepositoryConfig = new InferenceTCRRepositoryConfig(source.TcrRepositoryConfig);
        }
        if (source.StartupCommand != null) {
            this.StartupCommand = new String(source.StartupCommand);
        }
        if (source.EnvironmentVariables != null) {
            this.EnvironmentVariables = new InferenceEnvironmentVariable[source.EnvironmentVariables.length];
            for (int i = 0; i < source.EnvironmentVariables.length; i++) {
                this.EnvironmentVariables[i] = new InferenceEnvironmentVariable(source.EnvironmentVariables[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageType", this.ImageType);
        this.setParamObj(map, prefix + "TcrRepositoryConfig.", this.TcrRepositoryConfig);
        this.setParamSimple(map, prefix + "StartupCommand", this.StartupCommand);
        this.setParamArrayObj(map, prefix + "EnvironmentVariables.", this.EnvironmentVariables);

    }
}

