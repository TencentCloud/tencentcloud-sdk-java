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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDockerActivitiesRequest extends AbstractModel{

    /**
    * 实例ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Docker活动ID列表。
    */
    @SerializedName("ActivityIds")
    @Expose
    private String [] ActivityIds;

    /**
    * 偏移量，默认为 0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量，默认为 20，最大值为 100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 活动创建时间的起始值，时间戳秒数。
    */
    @SerializedName("CreatedTimeBegin")
    @Expose
    private Long CreatedTimeBegin;

    /**
    * 活动创建时间的结束值，时间戳秒数。
    */
    @SerializedName("CreatedTimeEnd")
    @Expose
    private Long CreatedTimeEnd;

    /**
     * Get 实例ID。 
     * @return InstanceId 实例ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID。
     * @param InstanceId 实例ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Docker活动ID列表。 
     * @return ActivityIds Docker活动ID列表。
     */
    public String [] getActivityIds() {
        return this.ActivityIds;
    }

    /**
     * Set Docker活动ID列表。
     * @param ActivityIds Docker活动ID列表。
     */
    public void setActivityIds(String [] ActivityIds) {
        this.ActivityIds = ActivityIds;
    }

    /**
     * Get 偏移量，默认为 0。 
     * @return Offset 偏移量，默认为 0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为 0。
     * @param Offset 偏移量，默认为 0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量，默认为 20，最大值为 100。 
     * @return Limit 返回数量，默认为 20，最大值为 100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为 20，最大值为 100。
     * @param Limit 返回数量，默认为 20，最大值为 100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 活动创建时间的起始值，时间戳秒数。 
     * @return CreatedTimeBegin 活动创建时间的起始值，时间戳秒数。
     */
    public Long getCreatedTimeBegin() {
        return this.CreatedTimeBegin;
    }

    /**
     * Set 活动创建时间的起始值，时间戳秒数。
     * @param CreatedTimeBegin 活动创建时间的起始值，时间戳秒数。
     */
    public void setCreatedTimeBegin(Long CreatedTimeBegin) {
        this.CreatedTimeBegin = CreatedTimeBegin;
    }

    /**
     * Get 活动创建时间的结束值，时间戳秒数。 
     * @return CreatedTimeEnd 活动创建时间的结束值，时间戳秒数。
     */
    public Long getCreatedTimeEnd() {
        return this.CreatedTimeEnd;
    }

    /**
     * Set 活动创建时间的结束值，时间戳秒数。
     * @param CreatedTimeEnd 活动创建时间的结束值，时间戳秒数。
     */
    public void setCreatedTimeEnd(Long CreatedTimeEnd) {
        this.CreatedTimeEnd = CreatedTimeEnd;
    }

    public DescribeDockerActivitiesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDockerActivitiesRequest(DescribeDockerActivitiesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ActivityIds != null) {
            this.ActivityIds = new String[source.ActivityIds.length];
            for (int i = 0; i < source.ActivityIds.length; i++) {
                this.ActivityIds[i] = new String(source.ActivityIds[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.CreatedTimeBegin != null) {
            this.CreatedTimeBegin = new Long(source.CreatedTimeBegin);
        }
        if (source.CreatedTimeEnd != null) {
            this.CreatedTimeEnd = new Long(source.CreatedTimeEnd);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "ActivityIds.", this.ActivityIds);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "CreatedTimeBegin", this.CreatedTimeBegin);
        this.setParamSimple(map, prefix + "CreatedTimeEnd", this.CreatedTimeEnd);

    }
}

