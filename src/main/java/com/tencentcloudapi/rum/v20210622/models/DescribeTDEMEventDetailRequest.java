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

public class DescribeTDEMEventDetailRequest extends AbstractModel {

    /**
    * <p>应用 ID（必填）</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>事件 ID（必填）</p>
    */
    @SerializedName("EventId")
    @Expose
    private String EventId;

    /**
    * <p>分区日期 YYYY-MM-DD（推荐）</p>
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
     * Get <p>应用 ID（必填）</p> 
     * @return AppId <p>应用 ID（必填）</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>应用 ID（必填）</p>
     * @param AppId <p>应用 ID（必填）</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>事件 ID（必填）</p> 
     * @return EventId <p>事件 ID（必填）</p>
     */
    public String getEventId() {
        return this.EventId;
    }

    /**
     * Set <p>事件 ID（必填）</p>
     * @param EventId <p>事件 ID（必填）</p>
     */
    public void setEventId(String EventId) {
        this.EventId = EventId;
    }

    /**
     * Get <p>分区日期 YYYY-MM-DD（推荐）</p> 
     * @return Date <p>分区日期 YYYY-MM-DD（推荐）</p>
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set <p>分区日期 YYYY-MM-DD（推荐）</p>
     * @param Date <p>分区日期 YYYY-MM-DD（推荐）</p>
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    public DescribeTDEMEventDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTDEMEventDetailRequest(DescribeTDEMEventDetailRequest source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.EventId != null) {
            this.EventId = new String(source.EventId);
        }
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "Date", this.Date);

    }
}

