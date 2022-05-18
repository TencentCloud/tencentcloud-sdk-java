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

public class DownloadL7LogsRequest extends AbstractModel{

    /**
    * 起始时间(需严格按照RFC3339标准传参)
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间(需严格按照RFC3339标准传参)
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 每页展示条数
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 当前页
    */
    @SerializedName("PageNo")
    @Expose
    private Long PageNo;

    /**
    * 站点集合
    */
    @SerializedName("Zones")
    @Expose
    private String [] Zones;

    /**
    * 域名集合
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
     * Get 起始时间(需严格按照RFC3339标准传参) 
     * @return StartTime 起始时间(需严格按照RFC3339标准传参)
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 起始时间(需严格按照RFC3339标准传参)
     * @param StartTime 起始时间(需严格按照RFC3339标准传参)
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间(需严格按照RFC3339标准传参) 
     * @return EndTime 结束时间(需严格按照RFC3339标准传参)
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间(需严格按照RFC3339标准传参)
     * @param EndTime 结束时间(需严格按照RFC3339标准传参)
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 每页展示条数 
     * @return PageSize 每页展示条数
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页展示条数
     * @param PageSize 每页展示条数
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 当前页 
     * @return PageNo 当前页
     */
    public Long getPageNo() {
        return this.PageNo;
    }

    /**
     * Set 当前页
     * @param PageNo 当前页
     */
    public void setPageNo(Long PageNo) {
        this.PageNo = PageNo;
    }

    /**
     * Get 站点集合 
     * @return Zones 站点集合
     */
    public String [] getZones() {
        return this.Zones;
    }

    /**
     * Set 站点集合
     * @param Zones 站点集合
     */
    public void setZones(String [] Zones) {
        this.Zones = Zones;
    }

    /**
     * Get 域名集合 
     * @return Domains 域名集合
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set 域名集合
     * @param Domains 域名集合
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    public DownloadL7LogsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DownloadL7LogsRequest(DownloadL7LogsRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNo != null) {
            this.PageNo = new Long(source.PageNo);
        }
        if (source.Zones != null) {
            this.Zones = new String[source.Zones.length];
            for (int i = 0; i < source.Zones.length; i++) {
                this.Zones[i] = new String(source.Zones[i]);
            }
        }
        if (source.Domains != null) {
            this.Domains = new String[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new String(source.Domains[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNo", this.PageNo);
        this.setParamArraySimple(map, prefix + "Zones.", this.Zones);
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);

    }
}

