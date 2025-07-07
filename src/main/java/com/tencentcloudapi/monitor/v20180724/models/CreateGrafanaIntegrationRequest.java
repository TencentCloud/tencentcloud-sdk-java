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

public class CreateGrafanaIntegrationRequest extends AbstractModel {

    /**
    * Grafana 实例 ID，例如：grafana-abcdefgh
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 集成类型(接口DescribeGrafanaIntegrationOverviews返回的集成信息中的Code字段)
    */
    @SerializedName("Kind")
    @Expose
    private String Kind;

    /**
    * 集成配置
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
     * Get Grafana 实例 ID，例如：grafana-abcdefgh 
     * @return InstanceId Grafana 实例 ID，例如：grafana-abcdefgh
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Grafana 实例 ID，例如：grafana-abcdefgh
     * @param InstanceId Grafana 实例 ID，例如：grafana-abcdefgh
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 集成类型(接口DescribeGrafanaIntegrationOverviews返回的集成信息中的Code字段) 
     * @return Kind 集成类型(接口DescribeGrafanaIntegrationOverviews返回的集成信息中的Code字段)
     */
    public String getKind() {
        return this.Kind;
    }

    /**
     * Set 集成类型(接口DescribeGrafanaIntegrationOverviews返回的集成信息中的Code字段)
     * @param Kind 集成类型(接口DescribeGrafanaIntegrationOverviews返回的集成信息中的Code字段)
     */
    public void setKind(String Kind) {
        this.Kind = Kind;
    }

    /**
     * Get 集成配置 
     * @return Content 集成配置
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 集成配置
     * @param Content 集成配置
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    public CreateGrafanaIntegrationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateGrafanaIntegrationRequest(CreateGrafanaIntegrationRequest source) {
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
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamSimple(map, prefix + "Content", this.Content);

    }
}

