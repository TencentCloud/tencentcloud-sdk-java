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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateIPStrategyRequest extends AbstractModel{

    /**
    * 服务的唯一ID。
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * 用户自定义的策略名称。
    */
    @SerializedName("StrategyName")
    @Expose
    private String StrategyName;

    /**
    * 策略类型。支持WHITE（白名单）和BLACK（黑名单）。
    */
    @SerializedName("StrategyType")
    @Expose
    private String StrategyType;

    /**
    * 策略详情。
    */
    @SerializedName("StrategyData")
    @Expose
    private String StrategyData;

    /**
     * Get 服务的唯一ID。 
     * @return ServiceId 服务的唯一ID。
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set 服务的唯一ID。
     * @param ServiceId 服务的唯一ID。
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get 用户自定义的策略名称。 
     * @return StrategyName 用户自定义的策略名称。
     */
    public String getStrategyName() {
        return this.StrategyName;
    }

    /**
     * Set 用户自定义的策略名称。
     * @param StrategyName 用户自定义的策略名称。
     */
    public void setStrategyName(String StrategyName) {
        this.StrategyName = StrategyName;
    }

    /**
     * Get 策略类型。支持WHITE（白名单）和BLACK（黑名单）。 
     * @return StrategyType 策略类型。支持WHITE（白名单）和BLACK（黑名单）。
     */
    public String getStrategyType() {
        return this.StrategyType;
    }

    /**
     * Set 策略类型。支持WHITE（白名单）和BLACK（黑名单）。
     * @param StrategyType 策略类型。支持WHITE（白名单）和BLACK（黑名单）。
     */
    public void setStrategyType(String StrategyType) {
        this.StrategyType = StrategyType;
    }

    /**
     * Get 策略详情。 
     * @return StrategyData 策略详情。
     */
    public String getStrategyData() {
        return this.StrategyData;
    }

    /**
     * Set 策略详情。
     * @param StrategyData 策略详情。
     */
    public void setStrategyData(String StrategyData) {
        this.StrategyData = StrategyData;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "StrategyName", this.StrategyName);
        this.setParamSimple(map, prefix + "StrategyType", this.StrategyType);
        this.setParamSimple(map, prefix + "StrategyData", this.StrategyData);

    }
}

