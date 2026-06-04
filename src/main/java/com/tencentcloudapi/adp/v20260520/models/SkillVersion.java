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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SkillVersion extends AbstractModel {

    /**
    * 检测信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AnalysisInfo")
    @Expose
    private SkillAnalysisInfo AnalysisInfo;

    /**
    * 当前生效版本号
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 当前生效版本ID
    */
    @SerializedName("VersionId")
    @Expose
    private String VersionId;

    /**
     * Get 检测信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AnalysisInfo 检测信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SkillAnalysisInfo getAnalysisInfo() {
        return this.AnalysisInfo;
    }

    /**
     * Set 检测信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param AnalysisInfo 检测信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAnalysisInfo(SkillAnalysisInfo AnalysisInfo) {
        this.AnalysisInfo = AnalysisInfo;
    }

    /**
     * Get 当前生效版本号 
     * @return Version 当前生效版本号
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 当前生效版本号
     * @param Version 当前生效版本号
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 当前生效版本ID 
     * @return VersionId 当前生效版本ID
     */
    public String getVersionId() {
        return this.VersionId;
    }

    /**
     * Set 当前生效版本ID
     * @param VersionId 当前生效版本ID
     */
    public void setVersionId(String VersionId) {
        this.VersionId = VersionId;
    }

    public SkillVersion() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SkillVersion(SkillVersion source) {
        if (source.AnalysisInfo != null) {
            this.AnalysisInfo = new SkillAnalysisInfo(source.AnalysisInfo);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.VersionId != null) {
            this.VersionId = new String(source.VersionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "AnalysisInfo.", this.AnalysisInfo);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "VersionId", this.VersionId);

    }
}

