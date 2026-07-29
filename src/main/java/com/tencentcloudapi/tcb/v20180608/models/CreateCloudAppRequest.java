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

public class CreateCloudAppRequest extends AbstractModel {

    /**
    * <p>环境ID</p>
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * <p>服务名</p>
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * <p>部署类型</p>
    */
    @SerializedName("DeployType")
    @Expose
    private String DeployType;

    /**
    * <p>构建类型</p>
    */
    @SerializedName("BuildType")
    @Expose
    private String BuildType;

    /**
    * <p>静态应用创建配置信息</p>
    */
    @SerializedName("StaticConfig")
    @Expose
    private StaticConfig StaticConfig;

    /**
    * <p>源码定义</p>
    */
    @SerializedName("Source")
    @Expose
    private BuildSource Source;

    /**
    * <p>Commands 与 CustomSteps 至少填一个</p>
    */
    @SerializedName("Commands")
    @Expose
    private BuildCommands Commands;

    /**
    * <p>Commands 与 CustomSteps 至少填一个，docker 镜像构建场景强烈建议用 CustomSteps</p>
    */
    @SerializedName("Env")
    @Expose
    private Variable [] Env;

    /**
    * <p>非敏感环境变量，构建容器中以 $KEY 引用</p>
    */
    @SerializedName("CustomSteps")
    @Expose
    private BuildStep [] CustomSteps;

    /**
    * <p>敏感凭证（AES 加密落库），构建容器中以 $SECRET_NAME 引用</p>
    */
    @SerializedName("Secrets")
    @Expose
    private BuildSecret [] Secrets;

    /**
     * Get <p>环境ID</p> 
     * @return EnvId <p>环境ID</p>
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set <p>环境ID</p>
     * @param EnvId <p>环境ID</p>
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get <p>服务名</p> 
     * @return ServiceName <p>服务名</p>
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set <p>服务名</p>
     * @param ServiceName <p>服务名</p>
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get <p>部署类型</p> 
     * @return DeployType <p>部署类型</p>
     */
    public String getDeployType() {
        return this.DeployType;
    }

    /**
     * Set <p>部署类型</p>
     * @param DeployType <p>部署类型</p>
     */
    public void setDeployType(String DeployType) {
        this.DeployType = DeployType;
    }

    /**
     * Get <p>构建类型</p> 
     * @return BuildType <p>构建类型</p>
     */
    public String getBuildType() {
        return this.BuildType;
    }

    /**
     * Set <p>构建类型</p>
     * @param BuildType <p>构建类型</p>
     */
    public void setBuildType(String BuildType) {
        this.BuildType = BuildType;
    }

    /**
     * Get <p>静态应用创建配置信息</p> 
     * @return StaticConfig <p>静态应用创建配置信息</p>
     */
    public StaticConfig getStaticConfig() {
        return this.StaticConfig;
    }

    /**
     * Set <p>静态应用创建配置信息</p>
     * @param StaticConfig <p>静态应用创建配置信息</p>
     */
    public void setStaticConfig(StaticConfig StaticConfig) {
        this.StaticConfig = StaticConfig;
    }

    /**
     * Get <p>源码定义</p> 
     * @return Source <p>源码定义</p>
     */
    public BuildSource getSource() {
        return this.Source;
    }

    /**
     * Set <p>源码定义</p>
     * @param Source <p>源码定义</p>
     */
    public void setSource(BuildSource Source) {
        this.Source = Source;
    }

    /**
     * Get <p>Commands 与 CustomSteps 至少填一个</p> 
     * @return Commands <p>Commands 与 CustomSteps 至少填一个</p>
     */
    public BuildCommands getCommands() {
        return this.Commands;
    }

    /**
     * Set <p>Commands 与 CustomSteps 至少填一个</p>
     * @param Commands <p>Commands 与 CustomSteps 至少填一个</p>
     */
    public void setCommands(BuildCommands Commands) {
        this.Commands = Commands;
    }

    /**
     * Get <p>Commands 与 CustomSteps 至少填一个，docker 镜像构建场景强烈建议用 CustomSteps</p> 
     * @return Env <p>Commands 与 CustomSteps 至少填一个，docker 镜像构建场景强烈建议用 CustomSteps</p>
     */
    public Variable [] getEnv() {
        return this.Env;
    }

    /**
     * Set <p>Commands 与 CustomSteps 至少填一个，docker 镜像构建场景强烈建议用 CustomSteps</p>
     * @param Env <p>Commands 与 CustomSteps 至少填一个，docker 镜像构建场景强烈建议用 CustomSteps</p>
     */
    public void setEnv(Variable [] Env) {
        this.Env = Env;
    }

    /**
     * Get <p>非敏感环境变量，构建容器中以 $KEY 引用</p> 
     * @return CustomSteps <p>非敏感环境变量，构建容器中以 $KEY 引用</p>
     */
    public BuildStep [] getCustomSteps() {
        return this.CustomSteps;
    }

    /**
     * Set <p>非敏感环境变量，构建容器中以 $KEY 引用</p>
     * @param CustomSteps <p>非敏感环境变量，构建容器中以 $KEY 引用</p>
     */
    public void setCustomSteps(BuildStep [] CustomSteps) {
        this.CustomSteps = CustomSteps;
    }

    /**
     * Get <p>敏感凭证（AES 加密落库），构建容器中以 $SECRET_NAME 引用</p> 
     * @return Secrets <p>敏感凭证（AES 加密落库），构建容器中以 $SECRET_NAME 引用</p>
     */
    public BuildSecret [] getSecrets() {
        return this.Secrets;
    }

    /**
     * Set <p>敏感凭证（AES 加密落库），构建容器中以 $SECRET_NAME 引用</p>
     * @param Secrets <p>敏感凭证（AES 加密落库），构建容器中以 $SECRET_NAME 引用</p>
     */
    public void setSecrets(BuildSecret [] Secrets) {
        this.Secrets = Secrets;
    }

    public CreateCloudAppRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCloudAppRequest(CreateCloudAppRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.DeployType != null) {
            this.DeployType = new String(source.DeployType);
        }
        if (source.BuildType != null) {
            this.BuildType = new String(source.BuildType);
        }
        if (source.StaticConfig != null) {
            this.StaticConfig = new StaticConfig(source.StaticConfig);
        }
        if (source.Source != null) {
            this.Source = new BuildSource(source.Source);
        }
        if (source.Commands != null) {
            this.Commands = new BuildCommands(source.Commands);
        }
        if (source.Env != null) {
            this.Env = new Variable[source.Env.length];
            for (int i = 0; i < source.Env.length; i++) {
                this.Env[i] = new Variable(source.Env[i]);
            }
        }
        if (source.CustomSteps != null) {
            this.CustomSteps = new BuildStep[source.CustomSteps.length];
            for (int i = 0; i < source.CustomSteps.length; i++) {
                this.CustomSteps[i] = new BuildStep(source.CustomSteps[i]);
            }
        }
        if (source.Secrets != null) {
            this.Secrets = new BuildSecret[source.Secrets.length];
            for (int i = 0; i < source.Secrets.length; i++) {
                this.Secrets[i] = new BuildSecret(source.Secrets[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "DeployType", this.DeployType);
        this.setParamSimple(map, prefix + "BuildType", this.BuildType);
        this.setParamObj(map, prefix + "StaticConfig.", this.StaticConfig);
        this.setParamObj(map, prefix + "Source.", this.Source);
        this.setParamObj(map, prefix + "Commands.", this.Commands);
        this.setParamArrayObj(map, prefix + "Env.", this.Env);
        this.setParamArrayObj(map, prefix + "CustomSteps.", this.CustomSteps);
        this.setParamArrayObj(map, prefix + "Secrets.", this.Secrets);

    }
}

