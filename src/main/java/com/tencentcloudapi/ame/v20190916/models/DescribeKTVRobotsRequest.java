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
package com.tencentcloudapi.ame.v20190916.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeKTVRobotsRequest extends AbstractModel{

    /**
    * 机器人Id列表。
    */
    @SerializedName("RobotIds")
    @Expose
    private String [] RobotIds;

    /**
    * 机器人状态，取值有：
<li>Play：播放</li>
<li>Pause：暂停</li>
<li>Destroy：销毁</li>
    */
    @SerializedName("Statuses")
    @Expose
    private String [] Statuses;

    /**
    * 匹配创建时间在此时间段内的机器人。
<li>包含所指定的头尾时间点。</li>
    */
    @SerializedName("CreateTime")
    @Expose
    private TimeRange CreateTime;

    /**
    * 分页返回的起始偏移量，默认值：0。将返回第 Offset 到第 Offset+Limit-1 条。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页返回的起始偏移量，默认值：10。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 机器人Id列表。 
     * @return RobotIds 机器人Id列表。
     */
    public String [] getRobotIds() {
        return this.RobotIds;
    }

    /**
     * Set 机器人Id列表。
     * @param RobotIds 机器人Id列表。
     */
    public void setRobotIds(String [] RobotIds) {
        this.RobotIds = RobotIds;
    }

    /**
     * Get 机器人状态，取值有：
<li>Play：播放</li>
<li>Pause：暂停</li>
<li>Destroy：销毁</li> 
     * @return Statuses 机器人状态，取值有：
<li>Play：播放</li>
<li>Pause：暂停</li>
<li>Destroy：销毁</li>
     */
    public String [] getStatuses() {
        return this.Statuses;
    }

    /**
     * Set 机器人状态，取值有：
<li>Play：播放</li>
<li>Pause：暂停</li>
<li>Destroy：销毁</li>
     * @param Statuses 机器人状态，取值有：
<li>Play：播放</li>
<li>Pause：暂停</li>
<li>Destroy：销毁</li>
     */
    public void setStatuses(String [] Statuses) {
        this.Statuses = Statuses;
    }

    /**
     * Get 匹配创建时间在此时间段内的机器人。
<li>包含所指定的头尾时间点。</li> 
     * @return CreateTime 匹配创建时间在此时间段内的机器人。
<li>包含所指定的头尾时间点。</li>
     */
    public TimeRange getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 匹配创建时间在此时间段内的机器人。
<li>包含所指定的头尾时间点。</li>
     * @param CreateTime 匹配创建时间在此时间段内的机器人。
<li>包含所指定的头尾时间点。</li>
     */
    public void setCreateTime(TimeRange CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 分页返回的起始偏移量，默认值：0。将返回第 Offset 到第 Offset+Limit-1 条。 
     * @return Offset 分页返回的起始偏移量，默认值：0。将返回第 Offset 到第 Offset+Limit-1 条。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页返回的起始偏移量，默认值：0。将返回第 Offset 到第 Offset+Limit-1 条。
     * @param Offset 分页返回的起始偏移量，默认值：0。将返回第 Offset 到第 Offset+Limit-1 条。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页返回的起始偏移量，默认值：10。 
     * @return Limit 分页返回的起始偏移量，默认值：10。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页返回的起始偏移量，默认值：10。
     * @param Limit 分页返回的起始偏移量，默认值：10。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeKTVRobotsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeKTVRobotsRequest(DescribeKTVRobotsRequest source) {
        if (source.RobotIds != null) {
            this.RobotIds = new String[source.RobotIds.length];
            for (int i = 0; i < source.RobotIds.length; i++) {
                this.RobotIds[i] = new String(source.RobotIds[i]);
            }
        }
        if (source.Statuses != null) {
            this.Statuses = new String[source.Statuses.length];
            for (int i = 0; i < source.Statuses.length; i++) {
                this.Statuses[i] = new String(source.Statuses[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new TimeRange(source.CreateTime);
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
        this.setParamArraySimple(map, prefix + "RobotIds.", this.RobotIds);
        this.setParamArraySimple(map, prefix + "Statuses.", this.Statuses);
        this.setParamObj(map, prefix + "CreateTime.", this.CreateTime);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

