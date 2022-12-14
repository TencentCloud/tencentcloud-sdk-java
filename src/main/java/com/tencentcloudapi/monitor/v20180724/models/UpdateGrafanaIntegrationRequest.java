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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateGrafanaIntegrationRequest extends AbstractModel{

    /**
    * 集成 ID，可在实例详情-云产品集成-集成列表查看。例如：integration-abcd1234
    */
    @SerializedName("IntegrationId")
    @Expose
    private String IntegrationId;

    /**
    * Grafana 实例 ID，例如：grafana-12345678
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 集成类型，可在实例详情-云产品集成-集成列表查看。例如：tencent-cloud-prometheus
    */
    @SerializedName("Kind")
    @Expose
    private String Kind;

    /**
    * 集成内容
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
     * Get 集成 ID，可在实例详情-云产品集成-集成列表查看。例如：integration-abcd1234 
     * @return IntegrationId 集成 ID，可在实例详情-云产品集成-集成列表查看。例如：integration-abcd1234
     */
    public String getIntegrationId() {
        return this.IntegrationId;
    }

    /**
     * Set 集成 ID，可在实例详情-云产品集成-集成列表查看。例如：integration-abcd1234
     * @param IntegrationId 集成 ID，可在实例详情-云产品集成-集成列表查看。例如：integration-abcd1234
     */
    public void setIntegrationId(String IntegrationId) {
        this.IntegrationId = IntegrationId;
    }

    /**
     * Get Grafana 实例 ID，例如：grafana-12345678 
     * @return InstanceId Grafana 实例 ID，例如：grafana-12345678
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Grafana 实例 ID，例如：grafana-12345678
     * @param InstanceId Grafana 实例 ID，例如：grafana-12345678
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 集成类型，可在实例详情-云产品集成-集成列表查看。例如：tencent-cloud-prometheus 
     * @return Kind 集成类型，可在实例详情-云产品集成-集成列表查看。例如：tencent-cloud-prometheus
     */
    public String getKind() {
        return this.Kind;
    }

    /**
     * Set 集成类型，可在实例详情-云产品集成-集成列表查看。例如：tencent-cloud-prometheus
     * @param Kind 集成类型，可在实例详情-云产品集成-集成列表查看。例如：tencent-cloud-prometheus
     */
    public void setKind(String Kind) {
        this.Kind = Kind;
    }

    /**
     * Get 集成内容 
     * @return Content 集成内容
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 集成内容
     * @param Content 集成内容
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    public UpdateGrafanaIntegrationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateGrafanaIntegrationRequest(UpdateGrafanaIntegrationRequest source) {
        if (source.IntegrationId != null) {
            this.IntegrationId = new String(source.IntegrationId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Kind != null) {
            this.Kind = new String(source.Kind);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IntegrationId", this.IntegrationId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamSimple(map, prefix + "Content", this.Content);

    }
}

