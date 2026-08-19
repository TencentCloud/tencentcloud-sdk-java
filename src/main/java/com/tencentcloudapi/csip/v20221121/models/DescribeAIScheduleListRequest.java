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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAIScheduleListRequest extends AbstractModel {

    /**
    * <p>分页偏移量，默认 0。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>分页大小，默认 20，最大 100。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>状态过滤。取值：0（全部）、1（已启用）、2（已停用），默认 0。</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>定时任务ID，可选，为空时则全量查询</p>
    */
    @SerializedName("ScheduleId")
    @Expose
    private String ScheduleId;

    /**
     * Get <p>分页偏移量，默认 0。</p> 
     * @return Offset <p>分页偏移量，默认 0。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页偏移量，默认 0。</p>
     * @param Offset <p>分页偏移量，默认 0。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>分页大小，默认 20，最大 100。</p> 
     * @return Limit <p>分页大小，默认 20，最大 100。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>分页大小，默认 20，最大 100。</p>
     * @param Limit <p>分页大小，默认 20，最大 100。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>状态过滤。取值：0（全部）、1（已启用）、2（已停用），默认 0。</p> 
     * @return Status <p>状态过滤。取值：0（全部）、1（已启用）、2（已停用），默认 0。</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态过滤。取值：0（全部）、1（已启用）、2（已停用），默认 0。</p>
     * @param Status <p>状态过滤。取值：0（全部）、1（已启用）、2（已停用），默认 0。</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>定时任务ID，可选，为空时则全量查询</p> 
     * @return ScheduleId <p>定时任务ID，可选，为空时则全量查询</p>
     */
    public String getScheduleId() {
        return this.ScheduleId;
    }

    /**
     * Set <p>定时任务ID，可选，为空时则全量查询</p>
     * @param ScheduleId <p>定时任务ID，可选，为空时则全量查询</p>
     */
    public void setScheduleId(String ScheduleId) {
        this.ScheduleId = ScheduleId;
    }

    public DescribeAIScheduleListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAIScheduleListRequest(DescribeAIScheduleListRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ScheduleId != null) {
            this.ScheduleId = new String(source.ScheduleId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ScheduleId", this.ScheduleId);

    }
}

