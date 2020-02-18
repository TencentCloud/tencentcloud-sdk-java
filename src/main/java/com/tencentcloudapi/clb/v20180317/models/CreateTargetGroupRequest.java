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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTargetGroupRequest extends AbstractModel{

    /**
    * 目标组名称，限定50个字符
    */
    @SerializedName("TargetGroupName")
    @Expose
    private String TargetGroupName;

    /**
    * 目标组的vpcid属性，不填则使用默认vpc
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 目标组的默认端口， 后续添加服务器时可使用该默认端口
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 目标组绑定的后端服务器
    */
    @SerializedName("TargetGroupInstances")
    @Expose
    private TargetGroupInstance [] TargetGroupInstances;

    /**
     * Get 目标组名称，限定50个字符 
     * @return TargetGroupName 目标组名称，限定50个字符
     */
    public String getTargetGroupName() {
        return this.TargetGroupName;
    }

    /**
     * Set 目标组名称，限定50个字符
     * @param TargetGroupName 目标组名称，限定50个字符
     */
    public void setTargetGroupName(String TargetGroupName) {
        this.TargetGroupName = TargetGroupName;
    }

    /**
     * Get 目标组的vpcid属性，不填则使用默认vpc 
     * @return VpcId 目标组的vpcid属性，不填则使用默认vpc
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 目标组的vpcid属性，不填则使用默认vpc
     * @param VpcId 目标组的vpcid属性，不填则使用默认vpc
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 目标组的默认端口， 后续添加服务器时可使用该默认端口 
     * @return Port 目标组的默认端口， 后续添加服务器时可使用该默认端口
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 目标组的默认端口， 后续添加服务器时可使用该默认端口
     * @param Port 目标组的默认端口， 后续添加服务器时可使用该默认端口
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 目标组绑定的后端服务器 
     * @return TargetGroupInstances 目标组绑定的后端服务器
     */
    public TargetGroupInstance [] getTargetGroupInstances() {
        return this.TargetGroupInstances;
    }

    /**
     * Set 目标组绑定的后端服务器
     * @param TargetGroupInstances 目标组绑定的后端服务器
     */
    public void setTargetGroupInstances(TargetGroupInstance [] TargetGroupInstances) {
        this.TargetGroupInstances = TargetGroupInstances;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TargetGroupName", this.TargetGroupName);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamArrayObj(map, prefix + "TargetGroupInstances.", this.TargetGroupInstances);

    }
}

