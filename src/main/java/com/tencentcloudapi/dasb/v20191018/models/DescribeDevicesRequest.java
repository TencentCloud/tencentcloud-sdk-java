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
package com.tencentcloudapi.dasb.v20191018.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDevicesRequest extends AbstractModel {

    /**
    * 资产ID集合
    */
    @SerializedName("IdSet")
    @Expose
    private Long [] IdSet;

    /**
    * 资产名或资产IP，模糊查询
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 暂未使用
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 地域码集合
    */
    @SerializedName("ApCodeSet")
    @Expose
    private String [] ApCodeSet;

    /**
    * 操作系统类型, 1 - Linux, 2 - Windows, 3 - MySQL, 4 - SQLServer, 5 - TDSQL MySQL, 6 - TDSQL-C MySQL, 7 - MariaDB, 8 - PostgreSQL, 9 - MongoDB副本集群, 10 - MongoDB分片集群, 11 - Redis
    */
    @SerializedName("Kind")
    @Expose
    private Long Kind;

    /**
    * 分页偏移位置，默认值为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 每页条目数量，默认20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 有该资产访问权限的用户ID集合
    */
    @SerializedName("AuthorizedUserIdSet")
    @Expose
    private Long [] AuthorizedUserIdSet;

    /**
    * 过滤条件，资产绑定的堡垒机服务ID集合
    */
    @SerializedName("ResourceIdSet")
    @Expose
    private String [] ResourceIdSet;

    /**
    * 可提供按照多种类型过滤, 取值范围与Kind一致
    */
    @SerializedName("KindSet")
    @Expose
    private Long [] KindSet;

    /**
    * 资产是否包含托管账号。1，包含；0，不包含
    */
    @SerializedName("ManagedAccount")
    @Expose
    private String ManagedAccount;

    /**
    * 过滤条件，可按照部门ID进行过滤
    */
    @SerializedName("DepartmentId")
    @Expose
    private String DepartmentId;

    /**
    * 过滤条件，可按照标签键、标签进行过滤。如果同时指定标签键和标签过滤条件，它们之间为“AND”的关系
    */
    @SerializedName("TagFilters")
    @Expose
    private TagFilter [] TagFilters;

    /**
    * 过滤数组。支持的Name：
BindingStatus 绑定状态
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get 资产ID集合 
     * @return IdSet 资产ID集合
     */
    public Long [] getIdSet() {
        return this.IdSet;
    }

    /**
     * Set 资产ID集合
     * @param IdSet 资产ID集合
     */
    public void setIdSet(Long [] IdSet) {
        this.IdSet = IdSet;
    }

    /**
     * Get 资产名或资产IP，模糊查询 
     * @return Name 资产名或资产IP，模糊查询
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 资产名或资产IP，模糊查询
     * @param Name 资产名或资产IP，模糊查询
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 暂未使用 
     * @return Ip 暂未使用
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 暂未使用
     * @param Ip 暂未使用
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 地域码集合 
     * @return ApCodeSet 地域码集合
     */
    public String [] getApCodeSet() {
        return this.ApCodeSet;
    }

    /**
     * Set 地域码集合
     * @param ApCodeSet 地域码集合
     */
    public void setApCodeSet(String [] ApCodeSet) {
        this.ApCodeSet = ApCodeSet;
    }

    /**
     * Get 操作系统类型, 1 - Linux, 2 - Windows, 3 - MySQL, 4 - SQLServer, 5 - TDSQL MySQL, 6 - TDSQL-C MySQL, 7 - MariaDB, 8 - PostgreSQL, 9 - MongoDB副本集群, 10 - MongoDB分片集群, 11 - Redis 
     * @return Kind 操作系统类型, 1 - Linux, 2 - Windows, 3 - MySQL, 4 - SQLServer, 5 - TDSQL MySQL, 6 - TDSQL-C MySQL, 7 - MariaDB, 8 - PostgreSQL, 9 - MongoDB副本集群, 10 - MongoDB分片集群, 11 - Redis
     */
    public Long getKind() {
        return this.Kind;
    }

    /**
     * Set 操作系统类型, 1 - Linux, 2 - Windows, 3 - MySQL, 4 - SQLServer, 5 - TDSQL MySQL, 6 - TDSQL-C MySQL, 7 - MariaDB, 8 - PostgreSQL, 9 - MongoDB副本集群, 10 - MongoDB分片集群, 11 - Redis
     * @param Kind 操作系统类型, 1 - Linux, 2 - Windows, 3 - MySQL, 4 - SQLServer, 5 - TDSQL MySQL, 6 - TDSQL-C MySQL, 7 - MariaDB, 8 - PostgreSQL, 9 - MongoDB副本集群, 10 - MongoDB分片集群, 11 - Redis
     */
    public void setKind(Long Kind) {
        this.Kind = Kind;
    }

    /**
     * Get 分页偏移位置，默认值为0 
     * @return Offset 分页偏移位置，默认值为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移位置，默认值为0
     * @param Offset 分页偏移位置，默认值为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 每页条目数量，默认20 
     * @return Limit 每页条目数量，默认20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页条目数量，默认20
     * @param Limit 每页条目数量，默认20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 有该资产访问权限的用户ID集合 
     * @return AuthorizedUserIdSet 有该资产访问权限的用户ID集合
     */
    public Long [] getAuthorizedUserIdSet() {
        return this.AuthorizedUserIdSet;
    }

    /**
     * Set 有该资产访问权限的用户ID集合
     * @param AuthorizedUserIdSet 有该资产访问权限的用户ID集合
     */
    public void setAuthorizedUserIdSet(Long [] AuthorizedUserIdSet) {
        this.AuthorizedUserIdSet = AuthorizedUserIdSet;
    }

    /**
     * Get 过滤条件，资产绑定的堡垒机服务ID集合 
     * @return ResourceIdSet 过滤条件，资产绑定的堡垒机服务ID集合
     */
    public String [] getResourceIdSet() {
        return this.ResourceIdSet;
    }

    /**
     * Set 过滤条件，资产绑定的堡垒机服务ID集合
     * @param ResourceIdSet 过滤条件，资产绑定的堡垒机服务ID集合
     */
    public void setResourceIdSet(String [] ResourceIdSet) {
        this.ResourceIdSet = ResourceIdSet;
    }

    /**
     * Get 可提供按照多种类型过滤, 取值范围与Kind一致 
     * @return KindSet 可提供按照多种类型过滤, 取值范围与Kind一致
     */
    public Long [] getKindSet() {
        return this.KindSet;
    }

    /**
     * Set 可提供按照多种类型过滤, 取值范围与Kind一致
     * @param KindSet 可提供按照多种类型过滤, 取值范围与Kind一致
     */
    public void setKindSet(Long [] KindSet) {
        this.KindSet = KindSet;
    }

    /**
     * Get 资产是否包含托管账号。1，包含；0，不包含 
     * @return ManagedAccount 资产是否包含托管账号。1，包含；0，不包含
     */
    public String getManagedAccount() {
        return this.ManagedAccount;
    }

    /**
     * Set 资产是否包含托管账号。1，包含；0，不包含
     * @param ManagedAccount 资产是否包含托管账号。1，包含；0，不包含
     */
    public void setManagedAccount(String ManagedAccount) {
        this.ManagedAccount = ManagedAccount;
    }

    /**
     * Get 过滤条件，可按照部门ID进行过滤 
     * @return DepartmentId 过滤条件，可按照部门ID进行过滤
     */
    public String getDepartmentId() {
        return this.DepartmentId;
    }

    /**
     * Set 过滤条件，可按照部门ID进行过滤
     * @param DepartmentId 过滤条件，可按照部门ID进行过滤
     */
    public void setDepartmentId(String DepartmentId) {
        this.DepartmentId = DepartmentId;
    }

    /**
     * Get 过滤条件，可按照标签键、标签进行过滤。如果同时指定标签键和标签过滤条件，它们之间为“AND”的关系 
     * @return TagFilters 过滤条件，可按照标签键、标签进行过滤。如果同时指定标签键和标签过滤条件，它们之间为“AND”的关系
     */
    public TagFilter [] getTagFilters() {
        return this.TagFilters;
    }

    /**
     * Set 过滤条件，可按照标签键、标签进行过滤。如果同时指定标签键和标签过滤条件，它们之间为“AND”的关系
     * @param TagFilters 过滤条件，可按照标签键、标签进行过滤。如果同时指定标签键和标签过滤条件，它们之间为“AND”的关系
     */
    public void setTagFilters(TagFilter [] TagFilters) {
        this.TagFilters = TagFilters;
    }

    /**
     * Get 过滤数组。支持的Name：
BindingStatus 绑定状态 
     * @return Filters 过滤数组。支持的Name：
BindingStatus 绑定状态
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤数组。支持的Name：
BindingStatus 绑定状态
     * @param Filters 过滤数组。支持的Name：
BindingStatus 绑定状态
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeDevicesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDevicesRequest(DescribeDevicesRequest source) {
        if (source.IdSet != null) {
            this.IdSet = new Long[source.IdSet.length];
            for (int i = 0; i < source.IdSet.length; i++) {
                this.IdSet[i] = new Long(source.IdSet[i]);
            }
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.ApCodeSet != null) {
            this.ApCodeSet = new String[source.ApCodeSet.length];
            for (int i = 0; i < source.ApCodeSet.length; i++) {
                this.ApCodeSet[i] = new String(source.ApCodeSet[i]);
            }
        }
        if (source.Kind != null) {
            this.Kind = new Long(source.Kind);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.AuthorizedUserIdSet != null) {
            this.AuthorizedUserIdSet = new Long[source.AuthorizedUserIdSet.length];
            for (int i = 0; i < source.AuthorizedUserIdSet.length; i++) {
                this.AuthorizedUserIdSet[i] = new Long(source.AuthorizedUserIdSet[i]);
            }
        }
        if (source.ResourceIdSet != null) {
            this.ResourceIdSet = new String[source.ResourceIdSet.length];
            for (int i = 0; i < source.ResourceIdSet.length; i++) {
                this.ResourceIdSet[i] = new String(source.ResourceIdSet[i]);
            }
        }
        if (source.KindSet != null) {
            this.KindSet = new Long[source.KindSet.length];
            for (int i = 0; i < source.KindSet.length; i++) {
                this.KindSet[i] = new Long(source.KindSet[i]);
            }
        }
        if (source.ManagedAccount != null) {
            this.ManagedAccount = new String(source.ManagedAccount);
        }
        if (source.DepartmentId != null) {
            this.DepartmentId = new String(source.DepartmentId);
        }
        if (source.TagFilters != null) {
            this.TagFilters = new TagFilter[source.TagFilters.length];
            for (int i = 0; i < source.TagFilters.length; i++) {
                this.TagFilters[i] = new TagFilter(source.TagFilters[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "IdSet.", this.IdSet);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamArraySimple(map, prefix + "ApCodeSet.", this.ApCodeSet);
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "AuthorizedUserIdSet.", this.AuthorizedUserIdSet);
        this.setParamArraySimple(map, prefix + "ResourceIdSet.", this.ResourceIdSet);
        this.setParamArraySimple(map, prefix + "KindSet.", this.KindSet);
        this.setParamSimple(map, prefix + "ManagedAccount", this.ManagedAccount);
        this.setParamSimple(map, prefix + "DepartmentId", this.DepartmentId);
        this.setParamArrayObj(map, prefix + "TagFilters.", this.TagFilters);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

