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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTelCdrRequest extends AbstractModel {

    /**
    * <p>起始时间戳，Unix 秒级时间戳，最大支持近180天。</p>
    */
    @SerializedName("StartTimeStamp")
    @Expose
    private Long StartTimeStamp;

    /**
    * <p>结束时间戳，Unix 秒级时间戳，结束时间与开始时间的区间范围小于90天。</p>
    */
    @SerializedName("EndTimeStamp")
    @Expose
    private Long EndTimeStamp;

    /**
    * <p>应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc</p>
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * <p>分页尺寸（必填），上限 100</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>分页页码（必填），从 0 开始</p>
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * <p>实例 ID（废弃）</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private Long InstanceId;

    /**
    * <p>返回数据条数，上限（废弃）</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>偏移（废弃）</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>按手机号筛选</p>
    */
    @SerializedName("Phones")
    @Expose
    private String [] Phones;

    /**
    * <p>按SessionId筛选</p>
    */
    @SerializedName("SessionIds")
    @Expose
    private String [] SessionIds;

    /**
     * Get <p>起始时间戳，Unix 秒级时间戳，最大支持近180天。</p> 
     * @return StartTimeStamp <p>起始时间戳，Unix 秒级时间戳，最大支持近180天。</p>
     */
    public Long getStartTimeStamp() {
        return this.StartTimeStamp;
    }

    /**
     * Set <p>起始时间戳，Unix 秒级时间戳，最大支持近180天。</p>
     * @param StartTimeStamp <p>起始时间戳，Unix 秒级时间戳，最大支持近180天。</p>
     */
    public void setStartTimeStamp(Long StartTimeStamp) {
        this.StartTimeStamp = StartTimeStamp;
    }

    /**
     * Get <p>结束时间戳，Unix 秒级时间戳，结束时间与开始时间的区间范围小于90天。</p> 
     * @return EndTimeStamp <p>结束时间戳，Unix 秒级时间戳，结束时间与开始时间的区间范围小于90天。</p>
     */
    public Long getEndTimeStamp() {
        return this.EndTimeStamp;
    }

    /**
     * Set <p>结束时间戳，Unix 秒级时间戳，结束时间与开始时间的区间范围小于90天。</p>
     * @param EndTimeStamp <p>结束时间戳，Unix 秒级时间戳，结束时间与开始时间的区间范围小于90天。</p>
     */
    public void setEndTimeStamp(Long EndTimeStamp) {
        this.EndTimeStamp = EndTimeStamp;
    }

    /**
     * Get <p>应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc</p> 
     * @return SdkAppId <p>应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc</p>
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set <p>应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc</p>
     * @param SdkAppId <p>应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc</p>
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get <p>分页尺寸（必填），上限 100</p> 
     * @return PageSize <p>分页尺寸（必填），上限 100</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>分页尺寸（必填），上限 100</p>
     * @param PageSize <p>分页尺寸（必填），上限 100</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>分页页码（必填），从 0 开始</p> 
     * @return PageNumber <p>分页页码（必填），从 0 开始</p>
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set <p>分页页码（必填），从 0 开始</p>
     * @param PageNumber <p>分页页码（必填），从 0 开始</p>
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get <p>实例 ID（废弃）</p> 
     * @return InstanceId <p>实例 ID（废弃）</p>
     * @deprecated
     */
    @Deprecated
    public Long getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例 ID（废弃）</p>
     * @param InstanceId <p>实例 ID（废弃）</p>
     * @deprecated
     */
    @Deprecated
    public void setInstanceId(Long InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>返回数据条数，上限（废弃）</p> 
     * @return Limit <p>返回数据条数，上限（废弃）</p>
     * @deprecated
     */
    @Deprecated
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>返回数据条数，上限（废弃）</p>
     * @param Limit <p>返回数据条数，上限（废弃）</p>
     * @deprecated
     */
    @Deprecated
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>偏移（废弃）</p> 
     * @return Offset <p>偏移（废弃）</p>
     * @deprecated
     */
    @Deprecated
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移（废弃）</p>
     * @param Offset <p>偏移（废弃）</p>
     * @deprecated
     */
    @Deprecated
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>按手机号筛选</p> 
     * @return Phones <p>按手机号筛选</p>
     */
    public String [] getPhones() {
        return this.Phones;
    }

    /**
     * Set <p>按手机号筛选</p>
     * @param Phones <p>按手机号筛选</p>
     */
    public void setPhones(String [] Phones) {
        this.Phones = Phones;
    }

    /**
     * Get <p>按SessionId筛选</p> 
     * @return SessionIds <p>按SessionId筛选</p>
     */
    public String [] getSessionIds() {
        return this.SessionIds;
    }

    /**
     * Set <p>按SessionId筛选</p>
     * @param SessionIds <p>按SessionId筛选</p>
     */
    public void setSessionIds(String [] SessionIds) {
        this.SessionIds = SessionIds;
    }

    public DescribeTelCdrRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTelCdrRequest(DescribeTelCdrRequest source) {
        if (source.StartTimeStamp != null) {
            this.StartTimeStamp = new Long(source.StartTimeStamp);
        }
        if (source.EndTimeStamp != null) {
            this.EndTimeStamp = new Long(source.EndTimeStamp);
        }
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new Long(source.InstanceId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Phones != null) {
            this.Phones = new String[source.Phones.length];
            for (int i = 0; i < source.Phones.length; i++) {
                this.Phones[i] = new String(source.Phones[i]);
            }
        }
        if (source.SessionIds != null) {
            this.SessionIds = new String[source.SessionIds.length];
            for (int i = 0; i < source.SessionIds.length; i++) {
                this.SessionIds[i] = new String(source.SessionIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTimeStamp", this.StartTimeStamp);
        this.setParamSimple(map, prefix + "EndTimeStamp", this.EndTimeStamp);
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArraySimple(map, prefix + "Phones.", this.Phones);
        this.setParamArraySimple(map, prefix + "SessionIds.", this.SessionIds);

    }
}

