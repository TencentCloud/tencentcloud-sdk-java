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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RebootInstancesRequest extends AbstractModel{

    /**
    * 待重启的实例ID列表。在单次请求的过程中，单个region下的请求实例数上限为100。
    */
    @SerializedName("InstanceIdSet")
    @Expose
    private String [] InstanceIdSet;

    /**
    * 是否在正常重启失败后选择强制重启实例。取值范围：
TRUE：表示在正常重启失败后进行强制重启；
FALSE：表示在正常重启失败后不进行强制重启；
默认取值：FALSE。
    */
    @SerializedName("ForceReboot")
    @Expose
    private Boolean ForceReboot;

    /**
    * 关机类型。取值范围：
SOFT：表示软关机
HARD：表示硬关机
SOFT_FIRST：表示优先软关机，失败再执行硬关机

默认取值：SOFT。
    */
    @SerializedName("StopType")
    @Expose
    private String StopType;

    /**
     * Get 待重启的实例ID列表。在单次请求的过程中，单个region下的请求实例数上限为100。 
     * @return InstanceIdSet 待重启的实例ID列表。在单次请求的过程中，单个region下的请求实例数上限为100。
     */
    public String [] getInstanceIdSet() {
        return this.InstanceIdSet;
    }

    /**
     * Set 待重启的实例ID列表。在单次请求的过程中，单个region下的请求实例数上限为100。
     * @param InstanceIdSet 待重启的实例ID列表。在单次请求的过程中，单个region下的请求实例数上限为100。
     */
    public void setInstanceIdSet(String [] InstanceIdSet) {
        this.InstanceIdSet = InstanceIdSet;
    }

    /**
     * Get 是否在正常重启失败后选择强制重启实例。取值范围：
TRUE：表示在正常重启失败后进行强制重启；
FALSE：表示在正常重启失败后不进行强制重启；
默认取值：FALSE。 
     * @return ForceReboot 是否在正常重启失败后选择强制重启实例。取值范围：
TRUE：表示在正常重启失败后进行强制重启；
FALSE：表示在正常重启失败后不进行强制重启；
默认取值：FALSE。
     */
    public Boolean getForceReboot() {
        return this.ForceReboot;
    }

    /**
     * Set 是否在正常重启失败后选择强制重启实例。取值范围：
TRUE：表示在正常重启失败后进行强制重启；
FALSE：表示在正常重启失败后不进行强制重启；
默认取值：FALSE。
     * @param ForceReboot 是否在正常重启失败后选择强制重启实例。取值范围：
TRUE：表示在正常重启失败后进行强制重启；
FALSE：表示在正常重启失败后不进行强制重启；
默认取值：FALSE。
     */
    public void setForceReboot(Boolean ForceReboot) {
        this.ForceReboot = ForceReboot;
    }

    /**
     * Get 关机类型。取值范围：
SOFT：表示软关机
HARD：表示硬关机
SOFT_FIRST：表示优先软关机，失败再执行硬关机

默认取值：SOFT。 
     * @return StopType 关机类型。取值范围：
SOFT：表示软关机
HARD：表示硬关机
SOFT_FIRST：表示优先软关机，失败再执行硬关机

默认取值：SOFT。
     */
    public String getStopType() {
        return this.StopType;
    }

    /**
     * Set 关机类型。取值范围：
SOFT：表示软关机
HARD：表示硬关机
SOFT_FIRST：表示优先软关机，失败再执行硬关机

默认取值：SOFT。
     * @param StopType 关机类型。取值范围：
SOFT：表示软关机
HARD：表示硬关机
SOFT_FIRST：表示优先软关机，失败再执行硬关机

默认取值：SOFT。
     */
    public void setStopType(String StopType) {
        this.StopType = StopType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIdSet.", this.InstanceIdSet);
        this.setParamSimple(map, prefix + "ForceReboot", this.ForceReboot);
        this.setParamSimple(map, prefix + "StopType", this.StopType);

    }
}

