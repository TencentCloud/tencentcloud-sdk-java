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
package com.tencentcloudapi.drm.v20181115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeKeysResponse extends AbstractModel {

    /**
    * 加密密钥列表
    */
    @SerializedName("Keys")
    @Expose
    private Key [] Keys;

    /**
    * 用来加密密钥。
如果入参中带有RsaPublicKey，则SessionKey为使用Rsa公钥加密后的二进制数据，Base64编码字符串。
如果入参中没有RsaPublicKey，则SessionKey为原始数据的字符串形式。
    */
    @SerializedName("SessionKey")
    @Expose
    private String SessionKey;

    /**
    * 内容ID
    */
    @SerializedName("ContentId")
    @Expose
    private String ContentId;

    /**
    * Widevine方案的Pssh数据，Base64编码。
Fairplay方案无该值。
    */
    @SerializedName("Pssh")
    @Expose
    private String Pssh;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 加密密钥列表 
     * @return Keys 加密密钥列表
     */
    public Key [] getKeys() {
        return this.Keys;
    }

    /**
     * Set 加密密钥列表
     * @param Keys 加密密钥列表
     */
    public void setKeys(Key [] Keys) {
        this.Keys = Keys;
    }

    /**
     * Get 用来加密密钥。
如果入参中带有RsaPublicKey，则SessionKey为使用Rsa公钥加密后的二进制数据，Base64编码字符串。
如果入参中没有RsaPublicKey，则SessionKey为原始数据的字符串形式。 
     * @return SessionKey 用来加密密钥。
如果入参中带有RsaPublicKey，则SessionKey为使用Rsa公钥加密后的二进制数据，Base64编码字符串。
如果入参中没有RsaPublicKey，则SessionKey为原始数据的字符串形式。
     */
    public String getSessionKey() {
        return this.SessionKey;
    }

    /**
     * Set 用来加密密钥。
如果入参中带有RsaPublicKey，则SessionKey为使用Rsa公钥加密后的二进制数据，Base64编码字符串。
如果入参中没有RsaPublicKey，则SessionKey为原始数据的字符串形式。
     * @param SessionKey 用来加密密钥。
如果入参中带有RsaPublicKey，则SessionKey为使用Rsa公钥加密后的二进制数据，Base64编码字符串。
如果入参中没有RsaPublicKey，则SessionKey为原始数据的字符串形式。
     */
    public void setSessionKey(String SessionKey) {
        this.SessionKey = SessionKey;
    }

    /**
     * Get 内容ID 
     * @return ContentId 内容ID
     */
    public String getContentId() {
        return this.ContentId;
    }

    /**
     * Set 内容ID
     * @param ContentId 内容ID
     */
    public void setContentId(String ContentId) {
        this.ContentId = ContentId;
    }

    /**
     * Get Widevine方案的Pssh数据，Base64编码。
Fairplay方案无该值。 
     * @return Pssh Widevine方案的Pssh数据，Base64编码。
Fairplay方案无该值。
     */
    public String getPssh() {
        return this.Pssh;
    }

    /**
     * Set Widevine方案的Pssh数据，Base64编码。
Fairplay方案无该值。
     * @param Pssh Widevine方案的Pssh数据，Base64编码。
Fairplay方案无该值。
     */
    public void setPssh(String Pssh) {
        this.Pssh = Pssh;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeKeysResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeKeysResponse(DescribeKeysResponse source) {
        if (source.Keys != null) {
            this.Keys = new Key[source.Keys.length];
            for (int i = 0; i < source.Keys.length; i++) {
                this.Keys[i] = new Key(source.Keys[i]);
            }
        }
        if (source.SessionKey != null) {
            this.SessionKey = new String(source.SessionKey);
        }
        if (source.ContentId != null) {
            this.ContentId = new String(source.ContentId);
        }
        if (source.Pssh != null) {
            this.Pssh = new String(source.Pssh);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Keys.", this.Keys);
        this.setParamSimple(map, prefix + "SessionKey", this.SessionKey);
        this.setParamSimple(map, prefix + "ContentId", this.ContentId);
        this.setParamSimple(map, prefix + "Pssh", this.Pssh);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

