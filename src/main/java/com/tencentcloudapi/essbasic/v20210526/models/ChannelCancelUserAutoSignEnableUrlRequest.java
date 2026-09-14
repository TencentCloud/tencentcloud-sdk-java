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

public class ChannelCancelUserAutoSignEnableUrlRequest extends AbstractModel {

    /**
    * <p>渠道应用相关信息</p>
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * <p>操作人信息</p>
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * <p>授权签使用的场景值, 可以选择的场景值如下:</p><p>枚举值：</p><ul><li>E_PRESCRIPTION_AUTO_SIGN： 电子处方场景</li><li>OTHER： 通用场景</li></ul>
    */
    @SerializedName("SceneKey")
    @Expose
    private String SceneKey;

    /**
    * <p>指定撤销链接的用户信息，包含姓名、证件类型、证件号码。</p>
    */
    @SerializedName("UserInfo")
    @Expose
    private UserThreeFactor UserInfo;

    /**
     * Get <p>渠道应用相关信息</p> 
     * @return Agent <p>渠道应用相关信息</p>
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set <p>渠道应用相关信息</p>
     * @param Agent <p>渠道应用相关信息</p>
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get <p>操作人信息</p> 
     * @return Operator <p>操作人信息</p>
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set <p>操作人信息</p>
     * @param Operator <p>操作人信息</p>
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
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
     * Get <p>指定撤销链接的用户信息，包含姓名、证件类型、证件号码。</p> 
     * @return UserInfo <p>指定撤销链接的用户信息，包含姓名、证件类型、证件号码。</p>
     */
    public UserThreeFactor getUserInfo() {
        return this.UserInfo;
    }

    /**
     * Set <p>指定撤销链接的用户信息，包含姓名、证件类型、证件号码。</p>
     * @param UserInfo <p>指定撤销链接的用户信息，包含姓名、证件类型、证件号码。</p>
     */
    public void setUserInfo(UserThreeFactor UserInfo) {
        this.UserInfo = UserInfo;
    }

    public ChannelCancelUserAutoSignEnableUrlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChannelCancelUserAutoSignEnableUrlRequest(ChannelCancelUserAutoSignEnableUrlRequest source) {
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.SceneKey != null) {
            this.SceneKey = new String(source.SceneKey);
        }
        if (source.UserInfo != null) {
            this.UserInfo = new UserThreeFactor(source.UserInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "SceneKey", this.SceneKey);
        this.setParamObj(map, prefix + "UserInfo.", this.UserInfo);

    }
}

