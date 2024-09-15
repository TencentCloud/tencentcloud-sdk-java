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
package com.tencentcloudapi.omics.v20221128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NFOption extends AbstractModel {

    /**
    * Config。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Config")
    @Expose
    private String Config;

    /**
    * Profile。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Profile")
    @Expose
    private String Profile;

    /**
    * Report。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Report")
    @Expose
    private Boolean Report;

    /**
    * Resume。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Resume")
    @Expose
    private Boolean Resume;

    /**
    * Nextflow引擎版本，取值范围：
- 22.10.7
- 23.10.1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NFVersion")
    @Expose
    private String NFVersion;

    /**
    * 启动路径。可填写指定缓存卷内的绝对路径，nextflow run 命令将在此路径执行。当WorkDir为COS路径时必填；当WorkDir为缓存卷路径时选填，不填默认使用WorkDir作为LaunchDir。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LaunchDir")
    @Expose
    private String LaunchDir;

    /**
     * Get Config。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Config Config。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConfig() {
        return this.Config;
    }

    /**
     * Set Config。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Config Config。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfig(String Config) {
        this.Config = Config;
    }

    /**
     * Get Profile。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Profile Profile。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProfile() {
        return this.Profile;
    }

    /**
     * Set Profile。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Profile Profile。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProfile(String Profile) {
        this.Profile = Profile;
    }

    /**
     * Get Report。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Report Report。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getReport() {
        return this.Report;
    }

    /**
     * Set Report。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Report Report。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReport(Boolean Report) {
        this.Report = Report;
    }

    /**
     * Get Resume。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Resume Resume。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getResume() {
        return this.Resume;
    }

    /**
     * Set Resume。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Resume Resume。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResume(Boolean Resume) {
        this.Resume = Resume;
    }

    /**
     * Get Nextflow引擎版本，取值范围：
- 22.10.7
- 23.10.1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NFVersion Nextflow引擎版本，取值范围：
- 22.10.7
- 23.10.1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNFVersion() {
        return this.NFVersion;
    }

    /**
     * Set Nextflow引擎版本，取值范围：
- 22.10.7
- 23.10.1
注意：此字段可能返回 null，表示取不到有效值。
     * @param NFVersion Nextflow引擎版本，取值范围：
- 22.10.7
- 23.10.1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNFVersion(String NFVersion) {
        this.NFVersion = NFVersion;
    }

    /**
     * Get 启动路径。可填写指定缓存卷内的绝对路径，nextflow run 命令将在此路径执行。当WorkDir为COS路径时必填；当WorkDir为缓存卷路径时选填，不填默认使用WorkDir作为LaunchDir。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LaunchDir 启动路径。可填写指定缓存卷内的绝对路径，nextflow run 命令将在此路径执行。当WorkDir为COS路径时必填；当WorkDir为缓存卷路径时选填，不填默认使用WorkDir作为LaunchDir。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLaunchDir() {
        return this.LaunchDir;
    }

    /**
     * Set 启动路径。可填写指定缓存卷内的绝对路径，nextflow run 命令将在此路径执行。当WorkDir为COS路径时必填；当WorkDir为缓存卷路径时选填，不填默认使用WorkDir作为LaunchDir。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LaunchDir 启动路径。可填写指定缓存卷内的绝对路径，nextflow run 命令将在此路径执行。当WorkDir为COS路径时必填；当WorkDir为缓存卷路径时选填，不填默认使用WorkDir作为LaunchDir。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLaunchDir(String LaunchDir) {
        this.LaunchDir = LaunchDir;
    }

    public NFOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NFOption(NFOption source) {
        if (source.Config != null) {
            this.Config = new String(source.Config);
        }
        if (source.Profile != null) {
            this.Profile = new String(source.Profile);
        }
        if (source.Report != null) {
            this.Report = new Boolean(source.Report);
        }
        if (source.Resume != null) {
            this.Resume = new Boolean(source.Resume);
        }
        if (source.NFVersion != null) {
            this.NFVersion = new String(source.NFVersion);
        }
        if (source.LaunchDir != null) {
            this.LaunchDir = new String(source.LaunchDir);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Config", this.Config);
        this.setParamSimple(map, prefix + "Profile", this.Profile);
        this.setParamSimple(map, prefix + "Report", this.Report);
        this.setParamSimple(map, prefix + "Resume", this.Resume);
        this.setParamSimple(map, prefix + "NFVersion", this.NFVersion);
        this.setParamSimple(map, prefix + "LaunchDir", this.LaunchDir);

    }
}

