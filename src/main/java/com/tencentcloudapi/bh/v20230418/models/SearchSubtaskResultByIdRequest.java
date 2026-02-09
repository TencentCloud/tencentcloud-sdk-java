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
package com.tencentcloudapi.bh.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchSubtaskResultByIdRequest extends AbstractModel {

    /**
    * 运维任务名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 查询偏移
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页的页内记录数，默认为20，最大200
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 运维父任务执行日志ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 运维父任务执行状态。1 - 执行中，2 - 成功，3 - 失败，4 - 超时
    */
    @SerializedName("Status")
    @Expose
    private Long [] Status;

    /**
     * Get 运维任务名称 
     * @return Name 运维任务名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 运维任务名称
     * @param Name 运维任务名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 查询偏移 
     * @return Offset 查询偏移
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 查询偏移
     * @param Offset 查询偏移
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页的页内记录数，默认为20，最大200 
     * @return Limit 分页的页内记录数，默认为20，最大200
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页的页内记录数，默认为20，最大200
     * @param Limit 分页的页内记录数，默认为20，最大200
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 运维父任务执行日志ID 
     * @return Id 运维父任务执行日志ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 运维父任务执行日志ID
     * @param Id 运维父任务执行日志ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 运维父任务执行状态。1 - 执行中，2 - 成功，3 - 失败，4 - 超时 
     * @return Status 运维父任务执行状态。1 - 执行中，2 - 成功，3 - 失败，4 - 超时
     */
    public Long [] getStatus() {
        return this.Status;
    }

    /**
     * Set 运维父任务执行状态。1 - 执行中，2 - 成功，3 - 失败，4 - 超时
     * @param Status 运维父任务执行状态。1 - 执行中，2 - 成功，3 - 失败，4 - 超时
     */
    public void setStatus(Long [] Status) {
        this.Status = Status;
    }

    public SearchSubtaskResultByIdRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchSubtaskResultByIdRequest(SearchSubtaskResultByIdRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Status != null) {
            this.Status = new Long[source.Status.length];
            for (int i = 0; i < source.Status.length; i++) {
                this.Status[i] = new Long(source.Status[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamArraySimple(map, prefix + "Status.", this.Status);

    }
}

