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

public class AgentCredentialContentDTO extends AbstractModel {

    /**
    * 如果认证类型为sts时，该项必填
    */
    @SerializedName("STSSystem")
    @Expose
    private String STSSystem;

    /**
    * 如果认证类型为sts时，该项必填
    */
    @SerializedName("STSService")
    @Expose
    private String STSService;

    /**
    * 如果认证类型为reqKey时，该项必填
    */
    @SerializedName("Headers")
    @Expose
    private AgentCredentialContentHeaderDTO [] Headers;

    /**
     * Get 如果认证类型为sts时，该项必填 
     * @return STSSystem 如果认证类型为sts时，该项必填
     */
    public String getSTSSystem() {
        return this.STSSystem;
    }

    /**
     * Set 如果认证类型为sts时，该项必填
     * @param STSSystem 如果认证类型为sts时，该项必填
     */
    public void setSTSSystem(String STSSystem) {
        this.STSSystem = STSSystem;
    }

    /**
     * Get 如果认证类型为sts时，该项必填 
     * @return STSService 如果认证类型为sts时，该项必填
     */
    public String getSTSService() {
        return this.STSService;
    }

    /**
     * Set 如果认证类型为sts时，该项必填
     * @param STSService 如果认证类型为sts时，该项必填
     */
    public void setSTSService(String STSService) {
        this.STSService = STSService;
    }

    /**
     * Get 如果认证类型为reqKey时，该项必填 
     * @return Headers 如果认证类型为reqKey时，该项必填
     */
    public AgentCredentialContentHeaderDTO [] getHeaders() {
        return this.Headers;
    }

    /**
     * Set 如果认证类型为reqKey时，该项必填
     * @param Headers 如果认证类型为reqKey时，该项必填
     */
    public void setHeaders(AgentCredentialContentHeaderDTO [] Headers) {
        this.Headers = Headers;
    }

    public AgentCredentialContentDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentCredentialContentDTO(AgentCredentialContentDTO source) {
        if (source.STSSystem != null) {
            this.STSSystem = new String(source.STSSystem);
        }
        if (source.STSService != null) {
            this.STSService = new String(source.STSService);
        }
        if (source.Headers != null) {
            this.Headers = new AgentCredentialContentHeaderDTO[source.Headers.length];
            for (int i = 0; i < source.Headers.length; i++) {
                this.Headers[i] = new AgentCredentialContentHeaderDTO(source.Headers[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "STSSystem", this.STSSystem);
        this.setParamSimple(map, prefix + "STSService", this.STSService);
        this.setParamArrayObj(map, prefix + "Headers.", this.Headers);

    }
}

