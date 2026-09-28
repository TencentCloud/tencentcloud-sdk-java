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

public class CloudAppLinkService extends AbstractModel {

    /**
    * <p>服务类型</p><p>枚举值：</p><ul><li>http-function： HTTP 云函数</li><li>function： 普通云函数</li><li>static-hosting： 静态托管</li></ul>
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * <p>服务名称</p>
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * <p>服务身份</p>
    */
    @SerializedName("Identifier")
    @Expose
    private String Identifier;

    /**
    * <p>服务动作</p>
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * <p>服务构建命令</p>
    */
    @SerializedName("Command")
    @Expose
    private BuildCommands Command;

    /**
    * <p>服务构建部署上下文</p>
    */
    @SerializedName("BuildContext")
    @Expose
    private BuildContext BuildContext;

    /**
     * Get <p>服务类型</p><p>枚举值：</p><ul><li>http-function： HTTP 云函数</li><li>function： 普通云函数</li><li>static-hosting： 静态托管</li></ul> 
     * @return ServiceType <p>服务类型</p><p>枚举值：</p><ul><li>http-function： HTTP 云函数</li><li>function： 普通云函数</li><li>static-hosting： 静态托管</li></ul>
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set <p>服务类型</p><p>枚举值：</p><ul><li>http-function： HTTP 云函数</li><li>function： 普通云函数</li><li>static-hosting： 静态托管</li></ul>
     * @param ServiceType <p>服务类型</p><p>枚举值：</p><ul><li>http-function： HTTP 云函数</li><li>function： 普通云函数</li><li>static-hosting： 静态托管</li></ul>
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get <p>服务名称</p> 
     * @return ServiceName <p>服务名称</p>
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set <p>服务名称</p>
     * @param ServiceName <p>服务名称</p>
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get <p>服务身份</p> 
     * @return Identifier <p>服务身份</p>
     */
    public String getIdentifier() {
        return this.Identifier;
    }

    /**
     * Set <p>服务身份</p>
     * @param Identifier <p>服务身份</p>
     */
    public void setIdentifier(String Identifier) {
        this.Identifier = Identifier;
    }

    /**
     * Get <p>服务动作</p> 
     * @return Action <p>服务动作</p>
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set <p>服务动作</p>
     * @param Action <p>服务动作</p>
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get <p>服务构建命令</p> 
     * @return Command <p>服务构建命令</p>
     */
    public BuildCommands getCommand() {
        return this.Command;
    }

    /**
     * Set <p>服务构建命令</p>
     * @param Command <p>服务构建命令</p>
     */
    public void setCommand(BuildCommands Command) {
        this.Command = Command;
    }

    /**
     * Get <p>服务构建部署上下文</p> 
     * @return BuildContext <p>服务构建部署上下文</p>
     */
    public BuildContext getBuildContext() {
        return this.BuildContext;
    }

    /**
     * Set <p>服务构建部署上下文</p>
     * @param BuildContext <p>服务构建部署上下文</p>
     */
    public void setBuildContext(BuildContext BuildContext) {
        this.BuildContext = BuildContext;
    }

    public CloudAppLinkService() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudAppLinkService(CloudAppLinkService source) {
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.Identifier != null) {
            this.Identifier = new String(source.Identifier);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.Command != null) {
            this.Command = new BuildCommands(source.Command);
        }
        if (source.BuildContext != null) {
            this.BuildContext = new BuildContext(source.BuildContext);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "Identifier", this.Identifier);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamObj(map, prefix + "Command.", this.Command);
        this.setParamObj(map, prefix + "BuildContext.", this.BuildContext);

    }
}

