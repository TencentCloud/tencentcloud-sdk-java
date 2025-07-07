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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogContextInfo extends AbstractModel {

    /**
    * 日志来源设备
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 采集路径
    */
    @SerializedName("Filename")
    @Expose
    private String Filename;

    /**
    * 日志内容
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 日志包序号
    */
    @SerializedName("PkgId")
    @Expose
    private String PkgId;

    /**
    * 日志包内一条日志的序号
    */
    @SerializedName("PkgLogId")
    @Expose
    private Long PkgLogId;

    /**
    * 日志时间戳
    */
    @SerializedName("BTime")
    @Expose
    private Long BTime;

    /**
    * 日志来源主机名称
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * 原始日志(仅在日志创建索引异常时有值)
    */
    @SerializedName("RawLog")
    @Expose
    private String RawLog;

    /**
    * 日志创建索引异常原因(仅在日志创建索引异常时有值)
    */
    @SerializedName("IndexStatus")
    @Expose
    private String IndexStatus;

    /**
    * 日志内容的高亮描述信息
    */
    @SerializedName("HighLights")
    @Expose
    private HighLightItem [] HighLights;

    /**
     * Get 日志来源设备 
     * @return Source 日志来源设备
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 日志来源设备
     * @param Source 日志来源设备
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 采集路径 
     * @return Filename 采集路径
     */
    public String getFilename() {
        return this.Filename;
    }

    /**
     * Set 采集路径
     * @param Filename 采集路径
     */
    public void setFilename(String Filename) {
        this.Filename = Filename;
    }

    /**
     * Get 日志内容 
     * @return Content 日志内容
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 日志内容
     * @param Content 日志内容
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 日志包序号 
     * @return PkgId 日志包序号
     */
    public String getPkgId() {
        return this.PkgId;
    }

    /**
     * Set 日志包序号
     * @param PkgId 日志包序号
     */
    public void setPkgId(String PkgId) {
        this.PkgId = PkgId;
    }

    /**
     * Get 日志包内一条日志的序号 
     * @return PkgLogId 日志包内一条日志的序号
     */
    public Long getPkgLogId() {
        return this.PkgLogId;
    }

    /**
     * Set 日志包内一条日志的序号
     * @param PkgLogId 日志包内一条日志的序号
     */
    public void setPkgLogId(Long PkgLogId) {
        this.PkgLogId = PkgLogId;
    }

    /**
     * Get 日志时间戳 
     * @return BTime 日志时间戳
     */
    public Long getBTime() {
        return this.BTime;
    }

    /**
     * Set 日志时间戳
     * @param BTime 日志时间戳
     */
    public void setBTime(Long BTime) {
        this.BTime = BTime;
    }

    /**
     * Get 日志来源主机名称 
     * @return HostName 日志来源主机名称
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set 日志来源主机名称
     * @param HostName 日志来源主机名称
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get 原始日志(仅在日志创建索引异常时有值) 
     * @return RawLog 原始日志(仅在日志创建索引异常时有值)
     */
    public String getRawLog() {
        return this.RawLog;
    }

    /**
     * Set 原始日志(仅在日志创建索引异常时有值)
     * @param RawLog 原始日志(仅在日志创建索引异常时有值)
     */
    public void setRawLog(String RawLog) {
        this.RawLog = RawLog;
    }

    /**
     * Get 日志创建索引异常原因(仅在日志创建索引异常时有值) 
     * @return IndexStatus 日志创建索引异常原因(仅在日志创建索引异常时有值)
     */
    public String getIndexStatus() {
        return this.IndexStatus;
    }

    /**
     * Set 日志创建索引异常原因(仅在日志创建索引异常时有值)
     * @param IndexStatus 日志创建索引异常原因(仅在日志创建索引异常时有值)
     */
    public void setIndexStatus(String IndexStatus) {
        this.IndexStatus = IndexStatus;
    }

    /**
     * Get 日志内容的高亮描述信息 
     * @return HighLights 日志内容的高亮描述信息
     */
    public HighLightItem [] getHighLights() {
        return this.HighLights;
    }

    /**
     * Set 日志内容的高亮描述信息
     * @param HighLights 日志内容的高亮描述信息
     */
    public void setHighLights(HighLightItem [] HighLights) {
        this.HighLights = HighLights;
    }

    public LogContextInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogContextInfo(LogContextInfo source) {
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.Filename != null) {
            this.Filename = new String(source.Filename);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.PkgId != null) {
            this.PkgId = new String(source.PkgId);
        }
        if (source.PkgLogId != null) {
            this.PkgLogId = new Long(source.PkgLogId);
        }
        if (source.BTime != null) {
            this.BTime = new Long(source.BTime);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.RawLog != null) {
            this.RawLog = new String(source.RawLog);
        }
        if (source.IndexStatus != null) {
            this.IndexStatus = new String(source.IndexStatus);
        }
        if (source.HighLights != null) {
            this.HighLights = new HighLightItem[source.HighLights.length];
            for (int i = 0; i < source.HighLights.length; i++) {
                this.HighLights[i] = new HighLightItem(source.HighLights[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Filename", this.Filename);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "PkgId", this.PkgId);
        this.setParamSimple(map, prefix + "PkgLogId", this.PkgLogId);
        this.setParamSimple(map, prefix + "BTime", this.BTime);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "RawLog", this.RawLog);
        this.setParamSimple(map, prefix + "IndexStatus", this.IndexStatus);
        this.setParamArrayObj(map, prefix + "HighLights.", this.HighLights);

    }
}

