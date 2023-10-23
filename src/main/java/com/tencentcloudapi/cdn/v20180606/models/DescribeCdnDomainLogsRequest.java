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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCdnDomainLogsRequest extends AbstractModel {

    /**
    * 指定域名查询
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 分页查询偏移量，默认为 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页查询限制数目，默认为 100，最大为 1000
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 指定区域下载日志，默认为 mainland，可取值有：
<li>mainland：获取境内加速日志包下载链接</li>
<li>overseas：获取境外加速日志包下载链接</li>
<li>global：同时获取境内、境外加速日志包下载链接（分开打包）</li>
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * 指定下载日志的类型，可取值有：
<li>access：访问日志</li>
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
     * Get 指定域名查询 
     * @return Domain 指定域名查询
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 指定域名查询
     * @param Domain 指定域名查询
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 开始时间 
     * @return StartTime 开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
     * @param StartTime 开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 分页查询偏移量，默认为 0 
     * @return Offset 分页查询偏移量，默认为 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页查询偏移量，默认为 0
     * @param Offset 分页查询偏移量，默认为 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页查询限制数目，默认为 100，最大为 1000 
     * @return Limit 分页查询限制数目，默认为 100，最大为 1000
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页查询限制数目，默认为 100，最大为 1000
     * @param Limit 分页查询限制数目，默认为 100，最大为 1000
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 指定区域下载日志，默认为 mainland，可取值有：
<li>mainland：获取境内加速日志包下载链接</li>
<li>overseas：获取境外加速日志包下载链接</li>
<li>global：同时获取境内、境外加速日志包下载链接（分开打包）</li> 
     * @return Area 指定区域下载日志，默认为 mainland，可取值有：
<li>mainland：获取境内加速日志包下载链接</li>
<li>overseas：获取境外加速日志包下载链接</li>
<li>global：同时获取境内、境外加速日志包下载链接（分开打包）</li>
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 指定区域下载日志，默认为 mainland，可取值有：
<li>mainland：获取境内加速日志包下载链接</li>
<li>overseas：获取境外加速日志包下载链接</li>
<li>global：同时获取境内、境外加速日志包下载链接（分开打包）</li>
     * @param Area 指定区域下载日志，默认为 mainland，可取值有：
<li>mainland：获取境内加速日志包下载链接</li>
<li>overseas：获取境外加速日志包下载链接</li>
<li>global：同时获取境内、境外加速日志包下载链接（分开打包）</li>
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get 指定下载日志的类型，可取值有：
<li>access：访问日志</li> 
     * @return LogType 指定下载日志的类型，可取值有：
<li>access：访问日志</li>
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set 指定下载日志的类型，可取值有：
<li>access：访问日志</li>
     * @param LogType 指定下载日志的类型，可取值有：
<li>access：访问日志</li>
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    public DescribeCdnDomainLogsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCdnDomainLogsRequest(DescribeCdnDomainLogsRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "LogType", this.LogType);

    }
}

