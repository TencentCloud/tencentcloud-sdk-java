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
package com.tencentcloudapi.eiam.v20210420.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApplicationInformation extends AbstractModel{

    /**
    * 应用ID，是应用的全局唯一标识。
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 应用展示名称，长度限制：64个字符。 默认与应用名字相同。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * 应用创建时间，符合 ISO8601 标准。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedDate")
    @Expose
    private String CreatedDate;

    /**
    * 上次更新时间，符合 ISO8601 标准。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastModifiedDate")
    @Expose
    private String LastModifiedDate;

    /**
    * 应用状态。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppStatus")
    @Expose
    private Boolean AppStatus;

    /**
    * 应用图标。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Icon")
    @Expose
    private String Icon;

    /**
    * 应用类型。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplicationType")
    @Expose
    private String ApplicationType;

    /**
    * 客户端id。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClientId")
    @Expose
    private String ClientId;

    /**
     * Get 应用ID，是应用的全局唯一标识。 
     * @return ApplicationId 应用ID，是应用的全局唯一标识。
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 应用ID，是应用的全局唯一标识。
     * @param ApplicationId 应用ID，是应用的全局唯一标识。
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 应用展示名称，长度限制：64个字符。 默认与应用名字相同。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DisplayName 应用展示名称，长度限制：64个字符。 默认与应用名字相同。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set 应用展示名称，长度限制：64个字符。 默认与应用名字相同。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DisplayName 应用展示名称，长度限制：64个字符。 默认与应用名字相同。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get 应用创建时间，符合 ISO8601 标准。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedDate 应用创建时间，符合 ISO8601 标准。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedDate() {
        return this.CreatedDate;
    }

    /**
     * Set 应用创建时间，符合 ISO8601 标准。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedDate 应用创建时间，符合 ISO8601 标准。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedDate(String CreatedDate) {
        this.CreatedDate = CreatedDate;
    }

    /**
     * Get 上次更新时间，符合 ISO8601 标准。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastModifiedDate 上次更新时间，符合 ISO8601 标准。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastModifiedDate() {
        return this.LastModifiedDate;
    }

    /**
     * Set 上次更新时间，符合 ISO8601 标准。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastModifiedDate 上次更新时间，符合 ISO8601 标准。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastModifiedDate(String LastModifiedDate) {
        this.LastModifiedDate = LastModifiedDate;
    }

    /**
     * Get 应用状态。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppStatus 应用状态。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getAppStatus() {
        return this.AppStatus;
    }

    /**
     * Set 应用状态。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppStatus 应用状态。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppStatus(Boolean AppStatus) {
        this.AppStatus = AppStatus;
    }

    /**
     * Get 应用图标。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Icon 应用图标。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIcon() {
        return this.Icon;
    }

    /**
     * Set 应用图标。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Icon 应用图标。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIcon(String Icon) {
        this.Icon = Icon;
    }

    /**
     * Get 应用类型。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplicationType 应用类型。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApplicationType() {
        return this.ApplicationType;
    }

    /**
     * Set 应用类型。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationType 应用类型。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationType(String ApplicationType) {
        this.ApplicationType = ApplicationType;
    }

    /**
     * Get 客户端id。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClientId 客户端id。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClientId() {
        return this.ClientId;
    }

    /**
     * Set 客户端id。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClientId 客户端id。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClientId(String ClientId) {
        this.ClientId = ClientId;
    }

    public ApplicationInformation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplicationInformation(ApplicationInformation source) {
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.CreatedDate != null) {
            this.CreatedDate = new String(source.CreatedDate);
        }
        if (source.LastModifiedDate != null) {
            this.LastModifiedDate = new String(source.LastModifiedDate);
        }
        if (source.AppStatus != null) {
            this.AppStatus = new Boolean(source.AppStatus);
        }
        if (source.Icon != null) {
            this.Icon = new String(source.Icon);
        }
        if (source.ApplicationType != null) {
            this.ApplicationType = new String(source.ApplicationType);
        }
        if (source.ClientId != null) {
            this.ClientId = new String(source.ClientId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "CreatedDate", this.CreatedDate);
        this.setParamSimple(map, prefix + "LastModifiedDate", this.LastModifiedDate);
        this.setParamSimple(map, prefix + "AppStatus", this.AppStatus);
        this.setParamSimple(map, prefix + "Icon", this.Icon);
        this.setParamSimple(map, prefix + "ApplicationType", this.ApplicationType);
        this.setParamSimple(map, prefix + "ClientId", this.ClientId);

    }
}

