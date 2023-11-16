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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBackupMonitorRequest extends AbstractModel {

    /**
    * 备份空间使用详情开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 备份空间使用详情结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 备份趋势查询类型，local-本地备份，cross-跨地域备份
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get 备份空间使用详情开始时间 
     * @return StartTime 备份空间使用详情开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 备份空间使用详情开始时间
     * @param StartTime 备份空间使用详情开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 备份空间使用详情结束时间 
     * @return EndTime 备份空间使用详情结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 备份空间使用详情结束时间
     * @param EndTime 备份空间使用详情结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 备份趋势查询类型，local-本地备份，cross-跨地域备份 
     * @return Type 备份趋势查询类型，local-本地备份，cross-跨地域备份
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 备份趋势查询类型，local-本地备份，cross-跨地域备份
     * @param Type 备份趋势查询类型，local-本地备份，cross-跨地域备份
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public DescribeBackupMonitorRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBackupMonitorRequest(DescribeBackupMonitorRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

