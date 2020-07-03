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

public class DescribeErrorLogDataRequest extends AbstractModel{

    /**
    * 实例 ID 。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 开始时间戳。
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 结束时间戳。
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 要匹配的关键字列表，最多支持15个关键字。
    */
    @SerializedName("KeyWords")
    @Expose
    private String [] KeyWords;

    /**
    * 分页的返回数量，最大为400。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get 实例 ID 。 
     * @return InstanceId 实例 ID 。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID 。
     * @param InstanceId 实例 ID 。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 开始时间戳。 
     * @return StartTime 开始时间戳。
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间戳。
     * @param StartTime 开始时间戳。
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间戳。 
     * @return EndTime 结束时间戳。
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间戳。
     * @param EndTime 结束时间戳。
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 要匹配的关键字列表，最多支持15个关键字。 
     * @return KeyWords 要匹配的关键字列表，最多支持15个关键字。
     */
    public String [] getKeyWords() {
        return this.KeyWords;
    }

    /**
     * Set 要匹配的关键字列表，最多支持15个关键字。
     * @param KeyWords 要匹配的关键字列表，最多支持15个关键字。
     */
    public void setKeyWords(String [] KeyWords) {
        this.KeyWords = KeyWords;
    }

    /**
     * Get 分页的返回数量，最大为400。 
     * @return Limit 分页的返回数量，最大为400。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页的返回数量，最大为400。
     * @param Limit 分页的返回数量，最大为400。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量，默认为0。 
     * @return Offset 偏移量，默认为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0。
     * @param Offset 偏移量，默认为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "KeyWords.", this.KeyWords);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

