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
package com.tencentcloudapi.hai.v20230812.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApplicationInfo extends AbstractModel {

    /**
    * 应用id

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 应用名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
    * 应用描述

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 应用的环境配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigEnvironment")
    @Expose
    private String ConfigEnvironment;

    /**
    * 系统盘大小下限
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MinSystemDiskSize")
    @Expose
    private Long MinSystemDiskSize;

    /**
     * Get 应用id

注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplicationId 应用id

注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 应用id

注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationId 应用id

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 应用名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplicationName 应用名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set 应用名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationName 应用名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    /**
     * Get 应用描述

注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 应用描述

注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 应用描述

注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 应用描述

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 应用的环境配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigEnvironment 应用的环境配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConfigEnvironment() {
        return this.ConfigEnvironment;
    }

    /**
     * Set 应用的环境配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigEnvironment 应用的环境配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigEnvironment(String ConfigEnvironment) {
        this.ConfigEnvironment = ConfigEnvironment;
    }

    /**
     * Get 系统盘大小下限
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MinSystemDiskSize 系统盘大小下限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMinSystemDiskSize() {
        return this.MinSystemDiskSize;
    }

    /**
     * Set 系统盘大小下限
注意：此字段可能返回 null，表示取不到有效值。
     * @param MinSystemDiskSize 系统盘大小下限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMinSystemDiskSize(Long MinSystemDiskSize) {
        this.MinSystemDiskSize = MinSystemDiskSize;
    }

    public ApplicationInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplicationInfo(ApplicationInfo source) {
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.ApplicationName != null) {
            this.ApplicationName = new String(source.ApplicationName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ConfigEnvironment != null) {
            this.ConfigEnvironment = new String(source.ConfigEnvironment);
        }
        if (source.MinSystemDiskSize != null) {
            this.MinSystemDiskSize = new Long(source.MinSystemDiskSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "ApplicationName", this.ApplicationName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ConfigEnvironment", this.ConfigEnvironment);
        this.setParamSimple(map, prefix + "MinSystemDiskSize", this.MinSystemDiskSize);

    }
}

