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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTDEMUsageDetailRequest extends AbstractModel {

    /**
    * <p>开始时间，YYYY-MM-DD HH:00:00（小时对齐，必填）</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>结束时间，YYYY-MM-DD HH:00:00（小时对齐，必填）</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>可选关键字，匹配业务系统名称、应用名称或应用 ID</p>
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * <p>分页偏移，默认 0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>每页数量，默认 20，上限 100</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>演示模式开关</p>
    */
    @SerializedName("DemoMode")
    @Expose
    private Boolean DemoMode;

    /**
     * Get <p>开始时间，YYYY-MM-DD HH:00:00（小时对齐，必填）</p> 
     * @return StartTime <p>开始时间，YYYY-MM-DD HH:00:00（小时对齐，必填）</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始时间，YYYY-MM-DD HH:00:00（小时对齐，必填）</p>
     * @param StartTime <p>开始时间，YYYY-MM-DD HH:00:00（小时对齐，必填）</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>结束时间，YYYY-MM-DD HH:00:00（小时对齐，必填）</p> 
     * @return EndTime <p>结束时间，YYYY-MM-DD HH:00:00（小时对齐，必填）</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间，YYYY-MM-DD HH:00:00（小时对齐，必填）</p>
     * @param EndTime <p>结束时间，YYYY-MM-DD HH:00:00（小时对齐，必填）</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>可选关键字，匹配业务系统名称、应用名称或应用 ID</p> 
     * @return Keyword <p>可选关键字，匹配业务系统名称、应用名称或应用 ID</p>
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set <p>可选关键字，匹配业务系统名称、应用名称或应用 ID</p>
     * @param Keyword <p>可选关键字，匹配业务系统名称、应用名称或应用 ID</p>
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get <p>分页偏移，默认 0</p> 
     * @return Offset <p>分页偏移，默认 0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页偏移，默认 0</p>
     * @param Offset <p>分页偏移，默认 0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>每页数量，默认 20，上限 100</p> 
     * @return Limit <p>每页数量，默认 20，上限 100</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>每页数量，默认 20，上限 100</p>
     * @param Limit <p>每页数量，默认 20，上限 100</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>演示模式开关</p> 
     * @return DemoMode <p>演示模式开关</p>
     */
    public Boolean getDemoMode() {
        return this.DemoMode;
    }

    /**
     * Set <p>演示模式开关</p>
     * @param DemoMode <p>演示模式开关</p>
     */
    public void setDemoMode(Boolean DemoMode) {
        this.DemoMode = DemoMode;
    }

    public DescribeTDEMUsageDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTDEMUsageDetailRequest(DescribeTDEMUsageDetailRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.DemoMode != null) {
            this.DemoMode = new Boolean(source.DemoMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "DemoMode", this.DemoMode);

    }
}

