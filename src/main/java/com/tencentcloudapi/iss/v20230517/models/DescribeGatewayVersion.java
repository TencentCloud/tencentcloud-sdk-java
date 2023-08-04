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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeGatewayVersion extends AbstractModel{

    /**
    * 服务名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 服务版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 服务最新版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LatestVersion")
    @Expose
    private String LatestVersion;

    /**
    * 是否需要更新
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsUpdate")
    @Expose
    private Boolean IsUpdate;

    /**
    * 升级信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpgradeInfo")
    @Expose
    private String [] UpgradeInfo;

    /**
     * Get 服务名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 服务名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 服务名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 服务名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 服务版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Version 服务版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 服务版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param Version 服务版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 服务最新版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LatestVersion 服务最新版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLatestVersion() {
        return this.LatestVersion;
    }

    /**
     * Set 服务最新版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param LatestVersion 服务最新版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLatestVersion(String LatestVersion) {
        this.LatestVersion = LatestVersion;
    }

    /**
     * Get 是否需要更新
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsUpdate 是否需要更新
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsUpdate() {
        return this.IsUpdate;
    }

    /**
     * Set 是否需要更新
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsUpdate 是否需要更新
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsUpdate(Boolean IsUpdate) {
        this.IsUpdate = IsUpdate;
    }

    /**
     * Get 升级信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpgradeInfo 升级信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getUpgradeInfo() {
        return this.UpgradeInfo;
    }

    /**
     * Set 升级信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpgradeInfo 升级信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpgradeInfo(String [] UpgradeInfo) {
        this.UpgradeInfo = UpgradeInfo;
    }

    public DescribeGatewayVersion() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGatewayVersion(DescribeGatewayVersion source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.LatestVersion != null) {
            this.LatestVersion = new String(source.LatestVersion);
        }
        if (source.IsUpdate != null) {
            this.IsUpdate = new Boolean(source.IsUpdate);
        }
        if (source.UpgradeInfo != null) {
            this.UpgradeInfo = new String[source.UpgradeInfo.length];
            for (int i = 0; i < source.UpgradeInfo.length; i++) {
                this.UpgradeInfo[i] = new String(source.UpgradeInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "LatestVersion", this.LatestVersion);
        this.setParamSimple(map, prefix + "IsUpdate", this.IsUpdate);
        this.setParamArraySimple(map, prefix + "UpgradeInfo.", this.UpgradeInfo);

    }
}

