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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBinlogsRequest extends AbstractModel{

    /**
    * 实例 ID，格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例 ID 相同。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 偏移量，最小值为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页大小，默认值为20，最小值为1，最大值为100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * binlog最早开始时间，时间格式：2016-03-17 02:10:37
    */
    @SerializedName("MinStartTime")
    @Expose
    private String MinStartTime;

    /**
    * binlog最晚开始时间，时间格式：2016-03-17 02:10:37
    */
    @SerializedName("MaxStartTime")
    @Expose
    private String MaxStartTime;

    /**
     * Get 实例 ID，格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例 ID 相同。 
     * @return InstanceId 实例 ID，格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例 ID 相同。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID，格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例 ID 相同。
     * @param InstanceId 实例 ID，格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例 ID 相同。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 偏移量，最小值为0。 
     * @return Offset 偏移量，最小值为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，最小值为0。
     * @param Offset 偏移量，最小值为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页大小，默认值为20，最小值为1，最大值为100。 
     * @return Limit 分页大小，默认值为20，最小值为1，最大值为100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页大小，默认值为20，最小值为1，最大值为100。
     * @param Limit 分页大小，默认值为20，最小值为1，最大值为100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get binlog最早开始时间，时间格式：2016-03-17 02:10:37 
     * @return MinStartTime binlog最早开始时间，时间格式：2016-03-17 02:10:37
     */
    public String getMinStartTime() {
        return this.MinStartTime;
    }

    /**
     * Set binlog最早开始时间，时间格式：2016-03-17 02:10:37
     * @param MinStartTime binlog最早开始时间，时间格式：2016-03-17 02:10:37
     */
    public void setMinStartTime(String MinStartTime) {
        this.MinStartTime = MinStartTime;
    }

    /**
     * Get binlog最晚开始时间，时间格式：2016-03-17 02:10:37 
     * @return MaxStartTime binlog最晚开始时间，时间格式：2016-03-17 02:10:37
     */
    public String getMaxStartTime() {
        return this.MaxStartTime;
    }

    /**
     * Set binlog最晚开始时间，时间格式：2016-03-17 02:10:37
     * @param MaxStartTime binlog最晚开始时间，时间格式：2016-03-17 02:10:37
     */
    public void setMaxStartTime(String MaxStartTime) {
        this.MaxStartTime = MaxStartTime;
    }

    public DescribeBinlogsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBinlogsRequest(DescribeBinlogsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.MinStartTime != null) {
            this.MinStartTime = new String(source.MinStartTime);
        }
        if (source.MaxStartTime != null) {
            this.MaxStartTime = new String(source.MaxStartTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "MinStartTime", this.MinStartTime);
        this.setParamSimple(map, prefix + "MaxStartTime", this.MaxStartTime);

    }
}

