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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DisableUserAutoSignRequest extends AbstractModel{

    /**
    * 操作人信息,UserId必填
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 自动签场景:
E_PRESCRIPTION_AUTO_SIGN 电子处方
    */
    @SerializedName("SceneKey")
    @Expose
    private String SceneKey;

    /**
    * 关闭自动签的个人的三要素
    */
    @SerializedName("UserInfo")
    @Expose
    private UserThreeFactor UserInfo;

    /**
    * 代理相关应用信息，如集团主企业代子企业操作的场景中ProxyOrganizationId必填
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
     * Get 操作人信息,UserId必填 
     * @return Operator 操作人信息,UserId必填
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作人信息,UserId必填
     * @param Operator 操作人信息,UserId必填
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 自动签场景:
E_PRESCRIPTION_AUTO_SIGN 电子处方 
     * @return SceneKey 自动签场景:
E_PRESCRIPTION_AUTO_SIGN 电子处方
     */
    public String getSceneKey() {
        return this.SceneKey;
    }

    /**
     * Set 自动签场景:
E_PRESCRIPTION_AUTO_SIGN 电子处方
     * @param SceneKey 自动签场景:
E_PRESCRIPTION_AUTO_SIGN 电子处方
     */
    public void setSceneKey(String SceneKey) {
        this.SceneKey = SceneKey;
    }

    /**
     * Get 关闭自动签的个人的三要素 
     * @return UserInfo 关闭自动签的个人的三要素
     */
    public UserThreeFactor getUserInfo() {
        return this.UserInfo;
    }

    /**
     * Set 关闭自动签的个人的三要素
     * @param UserInfo 关闭自动签的个人的三要素
     */
    public void setUserInfo(UserThreeFactor UserInfo) {
        this.UserInfo = UserInfo;
    }

    /**
     * Get 代理相关应用信息，如集团主企业代子企业操作的场景中ProxyOrganizationId必填 
     * @return Agent 代理相关应用信息，如集团主企业代子企业操作的场景中ProxyOrganizationId必填
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 代理相关应用信息，如集团主企业代子企业操作的场景中ProxyOrganizationId必填
     * @param Agent 代理相关应用信息，如集团主企业代子企业操作的场景中ProxyOrganizationId必填
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    public DisableUserAutoSignRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DisableUserAutoSignRequest(DisableUserAutoSignRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.SceneKey != null) {
            this.SceneKey = new String(source.SceneKey);
        }
        if (source.UserInfo != null) {
            this.UserInfo = new UserThreeFactor(source.UserInfo);
        }
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "SceneKey", this.SceneKey);
        this.setParamObj(map, prefix + "UserInfo.", this.UserInfo);
        this.setParamObj(map, prefix + "Agent.", this.Agent);

    }
}

