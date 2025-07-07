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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceMonitorBigKeyRequest extends AbstractModel {

    /**
    * 实例Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 请求类型：1——string类型，2——所有类型
    */
    @SerializedName("ReqType")
    @Expose
    private Long ReqType;

    /**
    * 时间；例如："20190219"
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
     * Get 实例Id 
     * @return InstanceId 实例Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例Id
     * @param InstanceId 实例Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 请求类型：1——string类型，2——所有类型 
     * @return ReqType 请求类型：1——string类型，2——所有类型
     */
    public Long getReqType() {
        return this.ReqType;
    }

    /**
     * Set 请求类型：1——string类型，2——所有类型
     * @param ReqType 请求类型：1——string类型，2——所有类型
     */
    public void setReqType(Long ReqType) {
        this.ReqType = ReqType;
    }

    /**
     * Get 时间；例如："20190219" 
     * @return Date 时间；例如："20190219"
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set 时间；例如："20190219"
     * @param Date 时间；例如："20190219"
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    public DescribeInstanceMonitorBigKeyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceMonitorBigKeyRequest(DescribeInstanceMonitorBigKeyRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ReqType != null) {
            this.ReqType = new Long(source.ReqType);
        }
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ReqType", this.ReqType);
        this.setParamSimple(map, prefix + "Date", this.Date);

    }
}

