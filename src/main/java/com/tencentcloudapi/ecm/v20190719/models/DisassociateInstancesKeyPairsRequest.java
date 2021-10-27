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

public class DisassociateInstancesKeyPairsRequest extends AbstractModel{

    /**
    * 可以通过以下方式获取可用的实例ID：
通过登录控制台查询实例ID。
通过调用接口 DescribeInstances ，取返回信息中的 InstanceId 获取实例ID。
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 密钥对ID列表，每次请求批量密钥对的上限为100。密钥对ID形如：skey-11112222。

可以通过以下方式获取可用的密钥ID：
通过登录控制台查询密钥ID。
通过调用接口 DescribeKeyPairs ，取返回信息中的 KeyId 获取密钥对ID。
    */
    @SerializedName("KeyIds")
    @Expose
    private String [] KeyIds;

    /**
    * 是否对运行中的实例选择强制关机。建议对运行中的实例先手动关机，然后再解绑密钥。取值范围：
TRUE：表示在正常关机失败后进行强制关机。
FALSE：表示在正常关机失败后不进行强制关机。

默认取值：FALSE。
    */
    @SerializedName("ForceStop")
    @Expose
    private Boolean ForceStop;

    /**
     * Get 可以通过以下方式获取可用的实例ID：
通过登录控制台查询实例ID。
通过调用接口 DescribeInstances ，取返回信息中的 InstanceId 获取实例ID。 
     * @return InstanceIds 可以通过以下方式获取可用的实例ID：
通过登录控制台查询实例ID。
通过调用接口 DescribeInstances ，取返回信息中的 InstanceId 获取实例ID。
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 可以通过以下方式获取可用的实例ID：
通过登录控制台查询实例ID。
通过调用接口 DescribeInstances ，取返回信息中的 InstanceId 获取实例ID。
     * @param InstanceIds 可以通过以下方式获取可用的实例ID：
通过登录控制台查询实例ID。
通过调用接口 DescribeInstances ，取返回信息中的 InstanceId 获取实例ID。
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 密钥对ID列表，每次请求批量密钥对的上限为100。密钥对ID形如：skey-11112222。

可以通过以下方式获取可用的密钥ID：
通过登录控制台查询密钥ID。
通过调用接口 DescribeKeyPairs ，取返回信息中的 KeyId 获取密钥对ID。 
     * @return KeyIds 密钥对ID列表，每次请求批量密钥对的上限为100。密钥对ID形如：skey-11112222。

可以通过以下方式获取可用的密钥ID：
通过登录控制台查询密钥ID。
通过调用接口 DescribeKeyPairs ，取返回信息中的 KeyId 获取密钥对ID。
     */
    public String [] getKeyIds() {
        return this.KeyIds;
    }

    /**
     * Set 密钥对ID列表，每次请求批量密钥对的上限为100。密钥对ID形如：skey-11112222。

可以通过以下方式获取可用的密钥ID：
通过登录控制台查询密钥ID。
通过调用接口 DescribeKeyPairs ，取返回信息中的 KeyId 获取密钥对ID。
     * @param KeyIds 密钥对ID列表，每次请求批量密钥对的上限为100。密钥对ID形如：skey-11112222。

可以通过以下方式获取可用的密钥ID：
通过登录控制台查询密钥ID。
通过调用接口 DescribeKeyPairs ，取返回信息中的 KeyId 获取密钥对ID。
     */
    public void setKeyIds(String [] KeyIds) {
        this.KeyIds = KeyIds;
    }

    /**
     * Get 是否对运行中的实例选择强制关机。建议对运行中的实例先手动关机，然后再解绑密钥。取值范围：
TRUE：表示在正常关机失败后进行强制关机。
FALSE：表示在正常关机失败后不进行强制关机。

默认取值：FALSE。 
     * @return ForceStop 是否对运行中的实例选择强制关机。建议对运行中的实例先手动关机，然后再解绑密钥。取值范围：
TRUE：表示在正常关机失败后进行强制关机。
FALSE：表示在正常关机失败后不进行强制关机。

默认取值：FALSE。
     */
    public Boolean getForceStop() {
        return this.ForceStop;
    }

    /**
     * Set 是否对运行中的实例选择强制关机。建议对运行中的实例先手动关机，然后再解绑密钥。取值范围：
TRUE：表示在正常关机失败后进行强制关机。
FALSE：表示在正常关机失败后不进行强制关机。

默认取值：FALSE。
     * @param ForceStop 是否对运行中的实例选择强制关机。建议对运行中的实例先手动关机，然后再解绑密钥。取值范围：
TRUE：表示在正常关机失败后进行强制关机。
FALSE：表示在正常关机失败后不进行强制关机。

默认取值：FALSE。
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

