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

public class L4OfflineLog extends AbstractModel{

    /**
    * 日志打包开始时间。
    */
    @SerializedName("LogTime")
    @Expose
    private Long LogTime;

    /**
    * 四层实例ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
    * 原始大小 单位byte。
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * 下载地址。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 日志数据包名。
    */
    @SerializedName("LogPacketName")
    @Expose
    private String LogPacketName;

    /**
    * 加速区域，取值有：
<li>mainland：中国大陆境内;</li>
<li>overseas：全球（不含中国大陆）。</li>
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
     * Get 日志打包开始时间。 
     * @return LogTime 日志打包开始时间。
     */
    public Long getLogTime() {
        return this.LogTime;
    }

    /**
     * Set 日志打包开始时间。
     * @param LogTime 日志打包开始时间。
     */
    public void setLogTime(Long LogTime) {
        this.LogTime = LogTime;
    }

    /**
     * Get 四层实例ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProxyId 四层实例ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * Set 四层实例ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProxyId 四层实例ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    /**
     * Get 原始大小 单位byte。 
     * @return Size 原始大小 单位byte。
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 原始大小 单位byte。
     * @param Size 原始大小 单位byte。
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get 下载地址。 
     * @return Url 下载地址。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 下载地址。
     * @param Url 下载地址。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 日志数据包名。 
     * @return LogPacketName 日志数据包名。
     */
    public String getLogPacketName() {
        return this.LogPacketName;
    }

    /**
     * Set 日志数据包名。
     * @param LogPacketName 日志数据包名。
     */
    public void setLogPacketName(String LogPacketName) {
        this.LogPacketName = LogPacketName;
    }

    /**
     * Get 加速区域，取值有：
<li>mainland：中国大陆境内;</li>
<li>overseas：全球（不含中国大陆）。</li> 
     * @return Area 加速区域，取值有：
<li>mainland：中国大陆境内;</li>
<li>overseas：全球（不含中国大陆）。</li>
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 加速区域，取值有：
<li>mainland：中国大陆境内;</li>
<li>overseas：全球（不含中国大陆）。</li>
     * @param Area 加速区域，取值有：
<li>mainland：中国大陆境内;</li>
<li>overseas：全球（不含中国大陆）。</li>
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    public L4OfflineLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public L4OfflineLog(L4OfflineLog source) {
        if (source.LogTime != null) {
            this.LogTime = new Long(source.LogTime);
        }
        if (source.ProxyId != null) {
            this.ProxyId = new String(source.ProxyId);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.LogPacketName != null) {
            this.LogPacketName = new String(source.LogPacketName);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogTime", this.LogTime);
        this.setParamSimple(map, prefix + "ProxyId", this.ProxyId);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "LogPacketName", this.LogPacketName);
        this.setParamSimple(map, prefix + "Area", this.Area);

    }
}

