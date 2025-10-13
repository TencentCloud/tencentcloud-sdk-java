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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteSingleSignOnEmployeesRequest extends AbstractModel {

    /**
    * 执行本接口操作的员工信息。使用此接口时，必须填写userId。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 单点登录应用号的id,获取位置如下图![image](https://qcloudimg.tencent-cloud.cn/raw/9e61aaf390a5f90ea7606fe29b9a65fd.png)
    */
    @SerializedName("SsoApplicationId")
    @Expose
    private String SsoApplicationId;

    /**
    * 需要删除的单点登录员工的唯一Id 值
    */
    @SerializedName("OpenId")
    @Expose
    private String OpenId;

    /**
    * 代理企业和员工的信息。
在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
     * Get 执行本接口操作的员工信息。使用此接口时，必须填写userId。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。` 
     * @return Operator 执行本接口操作的员工信息。使用此接口时，必须填写userId。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 执行本接口操作的员工信息。使用此接口时，必须填写userId。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
     * @param Operator 执行本接口操作的员工信息。使用此接口时，必须填写userId。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。`
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 单点登录应用号的id,获取位置如下图![image](https://qcloudimg.tencent-cloud.cn/raw/9e61aaf390a5f90ea7606fe29b9a65fd.png) 
     * @return SsoApplicationId 单点登录应用号的id,获取位置如下图![image](https://qcloudimg.tencent-cloud.cn/raw/9e61aaf390a5f90ea7606fe29b9a65fd.png)
     */
    public String getSsoApplicationId() {
        return this.SsoApplicationId;
    }

    /**
     * Set 单点登录应用号的id,获取位置如下图![image](https://qcloudimg.tencent-cloud.cn/raw/9e61aaf390a5f90ea7606fe29b9a65fd.png)
     * @param SsoApplicationId 单点登录应用号的id,获取位置如下图![image](https://qcloudimg.tencent-cloud.cn/raw/9e61aaf390a5f90ea7606fe29b9a65fd.png)
     */
    public void setSsoApplicationId(String SsoApplicationId) {
        this.SsoApplicationId = SsoApplicationId;
    }

    /**
     * Get 需要删除的单点登录员工的唯一Id 值 
     * @return OpenId 需要删除的单点登录员工的唯一Id 值
     */
    public String getOpenId() {
        return this.OpenId;
    }

    /**
     * Set 需要删除的单点登录员工的唯一Id 值
     * @param OpenId 需要删除的单点登录员工的唯一Id 值
     */
    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
    }

    /**
     * Get 代理企业和员工的信息。
在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。 
     * @return Agent 代理企业和员工的信息。
在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 代理企业和员工的信息。
在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。
     * @param Agent 代理企业和员工的信息。
在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    public DeleteSingleSignOnEmployeesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteSingleSignOnEmployeesRequest(DeleteSingleSignOnEmployeesRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.SsoApplicationId != null) {
            this.SsoApplicationId = new String(source.SsoApplicationId);
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
        this.setParamSimple(map, prefix + "SsoApplicationId", this.SsoApplicationId);
        this.setParamSimple(map, prefix + "OpenId", this.OpenId);
        this.setParamObj(map, prefix + "Agent.", this.Agent);

    }
}

