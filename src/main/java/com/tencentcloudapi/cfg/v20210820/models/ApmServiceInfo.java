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
package com.tencentcloudapi.cfg.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApmServiceInfo extends AbstractModel {

    /**
    * 业务ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 应用名称
    */
    @SerializedName("ServiceNameList")
    @Expose
    private String [] ServiceNameList;

    /**
    * 地域ID
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
     * Get 业务ID 
     * @return InstanceId 业务ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 业务ID
     * @param InstanceId 业务ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 应用名称 
     * @return ServiceNameList 应用名称
     */
    public String [] getServiceNameList() {
        return this.ServiceNameList;
    }

    /**
     * Set 应用名称
     * @param ServiceNameList 应用名称
     */
    public void setServiceNameList(String [] ServiceNameList) {
        this.ServiceNameList = ServiceNameList;
    }

    /**
     * Get 地域ID 
     * @return RegionId 地域ID
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 地域ID
     * @param RegionId 地域ID
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    public ApmServiceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApmServiceInfo(ApmServiceInfo source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ServiceNameList != null) {
            this.ServiceNameList = new String[source.ServiceNameList.length];
            for (int i = 0; i < source.ServiceNameList.length; i++) {
                this.ServiceNameList[i] = new String(source.ServiceNameList[i]);
            }
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "ServiceNameList.", this.ServiceNameList);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);

    }
}

