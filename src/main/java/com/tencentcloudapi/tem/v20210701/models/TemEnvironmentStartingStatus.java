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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TemEnvironmentStartingStatus extends AbstractModel {

    /**
    * 需要启动的应用数量
    */
    @SerializedName("ApplicationNumNeedToStart")
    @Expose
    private Long ApplicationNumNeedToStart;

    /**
    * 已经启动的应用数量
    */
    @SerializedName("StartedApplicationNum")
    @Expose
    private Long StartedApplicationNum;

    /**
    * 启动失败的应用数量
    */
    @SerializedName("StartFailedApplicationNum")
    @Expose
    private Long StartFailedApplicationNum;

    /**
     * Get 需要启动的应用数量 
     * @return ApplicationNumNeedToStart 需要启动的应用数量
     */
    public Long getApplicationNumNeedToStart() {
        return this.ApplicationNumNeedToStart;
    }

    /**
     * Set 需要启动的应用数量
     * @param ApplicationNumNeedToStart 需要启动的应用数量
     */
    public void setApplicationNumNeedToStart(Long ApplicationNumNeedToStart) {
        this.ApplicationNumNeedToStart = ApplicationNumNeedToStart;
    }

    /**
     * Get 已经启动的应用数量 
     * @return StartedApplicationNum 已经启动的应用数量
     */
    public Long getStartedApplicationNum() {
        return this.StartedApplicationNum;
    }

    /**
     * Set 已经启动的应用数量
     * @param StartedApplicationNum 已经启动的应用数量
     */
    public void setStartedApplicationNum(Long StartedApplicationNum) {
        this.StartedApplicationNum = StartedApplicationNum;
    }

    /**
     * Get 启动失败的应用数量 
     * @return StartFailedApplicationNum 启动失败的应用数量
     */
    public Long getStartFailedApplicationNum() {
        return this.StartFailedApplicationNum;
    }

    /**
     * Set 启动失败的应用数量
     * @param StartFailedApplicationNum 启动失败的应用数量
     */
    public void setStartFailedApplicationNum(Long StartFailedApplicationNum) {
        this.StartFailedApplicationNum = StartFailedApplicationNum;
    }

    public TemEnvironmentStartingStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TemEnvironmentStartingStatus(TemEnvironmentStartingStatus source) {
        if (source.ApplicationNumNeedToStart != null) {
            this.ApplicationNumNeedToStart = new Long(source.ApplicationNumNeedToStart);
        }
        if (source.StartedApplicationNum != null) {
            this.StartedApplicationNum = new Long(source.StartedApplicationNum);
        }
        if (source.StartFailedApplicationNum != null) {
            this.StartFailedApplicationNum = new Long(source.StartFailedApplicationNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationNumNeedToStart", this.ApplicationNumNeedToStart);
        this.setParamSimple(map, prefix + "StartedApplicationNum", this.StartedApplicationNum);
        this.setParamSimple(map, prefix + "StartFailedApplicationNum", this.StartFailedApplicationNum);

    }
}

