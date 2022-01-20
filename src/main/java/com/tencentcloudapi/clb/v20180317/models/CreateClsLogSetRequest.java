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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateClsLogSetRequest extends AbstractModel{

    /**
    * 日志集的名字，不能和cls其他日志集重名。不填默认为clb_logset。
    */
    @SerializedName("LogsetName")
    @Expose
    private String LogsetName;

    /**
    * 日志集的保存周期，单位：天。
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 日志集类型，ACCESS：访问日志，HEALTH：健康检查日志，默认ACCESS。
    */
    @SerializedName("LogsetType")
    @Expose
    private String LogsetType;

    /**
     * Get 日志集的名字，不能和cls其他日志集重名。不填默认为clb_logset。 
     * @return LogsetName 日志集的名字，不能和cls其他日志集重名。不填默认为clb_logset。
     */
    public String getLogsetName() {
        return this.LogsetName;
    }

    /**
     * Set 日志集的名字，不能和cls其他日志集重名。不填默认为clb_logset。
     * @param LogsetName 日志集的名字，不能和cls其他日志集重名。不填默认为clb_logset。
     */
    public void setLogsetName(String LogsetName) {
        this.LogsetName = LogsetName;
    }

    /**
     * Get 日志集的保存周期，单位：天。 
     * @return Period 日志集的保存周期，单位：天。
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 日志集的保存周期，单位：天。
     * @param Period 日志集的保存周期，单位：天。
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 日志集类型，ACCESS：访问日志，HEALTH：健康检查日志，默认ACCESS。 
     * @return LogsetType 日志集类型，ACCESS：访问日志，HEALTH：健康检查日志，默认ACCESS。
     */
    public String getLogsetType() {
        return this.LogsetType;
    }

    /**
     * Set 日志集类型，ACCESS：访问日志，HEALTH：健康检查日志，默认ACCESS。
     * @param LogsetType 日志集类型，ACCESS：访问日志，HEALTH：健康检查日志，默认ACCESS。
     */
    public void setLogsetType(String LogsetType) {
        this.LogsetType = LogsetType;
    }

    public CreateClsLogSetRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateClsLogSetRequest(CreateClsLogSetRequest source) {
        if (source.LogsetName != null) {
            this.LogsetName = new String(source.LogsetName);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.LogsetType != null) {
            this.LogsetType = new String(source.LogsetType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogsetName", this.LogsetName);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "LogsetType", this.LogsetType);

    }
}

