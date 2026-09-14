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

public class CreateBatchInitOrganizationUrlRequest extends AbstractModel {

    /**
    * <p>应用相关信息。 此接口Agent.AppId 必填。</p>
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * <p>初始化操作类型<ul><li>CREATE_SEAL : 创建印章</li><li>OPEN_AUTO_SIGN :开通企业授权签署</li><li>PARTNER_AUTO_SIGN_AUTH :合作方企业或应用平台方授权“授权签”</li></ul></p>
    */
    @SerializedName("OperateTypes")
    @Expose
    private String [] OperateTypes;

    /**
    * <p>批量操作的企业列表在第三方平台的企业Id列表，即ProxyOrganizationOpenId列表,最大支持50个</p>
    */
    @SerializedName("ProxyOrganizationOpenIds")
    @Expose
    private String [] ProxyOrganizationOpenIds;

    /**
    * <p>当操作类型包含 PARTNER_AUTO_SIGN_AUTH 且是给应用平台方授权【授权签】时传true。<br><img src="https://qcloudimg.tencent-cloud.cn/raw/f9aba7c999a6d79ada20b4384520e120.png" alt="image"></p>
    */
    @SerializedName("IsAuthorizePlatformApplication")
    @Expose
    private Boolean IsAuthorizePlatformApplication;

    /**
    * <p>被授权的合作方企业在第三方平台子客企业标识，即ProxyOrganizationOpenId，当操作类型包含 PARTNER_AUTO_SIGN_AUTH 且要进行合作方企业授权【授权签】时必传。</p>
    */
    @SerializedName("AuthorizedProxyOrganizationOpenId")
    @Expose
    private String AuthorizedProxyOrganizationOpenId;

    /**
     * Get <p>应用相关信息。 此接口Agent.AppId 必填。</p> 
     * @return Agent <p>应用相关信息。 此接口Agent.AppId 必填。</p>
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set <p>应用相关信息。 此接口Agent.AppId 必填。</p>
     * @param Agent <p>应用相关信息。 此接口Agent.AppId 必填。</p>
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get <p>初始化操作类型<ul><li>CREATE_SEAL : 创建印章</li><li>OPEN_AUTO_SIGN :开通企业授权签署</li><li>PARTNER_AUTO_SIGN_AUTH :合作方企业或应用平台方授权“授权签”</li></ul></p> 
     * @return OperateTypes <p>初始化操作类型<ul><li>CREATE_SEAL : 创建印章</li><li>OPEN_AUTO_SIGN :开通企业授权签署</li><li>PARTNER_AUTO_SIGN_AUTH :合作方企业或应用平台方授权“授权签”</li></ul></p>
     */
    public String [] getOperateTypes() {
        return this.OperateTypes;
    }

    /**
     * Set <p>初始化操作类型<ul><li>CREATE_SEAL : 创建印章</li><li>OPEN_AUTO_SIGN :开通企业授权签署</li><li>PARTNER_AUTO_SIGN_AUTH :合作方企业或应用平台方授权“授权签”</li></ul></p>
     * @param OperateTypes <p>初始化操作类型<ul><li>CREATE_SEAL : 创建印章</li><li>OPEN_AUTO_SIGN :开通企业授权签署</li><li>PARTNER_AUTO_SIGN_AUTH :合作方企业或应用平台方授权“授权签”</li></ul></p>
     */
    public void setOperateTypes(String [] OperateTypes) {
        this.OperateTypes = OperateTypes;
    }

    /**
     * Get <p>批量操作的企业列表在第三方平台的企业Id列表，即ProxyOrganizationOpenId列表,最大支持50个</p> 
     * @return ProxyOrganizationOpenIds <p>批量操作的企业列表在第三方平台的企业Id列表，即ProxyOrganizationOpenId列表,最大支持50个</p>
     */
    public String [] getProxyOrganizationOpenIds() {
        return this.ProxyOrganizationOpenIds;
    }

    /**
     * Set <p>批量操作的企业列表在第三方平台的企业Id列表，即ProxyOrganizationOpenId列表,最大支持50个</p>
     * @param ProxyOrganizationOpenIds <p>批量操作的企业列表在第三方平台的企业Id列表，即ProxyOrganizationOpenId列表,最大支持50个</p>
     */
    public void setProxyOrganizationOpenIds(String [] ProxyOrganizationOpenIds) {
        this.ProxyOrganizationOpenIds = ProxyOrganizationOpenIds;
    }

    /**
     * Get <p>当操作类型包含 PARTNER_AUTO_SIGN_AUTH 且是给应用平台方授权【授权签】时传true。<br><img src="https://qcloudimg.tencent-cloud.cn/raw/f9aba7c999a6d79ada20b4384520e120.png" alt="image"></p> 
     * @return IsAuthorizePlatformApplication <p>当操作类型包含 PARTNER_AUTO_SIGN_AUTH 且是给应用平台方授权【授权签】时传true。<br><img src="https://qcloudimg.tencent-cloud.cn/raw/f9aba7c999a6d79ada20b4384520e120.png" alt="image"></p>
     */
    public Boolean getIsAuthorizePlatformApplication() {
        return this.IsAuthorizePlatformApplication;
    }

    /**
     * Set <p>当操作类型包含 PARTNER_AUTO_SIGN_AUTH 且是给应用平台方授权【授权签】时传true。<br><img src="https://qcloudimg.tencent-cloud.cn/raw/f9aba7c999a6d79ada20b4384520e120.png" alt="image"></p>
     * @param IsAuthorizePlatformApplication <p>当操作类型包含 PARTNER_AUTO_SIGN_AUTH 且是给应用平台方授权【授权签】时传true。<br><img src="https://qcloudimg.tencent-cloud.cn/raw/f9aba7c999a6d79ada20b4384520e120.png" alt="image"></p>
     */
    public void setIsAuthorizePlatformApplication(Boolean IsAuthorizePlatformApplication) {
        this.IsAuthorizePlatformApplication = IsAuthorizePlatformApplication;
    }

    /**
     * Get <p>被授权的合作方企业在第三方平台子客企业标识，即ProxyOrganizationOpenId，当操作类型包含 PARTNER_AUTO_SIGN_AUTH 且要进行合作方企业授权【授权签】时必传。</p> 
     * @return AuthorizedProxyOrganizationOpenId <p>被授权的合作方企业在第三方平台子客企业标识，即ProxyOrganizationOpenId，当操作类型包含 PARTNER_AUTO_SIGN_AUTH 且要进行合作方企业授权【授权签】时必传。</p>
     */
    public String getAuthorizedProxyOrganizationOpenId() {
        return this.AuthorizedProxyOrganizationOpenId;
    }

    /**
     * Set <p>被授权的合作方企业在第三方平台子客企业标识，即ProxyOrganizationOpenId，当操作类型包含 PARTNER_AUTO_SIGN_AUTH 且要进行合作方企业授权【授权签】时必传。</p>
     * @param AuthorizedProxyOrganizationOpenId <p>被授权的合作方企业在第三方平台子客企业标识，即ProxyOrganizationOpenId，当操作类型包含 PARTNER_AUTO_SIGN_AUTH 且要进行合作方企业授权【授权签】时必传。</p>
     */
    public void setAuthorizedProxyOrganizationOpenId(String AuthorizedProxyOrganizationOpenId) {
        this.AuthorizedProxyOrganizationOpenId = AuthorizedProxyOrganizationOpenId;
    }

    public CreateBatchInitOrganizationUrlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBatchInitOrganizationUrlRequest(CreateBatchInitOrganizationUrlRequest source) {
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.OperateTypes != null) {
            this.OperateTypes = new String[source.OperateTypes.length];
            for (int i = 0; i < source.OperateTypes.length; i++) {
                this.OperateTypes[i] = new String(source.OperateTypes[i]);
            }
        }
        if (source.ProxyOrganizationOpenIds != null) {
            this.ProxyOrganizationOpenIds = new String[source.ProxyOrganizationOpenIds.length];
            for (int i = 0; i < source.ProxyOrganizationOpenIds.length; i++) {
                this.ProxyOrganizationOpenIds[i] = new String(source.ProxyOrganizationOpenIds[i]);
            }
        }
        if (source.IsAuthorizePlatformApplication != null) {
            this.IsAuthorizePlatformApplication = new Boolean(source.IsAuthorizePlatformApplication);
        }
        if (source.AuthorizedProxyOrganizationOpenId != null) {
            this.AuthorizedProxyOrganizationOpenId = new String(source.AuthorizedProxyOrganizationOpenId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamArraySimple(map, prefix + "OperateTypes.", this.OperateTypes);
        this.setParamArraySimple(map, prefix + "ProxyOrganizationOpenIds.", this.ProxyOrganizationOpenIds);
        this.setParamSimple(map, prefix + "IsAuthorizePlatformApplication", this.IsAuthorizePlatformApplication);
        this.setParamSimple(map, prefix + "AuthorizedProxyOrganizationOpenId", this.AuthorizedProxyOrganizationOpenId);

    }
}

