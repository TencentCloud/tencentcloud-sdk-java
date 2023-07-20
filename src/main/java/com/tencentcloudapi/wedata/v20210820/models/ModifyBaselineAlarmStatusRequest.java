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

public class ModifyBaselineAlarmStatusRequest extends AbstractModel{

    /**
    * 是否告警. 取值范围:
- true: 开启告警;
- false: 关闭告警
    */
    @SerializedName("IsAlarm")
    @Expose
    private String IsAlarm;

    /**
    * 基线实例id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
     * Get 是否告警. 取值范围:
- true: 开启告警;
- false: 关闭告警 
     * @return IsAlarm 是否告警. 取值范围:
- true: 开启告警;
- false: 关闭告警
     */
    public String getIsAlarm() {
        return this.IsAlarm;
    }

    /**
     * Set 是否告警. 取值范围:
- true: 开启告警;
- false: 关闭告警
     * @param IsAlarm 是否告警. 取值范围:
- true: 开启告警;
- false: 关闭告警
     */
    public void setIsAlarm(String IsAlarm) {
        this.IsAlarm = IsAlarm;
    }

    /**
     * Get 基线实例id 
     * @return Id 基线实例id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 基线实例id
     * @param Id 基线实例id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 项目id 
     * @return ProjectId 项目id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id
     * @param ProjectId 项目id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    public ModifyBaselineAlarmStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBaselineAlarmStatusRequest(ModifyBaselineAlarmStatusRequest source) {
        if (source.IsAlarm != null) {
            this.IsAlarm = new String(source.IsAlarm);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsAlarm", this.IsAlarm);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

