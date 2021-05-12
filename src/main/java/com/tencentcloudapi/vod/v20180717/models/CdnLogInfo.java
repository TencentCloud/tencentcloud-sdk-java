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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CdnLogInfo extends AbstractModel{

    /**
    * 日志所属日期， 格式为：yyyy-MM-dd ，如2018-03-01。
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * 日志名称，格式为：日期小时-域名
如 2018120101-test.vod2.mqcloud.com。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 日志下载链接，24小时内下载有效。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 日志起始时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 日志结束时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get 日志所属日期， 格式为：yyyy-MM-dd ，如2018-03-01。 
     * @return Date 日志所属日期， 格式为：yyyy-MM-dd ，如2018-03-01。
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set 日志所属日期， 格式为：yyyy-MM-dd ，如2018-03-01。
     * @param Date 日志所属日期， 格式为：yyyy-MM-dd ，如2018-03-01。
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get 日志名称，格式为：日期小时-域名
如 2018120101-test.vod2.mqcloud.com。 
     * @return Name 日志名称，格式为：日期小时-域名
如 2018120101-test.vod2.mqcloud.com。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 日志名称，格式为：日期小时-域名
如 2018120101-test.vod2.mqcloud.com。
     * @param Name 日志名称，格式为：日期小时-域名
如 2018120101-test.vod2.mqcloud.com。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 日志下载链接，24小时内下载有效。 
     * @return Url 日志下载链接，24小时内下载有效。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 日志下载链接，24小时内下载有效。
     * @param Url 日志下载链接，24小时内下载有效。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 日志起始时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。 
     * @return StartTime 日志起始时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 日志起始时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     * @param StartTime 日志起始时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 日志结束时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。 
     * @return EndTime 日志结束时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 日志结束时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     * @param EndTime 日志结束时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
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

