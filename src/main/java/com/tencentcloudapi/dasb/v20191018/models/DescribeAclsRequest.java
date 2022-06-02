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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAclsRequest extends AbstractModel{

    /**
    * 访问权限ID集合
    */
    @SerializedName("IdSet")
    @Expose
    private Long [] IdSet;

    /**
    * 访问权限名称，模糊查询，最长64字符
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 分页偏移位置
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 每页条目数量，默认20，最大500
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 是否根据Name进行精确查询，默认值false
    */
    @SerializedName("Exact")
    @Expose
    private Boolean Exact;

    /**
    * 有访问权限的用户ID集合
    */
    @SerializedName("AuthorizedUserIdSet")
    @Expose
    private Long [] AuthorizedUserIdSet;

    /**
    * 有访问权限的资产ID集合
    */
    @SerializedName("AuthorizedDeviceIdSet")
    @Expose
    private Long [] AuthorizedDeviceIdSet;

    /**
    * 访问权限状态，1 - 已生效，2 - 未生效，3 - 已过期
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 访问权限ID集合 
     * @return IdSet 访问权限ID集合
     */
    public Long [] getIdSet() {
        return this.IdSet;
    }

    /**
     * Set 访问权限ID集合
     * @param IdSet 访问权限ID集合
     */
    public void setIdSet(Long [] IdSet) {
        this.IdSet = IdSet;
    }

    /**
     * Get 访问权限名称，模糊查询，最长64字符 
     * @return Name 访问权限名称，模糊查询，最长64字符
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 访问权限名称，模糊查询，最长64字符
     * @param Name 访问权限名称，模糊查询，最长64字符
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 分页偏移位置 
     * @return Offset 分页偏移位置
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移位置
     * @param Offset 分页偏移位置
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 每页条目数量，默认20，最大500 
     * @return Limit 每页条目数量，默认20，最大500
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页条目数量，默认20，最大500
     * @param Limit 每页条目数量，默认20，最大500
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 是否根据Name进行精确查询，默认值false 
     * @return Exact 是否根据Name进行精确查询，默认值false
     */
    public Boolean getExact() {
        return this.Exact;
    }

    /**
     * Set 是否根据Name进行精确查询，默认值false
     * @param Exact 是否根据Name进行精确查询，默认值false
     */
    public void setExact(Boolean Exact) {
        this.Exact = Exact;
    }

    /**
     * Get 有访问权限的用户ID集合 
     * @return AuthorizedUserIdSet 有访问权限的用户ID集合
     */
    public Long [] getAuthorizedUserIdSet() {
        return this.AuthorizedUserIdSet;
    }

    /**
     * Set 有访问权限的用户ID集合
     * @param AuthorizedUserIdSet 有访问权限的用户ID集合
     */
    public void setAuthorizedUserIdSet(Long [] AuthorizedUserIdSet) {
        this.AuthorizedUserIdSet = AuthorizedUserIdSet;
    }

    /**
     * Get 有访问权限的资产ID集合 
     * @return AuthorizedDeviceIdSet 有访问权限的资产ID集合
     */
    public Long [] getAuthorizedDeviceIdSet() {
        return this.AuthorizedDeviceIdSet;
    }

    /**
     * Set 有访问权限的资产ID集合
     * @param AuthorizedDeviceIdSet 有访问权限的资产ID集合
     */
    public void setAuthorizedDeviceIdSet(Long [] AuthorizedDeviceIdSet) {
        this.AuthorizedDeviceIdSet = AuthorizedDeviceIdSet;
    }

    /**
     * Get 访问权限状态，1 - 已生效，2 - 未生效，3 - 已过期 
     * @return Status 访问权限状态，1 - 已生效，2 - 未生效，3 - 已过期
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 访问权限状态，1 - 已生效，2 - 未生效，3 - 已过期
     * @param Status 访问权限状态，1 - 已生效，2 - 未生效，3 - 已过期
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public DescribeAclsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAclsRequest(DescribeAclsRequest source) {
        if (source.IdSet != null) {
            this.IdSet = new Long[source.IdSet.length];
            for (int i = 0; i < source.IdSet.length; i++) {
                this.IdSet[i] = new Long(source.IdSet[i]);
            }
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Exact != null) {
            this.Exact = new Boolean(source.Exact);
        }
        if (source.AuthorizedUserIdSet != null) {
            this.AuthorizedUserIdSet = new Long[source.AuthorizedUserIdSet.length];
            for (int i = 0; i < source.AuthorizedUserIdSet.length; i++) {
                this.AuthorizedUserIdSet[i] = new Long(source.AuthorizedUserIdSet[i]);
            }
        }
        if (source.AuthorizedDeviceIdSet != null) {
            this.AuthorizedDeviceIdSet = new Long[source.AuthorizedDeviceIdSet.length];
            for (int i = 0; i < source.AuthorizedDeviceIdSet.length; i++) {
                this.AuthorizedDeviceIdSet[i] = new Long(source.AuthorizedDeviceIdSet[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "IdSet.", this.IdSet);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Exact", this.Exact);
        this.setParamArraySimple(map, prefix + "AuthorizedUserIdSet.", this.AuthorizedUserIdSet);
        this.setParamArraySimple(map, prefix + "AuthorizedDeviceIdSet.", this.AuthorizedDeviceIdSet);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

