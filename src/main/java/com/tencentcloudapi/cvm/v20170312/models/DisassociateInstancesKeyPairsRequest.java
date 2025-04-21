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

public class DisassociateInstancesKeyPairsRequest extends AbstractModel {

    /**
    * 一个或多个待操作的实例ID，每次请求批量实例的上限为100。<br>可以通过以下方式获取可用的实例ID：
<li>通过登录[控制台](https://console.cloud.tencent.com/cvm/index)查询实例ID。</li>
<li>通过调用接口 [DescribeInstances](https://cloud.tencent.com/document/api/213/15728) ，取返回信息中的 `InstanceId` 获取实例ID。</li>
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 密钥对ID列表，列表长度上限为100。可以通过以下方式获取可用的密钥ID：
<li>通过登录[控制台](https://console.cloud.tencent.com/cvm/sshkey)查询密钥ID。</li>
<li>通过调用接口 [DescribeKeyPairs](https://cloud.tencent.com/document/api/213/15699) ，取返回信息中的 `KeyId` 获取密钥对ID。</li>
    */
    @SerializedName("KeyIds")
    @Expose
    private String [] KeyIds;

    /**
    * 是否强制关机，默认值为 false。常规场景下，建议手动关机后解绑密钥。取值范围：
<li>true：先执行强制关机，再解绑密钥。</li>
<li>false：不执行强制关机，仅支持对已关机状态实例进行解绑操作。</li>
    */
    @SerializedName("ForceStop")
    @Expose
    private Boolean ForceStop;

    /**
     * Get 一个或多个待操作的实例ID，每次请求批量实例的上限为100。<br>可以通过以下方式获取可用的实例ID：
<li>通过登录[控制台](https://console.cloud.tencent.com/cvm/index)查询实例ID。</li>
<li>通过调用接口 [DescribeInstances](https://cloud.tencent.com/document/api/213/15728) ，取返回信息中的 `InstanceId` 获取实例ID。</li> 
     * @return InstanceIds 一个或多个待操作的实例ID，每次请求批量实例的上限为100。<br>可以通过以下方式获取可用的实例ID：
<li>通过登录[控制台](https://console.cloud.tencent.com/cvm/index)查询实例ID。</li>
<li>通过调用接口 [DescribeInstances](https://cloud.tencent.com/document/api/213/15728) ，取返回信息中的 `InstanceId` 获取实例ID。</li>
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 一个或多个待操作的实例ID，每次请求批量实例的上限为100。<br>可以通过以下方式获取可用的实例ID：
<li>通过登录[控制台](https://console.cloud.tencent.com/cvm/index)查询实例ID。</li>
<li>通过调用接口 [DescribeInstances](https://cloud.tencent.com/document/api/213/15728) ，取返回信息中的 `InstanceId` 获取实例ID。</li>
     * @param InstanceIds 一个或多个待操作的实例ID，每次请求批量实例的上限为100。<br>可以通过以下方式获取可用的实例ID：
<li>通过登录[控制台](https://console.cloud.tencent.com/cvm/index)查询实例ID。</li>
<li>通过调用接口 [DescribeInstances](https://cloud.tencent.com/document/api/213/15728) ，取返回信息中的 `InstanceId` 获取实例ID。</li>
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 密钥对ID列表，列表长度上限为100。可以通过以下方式获取可用的密钥ID：
<li>通过登录[控制台](https://console.cloud.tencent.com/cvm/sshkey)查询密钥ID。</li>
<li>通过调用接口 [DescribeKeyPairs](https://cloud.tencent.com/document/api/213/15699) ，取返回信息中的 `KeyId` 获取密钥对ID。</li> 
     * @return KeyIds 密钥对ID列表，列表长度上限为100。可以通过以下方式获取可用的密钥ID：
<li>通过登录[控制台](https://console.cloud.tencent.com/cvm/sshkey)查询密钥ID。</li>
<li>通过调用接口 [DescribeKeyPairs](https://cloud.tencent.com/document/api/213/15699) ，取返回信息中的 `KeyId` 获取密钥对ID。</li>
     */
    public String [] getKeyIds() {
        return this.KeyIds;
    }

    /**
     * Set 密钥对ID列表，列表长度上限为100。可以通过以下方式获取可用的密钥ID：
<li>通过登录[控制台](https://console.cloud.tencent.com/cvm/sshkey)查询密钥ID。</li>
<li>通过调用接口 [DescribeKeyPairs](https://cloud.tencent.com/document/api/213/15699) ，取返回信息中的 `KeyId` 获取密钥对ID。</li>
     * @param KeyIds 密钥对ID列表，列表长度上限为100。可以通过以下方式获取可用的密钥ID：
<li>通过登录[控制台](https://console.cloud.tencent.com/cvm/sshkey)查询密钥ID。</li>
<li>通过调用接口 [DescribeKeyPairs](https://cloud.tencent.com/document/api/213/15699) ，取返回信息中的 `KeyId` 获取密钥对ID。</li>
     */
    public void setKeyIds(String [] KeyIds) {
        this.KeyIds = KeyIds;
    }

    /**
     * Get 是否强制关机，默认值为 false。常规场景下，建议手动关机后解绑密钥。取值范围：
<li>true：先执行强制关机，再解绑密钥。</li>
<li>false：不执行强制关机，仅支持对已关机状态实例进行解绑操作。</li> 
     * @return ForceStop 是否强制关机，默认值为 false。常规场景下，建议手动关机后解绑密钥。取值范围：
<li>true：先执行强制关机，再解绑密钥。</li>
<li>false：不执行强制关机，仅支持对已关机状态实例进行解绑操作。</li>
     */
    public Boolean getForceStop() {
        return this.ForceStop;
    }

    /**
     * Set 是否强制关机，默认值为 false。常规场景下，建议手动关机后解绑密钥。取值范围：
<li>true：先执行强制关机，再解绑密钥。</li>
<li>false：不执行强制关机，仅支持对已关机状态实例进行解绑操作。</li>
     * @param ForceStop 是否强制关机，默认值为 false。常规场景下，建议手动关机后解绑密钥。取值范围：
<li>true：先执行强制关机，再解绑密钥。</li>
<li>false：不执行强制关机，仅支持对已关机状态实例进行解绑操作。</li>
     */
    public void setForceStop(Boolean ForceStop) {
        this.ForceStop = ForceStop;
    }

    public DisassociateInstancesKeyPairsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DisassociateInstancesKeyPairsRequest(DisassociateInstancesKeyPairsRequest source) {
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.KeyIds != null) {
            this.KeyIds = new String[source.KeyIds.length];
            for (int i = 0; i < source.KeyIds.length; i++) {
                this.KeyIds[i] = new String(source.KeyIds[i]);
            }
        }
        if (source.ForceStop != null) {
            this.ForceStop = new Boolean(source.ForceStop);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamArraySimple(map, prefix + "KeyIds.", this.KeyIds);
        this.setParamSimple(map, prefix + "ForceStop", this.ForceStop);

    }
}

