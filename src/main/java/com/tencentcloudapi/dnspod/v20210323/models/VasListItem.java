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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VasListItem extends AbstractModel {

    /**
    * 规格总数
    */
    @SerializedName("LimitNumber")
    @Expose
    private Long LimitNumber;

    /**
    * 购买时间
    */
    @SerializedName("StartedAt")
    @Expose
    private String StartedAt;

    /**
    * 到期时间
    */
    @SerializedName("EndedAt")
    @Expose
    private String EndedAt;

    /**
    * 资源唯一 ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 自动续费标识
    */
    @SerializedName("AutoRenew")
    @Expose
    private String AutoRenew;

    /**
    * 已绑定的域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 绑定类型
    */
    @SerializedName("BindType")
    @Expose
    private String BindType;

    /**
    * 增值服务类型
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 增值服务名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 是否可续费
    */
    @SerializedName("CanRenew")
    @Expose
    private Boolean CanRenew;

    /**
    * 是否只允许付费套餐域名可购买
    */
    @SerializedName("VipDomain")
    @Expose
    private Boolean VipDomain;

    /**
     * Get 规格总数 
     * @return LimitNumber 规格总数
     */
    public Long getLimitNumber() {
        return this.LimitNumber;
    }

    /**
     * Set 规格总数
     * @param LimitNumber 规格总数
     */
    public void setLimitNumber(Long LimitNumber) {
        this.LimitNumber = LimitNumber;
    }

    /**
     * Get 购买时间 
     * @return StartedAt 购买时间
     */
    public String getStartedAt() {
        return this.StartedAt;
    }

    /**
     * Set 购买时间
     * @param StartedAt 购买时间
     */
    public void setStartedAt(String StartedAt) {
        this.StartedAt = StartedAt;
    }

    /**
     * Get 到期时间 
     * @return EndedAt 到期时间
     */
    public String getEndedAt() {
        return this.EndedAt;
    }

    /**
     * Set 到期时间
     * @param EndedAt 到期时间
     */
    public void setEndedAt(String EndedAt) {
        this.EndedAt = EndedAt;
    }

    /**
     * Get 资源唯一 ID 
     * @return ResourceId 资源唯一 ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源唯一 ID
     * @param ResourceId 资源唯一 ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 自动续费标识 
     * @return AutoRenew 自动续费标识
     */
    public String getAutoRenew() {
        return this.AutoRenew;
    }

    /**
     * Set 自动续费标识
     * @param AutoRenew 自动续费标识
     */
    public void setAutoRenew(String AutoRenew) {
        this.AutoRenew = AutoRenew;
    }

    /**
     * Get 已绑定的域名 
     * @return Domain 已绑定的域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 已绑定的域名
     * @param Domain 已绑定的域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 绑定类型 
     * @return BindType 绑定类型
     */
    public String getBindType() {
        return this.BindType;
    }

    /**
     * Set 绑定类型
     * @param BindType 绑定类型
     */
    public void setBindType(String BindType) {
        this.BindType = BindType;
    }

    /**
     * Get 增值服务类型 
     * @return Key 增值服务类型
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 增值服务类型
     * @param Key 增值服务类型
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 增值服务名 
     * @return Name 增值服务名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 增值服务名
     * @param Name 增值服务名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 是否可续费 
     * @return CanRenew 是否可续费
     */
    public Boolean getCanRenew() {
        return this.CanRenew;
    }

    /**
     * Set 是否可续费
     * @param CanRenew 是否可续费
     */
    public void setCanRenew(Boolean CanRenew) {
        this.CanRenew = CanRenew;
    }

    /**
     * Get 是否只允许付费套餐域名可购买 
     * @return VipDomain 是否只允许付费套餐域名可购买
     */
    public Boolean getVipDomain() {
        return this.VipDomain;
    }

    /**
     * Set 是否只允许付费套餐域名可购买
     * @param VipDomain 是否只允许付费套餐域名可购买
     */
    public void setVipDomain(Boolean VipDomain) {
        this.VipDomain = VipDomain;
    }

    public VasListItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VasListItem(VasListItem source) {
        if (source.LimitNumber != null) {
            this.LimitNumber = new Long(source.LimitNumber);
        }
        if (source.StartedAt != null) {
            this.StartedAt = new String(source.StartedAt);
        }
        if (source.EndedAt != null) {
            this.EndedAt = new String(source.EndedAt);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.AutoRenew != null) {
            this.AutoRenew = new String(source.AutoRenew);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.BindType != null) {
            this.BindType = new String(source.BindType);
        }
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.CanRenew != null) {
            this.CanRenew = new Boolean(source.CanRenew);
        }
        if (source.VipDomain != null) {
            this.VipDomain = new Boolean(source.VipDomain);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LimitNumber", this.LimitNumber);
        this.setParamSimple(map, prefix + "StartedAt", this.StartedAt);
        this.setParamSimple(map, prefix + "EndedAt", this.EndedAt);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "AutoRenew", this.AutoRenew);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "BindType", this.BindType);
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "CanRenew", this.CanRenew);
        this.setParamSimple(map, prefix + "VipDomain", this.VipDomain);

    }
}

