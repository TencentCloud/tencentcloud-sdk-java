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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class L7OfflineLog extends AbstractModel{

    /**
    * 日志打包开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogTime")
    @Expose
    private Long LogTime;

    /**
    * 站点名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 原始大小 单位byte
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * 下载地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 日志数据包名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogPacketName")
    @Expose
    private String LogPacketName;

    /**
     * Get 日志打包开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogTime 日志打包开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLogTime() {
        return this.LogTime;
    }

    /**
     * Set 日志打包开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogTime 日志打包开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogTime(Long LogTime) {
        this.LogTime = LogTime;
    }

    /**
     * Get 站点名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Domain 站点名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 站点名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Domain 站点名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 原始大小 单位byte
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Size 原始大小 单位byte
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 原始大小 单位byte
注意：此字段可能返回 null，表示取不到有效值。
     * @param Size 原始大小 单位byte
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get 下载地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Url 下载地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 下载地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param Url 下载地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 日志数据包名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogPacketName 日志数据包名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogPacketName() {
        return this.LogPacketName;
    }

    /**
     * Set 日志数据包名
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogPacketName 日志数据包名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogPacketName(String LogPacketName) {
        this.LogPacketName = LogPacketName;
    }

    public L7OfflineLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public L7OfflineLog(L7OfflineLog source) {
        if (source.LogTime != null) {
            this.LogTime = new Long(source.LogTime);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogTime", this.LogTime);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "LogPacketName", this.LogPacketName);

    }
}

