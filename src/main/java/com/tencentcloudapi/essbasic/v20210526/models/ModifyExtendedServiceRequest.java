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

public class ModifyExtendedServiceRequest extends AbstractModel {

    /**
    * 应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 必填。

注: 此接口 参数Agent. ProxyOperator.OpenId 需要传递超管或者法人的OpenId
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    *   扩展服务类型
<ul>
  <li>AUTO_SIGN             企业自动签（自动签署）</li>
<li>  OVERSEA_SIGN          企业与港澳台居民*签署合同</li>
<li>  MOBILE_CHECK_APPROVER 使用手机号验证签署方身份</li>
 <li> PAGING_SEAL           骑缝章</li>
 <li> DOWNLOAD_FLOW         授权渠道下载合同 </li>
<li>AGE_LIMIT_EXPANSION 拓宽签署方年龄限制</li>
</ul>
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
    * 操作类型 
OPEN:开通 
CLOSE:关闭
    */
    @SerializedName("Operate")
    @Expose
    private String Operate;

    /**
    * 链接跳转类型，支持以下类型
<ul><li>WEIXINAPP : 短链直接跳转到电子签小程序  (默认值)</li>
<li>APP : 第三方APP或小程序跳转电子签小程序</li></ul>
    */
    @SerializedName("Endpoint")
    @Expose
    private String Endpoint;

    /**
     * Get 应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 必填。

注: 此接口 参数Agent. ProxyOperator.OpenId 需要传递超管或者法人的OpenId 
     * @return Agent 应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 必填。

注: 此接口 参数Agent. ProxyOperator.OpenId 需要传递超管或者法人的OpenId
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 必填。

注: 此接口 参数Agent. ProxyOperator.OpenId 需要传递超管或者法人的OpenId
     * @param Agent 应用相关信息。 此接口Agent.ProxyOrganizationOpenId、Agent. ProxyOperator.OpenId、Agent.AppId 必填。

注: 此接口 参数Agent. ProxyOperator.OpenId 需要传递超管或者法人的OpenId
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get   扩展服务类型
<ul>
  <li>AUTO_SIGN             企业自动签（自动签署）</li>
<li>  OVERSEA_SIGN          企业与港澳台居民*签署合同</li>
<li>  MOBILE_CHECK_APPROVER 使用手机号验证签署方身份</li>
 <li> PAGING_SEAL           骑缝章</li>
 <li> DOWNLOAD_FLOW         授权渠道下载合同 </li>
<li>AGE_LIMIT_EXPANSION 拓宽签署方年龄限制</li>
</ul> 
     * @return ServiceType   扩展服务类型
<ul>
  <li>AUTO_SIGN             企业自动签（自动签署）</li>
<li>  OVERSEA_SIGN          企业与港澳台居民*签署合同</li>
<li>  MOBILE_CHECK_APPROVER 使用手机号验证签署方身份</li>
 <li> PAGING_SEAL           骑缝章</li>
 <li> DOWNLOAD_FLOW         授权渠道下载合同 </li>
<li>AGE_LIMIT_EXPANSION 拓宽签署方年龄限制</li>
</ul>
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set   扩展服务类型
<ul>
  <li>AUTO_SIGN             企业自动签（自动签署）</li>
<li>  OVERSEA_SIGN          企业与港澳台居民*签署合同</li>
<li>  MOBILE_CHECK_APPROVER 使用手机号验证签署方身份</li>
 <li> PAGING_SEAL           骑缝章</li>
 <li> DOWNLOAD_FLOW         授权渠道下载合同 </li>
<li>AGE_LIMIT_EXPANSION 拓宽签署方年龄限制</li>
</ul>
     * @param ServiceType   扩展服务类型
<ul>
  <li>AUTO_SIGN             企业自动签（自动签署）</li>
<li>  OVERSEA_SIGN          企业与港澳台居民*签署合同</li>
<li>  MOBILE_CHECK_APPROVER 使用手机号验证签署方身份</li>
 <li> PAGING_SEAL           骑缝章</li>
 <li> DOWNLOAD_FLOW         授权渠道下载合同 </li>
<li>AGE_LIMIT_EXPANSION 拓宽签署方年龄限制</li>
</ul>
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * Get 操作类型 
OPEN:开通 
CLOSE:关闭 
     * @return Operate 操作类型 
OPEN:开通 
CLOSE:关闭
     */
    public String getOperate() {
        return this.Operate;
    }

    /**
     * Set 操作类型 
OPEN:开通 
CLOSE:关闭
     * @param Operate 操作类型 
OPEN:开通 
CLOSE:关闭
     */
    public void setOperate(String Operate) {
        this.Operate = Operate;
    }

    /**
     * Get 链接跳转类型，支持以下类型
<ul><li>WEIXINAPP : 短链直接跳转到电子签小程序  (默认值)</li>
<li>APP : 第三方APP或小程序跳转电子签小程序</li></ul> 
     * @return Endpoint 链接跳转类型，支持以下类型
<ul><li>WEIXINAPP : 短链直接跳转到电子签小程序  (默认值)</li>
<li>APP : 第三方APP或小程序跳转电子签小程序</li></ul>
     */
    public String getEndpoint() {
        return this.Endpoint;
    }

    /**
     * Set 链接跳转类型，支持以下类型
<ul><li>WEIXINAPP : 短链直接跳转到电子签小程序  (默认值)</li>
<li>APP : 第三方APP或小程序跳转电子签小程序</li></ul>
     * @param Endpoint 链接跳转类型，支持以下类型
<ul><li>WEIXINAPP : 短链直接跳转到电子签小程序  (默认值)</li>
<li>APP : 第三方APP或小程序跳转电子签小程序</li></ul>
     */
    public void setEndpoint(String Endpoint) {
        this.Endpoint = Endpoint;
    }

    public ModifyExtendedServiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyExtendedServiceRequest(ModifyExtendedServiceRequest source) {
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.ServiceType != null) {
            this.ServiceType = new String(source.ServiceType);
        }
        if (source.Operate != null) {
            this.Operate = new String(source.Operate);
        }
        if (source.Endpoint != null) {
            this.Endpoint = new String(source.Endpoint);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);
        this.setParamSimple(map, prefix + "Operate", this.Operate);
        this.setParamSimple(map, prefix + "Endpoint", this.Endpoint);

    }
}

