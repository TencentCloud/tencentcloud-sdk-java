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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBackupsRequest extends AbstractModel {

    /**
    * <p>实例 ID，格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例 ID 相同。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>偏移量，最小值为0。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>分页大小，默认值为20，最小值为1，最大值为1000。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>备份开始时间，筛选大于等于此值，时间格式：2016-03-17 02:10:37</p>
    */
    @SerializedName("MinStartTime")
    @Expose
    private String MinStartTime;

    /**
    * <p>备份开始时间，筛选小于等于此值，时间格式：2016-03-17 02:10:37</p>
    */
    @SerializedName("MaxStartTime")
    @Expose
    private String MaxStartTime;

    /**
     * Get <p>实例 ID，格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例 ID 相同。</p> 
     * @return InstanceId <p>实例 ID，格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例 ID 相同。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例 ID，格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例 ID 相同。</p>
     * @param InstanceId <p>实例 ID，格式如：cdb-c1nl9rpv。与云数据库控制台页面中显示的实例 ID 相同。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>偏移量，最小值为0。</p> 
     * @return Offset <p>偏移量，最小值为0。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量，最小值为0。</p>
     * @param Offset <p>偏移量，最小值为0。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>分页大小，默认值为20，最小值为1，最大值为1000。</p> 
     * @return Limit <p>分页大小，默认值为20，最小值为1，最大值为1000。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>分页大小，默认值为20，最小值为1，最大值为1000。</p>
     * @param Limit <p>分页大小，默认值为20，最小值为1，最大值为1000。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>备份开始时间，筛选大于等于此值，时间格式：2016-03-17 02:10:37</p> 
     * @return MinStartTime <p>备份开始时间，筛选大于等于此值，时间格式：2016-03-17 02:10:37</p>
     */
    public String getMinStartTime() {
        return this.MinStartTime;
    }

    /**
     * Set <p>备份开始时间，筛选大于等于此值，时间格式：2016-03-17 02:10:37</p>
     * @param MinStartTime <p>备份开始时间，筛选大于等于此值，时间格式：2016-03-17 02:10:37</p>
     */
    public void setMinStartTime(String MinStartTime) {
        this.MinStartTime = MinStartTime;
    }

    /**
     * Get <p>备份开始时间，筛选小于等于此值，时间格式：2016-03-17 02:10:37</p> 
     * @return MaxStartTime <p>备份开始时间，筛选小于等于此值，时间格式：2016-03-17 02:10:37</p>
     */
    public String getMaxStartTime() {
        return this.MaxStartTime;
    }

    /**
     * Set <p>备份开始时间，筛选小于等于此值，时间格式：2016-03-17 02:10:37</p>
     * @param MaxStartTime <p>备份开始时间，筛选小于等于此值，时间格式：2016-03-17 02:10:37</p>
     */
    public void setMaxStartTime(String MaxStartTime) {
        this.MaxStartTime = MaxStartTime;
    }

    public DescribeBackupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBackupsRequest(DescribeBackupsRequest source) {
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

