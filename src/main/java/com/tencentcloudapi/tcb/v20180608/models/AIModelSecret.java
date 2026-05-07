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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AIModelSecret extends AbstractModel {

    /**
    * 密钥来源
    */
    @SerializedName("SecretSource")
    @Expose
    private String SecretSource;

    /**
    * 密钥ID, 和SecretKey一一对应
    */
    @SerializedName("SecretId")
    @Expose
    private String SecretId;

    /**
    * 密钥Key, 和SecretId一一对应
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
    * ApiKey,SecretKey和ApiKey二选一
    */
    @SerializedName("ApiKey")
    @Expose
    private String ApiKey;

    /**
     * Get 密钥来源 
     * @return SecretSource 密钥来源
     */
    public String getSecretSource() {
        return this.SecretSource;
    }

    /**
     * Set 密钥来源
     * @param SecretSource 密钥来源
     */
    public void setSecretSource(String SecretSource) {
        this.SecretSource = SecretSource;
    }

    /**
     * Get 密钥ID, 和SecretKey一一对应 
     * @return SecretId 密钥ID, 和SecretKey一一对应
     */
    public String getSecretId() {
        return this.SecretId;
    }

    /**
     * Set 密钥ID, 和SecretKey一一对应
     * @param SecretId 密钥ID, 和SecretKey一一对应
     */
    public void setSecretId(String SecretId) {
        this.SecretId = SecretId;
    }

    /**
     * Get 密钥Key, 和SecretId一一对应 
     * @return SecretKey 密钥Key, 和SecretId一一对应
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Set 密钥Key, 和SecretId一一对应
     * @param SecretKey 密钥Key, 和SecretId一一对应
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    /**
     * Get ApiKey,SecretKey和ApiKey二选一 
     * @return ApiKey ApiKey,SecretKey和ApiKey二选一
     */
    public String getApiKey() {
        return this.ApiKey;
    }

    /**
     * Set ApiKey,SecretKey和ApiKey二选一
     * @param ApiKey ApiKey,SecretKey和ApiKey二选一
     */
    public void setApiKey(String ApiKey) {
        this.ApiKey = ApiKey;
    }

    public AIModelSecret() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIModelSecret(AIModelSecret source) {
        if (source.SecretSource != null) {
            this.SecretSource = new String(source.SecretSource);
        }
        if (source.SecretId != null) {
            this.SecretId = new String(source.SecretId);
        }
        if (source.SecretKey != null) {
            this.SecretKey = new String(source.SecretKey);
        }
        if (source.ApiKey != null) {
            this.ApiKey = new String(source.ApiKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecretSource", this.SecretSource);
        this.setParamSimple(map, prefix + "SecretId", this.SecretId);
        this.setParamSimple(map, prefix + "SecretKey", this.SecretKey);
        this.setParamSimple(map, prefix + "ApiKey", this.ApiKey);

    }
}

