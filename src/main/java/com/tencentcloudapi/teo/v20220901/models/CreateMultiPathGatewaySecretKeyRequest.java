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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateMultiPathGatewaySecretKeyRequest extends AbstractModel {

    /**
    * 站点 ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 多通道安全加速网关接入密钥，base64字符串，编码前字符串长度为 32-48 个字符，非必填，不填系统自动生成，可通过接口 DescribeMultiPathGatewaySecretKey 查询。
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
     * Get 站点 ID。 
     * @return ZoneId 站点 ID。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点 ID。
     * @param ZoneId 站点 ID。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 多通道安全加速网关接入密钥，base64字符串，编码前字符串长度为 32-48 个字符，非必填，不填系统自动生成，可通过接口 DescribeMultiPathGatewaySecretKey 查询。 
     * @return SecretKey 多通道安全加速网关接入密钥，base64字符串，编码前字符串长度为 32-48 个字符，非必填，不填系统自动生成，可通过接口 DescribeMultiPathGatewaySecretKey 查询。
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Set 多通道安全加速网关接入密钥，base64字符串，编码前字符串长度为 32-48 个字符，非必填，不填系统自动生成，可通过接口 DescribeMultiPathGatewaySecretKey 查询。
     * @param SecretKey 多通道安全加速网关接入密钥，base64字符串，编码前字符串长度为 32-48 个字符，非必填，不填系统自动生成，可通过接口 DescribeMultiPathGatewaySecretKey 查询。
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    public CreateMultiPathGatewaySecretKeyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateMultiPathGatewaySecretKeyRequest(CreateMultiPathGatewaySecretKeyRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.SecretKey != null) {
            this.SecretKey = new String(source.SecretKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "SecretKey", this.SecretKey);

    }
}

