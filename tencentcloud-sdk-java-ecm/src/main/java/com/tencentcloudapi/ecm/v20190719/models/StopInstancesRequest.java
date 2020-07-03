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

public class StopInstancesRequest extends AbstractModel{

    /**
    * 需要关机的实例ID列表。在单次请求的过程中，单个region下的请求实例数上限为100。
    */
    @SerializedName("InstanceIdSet")
    @Expose
    private String [] InstanceIdSet;

    /**
    * 是否在正常关闭失败后选择强制关闭实例，默认为false，即否。
    */
    @SerializedName("ForceStop")
    @Expose
    private Boolean ForceStop;

    /**
    * 实例的关闭模式。取值范围：
SOFT_FIRST：表示在正常关闭失败后进行强制关闭;
HARD：直接强制关闭;
SOFT：仅软关机；
默认为SOFT。
    */
    @SerializedName("StopType")
    @Expose
    private String StopType;

    /**
     * Get 需要关机的实例ID列表。在单次请求的过程中，单个region下的请求实例数上限为100。 
     * @return InstanceIdSet 需要关机的实例ID列表。在单次请求的过程中，单个region下的请求实例数上限为100。
     */
    public String [] getInstanceIdSet() {
        return this.InstanceIdSet;
    }

    /**
     * Set 需要关机的实例ID列表。在单次请求的过程中，单个region下的请求实例数上限为100。
     * @param InstanceIdSet 需要关机的实例ID列表。在单次请求的过程中，单个region下的请求实例数上限为100。
     */
    public void setInstanceIdSet(String [] InstanceIdSet) {
        this.InstanceIdSet = InstanceIdSet;
    }

    /**
     * Get 是否在正常关闭失败后选择强制关闭实例，默认为false，即否。 
     * @return ForceStop 是否在正常关闭失败后选择强制关闭实例，默认为false，即否。
     */
    public Boolean getForceStop() {
        return this.ForceStop;
    }

    /**
     * Set 是否在正常关闭失败后选择强制关闭实例，默认为false，即否。
     * @param ForceStop 是否在正常关闭失败后选择强制关闭实例，默认为false，即否。
     */
    public void setForceStop(Boolean ForceStop) {
        this.ForceStop = ForceStop;
    }

    /**
     * Get 实例的关闭模式。取值范围：
SOFT_FIRST：表示在正常关闭失败后进行强制关闭;
HARD：直接强制关闭;
SOFT：仅软关机；
默认为SOFT。 
     * @return StopType 实例的关闭模式。取值范围：
SOFT_FIRST：表示在正常关闭失败后进行强制关闭;
HARD：直接强制关闭;
SOFT：仅软关机；
默认为SOFT。
     */
    public String getStopType() {
        return this.StopType;
    }

    /**
     * Set 实例的关闭模式。取值范围：
SOFT_FIRST：表示在正常关闭失败后进行强制关闭;
HARD：直接强制关闭;
SOFT：仅软关机；
默认为SOFT。
     * @param StopType 实例的关闭模式。取值范围：
SOFT_FIRST：表示在正常关闭失败后进行强制关闭;
HARD：直接强制关闭;
SOFT：仅软关机；
默认为SOFT。
     */
    public void setStopType(String StopType) {
        this.StopType = StopType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIdSet.", this.InstanceIdSet);
        this.setParamSimple(map, prefix + "ForceStop", this.ForceStop);
        this.setParamSimple(map, prefix + "StopType", this.StopType);

    }
}

