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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Url", this.Url);

    }
}

