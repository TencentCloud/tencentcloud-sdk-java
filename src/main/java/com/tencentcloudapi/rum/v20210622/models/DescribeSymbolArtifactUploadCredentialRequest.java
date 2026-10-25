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

public class DescribeSymbolArtifactUploadCredentialRequest extends AbstractModel {

    /**
    * <p>制品类型。取值：js_sourcemap、ios_dsym、macos_dsym、windows_pdb、android_mapping、android_native、system_symbol。</p>
    */
    @SerializedName("Kind")
    @Expose
    private String Kind;

    /**
    * <p>上传文件名。</p>
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * <p>应用 ID。应用级制品必填；system_symbol 不传。</p>
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
    * <p>保留字段，请勿传入。</p>
    */
    @SerializedName("Release")
    @Expose
    private String Release;

    /**
    * <p>保留字段，请勿传入。</p>
    */
    @SerializedName("Dist")
    @Expose
    private String Dist;

    /**
    * <p>保留字段，请勿传入。</p>
    */
    @SerializedName("MinifiedUrl")
    @Expose
    private String MinifiedUrl;

    /**
    * <p>保留字段，请勿传入。</p>
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * <p>保留字段，请勿传入。</p>
    */
    @SerializedName("DebugId")
    @Expose
    private String DebugId;

    /**
    * <p>保留字段，请勿传入。</p>
    */
    @SerializedName("BuildId")
    @Expose
    private String BuildId;

    /**
    * <p>保留字段，请勿传入。</p>
    */
    @SerializedName("AppVersion")
    @Expose
    private String AppVersion;

    /**
    * <p>保留字段，请勿传入。</p>
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * <p>系统名称。</p>
    */
    @SerializedName("OS")
    @Expose
    private String OS;

    /**
    * <p>系统版本。</p>
    */
    @SerializedName("OSVersion")
    @Expose
    private String OSVersion;

    /**
    * <p>保留字段，请勿传入。</p>
    */
    @SerializedName("StorePath")
    @Expose
    private String StorePath;

    /**
    * <p>文件内容类型，如 application/json。</p>
    */
    @SerializedName("ContentType")
    @Expose
    private String ContentType;

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
     * Get <p>上传文件名。</p> 
     * @return FileName <p>上传文件名。</p>
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set <p>上传文件名。</p>
     * @param FileName <p>上传文件名。</p>
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get <p>应用 ID。应用级制品必填；system_symbol 不传。</p> 
     * @return AppId <p>应用 ID。应用级制品必填；system_symbol 不传。</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>应用 ID。应用级制品必填；system_symbol 不传。</p>
     * @param AppId <p>应用 ID。应用级制品必填；system_symbol 不传。</p>
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
     * Get <p>保留字段，请勿传入。</p> 
     * @return Release <p>保留字段，请勿传入。</p>
     */
    public String getRelease() {
        return this.Release;
    }

    /**
     * Set <p>保留字段，请勿传入。</p>
     * @param Release <p>保留字段，请勿传入。</p>
     */
    public void setRelease(String Release) {
        this.Release = Release;
    }

    /**
     * Get <p>保留字段，请勿传入。</p> 
     * @return Dist <p>保留字段，请勿传入。</p>
     */
    public String getDist() {
        return this.Dist;
    }

    /**
     * Set <p>保留字段，请勿传入。</p>
     * @param Dist <p>保留字段，请勿传入。</p>
     */
    public void setDist(String Dist) {
        this.Dist = Dist;
    }

    /**
     * Get <p>保留字段，请勿传入。</p> 
     * @return MinifiedUrl <p>保留字段，请勿传入。</p>
     */
    public String getMinifiedUrl() {
        return this.MinifiedUrl;
    }

    /**
     * Set <p>保留字段，请勿传入。</p>
     * @param MinifiedUrl <p>保留字段，请勿传入。</p>
     */
    public void setMinifiedUrl(String MinifiedUrl) {
        this.MinifiedUrl = MinifiedUrl;
    }

    /**
     * Get <p>保留字段，请勿传入。</p> 
     * @return FileType <p>保留字段，请勿传入。</p>
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set <p>保留字段，请勿传入。</p>
     * @param FileType <p>保留字段，请勿传入。</p>
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get <p>保留字段，请勿传入。</p> 
     * @return DebugId <p>保留字段，请勿传入。</p>
     */
    public String getDebugId() {
        return this.DebugId;
    }

    /**
     * Set <p>保留字段，请勿传入。</p>
     * @param DebugId <p>保留字段，请勿传入。</p>
     */
    public void setDebugId(String DebugId) {
        this.DebugId = DebugId;
    }

    /**
     * Get <p>保留字段，请勿传入。</p> 
     * @return BuildId <p>保留字段，请勿传入。</p>
     */
    public String getBuildId() {
        return this.BuildId;
    }

    /**
     * Set <p>保留字段，请勿传入。</p>
     * @param BuildId <p>保留字段，请勿传入。</p>
     */
    public void setBuildId(String BuildId) {
        this.BuildId = BuildId;
    }

    /**
     * Get <p>保留字段，请勿传入。</p> 
     * @return AppVersion <p>保留字段，请勿传入。</p>
     */
    public String getAppVersion() {
        return this.AppVersion;
    }

    /**
     * Set <p>保留字段，请勿传入。</p>
     * @param AppVersion <p>保留字段，请勿传入。</p>
     */
    public void setAppVersion(String AppVersion) {
        this.AppVersion = AppVersion;
    }

    /**
     * Get <p>保留字段，请勿传入。</p> 
     * @return Platform <p>保留字段，请勿传入。</p>
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set <p>保留字段，请勿传入。</p>
     * @param Platform <p>保留字段，请勿传入。</p>
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get <p>系统名称。</p> 
     * @return OS <p>系统名称。</p>
     */
    public String getOS() {
        return this.OS;
    }

    /**
     * Set <p>系统名称。</p>
     * @param OS <p>系统名称。</p>
     */
    public void setOS(String OS) {
        this.OS = OS;
    }

    /**
     * Get <p>系统版本。</p> 
     * @return OSVersion <p>系统版本。</p>
     */
    public String getOSVersion() {
        return this.OSVersion;
    }

    /**
     * Set <p>系统版本。</p>
     * @param OSVersion <p>系统版本。</p>
     */
    public void setOSVersion(String OSVersion) {
        this.OSVersion = OSVersion;
    }

    /**
     * Get <p>保留字段，请勿传入。</p> 
     * @return StorePath <p>保留字段，请勿传入。</p>
     */
    public String getStorePath() {
        return this.StorePath;
    }

    /**
     * Set <p>保留字段，请勿传入。</p>
     * @param StorePath <p>保留字段，请勿传入。</p>
     */
    public void setStorePath(String StorePath) {
        this.StorePath = StorePath;
    }

    /**
     * Get <p>文件内容类型，如 application/json。</p> 
     * @return ContentType <p>文件内容类型，如 application/json。</p>
     */
    public String getContentType() {
        return this.ContentType;
    }

    /**
     * Set <p>文件内容类型，如 application/json。</p>
     * @param ContentType <p>文件内容类型，如 application/json。</p>
     */
    public void setContentType(String ContentType) {
        this.ContentType = ContentType;
    }

    public DescribeSymbolArtifactUploadCredentialRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSymbolArtifactUploadCredentialRequest(DescribeSymbolArtifactUploadCredentialRequest source) {
        if (source.Kind != null) {
            this.Kind = new String(source.Kind);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Release != null) {
            this.Release = new String(source.Release);
        }
        if (source.Dist != null) {
            this.Dist = new String(source.Dist);
        }
        if (source.MinifiedUrl != null) {
            this.MinifiedUrl = new String(source.MinifiedUrl);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.DebugId != null) {
            this.DebugId = new String(source.DebugId);
        }
        if (source.BuildId != null) {
            this.BuildId = new String(source.BuildId);
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
        if (source.StorePath != null) {
            this.StorePath = new String(source.StorePath);
        }
        if (source.ContentType != null) {
            this.ContentType = new String(source.ContentType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Release", this.Release);
        this.setParamSimple(map, prefix + "Dist", this.Dist);
        this.setParamSimple(map, prefix + "MinifiedUrl", this.MinifiedUrl);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "DebugId", this.DebugId);
        this.setParamSimple(map, prefix + "BuildId", this.BuildId);
        this.setParamSimple(map, prefix + "AppVersion", this.AppVersion);
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "OS", this.OS);
        this.setParamSimple(map, prefix + "OSVersion", this.OSVersion);
        this.setParamSimple(map, prefix + "StorePath", this.StorePath);
        this.setParamSimple(map, prefix + "ContentType", this.ContentType);

    }
}

