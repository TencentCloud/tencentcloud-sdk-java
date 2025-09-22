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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetTaskInstanceLogRequest extends AbstractModel {

    /**
    * **项目ID**
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * **实例唯一标识**
    */
    @SerializedName("InstanceKey")
    @Expose
    private String InstanceKey;

    /**
    * **实例生命周期编号，标识实例的某一次执行**例如：周期实例第一次运行的编号为0，用户后期又重跑了该实例，第二次执行的编号为1; 默认最新一次
    */
    @SerializedName("LifeRoundNum")
    @Expose
    private Long LifeRoundNum;

    /**
    * **日志级别** 默认All - Info - Debug - Warn - Error - All
    */
    @SerializedName("LogLevel")
    @Expose
    private String LogLevel;

    /**
    * **分页查询日志时使用，无具体业务含义** 第一次查询时值为null 第二次及以后查询时使用上一次查询返回信息中的NextCursor字段值即可
    */
    @SerializedName("NextCursor")
    @Expose
    private String NextCursor;

    /**
     * Get **项目ID** 
     * @return ProjectId **项目ID**
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set **项目ID**
     * @param ProjectId **项目ID**
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get **实例唯一标识** 
     * @return InstanceKey **实例唯一标识**
     */
    public String getInstanceKey() {
        return this.InstanceKey;
    }

    /**
     * Set **实例唯一标识**
     * @param InstanceKey **实例唯一标识**
     */
    public void setInstanceKey(String InstanceKey) {
        this.InstanceKey = InstanceKey;
    }

    /**
     * Get **实例生命周期编号，标识实例的某一次执行**例如：周期实例第一次运行的编号为0，用户后期又重跑了该实例，第二次执行的编号为1; 默认最新一次 
     * @return LifeRoundNum **实例生命周期编号，标识实例的某一次执行**例如：周期实例第一次运行的编号为0，用户后期又重跑了该实例，第二次执行的编号为1; 默认最新一次
     */
    public Long getLifeRoundNum() {
        return this.LifeRoundNum;
    }

    /**
     * Set **实例生命周期编号，标识实例的某一次执行**例如：周期实例第一次运行的编号为0，用户后期又重跑了该实例，第二次执行的编号为1; 默认最新一次
     * @param LifeRoundNum **实例生命周期编号，标识实例的某一次执行**例如：周期实例第一次运行的编号为0，用户后期又重跑了该实例，第二次执行的编号为1; 默认最新一次
     */
    public void setLifeRoundNum(Long LifeRoundNum) {
        this.LifeRoundNum = LifeRoundNum;
    }

    /**
     * Get **日志级别** 默认All - Info - Debug - Warn - Error - All 
     * @return LogLevel **日志级别** 默认All - Info - Debug - Warn - Error - All
     */
    public String getLogLevel() {
        return this.LogLevel;
    }

    /**
     * Set **日志级别** 默认All - Info - Debug - Warn - Error - All
     * @param LogLevel **日志级别** 默认All - Info - Debug - Warn - Error - All
     */
    public void setLogLevel(String LogLevel) {
        this.LogLevel = LogLevel;
    }

    /**
     * Get **分页查询日志时使用，无具体业务含义** 第一次查询时值为null 第二次及以后查询时使用上一次查询返回信息中的NextCursor字段值即可 
     * @return NextCursor **分页查询日志时使用，无具体业务含义** 第一次查询时值为null 第二次及以后查询时使用上一次查询返回信息中的NextCursor字段值即可
     */
    public String getNextCursor() {
        return this.NextCursor;
    }

    /**
     * Set **分页查询日志时使用，无具体业务含义** 第一次查询时值为null 第二次及以后查询时使用上一次查询返回信息中的NextCursor字段值即可
     * @param NextCursor **分页查询日志时使用，无具体业务含义** 第一次查询时值为null 第二次及以后查询时使用上一次查询返回信息中的NextCursor字段值即可
     */
    public void setNextCursor(String NextCursor) {
        this.NextCursor = NextCursor;
    }

    public GetTaskInstanceLogRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetTaskInstanceLogRequest(GetTaskInstanceLogRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.InstanceKey != null) {
            this.InstanceKey = new String(source.InstanceKey);
        }
        if (source.LifeRoundNum != null) {
            this.LifeRoundNum = new Long(source.LifeRoundNum);
        }
        if (source.LogLevel != null) {
            this.LogLevel = new String(source.LogLevel);
        }
        if (source.NextCursor != null) {
            this.NextCursor = new String(source.NextCursor);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "InstanceKey", this.InstanceKey);
        this.setParamSimple(map, prefix + "LifeRoundNum", this.LifeRoundNum);
        this.setParamSimple(map, prefix + "LogLevel", this.LogLevel);
        this.setParamSimple(map, prefix + "NextCursor", this.NextCursor);

    }
}

