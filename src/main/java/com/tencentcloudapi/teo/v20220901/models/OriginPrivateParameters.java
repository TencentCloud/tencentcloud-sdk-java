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

public class OriginPrivateParameters extends AbstractModel {

    /**
    * 鉴权参数 Access Key ID。
    */
    @SerializedName("AccessKeyId")
    @Expose
    private String AccessKeyId;

    /**
    * 鉴权参数 Secret Access Key。
    */
    @SerializedName("SecretAccessKey")
    @Expose
    private String SecretAccessKey;

    /**
    * 鉴权版本。取值有：
<li>v2：v2版本；</li>
<li>v4：v4版本。</li>
    */
    @SerializedName("SignatureVersion")
    @Expose
    private String SignatureVersion;

    /**
    * 存储桶地域。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
     * Get 鉴权参数 Access Key ID。 
     * @return AccessKeyId 鉴权参数 Access Key ID。
     */
    public String getAccessKeyId() {
        return this.AccessKeyId;
    }

    /**
     * Set 鉴权参数 Access Key ID。
     * @param AccessKeyId 鉴权参数 Access Key ID。
     */
    public void setAccessKeyId(String AccessKeyId) {
        this.AccessKeyId = AccessKeyId;
    }

    /**
     * Get 鉴权参数 Secret Access Key。 
     * @return SecretAccessKey 鉴权参数 Secret Access Key。
     */
    public String getSecretAccessKey() {
        return this.SecretAccessKey;
    }

    /**
     * Set 鉴权参数 Secret Access Key。
     * @param SecretAccessKey 鉴权参数 Secret Access Key。
     */
    public void setSecretAccessKey(String SecretAccessKey) {
        this.SecretAccessKey = SecretAccessKey;
    }

    /**
     * Get 鉴权版本。取值有：
<li>v2：v2版本；</li>
<li>v4：v4版本。</li> 
     * @return SignatureVersion 鉴权版本。取值有：
<li>v2：v2版本；</li>
<li>v4：v4版本。</li>
     */
    public String getSignatureVersion() {
        return this.SignatureVersion;
    }

    /**
     * Set 鉴权版本。取值有：
<li>v2：v2版本；</li>
<li>v4：v4版本。</li>
     * @param SignatureVersion 鉴权版本。取值有：
<li>v2：v2版本；</li>
<li>v4：v4版本。</li>
     */
    public void setSignatureVersion(String SignatureVersion) {
        this.SignatureVersion = SignatureVersion;
    }

    /**
     * Get 存储桶地域。 
     * @return Region 存储桶地域。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 存储桶地域。
     * @param Region 存储桶地域。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    public OriginPrivateParameters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OriginPrivateParameters(OriginPrivateParameters source) {
        if (source.AccessKeyId != null) {
            this.AccessKeyId = new String(source.AccessKeyId);
        }
        if (source.SecretAccessKey != null) {
            this.SecretAccessKey = new String(source.SecretAccessKey);
        }
        if (source.SignatureVersion != null) {
            this.SignatureVersion = new String(source.SignatureVersion);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccessKeyId", this.AccessKeyId);
        this.setParamSimple(map, prefix + "SecretAccessKey", this.SecretAccessKey);
        this.setParamSimple(map, prefix + "SignatureVersion", this.SignatureVersion);
        this.setParamSimple(map, prefix + "Region", this.Region);

    }
}

