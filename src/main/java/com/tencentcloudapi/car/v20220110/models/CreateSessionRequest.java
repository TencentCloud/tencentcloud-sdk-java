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
package com.tencentcloudapi.car.v20220110.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSessionRequest extends AbstractModel{

    /**
    * 唯一用户身份标识，由业务方自定义，平台不予理解。（可根据业务需要决定使用用户的唯一身份标识或是使用时间戳随机生成；在用户重连时应保持UserId不变）
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 用户IP，用户客户端的公网IP，用于就近调度
    */
    @SerializedName("UserIp")
    @Expose
    private String UserIp;

    /**
    * 客户端session信息，从SDK请求中获得。特殊的，当 RunMode 参数为 RunWithoutClient 时，该字段可以为空
    */
    @SerializedName("ClientSession")
    @Expose
    private String ClientSession;

    /**
    * 云端运行模式。
RunWithoutClient：允许无客户端连接的情况下仍保持云端 App 运行
默认值（空）：要求必须有客户端连接才会保持云端 App 运行。
    */
    @SerializedName("RunMode")
    @Expose
    private String RunMode;

    /**
    * 应用启动参数。
如果请求的是多应用共享项目，此参数生效；
如果请求的是关闭预启动的单应用独享项目，此参数生效；
如果请求的是开启预启动的单应用独享项目，此参数失效。
    */
    @SerializedName("ApplicationParameters")
    @Expose
    private String ApplicationParameters;

    /**
    * 【多人互动】房主用户ID，在多人互动模式下为必填字段。
如果该用户是房主，HostUserId需要和UserId保持一致；
如果该用户非房主，HostUserId需要填写房主的HostUserId。
    */
    @SerializedName("HostUserId")
    @Expose
    private String HostUserId;

    /**
    * 【多人互动】角色。
Player：玩家（可通过键鼠等操作应用）
Viewer：观察者（只能观看，无法操作）
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
     * Get 唯一用户身份标识，由业务方自定义，平台不予理解。（可根据业务需要决定使用用户的唯一身份标识或是使用时间戳随机生成；在用户重连时应保持UserId不变） 
     * @return UserId 唯一用户身份标识，由业务方自定义，平台不予理解。（可根据业务需要决定使用用户的唯一身份标识或是使用时间戳随机生成；在用户重连时应保持UserId不变）
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 唯一用户身份标识，由业务方自定义，平台不予理解。（可根据业务需要决定使用用户的唯一身份标识或是使用时间戳随机生成；在用户重连时应保持UserId不变）
     * @param UserId 唯一用户身份标识，由业务方自定义，平台不予理解。（可根据业务需要决定使用用户的唯一身份标识或是使用时间戳随机生成；在用户重连时应保持UserId不变）
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 用户IP，用户客户端的公网IP，用于就近调度 
     * @return UserIp 用户IP，用户客户端的公网IP，用于就近调度
     */
    public String getUserIp() {
        return this.UserIp;
    }

    /**
     * Set 用户IP，用户客户端的公网IP，用于就近调度
     * @param UserIp 用户IP，用户客户端的公网IP，用于就近调度
     */
    public void setUserIp(String UserIp) {
        this.UserIp = UserIp;
    }

    /**
     * Get 客户端session信息，从SDK请求中获得。特殊的，当 RunMode 参数为 RunWithoutClient 时，该字段可以为空 
     * @return ClientSession 客户端session信息，从SDK请求中获得。特殊的，当 RunMode 参数为 RunWithoutClient 时，该字段可以为空
     */
    public String getClientSession() {
        return this.ClientSession;
    }

    /**
     * Set 客户端session信息，从SDK请求中获得。特殊的，当 RunMode 参数为 RunWithoutClient 时，该字段可以为空
     * @param ClientSession 客户端session信息，从SDK请求中获得。特殊的，当 RunMode 参数为 RunWithoutClient 时，该字段可以为空
     */
    public void setClientSession(String ClientSession) {
        this.ClientSession = ClientSession;
    }

    /**
     * Get 云端运行模式。
RunWithoutClient：允许无客户端连接的情况下仍保持云端 App 运行
默认值（空）：要求必须有客户端连接才会保持云端 App 运行。 
     * @return RunMode 云端运行模式。
RunWithoutClient：允许无客户端连接的情况下仍保持云端 App 运行
默认值（空）：要求必须有客户端连接才会保持云端 App 运行。
     */
    public String getRunMode() {
        return this.RunMode;
    }

    /**
     * Set 云端运行模式。
RunWithoutClient：允许无客户端连接的情况下仍保持云端 App 运行
默认值（空）：要求必须有客户端连接才会保持云端 App 运行。
     * @param RunMode 云端运行模式。
RunWithoutClient：允许无客户端连接的情况下仍保持云端 App 运行
默认值（空）：要求必须有客户端连接才会保持云端 App 运行。
     */
    public void setRunMode(String RunMode) {
        this.RunMode = RunMode;
    }

    /**
     * Get 应用启动参数。
如果请求的是多应用共享项目，此参数生效；
如果请求的是关闭预启动的单应用独享项目，此参数生效；
如果请求的是开启预启动的单应用独享项目，此参数失效。 
     * @return ApplicationParameters 应用启动参数。
如果请求的是多应用共享项目，此参数生效；
如果请求的是关闭预启动的单应用独享项目，此参数生效；
如果请求的是开启预启动的单应用独享项目，此参数失效。
     */
    public String getApplicationParameters() {
        return this.ApplicationParameters;
    }

    /**
     * Set 应用启动参数。
如果请求的是多应用共享项目，此参数生效；
如果请求的是关闭预启动的单应用独享项目，此参数生效；
如果请求的是开启预启动的单应用独享项目，此参数失效。
     * @param ApplicationParameters 应用启动参数。
如果请求的是多应用共享项目，此参数生效；
如果请求的是关闭预启动的单应用独享项目，此参数生效；
如果请求的是开启预启动的单应用独享项目，此参数失效。
     */
    public void setApplicationParameters(String ApplicationParameters) {
        this.ApplicationParameters = ApplicationParameters;
    }

    /**
     * Get 【多人互动】房主用户ID，在多人互动模式下为必填字段。
如果该用户是房主，HostUserId需要和UserId保持一致；
如果该用户非房主，HostUserId需要填写房主的HostUserId。 
     * @return HostUserId 【多人互动】房主用户ID，在多人互动模式下为必填字段。
如果该用户是房主，HostUserId需要和UserId保持一致；
如果该用户非房主，HostUserId需要填写房主的HostUserId。
     */
    public String getHostUserId() {
        return this.HostUserId;
    }

    /**
     * Set 【多人互动】房主用户ID，在多人互动模式下为必填字段。
如果该用户是房主，HostUserId需要和UserId保持一致；
如果该用户非房主，HostUserId需要填写房主的HostUserId。
     * @param HostUserId 【多人互动】房主用户ID，在多人互动模式下为必填字段。
如果该用户是房主，HostUserId需要和UserId保持一致；
如果该用户非房主，HostUserId需要填写房主的HostUserId。
     */
    public void setHostUserId(String HostUserId) {
        this.HostUserId = HostUserId;
    }

    /**
     * Get 【多人互动】角色。
Player：玩家（可通过键鼠等操作应用）
Viewer：观察者（只能观看，无法操作） 
     * @return Role 【多人互动】角色。
Player：玩家（可通过键鼠等操作应用）
Viewer：观察者（只能观看，无法操作）
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set 【多人互动】角色。
Player：玩家（可通过键鼠等操作应用）
Viewer：观察者（只能观看，无法操作）
     * @param Role 【多人互动】角色。
Player：玩家（可通过键鼠等操作应用）
Viewer：观察者（只能观看，无法操作）
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    public CreateSessionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSessionRequest(CreateSessionRequest source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.UserIp != null) {
            this.UserIp = new String(source.UserIp);
        }
        if (source.ClientSession != null) {
            this.ClientSession = new String(source.ClientSession);
        }
        if (source.RunMode != null) {
            this.RunMode = new String(source.RunMode);
        }
        if (source.ApplicationParameters != null) {
            this.ApplicationParameters = new String(source.ApplicationParameters);
        }
        if (source.HostUserId != null) {
            this.HostUserId = new String(source.HostUserId);
        }
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "UserIp", this.UserIp);
        this.setParamSimple(map, prefix + "ClientSession", this.ClientSession);
        this.setParamSimple(map, prefix + "RunMode", this.RunMode);
        this.setParamSimple(map, prefix + "ApplicationParameters", this.ApplicationParameters);
        this.setParamSimple(map, prefix + "HostUserId", this.HostUserId);
        this.setParamSimple(map, prefix + "Role", this.Role);

    }
}

