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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CdnLogInfo extends AbstractModel {

    /**
    * <p>日志所属日期， 格式为：yyyy-MM-dd ，如2018-03-01。</p>
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * <p>日志名称，格式为：日期小时-域名<br>如 example.com。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>日志下载链接，24小时内下载有效。</p>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * <p>日志起始时间，使用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>日志结束时间，使用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get <p>日志所属日期， 格式为：yyyy-MM-dd ，如2018-03-01。</p> 
     * @return Date <p>日志所属日期， 格式为：yyyy-MM-dd ，如2018-03-01。</p>
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set <p>日志所属日期， 格式为：yyyy-MM-dd ，如2018-03-01。</p>
     * @param Date <p>日志所属日期， 格式为：yyyy-MM-dd ，如2018-03-01。</p>
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get <p>日志名称，格式为：日期小时-域名<br>如 example.com。</p> 
     * @return Name <p>日志名称，格式为：日期小时-域名<br>如 example.com。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>日志名称，格式为：日期小时-域名<br>如 example.com。</p>
     * @param Name <p>日志名称，格式为：日期小时-域名<br>如 example.com。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>日志下载链接，24小时内下载有效。</p> 
     * @return Url <p>日志下载链接，24小时内下载有效。</p>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>日志下载链接，24小时内下载有效。</p>
     * @param Url <p>日志下载链接，24小时内下载有效。</p>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get <p>日志起始时间，使用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p> 
     * @return StartTime <p>日志起始时间，使用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>日志起始时间，使用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p>
     * @param StartTime <p>日志起始时间，使用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>日志结束时间，使用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p> 
     * @return EndTime <p>日志结束时间，使用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>日志结束时间，使用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p>
     * @param EndTime <p>日志结束时间，使用 <a href="https://cloud.tencent.com/document/product/266/11732#I">ISO 日期格式</a>。</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public CdnLogInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CdnLogInfo(CdnLogInfo source) {
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

