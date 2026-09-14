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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChannelDescribeUserAutoSignStatusRequest extends AbstractModel {

    /**
    * <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p>
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * <p>授权签使用的场景值, 可以选择的场景值如下:</p><p>枚举值：</p><ul><li>E_PRESCRIPTION_AUTO_SIGN： 电子处方场景</li><li>OTHER： 通用场景</li></ul>
    */
    @SerializedName("SceneKey")
    @Expose
    private String SceneKey;

    /**
    * <p>要查询状态的用户信息, 包括名字,身份证等</p>
    */
    @SerializedName("UserInfo")
    @Expose
    private UserThreeFactor UserInfo;

    /**
    * <p>执行本接口操作的员工信息。<br>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p>
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
     * Get <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p> 
     * @return Agent <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p>
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p>
     * @param Agent <p>关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。</p>
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get <p>授权签使用的场景值, 可以选择的场景值如下:</p><p>枚举值：</p><ul><li>E_PRESCRIPTION_AUTO_SIGN： 电子处方场景</li><li>OTHER： 通用场景</li></ul> 
     * @return SceneKey <p>授权签使用的场景值, 可以选择的场景值如下:</p><p>枚举值：</p><ul><li>E_PRESCRIPTION_AUTO_SIGN： 电子处方场景</li><li>OTHER： 通用场景</li></ul>
     */
    public String getSceneKey() {
        return this.SceneKey;
    }

    /**
     * Set <p>授权签使用的场景值, 可以选择的场景值如下:</p><p>枚举值：</p><ul><li>E_PRESCRIPTION_AUTO_SIGN： 电子处方场景</li><li>OTHER： 通用场景</li></ul>
     * @param SceneKey <p>授权签使用的场景值, 可以选择的场景值如下:</p><p>枚举值：</p><ul><li>E_PRESCRIPTION_AUTO_SIGN： 电子处方场景</li><li>OTHER： 通用场景</li></ul>
     */
    public void setSceneKey(String SceneKey) {
        this.SceneKey = SceneKey;
    }

    /**
     * Get <p>要查询状态的用户信息, 包括名字,身份证等</p> 
     * @return UserInfo <p>要查询状态的用户信息, 包括名字,身份证等</p>
     */
    public UserThreeFactor getUserInfo() {
        return this.UserInfo;
    }

    /**
     * Set <p>要查询状态的用户信息, 包括名字,身份证等</p>
     * @param UserInfo <p>要查询状态的用户信息, 包括名字,身份证等</p>
     */
    public void setUserInfo(UserThreeFactor UserInfo) {
        this.UserInfo = UserInfo;
    }

    /**
     * Get <p>执行本接口操作的员工信息。<br>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p> 
     * @return Operator <p>执行本接口操作的员工信息。<br>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p>
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set <p>执行本接口操作的员工信息。<br>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p>
     * @param Operator <p>执行本接口操作的员工信息。<br>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p>
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    public ChannelDescribeUserAutoSignStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChannelDescribeUserAutoSignStatusRequest(ChannelDescribeUserAutoSignStatusRequest source) {
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.SceneKey != null) {
            this.SceneKey = new String(source.SceneKey);
        }
        if (source.UserInfo != null) {
            this.UserInfo = new UserThreeFactor(source.UserInfo);
        }
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "SceneKey", this.SceneKey);
        this.setParamObj(map, prefix + "UserInfo.", this.UserInfo);
        this.setParamObj(map, prefix + "Operator.", this.Operator);

    }
}

