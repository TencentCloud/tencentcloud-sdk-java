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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DisassociateInstancesKeyPairsRequest extends AbstractModel {

    /**
    * 密钥对 ID 列表，每次请求批量密钥对的上限为 100。可通过[DescribeKeyPairs](https://cloud.tencent.com/document/api/1207/55540)接口返回值中的KeyId获取。
    */
    @SerializedName("KeyIds")
    @Expose
    private String [] KeyIds;

    /**
    * 实例 ID 列表。每次请求批量实例的上限为 100。可通过[DescribeInstances](https://cloud.tencent.com/document/api/1207/47573)接口返回值中的InstanceId获取。
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 解绑定类型。可选值：
ONLINE - 在线解绑定，不需要关机。
OFFLINE - 离线解绑定，需要关机。
    */
    @SerializedName("DisassociateType")
    @Expose
    private String DisassociateType;

    /**
    * 解绑定的用户名。当 DisassociateType 为 OFFLINE 时，不支持该参数。
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
     * Get 密钥对 ID 列表，每次请求批量密钥对的上限为 100。可通过[DescribeKeyPairs](https://cloud.tencent.com/document/api/1207/55540)接口返回值中的KeyId获取。 
     * @return KeyIds 密钥对 ID 列表，每次请求批量密钥对的上限为 100。可通过[DescribeKeyPairs](https://cloud.tencent.com/document/api/1207/55540)接口返回值中的KeyId获取。
     */
    public String [] getKeyIds() {
        return this.KeyIds;
    }

    /**
     * Set 密钥对 ID 列表，每次请求批量密钥对的上限为 100。可通过[DescribeKeyPairs](https://cloud.tencent.com/document/api/1207/55540)接口返回值中的KeyId获取。
     * @param KeyIds 密钥对 ID 列表，每次请求批量密钥对的上限为 100。可通过[DescribeKeyPairs](https://cloud.tencent.com/document/api/1207/55540)接口返回值中的KeyId获取。
     */
    public void setKeyIds(String [] KeyIds) {
        this.KeyIds = KeyIds;
    }

    /**
     * Get 实例 ID 列表。每次请求批量实例的上限为 100。可通过[DescribeInstances](https://cloud.tencent.com/document/api/1207/47573)接口返回值中的InstanceId获取。 
     * @return InstanceIds 实例 ID 列表。每次请求批量实例的上限为 100。可通过[DescribeInstances](https://cloud.tencent.com/document/api/1207/47573)接口返回值中的InstanceId获取。
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 实例 ID 列表。每次请求批量实例的上限为 100。可通过[DescribeInstances](https://cloud.tencent.com/document/api/1207/47573)接口返回值中的InstanceId获取。
     * @param InstanceIds 实例 ID 列表。每次请求批量实例的上限为 100。可通过[DescribeInstances](https://cloud.tencent.com/document/api/1207/47573)接口返回值中的InstanceId获取。
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 解绑定类型。可选值：
ONLINE - 在线解绑定，不需要关机。
OFFLINE - 离线解绑定，需要关机。 
     * @return DisassociateType 解绑定类型。可选值：
ONLINE - 在线解绑定，不需要关机。
OFFLINE - 离线解绑定，需要关机。
     */
    public String getDisassociateType() {
        return this.DisassociateType;
    }

    /**
     * Set 解绑定类型。可选值：
ONLINE - 在线解绑定，不需要关机。
OFFLINE - 离线解绑定，需要关机。
     * @param DisassociateType 解绑定类型。可选值：
ONLINE - 在线解绑定，不需要关机。
OFFLINE - 离线解绑定，需要关机。
     */
    public void setDisassociateType(String DisassociateType) {
        this.DisassociateType = DisassociateType;
    }

    /**
     * Get 解绑定的用户名。当 DisassociateType 为 OFFLINE 时，不支持该参数。 
     * @return Username 解绑定的用户名。当 DisassociateType 为 OFFLINE 时，不支持该参数。
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set 解绑定的用户名。当 DisassociateType 为 OFFLINE 时，不支持该参数。
     * @param Username 解绑定的用户名。当 DisassociateType 为 OFFLINE 时，不支持该参数。
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    public DisassociateInstancesKeyPairsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DisassociateInstancesKeyPairsRequest(DisassociateInstancesKeyPairsRequest source) {
        if (source.KeyIds != null) {
            this.KeyIds = new String[source.KeyIds.length];
            for (int i = 0; i < source.KeyIds.length; i++) {
                this.KeyIds[i] = new String(source.KeyIds[i]);
            }
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.DisassociateType != null) {
            this.DisassociateType = new String(source.DisassociateType);
        }
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "KeyIds.", this.KeyIds);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "DisassociateType", this.DisassociateType);
        this.setParamSimple(map, prefix + "Username", this.Username);

    }
}

