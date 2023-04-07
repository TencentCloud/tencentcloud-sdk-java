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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSchedulesRequest extends AbstractModel{

    /**
    * 编排 ID 过滤条件，数组长度限制：100。
    */
    @SerializedName("ScheduleIds")
    @Expose
    private Long [] ScheduleIds;

    /**
    * 编排触发类型，可选值：
<li>CosFileUpload： 腾讯云 COS 文件上传触发</li>
<li>AwsS3FileUpload：Aws S3 文件上传触发。</li>
不填或者为空表示全部。
    */
    @SerializedName("TriggerType")
    @Expose
    private String TriggerType;

    /**
    * 状态，取值范围：
<li>Enabled：已启用，</li>
<li>Disabled：已禁用。</li>
不填此参数，则不区编排状态。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 分页偏移量，默认值：0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回记录条数，默认值：10，最大值：100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 编排 ID 过滤条件，数组长度限制：100。 
     * @return ScheduleIds 编排 ID 过滤条件，数组长度限制：100。
     */
    public Long [] getScheduleIds() {
        return this.ScheduleIds;
    }

    /**
     * Set 编排 ID 过滤条件，数组长度限制：100。
     * @param ScheduleIds 编排 ID 过滤条件，数组长度限制：100。
     */
    public void setScheduleIds(Long [] ScheduleIds) {
        this.ScheduleIds = ScheduleIds;
    }

    /**
     * Get 编排触发类型，可选值：
<li>CosFileUpload： 腾讯云 COS 文件上传触发</li>
<li>AwsS3FileUpload：Aws S3 文件上传触发。</li>
不填或者为空表示全部。 
     * @return TriggerType 编排触发类型，可选值：
<li>CosFileUpload： 腾讯云 COS 文件上传触发</li>
<li>AwsS3FileUpload：Aws S3 文件上传触发。</li>
不填或者为空表示全部。
     */
    public String getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set 编排触发类型，可选值：
<li>CosFileUpload： 腾讯云 COS 文件上传触发</li>
<li>AwsS3FileUpload：Aws S3 文件上传触发。</li>
不填或者为空表示全部。
     * @param TriggerType 编排触发类型，可选值：
<li>CosFileUpload： 腾讯云 COS 文件上传触发</li>
<li>AwsS3FileUpload：Aws S3 文件上传触发。</li>
不填或者为空表示全部。
     */
    public void setTriggerType(String TriggerType) {
        this.TriggerType = TriggerType;
    }

    /**
     * Get 状态，取值范围：
<li>Enabled：已启用，</li>
<li>Disabled：已禁用。</li>
不填此参数，则不区编排状态。 
     * @return Status 状态，取值范围：
<li>Enabled：已启用，</li>
<li>Disabled：已禁用。</li>
不填此参数，则不区编排状态。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态，取值范围：
<li>Enabled：已启用，</li>
<li>Disabled：已禁用。</li>
不填此参数，则不区编排状态。
     * @param Status 状态，取值范围：
<li>Enabled：已启用，</li>
<li>Disabled：已禁用。</li>
不填此参数，则不区编排状态。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 分页偏移量，默认值：0。 
     * @return Offset 分页偏移量，默认值：0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量，默认值：0。
     * @param Offset 分页偏移量，默认值：0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回记录条数，默认值：10，最大值：100。 
     * @return Limit 返回记录条数，默认值：10，最大值：100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回记录条数，默认值：10，最大值：100。
     * @param Limit 返回记录条数，默认值：10，最大值：100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeSchedulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSchedulesRequest(DescribeSchedulesRequest source) {
        if (source.ScheduleIds != null) {
            this.ScheduleIds = new Long[source.ScheduleIds.length];
            for (int i = 0; i < source.ScheduleIds.length; i++) {
                this.ScheduleIds[i] = new Long(source.ScheduleIds[i]);
            }
        }
        if (source.TriggerType != null) {
            this.TriggerType = new String(source.TriggerType);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ScheduleIds.", this.ScheduleIds);
        this.setParamSimple(map, prefix + "TriggerType", this.TriggerType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

