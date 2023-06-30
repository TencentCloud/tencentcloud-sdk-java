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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WxGatewayCustomConfig extends AbstractModel{

    /**
    * 是否开启x-real-ip
    */
    @SerializedName("IsOpenXRealIp")
    @Expose
    private Boolean IsOpenXRealIp;

    /**
    * 封禁配置
    */
    @SerializedName("BanConfig")
    @Expose
    private BanConfig BanConfig;

    /**
    * 获取源ip方式，PPV1(Proxy Protocol V1)、PPV2(Proxy Protocol V2)、TOA(tcp option address)
    */
    @SerializedName("SourceIpType")
    @Expose
    private String SourceIpType;

    /**
    * 日志信息
    */
    @SerializedName("LogConfig")
    @Expose
    private CustomLogConfig LogConfig;

    /**
    * 是否开启http1.0
    */
    @SerializedName("IsAcceptHttpOne")
    @Expose
    private Boolean IsAcceptHttpOne;

    /**
     * Get 是否开启x-real-ip 
     * @return IsOpenXRealIp 是否开启x-real-ip
     */
    public Boolean getIsOpenXRealIp() {
        return this.IsOpenXRealIp;
    }

    /**
     * Set 是否开启x-real-ip
     * @param IsOpenXRealIp 是否开启x-real-ip
     */
    public void setIsOpenXRealIp(Boolean IsOpenXRealIp) {
        this.IsOpenXRealIp = IsOpenXRealIp;
    }

    /**
     * Get 封禁配置 
     * @return BanConfig 封禁配置
     */
    public BanConfig getBanConfig() {
        return this.BanConfig;
    }

    /**
     * Set 封禁配置
     * @param BanConfig 封禁配置
     */
    public void setBanConfig(BanConfig BanConfig) {
        this.BanConfig = BanConfig;
    }

    /**
     * Get 获取源ip方式，PPV1(Proxy Protocol V1)、PPV2(Proxy Protocol V2)、TOA(tcp option address) 
     * @return SourceIpType 获取源ip方式，PPV1(Proxy Protocol V1)、PPV2(Proxy Protocol V2)、TOA(tcp option address)
     */
    public String getSourceIpType() {
        return this.SourceIpType;
    }

    /**
     * Set 获取源ip方式，PPV1(Proxy Protocol V1)、PPV2(Proxy Protocol V2)、TOA(tcp option address)
     * @param SourceIpType 获取源ip方式，PPV1(Proxy Protocol V1)、PPV2(Proxy Protocol V2)、TOA(tcp option address)
     */
    public void setSourceIpType(String SourceIpType) {
        this.SourceIpType = SourceIpType;
    }

    /**
     * Get 日志信息 
     * @return LogConfig 日志信息
     */
    public CustomLogConfig getLogConfig() {
        return this.LogConfig;
    }

    /**
     * Set 日志信息
     * @param LogConfig 日志信息
     */
    public void setLogConfig(CustomLogConfig LogConfig) {
        this.LogConfig = LogConfig;
    }

    /**
     * Get 是否开启http1.0 
     * @return IsAcceptHttpOne 是否开启http1.0
     */
    public Boolean getIsAcceptHttpOne() {
        return this.IsAcceptHttpOne;
    }

    /**
     * Set 是否开启http1.0
     * @param IsAcceptHttpOne 是否开启http1.0
     */
    public void setIsAcceptHttpOne(Boolean IsAcceptHttpOne) {
        this.IsAcceptHttpOne = IsAcceptHttpOne;
    }

    public WxGatewayCustomConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WxGatewayCustomConfig(WxGatewayCustomConfig source) {
        if (source.IsOpenXRealIp != null) {
            this.IsOpenXRealIp = new Boolean(source.IsOpenXRealIp);
        }
        if (source.BanConfig != null) {
            this.BanConfig = new BanConfig(source.BanConfig);
        }
        if (source.SourceIpType != null) {
            this.SourceIpType = new String(source.SourceIpType);
        }
        if (source.LogConfig != null) {
            this.LogConfig = new CustomLogConfig(source.LogConfig);
        }
        if (source.IsAcceptHttpOne != null) {
            this.IsAcceptHttpOne = new Boolean(source.IsAcceptHttpOne);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsOpenXRealIp", this.IsOpenXRealIp);
        this.setParamObj(map, prefix + "BanConfig.", this.BanConfig);
        this.setParamSimple(map, prefix + "SourceIpType", this.SourceIpType);
        this.setParamObj(map, prefix + "LogConfig.", this.LogConfig);
        this.setParamSimple(map, prefix + "IsAcceptHttpOne", this.IsAcceptHttpOne);

    }
}

