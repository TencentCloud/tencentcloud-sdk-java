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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteOrganizationAuthorizationsRequest extends AbstractModel {

    /**
    * 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。

此接口下面信息必填。
<ul>
<li>渠道应用标识:  Agent.AppId</li>
</ul>

    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 认证人姓名，组织机构超管姓名。 在注册流程中，必须是超管本人进行操作。 
    */
    @SerializedName("AdminName")
    @Expose
    private String AdminName;

    /**
    * 认证人手机号，组织机构超管手机号。 在注册流程中，必须是超管本人进行操作。 
    */
    @SerializedName("AdminMobile")
    @Expose
    private String AdminMobile;

    /**
     * Get 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。

此接口下面信息必填。
<ul>
<li>渠道应用标识:  Agent.AppId</li>
</ul>
 
     * @return Agent 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。

此接口下面信息必填。
<ul>
<li>渠道应用标识:  Agent.AppId</li>
</ul>

     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。

此接口下面信息必填。
<ul>
<li>渠道应用标识:  Agent.AppId</li>
</ul>

     * @param Agent 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。

此接口下面信息必填。
<ul>
<li>渠道应用标识:  Agent.AppId</li>
</ul>

     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 认证人姓名，组织机构超管姓名。 在注册流程中，必须是超管本人进行操作。  
     * @return AdminName 认证人姓名，组织机构超管姓名。 在注册流程中，必须是超管本人进行操作。 
     */
    public String getAdminName() {
        return this.AdminName;
    }

    /**
     * Set 认证人姓名，组织机构超管姓名。 在注册流程中，必须是超管本人进行操作。 
     * @param AdminName 认证人姓名，组织机构超管姓名。 在注册流程中，必须是超管本人进行操作。 
     */
    public void setAdminName(String AdminName) {
        this.AdminName = AdminName;
    }

    /**
     * Get 认证人手机号，组织机构超管手机号。 在注册流程中，必须是超管本人进行操作。  
     * @return AdminMobile 认证人手机号，组织机构超管手机号。 在注册流程中，必须是超管本人进行操作。 
     */
    public String getAdminMobile() {
        return this.AdminMobile;
    }

    /**
     * Set 认证人手机号，组织机构超管手机号。 在注册流程中，必须是超管本人进行操作。 
     * @param AdminMobile 认证人手机号，组织机构超管手机号。 在注册流程中，必须是超管本人进行操作。 
     */
    public void setAdminMobile(String AdminMobile) {
        this.AdminMobile = AdminMobile;
    }

    public DeleteOrganizationAuthorizationsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteOrganizationAuthorizationsRequest(DeleteOrganizationAuthorizationsRequest source) {
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.AdminName != null) {
            this.AdminName = new String(source.AdminName);
        }
        if (source.AdminMobile != null) {
            this.AdminMobile = new String(source.AdminMobile);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "AdminName", this.AdminName);
        this.setParamSimple(map, prefix + "AdminMobile", this.AdminMobile);

    }
}

