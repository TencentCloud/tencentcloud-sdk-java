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

public class CosBucketId extends AbstractModel {

    /**
    * <p>appid</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>是否自动监测</p>
    */
    @SerializedName("IsAutoMonitor")
    @Expose
    private Long IsAutoMonitor;

    /**
    * <p>bucket id集合</p>
    */
    @SerializedName("BucketIdSet")
    @Expose
    private String [] BucketIdSet;

    /**
     * Get <p>appid</p> 
     * @return AppId <p>appid</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>appid</p>
     * @param AppId <p>appid</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>是否自动监测</p> 
     * @return IsAutoMonitor <p>是否自动监测</p>
     */
    public Long getIsAutoMonitor() {
        return this.IsAutoMonitor;
    }

    /**
     * Set <p>是否自动监测</p>
     * @param IsAutoMonitor <p>是否自动监测</p>
     */
    public void setIsAutoMonitor(Long IsAutoMonitor) {
        this.IsAutoMonitor = IsAutoMonitor;
    }

    /**
     * Get <p>bucket id集合</p> 
     * @return BucketIdSet <p>bucket id集合</p>
     */
    public String [] getBucketIdSet() {
        return this.BucketIdSet;
    }

    /**
     * Set <p>bucket id集合</p>
     * @param BucketIdSet <p>bucket id集合</p>
     */
    public void setBucketIdSet(String [] BucketIdSet) {
        this.BucketIdSet = BucketIdSet;
    }

    public CosBucketId() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosBucketId(CosBucketId source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.IsAutoMonitor != null) {
            this.IsAutoMonitor = new Long(source.IsAutoMonitor);
        }
        if (source.BucketIdSet != null) {
            this.BucketIdSet = new String[source.BucketIdSet.length];
            for (int i = 0; i < source.BucketIdSet.length; i++) {
                this.BucketIdSet[i] = new String(source.BucketIdSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "IsAutoMonitor", this.IsAutoMonitor);
        this.setParamArraySimple(map, prefix + "BucketIdSet.", this.BucketIdSet);

    }
}

