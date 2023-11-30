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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SwitchInfo extends AbstractModel {

    /**
    * 开启标识符 true代表开启
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * CLS日志集ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * CLS日志主题ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 当前log-agent版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 是否可升级
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpgradeAble")
    @Expose
    private Boolean UpgradeAble;

    /**
    * CLS日志主题所属region
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopicRegion")
    @Expose
    private String TopicRegion;

    /**
     * Get 开启标识符 true代表开启
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Enable 开启标识符 true代表开启
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set 开启标识符 true代表开启
注意：此字段可能返回 null，表示取不到有效值。
     * @param Enable 开启标识符 true代表开启
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get CLS日志集ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogsetId CLS日志集ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set CLS日志集ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogsetId CLS日志集ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get CLS日志主题ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopicId CLS日志主题ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set CLS日志主题ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopicId CLS日志主题ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get 当前log-agent版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Version 当前log-agent版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 当前log-agent版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param Version 当前log-agent版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 是否可升级
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpgradeAble 是否可升级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getUpgradeAble() {
        return this.UpgradeAble;
    }

    /**
     * Set 是否可升级
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpgradeAble 是否可升级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpgradeAble(Boolean UpgradeAble) {
        this.UpgradeAble = UpgradeAble;
    }

    /**
     * Get CLS日志主题所属region
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopicRegion CLS日志主题所属region
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTopicRegion() {
        return this.TopicRegion;
    }

    /**
     * Set CLS日志主题所属region
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopicRegion CLS日志主题所属region
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopicRegion(String TopicRegion) {
        this.TopicRegion = TopicRegion;
    }

    public SwitchInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SwitchInfo(SwitchInfo source) {
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.UpgradeAble != null) {
            this.UpgradeAble = new Boolean(source.UpgradeAble);
        }
        if (source.TopicRegion != null) {
            this.TopicRegion = new String(source.TopicRegion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "UpgradeAble", this.UpgradeAble);
        this.setParamSimple(map, prefix + "TopicRegion", this.TopicRegion);

    }
}

