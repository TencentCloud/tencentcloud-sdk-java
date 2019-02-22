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

public class DevicesBindInfoBackend  extends AbstractModel{

    /**
    * 黑石物理机的主机ID、托管主机ID或虚拟机IP。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 主机端口。
    */
    @SerializedName("Port")
    @Expose
    private Integer Port;

    /**
     * 获取黑石物理机的主机ID、托管主机ID或虚拟机IP。
     * @return InstanceId 黑石物理机的主机ID、托管主机ID或虚拟机IP。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置黑石物理机的主机ID、托管主机ID或虚拟机IP。
     * @param InstanceId 黑石物理机的主机ID、托管主机ID或虚拟机IP。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取主机端口。
     * @return Port 主机端口。
     */
    public Integer getPort() {
        return this.Port;
    }

    /**
     * 设置主机端口。
     * @param Port 主机端口。
     */
    public void setPort(Integer Port) {
        this.Port = Port;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Port", this.Port);

    }
}

