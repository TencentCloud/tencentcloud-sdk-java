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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AIGWAKSKCredentialConfig extends AbstractModel {

    /**
    * <p>AccessKeyId</p>
    */
    @SerializedName("AccessKeyId")
    @Expose
    private String AccessKeyId;

    /**
    * <p>SecretAccessKey</p>
    */
    @SerializedName("SecretAccessKey")
    @Expose
    private String SecretAccessKey;

    /**
     * Get <p>AccessKeyId</p> 
     * @return AccessKeyId <p>AccessKeyId</p>
     */
    public String getAccessKeyId() {
        return this.AccessKeyId;
    }

    /**
     * Set <p>AccessKeyId</p>
     * @param AccessKeyId <p>AccessKeyId</p>
     */
    public void setAccessKeyId(String AccessKeyId) {
        this.AccessKeyId = AccessKeyId;
    }

    /**
     * Get <p>SecretAccessKey</p> 
     * @return SecretAccessKey <p>SecretAccessKey</p>
     */
    public String getSecretAccessKey() {
        return this.SecretAccessKey;
    }

    /**
     * Set <p>SecretAccessKey</p>
     * @param SecretAccessKey <p>SecretAccessKey</p>
     */
    public void setSecretAccessKey(String SecretAccessKey) {
        this.SecretAccessKey = SecretAccessKey;
    }

    public AIGWAKSKCredentialConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIGWAKSKCredentialConfig(AIGWAKSKCredentialConfig source) {
        if (source.AccessKeyId != null) {
            this.AccessKeyId = new String(source.AccessKeyId);
        }
        if (source.SecretAccessKey != null) {
            this.SecretAccessKey = new String(source.SecretAccessKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccessKeyId", this.AccessKeyId);
        this.setParamSimple(map, prefix + "SecretAccessKey", this.SecretAccessKey);

    }
}

