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
package com.tencentcloudapi.bmlb.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TrafficMirrorPortStatus  extends AbstractModel{

    /**
    * 接收机端口。
    */
    @SerializedName("Port")
    @Expose
    private Integer Port;

    /**
    * 状态。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * 获取接收机端口。
     * @return Port 接收机端口。
     */
    public Integer getPort() {
        return this.Port;
    }

    /**
     * 设置接收机端口。
     * @param Port 接收机端口。
     */
    public void setPort(Integer Port) {
        this.Port = Port;
    }

    /**
     * 获取状态。
     * @return Status 状态。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * 设置状态。
     * @param Status 状态。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

