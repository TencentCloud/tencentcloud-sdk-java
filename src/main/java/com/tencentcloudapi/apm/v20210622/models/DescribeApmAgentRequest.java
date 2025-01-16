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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeApmAgentRequest extends AbstractModel {

    /**
    * 业务系统 ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 接入方式，现支持 skywalking, ot, ebpf 方式接入上报，不填默认为 ot
    */
    @SerializedName("AgentType")
    @Expose
    private String AgentType;

    /**
    * 上报环境，现支持 pl (内网上报), public (外网), inner (自研 VPC )环境上报，不传默认为 public
    */
    @SerializedName("NetworkMode")
    @Expose
    private String NetworkMode;

    /**
    * 语言，现支持 java, golang, php, python, dotNet, nodejs 语言上报，不传默认为 golang
    */
    @SerializedName("LanguageEnvironment")
    @Expose
    private String LanguageEnvironment;

    /**
    * 上报方式，已弃用
    */
    @SerializedName("ReportMethod")
    @Expose
    private String ReportMethod;

    /**
     * Get 业务系统 ID 
     * @return InstanceId 业务系统 ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 业务系统 ID
     * @param InstanceId 业务系统 ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 接入方式，现支持 skywalking, ot, ebpf 方式接入上报，不填默认为 ot 
     * @return AgentType 接入方式，现支持 skywalking, ot, ebpf 方式接入上报，不填默认为 ot
     */
    public String getAgentType() {
        return this.AgentType;
    }

    /**
     * Set 接入方式，现支持 skywalking, ot, ebpf 方式接入上报，不填默认为 ot
     * @param AgentType 接入方式，现支持 skywalking, ot, ebpf 方式接入上报，不填默认为 ot
     */
    public void setAgentType(String AgentType) {
        this.AgentType = AgentType;
    }

    /**
     * Get 上报环境，现支持 pl (内网上报), public (外网), inner (自研 VPC )环境上报，不传默认为 public 
     * @return NetworkMode 上报环境，现支持 pl (内网上报), public (外网), inner (自研 VPC )环境上报，不传默认为 public
     */
    public String getNetworkMode() {
        return this.NetworkMode;
    }

    /**
     * Set 上报环境，现支持 pl (内网上报), public (外网), inner (自研 VPC )环境上报，不传默认为 public
     * @param NetworkMode 上报环境，现支持 pl (内网上报), public (外网), inner (自研 VPC )环境上报，不传默认为 public
     */
    public void setNetworkMode(String NetworkMode) {
        this.NetworkMode = NetworkMode;
    }

    /**
     * Get 语言，现支持 java, golang, php, python, dotNet, nodejs 语言上报，不传默认为 golang 
     * @return LanguageEnvironment 语言，现支持 java, golang, php, python, dotNet, nodejs 语言上报，不传默认为 golang
     */
    public String getLanguageEnvironment() {
        return this.LanguageEnvironment;
    }

    /**
     * Set 语言，现支持 java, golang, php, python, dotNet, nodejs 语言上报，不传默认为 golang
     * @param LanguageEnvironment 语言，现支持 java, golang, php, python, dotNet, nodejs 语言上报，不传默认为 golang
     */
    public void setLanguageEnvironment(String LanguageEnvironment) {
        this.LanguageEnvironment = LanguageEnvironment;
    }

    /**
     * Get 上报方式，已弃用 
     * @return ReportMethod 上报方式，已弃用
     */
    public String getReportMethod() {
        return this.ReportMethod;
    }

    /**
     * Set 上报方式，已弃用
     * @param ReportMethod 上报方式，已弃用
     */
    public void setReportMethod(String ReportMethod) {
        this.ReportMethod = ReportMethod;
    }

    public DescribeApmAgentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApmAgentRequest(DescribeApmAgentRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.AgentType != null) {
            this.AgentType = new String(source.AgentType);
        }
        if (source.NetworkMode != null) {
            this.NetworkMode = new String(source.NetworkMode);
        }
        if (source.LanguageEnvironment != null) {
            this.LanguageEnvironment = new String(source.LanguageEnvironment);
        }
        if (source.ReportMethod != null) {
            this.ReportMethod = new String(source.ReportMethod);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "AgentType", this.AgentType);
        this.setParamSimple(map, prefix + "NetworkMode", this.NetworkMode);
        this.setParamSimple(map, prefix + "LanguageEnvironment", this.LanguageEnvironment);
        this.setParamSimple(map, prefix + "ReportMethod", this.ReportMethod);

    }
}

