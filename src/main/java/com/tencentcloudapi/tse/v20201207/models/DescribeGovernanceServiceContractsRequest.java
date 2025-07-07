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

public class DescribeGovernanceServiceContractsRequest extends AbstractModel {

    /**
    * 北极星引擎实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 分页偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页条数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 命名空间
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 服务名
    */
    @SerializedName("Service")
    @Expose
    private String Service;

    /**
    * 契约名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 契约版本
    */
    @SerializedName("ContractVersion")
    @Expose
    private String ContractVersion;

    /**
    * 契约协议
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 是否只展示基本信息
    */
    @SerializedName("Brief")
    @Expose
    private Boolean Brief;

    /**
     * Get 北极星引擎实例ID 
     * @return InstanceId 北极星引擎实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 北极星引擎实例ID
     * @param InstanceId 北极星引擎实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 分页偏移量 
     * @return Offset 分页偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量
     * @param Offset 分页偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页条数 
     * @return Limit 分页条数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页条数
     * @param Limit 分页条数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 命名空间 
     * @return Namespace 命名空间
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间
     * @param Namespace 命名空间
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 服务名 
     * @return Service 服务名
     */
    public String getService() {
        return this.Service;
    }

    /**
     * Set 服务名
     * @param Service 服务名
     */
    public void setService(String Service) {
        this.Service = Service;
    }

    /**
     * Get 契约名称 
     * @return Name 契约名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 契约名称
     * @param Name 契约名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 契约版本 
     * @return ContractVersion 契约版本
     */
    public String getContractVersion() {
        return this.ContractVersion;
    }

    /**
     * Set 契约版本
     * @param ContractVersion 契约版本
     */
    public void setContractVersion(String ContractVersion) {
        this.ContractVersion = ContractVersion;
    }

    /**
     * Get 契约协议 
     * @return Protocol 契约协议
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 契约协议
     * @param Protocol 契约协议
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 是否只展示基本信息 
     * @return Brief 是否只展示基本信息
     */
    public Boolean getBrief() {
        return this.Brief;
    }

    /**
     * Set 是否只展示基本信息
     * @param Brief 是否只展示基本信息
     */
    public void setBrief(Boolean Brief) {
        this.Brief = Brief;
    }

    public DescribeGovernanceServiceContractsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGovernanceServiceContractsRequest(DescribeGovernanceServiceContractsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Service != null) {
            this.Service = new String(source.Service);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ContractVersion != null) {
            this.ContractVersion = new String(source.ContractVersion);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Brief != null) {
            this.Brief = new Boolean(source.Brief);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Service", this.Service);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ContractVersion", this.ContractVersion);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Brief", this.Brief);

    }
}

