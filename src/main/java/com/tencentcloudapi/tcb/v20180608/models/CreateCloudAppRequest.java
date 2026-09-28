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
    * <p>选择 NodeRuntime 版本: 16,18,20,22,24 等</p>
    */
    @SerializedName("NodeJsVersion")
    @Expose
    private String NodeJsVersion;

    /**
    * <p>暂不支持：Webhook 触发器功能尚未对外开放，客户端传入的 Trigger 字段会被平台静默忽略（仅日志告警，不拒绝请求）</p>
    */
    @SerializedName("Trigger")
    @Expose
    private CloudAppTrigger Trigger;

    /**
    * <p>服务列表</p>
    */
    @SerializedName("ServiceList")
    @Expose
    private CloudAppLinkService [] ServiceList;

    /**
    * <p>全局工作目录</p>
    */
    @SerializedName("WorkingDir")
    @Expose
    private String WorkingDir;

    /**
    * <p>路由列表</p>
    */
    @SerializedName("Routes")
    @Expose
    private CloudAppRoute [] Routes;

    /**
    * <p>部署类型</p>
    */
    @SerializedName("PromoteType")
    @Expose
    private String PromoteType;

    /**
    * <p>发布 Token 校验</p>
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * <p>前置执行命令</p>
    */
    @SerializedName("PreDeployCommand")
    @Expose
    private String PreDeployCommand;

    /**
    * <p>后置执行命令</p>
    */
    @SerializedName("PostDeployCommand")
    @Expose
    private String PostDeployCommand;

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

    /**
     * Get <p>选择 NodeRuntime 版本: 16,18,20,22,24 等</p> 
     * @return NodeJsVersion <p>选择 NodeRuntime 版本: 16,18,20,22,24 等</p>
     */
    public String getNodeJsVersion() {
        return this.NodeJsVersion;
    }

    /**
     * Set <p>选择 NodeRuntime 版本: 16,18,20,22,24 等</p>
     * @param NodeJsVersion <p>选择 NodeRuntime 版本: 16,18,20,22,24 等</p>
     */
    public void setNodeJsVersion(String NodeJsVersion) {
        this.NodeJsVersion = NodeJsVersion;
    }

    /**
     * Get <p>暂不支持：Webhook 触发器功能尚未对外开放，客户端传入的 Trigger 字段会被平台静默忽略（仅日志告警，不拒绝请求）</p> 
     * @return Trigger <p>暂不支持：Webhook 触发器功能尚未对外开放，客户端传入的 Trigger 字段会被平台静默忽略（仅日志告警，不拒绝请求）</p>
     */
    public CloudAppTrigger getTrigger() {
        return this.Trigger;
    }

    /**
     * Set <p>暂不支持：Webhook 触发器功能尚未对外开放，客户端传入的 Trigger 字段会被平台静默忽略（仅日志告警，不拒绝请求）</p>
     * @param Trigger <p>暂不支持：Webhook 触发器功能尚未对外开放，客户端传入的 Trigger 字段会被平台静默忽略（仅日志告警，不拒绝请求）</p>
     */
    public void setTrigger(CloudAppTrigger Trigger) {
        this.Trigger = Trigger;
    }

    /**
     * Get <p>服务列表</p> 
     * @return ServiceList <p>服务列表</p>
     */
    public CloudAppLinkService [] getServiceList() {
        return this.ServiceList;
    }

    /**
     * Set <p>服务列表</p>
     * @param ServiceList <p>服务列表</p>
     */
    public void setServiceList(CloudAppLinkService [] ServiceList) {
        this.ServiceList = ServiceList;
    }

    /**
     * Get <p>全局工作目录</p> 
     * @return WorkingDir <p>全局工作目录</p>
     */
    public String getWorkingDir() {
        return this.WorkingDir;
    }

    /**
     * Set <p>全局工作目录</p>
     * @param WorkingDir <p>全局工作目录</p>
     */
    public void setWorkingDir(String WorkingDir) {
        this.WorkingDir = WorkingDir;
    }

    /**
     * Get <p>路由列表</p> 
     * @return Routes <p>路由列表</p>
     */
    public CloudAppRoute [] getRoutes() {
        return this.Routes;
    }

    /**
     * Set <p>路由列表</p>
     * @param Routes <p>路由列表</p>
     */
    public void setRoutes(CloudAppRoute [] Routes) {
        this.Routes = Routes;
    }

    /**
     * Get <p>部署类型</p> 
     * @return PromoteType <p>部署类型</p>
     */
    public String getPromoteType() {
        return this.PromoteType;
    }

    /**
     * Set <p>部署类型</p>
     * @param PromoteType <p>部署类型</p>
     */
    public void setPromoteType(String PromoteType) {
        this.PromoteType = PromoteType;
    }

    /**
     * Get <p>发布 Token 校验</p> 
     * @return ClientToken <p>发布 Token 校验</p>
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set <p>发布 Token 校验</p>
     * @param ClientToken <p>发布 Token 校验</p>
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get <p>前置执行命令</p> 
     * @return PreDeployCommand <p>前置执行命令</p>
     */
    public String getPreDeployCommand() {
        return this.PreDeployCommand;
    }

    /**
     * Set <p>前置执行命令</p>
     * @param PreDeployCommand <p>前置执行命令</p>
     */
    public void setPreDeployCommand(String PreDeployCommand) {
        this.PreDeployCommand = PreDeployCommand;
    }

    /**
     * Get <p>后置执行命令</p> 
     * @return PostDeployCommand <p>后置执行命令</p>
     */
    public String getPostDeployCommand() {
        return this.PostDeployCommand;
    }

    /**
     * Set <p>后置执行命令</p>
     * @param PostDeployCommand <p>后置执行命令</p>
     */
    public void setPostDeployCommand(String PostDeployCommand) {
        this.PostDeployCommand = PostDeployCommand;
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
        if (source.NodeJsVersion != null) {
            this.NodeJsVersion = new String(source.NodeJsVersion);
        }
        if (source.Trigger != null) {
            this.Trigger = new CloudAppTrigger(source.Trigger);
        }
        if (source.ServiceList != null) {
            this.ServiceList = new CloudAppLinkService[source.ServiceList.length];
            for (int i = 0; i < source.ServiceList.length; i++) {
                this.ServiceList[i] = new CloudAppLinkService(source.ServiceList[i]);
            }
        }
        if (source.WorkingDir != null) {
            this.WorkingDir = new String(source.WorkingDir);
        }
        if (source.Routes != null) {
            this.Routes = new CloudAppRoute[source.Routes.length];
            for (int i = 0; i < source.Routes.length; i++) {
                this.Routes[i] = new CloudAppRoute(source.Routes[i]);
            }
        }
        if (source.PromoteType != null) {
            this.PromoteType = new String(source.PromoteType);
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
        if (source.PreDeployCommand != null) {
            this.PreDeployCommand = new String(source.PreDeployCommand);
        }
        if (source.PostDeployCommand != null) {
            this.PostDeployCommand = new String(source.PostDeployCommand);
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
        this.setParamSimple(map, prefix + "NodeJsVersion", this.NodeJsVersion);
        this.setParamObj(map, prefix + "Trigger.", this.Trigger);
        this.setParamArrayObj(map, prefix + "ServiceList.", this.ServiceList);
        this.setParamSimple(map, prefix + "WorkingDir", this.WorkingDir);
        this.setParamArrayObj(map, prefix + "Routes.", this.Routes);
        this.setParamSimple(map, prefix + "PromoteType", this.PromoteType);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamSimple(map, prefix + "PreDeployCommand", this.PreDeployCommand);
        this.setParamSimple(map, prefix + "PostDeployCommand", this.PostDeployCommand);

    }
}

