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

public class DescribeSingleSignOnEmployeesRequest extends AbstractModel {

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
    * 需要删除的单点登录员工的唯一Id 值.不能超过 200 个。
如果传递了 openIds，limit 和 offset 参数无效，
    */
    @SerializedName("OpenIds")
    @Expose
    private String [] OpenIds;

    /**
    * 代理企业和员工的信息。
在集团企业代理子企业操作的场景中，需设置此参数。在此情境下，ProxyOrganizationId（子企业的组织ID）为必填项。
    */
    @SerializedName("Agent")
    @Expose
    private Agent Agent;

    /**
    * 指定分页每页返回的数据条数，单页最大支持 200。如果不传， 则默认是 20.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * OFFSET 用于指定查询结果的偏移量，如果不传默认偏移为0,最大20000。 分页参数, 需要limit, offset 配合使用 例如: 您希望得到第三页的数据, 且每页限制最多10条 您可以使用 LIMIT 10 OFFSET 20	
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

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
     * Get 需要删除的单点登录员工的唯一Id 值.不能超过 200 个。
如果传递了 openIds，limit 和 offset 参数无效， 
     * @return OpenIds 需要删除的单点登录员工的唯一Id 值.不能超过 200 个。
如果传递了 openIds，limit 和 offset 参数无效，
     */
    public String [] getOpenIds() {
        return this.OpenIds;
    }

    /**
     * Set 需要删除的单点登录员工的唯一Id 值.不能超过 200 个。
如果传递了 openIds，limit 和 offset 参数无效，
     * @param OpenIds 需要删除的单点登录员工的唯一Id 值.不能超过 200 个。
如果传递了 openIds，limit 和 offset 参数无效，
     */
    public void setOpenIds(String [] OpenIds) {
        this.OpenIds = OpenIds;
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

    /**
     * Get 指定分页每页返回的数据条数，单页最大支持 200。如果不传， 则默认是 20. 
     * @return Limit 指定分页每页返回的数据条数，单页最大支持 200。如果不传， 则默认是 20.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 指定分页每页返回的数据条数，单页最大支持 200。如果不传， 则默认是 20.
     * @param Limit 指定分页每页返回的数据条数，单页最大支持 200。如果不传， 则默认是 20.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get OFFSET 用于指定查询结果的偏移量，如果不传默认偏移为0,最大20000。 分页参数, 需要limit, offset 配合使用 例如: 您希望得到第三页的数据, 且每页限制最多10条 您可以使用 LIMIT 10 OFFSET 20	 
     * @return Offset OFFSET 用于指定查询结果的偏移量，如果不传默认偏移为0,最大20000。 分页参数, 需要limit, offset 配合使用 例如: 您希望得到第三页的数据, 且每页限制最多10条 您可以使用 LIMIT 10 OFFSET 20	
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set OFFSET 用于指定查询结果的偏移量，如果不传默认偏移为0,最大20000。 分页参数, 需要limit, offset 配合使用 例如: 您希望得到第三页的数据, 且每页限制最多10条 您可以使用 LIMIT 10 OFFSET 20	
     * @param Offset OFFSET 用于指定查询结果的偏移量，如果不传默认偏移为0,最大20000。 分页参数, 需要limit, offset 配合使用 例如: 您希望得到第三页的数据, 且每页限制最多10条 您可以使用 LIMIT 10 OFFSET 20	
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeSingleSignOnEmployeesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSingleSignOnEmployeesRequest(DescribeSingleSignOnEmployeesRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.SsoApplicationId != null) {
            this.SsoApplicationId = new String(source.SsoApplicationId);
        }
        if (source.OpenIds != null) {
            this.OpenIds = new String[source.OpenIds.length];
            for (int i = 0; i < source.OpenIds.length; i++) {
                this.OpenIds[i] = new String(source.OpenIds[i]);
            }
        }
        if (source.Agent != null) {
            this.Agent = new Agent(source.Agent);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "SsoApplicationId", this.SsoApplicationId);
        this.setParamArraySimple(map, prefix + "OpenIds.", this.OpenIds);
        this.setParamObj(map, prefix + "Agent.", this.Agent);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

