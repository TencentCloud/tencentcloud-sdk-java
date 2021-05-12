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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PrometheusConfigItem extends AbstractModel{

    /**
    * 名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 配置内容
    */
    @SerializedName("Config")
    @Expose
    private String Config;

    /**
    * 用于出参，如果该配置来至模板，则为模板id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
     * Get 名称 
     * @return Name 名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称
     * @param Name 名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 配置内容 
     * @return Config 配置内容
     */
    public String getConfig() {
        return this.Config;
    }

    /**
     * Set 配置内容
     * @param Config 配置内容
     */
    public void setConfig(String Config) {
        this.Config = Config;
    }

    /**
     * Get 用于出参，如果该配置来至模板，则为模板id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TemplateId 用于出参，如果该配置来至模板，则为模板id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 用于出参，如果该配置来至模板，则为模板id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TemplateId 用于出参，如果该配置来至模板，则为模板id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    public PrometheusConfigItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrometheusConfigItem(PrometheusConfigItem source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Config != null) {
            this.Config = new String(source.Config);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Config", this.Config);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);

    }
}

