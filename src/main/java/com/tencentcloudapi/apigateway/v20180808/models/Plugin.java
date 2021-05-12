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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Plugin extends AbstractModel{

    /**
    * 插件ID。
    */
    @SerializedName("PluginId")
    @Expose
    private String PluginId;

    /**
    * 插件名称。
    */
    @SerializedName("PluginName")
    @Expose
    private String PluginName;

    /**
    * 插件类型。
    */
    @SerializedName("PluginType")
    @Expose
    private String PluginType;

    /**
    * 插件定义语句。
    */
    @SerializedName("PluginData")
    @Expose
    private String PluginData;

    /**
    * 插件描述。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 插件创建时间。按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 插件修改时间。按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。
    */
    @SerializedName("ModifiedTime")
    @Expose
    private String ModifiedTime;

    /**
    * 插件绑定的API总数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AttachedApiTotalCount")
    @Expose
    private Long AttachedApiTotalCount;

    /**
    * 插件绑定的API信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AttachedApis")
    @Expose
    private AttachedApiInfo [] AttachedApis;

    /**
     * Get 插件ID。 
     * @return PluginId 插件ID。
     */
    public String getPluginId() {
        return this.PluginId;
    }

    /**
     * Set 插件ID。
     * @param PluginId 插件ID。
     */
    public void setPluginId(String PluginId) {
        this.PluginId = PluginId;
    }

    /**
     * Get 插件名称。 
     * @return PluginName 插件名称。
     */
    public String getPluginName() {
        return this.PluginName;
    }

    /**
     * Set 插件名称。
     * @param PluginName 插件名称。
     */
    public void setPluginName(String PluginName) {
        this.PluginName = PluginName;
    }

    /**
     * Get 插件类型。 
     * @return PluginType 插件类型。
     */
    public String getPluginType() {
        return this.PluginType;
    }

    /**
     * Set 插件类型。
     * @param PluginType 插件类型。
     */
    public void setPluginType(String PluginType) {
        this.PluginType = PluginType;
    }

    /**
     * Get 插件定义语句。 
     * @return PluginData 插件定义语句。
     */
    public String getPluginData() {
        return this.PluginData;
    }

    /**
     * Set 插件定义语句。
     * @param PluginData 插件定义语句。
     */
    public void setPluginData(String PluginData) {
        this.PluginData = PluginData;
    }

    /**
     * Get 插件描述。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 插件描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 插件描述。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 插件描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 插件创建时间。按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。 
     * @return CreatedTime 插件创建时间。按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 插件创建时间。按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。
     * @param CreatedTime 插件创建时间。按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 插件修改时间。按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。 
     * @return ModifiedTime 插件修改时间。按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。
     */
    public String getModifiedTime() {
        return this.ModifiedTime;
    }

    /**
     * Set 插件修改时间。按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。
     * @param ModifiedTime 插件修改时间。按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。
     */
    public void setModifiedTime(String ModifiedTime) {
        this.ModifiedTime = ModifiedTime;
    }

    /**
     * Get 插件绑定的API总数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AttachedApiTotalCount 插件绑定的API总数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAttachedApiTotalCount() {
        return this.AttachedApiTotalCount;
    }

    /**
     * Set 插件绑定的API总数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AttachedApiTotalCount 插件绑定的API总数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttachedApiTotalCount(Long AttachedApiTotalCount) {
        this.AttachedApiTotalCount = AttachedApiTotalCount;
    }

    /**
     * Get 插件绑定的API信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AttachedApis 插件绑定的API信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AttachedApiInfo [] getAttachedApis() {
        return this.AttachedApis;
    }

    /**
     * Set 插件绑定的API信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AttachedApis 插件绑定的API信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttachedApis(AttachedApiInfo [] AttachedApis) {
        this.AttachedApis = AttachedApis;
    }

    public Plugin() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Plugin(Plugin source) {
        if (source.PluginId != null) {
            this.PluginId = new String(source.PluginId);
        }
        if (source.PluginName != null) {
            this.PluginName = new String(source.PluginName);
        }
        if (source.PluginType != null) {
            this.PluginType = new String(source.PluginType);
        }
        if (source.PluginData != null) {
            this.PluginData = new String(source.PluginData);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.ModifiedTime != null) {
            this.ModifiedTime = new String(source.ModifiedTime);
        }
        if (source.AttachedApiTotalCount != null) {
            this.AttachedApiTotalCount = new Long(source.AttachedApiTotalCount);
        }
        if (source.AttachedApis != null) {
            this.AttachedApis = new AttachedApiInfo[source.AttachedApis.length];
            for (int i = 0; i < source.AttachedApis.length; i++) {
                this.AttachedApis[i] = new AttachedApiInfo(source.AttachedApis[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PluginId", this.PluginId);
        this.setParamSimple(map, prefix + "PluginName", this.PluginName);
        this.setParamSimple(map, prefix + "PluginType", this.PluginType);
        this.setParamSimple(map, prefix + "PluginData", this.PluginData);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "ModifiedTime", this.ModifiedTime);
        this.setParamSimple(map, prefix + "AttachedApiTotalCount", this.AttachedApiTotalCount);
        this.setParamArrayObj(map, prefix + "AttachedApis.", this.AttachedApis);

    }
}

