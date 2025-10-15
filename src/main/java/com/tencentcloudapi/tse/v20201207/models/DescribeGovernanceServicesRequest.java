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
    * 按照服务名过滤，精确匹配。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 按照命名空间过滤，精确匹配。
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 使用元数据过滤，目前只支持一组元组数，若传了多条，只会使用第一条元数据过滤。
    */
    @SerializedName("Metadatas")
    @Expose
    private Metadata [] Metadatas;

    /**
    * 偏移量，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量，默认为20，最大值为100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * tse 实例 id。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 服务所属部门。
    */
    @SerializedName("Department")
    @Expose
    private String Department;

    /**
    * 服务所属业务。
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * 服务中实例的ip，用来过滤服务。
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * 是否只查询存在健康实例的服务
    */
    @SerializedName("OnlyExistHealthyInstance")
    @Expose
    private Boolean OnlyExistHealthyInstance;

    /**
    * 是否开启同步到全局注册中心	
    */
    @SerializedName("SyncToGlobalRegistry")
    @Expose
    private String SyncToGlobalRegistry;

    /**
    * 过滤筛选条件
    */
    @SerializedName("StatusFilter")
    @Expose
    private Filter [] StatusFilter;

    /**
     * Get 按照服务名过滤，精确匹配。 
     * @return Name 按照服务名过滤，精确匹配。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 按照服务名过滤，精确匹配。
     * @param Name 按照服务名过滤，精确匹配。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 按照命名空间过滤，精确匹配。 
     * @return Namespace 按照命名空间过滤，精确匹配。
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 按照命名空间过滤，精确匹配。
     * @param Namespace 按照命名空间过滤，精确匹配。
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 使用元数据过滤，目前只支持一组元组数，若传了多条，只会使用第一条元数据过滤。 
     * @return Metadatas 使用元数据过滤，目前只支持一组元组数，若传了多条，只会使用第一条元数据过滤。
     */
    public Metadata [] getMetadatas() {
        return this.Metadatas;
    }

    /**
     * Set 使用元数据过滤，目前只支持一组元组数，若传了多条，只会使用第一条元数据过滤。
     * @param Metadatas 使用元数据过滤，目前只支持一组元组数，若传了多条，只会使用第一条元数据过滤。
     */
    public void setMetadatas(Metadata [] Metadatas) {
        this.Metadatas = Metadatas;
    }

    /**
     * Get 偏移量，默认为0。 
     * @return Offset 偏移量，默认为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0。
     * @param Offset 偏移量，默认为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量，默认为20，最大值为100。 
     * @return Limit 返回数量，默认为20，最大值为100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为20，最大值为100。
     * @param Limit 返回数量，默认为20，最大值为100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get tse 实例 id。 
     * @return InstanceId tse 实例 id。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set tse 实例 id。
     * @param InstanceId tse 实例 id。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 服务所属部门。 
     * @return Department 服务所属部门。
     */
    public String getDepartment() {
        return this.Department;
    }

    /**
     * Set 服务所属部门。
     * @param Department 服务所属部门。
     */
    public void setDepartment(String Department) {
        this.Department = Department;
    }

    /**
     * Get 服务所属业务。 
     * @return Business 服务所属业务。
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set 服务所属业务。
     * @param Business 服务所属业务。
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * Get 服务中实例的ip，用来过滤服务。 
     * @return Host 服务中实例的ip，用来过滤服务。
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set 服务中实例的ip，用来过滤服务。
     * @param Host 服务中实例的ip，用来过滤服务。
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get 是否只查询存在健康实例的服务 
     * @return OnlyExistHealthyInstance 是否只查询存在健康实例的服务
     */
    public Boolean getOnlyExistHealthyInstance() {
        return this.OnlyExistHealthyInstance;
    }

    /**
     * Set 是否只查询存在健康实例的服务
     * @param OnlyExistHealthyInstance 是否只查询存在健康实例的服务
     */
    public void setOnlyExistHealthyInstance(Boolean OnlyExistHealthyInstance) {
        this.OnlyExistHealthyInstance = OnlyExistHealthyInstance;
    }

    /**
     * Get 是否开启同步到全局注册中心	 
     * @return SyncToGlobalRegistry 是否开启同步到全局注册中心	
     */
    public String getSyncToGlobalRegistry() {
        return this.SyncToGlobalRegistry;
    }

    /**
     * Set 是否开启同步到全局注册中心	
     * @param SyncToGlobalRegistry 是否开启同步到全局注册中心	
     */
    public void setSyncToGlobalRegistry(String SyncToGlobalRegistry) {
        this.SyncToGlobalRegistry = SyncToGlobalRegistry;
    }

    /**
     * Get 过滤筛选条件 
     * @return StatusFilter 过滤筛选条件
     */
    public Filter [] getStatusFilter() {
        return this.StatusFilter;
    }

    /**
     * Set 过滤筛选条件
     * @param StatusFilter 过滤筛选条件
     */
    public void setStatusFilter(Filter [] StatusFilter) {
        this.StatusFilter = StatusFilter;
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

    }
}

