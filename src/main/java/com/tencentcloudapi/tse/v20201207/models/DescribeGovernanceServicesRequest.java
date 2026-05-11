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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeGovernanceServicesRequest extends AbstractModel {

    /**
    * <p>按照服务名过滤，精确匹配。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>按照命名空间过滤，精确匹配。</p>
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * <p>使用元数据过滤，目前只支持一组元组数，若传了多条，只会使用第一条元数据过滤。</p>
    */
    @SerializedName("Metadatas")
    @Expose
    private Metadata [] Metadatas;

    /**
    * <p>偏移量，默认为0。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>返回数量，默认为20，最大值为100。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>tse 实例 id。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>服务所属部门。</p>
    */
    @SerializedName("Department")
    @Expose
    private String Department;

    /**
    * <p>服务所属业务。</p>
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * <p>服务中实例的ip，用来过滤服务。</p>
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * <p>是否只查询存在健康实例的服务</p>
    */
    @SerializedName("OnlyExistHealthyInstance")
    @Expose
    private Boolean OnlyExistHealthyInstance;

    /**
    * <p>是否开启同步到全局注册中心</p>
    */
    @SerializedName("SyncToGlobalRegistry")
    @Expose
    private String SyncToGlobalRegistry;

    /**
    * <p>过滤筛选条件</p>
    */
    @SerializedName("StatusFilter")
    @Expose
    private Filter [] StatusFilter;

    /**
    * <p>服务类型</p><p>枚举值：</p><ul><li>0： 微服务（默认）</li><li>1： MCP Server</li><li>2： AI Agent</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
     * Get <p>按照服务名过滤，精确匹配。</p> 
     * @return Name <p>按照服务名过滤，精确匹配。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>按照服务名过滤，精确匹配。</p>
     * @param Name <p>按照服务名过滤，精确匹配。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>按照命名空间过滤，精确匹配。</p> 
     * @return Namespace <p>按照命名空间过滤，精确匹配。</p>
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set <p>按照命名空间过滤，精确匹配。</p>
     * @param Namespace <p>按照命名空间过滤，精确匹配。</p>
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get <p>使用元数据过滤，目前只支持一组元组数，若传了多条，只会使用第一条元数据过滤。</p> 
     * @return Metadatas <p>使用元数据过滤，目前只支持一组元组数，若传了多条，只会使用第一条元数据过滤。</p>
     */
    public Metadata [] getMetadatas() {
        return this.Metadatas;
    }

    /**
     * Set <p>使用元数据过滤，目前只支持一组元组数，若传了多条，只会使用第一条元数据过滤。</p>
     * @param Metadatas <p>使用元数据过滤，目前只支持一组元组数，若传了多条，只会使用第一条元数据过滤。</p>
     */
    public void setMetadatas(Metadata [] Metadatas) {
        this.Metadatas = Metadatas;
    }

    /**
     * Get <p>偏移量，默认为0。</p> 
     * @return Offset <p>偏移量，默认为0。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量，默认为0。</p>
     * @param Offset <p>偏移量，默认为0。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>返回数量，默认为20，最大值为100。</p> 
     * @return Limit <p>返回数量，默认为20，最大值为100。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>返回数量，默认为20，最大值为100。</p>
     * @param Limit <p>返回数量，默认为20，最大值为100。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>tse 实例 id。</p> 
     * @return InstanceId <p>tse 实例 id。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>tse 实例 id。</p>
     * @param InstanceId <p>tse 实例 id。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>服务所属部门。</p> 
     * @return Department <p>服务所属部门。</p>
     */
    public String getDepartment() {
        return this.Department;
    }

    /**
     * Set <p>服务所属部门。</p>
     * @param Department <p>服务所属部门。</p>
     */
    public void setDepartment(String Department) {
        this.Department = Department;
    }

    /**
     * Get <p>服务所属业务。</p> 
     * @return Business <p>服务所属业务。</p>
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set <p>服务所属业务。</p>
     * @param Business <p>服务所属业务。</p>
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * Get <p>服务中实例的ip，用来过滤服务。</p> 
     * @return Host <p>服务中实例的ip，用来过滤服务。</p>
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set <p>服务中实例的ip，用来过滤服务。</p>
     * @param Host <p>服务中实例的ip，用来过滤服务。</p>
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get <p>是否只查询存在健康实例的服务</p> 
     * @return OnlyExistHealthyInstance <p>是否只查询存在健康实例的服务</p>
     */
    public Boolean getOnlyExistHealthyInstance() {
        return this.OnlyExistHealthyInstance;
    }

    /**
     * Set <p>是否只查询存在健康实例的服务</p>
     * @param OnlyExistHealthyInstance <p>是否只查询存在健康实例的服务</p>
     */
    public void setOnlyExistHealthyInstance(Boolean OnlyExistHealthyInstance) {
        this.OnlyExistHealthyInstance = OnlyExistHealthyInstance;
    }

    /**
     * Get <p>是否开启同步到全局注册中心</p> 
     * @return SyncToGlobalRegistry <p>是否开启同步到全局注册中心</p>
     */
    public String getSyncToGlobalRegistry() {
        return this.SyncToGlobalRegistry;
    }

    /**
     * Set <p>是否开启同步到全局注册中心</p>
     * @param SyncToGlobalRegistry <p>是否开启同步到全局注册中心</p>
     */
    public void setSyncToGlobalRegistry(String SyncToGlobalRegistry) {
        this.SyncToGlobalRegistry = SyncToGlobalRegistry;
    }

    /**
     * Get <p>过滤筛选条件</p> 
     * @return StatusFilter <p>过滤筛选条件</p>
     */
    public Filter [] getStatusFilter() {
        return this.StatusFilter;
    }

    /**
     * Set <p>过滤筛选条件</p>
     * @param StatusFilter <p>过滤筛选条件</p>
     */
    public void setStatusFilter(Filter [] StatusFilter) {
        this.StatusFilter = StatusFilter;
    }

    /**
     * Get <p>服务类型</p><p>枚举值：</p><ul><li>0： 微服务（默认）</li><li>1： MCP Server</li><li>2： AI Agent</li></ul> 
     * @return Type <p>服务类型</p><p>枚举值：</p><ul><li>0： 微服务（默认）</li><li>1： MCP Server</li><li>2： AI Agent</li></ul>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>服务类型</p><p>枚举值：</p><ul><li>0： 微服务（默认）</li><li>1： MCP Server</li><li>2： AI Agent</li></ul>
     * @param Type <p>服务类型</p><p>枚举值：</p><ul><li>0： 微服务（默认）</li><li>1： MCP Server</li><li>2： AI Agent</li></ul>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    public DescribeGovernanceServicesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGovernanceServicesRequest(DescribeGovernanceServicesRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Metadatas != null) {
            this.Metadatas = new Metadata[source.Metadatas.length];
            for (int i = 0; i < source.Metadatas.length; i++) {
                this.Metadatas[i] = new Metadata(source.Metadatas[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Department != null) {
            this.Department = new String(source.Department);
        }
        if (source.Business != null) {
            this.Business = new String(source.Business);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.OnlyExistHealthyInstance != null) {
            this.OnlyExistHealthyInstance = new Boolean(source.OnlyExistHealthyInstance);
        }
        if (source.SyncToGlobalRegistry != null) {
            this.SyncToGlobalRegistry = new String(source.SyncToGlobalRegistry);
        }
        if (source.StatusFilter != null) {
            this.StatusFilter = new Filter[source.StatusFilter.length];
            for (int i = 0; i < source.StatusFilter.length; i++) {
                this.StatusFilter[i] = new Filter(source.StatusFilter[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamArrayObj(map, prefix + "Metadatas.", this.Metadatas);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Department", this.Department);
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "OnlyExistHealthyInstance", this.OnlyExistHealthyInstance);
        this.setParamSimple(map, prefix + "SyncToGlobalRegistry", this.SyncToGlobalRegistry);
        this.setParamArrayObj(map, prefix + "StatusFilter.", this.StatusFilter);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

