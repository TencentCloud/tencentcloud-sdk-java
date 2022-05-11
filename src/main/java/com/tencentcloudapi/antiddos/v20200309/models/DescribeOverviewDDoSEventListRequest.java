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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeOverviewDDoSEventListRequest extends AbstractModel{

    /**
    * 起始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 可选按攻击状态过滤，start：攻击中；end：攻击结束
    */
    @SerializedName("AttackStatus")
    @Expose
    private String AttackStatus;

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 记录条数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 起始时间 
     * @return StartTime 起始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 起始时间
     * @param StartTime 起始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 可选按攻击状态过滤，start：攻击中；end：攻击结束 
     * @return AttackStatus 可选按攻击状态过滤，start：攻击中；end：攻击结束
     */
    public String getAttackStatus() {
        return this.AttackStatus;
    }

    /**
     * Set 可选按攻击状态过滤，start：攻击中；end：攻击结束
     * @param AttackStatus 可选按攻击状态过滤，start：攻击中；end：攻击结束
     */
    public void setAttackStatus(String AttackStatus) {
        this.AttackStatus = AttackStatus;
    }

    /**
     * Get 偏移量 
     * @return Offset 偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 记录条数 
     * @return Limit 记录条数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 记录条数
     * @param Limit 记录条数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeOverviewDDoSEventListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOverviewDDoSEventListRequest(DescribeOverviewDDoSEventListRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.AttackStatus != null) {
            this.AttackStatus = new String(source.AttackStatus);
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
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "AttackStatus", this.AttackStatus);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

