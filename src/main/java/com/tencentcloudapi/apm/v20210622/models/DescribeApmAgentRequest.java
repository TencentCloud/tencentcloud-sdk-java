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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeApmAgentRequest extends AbstractModel{

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 接入方式
    */
    @SerializedName("AgentType")
    @Expose
    private String AgentType;

    /**
    * 环境
    */
    @SerializedName("NetworkMode")
    @Expose
    private String NetworkMode;

    /**
    * 语言
    */
    @SerializedName("LanguageEnvironment")
    @Expose
    private String LanguageEnvironment;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 接入方式 
     * @return AgentType 接入方式
     */
    public String getAgentType() {
        return this.AgentType;
    }

    /**
     * Set 接入方式
     * @param AgentType 接入方式
     */
    public void setAgentType(String AgentType) {
        this.AgentType = AgentType;
    }

    /**
     * Get 环境 
     * @return NetworkMode 环境
     */
    public String getNetworkMode() {
        return this.NetworkMode;
    }

    /**
     * Set 环境
     * @param NetworkMode 环境
     */
    public void setNetworkMode(String NetworkMode) {
        this.NetworkMode = NetworkMode;
    }

    /**
     * Get 语言 
     * @return LanguageEnvironment 语言
     */
    public String getLanguageEnvironment() {
        return this.LanguageEnvironment;
    }

    /**
     * Set 语言
     * @param LanguageEnvironment 语言
     */
    public void setLanguageEnvironment(String LanguageEnvironment) {
        this.LanguageEnvironment = LanguageEnvironment;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "AgentType", this.AgentType);
        this.setParamSimple(map, prefix + "NetworkMode", this.NetworkMode);
        this.setParamSimple(map, prefix + "LanguageEnvironment", this.LanguageEnvironment);

    }
}

