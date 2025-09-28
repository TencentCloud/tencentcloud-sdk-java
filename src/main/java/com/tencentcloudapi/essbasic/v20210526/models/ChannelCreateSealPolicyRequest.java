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

public class ChannelCreateSealPolicyRequest extends AbstractModel {

    /**
    * 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。

此接口下面信息必填。

渠道应用标识: Agent.AppId
第三方平台子客企业标识: Agent.ProxyOrganizationOpenId
第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId
第三方平台子客企业和员工必须已经经过实名认证。
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 电子印章ID，为32位字符串。
建议开发者保留此印章ID，后续指定签署区印章或者操作印章需此印章ID。
可登录腾讯电子签控制台，在 "印章"->"印章中心"选择查看的印章，在"印章详情" 中查看某个印章的SealId(在页面中展示为印章ID)。
    */
    @SerializedName("SealId")
    @Expose
    private String SealId;

    /**
    * 
员工在腾讯电子签平台的唯一身份标识，为32位字符串。
可登录腾讯电子签控制台，在 "更多能力"->"组织管理" 中查看某位员工的UserId(在页面中展示为用户ID)。
员工在贵司业务系统中的唯一身份标识，用于与腾讯电子签账号进行映射，确保在同一企业内不会出现重复。
该标识最大长度为64位字符串，仅支持包含26个英文字母和数字0-9的字符。
指定待授权的用户ID数组,电子签的用户ID
可以填写OpenId，系统会通过组织+渠道+OpenId查询得到UserId进行授权。
    */
    @SerializedName("UserIds")
    @Expose
    private String [] UserIds;

    /**
    * 操作人（用户）信息，不用传
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 企业机构信息，不用传
    */
    @SerializedName("Organization")
    @Expose
    private OrganizationInfo Organization;

    /**
    * 个性化配置字段，默认不传。
    */
    @SerializedName("Options")
    @Expose
    private Option [] Options;

    /**
     * Get 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。

此接口下面信息必填。

渠道应用标识: Agent.AppId
第三方平台子客企业标识: Agent.ProxyOrganizationOpenId
第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId
第三方平台子客企业和员工必须已经经过实名认证。 
     * @return Agent 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。

此接口下面信息必填。

渠道应用标识: Agent.AppId
第三方平台子客企业标识: Agent.ProxyOrganizationOpenId
第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId
第三方平台子客企业和员工必须已经经过实名认证。
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。

此接口下面信息必填。

渠道应用标识: Agent.AppId
第三方平台子客企业标识: Agent.ProxyOrganizationOpenId
第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId
第三方平台子客企业和员工必须已经经过实名认证。
     * @param Agent 关于渠道应用的相关信息，包括渠道应用标识、第三方平台子客企业标识及第三方平台子客企业中的员工标识等内容，您可以参阅开发者中心所提供的 Agent 结构体以获取详细定义。

此接口下面信息必填。

渠道应用标识: Agent.AppId
第三方平台子客企业标识: Agent.ProxyOrganizationOpenId
第三方平台子客企业中的员工标识: Agent. ProxyOperator.OpenId
第三方平台子客企业和员工必须已经经过实名认证。
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 电子印章ID，为32位字符串。
建议开发者保留此印章ID，后续指定签署区印章或者操作印章需此印章ID。
可登录腾讯电子签控制台，在 "印章"->"印章中心"选择查看的印章，在"印章详情" 中查看某个印章的SealId(在页面中展示为印章ID)。 
     * @return SealId 电子印章ID，为32位字符串。
建议开发者保留此印章ID，后续指定签署区印章或者操作印章需此印章ID。
可登录腾讯电子签控制台，在 "印章"->"印章中心"选择查看的印章，在"印章详情" 中查看某个印章的SealId(在页面中展示为印章ID)。
     */
    public String getSealId() {
        return this.SealId;
    }

    /**
     * Set 电子印章ID，为32位字符串。
建议开发者保留此印章ID，后续指定签署区印章或者操作印章需此印章ID。
可登录腾讯电子签控制台，在 "印章"->"印章中心"选择查看的印章，在"印章详情" 中查看某个印章的SealId(在页面中展示为印章ID)。
     * @param SealId 电子印章ID，为32位字符串。
建议开发者保留此印章ID，后续指定签署区印章或者操作印章需此印章ID。
可登录腾讯电子签控制台，在 "印章"->"印章中心"选择查看的印章，在"印章详情" 中查看某个印章的SealId(在页面中展示为印章ID)。
     */
    public void setSealId(String SealId) {
        this.SealId = SealId;
    }

    /**
     * Get 
员工在腾讯电子签平台的唯一身份标识，为32位字符串。
可登录腾讯电子签控制台，在 "更多能力"->"组织管理" 中查看某位员工的UserId(在页面中展示为用户ID)。
员工在贵司业务系统中的唯一身份标识，用于与腾讯电子签账号进行映射，确保在同一企业内不会出现重复。
该标识最大长度为64位字符串，仅支持包含26个英文字母和数字0-9的字符。
指定待授权的用户ID数组,电子签的用户ID
可以填写OpenId，系统会通过组织+渠道+OpenId查询得到UserId进行授权。 
     * @return UserIds 
员工在腾讯电子签平台的唯一身份标识，为32位字符串。
可登录腾讯电子签控制台，在 "更多能力"->"组织管理" 中查看某位员工的UserId(在页面中展示为用户ID)。
员工在贵司业务系统中的唯一身份标识，用于与腾讯电子签账号进行映射，确保在同一企业内不会出现重复。
该标识最大长度为64位字符串，仅支持包含26个英文字母和数字0-9的字符。
指定待授权的用户ID数组,电子签的用户ID
可以填写OpenId，系统会通过组织+渠道+OpenId查询得到UserId进行授权。
     */
    public String [] getUserIds() {
        return this.UserIds;
    }

    /**
     * Set 
员工在腾讯电子签平台的唯一身份标识，为32位字符串。
可登录腾讯电子签控制台，在 "更多能力"->"组织管理" 中查看某位员工的UserId(在页面中展示为用户ID)。
员工在贵司业务系统中的唯一身份标识，用于与腾讯电子签账号进行映射，确保在同一企业内不会出现重复。
该标识最大长度为64位字符串，仅支持包含26个英文字母和数字0-9的字符。
指定待授权的用户ID数组,电子签的用户ID
可以填写OpenId，系统会通过组织+渠道+OpenId查询得到UserId进行授权。
     * @param UserIds 
员工在腾讯电子签平台的唯一身份标识，为32位字符串。
可登录腾讯电子签控制台，在 "更多能力"->"组织管理" 中查看某位员工的UserId(在页面中展示为用户ID)。
员工在贵司业务系统中的唯一身份标识，用于与腾讯电子签账号进行映射，确保在同一企业内不会出现重复。
该标识最大长度为64位字符串，仅支持包含26个英文字母和数字0-9的字符。
指定待授权的用户ID数组,电子签的用户ID
可以填写OpenId，系统会通过组织+渠道+OpenId查询得到UserId进行授权。
     */
    public void setUserIds(String [] UserIds) {
        this.UserIds = UserIds;
    }

    /**
     * Get 操作人（用户）信息，不用传 
     * @return Operator 操作人（用户）信息，不用传
     * @deprecated
     */
    @Deprecated
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作人（用户）信息，不用传
     * @param Operator 操作人（用户）信息，不用传
     * @deprecated
     */
    @Deprecated
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 企业机构信息，不用传 
     * @return Organization 企业机构信息，不用传
     * @deprecated
     */
    @Deprecated
    public OrganizationInfo getOrganization() {
        return this.Organization;
    }

    /**
     * Set 企业机构信息，不用传
     * @param Organization 企业机构信息，不用传
     * @deprecated
     */
    @Deprecated
    public void setOrganization(OrganizationInfo Organization) {
        this.Organization = Organization;
    }

    /**
     * Get 个性化配置字段，默认不传。 
     * @return Options 个性化配置字段，默认不传。
     */
    public Option [] getOptions() {
        return this.Options;
    }

    /**
     * Set 个性化配置字段，默认不传。
     * @param Options 个性化配置字段，默认不传。
     */
    public void setOptions(Option [] Options) {
        this.Options = Options;
    }

    public ChannelCreateSealPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChannelCreateSealPolicyRequest(ChannelCreateSealPolicyRequest source) {
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.SealId != null) {
            this.SealId = new String(source.SealId);
        }
        if (source.UserIds != null) {
            this.UserIds = new String[source.UserIds.length];
            for (int i = 0; i < source.UserIds.length; i++) {
                this.UserIds[i] = new String(source.UserIds[i]);
            }
        }
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.Organization != null) {
            this.Organization = new OrganizationInfo(source.Organization);
        }
        if (source.Options != null) {
            this.Options = new Option[source.Options.length];
            for (int i = 0; i < source.Options.length; i++) {
                this.Options[i] = new Option(source.Options[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "SealId", this.SealId);
        this.setParamArraySimple(map, prefix + "UserIds.", this.UserIds);
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamObj(map, prefix + "Organization.", this.Organization);
        this.setParamArrayObj(map, prefix + "Options.", this.Options);

    }
}

