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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OwnNumberApplyDetailItem extends AbstractModel {

    /**
    * 号码类型：0-呼入|1-呼出|2-呼入呼出
    */
    @SerializedName("CallType")
    @Expose
    private Long CallType;

    /**
    * 线路号码
    */
    @SerializedName("PhoneNumber")
    @Expose
    private String PhoneNumber;

    /**
    * 最大并发呼叫数
    */
    @SerializedName("MaxCallCount")
    @Expose
    private Long MaxCallCount;

    /**
    * 每秒最大并发数
    */
    @SerializedName("MaxCallPSec")
    @Expose
    private Long MaxCallPSec;

    /**
     * Get 号码类型：0-呼入|1-呼出|2-呼入呼出 
     * @return CallType 号码类型：0-呼入|1-呼出|2-呼入呼出
     */
    public Long getCallType() {
        return this.CallType;
    }

    /**
     * Set 号码类型：0-呼入|1-呼出|2-呼入呼出
     * @param CallType 号码类型：0-呼入|1-呼出|2-呼入呼出
     */
    public void setCallType(Long CallType) {
        this.CallType = CallType;
    }

    /**
     * Get 线路号码 
     * @return PhoneNumber 线路号码
     */
    public String getPhoneNumber() {
        return this.PhoneNumber;
    }

    /**
     * Set 线路号码
     * @param PhoneNumber 线路号码
     */
    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    /**
     * Get 最大并发呼叫数 
     * @return MaxCallCount 最大并发呼叫数
     */
    public Long getMaxCallCount() {
        return this.MaxCallCount;
    }

    /**
     * Set 最大并发呼叫数
     * @param MaxCallCount 最大并发呼叫数
     */
    public void setMaxCallCount(Long MaxCallCount) {
        this.MaxCallCount = MaxCallCount;
    }

    /**
     * Get 每秒最大并发数 
     * @return MaxCallPSec 每秒最大并发数
     */
    public Long getMaxCallPSec() {
        return this.MaxCallPSec;
    }

    /**
     * Set 每秒最大并发数
     * @param MaxCallPSec 每秒最大并发数
     */
    public void setMaxCallPSec(Long MaxCallPSec) {
        this.MaxCallPSec = MaxCallPSec;
    }

    public OwnNumberApplyDetailItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OwnNumberApplyDetailItem(OwnNumberApplyDetailItem source) {
        if (source.CallType != null) {
            this.CallType = new Long(source.CallType);
        }
        if (source.PhoneNumber != null) {
            this.PhoneNumber = new String(source.PhoneNumber);
        }
        if (source.MaxCallCount != null) {
            this.MaxCallCount = new Long(source.MaxCallCount);
        }
        if (source.MaxCallPSec != null) {
            this.MaxCallPSec = new Long(source.MaxCallPSec);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CallType", this.CallType);
        this.setParamSimple(map, prefix + "PhoneNumber", this.PhoneNumber);
        this.setParamSimple(map, prefix + "MaxCallCount", this.MaxCallCount);
        this.setParamSimple(map, prefix + "MaxCallPSec", this.MaxCallPSec);

    }
}

