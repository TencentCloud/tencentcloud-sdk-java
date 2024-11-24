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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateBatchInitOrganizationUrlRequest extends AbstractModel {

    /**
    * 执行本接口操作的员工信息。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 初始化操作类型
<ul>
<li>CREATE_SEAL : 创建印章</li>
<li>AUTH_JOIN_ORGANIZATION_GROUP : 加入集团企业</li>
<li>OPEN_AUTO_SIGN :开通企业自动签署</li>
<li>PARTNER_AUTO_SIGN_AUTH :合作方企业授权自动签</li>
</ul>
    */
    @SerializedName("OperateTypes")
    @Expose
    private String [] OperateTypes;

    /**
    * 批量操作的企业Id列表，最大支持50个
    */
    @SerializedName("OrganizationIds")
    @Expose
    private String [] OrganizationIds;

    /**
    * 代理相关应用信息，如集团主企业代子企业操作的场景中ProxyOrganizationId必填
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 被授权的合作方企业在电子签的企业电子签账号，当操作类型包含 PARTNER_AUTO_SIGN_AUTH （合作方企业授权自动签）时必传。

企业电子签账号可在[电子签的网页端](https://qian.tencent.com/console/company-settings/company-center) ，于企业设置-企业信息菜单栏下复制获取。

![企业电子签账号](https://qcloudimg.tencent-cloud.cn/raw/4e6b30ee92f00671f7f1c5bd127c27db.png)
    */
    @SerializedName("AuthorizedOrganizationId")
    @Expose
    private String AuthorizedOrganizationId;

    /**
     * Get 执行本接口操作的员工信息。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。` 
     * @return Operator 执行本接口操作的员工信息。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 执行本接口操作的员工信息。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
     * @param Operator 执行本接口操作的员工信息。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 初始化操作类型
<ul>
<li>CREATE_SEAL : 创建印章</li>
<li>AUTH_JOIN_ORGANIZATION_GROUP : 加入集团企业</li>
<li>OPEN_AUTO_SIGN :开通企业自动签署</li>
<li>PARTNER_AUTO_SIGN_AUTH :合作方企业授权自动签</li>
</ul> 
     * @return OperateTypes 初始化操作类型
<ul>
<li>CREATE_SEAL : 创建印章</li>
<li>AUTH_JOIN_ORGANIZATION_GROUP : 加入集团企业</li>
<li>OPEN_AUTO_SIGN :开通企业自动签署</li>
<li>PARTNER_AUTO_SIGN_AUTH :合作方企业授权自动签</li>
</ul>
     */
    public String [] getOperateTypes() {
        return this.OperateTypes;
    }

    /**
     * Set 初始化操作类型
<ul>
<li>CREATE_SEAL : 创建印章</li>
<li>AUTH_JOIN_ORGANIZATION_GROUP : 加入集团企业</li>
<li>OPEN_AUTO_SIGN :开通企业自动签署</li>
<li>PARTNER_AUTO_SIGN_AUTH :合作方企业授权自动签</li>
</ul>
     * @param OperateTypes 初始化操作类型
<ul>
<li>CREATE_SEAL : 创建印章</li>
<li>AUTH_JOIN_ORGANIZATION_GROUP : 加入集团企业</li>
<li>OPEN_AUTO_SIGN :开通企业自动签署</li>
<li>PARTNER_AUTO_SIGN_AUTH :合作方企业授权自动签</li>
</ul>
     */
    public void setOperateTypes(String [] OperateTypes) {
        this.OperateTypes = OperateTypes;
    }

    /**
     * Get 批量操作的企业Id列表，最大支持50个 
     * @return OrganizationIds 批量操作的企业Id列表，最大支持50个
     */
    public String [] getOrganizationIds() {
        return this.OrganizationIds;
    }

    /**
     * Set 批量操作的企业Id列表，最大支持50个
     * @param OrganizationIds 批量操作的企业Id列表，最大支持50个
     */
    public void setOrganizationIds(String [] OrganizationIds) {
        this.OrganizationIds = OrganizationIds;
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

    /**
     * Get 被授权的合作方企业在电子签的企业电子签账号，当操作类型包含 PARTNER_AUTO_SIGN_AUTH （合作方企业授权自动签）时必传。

企业电子签账号可在[电子签的网页端](https://qian.tencent.com/console/company-settings/company-center) ，于企业设置-企业信息菜单栏下复制获取。

![企业电子签账号](https://qcloudimg.tencent-cloud.cn/raw/4e6b30ee92f00671f7f1c5bd127c27db.png) 
     * @return AuthorizedOrganizationId 被授权的合作方企业在电子签的企业电子签账号，当操作类型包含 PARTNER_AUTO_SIGN_AUTH （合作方企业授权自动签）时必传。

企业电子签账号可在[电子签的网页端](https://qian.tencent.com/console/company-settings/company-center) ，于企业设置-企业信息菜单栏下复制获取。

![企业电子签账号](https://qcloudimg.tencent-cloud.cn/raw/4e6b30ee92f00671f7f1c5bd127c27db.png)
     */
    public String getAuthorizedOrganizationId() {
        return this.AuthorizedOrganizationId;
    }

    /**
     * Set 被授权的合作方企业在电子签的企业电子签账号，当操作类型包含 PARTNER_AUTO_SIGN_AUTH （合作方企业授权自动签）时必传。

企业电子签账号可在[电子签的网页端](https://qian.tencent.com/console/company-settings/company-center) ，于企业设置-企业信息菜单栏下复制获取。

![企业电子签账号](https://qcloudimg.tencent-cloud.cn/raw/4e6b30ee92f00671f7f1c5bd127c27db.png)
     * @param AuthorizedOrganizationId 被授权的合作方企业在电子签的企业电子签账号，当操作类型包含 PARTNER_AUTO_SIGN_AUTH （合作方企业授权自动签）时必传。

企业电子签账号可在[电子签的网页端](https://qian.tencent.com/console/company-settings/company-center) ，于企业设置-企业信息菜单栏下复制获取。

![企业电子签账号](https://qcloudimg.tencent-cloud.cn/raw/4e6b30ee92f00671f7f1c5bd127c27db.png)
     */
    public void setAuthorizedOrganizationId(String AuthorizedOrganizationId) {
        this.AuthorizedOrganizationId = AuthorizedOrganizationId;
    }

    public CreateBatchInitOrganizationUrlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBatchInitOrganizationUrlRequest(CreateBatchInitOrganizationUrlRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.OperateTypes != null) {
            this.OperateTypes = new String[source.OperateTypes.length];
            for (int i = 0; i < source.OperateTypes.length; i++) {
                this.OperateTypes[i] = new String(source.OperateTypes[i]);
            }
        }
        if (source.OrganizationIds != null) {
            this.OrganizationIds = new String[source.OrganizationIds.length];
            for (int i = 0; i < source.OrganizationIds.length; i++) {
                this.OrganizationIds[i] = new String(source.OrganizationIds[i]);
            }
        }
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.AuthorizedOrganizationId != null) {
            this.AuthorizedOrganizationId = new String(source.AuthorizedOrganizationId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamArraySimple(map, prefix + "OperateTypes.", this.OperateTypes);
        this.setParamArraySimple(map, prefix + "OrganizationIds.", this.OrganizationIds);
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "AuthorizedOrganizationId", this.AuthorizedOrganizationId);

    }
}

