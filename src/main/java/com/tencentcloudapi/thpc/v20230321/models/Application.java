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
package com.tencentcloudapi.thpc.v20230321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Application extends AbstractModel {

    /**
    * 待执行脚本命令。
    */
    @SerializedName("Commands")
    @Expose
    private CommandItem [] Commands;

    /**
    * 存储目录挂载配置。
    */
    @SerializedName("StorageMounts")
    @Expose
    private StorageMount [] StorageMounts;

    /**
    * 用户自定义环境变量。
    */
    @SerializedName("EnvVars")
    @Expose
    private EnvVar [] EnvVars;

    /**
    * 容器配置信息。
    */
    @SerializedName("Docker")
    @Expose
    private Docker Docker;

    /**
    * 无
    */
    @SerializedName("OutputRedirect")
    @Expose
    private OutputRedirect OutputRedirect;

    /**
    * 表示所选训练框架，支持可选参数
 
- PyTorch：表示提交PyTorch训练作业
- Custom：表示用户自定义作业

默认参数为：Custom
    */
    @SerializedName("JobType")
    @Expose
    private String JobType;

    /**
    * 表示所选训练框架，支持可选参数
 
- PyTorch：表示提交PyTorch训练作业
- Custom：表示用户自定义作业

默认参数为：Custom
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
     * Get 待执行脚本命令。 
     * @return Commands 待执行脚本命令。
     */
    public CommandItem [] getCommands() {
        return this.Commands;
    }

    /**
     * Set 待执行脚本命令。
     * @param Commands 待执行脚本命令。
     */
    public void setCommands(CommandItem [] Commands) {
        this.Commands = Commands;
    }

    /**
     * Get 存储目录挂载配置。 
     * @return StorageMounts 存储目录挂载配置。
     */
    public StorageMount [] getStorageMounts() {
        return this.StorageMounts;
    }

    /**
     * Set 存储目录挂载配置。
     * @param StorageMounts 存储目录挂载配置。
     */
    public void setStorageMounts(StorageMount [] StorageMounts) {
        this.StorageMounts = StorageMounts;
    }

    /**
     * Get 用户自定义环境变量。 
     * @return EnvVars 用户自定义环境变量。
     */
    public EnvVar [] getEnvVars() {
        return this.EnvVars;
    }

    /**
     * Set 用户自定义环境变量。
     * @param EnvVars 用户自定义环境变量。
     */
    public void setEnvVars(EnvVar [] EnvVars) {
        this.EnvVars = EnvVars;
    }

    /**
     * Get 容器配置信息。 
     * @return Docker 容器配置信息。
     */
    public Docker getDocker() {
        return this.Docker;
    }

    /**
     * Set 容器配置信息。
     * @param Docker 容器配置信息。
     */
    public void setDocker(Docker Docker) {
        this.Docker = Docker;
    }

    /**
     * Get 无 
     * @return OutputRedirect 无
     */
    public OutputRedirect getOutputRedirect() {
        return this.OutputRedirect;
    }

    /**
     * Set 无
     * @param OutputRedirect 无
     */
    public void setOutputRedirect(OutputRedirect OutputRedirect) {
        this.OutputRedirect = OutputRedirect;
    }

    /**
     * Get 表示所选训练框架，支持可选参数
 
- PyTorch：表示提交PyTorch训练作业
- Custom：表示用户自定义作业

默认参数为：Custom 
     * @return JobType 表示所选训练框架，支持可选参数
 
- PyTorch：表示提交PyTorch训练作业
- Custom：表示用户自定义作业

默认参数为：Custom
     * @deprecated
     */
    @Deprecated
    public String getJobType() {
        return this.JobType;
    }

    /**
     * Set 表示所选训练框架，支持可选参数
 
- PyTorch：表示提交PyTorch训练作业
- Custom：表示用户自定义作业

默认参数为：Custom
     * @param JobType 表示所选训练框架，支持可选参数
 
- PyTorch：表示提交PyTorch训练作业
- Custom：表示用户自定义作业

默认参数为：Custom
     * @deprecated
     */
    @Deprecated
    public void setJobType(String JobType) {
        this.JobType = JobType;
    }

    /**
     * Get 表示所选训练框架，支持可选参数
 
- PyTorch：表示提交PyTorch训练作业
- Custom：表示用户自定义作业

默认参数为：Custom 
     * @return TaskType 表示所选训练框架，支持可选参数
 
- PyTorch：表示提交PyTorch训练作业
- Custom：表示用户自定义作业

默认参数为：Custom
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 表示所选训练框架，支持可选参数
 
- PyTorch：表示提交PyTorch训练作业
- Custom：表示用户自定义作业

默认参数为：Custom
     * @param TaskType 表示所选训练框架，支持可选参数
 
- PyTorch：表示提交PyTorch训练作业
- Custom：表示用户自定义作业

默认参数为：Custom
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    public Application() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Application(Application source) {
        if (source.Commands != null) {
            this.Commands = new CommandItem[source.Commands.length];
            for (int i = 0; i < source.Commands.length; i++) {
                this.Commands[i] = new CommandItem(source.Commands[i]);
            }
        }
        if (source.StorageMounts != null) {
            this.StorageMounts = new StorageMount[source.StorageMounts.length];
            for (int i = 0; i < source.StorageMounts.length; i++) {
                this.StorageMounts[i] = new StorageMount(source.StorageMounts[i]);
            }
        }
        if (source.EnvVars != null) {
            this.EnvVars = new EnvVar[source.EnvVars.length];
            for (int i = 0; i < source.EnvVars.length; i++) {
                this.EnvVars[i] = new EnvVar(source.EnvVars[i]);
            }
        }
        if (source.Docker != null) {
            this.Docker = new Docker(source.Docker);
        }
        if (source.OutputRedirect != null) {
            this.OutputRedirect = new OutputRedirect(source.OutputRedirect);
        }
        if (source.JobType != null) {
            this.JobType = new String(source.JobType);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Commands.", this.Commands);
        this.setParamArrayObj(map, prefix + "StorageMounts.", this.StorageMounts);
        this.setParamArrayObj(map, prefix + "EnvVars.", this.EnvVars);
        this.setParamObj(map, prefix + "Docker.", this.Docker);
        this.setParamObj(map, prefix + "OutputRedirect.", this.OutputRedirect);
        this.setParamSimple(map, prefix + "JobType", this.JobType);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);

    }
}

