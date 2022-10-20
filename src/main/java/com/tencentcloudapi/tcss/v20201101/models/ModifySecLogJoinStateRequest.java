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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySecLogJoinStateRequest extends AbstractModel{

    /**
    * 日志类型
bash日志: container_bash
容器启动: container_launch
k8sApi: k8s_api
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * 状态(true:开 false:关)
    */
    @SerializedName("State")
    @Expose
    private Boolean State;

    /**
     * Get 日志类型
bash日志: container_bash
容器启动: container_launch
k8sApi: k8s_api 
     * @return LogType 日志类型
bash日志: container_bash
容器启动: container_launch
k8sApi: k8s_api
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set 日志类型
bash日志: container_bash
容器启动: container_launch
k8sApi: k8s_api
     * @param LogType 日志类型
bash日志: container_bash
容器启动: container_launch
k8sApi: k8s_api
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get 状态(true:开 false:关) 
     * @return State 状态(true:开 false:关)
     */
    public Boolean getState() {
        return this.State;
    }

    /**
     * Set 状态(true:开 false:关)
     * @param State 状态(true:开 false:关)
     */
    public void setState(Boolean State) {
        this.State = State;
    }

    public ModifySecLogJoinStateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySecLogJoinStateRequest(ModifySecLogJoinStateRequest source) {
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
        if (source.State != null) {
            this.State = new Boolean(source.State);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "State", this.State);

    }
}

