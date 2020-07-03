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

public class TrafficMirrorPortStatus extends AbstractModel{

    /**
    * 接收机端口。
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 状态。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 接收机端口。 
     * @return Port 接收机端口。
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 接收机端口。
     * @param Port 接收机端口。
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 状态。 
     * @return Status 状态。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态。
     * @param Status 状态。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

