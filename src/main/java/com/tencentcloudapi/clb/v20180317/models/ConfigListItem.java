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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConfigListItem extends AbstractModel{

    /**
    * 配置ID
    */
    @SerializedName("UconfigId")
    @Expose
    private String UconfigId;

    /**
    * 配置类型
    */
    @SerializedName("ConfigType")
    @Expose
    private String ConfigType;

    /**
    * 配置名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigName")
    @Expose
    private String ConfigName;

    /**
    * 配置内容
    */
    @SerializedName("ConfigContent")
    @Expose
    private String ConfigContent;

    /**
    * 增加配置时间
    */
    @SerializedName("CreateTimestamp")
    @Expose
    private String CreateTimestamp;

    /**
    * 修改配置时间
    */
    @SerializedName("UpdateTimestamp")
    @Expose
    private String UpdateTimestamp;

    /**
     * Get 配置ID 
     * @return UconfigId 配置ID
     */
    public String getUconfigId() {
        return this.UconfigId;
    }

    /**
     * Set 配置ID
     * @param UconfigId 配置ID
     */
    public void setUconfigId(String UconfigId) {
        this.UconfigId = UconfigId;
    }

    /**
     * Get 配置类型 
     * @return ConfigType 配置类型
     */
    public String getConfigType() {
        return this.ConfigType;
    }

    /**
     * Set 配置类型
     * @param ConfigType 配置类型
     */
    public void setConfigType(String ConfigType) {
        this.ConfigType = ConfigType;
    }

    /**
     * Get 配置名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigName 配置名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConfigName() {
        return this.ConfigName;
    }

    /**
     * Set 配置名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigName 配置名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigName(String ConfigName) {
        this.ConfigName = ConfigName;
    }

    /**
     * Get 配置内容 
     * @return ConfigContent 配置内容
     */
    public String getConfigContent() {
        return this.ConfigContent;
    }

    /**
     * Set 配置内容
     * @param ConfigContent 配置内容
     */
    public void setConfigContent(String ConfigContent) {
        this.ConfigContent = ConfigContent;
    }

    /**
     * Get 增加配置时间 
     * @return CreateTimestamp 增加配置时间
     */
    public String getCreateTimestamp() {
        return this.CreateTimestamp;
    }

    /**
     * Set 增加配置时间
     * @param CreateTimestamp 增加配置时间
     */
    public void setCreateTimestamp(String CreateTimestamp) {
        this.CreateTimestamp = CreateTimestamp;
    }

    /**
     * Get 修改配置时间 
     * @return UpdateTimestamp 修改配置时间
     */
    public String getUpdateTimestamp() {
        return this.UpdateTimestamp;
    }

    /**
     * Set 修改配置时间
     * @param UpdateTimestamp 修改配置时间
     */
    public void setUpdateTimestamp(String UpdateTimestamp) {
        this.UpdateTimestamp = UpdateTimestamp;
    }

    public ConfigListItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConfigListItem(ConfigListItem source) {
        if (source.UconfigId != null) {
            this.UconfigId = new String(source.UconfigId);
        }
        if (source.ConfigType != null) {
            this.ConfigType = new String(source.ConfigType);
        }
        if (source.ConfigName != null) {
            this.ConfigName = new String(source.ConfigName);
        }
        if (source.ConfigContent != null) {
            this.ConfigContent = new String(source.ConfigContent);
        }
        if (source.CreateTimestamp != null) {
            this.CreateTimestamp = new String(source.CreateTimestamp);
        }
        if (source.UpdateTimestamp != null) {
            this.UpdateTimestamp = new String(source.UpdateTimestamp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UconfigId", this.UconfigId);
        this.setParamSimple(map, prefix + "ConfigType", this.ConfigType);
        this.setParamSimple(map, prefix + "ConfigName", this.ConfigName);
        this.setParamSimple(map, prefix + "ConfigContent", this.ConfigContent);
        this.setParamSimple(map, prefix + "CreateTimestamp", this.CreateTimestamp);
        this.setParamSimple(map, prefix + "UpdateTimestamp", this.UpdateTimestamp);

    }
}

