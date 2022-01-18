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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConnectLimitConfig extends AbstractModel{

    /**
    * 基于源IP+目的IP的每秒新建数限制
    */
    @SerializedName("SdNewLimit")
    @Expose
    private Long SdNewLimit;

    /**
    * 基于目的IP的每秒新建数限制
    */
    @SerializedName("DstNewLimit")
    @Expose
    private Long DstNewLimit;

    /**
    * 基于源IP+目的IP的并发连接控制
    */
    @SerializedName("SdConnLimit")
    @Expose
    private Long SdConnLimit;

    /**
    * 基于目的IP+目的端口的并发连接控制
    */
    @SerializedName("DstConnLimit")
    @Expose
    private Long DstConnLimit;

    /**
    * 基于连接抑制触发阈值，取值范围[0,4294967295]
    */
    @SerializedName("BadConnThreshold")
    @Expose
    private Long BadConnThreshold;

    /**
    * 异常连接检测条件，空连接防护开关，，取值范围[0,1]
    */
    @SerializedName("NullConnEnable")
    @Expose
    private Long NullConnEnable;

    /**
    * 异常连接检测条件，连接超时，，取值范围[0,65535]
    */
    @SerializedName("ConnTimeout")
    @Expose
    private Long ConnTimeout;

    /**
    * 异常连接检测条件，syn占比ack百分比，，取值范围[0,100]
    */
    @SerializedName("SynRate")
    @Expose
    private Long SynRate;

    /**
    * 异常连接检测条件，syn阈值，取值范围[0,100]
    */
    @SerializedName("SynLimit")
    @Expose
    private Long SynLimit;

    /**
     * Get 基于源IP+目的IP的每秒新建数限制 
     * @return SdNewLimit 基于源IP+目的IP的每秒新建数限制
     */
    public Long getSdNewLimit() {
        return this.SdNewLimit;
    }

    /**
     * Set 基于源IP+目的IP的每秒新建数限制
     * @param SdNewLimit 基于源IP+目的IP的每秒新建数限制
     */
    public void setSdNewLimit(Long SdNewLimit) {
        this.SdNewLimit = SdNewLimit;
    }

    /**
     * Get 基于目的IP的每秒新建数限制 
     * @return DstNewLimit 基于目的IP的每秒新建数限制
     */
    public Long getDstNewLimit() {
        return this.DstNewLimit;
    }

    /**
     * Set 基于目的IP的每秒新建数限制
     * @param DstNewLimit 基于目的IP的每秒新建数限制
     */
    public void setDstNewLimit(Long DstNewLimit) {
        this.DstNewLimit = DstNewLimit;
    }

    /**
     * Get 基于源IP+目的IP的并发连接控制 
     * @return SdConnLimit 基于源IP+目的IP的并发连接控制
     */
    public Long getSdConnLimit() {
        return this.SdConnLimit;
    }

    /**
     * Set 基于源IP+目的IP的并发连接控制
     * @param SdConnLimit 基于源IP+目的IP的并发连接控制
     */
    public void setSdConnLimit(Long SdConnLimit) {
        this.SdConnLimit = SdConnLimit;
    }

    /**
     * Get 基于目的IP+目的端口的并发连接控制 
     * @return DstConnLimit 基于目的IP+目的端口的并发连接控制
     */
    public Long getDstConnLimit() {
        return this.DstConnLimit;
    }

    /**
     * Set 基于目的IP+目的端口的并发连接控制
     * @param DstConnLimit 基于目的IP+目的端口的并发连接控制
     */
    public void setDstConnLimit(Long DstConnLimit) {
        this.DstConnLimit = DstConnLimit;
    }

    /**
     * Get 基于连接抑制触发阈值，取值范围[0,4294967295] 
     * @return BadConnThreshold 基于连接抑制触发阈值，取值范围[0,4294967295]
     */
    public Long getBadConnThreshold() {
        return this.BadConnThreshold;
    }

    /**
     * Set 基于连接抑制触发阈值，取值范围[0,4294967295]
     * @param BadConnThreshold 基于连接抑制触发阈值，取值范围[0,4294967295]
     */
    public void setBadConnThreshold(Long BadConnThreshold) {
        this.BadConnThreshold = BadConnThreshold;
    }

    /**
     * Get 异常连接检测条件，空连接防护开关，，取值范围[0,1] 
     * @return NullConnEnable 异常连接检测条件，空连接防护开关，，取值范围[0,1]
     */
    public Long getNullConnEnable() {
        return this.NullConnEnable;
    }

    /**
     * Set 异常连接检测条件，空连接防护开关，，取值范围[0,1]
     * @param NullConnEnable 异常连接检测条件，空连接防护开关，，取值范围[0,1]
     */
    public void setNullConnEnable(Long NullConnEnable) {
        this.NullConnEnable = NullConnEnable;
    }

    /**
     * Get 异常连接检测条件，连接超时，，取值范围[0,65535] 
     * @return ConnTimeout 异常连接检测条件，连接超时，，取值范围[0,65535]
     */
    public Long getConnTimeout() {
        return this.ConnTimeout;
    }

    /**
     * Set 异常连接检测条件，连接超时，，取值范围[0,65535]
     * @param ConnTimeout 异常连接检测条件，连接超时，，取值范围[0,65535]
     */
    public void setConnTimeout(Long ConnTimeout) {
        this.ConnTimeout = ConnTimeout;
    }

    /**
     * Get 异常连接检测条件，syn占比ack百分比，，取值范围[0,100] 
     * @return SynRate 异常连接检测条件，syn占比ack百分比，，取值范围[0,100]
     */
    public Long getSynRate() {
        return this.SynRate;
    }

    /**
     * Set 异常连接检测条件，syn占比ack百分比，，取值范围[0,100]
     * @param SynRate 异常连接检测条件，syn占比ack百分比，，取值范围[0,100]
     */
    public void setSynRate(Long SynRate) {
        this.SynRate = SynRate;
    }

    /**
     * Get 异常连接检测条件，syn阈值，取值范围[0,100] 
     * @return SynLimit 异常连接检测条件，syn阈值，取值范围[0,100]
     */
    public Long getSynLimit() {
        return this.SynLimit;
    }

    /**
     * Set 异常连接检测条件，syn阈值，取值范围[0,100]
     * @param SynLimit 异常连接检测条件，syn阈值，取值范围[0,100]
     */
    public void setSynLimit(Long SynLimit) {
        this.SynLimit = SynLimit;
    }

    public ConnectLimitConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConnectLimitConfig(ConnectLimitConfig source) {
        if (source.SdNewLimit != null) {
            this.SdNewLimit = new Long(source.SdNewLimit);
        }
        if (source.DstNewLimit != null) {
            this.DstNewLimit = new Long(source.DstNewLimit);
        }
        if (source.SdConnLimit != null) {
            this.SdConnLimit = new Long(source.SdConnLimit);
        }
        if (source.DstConnLimit != null) {
            this.DstConnLimit = new Long(source.DstConnLimit);
        }
        if (source.BadConnThreshold != null) {
            this.BadConnThreshold = new Long(source.BadConnThreshold);
        }
        if (source.NullConnEnable != null) {
            this.NullConnEnable = new Long(source.NullConnEnable);
        }
        if (source.ConnTimeout != null) {
            this.ConnTimeout = new Long(source.ConnTimeout);
        }
        if (source.SynRate != null) {
            this.SynRate = new Long(source.SynRate);
        }
        if (source.SynLimit != null) {
            this.SynLimit = new Long(source.SynLimit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdNewLimit", this.SdNewLimit);
        this.setParamSimple(map, prefix + "DstNewLimit", this.DstNewLimit);
        this.setParamSimple(map, prefix + "SdConnLimit", this.SdConnLimit);
        this.setParamSimple(map, prefix + "DstConnLimit", this.DstConnLimit);
        this.setParamSimple(map, prefix + "BadConnThreshold", this.BadConnThreshold);
        this.setParamSimple(map, prefix + "NullConnEnable", this.NullConnEnable);
        this.setParamSimple(map, prefix + "ConnTimeout", this.ConnTimeout);
        this.setParamSimple(map, prefix + "SynRate", this.SynRate);
        this.setParamSimple(map, prefix + "SynLimit", this.SynLimit);

    }
}

