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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteSymbolArtifactRequest extends AbstractModel {

    /**
    * <p>制品类型。取值：js_sourcemap、ios_dsym、macos_dsym、windows_pdb、android_mapping、android_native、system_symbol。</p>
    */
    @SerializedName("Kind")
    @Expose
    private String Kind;

    /**
    * <p>制品 ID。</p>
    */
    @SerializedName("ArtifactId")
    @Expose
    private String ArtifactId;

    /**
    * <p>应用 ID。删除应用级制品时必填，须与制品所属应用一致。</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>兼容别名，未传 AppId 时使用。</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * <p>兼容字段，请勿传入。</p>
    */
    @SerializedName("AppVersion")
    @Expose
    private String AppVersion;

    /**
    * <p>兼容字段，请勿传入。</p>
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * <p>系统名称。system_symbol 场景可用于归属校验。</p>
    */
    @SerializedName("OS")
    @Expose
    private String OS;

    /**
    * <p>系统版本。system_symbol 场景可用于归属校验。</p>
    */
    @SerializedName("OSVersion")
    @Expose
    private String OSVersion;

    /**
     * Get <p>制品类型。取值：js_sourcemap、ios_dsym、macos_dsym、windows_pdb、android_mapping、android_native、system_symbol。</p> 
     * @return Kind <p>制品类型。取值：js_sourcemap、ios_dsym、macos_dsym、windows_pdb、android_mapping、android_native、system_symbol。</p>
     */
    public String getKind() {
        return this.Kind;
    }

    /**
     * Set <p>制品类型。取值：js_sourcemap、ios_dsym、macos_dsym、windows_pdb、android_mapping、android_native、system_symbol。</p>
     * @param Kind <p>制品类型。取值：js_sourcemap、ios_dsym、macos_dsym、windows_pdb、android_mapping、android_native、system_symbol。</p>
     */
    public void setKind(String Kind) {
        this.Kind = Kind;
    }

    /**
     * Get <p>制品 ID。</p> 
     * @return ArtifactId <p>制品 ID。</p>
     */
    public String getArtifactId() {
        return this.ArtifactId;
    }

    /**
     * Set <p>制品 ID。</p>
     * @param ArtifactId <p>制品 ID。</p>
     */
    public void setArtifactId(String ArtifactId) {
        this.ArtifactId = ArtifactId;
    }

    /**
     * Get <p>应用 ID。删除应用级制品时必填，须与制品所属应用一致。</p> 
     * @return AppId <p>应用 ID。删除应用级制品时必填，须与制品所属应用一致。</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>应用 ID。删除应用级制品时必填，须与制品所属应用一致。</p>
     * @param AppId <p>应用 ID。删除应用级制品时必填，须与制品所属应用一致。</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>兼容别名，未传 AppId 时使用。</p> 
     * @return ProjectId <p>兼容别名，未传 AppId 时使用。</p>
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>兼容别名，未传 AppId 时使用。</p>
     * @param ProjectId <p>兼容别名，未传 AppId 时使用。</p>
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>兼容字段，请勿传入。</p> 
     * @return AppVersion <p>兼容字段，请勿传入。</p>
     */
    public String getAppVersion() {
        return this.AppVersion;
    }

    /**
     * Set <p>兼容字段，请勿传入。</p>
     * @param AppVersion <p>兼容字段，请勿传入。</p>
     */
    public void setAppVersion(String AppVersion) {
        this.AppVersion = AppVersion;
    }

    /**
     * Get <p>兼容字段，请勿传入。</p> 
     * @return Platform <p>兼容字段，请勿传入。</p>
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set <p>兼容字段，请勿传入。</p>
     * @param Platform <p>兼容字段，请勿传入。</p>
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get <p>系统名称。system_symbol 场景可用于归属校验。</p> 
     * @return OS <p>系统名称。system_symbol 场景可用于归属校验。</p>
     */
    public String getOS() {
        return this.OS;
    }

    /**
     * Set <p>系统名称。system_symbol 场景可用于归属校验。</p>
     * @param OS <p>系统名称。system_symbol 场景可用于归属校验。</p>
     */
    public void setOS(String OS) {
        this.OS = OS;
    }

    /**
     * Get <p>系统版本。system_symbol 场景可用于归属校验。</p> 
     * @return OSVersion <p>系统版本。system_symbol 场景可用于归属校验。</p>
     */
    public String getOSVersion() {
        return this.OSVersion;
    }

    /**
     * Set <p>系统版本。system_symbol 场景可用于归属校验。</p>
     * @param OSVersion <p>系统版本。system_symbol 场景可用于归属校验。</p>
     */
    public void setOSVersion(String OSVersion) {
        this.OSVersion = OSVersion;
    }

    public DeleteSymbolArtifactRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteSymbolArtifactRequest(DeleteSymbolArtifactRequest source) {
        if (source.Kind != null) {
            this.Kind = new String(source.Kind);
        }
        if (source.ArtifactId != null) {
            this.ArtifactId = new String(source.ArtifactId);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.AppVersion != null) {
            this.AppVersion = new String(source.AppVersion);
        }
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
        if (source.OS != null) {
            this.OS = new String(source.OS);
        }
        if (source.OSVersion != null) {
            this.OSVersion = new String(source.OSVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamSimple(map, prefix + "ArtifactId", this.ArtifactId);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "AppVersion", this.AppVersion);
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "OS", this.OS);
        this.setParamSimple(map, prefix + "OSVersion", this.OSVersion);

    }
}

