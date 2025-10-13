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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateResourceGroupRequest extends AbstractModel {

    /**
    * 资源组id
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * **变更配置(变配、续费、修改资源包数量 不能同时操作), 变配无法修改资源组类型**

实时集成资源组  
- i32c(实时数据同步-16C64G)

离线集成资源组
- integrated(离线数据同步-8C16G)
- i16(离线数据同步-8C32G)

调度资源组
- s_test(测试规格)
- s_small(基础规格)
- s_medium(普及规格)
- s_large(专业规格)

数据服务资源组
- ds_t(测试规格)
- ds_s(基础规格)
- ds_m(普及规格)
- ds_l(专业规格)
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 续费时长，单位月(变配、续费、修改资源包数量 不能同时操作)
    */
    @SerializedName("PurchasePeriod")
    @Expose
    private Long PurchasePeriod;

    /**
    * 增加/减少资源包的数量(变配、续费、修改资源包数量 不能同时操作)
    */
    @SerializedName("Number")
    @Expose
    private ResourceNumber Number;

    /**
    * 是否自动续费，续费参数PurchasePeriod不为空时可以生效
    */
    @SerializedName("AutoRenewEnabled")
    @Expose
    private Boolean AutoRenewEnabled;

    /**
     * Get 资源组id 
     * @return Id 资源组id
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 资源组id
     * @param Id 资源组id
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get **变更配置(变配、续费、修改资源包数量 不能同时操作), 变配无法修改资源组类型**

实时集成资源组  
- i32c(实时数据同步-16C64G)

离线集成资源组
- integrated(离线数据同步-8C16G)
- i16(离线数据同步-8C32G)

调度资源组
- s_test(测试规格)
- s_small(基础规格)
- s_medium(普及规格)
- s_large(专业规格)

数据服务资源组
- ds_t(测试规格)
- ds_s(基础规格)
- ds_m(普及规格)
- ds_l(专业规格) 
     * @return Type **变更配置(变配、续费、修改资源包数量 不能同时操作), 变配无法修改资源组类型**

实时集成资源组  
- i32c(实时数据同步-16C64G)

离线集成资源组
- integrated(离线数据同步-8C16G)
- i16(离线数据同步-8C32G)

调度资源组
- s_test(测试规格)
- s_small(基础规格)
- s_medium(普及规格)
- s_large(专业规格)

数据服务资源组
- ds_t(测试规格)
- ds_s(基础规格)
- ds_m(普及规格)
- ds_l(专业规格)
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set **变更配置(变配、续费、修改资源包数量 不能同时操作), 变配无法修改资源组类型**

实时集成资源组  
- i32c(实时数据同步-16C64G)

离线集成资源组
- integrated(离线数据同步-8C16G)
- i16(离线数据同步-8C32G)

调度资源组
- s_test(测试规格)
- s_small(基础规格)
- s_medium(普及规格)
- s_large(专业规格)

数据服务资源组
- ds_t(测试规格)
- ds_s(基础规格)
- ds_m(普及规格)
- ds_l(专业规格)
     * @param Type **变更配置(变配、续费、修改资源包数量 不能同时操作), 变配无法修改资源组类型**

实时集成资源组  
- i32c(实时数据同步-16C64G)

离线集成资源组
- integrated(离线数据同步-8C16G)
- i16(离线数据同步-8C32G)

调度资源组
- s_test(测试规格)
- s_small(基础规格)
- s_medium(普及规格)
- s_large(专业规格)

数据服务资源组
- ds_t(测试规格)
- ds_s(基础规格)
- ds_m(普及规格)
- ds_l(专业规格)
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 续费时长，单位月(变配、续费、修改资源包数量 不能同时操作) 
     * @return PurchasePeriod 续费时长，单位月(变配、续费、修改资源包数量 不能同时操作)
     */
    public Long getPurchasePeriod() {
        return this.PurchasePeriod;
    }

    /**
     * Set 续费时长，单位月(变配、续费、修改资源包数量 不能同时操作)
     * @param PurchasePeriod 续费时长，单位月(变配、续费、修改资源包数量 不能同时操作)
     */
    public void setPurchasePeriod(Long PurchasePeriod) {
        this.PurchasePeriod = PurchasePeriod;
    }

    /**
     * Get 增加/减少资源包的数量(变配、续费、修改资源包数量 不能同时操作) 
     * @return Number 增加/减少资源包的数量(变配、续费、修改资源包数量 不能同时操作)
     */
    public ResourceNumber getNumber() {
        return this.Number;
    }

    /**
     * Set 增加/减少资源包的数量(变配、续费、修改资源包数量 不能同时操作)
     * @param Number 增加/减少资源包的数量(变配、续费、修改资源包数量 不能同时操作)
     */
    public void setNumber(ResourceNumber Number) {
        this.Number = Number;
    }

    /**
     * Get 是否自动续费，续费参数PurchasePeriod不为空时可以生效 
     * @return AutoRenewEnabled 是否自动续费，续费参数PurchasePeriod不为空时可以生效
     */
    public Boolean getAutoRenewEnabled() {
        return this.AutoRenewEnabled;
    }

    /**
     * Set 是否自动续费，续费参数PurchasePeriod不为空时可以生效
     * @param AutoRenewEnabled 是否自动续费，续费参数PurchasePeriod不为空时可以生效
     */
    public void setAutoRenewEnabled(Boolean AutoRenewEnabled) {
        this.AutoRenewEnabled = AutoRenewEnabled;
    }

    public UpdateResourceGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateResourceGroupRequest(UpdateResourceGroupRequest source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.PurchasePeriod != null) {
            this.PurchasePeriod = new Long(source.PurchasePeriod);
        }
        if (source.Number != null) {
            this.Number = new ResourceNumber(source.Number);
        }
        if (source.AutoRenewEnabled != null) {
            this.AutoRenewEnabled = new Boolean(source.AutoRenewEnabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "PurchasePeriod", this.PurchasePeriod);
        this.setParamObj(map, prefix + "Number.", this.Number);
        this.setParamSimple(map, prefix + "AutoRenewEnabled", this.AutoRenewEnabled);

    }
}

