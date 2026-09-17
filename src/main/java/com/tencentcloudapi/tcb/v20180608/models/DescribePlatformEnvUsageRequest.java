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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePlatformEnvUsageRequest extends AbstractModel {

    /**
    * <p>环境Id</p>
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * <p>查询用量起始时间</p><p>参数格式：YYYY-MM-DD</p>
    */
    @SerializedName("StartDate")
    @Expose
    private String StartDate;

    /**
    * <p>查询用量结束时间</p><p>参数格式：YYYY-MM-DD</p>
    */
    @SerializedName("EndDate")
    @Expose
    private String EndDate;

    /**
    * <p>资源类型</p><p>枚举值：</p><ul><li>Storage： 云存储</li><li>Function： 云函数</li><li>Database： 数据库</li></ul>
    */
    @SerializedName("ResourceTypes")
    @Expose
    private String [] ResourceTypes;

    /**
    * <p>是否展示用量明细</p>
    */
    @SerializedName("NeedUsageDetails")
    @Expose
    private Boolean NeedUsageDetails;

    /**
     * Get <p>环境Id</p> 
     * @return EnvId <p>环境Id</p>
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set <p>环境Id</p>
     * @param EnvId <p>环境Id</p>
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get <p>查询用量起始时间</p><p>参数格式：YYYY-MM-DD</p> 
     * @return StartDate <p>查询用量起始时间</p><p>参数格式：YYYY-MM-DD</p>
     */
    public String getStartDate() {
        return this.StartDate;
    }

    /**
     * Set <p>查询用量起始时间</p><p>参数格式：YYYY-MM-DD</p>
     * @param StartDate <p>查询用量起始时间</p><p>参数格式：YYYY-MM-DD</p>
     */
    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    /**
     * Get <p>查询用量结束时间</p><p>参数格式：YYYY-MM-DD</p> 
     * @return EndDate <p>查询用量结束时间</p><p>参数格式：YYYY-MM-DD</p>
     */
    public String getEndDate() {
        return this.EndDate;
    }

    /**
     * Set <p>查询用量结束时间</p><p>参数格式：YYYY-MM-DD</p>
     * @param EndDate <p>查询用量结束时间</p><p>参数格式：YYYY-MM-DD</p>
     */
    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    /**
     * Get <p>资源类型</p><p>枚举值：</p><ul><li>Storage： 云存储</li><li>Function： 云函数</li><li>Database： 数据库</li></ul> 
     * @return ResourceTypes <p>资源类型</p><p>枚举值：</p><ul><li>Storage： 云存储</li><li>Function： 云函数</li><li>Database： 数据库</li></ul>
     */
    public String [] getResourceTypes() {
        return this.ResourceTypes;
    }

    /**
     * Set <p>资源类型</p><p>枚举值：</p><ul><li>Storage： 云存储</li><li>Function： 云函数</li><li>Database： 数据库</li></ul>
     * @param ResourceTypes <p>资源类型</p><p>枚举值：</p><ul><li>Storage： 云存储</li><li>Function： 云函数</li><li>Database： 数据库</li></ul>
     */
    public void setResourceTypes(String [] ResourceTypes) {
        this.ResourceTypes = ResourceTypes;
    }

    /**
     * Get <p>是否展示用量明细</p> 
     * @return NeedUsageDetails <p>是否展示用量明细</p>
     */
    public Boolean getNeedUsageDetails() {
        return this.NeedUsageDetails;
    }

    /**
     * Set <p>是否展示用量明细</p>
     * @param NeedUsageDetails <p>是否展示用量明细</p>
     */
    public void setNeedUsageDetails(Boolean NeedUsageDetails) {
        this.NeedUsageDetails = NeedUsageDetails;
    }

    public DescribePlatformEnvUsageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePlatformEnvUsageRequest(DescribePlatformEnvUsageRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.StartDate != null) {
            this.StartDate = new String(source.StartDate);
        }
        if (source.EndDate != null) {
            this.EndDate = new String(source.EndDate);
        }
        if (source.ResourceTypes != null) {
            this.ResourceTypes = new String[source.ResourceTypes.length];
            for (int i = 0; i < source.ResourceTypes.length; i++) {
                this.ResourceTypes[i] = new String(source.ResourceTypes[i]);
            }
        }
        if (source.NeedUsageDetails != null) {
            this.NeedUsageDetails = new Boolean(source.NeedUsageDetails);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "StartDate", this.StartDate);
        this.setParamSimple(map, prefix + "EndDate", this.EndDate);
        this.setParamArraySimple(map, prefix + "ResourceTypes.", this.ResourceTypes);
        this.setParamSimple(map, prefix + "NeedUsageDetails", this.NeedUsageDetails);

    }
}

