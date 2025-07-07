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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TsfConfigCenter extends AbstractModel {

    /**
    * 配置中心类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigType")
    @Expose
    private String ConfigType;

    /**
    * 配置中心实例id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigCenterInstanceId")
    @Expose
    private String ConfigCenterInstanceId;

    /**
    * 配置中心实例名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigCenterInstanceName")
    @Expose
    private String ConfigCenterInstanceName;

    /**
    * 实例地域id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegionId")
    @Expose
    private String RegionId;

    /**
    * 命名空间id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

    /**
    * 当前版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CurrentVersion")
    @Expose
    private String CurrentVersion;

    /**
    * 需要升级的版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetVersion")
    @Expose
    private String TargetVersion;

    /**
     * Get 配置中心类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigType 配置中心类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConfigType() {
        return this.ConfigType;
    }

    /**
     * Set 配置中心类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigType 配置中心类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigType(String ConfigType) {
        this.ConfigType = ConfigType;
    }

    /**
     * Get 配置中心实例id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigCenterInstanceId 配置中心实例id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConfigCenterInstanceId() {
        return this.ConfigCenterInstanceId;
    }

    /**
     * Set 配置中心实例id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigCenterInstanceId 配置中心实例id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigCenterInstanceId(String ConfigCenterInstanceId) {
        this.ConfigCenterInstanceId = ConfigCenterInstanceId;
    }

    /**
     * Get 配置中心实例名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigCenterInstanceName 配置中心实例名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConfigCenterInstanceName() {
        return this.ConfigCenterInstanceName;
    }

    /**
     * Set 配置中心实例名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigCenterInstanceName 配置中心实例名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigCenterInstanceName(String ConfigCenterInstanceName) {
        this.ConfigCenterInstanceName = ConfigCenterInstanceName;
    }

    /**
     * Get 实例地域id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegionId 实例地域id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 实例地域id
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegionId 实例地域id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegionId(String RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 命名空间id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NamespaceId 命名空间id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set 命名空间id
注意：此字段可能返回 null，表示取不到有效值。
     * @param NamespaceId 命名空间id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * Get 当前版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CurrentVersion 当前版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCurrentVersion() {
        return this.CurrentVersion;
    }

    /**
     * Set 当前版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param CurrentVersion 当前版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCurrentVersion(String CurrentVersion) {
        this.CurrentVersion = CurrentVersion;
    }

    /**
     * Get 需要升级的版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetVersion 需要升级的版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetVersion() {
        return this.TargetVersion;
    }

    /**
     * Set 需要升级的版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetVersion 需要升级的版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetVersion(String TargetVersion) {
        this.TargetVersion = TargetVersion;
    }

    public TsfConfigCenter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TsfConfigCenter(TsfConfigCenter source) {
        if (source.ConfigType != null) {
            this.ConfigType = new String(source.ConfigType);
        }
        if (source.ConfigCenterInstanceId != null) {
            this.ConfigCenterInstanceId = new String(source.ConfigCenterInstanceId);
        }
        if (source.ConfigCenterInstanceName != null) {
            this.ConfigCenterInstanceName = new String(source.ConfigCenterInstanceName);
        }
        if (source.RegionId != null) {
            this.RegionId = new String(source.RegionId);
        }
        if (source.NamespaceId != null) {
            this.NamespaceId = new String(source.NamespaceId);
        }
        if (source.CurrentVersion != null) {
            this.CurrentVersion = new String(source.CurrentVersion);
        }
        if (source.TargetVersion != null) {
            this.TargetVersion = new String(source.TargetVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConfigType", this.ConfigType);
        this.setParamSimple(map, prefix + "ConfigCenterInstanceId", this.ConfigCenterInstanceId);
        this.setParamSimple(map, prefix + "ConfigCenterInstanceName", this.ConfigCenterInstanceName);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamSimple(map, prefix + "CurrentVersion", this.CurrentVersion);
        this.setParamSimple(map, prefix + "TargetVersion", this.TargetVersion);

    }
}

