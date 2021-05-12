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

public class DeleteServiceRequest extends AbstractModel{

    /**
    * 待删除服务的唯一 ID。
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * 跳过删除前置条件校验（仅支持独享实例上的服务）
    */
    @SerializedName("SkipVerification")
    @Expose
    private Long SkipVerification;

    /**
     * Get 待删除服务的唯一 ID。 
     * @return ServiceId 待删除服务的唯一 ID。
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set 待删除服务的唯一 ID。
     * @param ServiceId 待删除服务的唯一 ID。
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get 跳过删除前置条件校验（仅支持独享实例上的服务） 
     * @return SkipVerification 跳过删除前置条件校验（仅支持独享实例上的服务）
     */
    public Long getSkipVerification() {
        return this.SkipVerification;
    }

    /**
     * Set 跳过删除前置条件校验（仅支持独享实例上的服务）
     * @param SkipVerification 跳过删除前置条件校验（仅支持独享实例上的服务）
     */
    public void setSkipVerification(Long SkipVerification) {
        this.SkipVerification = SkipVerification;
    }

    public DeleteServiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteServiceRequest(DeleteServiceRequest source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.SkipVerification != null) {
            this.SkipVerification = new Long(source.SkipVerification);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "SkipVerification", this.SkipVerification);

    }
}

