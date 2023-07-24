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

public class BindEmployeeUserIdWithClientOpenIdRequest extends AbstractModel{

    /**
    * 用户信息，OpenId与UserId二选一必填一个，OpenId是第三方客户ID，userId是用户实名后的电子签生成的ID,当传入客户系统openId，传入的openId需与电子签员工userId绑定，且参数Channel必填，Channel值为INTEGRATE；当传入参数UserId，Channel无需指定。（参数参考示例）
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 电子签系统员工UserId
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 客户系统OpenId
    */
    @SerializedName("OpenId")
    @Expose
    private String OpenId;

    /**
    * 代理相关应用信息，如集团主企业代子企业操作的场景中ProxyOrganizationId必填
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
     * Get 用户信息，OpenId与UserId二选一必填一个，OpenId是第三方客户ID，userId是用户实名后的电子签生成的ID,当传入客户系统openId，传入的openId需与电子签员工userId绑定，且参数Channel必填，Channel值为INTEGRATE；当传入参数UserId，Channel无需指定。（参数参考示例） 
     * @return Operator 用户信息，OpenId与UserId二选一必填一个，OpenId是第三方客户ID，userId是用户实名后的电子签生成的ID,当传入客户系统openId，传入的openId需与电子签员工userId绑定，且参数Channel必填，Channel值为INTEGRATE；当传入参数UserId，Channel无需指定。（参数参考示例）
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 用户信息，OpenId与UserId二选一必填一个，OpenId是第三方客户ID，userId是用户实名后的电子签生成的ID,当传入客户系统openId，传入的openId需与电子签员工userId绑定，且参数Channel必填，Channel值为INTEGRATE；当传入参数UserId，Channel无需指定。（参数参考示例）
     * @param Operator 用户信息，OpenId与UserId二选一必填一个，OpenId是第三方客户ID，userId是用户实名后的电子签生成的ID,当传入客户系统openId，传入的openId需与电子签员工userId绑定，且参数Channel必填，Channel值为INTEGRATE；当传入参数UserId，Channel无需指定。（参数参考示例）
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 电子签系统员工UserId 
     * @return UserId 电子签系统员工UserId
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 电子签系统员工UserId
     * @param UserId 电子签系统员工UserId
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 客户系统OpenId 
     * @return OpenId 客户系统OpenId
     */
    public String getOpenId() {
        return this.OpenId;
    }

    /**
     * Set 客户系统OpenId
     * @param OpenId 客户系统OpenId
     */
    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
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

    public BindEmployeeUserIdWithClientOpenIdRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindEmployeeUserIdWithClientOpenIdRequest(BindEmployeeUserIdWithClientOpenIdRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.OpenId != null) {
            this.OpenId = new String(source.OpenId);
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
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "OpenId", this.OpenId);
        this.setParamObj(map, prefix + "Agent.", this.Agent);

    }
}

