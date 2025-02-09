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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SupportIpv6Detail extends AbstractModel {

    /**
    * 是否支持开启IPv6。
    */
    @SerializedName("IsSupport")
    @Expose
    private Boolean IsSupport;

    /**
    * 详情。

当IsSupport为True，Detail枚举值为:

EFFECTIVE_IMMEDIATELY: 立即生效

EFFECTIVE_AFTER_REBOOT: 分配过程需要开关机，用户需备份数据

 

当IsSupport为False，Detail枚举值为:

HAD_BEEN_ASSIGNED: 已分配IPv6地址

REGION_NOT_SUPPORT: 地域不支持

BLUEPRINT_NOT_SUPPORT: 镜像不支持

BUNDLE_INSTANCE_NOT_SUPPORT: 套餐实例不支持

BUNDLE_BANDWIDTH_NOT_SUPPORT: 套餐带宽不支持
    */
    @SerializedName("Detail")
    @Expose
    private String Detail;

    /**
    * 提示信息。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get 是否支持开启IPv6。 
     * @return IsSupport 是否支持开启IPv6。
     */
    public Boolean getIsSupport() {
        return this.IsSupport;
    }

    /**
     * Set 是否支持开启IPv6。
     * @param IsSupport 是否支持开启IPv6。
     */
    public void setIsSupport(Boolean IsSupport) {
        this.IsSupport = IsSupport;
    }

    /**
     * Get 详情。

当IsSupport为True，Detail枚举值为:

EFFECTIVE_IMMEDIATELY: 立即生效

EFFECTIVE_AFTER_REBOOT: 分配过程需要开关机，用户需备份数据

 

当IsSupport为False，Detail枚举值为:

HAD_BEEN_ASSIGNED: 已分配IPv6地址

REGION_NOT_SUPPORT: 地域不支持

BLUEPRINT_NOT_SUPPORT: 镜像不支持

BUNDLE_INSTANCE_NOT_SUPPORT: 套餐实例不支持

BUNDLE_BANDWIDTH_NOT_SUPPORT: 套餐带宽不支持 
     * @return Detail 详情。

当IsSupport为True，Detail枚举值为:

EFFECTIVE_IMMEDIATELY: 立即生效

EFFECTIVE_AFTER_REBOOT: 分配过程需要开关机，用户需备份数据

 

当IsSupport为False，Detail枚举值为:

HAD_BEEN_ASSIGNED: 已分配IPv6地址

REGION_NOT_SUPPORT: 地域不支持

BLUEPRINT_NOT_SUPPORT: 镜像不支持

BUNDLE_INSTANCE_NOT_SUPPORT: 套餐实例不支持

BUNDLE_BANDWIDTH_NOT_SUPPORT: 套餐带宽不支持
     */
    public String getDetail() {
        return this.Detail;
    }

    /**
     * Set 详情。

当IsSupport为True，Detail枚举值为:

EFFECTIVE_IMMEDIATELY: 立即生效

EFFECTIVE_AFTER_REBOOT: 分配过程需要开关机，用户需备份数据

 

当IsSupport为False，Detail枚举值为:

HAD_BEEN_ASSIGNED: 已分配IPv6地址

REGION_NOT_SUPPORT: 地域不支持

BLUEPRINT_NOT_SUPPORT: 镜像不支持

BUNDLE_INSTANCE_NOT_SUPPORT: 套餐实例不支持

BUNDLE_BANDWIDTH_NOT_SUPPORT: 套餐带宽不支持
     * @param Detail 详情。

当IsSupport为True，Detail枚举值为:

EFFECTIVE_IMMEDIATELY: 立即生效

EFFECTIVE_AFTER_REBOOT: 分配过程需要开关机，用户需备份数据

 

当IsSupport为False，Detail枚举值为:

HAD_BEEN_ASSIGNED: 已分配IPv6地址

REGION_NOT_SUPPORT: 地域不支持

BLUEPRINT_NOT_SUPPORT: 镜像不支持

BUNDLE_INSTANCE_NOT_SUPPORT: 套餐实例不支持

BUNDLE_BANDWIDTH_NOT_SUPPORT: 套餐带宽不支持
     */
    public void setDetail(String Detail) {
        this.Detail = Detail;
    }

    /**
     * Get 提示信息。 
     * @return Message 提示信息。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 提示信息。
     * @param Message 提示信息。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    public SupportIpv6Detail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SupportIpv6Detail(SupportIpv6Detail source) {
        if (source.IsSupport != null) {
            this.IsSupport = new Boolean(source.IsSupport);
        }
        if (source.Detail != null) {
            this.Detail = new String(source.Detail);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsSupport", this.IsSupport);
        this.setParamSimple(map, prefix + "Detail", this.Detail);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}

