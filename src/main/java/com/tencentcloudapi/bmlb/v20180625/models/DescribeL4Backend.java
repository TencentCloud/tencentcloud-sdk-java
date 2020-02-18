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

public class DescribeL4Backend extends AbstractModel{

    /**
    * 待绑定的主机端口，可选值1~65535。
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 黑石物理机的主机ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get 待绑定的主机端口，可选值1~65535。 
     * @return Port 待绑定的主机端口，可选值1~65535。
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 待绑定的主机端口，可选值1~65535。
     * @param Port 待绑定的主机端口，可选值1~65535。
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 黑石物理机的主机ID。 
     * @return InstanceId 黑石物理机的主机ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 黑石物理机的主机ID。
     * @param InstanceId 黑石物理机的主机ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

