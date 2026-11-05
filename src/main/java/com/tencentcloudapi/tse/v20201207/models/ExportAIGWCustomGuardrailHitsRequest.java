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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExportAIGWCustomGuardrailHitsRequest extends AbstractModel {

    /**
    * <p>网关实例 ID</p>
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * <p>导出起始时间，Unix 秒级时间戳</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>导出结束时间，Unix 秒级时间戳</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>审核记录过滤条件</p>
    */
    @SerializedName("Filters")
    @Expose
    private CustomGuardrailHitFilter [] Filters;

    /**
    * <p>导出格式：csv 或 json；默认 csv</p>
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
     * Get <p>网关实例 ID</p> 
     * @return GatewayId <p>网关实例 ID</p>
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set <p>网关实例 ID</p>
     * @param GatewayId <p>网关实例 ID</p>
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get <p>导出起始时间，Unix 秒级时间戳</p> 
     * @return StartTime <p>导出起始时间，Unix 秒级时间戳</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>导出起始时间，Unix 秒级时间戳</p>
     * @param StartTime <p>导出起始时间，Unix 秒级时间戳</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>导出结束时间，Unix 秒级时间戳</p> 
     * @return EndTime <p>导出结束时间，Unix 秒级时间戳</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>导出结束时间，Unix 秒级时间戳</p>
     * @param EndTime <p>导出结束时间，Unix 秒级时间戳</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>审核记录过滤条件</p> 
     * @return Filters <p>审核记录过滤条件</p>
     */
    public CustomGuardrailHitFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>审核记录过滤条件</p>
     * @param Filters <p>审核记录过滤条件</p>
     */
    public void setFilters(CustomGuardrailHitFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>导出格式：csv 或 json；默认 csv</p> 
     * @return Format <p>导出格式：csv 或 json；默认 csv</p>
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set <p>导出格式：csv 或 json；默认 csv</p>
     * @param Format <p>导出格式：csv 或 json；默认 csv</p>
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    public ExportAIGWCustomGuardrailHitsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportAIGWCustomGuardrailHitsRequest(ExportAIGWCustomGuardrailHitsRequest source) {
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Filters != null) {
            this.Filters = new CustomGuardrailHitFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new CustomGuardrailHitFilter(source.Filters[i]);
            }
        }
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Format", this.Format);

    }
}

