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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RunApplicationRequest extends AbstractModel{

    /**
    * 应用ID。
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 项目ID。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

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
    * 任务输入JSON。需要进行base64编码。
    */
    @SerializedName("InputBase64")
    @Expose
    private String InputBase64;

    /**
    * 任务缓存清理时间。不填表示不清理。
    */
    @SerializedName("CacheClearDelay")
    @Expose
    private Long CacheClearDelay;

    /**
    * 运行选项。
    */
    @SerializedName("Option")
    @Expose
    private RunOption Option;

    /**
    * 任务批次描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

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
    * 应用版本ID。不填表示使用当前最新版本。
    */
    @SerializedName("ApplicationVersionId")
    @Expose
    private String ApplicationVersionId;

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
     * Get 项目ID。 
     * @return ProjectId 项目ID。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID。
     * @param ProjectId 项目ID。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
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
     * Get 任务输入JSON。需要进行base64编码。 
     * @return InputBase64 任务输入JSON。需要进行base64编码。
     */
    public String getInputBase64() {
        return this.InputBase64;
    }

    /**
     * Set 任务输入JSON。需要进行base64编码。
     * @param InputBase64 任务输入JSON。需要进行base64编码。
     */
    public void setInputBase64(String InputBase64) {
        this.InputBase64 = InputBase64;
    }

    /**
     * Get 任务缓存清理时间。不填表示不清理。 
     * @return CacheClearDelay 任务缓存清理时间。不填表示不清理。
     */
    public Long getCacheClearDelay() {
        return this.CacheClearDelay;
    }

    /**
     * Set 任务缓存清理时间。不填表示不清理。
     * @param CacheClearDelay 任务缓存清理时间。不填表示不清理。
     */
    public void setCacheClearDelay(Long CacheClearDelay) {
        this.CacheClearDelay = CacheClearDelay;
    }

    /**
     * Get 运行选项。 
     * @return Option 运行选项。
     */
    public RunOption getOption() {
        return this.Option;
    }

    /**
     * Set 运行选项。
     * @param Option 运行选项。
     */
    public void setOption(RunOption Option) {
        this.Option = Option;
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
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.InputBase64 != null) {
            this.InputBase64 = new String(source.InputBase64);
        }
        if (source.CacheClearDelay != null) {
            this.CacheClearDelay = new Long(source.CacheClearDelay);
        }
        if (source.Option != null) {
            this.Option = new RunOption(source.Option);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
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
        if (source.ApplicationVersionId != null) {
            this.ApplicationVersionId = new String(source.ApplicationVersionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "InputBase64", this.InputBase64);
        this.setParamSimple(map, prefix + "CacheClearDelay", this.CacheClearDelay);
        this.setParamObj(map, prefix + "Option.", this.Option);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "TableId", this.TableId);
        this.setParamArraySimple(map, prefix + "TableRowUuids.", this.TableRowUuids);
        this.setParamSimple(map, prefix + "ApplicationVersionId", this.ApplicationVersionId);

    }
}

