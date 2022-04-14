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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTelCdrRequest extends AbstractModel{

    /**
    * 起始时间戳，Unix 秒级时间戳
    */
    @SerializedName("StartTimeStamp")
    @Expose
    private Long StartTimeStamp;

    /**
    * 结束时间戳，Unix 秒级时间戳
    */
    @SerializedName("EndTimeStamp")
    @Expose
    private Long EndTimeStamp;

    /**
    * 实例 ID（废弃）
    */
    @SerializedName("InstanceId")
    @Expose
    private Long InstanceId;

    /**
    * 返回数据条数，上限（废弃）
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移（废弃）
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 分页尺寸（必填），上限 100
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 分页页码（必填），从 0 开始
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 按手机号筛选
    */
    @SerializedName("Phones")
    @Expose
    private String [] Phones;

    /**
    * 按SessionId筛选
    */
    @SerializedName("SessionIds")
    @Expose
    private String [] SessionIds;

    /**
     * Get 起始时间戳，Unix 秒级时间戳 
     * @return StartTimeStamp 起始时间戳，Unix 秒级时间戳
     */
    public Long getStartTimeStamp() {
        return this.StartTimeStamp;
    }

    /**
     * Set 起始时间戳，Unix 秒级时间戳
     * @param StartTimeStamp 起始时间戳，Unix 秒级时间戳
     */
    public void setStartTimeStamp(Long StartTimeStamp) {
        this.StartTimeStamp = StartTimeStamp;
    }

    /**
     * Get 结束时间戳，Unix 秒级时间戳 
     * @return EndTimeStamp 结束时间戳，Unix 秒级时间戳
     */
    public Long getEndTimeStamp() {
        return this.EndTimeStamp;
    }

    /**
     * Set 结束时间戳，Unix 秒级时间戳
     * @param EndTimeStamp 结束时间戳，Unix 秒级时间戳
     */
    public void setEndTimeStamp(Long EndTimeStamp) {
        this.EndTimeStamp = EndTimeStamp;
    }

    /**
     * Get 实例 ID（废弃） 
     * @return InstanceId 实例 ID（废弃）
     */
    public Long getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID（废弃）
     * @param InstanceId 实例 ID（废弃）
     */
    public void setInstanceId(Long InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 返回数据条数，上限（废弃） 
     * @return Limit 返回数据条数，上限（废弃）
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数据条数，上限（废弃）
     * @param Limit 返回数据条数，上限（废弃）
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移（废弃） 
     * @return Offset 偏移（废弃）
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移（废弃）
     * @param Offset 偏移（废弃）
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc 
     * @return SdkAppId 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc
     * @param SdkAppId 应用 ID（必填），可以查看 https://console.cloud.tencent.com/ccc
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 分页尺寸（必填），上限 100 
     * @return PageSize 分页尺寸（必填），上限 100
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 分页尺寸（必填），上限 100
     * @param PageSize 分页尺寸（必填），上限 100
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 分页页码（必填），从 0 开始 
     * @return PageNumber 分页页码（必填），从 0 开始
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 分页页码（必填），从 0 开始
     * @param PageNumber 分页页码（必填），从 0 开始
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 按手机号筛选 
     * @return Phones 按手机号筛选
     */
    public String [] getPhones() {
        return this.Phones;
    }

    /**
     * Set 按手机号筛选
     * @param Phones 按手机号筛选
     */
    public void setPhones(String [] Phones) {
        this.Phones = Phones;
    }

    /**
     * Get 按SessionId筛选 
     * @return SessionIds 按SessionId筛选
     */
    public String [] getSessionIds() {
        return this.SessionIds;
    }

    /**
     * Set 按SessionId筛选
     * @param SessionIds 按SessionId筛选
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
        if (source.InstanceId != null) {
            this.InstanceId = new Long(source.InstanceId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
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
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamArraySimple(map, prefix + "Phones.", this.Phones);
        this.setParamArraySimple(map, prefix + "SessionIds.", this.SessionIds);

    }
}

