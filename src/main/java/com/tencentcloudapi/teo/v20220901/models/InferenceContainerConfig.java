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
    * <p>镜像类型。取值有：<li>TCR：腾讯云容器镜像服务的镜像。</li></p>
    */
    @SerializedName("ImageType")
    @Expose
    private String ImageType;

    /**
    * <p>TCR 镜像仓库信息。当 ImageType 为 TCR 时必填。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TcrRepositoryConfig")
    @Expose
    private InferenceTCRRepositoryConfig TcrRepositoryConfig;

    /**
    * <p>容器启动时执行的命令，未填写时默认使用镜像的 Entrypoint/CMD。最长支持 1024 字符。</p>
    */
    @SerializedName("StartupCommand")
    @Expose
    private String StartupCommand;

    /**
    * <p>容器运行时的环境变量。最多支持 10 个变量。</p>
    */
    @SerializedName("EnvironmentVariables")
    @Expose
    private InferenceEnvironmentVariable [] EnvironmentVariables;

    /**
     * Get <p>镜像类型。取值有：<li>TCR：腾讯云容器镜像服务的镜像。</li></p> 
     * @return ImageType <p>镜像类型。取值有：<li>TCR：腾讯云容器镜像服务的镜像。</li></p>
     */
    public String getImageType() {
        return this.ImageType;
    }

    /**
     * Set <p>镜像类型。取值有：<li>TCR：腾讯云容器镜像服务的镜像。</li></p>
     * @param ImageType <p>镜像类型。取值有：<li>TCR：腾讯云容器镜像服务的镜像。</li></p>
     */
    public void setImageType(String ImageType) {
        this.ImageType = ImageType;
    }

    /**
     * Get <p>TCR 镜像仓库信息。当 ImageType 为 TCR 时必填。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TcrRepositoryConfig <p>TCR 镜像仓库信息。当 ImageType 为 TCR 时必填。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InferenceTCRRepositoryConfig getTcrRepositoryConfig() {
        return this.TcrRepositoryConfig;
    }

    /**
     * Set <p>TCR 镜像仓库信息。当 ImageType 为 TCR 时必填。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TcrRepositoryConfig <p>TCR 镜像仓库信息。当 ImageType 为 TCR 时必填。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTcrRepositoryConfig(InferenceTCRRepositoryConfig TcrRepositoryConfig) {
        this.TcrRepositoryConfig = TcrRepositoryConfig;
    }

    /**
     * Get <p>容器启动时执行的命令，未填写时默认使用镜像的 Entrypoint/CMD。最长支持 1024 字符。</p> 
     * @return StartupCommand <p>容器启动时执行的命令，未填写时默认使用镜像的 Entrypoint/CMD。最长支持 1024 字符。</p>
     */
    public String getStartupCommand() {
        return this.StartupCommand;
    }

    /**
     * Set <p>容器启动时执行的命令，未填写时默认使用镜像的 Entrypoint/CMD。最长支持 1024 字符。</p>
     * @param StartupCommand <p>容器启动时执行的命令，未填写时默认使用镜像的 Entrypoint/CMD。最长支持 1024 字符。</p>
     */
    public void setStartupCommand(String StartupCommand) {
        this.StartupCommand = StartupCommand;
    }

    /**
     * Get <p>容器运行时的环境变量。最多支持 10 个变量。</p> 
     * @return EnvironmentVariables <p>容器运行时的环境变量。最多支持 10 个变量。</p>
     */
    public InferenceEnvironmentVariable [] getEnvironmentVariables() {
        return this.EnvironmentVariables;
    }

    /**
     * Set <p>容器运行时的环境变量。最多支持 10 个变量。</p>
     * @param EnvironmentVariables <p>容器运行时的环境变量。最多支持 10 个变量。</p>
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

