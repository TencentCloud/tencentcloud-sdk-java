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

public class DescribeMiniProgramReplayPacksRequest extends AbstractModel {

    /**
    * <p>应用id</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>状态过滤（compiling/ready/failed，可选）</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>返回条数（默认20，最大100）</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>分页游标（可选）</p>
    */
    @SerializedName("Cursor")
    @Expose
    private String Cursor;

    /**
     * Get <p>应用id</p> 
     * @return AppId <p>应用id</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>应用id</p>
     * @param AppId <p>应用id</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>状态过滤（compiling/ready/failed，可选）</p> 
     * @return Status <p>状态过滤（compiling/ready/failed，可选）</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态过滤（compiling/ready/failed，可选）</p>
     * @param Status <p>状态过滤（compiling/ready/failed，可选）</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>返回条数（默认20，最大100）</p> 
     * @return Limit <p>返回条数（默认20，最大100）</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>返回条数（默认20，最大100）</p>
     * @param Limit <p>返回条数（默认20，最大100）</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>分页游标（可选）</p> 
     * @return Cursor <p>分页游标（可选）</p>
     */
    public String getCursor() {
        return this.Cursor;
    }

    /**
     * Set <p>分页游标（可选）</p>
     * @param Cursor <p>分页游标（可选）</p>
     */
    public void setCursor(String Cursor) {
        this.Cursor = Cursor;
    }

    public DescribeMiniProgramReplayPacksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMiniProgramReplayPacksRequest(DescribeMiniProgramReplayPacksRequest source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Cursor != null) {
            this.Cursor = new String(source.Cursor);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Cursor", this.Cursor);

    }
}

