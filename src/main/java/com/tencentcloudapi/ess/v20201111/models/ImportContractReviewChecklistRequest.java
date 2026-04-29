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

public class ImportContractReviewChecklistRequest extends AbstractModel {

    /**
    * <p>执行本接口操作的员工信息。<br>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p>
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * <p>导入的合同审查清单名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>导入的合同审查清单审查点列表</p>
    */
    @SerializedName("Categories")
    @Expose
    private ChecklistCategory [] Categories;

    /**
    * <p>代理企业和员工的信息。<br>在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。</p>
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * <p>如果传值，则更新对应的合同审查清单，否则创建新的合同审查清单</p>
    */
    @SerializedName("ChecklistID")
    @Expose
    private String ChecklistID;

    /**
    * <p>设置为true则启动清单，否则禁用清单</p>
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
     * Get <p>执行本接口操作的员工信息。<br>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p> 
     * @return Operator <p>执行本接口操作的员工信息。<br>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p>
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set <p>执行本接口操作的员工信息。<br>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p>
     * @param Operator <p>执行本接口操作的员工信息。<br>注: <code>在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。</code></p>
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get <p>导入的合同审查清单名称</p> 
     * @return Name <p>导入的合同审查清单名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>导入的合同审查清单名称</p>
     * @param Name <p>导入的合同审查清单名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>导入的合同审查清单审查点列表</p> 
     * @return Categories <p>导入的合同审查清单审查点列表</p>
     */
    public ChecklistCategory [] getCategories() {
        return this.Categories;
    }

    /**
     * Set <p>导入的合同审查清单审查点列表</p>
     * @param Categories <p>导入的合同审查清单审查点列表</p>
     */
    public void setCategories(ChecklistCategory [] Categories) {
        this.Categories = Categories;
    }

    /**
     * Get <p>代理企业和员工的信息。<br>在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。</p> 
     * @return Agent <p>代理企业和员工的信息。<br>在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。</p>
     */
    public Agent getAgent() {
        return this.Agent;
    }

    /**
     * Set <p>代理企业和员工的信息。<br>在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。</p>
     * @param Agent <p>代理企业和员工的信息。<br>在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。</p>
     */
    public void setAgent(Agent Agent) {
        this.Agent = Agent;
    }

    /**
     * Get <p>如果传值，则更新对应的合同审查清单，否则创建新的合同审查清单</p> 
     * @return ChecklistID <p>如果传值，则更新对应的合同审查清单，否则创建新的合同审查清单</p>
     */
    public String getChecklistID() {
        return this.ChecklistID;
    }

    /**
     * Set <p>如果传值，则更新对应的合同审查清单，否则创建新的合同审查清单</p>
     * @param ChecklistID <p>如果传值，则更新对应的合同审查清单，否则创建新的合同审查清单</p>
     */
    public void setChecklistID(String ChecklistID) {
        this.ChecklistID = ChecklistID;
    }

    /**
     * Get <p>设置为true则启动清单，否则禁用清单</p> 
     * @return Enabled <p>设置为true则启动清单，否则禁用清单</p>
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set <p>设置为true则启动清单，否则禁用清单</p>
     * @param Enabled <p>设置为true则启动清单，否则禁用清单</p>
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    public ImportContractReviewChecklistRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImportContractReviewChecklistRequest(ImportContractReviewChecklistRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Categories != null) {
            this.Categories = new ChecklistCategory[source.Categories.length];
            for (int i = 0; i < source.Categories.length; i++) {
                this.Categories[i] = new ChecklistCategory(source.Categories[i]);
            }
        }
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.ChecklistID != null) {
            this.ChecklistID = new String(source.ChecklistID);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "Categories.", this.Categories);
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "ChecklistID", this.ChecklistID);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);

    }
}

