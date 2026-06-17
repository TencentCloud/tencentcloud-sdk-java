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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeGrafanaIntegrationsRequest extends AbstractModel {

    /**
    * <p>实例 ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>集成 ID</p>
    */
    @SerializedName("IntegrationId")
    @Expose
    private String IntegrationId;

    /**
    * <p>类型</p>
    */
    @SerializedName("Kind")
    @Expose
    private String Kind;

    /**
     * Get <p>实例 ID</p> 
     * @return InstanceId <p>实例 ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例 ID</p>
     * @param InstanceId <p>实例 ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>集成 ID</p> 
     * @return IntegrationId <p>集成 ID</p>
     */
    public String getIntegrationId() {
        return this.IntegrationId;
    }

    /**
     * Set <p>集成 ID</p>
     * @param IntegrationId <p>集成 ID</p>
     */
    public void setIntegrationId(String IntegrationId) {
        this.IntegrationId = IntegrationId;
    }

    /**
     * Get <p>类型</p> 
     * @return Kind <p>类型</p>
     */
    public String getKind() {
        return this.Kind;
    }

    /**
     * Set <p>类型</p>
     * @param Kind <p>类型</p>
     */
    public void setKind(String Kind) {
        this.Kind = Kind;
    }

    public DescribeGrafanaIntegrationsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGrafanaIntegrationsRequest(DescribeGrafanaIntegrationsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.IntegrationId != null) {
            this.IntegrationId = new String(source.IntegrationId);
        }
        if (source.Kind != null) {
            this.Kind = new String(source.Kind);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "IntegrationId", this.IntegrationId);
        this.setParamSimple(map, prefix + "Kind", this.Kind);

    }
}

