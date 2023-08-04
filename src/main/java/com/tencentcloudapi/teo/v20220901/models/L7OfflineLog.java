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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class L7OfflineLog extends AbstractModel{

    /**
    * 离线日志域名。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 日志所属区域，取值有：
<li>mainland：中国大陆境内; </li>
<li>overseas：全球（不含中国大陆）。</li>
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * 离线日志数据包名。	
    */
    @SerializedName("LogPacketName")
    @Expose
    private String LogPacketName;

    /**
    * 离线日志下载地址。	
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 日志打包时间，此参数已经废弃。
    */
    @SerializedName("LogTime")
    @Expose
    private Long LogTime;

    /**
    * 日志打包开始时间。
    */
    @SerializedName("LogStartTime")
    @Expose
    private String LogStartTime;

    /**
    * 日志打包结束时间。
    */
    @SerializedName("LogEndTime")
    @Expose
    private String LogEndTime;

    /**
    * 日志原始大小，单位 Byte。
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
     * Get 离线日志域名。 
     * @return Domain 离线日志域名。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 离线日志域名。
     * @param Domain 离线日志域名。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 日志所属区域，取值有：
<li>mainland：中国大陆境内; </li>
<li>overseas：全球（不含中国大陆）。</li> 
     * @return Area 日志所属区域，取值有：
<li>mainland：中国大陆境内; </li>
<li>overseas：全球（不含中国大陆）。</li>
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 日志所属区域，取值有：
<li>mainland：中国大陆境内; </li>
<li>overseas：全球（不含中国大陆）。</li>
     * @param Area 日志所属区域，取值有：
<li>mainland：中国大陆境内; </li>
<li>overseas：全球（不含中国大陆）。</li>
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get 离线日志数据包名。	 
     * @return LogPacketName 离线日志数据包名。	
     */
    public String getLogPacketName() {
        return this.LogPacketName;
    }

    /**
     * Set 离线日志数据包名。	
     * @param LogPacketName 离线日志数据包名。	
     */
    public void setLogPacketName(String LogPacketName) {
        this.LogPacketName = LogPacketName;
    }

    /**
     * Get 离线日志下载地址。	 
     * @return Url 离线日志下载地址。	
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 离线日志下载地址。	
     * @param Url 离线日志下载地址。	
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 日志打包时间，此参数已经废弃。 
     * @return LogTime 日志打包时间，此参数已经废弃。
     */
    public Long getLogTime() {
        return this.LogTime;
    }

    /**
     * Set 日志打包时间，此参数已经废弃。
     * @param LogTime 日志打包时间，此参数已经废弃。
     */
    public void setLogTime(Long LogTime) {
        this.LogTime = LogTime;
    }

    /**
     * Get 日志打包开始时间。 
     * @return LogStartTime 日志打包开始时间。
     */
    public String getLogStartTime() {
        return this.LogStartTime;
    }

    /**
     * Set 日志打包开始时间。
     * @param LogStartTime 日志打包开始时间。
     */
    public void setLogStartTime(String LogStartTime) {
        this.LogStartTime = LogStartTime;
    }

    /**
     * Get 日志打包结束时间。 
     * @return LogEndTime 日志打包结束时间。
     */
    public String getLogEndTime() {
        return this.LogEndTime;
    }

    /**
     * Set 日志打包结束时间。
     * @param LogEndTime 日志打包结束时间。
     */
    public void setLogEndTime(String LogEndTime) {
        this.LogEndTime = LogEndTime;
    }

    /**
     * Get 日志原始大小，单位 Byte。 
     * @return Size 日志原始大小，单位 Byte。
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 日志原始大小，单位 Byte。
     * @param Size 日志原始大小，单位 Byte。
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    public L7OfflineLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public L7OfflineLog(L7OfflineLog source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.LogPacketName != null) {
            this.LogPacketName = new String(source.LogPacketName);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.LogTime != null) {
            this.LogTime = new Long(source.LogTime);
        }
        if (source.LogStartTime != null) {
            this.LogStartTime = new String(source.LogStartTime);
        }
        if (source.LogEndTime != null) {
            this.LogEndTime = new String(source.LogEndTime);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "LogPacketName", this.LogPacketName);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "LogTime", this.LogTime);
        this.setParamSimple(map, prefix + "LogStartTime", this.LogStartTime);
        this.setParamSimple(map, prefix + "LogEndTime", this.LogEndTime);
        this.setParamSimple(map, prefix + "Size", this.Size);

    }
}

