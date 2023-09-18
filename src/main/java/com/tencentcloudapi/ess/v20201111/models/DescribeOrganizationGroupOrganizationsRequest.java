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

public class DescribeOrganizationGroupOrganizationsRequest extends AbstractModel{

    /**
    * 执行本接口操作的员工信息,userId必填。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 指定分页每页返回的数据条数，单页最大1000
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 指定分页返回第几页的数据，如果不传默认返回第一页，页码从 0 开始，即首页为 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 查询成员企业的企业名，模糊匹配
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 成员企业加入集团的当前状态
<ul><li> **1**：待授权</li>
<li> **2**：已授权待激活</li>
<li> **3**：拒绝授权</li>
<li> **4**：已解除</li>
<li> **5**：已加入</li>
</ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 是否导出当前成员企业数据
<ul><li> **false**：不导出（默认值）</li>
<li> **true**：导出</li></ul>
    */
    @SerializedName("Export")
    @Expose
    private Boolean Export;

    /**
    * 成员企业机构 ID，32 位字符串，在PC控制台 集团管理可获取
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
     * Get 执行本接口操作的员工信息,userId必填。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。 
     * @return Operator 执行本接口操作的员工信息,userId必填。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 执行本接口操作的员工信息,userId必填。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。
     * @param Operator 执行本接口操作的员工信息,userId必填。
注: `在调用此接口时，请确保指定的员工已获得所需的接口调用权限，并具备接口传入的相应资源的数据权限。
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 指定分页每页返回的数据条数，单页最大1000 
     * @return Limit 指定分页每页返回的数据条数，单页最大1000
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 指定分页每页返回的数据条数，单页最大1000
     * @param Limit 指定分页每页返回的数据条数，单页最大1000
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 指定分页返回第几页的数据，如果不传默认返回第一页，页码从 0 开始，即首页为 0 
     * @return Offset 指定分页返回第几页的数据，如果不传默认返回第一页，页码从 0 开始，即首页为 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 指定分页返回第几页的数据，如果不传默认返回第一页，页码从 0 开始，即首页为 0
     * @param Offset 指定分页返回第几页的数据，如果不传默认返回第一页，页码从 0 开始，即首页为 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 查询成员企业的企业名，模糊匹配 
     * @return Name 查询成员企业的企业名，模糊匹配
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 查询成员企业的企业名，模糊匹配
     * @param Name 查询成员企业的企业名，模糊匹配
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 成员企业加入集团的当前状态
<ul><li> **1**：待授权</li>
<li> **2**：已授权待激活</li>
<li> **3**：拒绝授权</li>
<li> **4**：已解除</li>
<li> **5**：已加入</li>
</ul> 
     * @return Status 成员企业加入集团的当前状态
<ul><li> **1**：待授权</li>
<li> **2**：已授权待激活</li>
<li> **3**：拒绝授权</li>
<li> **4**：已解除</li>
<li> **5**：已加入</li>
</ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 成员企业加入集团的当前状态
<ul><li> **1**：待授权</li>
<li> **2**：已授权待激活</li>
<li> **3**：拒绝授权</li>
<li> **4**：已解除</li>
<li> **5**：已加入</li>
</ul>
     * @param Status 成员企业加入集团的当前状态
<ul><li> **1**：待授权</li>
<li> **2**：已授权待激活</li>
<li> **3**：拒绝授权</li>
<li> **4**：已解除</li>
<li> **5**：已加入</li>
</ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 是否导出当前成员企业数据
<ul><li> **false**：不导出（默认值）</li>
<li> **true**：导出</li></ul> 
     * @return Export 是否导出当前成员企业数据
<ul><li> **false**：不导出（默认值）</li>
<li> **true**：导出</li></ul>
     */
    public Boolean getExport() {
        return this.Export;
    }

    /**
     * Set 是否导出当前成员企业数据
<ul><li> **false**：不导出（默认值）</li>
<li> **true**：导出</li></ul>
     * @param Export 是否导出当前成员企业数据
<ul><li> **false**：不导出（默认值）</li>
<li> **true**：导出</li></ul>
     */
    public void setExport(Boolean Export) {
        this.Export = Export;
    }

    /**
     * Get 成员企业机构 ID，32 位字符串，在PC控制台 集团管理可获取 
     * @return Id 成员企业机构 ID，32 位字符串，在PC控制台 集团管理可获取
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 成员企业机构 ID，32 位字符串，在PC控制台 集团管理可获取
     * @param Id 成员企业机构 ID，32 位字符串，在PC控制台 集团管理可获取
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    public DescribeOrganizationGroupOrganizationsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOrganizationGroupOrganizationsRequest(DescribeOrganizationGroupOrganizationsRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Export != null) {
            this.Export = new Boolean(source.Export);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Export", this.Export);
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

