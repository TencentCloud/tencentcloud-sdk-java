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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyLogKafkaDeliverTypeRequest extends AbstractModel {

    /**
    * 安全模块类型 1: 入侵检测 2: 漏洞管理 3: 基线管理 4: 高级防御 5:客户端相关 6: 资产指纹
    */
    @SerializedName("SecurityType")
    @Expose
    private Long SecurityType;

    /**
    * 安全模块下的日志类型，
    */
    @SerializedName("LogType")
    @Expose
    private Long [] LogType;

    /**
    * 投递开关 0关闭 1开启
    */
    @SerializedName("Switch")
    @Expose
    private Long Switch;

    /**
    * kafka topic id
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * kafka topic name
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
     * Get 安全模块类型 1: 入侵检测 2: 漏洞管理 3: 基线管理 4: 高级防御 5:客户端相关 6: 资产指纹 
     * @return SecurityType 安全模块类型 1: 入侵检测 2: 漏洞管理 3: 基线管理 4: 高级防御 5:客户端相关 6: 资产指纹
     */
    public Long getSecurityType() {
        return this.SecurityType;
    }

    /**
     * Set 安全模块类型 1: 入侵检测 2: 漏洞管理 3: 基线管理 4: 高级防御 5:客户端相关 6: 资产指纹
     * @param SecurityType 安全模块类型 1: 入侵检测 2: 漏洞管理 3: 基线管理 4: 高级防御 5:客户端相关 6: 资产指纹
     */
    public void setSecurityType(Long SecurityType) {
        this.SecurityType = SecurityType;
    }

    /**
     * Get 安全模块下的日志类型， 
     * @return LogType 安全模块下的日志类型，
     */
    public Long [] getLogType() {
        return this.LogType;
    }

    /**
     * Set 安全模块下的日志类型，
     * @param LogType 安全模块下的日志类型，
     */
    public void setLogType(Long [] LogType) {
        this.LogType = LogType;
    }

    /**
     * Get 投递开关 0关闭 1开启 
     * @return Switch 投递开关 0关闭 1开启
     */
    public Long getSwitch() {
        return this.Switch;
    }

    /**
     * Set 投递开关 0关闭 1开启
     * @param Switch 投递开关 0关闭 1开启
     */
    public void setSwitch(Long Switch) {
        this.Switch = Switch;
    }

    /**
     * Get kafka topic id 
     * @return TopicId kafka topic id
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set kafka topic id
     * @param TopicId kafka topic id
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get kafka topic name 
     * @return TopicName kafka topic name
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set kafka topic name
     * @param TopicName kafka topic name
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    public ModifyLogKafkaDeliverTypeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLogKafkaDeliverTypeRequest(ModifyLogKafkaDeliverTypeRequest source) {
        if (source.SecurityType != null) {
            this.SecurityType = new Long(source.SecurityType);
        }
        if (source.LogType != null) {
            this.LogType = new Long[source.LogType.length];
            for (int i = 0; i < source.LogType.length; i++) {
                this.LogType[i] = new Long(source.LogType[i]);
            }
        }
        if (source.Switch != null) {
            this.Switch = new Long(source.Switch);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecurityType", this.SecurityType);
        this.setParamArraySimple(map, prefix + "LogType.", this.LogType);
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);

    }
}

