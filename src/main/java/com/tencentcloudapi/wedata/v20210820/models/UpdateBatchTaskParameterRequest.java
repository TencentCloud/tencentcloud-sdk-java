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

public class UpdateBatchTaskParameterRequest extends AbstractModel {

    /**
    * 1
    */
    @SerializedName("TaskIds")
    @Expose
    private String [] TaskIds;

    /**
    * DLC任务参数
    */
    @SerializedName("DlcParameterInfo")
    @Expose
    private UpdateBatchTaskParameterDTO DlcParameterInfo;

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * TCHouse-X任务参数
    */
    @SerializedName("TCHouseXTaskParameter")
    @Expose
    private TCHouseXTaskParameter TCHouseXTaskParameter;

    /**
    * SparkSQL或者PySpark任务参数
    */
    @SerializedName("SparkParameterInfo")
    @Expose
    private SparkParameterDTO SparkParameterInfo;

    /**
     * Get 1 
     * @return TaskIds 1
     */
    public String [] getTaskIds() {
        return this.TaskIds;
    }

    /**
     * Set 1
     * @param TaskIds 1
     */
    public void setTaskIds(String [] TaskIds) {
        this.TaskIds = TaskIds;
    }

    /**
     * Get DLC任务参数 
     * @return DlcParameterInfo DLC任务参数
     */
    public UpdateBatchTaskParameterDTO getDlcParameterInfo() {
        return this.DlcParameterInfo;
    }

    /**
     * Set DLC任务参数
     * @param DlcParameterInfo DLC任务参数
     */
    public void setDlcParameterInfo(UpdateBatchTaskParameterDTO DlcParameterInfo) {
        this.DlcParameterInfo = DlcParameterInfo;
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
     * Get TCHouse-X任务参数 
     * @return TCHouseXTaskParameter TCHouse-X任务参数
     */
    public TCHouseXTaskParameter getTCHouseXTaskParameter() {
        return this.TCHouseXTaskParameter;
    }

    /**
     * Set TCHouse-X任务参数
     * @param TCHouseXTaskParameter TCHouse-X任务参数
     */
    public void setTCHouseXTaskParameter(TCHouseXTaskParameter TCHouseXTaskParameter) {
        this.TCHouseXTaskParameter = TCHouseXTaskParameter;
    }

    /**
     * Get SparkSQL或者PySpark任务参数 
     * @return SparkParameterInfo SparkSQL或者PySpark任务参数
     */
    public SparkParameterDTO getSparkParameterInfo() {
        return this.SparkParameterInfo;
    }

    /**
     * Set SparkSQL或者PySpark任务参数
     * @param SparkParameterInfo SparkSQL或者PySpark任务参数
     */
    public void setSparkParameterInfo(SparkParameterDTO SparkParameterInfo) {
        this.SparkParameterInfo = SparkParameterInfo;
    }

    public UpdateBatchTaskParameterRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateBatchTaskParameterRequest(UpdateBatchTaskParameterRequest source) {
        if (source.TaskIds != null) {
            this.TaskIds = new String[source.TaskIds.length];
            for (int i = 0; i < source.TaskIds.length; i++) {
                this.TaskIds[i] = new String(source.TaskIds[i]);
            }
        }
        if (source.DlcParameterInfo != null) {
            this.DlcParameterInfo = new UpdateBatchTaskParameterDTO(source.DlcParameterInfo);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.TCHouseXTaskParameter != null) {
            this.TCHouseXTaskParameter = new TCHouseXTaskParameter(source.TCHouseXTaskParameter);
        }
        if (source.SparkParameterInfo != null) {
            this.SparkParameterInfo = new SparkParameterDTO(source.SparkParameterInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "TaskIds.", this.TaskIds);
        this.setParamObj(map, prefix + "DlcParameterInfo.", this.DlcParameterInfo);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamObj(map, prefix + "TCHouseXTaskParameter.", this.TCHouseXTaskParameter);
        this.setParamObj(map, prefix + "SparkParameterInfo.", this.SparkParameterInfo);

    }
}

