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
package com.tencentcloudapi.apis.v20240801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAgentAppResp extends AbstractModel {

    /**
    * app id 
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * 如果authType为apiKey时，返回该字段
    */
    @SerializedName("ApiKey")
    @Expose
    private String ApiKey;

    /**
    * 如果authType为secretKey时，返回该字段
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
    * 如果authType为secretKey时，返回该字段
    */
    @SerializedName("SecretID")
    @Expose
    private String SecretID;

    /**
     * Get app id  
     * @return ID app id 
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set app id 
     * @param ID app id 
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get 如果authType为apiKey时，返回该字段 
     * @return ApiKey 如果authType为apiKey时，返回该字段
     */
    public String getApiKey() {
        return this.ApiKey;
    }

    /**
     * Set 如果authType为apiKey时，返回该字段
     * @param ApiKey 如果authType为apiKey时，返回该字段
     */
    public void setApiKey(String ApiKey) {
        this.ApiKey = ApiKey;
    }

    /**
     * Get 如果authType为secretKey时，返回该字段 
     * @return SecretKey 如果authType为secretKey时，返回该字段
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Set 如果authType为secretKey时，返回该字段
     * @param SecretKey 如果authType为secretKey时，返回该字段
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    /**
     * Get 如果authType为secretKey时，返回该字段 
     * @return SecretID 如果authType为secretKey时，返回该字段
     */
    public String getSecretID() {
        return this.SecretID;
    }

    /**
     * Set 如果authType为secretKey时，返回该字段
     * @param SecretID 如果authType为secretKey时，返回该字段
     */
    public void setSecretID(String SecretID) {
        this.SecretID = SecretID;
    }

    public CreateAgentAppResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAgentAppResp(CreateAgentAppResp source) {
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
        if (source.ApiKey != null) {
            this.ApiKey = new String(source.ApiKey);
        }
        if (source.SecretKey != null) {
            this.SecretKey = new String(source.SecretKey);
        }
        if (source.SecretID != null) {
            this.SecretID = new String(source.SecretID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "ApiKey", this.ApiKey);
        this.setParamSimple(map, prefix + "SecretKey", this.SecretKey);
        this.setParamSimple(map, prefix + "SecretID", this.SecretID);

    }
}

