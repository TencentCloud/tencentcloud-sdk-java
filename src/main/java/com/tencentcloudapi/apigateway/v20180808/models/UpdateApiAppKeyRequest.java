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

public class UpdateApiAppKeyRequest extends AbstractModel{

    /**
    * 应用唯一 ID。
    */
    @SerializedName("ApiAppId")
    @Expose
    private String ApiAppId;

    /**
    * 应用的Key。
    */
    @SerializedName("ApiAppKey")
    @Expose
    private String ApiAppKey;

    /**
    * 应用的Secret。
    */
    @SerializedName("ApiAppSecret")
    @Expose
    private String ApiAppSecret;

    /**
     * Get 应用唯一 ID。 
     * @return ApiAppId 应用唯一 ID。
     */
    public String getApiAppId() {
        return this.ApiAppId;
    }

    /**
     * Set 应用唯一 ID。
     * @param ApiAppId 应用唯一 ID。
     */
    public void setApiAppId(String ApiAppId) {
        this.ApiAppId = ApiAppId;
    }

    /**
     * Get 应用的Key。 
     * @return ApiAppKey 应用的Key。
     */
    public String getApiAppKey() {
        return this.ApiAppKey;
    }

    /**
     * Set 应用的Key。
     * @param ApiAppKey 应用的Key。
     */
    public void setApiAppKey(String ApiAppKey) {
        this.ApiAppKey = ApiAppKey;
    }

    /**
     * Get 应用的Secret。 
     * @return ApiAppSecret 应用的Secret。
     */
    public String getApiAppSecret() {
        return this.ApiAppSecret;
    }

    /**
     * Set 应用的Secret。
     * @param ApiAppSecret 应用的Secret。
     */
    public void setApiAppSecret(String ApiAppSecret) {
        this.ApiAppSecret = ApiAppSecret;
    }

    public UpdateApiAppKeyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateApiAppKeyRequest(UpdateApiAppKeyRequest source) {
        if (source.ApiAppId != null) {
            this.ApiAppId = new String(source.ApiAppId);
        }
        if (source.ApiAppKey != null) {
            this.ApiAppKey = new String(source.ApiAppKey);
        }
        if (source.ApiAppSecret != null) {
            this.ApiAppSecret = new String(source.ApiAppSecret);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApiAppId", this.ApiAppId);
        this.setParamSimple(map, prefix + "ApiAppKey", this.ApiAppKey);
        this.setParamSimple(map, prefix + "ApiAppSecret", this.ApiAppSecret);

    }
}

