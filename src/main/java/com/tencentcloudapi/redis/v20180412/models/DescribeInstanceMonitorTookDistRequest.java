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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceMonitorTookDistRequest  extends AbstractModel{

    /**
    * 实例Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 时间；例如："20190219"
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * 请求类型：1——string类型，2——所有类型
    */
    @SerializedName("SpanType")
    @Expose
    private Integer SpanType;

    /**
     * 获取实例Id
     * @return InstanceId 实例Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置实例Id
     * @param InstanceId 实例Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取时间；例如："20190219"
     * @return Date 时间；例如："20190219"
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * 设置时间；例如："20190219"
     * @param Date 时间；例如："20190219"
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * 获取请求类型：1——string类型，2——所有类型
     * @return SpanType 请求类型：1——string类型，2——所有类型
     */
    public Integer getSpanType() {
        return this.SpanType;
    }

    /**
     * 设置请求类型：1——string类型，2——所有类型
     * @param SpanType 请求类型：1——string类型，2——所有类型
     */
    public void setSpanType(Integer SpanType) {
        this.SpanType = SpanType;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "SpanType", this.SpanType);

    }
}

