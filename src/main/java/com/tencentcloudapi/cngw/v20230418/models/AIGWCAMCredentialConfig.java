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
package com.tencentcloudapi.cngw.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AIGWCAMCredentialConfig extends AbstractModel {

    /**
    * <p>SecretId</p>
    */
    @SerializedName("SecretId")
    @Expose
    private String SecretId;

    /**
    * <p>SecretKey</p>
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
     * Get <p>SecretId</p> 
     * @return SecretId <p>SecretId</p>
     */
    public String getSecretId() {
        return this.SecretId;
    }

    /**
     * Set <p>SecretId</p>
     * @param SecretId <p>SecretId</p>
     */
    public void setSecretId(String SecretId) {
        this.SecretId = SecretId;
    }

    /**
     * Get <p>SecretKey</p> 
     * @return SecretKey <p>SecretKey</p>
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Set <p>SecretKey</p>
     * @param SecretKey <p>SecretKey</p>
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    public AIGWCAMCredentialConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIGWCAMCredentialConfig(AIGWCAMCredentialConfig source) {
        if (source.SecretId != null) {
            this.SecretId = new String(source.SecretId);
        }
        if (source.SecretKey != null) {
            this.SecretKey = new String(source.SecretKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecretId", this.SecretId);
        this.setParamSimple(map, prefix + "SecretKey", this.SecretKey);

    }
}

