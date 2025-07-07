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

public class Domain extends AbstractModel {

    /**
    * 自增id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 网络域id
    */
    @SerializedName("DomainId")
    @Expose
    private String DomainId;

    /**
    * 网络域名称
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * 堡垒机id
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * ip，网段
    */
    @SerializedName("WhiteIpSet")
    @Expose
    private String [] WhiteIpSet;

    /**
    * 是否启用  默认 1启用 0禁用
    */
    @SerializedName("Enabled")
    @Expose
    private Long Enabled;

    /**
    * 状态 0-已断开  1-已连接
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 网络域创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 是否资源默认网络域 1-资源默认网络域 0-用户添加网络域
    */
    @SerializedName("Default")
    @Expose
    private Long Default;

    /**
     * Get 自增id 
     * @return Id 自增id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 自增id
     * @param Id 自增id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 网络域id 
     * @return DomainId 网络域id
     */
    public String getDomainId() {
        return this.DomainId;
    }

    /**
     * Set 网络域id
     * @param DomainId 网络域id
     */
    public void setDomainId(String DomainId) {
        this.DomainId = DomainId;
    }

    /**
     * Get 网络域名称 
     * @return DomainName 网络域名称
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set 网络域名称
     * @param DomainName 网络域名称
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get 堡垒机id 
     * @return ResourceId 堡垒机id
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 堡垒机id
     * @param ResourceId 堡垒机id
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get ip，网段 
     * @return WhiteIpSet ip，网段
     */
    public String [] getWhiteIpSet() {
        return this.WhiteIpSet;
    }

    /**
     * Set ip，网段
     * @param WhiteIpSet ip，网段
     */
    public void setWhiteIpSet(String [] WhiteIpSet) {
        this.WhiteIpSet = WhiteIpSet;
    }

    /**
     * Get 是否启用  默认 1启用 0禁用 
     * @return Enabled 是否启用  默认 1启用 0禁用
     */
    public Long getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 是否启用  默认 1启用 0禁用
     * @param Enabled 是否启用  默认 1启用 0禁用
     */
    public void setEnabled(Long Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get 状态 0-已断开  1-已连接 
     * @return Status 状态 0-已断开  1-已连接
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态 0-已断开  1-已连接
     * @param Status 状态 0-已断开  1-已连接
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 网络域创建时间 
     * @return CreateTime 网络域创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 网络域创建时间
     * @param CreateTime 网络域创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 是否资源默认网络域 1-资源默认网络域 0-用户添加网络域 
     * @return Default 是否资源默认网络域 1-资源默认网络域 0-用户添加网络域
     */
    public Long getDefault() {
        return this.Default;
    }

    /**
     * Set 是否资源默认网络域 1-资源默认网络域 0-用户添加网络域
     * @param Default 是否资源默认网络域 1-资源默认网络域 0-用户添加网络域
     */
    public void setDefault(Long Default) {
        this.Default = Default;
    }

    public Domain() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Domain(Domain source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.DomainId != null) {
            this.DomainId = new String(source.DomainId);
        }
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.WhiteIpSet != null) {
            this.WhiteIpSet = new String[source.WhiteIpSet.length];
            for (int i = 0; i < source.WhiteIpSet.length; i++) {
                this.WhiteIpSet[i] = new String(source.WhiteIpSet[i]);
            }
        }
        if (source.Enabled != null) {
            this.Enabled = new Long(source.Enabled);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Default != null) {
            this.Default = new Long(source.Default);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamArraySimple(map, prefix + "WhiteIpSet.", this.WhiteIpSet);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Default", this.Default);

    }
}

