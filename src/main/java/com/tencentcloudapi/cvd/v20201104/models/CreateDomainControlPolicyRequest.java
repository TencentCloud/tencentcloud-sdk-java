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
package com.tencentcloudapi.cvd.v20201104.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDomainControlPolicyRequest extends AbstractModel {

    /**
    * <p>策略名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>策略描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>策略类型，取值范围[&quot;WHITE&quot;,&quot;BLACK&quot;]，WHITE - 白名单策略；BLACK - 黑名单策略；默认 值为BLACK</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>域名控制规则详情</p>
    */
    @SerializedName("DetailSet")
    @Expose
    private DomainControlDetail [] DetailSet;

    /**
    * <p>IP控制规则详情</p>
    */
    @SerializedName("IpDetailSet")
    @Expose
    private IpControlDetail [] IpDetailSet;

    /**
    * <p>作用到的实例列表</p>
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
     * Get <p>策略名称</p> 
     * @return Name <p>策略名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>策略名称</p>
     * @param Name <p>策略名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>策略描述</p> 
     * @return Description <p>策略描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>策略描述</p>
     * @param Description <p>策略描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>策略类型，取值范围[&quot;WHITE&quot;,&quot;BLACK&quot;]，WHITE - 白名单策略；BLACK - 黑名单策略；默认 值为BLACK</p> 
     * @return Type <p>策略类型，取值范围[&quot;WHITE&quot;,&quot;BLACK&quot;]，WHITE - 白名单策略；BLACK - 黑名单策略；默认 值为BLACK</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>策略类型，取值范围[&quot;WHITE&quot;,&quot;BLACK&quot;]，WHITE - 白名单策略；BLACK - 黑名单策略；默认 值为BLACK</p>
     * @param Type <p>策略类型，取值范围[&quot;WHITE&quot;,&quot;BLACK&quot;]，WHITE - 白名单策略；BLACK - 黑名单策略；默认 值为BLACK</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>域名控制规则详情</p> 
     * @return DetailSet <p>域名控制规则详情</p>
     */
    public DomainControlDetail [] getDetailSet() {
        return this.DetailSet;
    }

    /**
     * Set <p>域名控制规则详情</p>
     * @param DetailSet <p>域名控制规则详情</p>
     */
    public void setDetailSet(DomainControlDetail [] DetailSet) {
        this.DetailSet = DetailSet;
    }

    /**
     * Get <p>IP控制规则详情</p> 
     * @return IpDetailSet <p>IP控制规则详情</p>
     */
    public IpControlDetail [] getIpDetailSet() {
        return this.IpDetailSet;
    }

    /**
     * Set <p>IP控制规则详情</p>
     * @param IpDetailSet <p>IP控制规则详情</p>
     */
    public void setIpDetailSet(IpControlDetail [] IpDetailSet) {
        this.IpDetailSet = IpDetailSet;
    }

    /**
     * Get <p>作用到的实例列表</p> 
     * @return InstanceIds <p>作用到的实例列表</p>
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set <p>作用到的实例列表</p>
     * @param InstanceIds <p>作用到的实例列表</p>
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    public CreateDomainControlPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDomainControlPolicyRequest(CreateDomainControlPolicyRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.DetailSet != null) {
            this.DetailSet = new DomainControlDetail[source.DetailSet.length];
            for (int i = 0; i < source.DetailSet.length; i++) {
                this.DetailSet[i] = new DomainControlDetail(source.DetailSet[i]);
            }
        }
        if (source.IpDetailSet != null) {
            this.IpDetailSet = new IpControlDetail[source.IpDetailSet.length];
            for (int i = 0; i < source.IpDetailSet.length; i++) {
                this.IpDetailSet[i] = new IpControlDetail(source.IpDetailSet[i]);
            }
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "DetailSet.", this.DetailSet);
        this.setParamArrayObj(map, prefix + "IpDetailSet.", this.IpDetailSet);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);

    }
}

