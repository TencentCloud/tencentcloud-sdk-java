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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListSkillsRequest extends AbstractModel {

    /**
    * <p>TCR实例ID</p>
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * <p>模糊查询</p>
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
    * <p>技能名称</p>
    */
    @SerializedName("SkillName")
    @Expose
    private String SkillName;

    /**
    * <p>技能类型</p><p>枚举值：</p><ul><li>MCP Server： MCP Server 类型</li></ul>
    */
    @SerializedName("SkillType")
    @Expose
    private String SkillType;

    /**
    * <p>状态</p><p>枚举值：</p><ul><li>active： 活跃</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>偏移量</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>限制</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get <p>TCR实例ID</p> 
     * @return RegistryId <p>TCR实例ID</p>
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set <p>TCR实例ID</p>
     * @param RegistryId <p>TCR实例ID</p>
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get <p>模糊查询</p> 
     * @return SearchKey <p>模糊查询</p>
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * Set <p>模糊查询</p>
     * @param SearchKey <p>模糊查询</p>
     */
    public void setSearchKey(String SearchKey) {
        this.SearchKey = SearchKey;
    }

    /**
     * Get <p>技能名称</p> 
     * @return SkillName <p>技能名称</p>
     */
    public String getSkillName() {
        return this.SkillName;
    }

    /**
     * Set <p>技能名称</p>
     * @param SkillName <p>技能名称</p>
     */
    public void setSkillName(String SkillName) {
        this.SkillName = SkillName;
    }

    /**
     * Get <p>技能类型</p><p>枚举值：</p><ul><li>MCP Server： MCP Server 类型</li></ul> 
     * @return SkillType <p>技能类型</p><p>枚举值：</p><ul><li>MCP Server： MCP Server 类型</li></ul>
     */
    public String getSkillType() {
        return this.SkillType;
    }

    /**
     * Set <p>技能类型</p><p>枚举值：</p><ul><li>MCP Server： MCP Server 类型</li></ul>
     * @param SkillType <p>技能类型</p><p>枚举值：</p><ul><li>MCP Server： MCP Server 类型</li></ul>
     */
    public void setSkillType(String SkillType) {
        this.SkillType = SkillType;
    }

    /**
     * Get <p>状态</p><p>枚举值：</p><ul><li>active： 活跃</li></ul> 
     * @return Status <p>状态</p><p>枚举值：</p><ul><li>active： 活跃</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态</p><p>枚举值：</p><ul><li>active： 活跃</li></ul>
     * @param Status <p>状态</p><p>枚举值：</p><ul><li>active： 活跃</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>偏移量</p> 
     * @return Offset <p>偏移量</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量</p>
     * @param Offset <p>偏移量</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>限制</p> 
     * @return Limit <p>限制</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>限制</p>
     * @param Limit <p>限制</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public ListSkillsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListSkillsRequest(ListSkillsRequest source) {
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.SearchKey != null) {
            this.SearchKey = new String(source.SearchKey);
        }
        if (source.SkillName != null) {
            this.SkillName = new String(source.SkillName);
        }
        if (source.SkillType != null) {
            this.SkillType = new String(source.SkillType);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "SearchKey", this.SearchKey);
        this.setParamSimple(map, prefix + "SkillName", this.SkillName);
        this.setParamSimple(map, prefix + "SkillType", this.SkillType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

