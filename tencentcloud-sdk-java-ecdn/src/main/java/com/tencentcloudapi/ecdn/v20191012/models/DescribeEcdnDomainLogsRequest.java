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
package com.tencentcloudapi.ecdn.v20191012.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEcdnDomainLogsRequest extends AbstractModel{

    /**
    * 待查询域名。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 日志起始时间。如：2019-10-01 00:00:00
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 日志结束时间，只支持最近30天内日志查询。2019-10-02 00:00:00
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 日志链接列表分页起始地址，默认0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 日志链接列表分页记录条数，默认100，最大1000。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 待查询域名。 
     * @return Domain 待查询域名。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 待查询域名。
     * @param Domain 待查询域名。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 日志起始时间。如：2019-10-01 00:00:00 
     * @return StartTime 日志起始时间。如：2019-10-01 00:00:00
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 日志起始时间。如：2019-10-01 00:00:00
     * @param StartTime 日志起始时间。如：2019-10-01 00:00:00
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 日志结束时间，只支持最近30天内日志查询。2019-10-02 00:00:00 
     * @return EndTime 日志结束时间，只支持最近30天内日志查询。2019-10-02 00:00:00
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 日志结束时间，只支持最近30天内日志查询。2019-10-02 00:00:00
     * @param EndTime 日志结束时间，只支持最近30天内日志查询。2019-10-02 00:00:00
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 日志链接列表分页起始地址，默认0。 
     * @return Offset 日志链接列表分页起始地址，默认0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 日志链接列表分页起始地址，默认0。
     * @param Offset 日志链接列表分页起始地址，默认0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 日志链接列表分页记录条数，默认100，最大1000。 
     * @return Limit 日志链接列表分页记录条数，默认100，最大1000。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 日志链接列表分页记录条数，默认100，最大1000。
     * @param Limit 日志链接列表分页记录条数，默认100，最大1000。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
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

    }
}

