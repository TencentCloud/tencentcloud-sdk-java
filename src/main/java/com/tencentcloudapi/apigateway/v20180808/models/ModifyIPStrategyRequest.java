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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyIPStrategyRequest extends AbstractModel {

    /**
    * 待修改的策略所属服务的唯一ID。
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * 待修改的策略唯一ID。
    */
    @SerializedName("StrategyId")
    @Expose
    private String StrategyId;

    /**
    * 待修改的策略详情。
    */
    @SerializedName("StrategyData")
    @Expose
    private String StrategyData;

    /**
     * Get 待修改的策略所属服务的唯一ID。 
     * @return ServiceId 待修改的策略所属服务的唯一ID。
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set 待修改的策略所属服务的唯一ID。
     * @param ServiceId 待修改的策略所属服务的唯一ID。
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get 待修改的策略唯一ID。 
     * @return StrategyId 待修改的策略唯一ID。
     */
    public String getStrategyId() {
        return this.StrategyId;
    }

    /**
     * Set 待修改的策略唯一ID。
     * @param StrategyId 待修改的策略唯一ID。
     */
    public void setStrategyId(String StrategyId) {
        this.StrategyId = StrategyId;
    }

    /**
     * Get 待修改的策略详情。 
     * @return StrategyData 待修改的策略详情。
     */
    public String getStrategyData() {
        return this.StrategyData;
    }

    /**
     * Set 待修改的策略详情。
     * @param StrategyData 待修改的策略详情。
     */
    public void setStrategyData(String StrategyData) {
        this.StrategyData = StrategyData;
    }

    public ModifyIPStrategyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyIPStrategyRequest(ModifyIPStrategyRequest source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.StrategyId != null) {
            this.StrategyId = new String(source.StrategyId);
        }
        if (source.StrategyData != null) {
            this.StrategyData = new String(source.StrategyData);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "StrategyId", this.StrategyId);
        this.setParamSimple(map, prefix + "StrategyData", this.StrategyData);

    }
}

