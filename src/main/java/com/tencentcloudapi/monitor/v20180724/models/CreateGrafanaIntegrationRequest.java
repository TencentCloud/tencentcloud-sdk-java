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
    * <p>Grafana 实例 ID，例如：grafana-abcdefgh</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>集成类型(接口DescribeGrafanaIntegrationOverviews返回的集成信息中的Code字段)</p>
    */
    @SerializedName("Kind")
    @Expose
    private String Kind;

    /**
    * <p>集成配置</p>
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
     * Get <p>Grafana 实例 ID，例如：grafana-abcdefgh</p> 
     * @return InstanceId <p>Grafana 实例 ID，例如：grafana-abcdefgh</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Grafana 实例 ID，例如：grafana-abcdefgh</p>
     * @param InstanceId <p>Grafana 实例 ID，例如：grafana-abcdefgh</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>集成类型(接口DescribeGrafanaIntegrationOverviews返回的集成信息中的Code字段)</p> 
     * @return Kind <p>集成类型(接口DescribeGrafanaIntegrationOverviews返回的集成信息中的Code字段)</p>
     */
    public String getKind() {
        return this.Kind;
    }

    /**
     * Set <p>集成类型(接口DescribeGrafanaIntegrationOverviews返回的集成信息中的Code字段)</p>
     * @param Kind <p>集成类型(接口DescribeGrafanaIntegrationOverviews返回的集成信息中的Code字段)</p>
     */
    public void setKind(String Kind) {
        this.Kind = Kind;
    }

    /**
     * Get <p>集成配置</p> 
     * @return Content <p>集成配置</p>
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set <p>集成配置</p>
     * @param Content <p>集成配置</p>
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

