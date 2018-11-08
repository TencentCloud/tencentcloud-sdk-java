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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecurityTrend  extends AbstractModel{

    /**
    * 事件时间。
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * 事件数量。
    */
    @SerializedName("EventNum")
    @Expose
    private Integer EventNum;

    /**
     * 获取事件时间。
     * @return Date 事件时间。
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * 设置事件时间。
     * @param Date 事件时间。
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * 获取事件数量。
     * @return EventNum 事件数量。
     */
    public Integer getEventNum() {
        return this.EventNum;
    }

    /**
     * 设置事件数量。
     * @param EventNum 事件数量。
     */
    public void setEventNum(Integer EventNum) {
        this.EventNum = EventNum;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "EventNum", this.EventNum);

    }
}

