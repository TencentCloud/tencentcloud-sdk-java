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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateApiKeyRequest extends AbstractModel{

    /**
    * 待更换的密钥 ID。
    */
    @SerializedName("AccessKeyId")
    @Expose
    private String AccessKeyId;

    /**
    * 待更换的密钥 Key，更新自定义密钥时，该字段为必传。长度10 - 50字符，包括字母、数字、英文下划线。
    */
    @SerializedName("AccessKeySecret")
    @Expose
    private String AccessKeySecret;

    /**
     * Get 待更换的密钥 ID。 
     * @return AccessKeyId 待更换的密钥 ID。
     */
    public String getAccessKeyId() {
        return this.AccessKeyId;
    }

    /**
     * Set 待更换的密钥 ID。
     * @param AccessKeyId 待更换的密钥 ID。
     */
    public void setAccessKeyId(String AccessKeyId) {
        this.AccessKeyId = AccessKeyId;
    }

    /**
     * Get 待更换的密钥 Key，更新自定义密钥时，该字段为必传。长度10 - 50字符，包括字母、数字、英文下划线。 
     * @return AccessKeySecret 待更换的密钥 Key，更新自定义密钥时，该字段为必传。长度10 - 50字符，包括字母、数字、英文下划线。
     */
    public String getAccessKeySecret() {
        return this.AccessKeySecret;
    }

    /**
     * Set 待更换的密钥 Key，更新自定义密钥时，该字段为必传。长度10 - 50字符，包括字母、数字、英文下划线。
     * @param AccessKeySecret 待更换的密钥 Key，更新自定义密钥时，该字段为必传。长度10 - 50字符，包括字母、数字、英文下划线。
     */
    public void setAccessKeySecret(String AccessKeySecret) {
        this.AccessKeySecret = AccessKeySecret;
    }

    public UpdateApiKeyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateApiKeyRequest(UpdateApiKeyRequest source) {
        if (source.AccessKeyId != null) {
            this.AccessKeyId = new String(source.AccessKeyId);
        }
        if (source.AccessKeySecret != null) {
            this.AccessKeySecret = new String(source.AccessKeySecret);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccessKeyId", this.AccessKeyId);
        this.setParamSimple(map, prefix + "AccessKeySecret", this.AccessKeySecret);

    }
}

