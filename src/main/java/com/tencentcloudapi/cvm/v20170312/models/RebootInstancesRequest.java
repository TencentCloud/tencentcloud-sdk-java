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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RebootInstancesRequest extends AbstractModel {

    /**
    * 一个或多个待操作的实例ID。可通过 [DescribeInstances](https://cloud.tencent.com/document/api/213/15728) 接口返回值中的`InstanceId`获取。每次请求批量实例的上限为100。
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 本参数已弃用，推荐使用StopType，不可以与参数StopType同时使用。表示是否在正常重启失败后选择强制重启实例。取值范围：<br><li>true：表示在正常重启失败后进行强制重启</li><li>false：表示在正常重启失败后不进行强制重启</li><br>默认取值：false。
    */
    @SerializedName("ForceReboot")
    @Expose
    private Boolean ForceReboot;

    /**
    * 关机类型。取值范围：<br><li>SOFT：表示软关机</li><li>HARD：表示硬关机</li><li>SOFT_FIRST：表示优先软关机，失败再执行硬关机</li><br>默认取值：SOFT。
    */
    @SerializedName("StopType")
    @Expose
    private String StopType;

    /**
     * Get 一个或多个待操作的实例ID。可通过 [DescribeInstances](https://cloud.tencent.com/document/api/213/15728) 接口返回值中的`InstanceId`获取。每次请求批量实例的上限为100。 
     * @return InstanceIds 一个或多个待操作的实例ID。可通过 [DescribeInstances](https://cloud.tencent.com/document/api/213/15728) 接口返回值中的`InstanceId`获取。每次请求批量实例的上限为100。
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 一个或多个待操作的实例ID。可通过 [DescribeInstances](https://cloud.tencent.com/document/api/213/15728) 接口返回值中的`InstanceId`获取。每次请求批量实例的上限为100。
     * @param InstanceIds 一个或多个待操作的实例ID。可通过 [DescribeInstances](https://cloud.tencent.com/document/api/213/15728) 接口返回值中的`InstanceId`获取。每次请求批量实例的上限为100。
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 本参数已弃用，推荐使用StopType，不可以与参数StopType同时使用。表示是否在正常重启失败后选择强制重启实例。取值范围：<br><li>true：表示在正常重启失败后进行强制重启</li><li>false：表示在正常重启失败后不进行强制重启</li><br>默认取值：false。 
     * @return ForceReboot 本参数已弃用，推荐使用StopType，不可以与参数StopType同时使用。表示是否在正常重启失败后选择强制重启实例。取值范围：<br><li>true：表示在正常重启失败后进行强制重启</li><li>false：表示在正常重启失败后不进行强制重启</li><br>默认取值：false。
     * @deprecated
     */
    @Deprecated
    public Boolean getForceReboot() {
        return this.ForceReboot;
    }

    /**
     * Set 本参数已弃用，推荐使用StopType，不可以与参数StopType同时使用。表示是否在正常重启失败后选择强制重启实例。取值范围：<br><li>true：表示在正常重启失败后进行强制重启</li><li>false：表示在正常重启失败后不进行强制重启</li><br>默认取值：false。
     * @param ForceReboot 本参数已弃用，推荐使用StopType，不可以与参数StopType同时使用。表示是否在正常重启失败后选择强制重启实例。取值范围：<br><li>true：表示在正常重启失败后进行强制重启</li><li>false：表示在正常重启失败后不进行强制重启</li><br>默认取值：false。
     * @deprecated
     */
    @Deprecated
    public void setForceReboot(Boolean ForceReboot) {
        this.ForceReboot = ForceReboot;
    }

    /**
     * Get 关机类型。取值范围：<br><li>SOFT：表示软关机</li><li>HARD：表示硬关机</li><li>SOFT_FIRST：表示优先软关机，失败再执行硬关机</li><br>默认取值：SOFT。 
     * @return StopType 关机类型。取值范围：<br><li>SOFT：表示软关机</li><li>HARD：表示硬关机</li><li>SOFT_FIRST：表示优先软关机，失败再执行硬关机</li><br>默认取值：SOFT。
     */
    public String getStopType() {
        return this.StopType;
    }

    /**
     * Set 关机类型。取值范围：<br><li>SOFT：表示软关机</li><li>HARD：表示硬关机</li><li>SOFT_FIRST：表示优先软关机，失败再执行硬关机</li><br>默认取值：SOFT。
     * @param StopType 关机类型。取值范围：<br><li>SOFT：表示软关机</li><li>HARD：表示硬关机</li><li>SOFT_FIRST：表示优先软关机，失败再执行硬关机</li><br>默认取值：SOFT。
     */
    public void setStopType(String StopType) {
        this.StopType = StopType;
    }

    public RebootInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RebootInstancesRequest(RebootInstancesRequest source) {
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.ForceReboot != null) {
            this.ForceReboot = new Boolean(source.ForceReboot);
        }
        if (source.StopType != null) {
            this.StopType = new String(source.StopType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "ForceReboot", this.ForceReboot);
        this.setParamSimple(map, prefix + "StopType", this.StopType);

    }
}

