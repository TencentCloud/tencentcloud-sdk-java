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
package com.tencentcloudapi.bh.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDevicesRequest extends AbstractModel {

    /**
    * <p>资产ID集合</p>
    */
    @SerializedName("IdSet")
    @Expose
    private Long [] IdSet;

    /**
    * <p>资产名或资产IP，模糊查询</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>暂未使用</p>
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * <p>地域码集合</p>
    */
    @SerializedName("ApCodeSet")
    @Expose
    private String [] ApCodeSet;

    /**
    * <p>操作系统类型, 1 - Linux, 2 - Windows, 3 - MySQL, 4 - SQLServer</p>
    */
    @SerializedName("Kind")
    @Expose
    private Long Kind;

    /**
    * <p>分页偏移位置，默认值为0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>每页条目数量</p><p>取值范围：[0, 500]</p><p>默认值：20</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>有该资产访问权限的用户ID集合</p>
    */
    @SerializedName("AuthorizedUserIdSet")
    @Expose
    private Long [] AuthorizedUserIdSet;

    /**
    * <p>过滤条件，资产绑定的堡垒机服务ID集合</p>
    */
    @SerializedName("ResourceIdSet")
    @Expose
    private String [] ResourceIdSet;

    /**
    * <p>可提供按照多种类型过滤, 1 - Linux, 2 - Windows, 3 - MySQL, 4 - SQLServer</p>
    */
    @SerializedName("KindSet")
    @Expose
    private Long [] KindSet;

    /**
    * <p>资产是否包含托管账号。1，包含；0，不包含</p>
    */
    @SerializedName("ManagedAccount")
    @Expose
    private String ManagedAccount;

    /**
    * <p>过滤条件，可按照部门ID进行过滤</p>
    */
    @SerializedName("DepartmentId")
    @Expose
    private String DepartmentId;

    /**
    * <p>资产所属云账号id</p>
    */
    @SerializedName("AccountIdSet")
    @Expose
    private Long [] AccountIdSet;

    /**
    * <p>云厂商类型，1-腾讯云，2-阿里云</p>
    */
    @SerializedName("ProviderTypeSet")
    @Expose
    private Long [] ProviderTypeSet;

    /**
    * <p>同步的云资产状态，标记同步的资产的状态情况，0-已删除,1-正常,2-已隔离,3-已过期</p>
    */
    @SerializedName("CloudDeviceStatusSet")
    @Expose
    private Long [] CloudDeviceStatusSet;

    /**
    * <p>过滤条件，可按照标签键、标签进行过滤。如果同时指定标签键和标签过滤条件，它们之间为“AND”的关系</p>
    */
    @SerializedName("TagFilters")
    @Expose
    private TagFilter [] TagFilters;

    /**
    * <p>过滤数组。支持的Name：<br>BindingStatus 绑定状态</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * <p>所属成员 AppId</p>
    */
    @SerializedName("OwnerAppIds")
    @Expose
    private Long [] OwnerAppIds;

    /**
     * Get <p>资产ID集合</p> 
     * @return IdSet <p>资产ID集合</p>
     */
    public Long [] getIdSet() {
        return this.IdSet;
    }

    /**
     * Set <p>资产ID集合</p>
     * @param IdSet <p>资产ID集合</p>
     */
    public void setIdSet(Long [] IdSet) {
        this.IdSet = IdSet;
    }

    /**
     * Get <p>资产名或资产IP，模糊查询</p> 
     * @return Name <p>资产名或资产IP，模糊查询</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>资产名或资产IP，模糊查询</p>
     * @param Name <p>资产名或资产IP，模糊查询</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>暂未使用</p> 
     * @return Ip <p>暂未使用</p>
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set <p>暂未使用</p>
     * @param Ip <p>暂未使用</p>
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get <p>地域码集合</p> 
     * @return ApCodeSet <p>地域码集合</p>
     */
    public String [] getApCodeSet() {
        return this.ApCodeSet;
    }

    /**
     * Set <p>地域码集合</p>
     * @param ApCodeSet <p>地域码集合</p>
     */
    public void setApCodeSet(String [] ApCodeSet) {
        this.ApCodeSet = ApCodeSet;
    }

    /**
     * Get <p>操作系统类型, 1 - Linux, 2 - Windows, 3 - MySQL, 4 - SQLServer</p> 
     * @return Kind <p>操作系统类型, 1 - Linux, 2 - Windows, 3 - MySQL, 4 - SQLServer</p>
     */
    public Long getKind() {
        return this.Kind;
    }

    /**
     * Set <p>操作系统类型, 1 - Linux, 2 - Windows, 3 - MySQL, 4 - SQLServer</p>
     * @param Kind <p>操作系统类型, 1 - Linux, 2 - Windows, 3 - MySQL, 4 - SQLServer</p>
     */
    public void setKind(Long Kind) {
        this.Kind = Kind;
    }

    /**
     * Get <p>分页偏移位置，默认值为0</p> 
     * @return Offset <p>分页偏移位置，默认值为0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页偏移位置，默认值为0</p>
     * @param Offset <p>分页偏移位置，默认值为0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>每页条目数量</p><p>取值范围：[0, 500]</p><p>默认值：20</p> 
     * @return Limit <p>每页条目数量</p><p>取值范围：[0, 500]</p><p>默认值：20</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>每页条目数量</p><p>取值范围：[0, 500]</p><p>默认值：20</p>
     * @param Limit <p>每页条目数量</p><p>取值范围：[0, 500]</p><p>默认值：20</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>有该资产访问权限的用户ID集合</p> 
     * @return AuthorizedUserIdSet <p>有该资产访问权限的用户ID集合</p>
     */
    public Long [] getAuthorizedUserIdSet() {
        return this.AuthorizedUserIdSet;
    }

    /**
     * Set <p>有该资产访问权限的用户ID集合</p>
     * @param AuthorizedUserIdSet <p>有该资产访问权限的用户ID集合</p>
     */
    public void setAuthorizedUserIdSet(Long [] AuthorizedUserIdSet) {
        this.AuthorizedUserIdSet = AuthorizedUserIdSet;
    }

    /**
     * Get <p>过滤条件，资产绑定的堡垒机服务ID集合</p> 
     * @return ResourceIdSet <p>过滤条件，资产绑定的堡垒机服务ID集合</p>
     */
    public String [] getResourceIdSet() {
        return this.ResourceIdSet;
    }

    /**
     * Set <p>过滤条件，资产绑定的堡垒机服务ID集合</p>
     * @param ResourceIdSet <p>过滤条件，资产绑定的堡垒机服务ID集合</p>
     */
    public void setResourceIdSet(String [] ResourceIdSet) {
        this.ResourceIdSet = ResourceIdSet;
    }

    /**
     * Get <p>可提供按照多种类型过滤, 1 - Linux, 2 - Windows, 3 - MySQL, 4 - SQLServer</p> 
     * @return KindSet <p>可提供按照多种类型过滤, 1 - Linux, 2 - Windows, 3 - MySQL, 4 - SQLServer</p>
     */
    public Long [] getKindSet() {
        return this.KindSet;
    }

    /**
     * Set <p>可提供按照多种类型过滤, 1 - Linux, 2 - Windows, 3 - MySQL, 4 - SQLServer</p>
     * @param KindSet <p>可提供按照多种类型过滤, 1 - Linux, 2 - Windows, 3 - MySQL, 4 - SQLServer</p>
     */
    public void setKindSet(Long [] KindSet) {
        this.KindSet = KindSet;
    }

    /**
     * Get <p>资产是否包含托管账号。1，包含；0，不包含</p> 
     * @return ManagedAccount <p>资产是否包含托管账号。1，包含；0，不包含</p>
     */
    public String getManagedAccount() {
        return this.ManagedAccount;
    }

    /**
     * Set <p>资产是否包含托管账号。1，包含；0，不包含</p>
     * @param ManagedAccount <p>资产是否包含托管账号。1，包含；0，不包含</p>
     */
    public void setManagedAccount(String ManagedAccount) {
        this.ManagedAccount = ManagedAccount;
    }

    /**
     * Get <p>过滤条件，可按照部门ID进行过滤</p> 
     * @return DepartmentId <p>过滤条件，可按照部门ID进行过滤</p>
     */
    public String getDepartmentId() {
        return this.DepartmentId;
    }

    /**
     * Set <p>过滤条件，可按照部门ID进行过滤</p>
     * @param DepartmentId <p>过滤条件，可按照部门ID进行过滤</p>
     */
    public void setDepartmentId(String DepartmentId) {
        this.DepartmentId = DepartmentId;
    }

    /**
     * Get <p>资产所属云账号id</p> 
     * @return AccountIdSet <p>资产所属云账号id</p>
     */
    public Long [] getAccountIdSet() {
        return this.AccountIdSet;
    }

    /**
     * Set <p>资产所属云账号id</p>
     * @param AccountIdSet <p>资产所属云账号id</p>
     */
    public void setAccountIdSet(Long [] AccountIdSet) {
        this.AccountIdSet = AccountIdSet;
    }

    /**
     * Get <p>云厂商类型，1-腾讯云，2-阿里云</p> 
     * @return ProviderTypeSet <p>云厂商类型，1-腾讯云，2-阿里云</p>
     */
    public Long [] getProviderTypeSet() {
        return this.ProviderTypeSet;
    }

    /**
     * Set <p>云厂商类型，1-腾讯云，2-阿里云</p>
     * @param ProviderTypeSet <p>云厂商类型，1-腾讯云，2-阿里云</p>
     */
    public void setProviderTypeSet(Long [] ProviderTypeSet) {
        this.ProviderTypeSet = ProviderTypeSet;
    }

    /**
     * Get <p>同步的云资产状态，标记同步的资产的状态情况，0-已删除,1-正常,2-已隔离,3-已过期</p> 
     * @return CloudDeviceStatusSet <p>同步的云资产状态，标记同步的资产的状态情况，0-已删除,1-正常,2-已隔离,3-已过期</p>
     */
    public Long [] getCloudDeviceStatusSet() {
        return this.CloudDeviceStatusSet;
    }

    /**
     * Set <p>同步的云资产状态，标记同步的资产的状态情况，0-已删除,1-正常,2-已隔离,3-已过期</p>
     * @param CloudDeviceStatusSet <p>同步的云资产状态，标记同步的资产的状态情况，0-已删除,1-正常,2-已隔离,3-已过期</p>
     */
    public void setCloudDeviceStatusSet(Long [] CloudDeviceStatusSet) {
        this.CloudDeviceStatusSet = CloudDeviceStatusSet;
    }

    /**
     * Get <p>过滤条件，可按照标签键、标签进行过滤。如果同时指定标签键和标签过滤条件，它们之间为“AND”的关系</p> 
     * @return TagFilters <p>过滤条件，可按照标签键、标签进行过滤。如果同时指定标签键和标签过滤条件，它们之间为“AND”的关系</p>
     */
    public TagFilter [] getTagFilters() {
        return this.TagFilters;
    }

    /**
     * Set <p>过滤条件，可按照标签键、标签进行过滤。如果同时指定标签键和标签过滤条件，它们之间为“AND”的关系</p>
     * @param TagFilters <p>过滤条件，可按照标签键、标签进行过滤。如果同时指定标签键和标签过滤条件，它们之间为“AND”的关系</p>
     */
    public void setTagFilters(TagFilter [] TagFilters) {
        this.TagFilters = TagFilters;
    }

    /**
     * Get <p>过滤数组。支持的Name：<br>BindingStatus 绑定状态</p> 
     * @return Filters <p>过滤数组。支持的Name：<br>BindingStatus 绑定状态</p>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤数组。支持的Name：<br>BindingStatus 绑定状态</p>
     * @param Filters <p>过滤数组。支持的Name：<br>BindingStatus 绑定状态</p>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>所属成员 AppId</p> 
     * @return OwnerAppIds <p>所属成员 AppId</p>
     */
    public Long [] getOwnerAppIds() {
        return this.OwnerAppIds;
    }

    /**
     * Set <p>所属成员 AppId</p>
     * @param OwnerAppIds <p>所属成员 AppId</p>
     */
    public void setOwnerAppIds(Long [] OwnerAppIds) {
        this.OwnerAppIds = OwnerAppIds;
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
        if (source.AccountIdSet != null) {
            this.AccountIdSet = new Long[source.AccountIdSet.length];
            for (int i = 0; i < source.AccountIdSet.length; i++) {
                this.AccountIdSet[i] = new Long(source.AccountIdSet[i]);
            }
        }
        if (source.ProviderTypeSet != null) {
            this.ProviderTypeSet = new Long[source.ProviderTypeSet.length];
            for (int i = 0; i < source.ProviderTypeSet.length; i++) {
                this.ProviderTypeSet[i] = new Long(source.ProviderTypeSet[i]);
            }
        }
        if (source.CloudDeviceStatusSet != null) {
            this.CloudDeviceStatusSet = new Long[source.CloudDeviceStatusSet.length];
            for (int i = 0; i < source.CloudDeviceStatusSet.length; i++) {
                this.CloudDeviceStatusSet[i] = new Long(source.CloudDeviceStatusSet[i]);
            }
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
        if (source.OwnerAppIds != null) {
            this.OwnerAppIds = new Long[source.OwnerAppIds.length];
            for (int i = 0; i < source.OwnerAppIds.length; i++) {
                this.OwnerAppIds[i] = new Long(source.OwnerAppIds[i]);
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
        this.setParamArraySimple(map, prefix + "AccountIdSet.", this.AccountIdSet);
        this.setParamArraySimple(map, prefix + "ProviderTypeSet.", this.ProviderTypeSet);
        this.setParamArraySimple(map, prefix + "CloudDeviceStatusSet.", this.CloudDeviceStatusSet);
        this.setParamArrayObj(map, prefix + "TagFilters.", this.TagFilters);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArraySimple(map, prefix + "OwnerAppIds.", this.OwnerAppIds);

    }
}

