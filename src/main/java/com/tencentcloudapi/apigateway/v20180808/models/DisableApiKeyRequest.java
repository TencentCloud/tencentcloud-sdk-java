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

public class DisableApiKeyRequest extends AbstractModel{

    /**
    * 待禁用的密钥 ID。
    */
    @SerializedName("AccessKeyId")
    @Expose
    private String AccessKeyId;

    /**
     * Get 待禁用的密钥 ID。 
     * @return AccessKeyId 待禁用的密钥 ID。
     */
    public String getAccessKeyId() {
        return this.AccessKeyId;
    }

    /**
     * Set 待禁用的密钥 ID。
     * @param AccessKeyId 待禁用的密钥 ID。
     */
    public void setAccessKeyId(String AccessKeyId) {
        this.AccessKeyId = AccessKeyId;
    }

    public DisableApiKeyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DisableApiKeyRequest(DisableApiKeyRequest source) {
        if (source.AccessKeyId != null) {
            this.AccessKeyId = new String(source.AccessKeyId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccessKeyId", this.AccessKeyId);

    }
}

