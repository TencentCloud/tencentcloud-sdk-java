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
package com.tencentcloudapi.omics.v20221128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RunApplicationRequest extends AbstractModel {

    /**
    * 应用ID。
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 任务批次名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 投递环境ID。
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * 项目ID。（不填使用指定地域下的默认项目）
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 任务批次描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 任务输入COS地址。（InputBase64和InputCosUri必选其一）
    */
    @SerializedName("InputCosUri")
    @Expose
    private String InputCosUri;

    /**
    * 任务输入JSON。需要进行base64编码。（InputBase64和InputCosUri必选其一）
    */
    @SerializedName("InputBase64")
    @Expose
    private String InputBase64;

    /**
    * 批量投递表格ID，不填表示单例投递。
    */
    @SerializedName("TableId")
    @Expose
    private String TableId;

    /**
    * 批量投递表格行UUID。不填表示表格全部行。
    */
    @SerializedName("TableRowUuids")
    @Expose
    private String [] TableRowUuids;

    /**
    * 任务缓存清理时间（小时）。不填或0表示不清理。
    */
    @SerializedName("CacheClearDelay")
    @Expose
    private Long CacheClearDelay;

    /**
    * 应用版本ID。不填表示使用当前最新版本。
    */
    @SerializedName("ApplicationVersionId")
    @Expose
    private String ApplicationVersionId;

    /**
    * WDL运行选项。
    */
    @SerializedName("Option")
    @Expose
    private RunOption Option;

    /**
    * Nextflow运行选项。
    */
    @SerializedName("NFOption")
    @Expose
    private NFOption NFOption;

    /**
    * 工作目录，当前仅支持Nextflow。可填写指定缓存卷内的绝对路径或者COS路径，不填使用默认缓存卷内的默认路径。如果使用COS路径，NFOption中LaunchDir需填写指定缓存卷内的绝对路径作为启动路径。
    */
    @SerializedName("WorkDir")
    @Expose
    private String WorkDir;

    /**
    * 访问模式，不填默认私有。取值范围
- PRIVATE：私有应用
- PUBLIC：公共应用
    */
    @SerializedName("AccessMode")
    @Expose
    private String AccessMode;

    /**
    * 缓存卷ID，不填使用默认缓存卷，暂时仅支持Nextflow。
    */
    @SerializedName("VolumeIds")
    @Expose
    private String [] VolumeIds;

    /**
    * 是否开启结果通知。
    */
    @SerializedName("ResultNotification")
    @Expose
    private Boolean ResultNotification;

    /**
    * 是否开启超时通知。
    */
    @SerializedName("TimeoutNotification")
    @Expose
    private Boolean TimeoutNotification;

    /**
    * 任务超时通知时间（单位：分钟），支持5到2880分钟。
    */
    @SerializedName("TimeoutNotificationMinutes")
    @Expose
    private Long TimeoutNotificationMinutes;

    /**
    * 接受通知邮件地址列表。
    */
    @SerializedName("EmailForNotification")
    @Expose
    private String [] EmailForNotification;

    /**
     * Get 应用ID。 
     * @return ApplicationId 应用ID。
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 应用ID。
     * @param ApplicationId 应用ID。
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 任务批次名称。 
     * @return Name 任务批次名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 任务批次名称。
     * @param Name 任务批次名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 投递环境ID。 
     * @return EnvironmentId 投递环境ID。
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set 投递环境ID。
     * @param EnvironmentId 投递环境ID。
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get 项目ID。（不填使用指定地域下的默认项目） 
     * @return ProjectId 项目ID。（不填使用指定地域下的默认项目）
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID。（不填使用指定地域下的默认项目）
     * @param ProjectId 项目ID。（不填使用指定地域下的默认项目）
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 任务批次描述。 
     * @return Description 任务批次描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 任务批次描述。
     * @param Description 任务批次描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 任务输入COS地址。（InputBase64和InputCosUri必选其一） 
     * @return InputCosUri 任务输入COS地址。（InputBase64和InputCosUri必选其一）
     */
    public String getInputCosUri() {
        return this.InputCosUri;
    }

    /**
     * Set 任务输入COS地址。（InputBase64和InputCosUri必选其一）
     * @param InputCosUri 任务输入COS地址。（InputBase64和InputCosUri必选其一）
     */
    public void setInputCosUri(String InputCosUri) {
        this.InputCosUri = InputCosUri;
    }

    /**
     * Get 任务输入JSON。需要进行base64编码。（InputBase64和InputCosUri必选其一） 
     * @return InputBase64 任务输入JSON。需要进行base64编码。（InputBase64和InputCosUri必选其一）
     */
    public String getInputBase64() {
        return this.InputBase64;
    }

    /**
     * Set 任务输入JSON。需要进行base64编码。（InputBase64和InputCosUri必选其一）
     * @param InputBase64 任务输入JSON。需要进行base64编码。（InputBase64和InputCosUri必选其一）
     */
    public void setInputBase64(String InputBase64) {
        this.InputBase64 = InputBase64;
    }

    /**
     * Get 批量投递表格ID，不填表示单例投递。 
     * @return TableId 批量投递表格ID，不填表示单例投递。
     */
    public String getTableId() {
        return this.TableId;
    }

    /**
     * Set 批量投递表格ID，不填表示单例投递。
     * @param TableId 批量投递表格ID，不填表示单例投递。
     */
    public void setTableId(String TableId) {
        this.TableId = TableId;
    }

    /**
     * Get 批量投递表格行UUID。不填表示表格全部行。 
     * @return TableRowUuids 批量投递表格行UUID。不填表示表格全部行。
     */
    public String [] getTableRowUuids() {
        return this.TableRowUuids;
    }

    /**
     * Set 批量投递表格行UUID。不填表示表格全部行。
     * @param TableRowUuids 批量投递表格行UUID。不填表示表格全部行。
     */
    public void setTableRowUuids(String [] TableRowUuids) {
        this.TableRowUuids = TableRowUuids;
    }

    /**
     * Get 任务缓存清理时间（小时）。不填或0表示不清理。 
     * @return CacheClearDelay 任务缓存清理时间（小时）。不填或0表示不清理。
     */
    public Long getCacheClearDelay() {
        return this.CacheClearDelay;
    }

    /**
     * Set 任务缓存清理时间（小时）。不填或0表示不清理。
     * @param CacheClearDelay 任务缓存清理时间（小时）。不填或0表示不清理。
     */
    public void setCacheClearDelay(Long CacheClearDelay) {
        this.CacheClearDelay = CacheClearDelay;
    }

    /**
     * Get 应用版本ID。不填表示使用当前最新版本。 
     * @return ApplicationVersionId 应用版本ID。不填表示使用当前最新版本。
     */
    public String getApplicationVersionId() {
        return this.ApplicationVersionId;
    }

    /**
     * Set 应用版本ID。不填表示使用当前最新版本。
     * @param ApplicationVersionId 应用版本ID。不填表示使用当前最新版本。
     */
    public void setApplicationVersionId(String ApplicationVersionId) {
        this.ApplicationVersionId = ApplicationVersionId;
    }

    /**
     * Get WDL运行选项。 
     * @return Option WDL运行选项。
     */
    public RunOption getOption() {
        return this.Option;
    }

    /**
     * Set WDL运行选项。
     * @param Option WDL运行选项。
     */
    public void setOption(RunOption Option) {
        this.Option = Option;
    }

    /**
     * Get Nextflow运行选项。 
     * @return NFOption Nextflow运行选项。
     */
    public NFOption getNFOption() {
        return this.NFOption;
    }

    /**
     * Set Nextflow运行选项。
     * @param NFOption Nextflow运行选项。
     */
    public void setNFOption(NFOption NFOption) {
        this.NFOption = NFOption;
    }

    /**
     * Get 工作目录，当前仅支持Nextflow。可填写指定缓存卷内的绝对路径或者COS路径，不填使用默认缓存卷内的默认路径。如果使用COS路径，NFOption中LaunchDir需填写指定缓存卷内的绝对路径作为启动路径。 
     * @return WorkDir 工作目录，当前仅支持Nextflow。可填写指定缓存卷内的绝对路径或者COS路径，不填使用默认缓存卷内的默认路径。如果使用COS路径，NFOption中LaunchDir需填写指定缓存卷内的绝对路径作为启动路径。
     */
    public String getWorkDir() {
        return this.WorkDir;
    }

    /**
     * Set 工作目录，当前仅支持Nextflow。可填写指定缓存卷内的绝对路径或者COS路径，不填使用默认缓存卷内的默认路径。如果使用COS路径，NFOption中LaunchDir需填写指定缓存卷内的绝对路径作为启动路径。
     * @param WorkDir 工作目录，当前仅支持Nextflow。可填写指定缓存卷内的绝对路径或者COS路径，不填使用默认缓存卷内的默认路径。如果使用COS路径，NFOption中LaunchDir需填写指定缓存卷内的绝对路径作为启动路径。
     */
    public void setWorkDir(String WorkDir) {
        this.WorkDir = WorkDir;
    }

    /**
     * Get 访问模式，不填默认私有。取值范围
- PRIVATE：私有应用
- PUBLIC：公共应用 
     * @return AccessMode 访问模式，不填默认私有。取值范围
- PRIVATE：私有应用
- PUBLIC：公共应用
     */
    public String getAccessMode() {
        return this.AccessMode;
    }

    /**
     * Set 访问模式，不填默认私有。取值范围
- PRIVATE：私有应用
- PUBLIC：公共应用
     * @param AccessMode 访问模式，不填默认私有。取值范围
- PRIVATE：私有应用
- PUBLIC：公共应用
     */
    public void setAccessMode(String AccessMode) {
        this.AccessMode = AccessMode;
    }

    /**
     * Get 缓存卷ID，不填使用默认缓存卷，暂时仅支持Nextflow。 
     * @return VolumeIds 缓存卷ID，不填使用默认缓存卷，暂时仅支持Nextflow。
     */
    public String [] getVolumeIds() {
        return this.VolumeIds;
    }

    /**
     * Set 缓存卷ID，不填使用默认缓存卷，暂时仅支持Nextflow。
     * @param VolumeIds 缓存卷ID，不填使用默认缓存卷，暂时仅支持Nextflow。
     */
    public void setVolumeIds(String [] VolumeIds) {
        this.VolumeIds = VolumeIds;
    }

    /**
     * Get 是否开启结果通知。 
     * @return ResultNotification 是否开启结果通知。
     */
    public Boolean getResultNotification() {
        return this.ResultNotification;
    }

    /**
     * Set 是否开启结果通知。
     * @param ResultNotification 是否开启结果通知。
     */
    public void setResultNotification(Boolean ResultNotification) {
        this.ResultNotification = ResultNotification;
    }

    /**
     * Get 是否开启超时通知。 
     * @return TimeoutNotification 是否开启超时通知。
     */
    public Boolean getTimeoutNotification() {
        return this.TimeoutNotification;
    }

    /**
     * Set 是否开启超时通知。
     * @param TimeoutNotification 是否开启超时通知。
     */
    public void setTimeoutNotification(Boolean TimeoutNotification) {
        this.TimeoutNotification = TimeoutNotification;
    }

    /**
     * Get 任务超时通知时间（单位：分钟），支持5到2880分钟。 
     * @return TimeoutNotificationMinutes 任务超时通知时间（单位：分钟），支持5到2880分钟。
     */
    public Long getTimeoutNotificationMinutes() {
        return this.TimeoutNotificationMinutes;
    }

    /**
     * Set 任务超时通知时间（单位：分钟），支持5到2880分钟。
     * @param TimeoutNotificationMinutes 任务超时通知时间（单位：分钟），支持5到2880分钟。
     */
    public void setTimeoutNotificationMinutes(Long TimeoutNotificationMinutes) {
        this.TimeoutNotificationMinutes = TimeoutNotificationMinutes;
    }

    /**
     * Get 接受通知邮件地址列表。 
     * @return EmailForNotification 接受通知邮件地址列表。
     */
    public String [] getEmailForNotification() {
        return this.EmailForNotification;
    }

    /**
     * Set 接受通知邮件地址列表。
     * @param EmailForNotification 接受通知邮件地址列表。
     */
    public void setEmailForNotification(String [] EmailForNotification) {
        this.EmailForNotification = EmailForNotification;
    }

    public RunApplicationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RunApplicationRequest(RunApplicationRequest source) {
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.InputCosUri != null) {
            this.InputCosUri = new String(source.InputCosUri);
        }
        if (source.InputBase64 != null) {
            this.InputBase64 = new String(source.InputBase64);
        }
        if (source.TableId != null) {
            this.TableId = new String(source.TableId);
        }
        if (source.TableRowUuids != null) {
            this.TableRowUuids = new String[source.TableRowUuids.length];
            for (int i = 0; i < source.TableRowUuids.length; i++) {
                this.TableRowUuids[i] = new String(source.TableRowUuids[i]);
            }
        }
        if (source.CacheClearDelay != null) {
            this.CacheClearDelay = new Long(source.CacheClearDelay);
        }
        if (source.ApplicationVersionId != null) {
            this.ApplicationVersionId = new String(source.ApplicationVersionId);
        }
        if (source.Option != null) {
            this.Option = new RunOption(source.Option);
        }
        if (source.NFOption != null) {
            this.NFOption = new NFOption(source.NFOption);
        }
        if (source.WorkDir != null) {
            this.WorkDir = new String(source.WorkDir);
        }
        if (source.AccessMode != null) {
            this.AccessMode = new String(source.AccessMode);
        }
        if (source.VolumeIds != null) {
            this.VolumeIds = new String[source.VolumeIds.length];
            for (int i = 0; i < source.VolumeIds.length; i++) {
                this.VolumeIds[i] = new String(source.VolumeIds[i]);
            }
        }
        if (source.ResultNotification != null) {
            this.ResultNotification = new Boolean(source.ResultNotification);
        }
        if (source.TimeoutNotification != null) {
            this.TimeoutNotification = new Boolean(source.TimeoutNotification);
        }
        if (source.TimeoutNotificationMinutes != null) {
            this.TimeoutNotificationMinutes = new Long(source.TimeoutNotificationMinutes);
        }
        if (source.EmailForNotification != null) {
            this.EmailForNotification = new String[source.EmailForNotification.length];
            for (int i = 0; i < source.EmailForNotification.length; i++) {
                this.EmailForNotification[i] = new String(source.EmailForNotification[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "InputCosUri", this.InputCosUri);
        this.setParamSimple(map, prefix + "InputBase64", this.InputBase64);
        this.setParamSimple(map, prefix + "TableId", this.TableId);
        this.setParamArraySimple(map, prefix + "TableRowUuids.", this.TableRowUuids);
        this.setParamSimple(map, prefix + "CacheClearDelay", this.CacheClearDelay);
        this.setParamSimple(map, prefix + "ApplicationVersionId", this.ApplicationVersionId);
        this.setParamObj(map, prefix + "Option.", this.Option);
        this.setParamObj(map, prefix + "NFOption.", this.NFOption);
        this.setParamSimple(map, prefix + "WorkDir", this.WorkDir);
        this.setParamSimple(map, prefix + "AccessMode", this.AccessMode);
        this.setParamArraySimple(map, prefix + "VolumeIds.", this.VolumeIds);
        this.setParamSimple(map, prefix + "ResultNotification", this.ResultNotification);
        this.setParamSimple(map, prefix + "TimeoutNotification", this.TimeoutNotification);
        this.setParamSimple(map, prefix + "TimeoutNotificationMinutes", this.TimeoutNotificationMinutes);
        this.setParamArraySimple(map, prefix + "EmailForNotification.", this.EmailForNotification);

    }
}

