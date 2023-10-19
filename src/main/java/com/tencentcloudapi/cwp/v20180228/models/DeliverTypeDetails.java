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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeliverTypeDetails extends AbstractModel {

    /**
    * 安全模块类型 1: 入侵检测 2: 漏洞管理 3: 基线管理 4: 高级防御 5:客户端相关 6: 资产指纹
    */
    @SerializedName("SecurityType")
    @Expose
    private Long SecurityType;

    /**
    * 安全模块下的日志类型，http://tapd.woa.com/Teneyes/markdown_wikis/show/#1210131751002328905
    */
    @SerializedName("LogType")
    @Expose
    private Long [] LogType;

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
    * 投递开关 0关闭 1开启
    */
    @SerializedName("Switch")
    @Expose
    private Long Switch;

    /**
    * 投递状态，0未开启 1正常 2异常
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 错误信息
    */
    @SerializedName("ErrInfo")
    @Expose
    private String ErrInfo;

    /**
    * 最近一次状态上报时间戳，s
    */
    @SerializedName("StatusTime")
    @Expose
    private Long StatusTime;

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
     * Get 安全模块下的日志类型，http://tapd.woa.com/Teneyes/markdown_wikis/show/#1210131751002328905 
     * @return LogType 安全模块下的日志类型，http://tapd.woa.com/Teneyes/markdown_wikis/show/#1210131751002328905
     */
    public Long [] getLogType() {
        return this.LogType;
    }

    /**
     * Set 安全模块下的日志类型，http://tapd.woa.com/Teneyes/markdown_wikis/show/#1210131751002328905
     * @param LogType 安全模块下的日志类型，http://tapd.woa.com/Teneyes/markdown_wikis/show/#1210131751002328905
     */
    public void setLogType(Long [] LogType) {
        this.LogType = LogType;
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
     * Get 投递状态，0未开启 1正常 2异常 
     * @return Status 投递状态，0未开启 1正常 2异常
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 投递状态，0未开启 1正常 2异常
     * @param Status 投递状态，0未开启 1正常 2异常
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 错误信息 
     * @return ErrInfo 错误信息
     */
    public String getErrInfo() {
        return this.ErrInfo;
    }

    /**
     * Set 错误信息
     * @param ErrInfo 错误信息
     */
    public void setErrInfo(String ErrInfo) {
        this.ErrInfo = ErrInfo;
    }

    /**
     * Get 最近一次状态上报时间戳，s 
     * @return StatusTime 最近一次状态上报时间戳，s
     */
    public Long getStatusTime() {
        return this.StatusTime;
    }

    /**
     * Set 最近一次状态上报时间戳，s
     * @param StatusTime 最近一次状态上报时间戳，s
     */
    public void setStatusTime(Long StatusTime) {
        this.StatusTime = StatusTime;
    }

    public DeliverTypeDetails() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeliverTypeDetails(DeliverTypeDetails source) {
        if (source.SecurityType != null) {
            this.SecurityType = new Long(source.SecurityType);
        }
        if (source.LogType != null) {
            this.LogType = new Long[source.LogType.length];
            for (int i = 0; i < source.LogType.length; i++) {
                this.LogType[i] = new Long(source.LogType[i]);
            }
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.Switch != null) {
            this.Switch = new Long(source.Switch);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ErrInfo != null) {
            this.ErrInfo = new String(source.ErrInfo);
        }
        if (source.StatusTime != null) {
            this.StatusTime = new Long(source.StatusTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecurityType", this.SecurityType);
        this.setParamArraySimple(map, prefix + "LogType.", this.LogType);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrInfo", this.ErrInfo);
        this.setParamSimple(map, prefix + "StatusTime", this.StatusTime);

    }
}

