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

public class DescribeSymbolArtifactsRequest extends AbstractModel {

    /**
    * <p>制品类型。取值：js_sourcemap、ios_dsym、macos_dsym、windows_pdb、android_mapping、android_native、system_symbol。native_symbol 仅查询历史数据。</p>
    */
    @SerializedName("Kind")
    @Expose
    private String Kind;

    /**
    * <p>应用 ID。js_sourcemap 必填，其他应用级制品用于过滤。</p>
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
    * <p>JS 应用版本过滤条件。</p>
    */
    @SerializedName("Release")
    @Expose
    private String Release;

    /**
    * <p>JS 制品的历史 Dist 过滤条件。</p>
    */
    @SerializedName("Dist")
    @Expose
    private String Dist;

    /**
    * <p>JS 制品文件类型过滤条件。</p>
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * <p>应用版本过滤条件。</p>
    */
    @SerializedName("AppVersion")
    @Expose
    private String AppVersion;

    /**
    * <p>历史 native_symbol 的平台过滤条件。</p>
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * <p>系统名称。system_symbol 场景过滤条件。</p>
    */
    @SerializedName("OS")
    @Expose
    private String OS;

    /**
    * <p>系统版本。system_symbol 场景过滤条件。</p>
    */
    @SerializedName("OSVersion")
    @Expose
    private String OSVersion;

    /**
    * <p>状态过滤。可按 active、superseded、deleted、invalid 过滤。</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>分页大小。默认 50。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>分页游标。</p>
    */
    @SerializedName("Cursor")
    @Expose
    private String Cursor;

    /**
     * Get <p>制品类型。取值：js_sourcemap、ios_dsym、macos_dsym、windows_pdb、android_mapping、android_native、system_symbol。native_symbol 仅查询历史数据。</p> 
     * @return Kind <p>制品类型。取值：js_sourcemap、ios_dsym、macos_dsym、windows_pdb、android_mapping、android_native、system_symbol。native_symbol 仅查询历史数据。</p>
     */
    public String getKind() {
        return this.Kind;
    }

    /**
     * Set <p>制品类型。取值：js_sourcemap、ios_dsym、macos_dsym、windows_pdb、android_mapping、android_native、system_symbol。native_symbol 仅查询历史数据。</p>
     * @param Kind <p>制品类型。取值：js_sourcemap、ios_dsym、macos_dsym、windows_pdb、android_mapping、android_native、system_symbol。native_symbol 仅查询历史数据。</p>
     */
    public void setKind(String Kind) {
        this.Kind = Kind;
    }

    /**
     * Get <p>应用 ID。js_sourcemap 必填，其他应用级制品用于过滤。</p> 
     * @return AppId <p>应用 ID。js_sourcemap 必填，其他应用级制品用于过滤。</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>应用 ID。js_sourcemap 必填，其他应用级制品用于过滤。</p>
     * @param AppId <p>应用 ID。js_sourcemap 必填，其他应用级制品用于过滤。</p>
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
     * Get <p>JS 应用版本过滤条件。</p> 
     * @return Release <p>JS 应用版本过滤条件。</p>
     */
    public String getRelease() {
        return this.Release;
    }

    /**
     * Set <p>JS 应用版本过滤条件。</p>
     * @param Release <p>JS 应用版本过滤条件。</p>
     */
    public void setRelease(String Release) {
        this.Release = Release;
    }

    /**
     * Get <p>JS 制品的历史 Dist 过滤条件。</p> 
     * @return Dist <p>JS 制品的历史 Dist 过滤条件。</p>
     */
    public String getDist() {
        return this.Dist;
    }

    /**
     * Set <p>JS 制品的历史 Dist 过滤条件。</p>
     * @param Dist <p>JS 制品的历史 Dist 过滤条件。</p>
     */
    public void setDist(String Dist) {
        this.Dist = Dist;
    }

    /**
     * Get <p>JS 制品文件类型过滤条件。</p> 
     * @return FileType <p>JS 制品文件类型过滤条件。</p>
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set <p>JS 制品文件类型过滤条件。</p>
     * @param FileType <p>JS 制品文件类型过滤条件。</p>
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get <p>应用版本过滤条件。</p> 
     * @return AppVersion <p>应用版本过滤条件。</p>
     */
    public String getAppVersion() {
        return this.AppVersion;
    }

    /**
     * Set <p>应用版本过滤条件。</p>
     * @param AppVersion <p>应用版本过滤条件。</p>
     */
    public void setAppVersion(String AppVersion) {
        this.AppVersion = AppVersion;
    }

    /**
     * Get <p>历史 native_symbol 的平台过滤条件。</p> 
     * @return Platform <p>历史 native_symbol 的平台过滤条件。</p>
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set <p>历史 native_symbol 的平台过滤条件。</p>
     * @param Platform <p>历史 native_symbol 的平台过滤条件。</p>
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get <p>系统名称。system_symbol 场景过滤条件。</p> 
     * @return OS <p>系统名称。system_symbol 场景过滤条件。</p>
     */
    public String getOS() {
        return this.OS;
    }

    /**
     * Set <p>系统名称。system_symbol 场景过滤条件。</p>
     * @param OS <p>系统名称。system_symbol 场景过滤条件。</p>
     */
    public void setOS(String OS) {
        this.OS = OS;
    }

    /**
     * Get <p>系统版本。system_symbol 场景过滤条件。</p> 
     * @return OSVersion <p>系统版本。system_symbol 场景过滤条件。</p>
     */
    public String getOSVersion() {
        return this.OSVersion;
    }

    /**
     * Set <p>系统版本。system_symbol 场景过滤条件。</p>
     * @param OSVersion <p>系统版本。system_symbol 场景过滤条件。</p>
     */
    public void setOSVersion(String OSVersion) {
        this.OSVersion = OSVersion;
    }

    /**
     * Get <p>状态过滤。可按 active、superseded、deleted、invalid 过滤。</p> 
     * @return Status <p>状态过滤。可按 active、superseded、deleted、invalid 过滤。</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态过滤。可按 active、superseded、deleted、invalid 过滤。</p>
     * @param Status <p>状态过滤。可按 active、superseded、deleted、invalid 过滤。</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>分页大小。默认 50。</p> 
     * @return Limit <p>分页大小。默认 50。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>分页大小。默认 50。</p>
     * @param Limit <p>分页大小。默认 50。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>分页游标。</p> 
     * @return Cursor <p>分页游标。</p>
     */
    public String getCursor() {
        return this.Cursor;
    }

    /**
     * Set <p>分页游标。</p>
     * @param Cursor <p>分页游标。</p>
     */
    public void setCursor(String Cursor) {
        this.Cursor = Cursor;
    }

    public DescribeSymbolArtifactsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSymbolArtifactsRequest(DescribeSymbolArtifactsRequest source) {
        if (source.Kind != null) {
            this.Kind = new String(source.Kind);
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
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
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
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Cursor != null) {
            this.Cursor = new String(source.Cursor);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Release", this.Release);
        this.setParamSimple(map, prefix + "Dist", this.Dist);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "AppVersion", this.AppVersion);
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "OS", this.OS);
        this.setParamSimple(map, prefix + "OSVersion", this.OSVersion);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Cursor", this.Cursor);

    }
}

