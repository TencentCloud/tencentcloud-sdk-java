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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SetTaskAlarmNewRequest extends AbstractModel{

    /**
    * 设置任务超时告警和失败告警信息
    */
    @SerializedName("AlarmInfoList")
    @Expose
    private AlarmInfo [] AlarmInfoList;

    /**
    * 项目Id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
     * Get 设置任务超时告警和失败告警信息 
     * @return AlarmInfoList 设置任务超时告警和失败告警信息
     */
    public AlarmInfo [] getAlarmInfoList() {
        return this.AlarmInfoList;
    }

    /**
     * Set 设置任务超时告警和失败告警信息
     * @param AlarmInfoList 设置任务超时告警和失败告警信息
     */
    public void setAlarmInfoList(AlarmInfo [] AlarmInfoList) {
        this.AlarmInfoList = AlarmInfoList;
    }

    /**
     * Get 项目Id 
     * @return ProjectId 项目Id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目Id
     * @param ProjectId 项目Id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    public SetTaskAlarmNewRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetTaskAlarmNewRequest(SetTaskAlarmNewRequest source) {
        if (source.AlarmInfoList != null) {
            this.AlarmInfoList = new AlarmInfo[source.AlarmInfoList.length];
            for (int i = 0; i < source.AlarmInfoList.length; i++) {
                this.AlarmInfoList[i] = new AlarmInfo(source.AlarmInfoList[i]);
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
        this.setParamArrayObj(map, prefix + "AlarmInfoList.", this.AlarmInfoList);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

