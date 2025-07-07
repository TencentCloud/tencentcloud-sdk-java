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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyKeyPairAttributeRequest extends AbstractModel {

    /**
    * 密钥对ID。可以通过以下方式获取可用的密钥 ID：
<li>通过登录[控制台](https://console.cloud.tencent.com/cvm/sshkey)查询密钥 ID。</li>
<li>通过调用接口 [DescribeKeyPairs](https://cloud.tencent.com/document/api/213/9403) ，取返回信息中的 `KeyId` 获取密钥对 ID。</li>
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * 修改后的密钥对名称，可由数字，字母和下划线组成，长度不超过25个字符。
    */
    @SerializedName("KeyName")
    @Expose
    private String KeyName;

    /**
    * 修改后的密钥对描述信息。可任意命名，但不得超过60个字符。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 密钥对ID。可以通过以下方式获取可用的密钥 ID：
<li>通过登录[控制台](https://console.cloud.tencent.com/cvm/sshkey)查询密钥 ID。</li>
<li>通过调用接口 [DescribeKeyPairs](https://cloud.tencent.com/document/api/213/9403) ，取返回信息中的 `KeyId` 获取密钥对 ID。</li> 
     * @return KeyId 密钥对ID。可以通过以下方式获取可用的密钥 ID：
<li>通过登录[控制台](https://console.cloud.tencent.com/cvm/sshkey)查询密钥 ID。</li>
<li>通过调用接口 [DescribeKeyPairs](https://cloud.tencent.com/document/api/213/9403) ，取返回信息中的 `KeyId` 获取密钥对 ID。</li>
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set 密钥对ID。可以通过以下方式获取可用的密钥 ID：
<li>通过登录[控制台](https://console.cloud.tencent.com/cvm/sshkey)查询密钥 ID。</li>
<li>通过调用接口 [DescribeKeyPairs](https://cloud.tencent.com/document/api/213/9403) ，取返回信息中的 `KeyId` 获取密钥对 ID。</li>
     * @param KeyId 密钥对ID。可以通过以下方式获取可用的密钥 ID：
<li>通过登录[控制台](https://console.cloud.tencent.com/cvm/sshkey)查询密钥 ID。</li>
<li>通过调用接口 [DescribeKeyPairs](https://cloud.tencent.com/document/api/213/9403) ，取返回信息中的 `KeyId` 获取密钥对 ID。</li>
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get 修改后的密钥对名称，可由数字，字母和下划线组成，长度不超过25个字符。 
     * @return KeyName 修改后的密钥对名称，可由数字，字母和下划线组成，长度不超过25个字符。
     */
    public String getKeyName() {
        return this.KeyName;
    }

    /**
     * Set 修改后的密钥对名称，可由数字，字母和下划线组成，长度不超过25个字符。
     * @param KeyName 修改后的密钥对名称，可由数字，字母和下划线组成，长度不超过25个字符。
     */
    public void setKeyName(String KeyName) {
        this.KeyName = KeyName;
    }

    /**
     * Get 修改后的密钥对描述信息。可任意命名，但不得超过60个字符。 
     * @return Description 修改后的密钥对描述信息。可任意命名，但不得超过60个字符。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 修改后的密钥对描述信息。可任意命名，但不得超过60个字符。
     * @param Description 修改后的密钥对描述信息。可任意命名，但不得超过60个字符。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public ModifyKeyPairAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyKeyPairAttributeRequest(ModifyKeyPairAttributeRequest source) {
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
        if (source.KeyName != null) {
            this.KeyName = new String(source.KeyName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "KeyName", this.KeyName);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

