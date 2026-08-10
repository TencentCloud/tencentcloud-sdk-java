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
    * <p>如果认证类型为sts时，该项必填</p>
    */
    @SerializedName("STSSystem")
    @Expose
    private String STSSystem;

    /**
    * <p>如果认证类型为sts时，该项必填</p>
    */
    @SerializedName("STSService")
    @Expose
    private String STSService;

    /**
    * <p>如果认证类型为reqKey时，该项必填</p>
    */
    @SerializedName("Headers")
    @Expose
    private AgentCredentialContentHeaderDTO [] Headers;

    /**
    * <p>如果认证类型为apiKey时，该项必填</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApiKeys")
    @Expose
    private AgentCredentialApiKeyDTO [] ApiKeys;

    /**
    * <p>容错策略，仅Type为apiKey时支持</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FaultTolerance")
    @Expose
    private FaultToleranceDTO FaultTolerance;

    /**
     * Get <p>如果认证类型为sts时，该项必填</p> 
     * @return STSSystem <p>如果认证类型为sts时，该项必填</p>
     */
    public String getSTSSystem() {
        return this.STSSystem;
    }

    /**
     * Set <p>如果认证类型为sts时，该项必填</p>
     * @param STSSystem <p>如果认证类型为sts时，该项必填</p>
     */
    public void setSTSSystem(String STSSystem) {
        this.STSSystem = STSSystem;
    }

    /**
     * Get <p>如果认证类型为sts时，该项必填</p> 
     * @return STSService <p>如果认证类型为sts时，该项必填</p>
     */
    public String getSTSService() {
        return this.STSService;
    }

    /**
     * Set <p>如果认证类型为sts时，该项必填</p>
     * @param STSService <p>如果认证类型为sts时，该项必填</p>
     */
    public void setSTSService(String STSService) {
        this.STSService = STSService;
    }

    /**
     * Get <p>如果认证类型为reqKey时，该项必填</p> 
     * @return Headers <p>如果认证类型为reqKey时，该项必填</p>
     */
    public AgentCredentialContentHeaderDTO [] getHeaders() {
        return this.Headers;
    }

    /**
     * Set <p>如果认证类型为reqKey时，该项必填</p>
     * @param Headers <p>如果认证类型为reqKey时，该项必填</p>
     */
    public void setHeaders(AgentCredentialContentHeaderDTO [] Headers) {
        this.Headers = Headers;
    }

    /**
     * Get <p>如果认证类型为apiKey时，该项必填</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApiKeys <p>如果认证类型为apiKey时，该项必填</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AgentCredentialApiKeyDTO [] getApiKeys() {
        return this.ApiKeys;
    }

    /**
     * Set <p>如果认证类型为apiKey时，该项必填</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApiKeys <p>如果认证类型为apiKey时，该项必填</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApiKeys(AgentCredentialApiKeyDTO [] ApiKeys) {
        this.ApiKeys = ApiKeys;
    }

    /**
     * Get <p>容错策略，仅Type为apiKey时支持</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FaultTolerance <p>容错策略，仅Type为apiKey时支持</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FaultToleranceDTO getFaultTolerance() {
        return this.FaultTolerance;
    }

    /**
     * Set <p>容错策略，仅Type为apiKey时支持</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FaultTolerance <p>容错策略，仅Type为apiKey时支持</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFaultTolerance(FaultToleranceDTO FaultTolerance) {
        this.FaultTolerance = FaultTolerance;
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
        if (source.ApiKeys != null) {
            this.ApiKeys = new AgentCredentialApiKeyDTO[source.ApiKeys.length];
            for (int i = 0; i < source.ApiKeys.length; i++) {
                this.ApiKeys[i] = new AgentCredentialApiKeyDTO(source.ApiKeys[i]);
            }
        }
        if (source.FaultTolerance != null) {
            this.FaultTolerance = new FaultToleranceDTO(source.FaultTolerance);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "STSSystem", this.STSSystem);
        this.setParamSimple(map, prefix + "STSService", this.STSService);
        this.setParamArrayObj(map, prefix + "Headers.", this.Headers);
        this.setParamArrayObj(map, prefix + "ApiKeys.", this.ApiKeys);
        this.setParamObj(map, prefix + "FaultTolerance.", this.FaultTolerance);

    }
}

