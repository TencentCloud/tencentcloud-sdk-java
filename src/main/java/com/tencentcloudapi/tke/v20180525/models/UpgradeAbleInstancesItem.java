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

public class UpgradeAbleInstancesItem extends AbstractModel{

    /**
    * 节点Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 节点的当前版本
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 当前版本的最新小版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LatestVersion")
    @Expose
    private String LatestVersion;

    /**
     * Get 节点Id 
     * @return InstanceId 节点Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 节点Id
     * @param InstanceId 节点Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 节点的当前版本 
     * @return Version 节点的当前版本
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 节点的当前版本
     * @param Version 节点的当前版本
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 当前版本的最新小版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LatestVersion 当前版本的最新小版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLatestVersion() {
        return this.LatestVersion;
    }

    /**
     * Set 当前版本的最新小版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param LatestVersion 当前版本的最新小版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLatestVersion(String LatestVersion) {
        this.LatestVersion = LatestVersion;
    }

    public UpgradeAbleInstancesItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpgradeAbleInstancesItem(UpgradeAbleInstancesItem source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.LatestVersion != null) {
            this.LatestVersion = new String(source.LatestVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "LatestVersion", this.LatestVersion);

    }
}

