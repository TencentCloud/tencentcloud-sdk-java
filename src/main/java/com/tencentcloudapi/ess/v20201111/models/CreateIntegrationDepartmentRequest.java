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

public class CreateIntegrationDepartmentRequest extends AbstractModel {

    /**
    * 执行本接口操作的员工信息。
注: `在调用此接口时，请确保指定的员工已获得组织架构管理权限，并具备接口传入的相应资源的数据权限。`
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 部门名称，最大长度为50个字符。
    */
    @SerializedName("DeptName")
    @Expose
    private String DeptName;

    /**
    * 代理企业和员工的信息。 在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 电子签父部门ID。
注：`如果同时指定了ParentDeptId与ParentDeptOpenId参数，系统将优先使用ParentDeptId。当二者都未指定时，创建的新部门将自动填充至根节点部门下。`
    */
    @SerializedName("ParentDeptId")
    @Expose
    private String ParentDeptId;

    /**
    * 第三方平台中父部门ID。
注：`如果同时指定了ParentDeptId与ParentDeptOpenId参数，系统将优先使用ParentDeptId。当二者都未指定时，创建的新部门将自动填充至根节点部门下。`
    */
    @SerializedName("ParentDeptOpenId")
    @Expose
    private String ParentDeptOpenId;

    /**
    * 客户系统部门ID，最大长度为64个字符。
    */
    @SerializedName("DeptOpenId")
    @Expose
    private String DeptOpenId;

    /**
    * 排序号，支持设置的数值范围为1~30000。同一父部门下，排序号越大，部门顺序越靠前。
    */
    @SerializedName("OrderNo")
    @Expose
    private Long OrderNo;

    /**
     * Get 执行本接口操作的员工信息。
注: `在调用此接口时，请确保指定的员工已获得组织架构管理权限，并具备接口传入的相应资源的数据权限。` 
     * @return Operator 执行本接口操作的员工信息。
注: `在调用此接口时，请确保指定的员工已获得组织架构管理权限，并具备接口传入的相应资源的数据权限。`
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 执行本接口操作的员工信息。
注: `在调用此接口时，请确保指定的员工已获得组织架构管理权限，并具备接口传入的相应资源的数据权限。`
     * @param Operator 执行本接口操作的员工信息。
注: `在调用此接口时，请确保指定的员工已获得组织架构管理权限，并具备接口传入的相应资源的数据权限。`
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 部门名称，最大长度为50个字符。 
     * @return DeptName 部门名称，最大长度为50个字符。
     */
    public String getDeptName() {
        return this.DeptName;
    }

    /**
     * Set 部门名称，最大长度为50个字符。
     * @param DeptName 部门名称，最大长度为50个字符。
     */
    public void setDeptName(String DeptName) {
        this.DeptName = DeptName;
    }

    /**
     * Get 代理企业和员工的信息。 在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。 
     * @return Agent 代理企业和员工的信息。 在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set 代理企业和员工的信息。 在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。
     * @param Agent 代理企业和员工的信息。 在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 电子签父部门ID。
注：`如果同时指定了ParentDeptId与ParentDeptOpenId参数，系统将优先使用ParentDeptId。当二者都未指定时，创建的新部门将自动填充至根节点部门下。` 
     * @return ParentDeptId 电子签父部门ID。
注：`如果同时指定了ParentDeptId与ParentDeptOpenId参数，系统将优先使用ParentDeptId。当二者都未指定时，创建的新部门将自动填充至根节点部门下。`
     */
    public String getParentDeptId() {
        return this.ParentDeptId;
    }

    /**
     * Set 电子签父部门ID。
注：`如果同时指定了ParentDeptId与ParentDeptOpenId参数，系统将优先使用ParentDeptId。当二者都未指定时，创建的新部门将自动填充至根节点部门下。`
     * @param ParentDeptId 电子签父部门ID。
注：`如果同时指定了ParentDeptId与ParentDeptOpenId参数，系统将优先使用ParentDeptId。当二者都未指定时，创建的新部门将自动填充至根节点部门下。`
     */
    public void setParentDeptId(String ParentDeptId) {
        this.ParentDeptId = ParentDeptId;
    }

    /**
     * Get 第三方平台中父部门ID。
注：`如果同时指定了ParentDeptId与ParentDeptOpenId参数，系统将优先使用ParentDeptId。当二者都未指定时，创建的新部门将自动填充至根节点部门下。` 
     * @return ParentDeptOpenId 第三方平台中父部门ID。
注：`如果同时指定了ParentDeptId与ParentDeptOpenId参数，系统将优先使用ParentDeptId。当二者都未指定时，创建的新部门将自动填充至根节点部门下。`
     */
    public String getParentDeptOpenId() {
        return this.ParentDeptOpenId;
    }

    /**
     * Set 第三方平台中父部门ID。
注：`如果同时指定了ParentDeptId与ParentDeptOpenId参数，系统将优先使用ParentDeptId。当二者都未指定时，创建的新部门将自动填充至根节点部门下。`
     * @param ParentDeptOpenId 第三方平台中父部门ID。
注：`如果同时指定了ParentDeptId与ParentDeptOpenId参数，系统将优先使用ParentDeptId。当二者都未指定时，创建的新部门将自动填充至根节点部门下。`
     */
    public void setParentDeptOpenId(String ParentDeptOpenId) {
        this.ParentDeptOpenId = ParentDeptOpenId;
    }

    /**
     * Get 客户系统部门ID，最大长度为64个字符。 
     * @return DeptOpenId 客户系统部门ID，最大长度为64个字符。
     */
    public String getDeptOpenId() {
        return this.DeptOpenId;
    }

    /**
     * Set 客户系统部门ID，最大长度为64个字符。
     * @param DeptOpenId 客户系统部门ID，最大长度为64个字符。
     */
    public void setDeptOpenId(String DeptOpenId) {
        this.DeptOpenId = DeptOpenId;
    }

    /**
     * Get 排序号，支持设置的数值范围为1~30000。同一父部门下，排序号越大，部门顺序越靠前。 
     * @return OrderNo 排序号，支持设置的数值范围为1~30000。同一父部门下，排序号越大，部门顺序越靠前。
     */
    public Long getOrderNo() {
        return this.OrderNo;
    }

    /**
     * Set 排序号，支持设置的数值范围为1~30000。同一父部门下，排序号越大，部门顺序越靠前。
     * @param OrderNo 排序号，支持设置的数值范围为1~30000。同一父部门下，排序号越大，部门顺序越靠前。
     */
    public void setOrderNo(Long OrderNo) {
        this.OrderNo = OrderNo;
    }

    public CreateIntegrationDepartmentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateIntegrationDepartmentRequest(CreateIntegrationDepartmentRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.DeptName != null) {
            this.DeptName = new String(source.DeptName);
        }
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.ParentDeptId != null) {
            this.ParentDeptId = new String(source.ParentDeptId);
        }
        if (source.ParentDeptOpenId != null) {
            this.ParentDeptOpenId = new String(source.ParentDeptOpenId);
        }
        if (source.DeptOpenId != null) {
            this.DeptOpenId = new String(source.DeptOpenId);
        }
        if (source.OrderNo != null) {
            this.OrderNo = new Long(source.OrderNo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "DeptName", this.DeptName);
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "ParentDeptId", this.ParentDeptId);
        this.setParamSimple(map, prefix + "ParentDeptOpenId", this.ParentDeptOpenId);
        this.setParamSimple(map, prefix + "DeptOpenId", this.DeptOpenId);
        this.setParamSimple(map, prefix + "OrderNo", this.OrderNo);

    }
}

