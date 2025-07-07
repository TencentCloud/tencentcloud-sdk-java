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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SwitchWaterPrintConfigRequest extends AbstractModel {

    /**
    * 资源实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 水印开启/关闭状态，1表示开启；0表示关闭
    */
    @SerializedName("OpenStatus")
    @Expose
    private Long OpenStatus;

    /**
    * 是否开启代理，1开启则忽略IP+端口校验；0关闭则需要IP+端口校验
    */
    @SerializedName("CloudSdkProxy")
    @Expose
    private Long CloudSdkProxy;

    /**
     * Get 资源实例ID 
     * @return InstanceId 资源实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 资源实例ID
     * @param InstanceId 资源实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 水印开启/关闭状态，1表示开启；0表示关闭 
     * @return OpenStatus 水印开启/关闭状态，1表示开启；0表示关闭
     */
    public Long getOpenStatus() {
        return this.OpenStatus;
    }

    /**
     * Set 水印开启/关闭状态，1表示开启；0表示关闭
     * @param OpenStatus 水印开启/关闭状态，1表示开启；0表示关闭
     */
    public void setOpenStatus(Long OpenStatus) {
        this.OpenStatus = OpenStatus;
    }

    /**
     * Get 是否开启代理，1开启则忽略IP+端口校验；0关闭则需要IP+端口校验 
     * @return CloudSdkProxy 是否开启代理，1开启则忽略IP+端口校验；0关闭则需要IP+端口校验
     */
    public Long getCloudSdkProxy() {
        return this.CloudSdkProxy;
    }

    /**
     * Set 是否开启代理，1开启则忽略IP+端口校验；0关闭则需要IP+端口校验
     * @param CloudSdkProxy 是否开启代理，1开启则忽略IP+端口校验；0关闭则需要IP+端口校验
     */
    public void setCloudSdkProxy(Long CloudSdkProxy) {
        this.CloudSdkProxy = CloudSdkProxy;
    }

    public SwitchWaterPrintConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SwitchWaterPrintConfigRequest(SwitchWaterPrintConfigRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.OpenStatus != null) {
            this.OpenStatus = new Long(source.OpenStatus);
        }
        if (source.CloudSdkProxy != null) {
            this.CloudSdkProxy = new Long(source.CloudSdkProxy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "OpenStatus", this.OpenStatus);
        this.setParamSimple(map, prefix + "CloudSdkProxy", this.CloudSdkProxy);

    }
}

