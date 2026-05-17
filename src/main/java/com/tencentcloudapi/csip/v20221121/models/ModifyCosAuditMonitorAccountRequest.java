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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyCosAuditMonitorAccountRequest extends AbstractModel {

    /**
    * 资源id
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 需要监测的appid信息
    */
    @SerializedName("MonitorAppIdSet")
    @Expose
    private Long [] MonitorAppIdSet;

    /**
    * 选择存储桶映射关系
    */
    @SerializedName("BindBucket")
    @Expose
    private CosBucketId [] BindBucket;

    /**
     * Get 资源id 
     * @return ResourceId 资源id
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源id
     * @param ResourceId 资源id
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 需要监测的appid信息 
     * @return MonitorAppIdSet 需要监测的appid信息
     */
    public Long [] getMonitorAppIdSet() {
        return this.MonitorAppIdSet;
    }

    /**
     * Set 需要监测的appid信息
     * @param MonitorAppIdSet 需要监测的appid信息
     */
    public void setMonitorAppIdSet(Long [] MonitorAppIdSet) {
        this.MonitorAppIdSet = MonitorAppIdSet;
    }

    /**
     * Get 选择存储桶映射关系 
     * @return BindBucket 选择存储桶映射关系
     */
    public CosBucketId [] getBindBucket() {
        return this.BindBucket;
    }

    /**
     * Set 选择存储桶映射关系
     * @param BindBucket 选择存储桶映射关系
     */
    public void setBindBucket(CosBucketId [] BindBucket) {
        this.BindBucket = BindBucket;
    }

    public ModifyCosAuditMonitorAccountRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCosAuditMonitorAccountRequest(ModifyCosAuditMonitorAccountRequest source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.MonitorAppIdSet != null) {
            this.MonitorAppIdSet = new Long[source.MonitorAppIdSet.length];
            for (int i = 0; i < source.MonitorAppIdSet.length; i++) {
                this.MonitorAppIdSet[i] = new Long(source.MonitorAppIdSet[i]);
            }
        }
        if (source.BindBucket != null) {
            this.BindBucket = new CosBucketId[source.BindBucket.length];
            for (int i = 0; i < source.BindBucket.length; i++) {
                this.BindBucket[i] = new CosBucketId(source.BindBucket[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamArraySimple(map, prefix + "MonitorAppIdSet.", this.MonitorAppIdSet);
        this.setParamArrayObj(map, prefix + "BindBucket.", this.BindBucket);

    }
}

