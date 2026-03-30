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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLogInstanceListRequest extends AbstractModel {

    /**
    * <p>日志类型：auditLog,slowLog,errorLog</p>
    */
    @SerializedName("LogType")
    @Expose
    private String LogType;

    /**
    * <p>单页条数限制，取值[0, 100)</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>偏移量，大于0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>业务侧实例过滤参数</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * <p>日志开关,不传查询所有日志实例： on-开启，off-未开启。</p>
    */
    @SerializedName("LogSwitch")
    @Expose
    private String LogSwitch;

    /**
     * Get <p>日志类型：auditLog,slowLog,errorLog</p> 
     * @return LogType <p>日志类型：auditLog,slowLog,errorLog</p>
     */
    public String getLogType() {
        return this.LogType;
    }

    /**
     * Set <p>日志类型：auditLog,slowLog,errorLog</p>
     * @param LogType <p>日志类型：auditLog,slowLog,errorLog</p>
     */
    public void setLogType(String LogType) {
        this.LogType = LogType;
    }

    /**
     * Get <p>单页条数限制，取值[0, 100)</p> 
     * @return Limit <p>单页条数限制，取值[0, 100)</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>单页条数限制，取值[0, 100)</p>
     * @param Limit <p>单页条数限制，取值[0, 100)</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>偏移量，大于0</p> 
     * @return Offset <p>偏移量，大于0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量，大于0</p>
     * @param Offset <p>偏移量，大于0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>业务侧实例过滤参数</p> 
     * @return Filters <p>业务侧实例过滤参数</p>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>业务侧实例过滤参数</p>
     * @param Filters <p>业务侧实例过滤参数</p>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>日志开关,不传查询所有日志实例： on-开启，off-未开启。</p> 
     * @return LogSwitch <p>日志开关,不传查询所有日志实例： on-开启，off-未开启。</p>
     */
    public String getLogSwitch() {
        return this.LogSwitch;
    }

    /**
     * Set <p>日志开关,不传查询所有日志实例： on-开启，off-未开启。</p>
     * @param LogSwitch <p>日志开关,不传查询所有日志实例： on-开启，off-未开启。</p>
     */
    public void setLogSwitch(String LogSwitch) {
        this.LogSwitch = LogSwitch;
    }

    public DescribeLogInstanceListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLogInstanceListRequest(DescribeLogInstanceListRequest source) {
        if (source.LogType != null) {
            this.LogType = new String(source.LogType);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.LogSwitch != null) {
            this.LogSwitch = new String(source.LogSwitch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "LogSwitch", this.LogSwitch);

    }
}

