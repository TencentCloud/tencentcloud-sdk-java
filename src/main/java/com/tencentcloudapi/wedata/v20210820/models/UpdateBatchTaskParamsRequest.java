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

public class UpdateBatchTaskParamsRequest extends AbstractModel {

    /**
    * 待更新的任务ID
    */
    @SerializedName("TaskIds")
    @Expose
    private String [] TaskIds;

    /**
    * 调度参数键值对
    */
    @SerializedName("MapParamList")
    @Expose
    private ParamMapDsDto [] MapParamList;

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
     * Get 待更新的任务ID 
     * @return TaskIds 待更新的任务ID
     */
    public String [] getTaskIds() {
        return this.TaskIds;
    }

    /**
     * Set 待更新的任务ID
     * @param TaskIds 待更新的任务ID
     */
    public void setTaskIds(String [] TaskIds) {
        this.TaskIds = TaskIds;
    }

    /**
     * Get 调度参数键值对 
     * @return MapParamList 调度参数键值对
     */
    public ParamMapDsDto [] getMapParamList() {
        return this.MapParamList;
    }

    /**
     * Set 调度参数键值对
     * @param MapParamList 调度参数键值对
     */
    public void setMapParamList(ParamMapDsDto [] MapParamList) {
        this.MapParamList = MapParamList;
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

    public UpdateBatchTaskParamsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateBatchTaskParamsRequest(UpdateBatchTaskParamsRequest source) {
        if (source.TaskIds != null) {
            this.TaskIds = new String[source.TaskIds.length];
            for (int i = 0; i < source.TaskIds.length; i++) {
                this.TaskIds[i] = new String(source.TaskIds[i]);
            }
        }
        if (source.MapParamList != null) {
            this.MapParamList = new ParamMapDsDto[source.MapParamList.length];
            for (int i = 0; i < source.MapParamList.length; i++) {
                this.MapParamList[i] = new ParamMapDsDto(source.MapParamList[i]);
            }
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "TaskIds.", this.TaskIds);
        this.setParamArrayObj(map, prefix + "MapParamList.", this.MapParamList);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

