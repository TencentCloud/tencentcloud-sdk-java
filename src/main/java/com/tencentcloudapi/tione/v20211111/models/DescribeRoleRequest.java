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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRoleRequest extends AbstractModel {

    /**
    * <p>TI工作空间ID</p><p>使用非默认空间必须填写工作空间ID，使用默认空间无需填写工作空间ID。</p>
    */
    @SerializedName("TiProjectId")
    @Expose
    private String TiProjectId;

    /**
    * <p>角色ID</p>
    */
    @SerializedName("RoleId")
    @Expose
    private String RoleId;

    /**
    * <p>资源类型</p>
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * <p>偏移值</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>分页数量</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>过滤条件</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get <p>TI工作空间ID</p><p>使用非默认空间必须填写工作空间ID，使用默认空间无需填写工作空间ID。</p> 
     * @return TiProjectId <p>TI工作空间ID</p><p>使用非默认空间必须填写工作空间ID，使用默认空间无需填写工作空间ID。</p>
     */
    public String getTiProjectId() {
        return this.TiProjectId;
    }

    /**
     * Set <p>TI工作空间ID</p><p>使用非默认空间必须填写工作空间ID，使用默认空间无需填写工作空间ID。</p>
     * @param TiProjectId <p>TI工作空间ID</p><p>使用非默认空间必须填写工作空间ID，使用默认空间无需填写工作空间ID。</p>
     */
    public void setTiProjectId(String TiProjectId) {
        this.TiProjectId = TiProjectId;
    }

    /**
     * Get <p>角色ID</p> 
     * @return RoleId <p>角色ID</p>
     */
    public String getRoleId() {
        return this.RoleId;
    }

    /**
     * Set <p>角色ID</p>
     * @param RoleId <p>角色ID</p>
     */
    public void setRoleId(String RoleId) {
        this.RoleId = RoleId;
    }

    /**
     * Get <p>资源类型</p> 
     * @return ResourceType <p>资源类型</p>
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set <p>资源类型</p>
     * @param ResourceType <p>资源类型</p>
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get <p>偏移值</p> 
     * @return Offset <p>偏移值</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移值</p>
     * @param Offset <p>偏移值</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>分页数量</p> 
     * @return Limit <p>分页数量</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>分页数量</p>
     * @param Limit <p>分页数量</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>过滤条件</p> 
     * @return Filters <p>过滤条件</p>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤条件</p>
     * @param Filters <p>过滤条件</p>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeRoleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRoleRequest(DescribeRoleRequest source) {
        if (source.TiProjectId != null) {
            this.TiProjectId = new String(source.TiProjectId);
        }
        if (source.RoleId != null) {
            this.RoleId = new String(source.RoleId);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
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
        this.setParamSimple(map, prefix + "TiProjectId", this.TiProjectId);
        this.setParamSimple(map, prefix + "RoleId", this.RoleId);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

