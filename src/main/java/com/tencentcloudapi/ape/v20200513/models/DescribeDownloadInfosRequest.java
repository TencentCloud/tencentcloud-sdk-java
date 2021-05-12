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
package com.tencentcloudapi.ape.v20200513.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDownloadInfosRequest extends AbstractModel{

    /**
    * 默认10
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 默认0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 开始时间晚于指定时间
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * 结束时间早于指定时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 无效值，过滤结果为空
    */
    @SerializedName("ImageIds")
    @Expose
    private Long [] ImageIds;

    /**
     * Get 默认10 
     * @return Limit 默认10
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 默认10
     * @param Limit 默认10
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 默认0 
     * @return Offset 默认0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 默认0
     * @param Offset 默认0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 开始时间晚于指定时间 
     * @return BeginTime 开始时间晚于指定时间
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set 开始时间晚于指定时间
     * @param BeginTime 开始时间晚于指定时间
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get 结束时间早于指定时间 
     * @return EndTime 结束时间早于指定时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间早于指定时间
     * @param EndTime 结束时间早于指定时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 无效值，过滤结果为空 
     * @return ImageIds 无效值，过滤结果为空
     */
    public Long [] getImageIds() {
        return this.ImageIds;
    }

    /**
     * Set 无效值，过滤结果为空
     * @param ImageIds 无效值，过滤结果为空
     */
    public void setImageIds(Long [] ImageIds) {
        this.ImageIds = ImageIds;
    }

    public DescribeDownloadInfosRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDownloadInfosRequest(DescribeDownloadInfosRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.ImageIds != null) {
            this.ImageIds = new Long[source.ImageIds.length];
            for (int i = 0; i < source.ImageIds.length; i++) {
                this.ImageIds[i] = new Long(source.ImageIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "ImageIds.", this.ImageIds);

    }
}

