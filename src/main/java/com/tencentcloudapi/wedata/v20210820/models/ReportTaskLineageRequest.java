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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReportTaskLineageRequest extends AbstractModel {

    /**
    * 上报渠道
    */
    @SerializedName("ChannelType")
    @Expose
    private String ChannelType;

    /**
    * 血缘任务
    */
    @SerializedName("Task")
    @Expose
    private LineageTask Task;

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 表血缘关系
    */
    @SerializedName("TableLineages")
    @Expose
    private TableLineagePair [] TableLineages;

    /**
    * 列血缘关系
    */
    @SerializedName("ColumnLineages")
    @Expose
    private ColumnLineagePair [] ColumnLineages;

    /**
     * Get 上报渠道 
     * @return ChannelType 上报渠道
     */
    public String getChannelType() {
        return this.ChannelType;
    }

    /**
     * Set 上报渠道
     * @param ChannelType 上报渠道
     */
    public void setChannelType(String ChannelType) {
        this.ChannelType = ChannelType;
    }

    /**
     * Get 血缘任务 
     * @return Task 血缘任务
     */
    public LineageTask getTask() {
        return this.Task;
    }

    /**
     * Set 血缘任务
     * @param Task 血缘任务
     */
    public void setTask(LineageTask Task) {
        this.Task = Task;
    }

    /**
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 表血缘关系 
     * @return TableLineages 表血缘关系
     */
    public TableLineagePair [] getTableLineages() {
        return this.TableLineages;
    }

    /**
     * Set 表血缘关系
     * @param TableLineages 表血缘关系
     */
    public void setTableLineages(TableLineagePair [] TableLineages) {
        this.TableLineages = TableLineages;
    }

    /**
     * Get 列血缘关系 
     * @return ColumnLineages 列血缘关系
     */
    public ColumnLineagePair [] getColumnLineages() {
        return this.ColumnLineages;
    }

    /**
     * Set 列血缘关系
     * @param ColumnLineages 列血缘关系
     */
    public void setColumnLineages(ColumnLineagePair [] ColumnLineages) {
        this.ColumnLineages = ColumnLineages;
    }

    public ReportTaskLineageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReportTaskLineageRequest(ReportTaskLineageRequest source) {
        if (source.ChannelType != null) {
            this.ChannelType = new String(source.ChannelType);
        }
        if (source.Task != null) {
            this.Task = new LineageTask(source.Task);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.TableLineages != null) {
            this.TableLineages = new TableLineagePair[source.TableLineages.length];
            for (int i = 0; i < source.TableLineages.length; i++) {
                this.TableLineages[i] = new TableLineagePair(source.TableLineages[i]);
            }
        }
        if (source.ColumnLineages != null) {
            this.ColumnLineages = new ColumnLineagePair[source.ColumnLineages.length];
            for (int i = 0; i < source.ColumnLineages.length; i++) {
                this.ColumnLineages[i] = new ColumnLineagePair(source.ColumnLineages[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChannelType", this.ChannelType);
        this.setParamObj(map, prefix + "Task.", this.Task);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArrayObj(map, prefix + "TableLineages.", this.TableLineages);
        this.setParamArrayObj(map, prefix + "ColumnLineages.", this.ColumnLineages);

    }
}

