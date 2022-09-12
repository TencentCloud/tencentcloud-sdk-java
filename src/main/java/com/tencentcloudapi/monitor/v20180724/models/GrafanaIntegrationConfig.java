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

public class GrafanaIntegrationConfig extends AbstractModel{

    /**
    * 集成 ID
    */
    @SerializedName("IntegrationId")
    @Expose
    private String IntegrationId;

    /**
    * 集成类型
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
    * 集成描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Grafana 跳转地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GrafanaURL")
    @Expose
    private String GrafanaURL;

    /**
     * Get 集成 ID 
     * @return IntegrationId 集成 ID
     */
    public String getIntegrationId() {
        return this.IntegrationId;
    }

    /**
     * Set 集成 ID
     * @param IntegrationId 集成 ID
     */
    public void setIntegrationId(String IntegrationId) {
        this.IntegrationId = IntegrationId;
    }

    /**
     * Get 集成类型 
     * @return Kind 集成类型
     */
    public String getKind() {
        return this.Kind;
    }

    /**
     * Set 集成类型
     * @param Kind 集成类型
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

    /**
     * Get 集成描述 
     * @return Description 集成描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 集成描述
     * @param Description 集成描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Grafana 跳转地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GrafanaURL Grafana 跳转地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGrafanaURL() {
        return this.GrafanaURL;
    }

    /**
     * Set Grafana 跳转地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param GrafanaURL Grafana 跳转地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGrafanaURL(String GrafanaURL) {
        this.GrafanaURL = GrafanaURL;
    }

    public GrafanaIntegrationConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GrafanaIntegrationConfig(GrafanaIntegrationConfig source) {
        if (source.IntegrationId != null) {
            this.IntegrationId = new String(source.IntegrationId);
        }
        if (source.Kind != null) {
            this.Kind = new String(source.Kind);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.GrafanaURL != null) {
            this.GrafanaURL = new String(source.GrafanaURL);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IntegrationId", this.IntegrationId);
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "GrafanaURL", this.GrafanaURL);

    }
}

