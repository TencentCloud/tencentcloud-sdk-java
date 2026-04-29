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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RayCluster extends AbstractModel {

    /**
    * <p>RayCluster 集群名</p>
    */
    @SerializedName("RayClusterName")
    @Expose
    private String RayClusterName;

    /**
    * <p>RayCluster 集群 id</p>
    */
    @SerializedName("RayClusterId")
    @Expose
    private Long RayClusterId;

    /**
    * <p>pod 数量</p>
    */
    @SerializedName("PodCount")
    @Expose
    private Long PodCount;

    /**
    * <p>集群创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>redis 实例数量</p>
    */
    @SerializedName("RedisCount")
    @Expose
    private Long RedisCount;

    /**
    * <p>创建类型</p><p>枚举值：</p><ul><li>1： 表单创建</li><li>2： yaml创建</li></ul>
    */
    @SerializedName("SubmitType")
    @Expose
    private Long SubmitType;

    /**
    * <p>head访问地址,也是dashboard地址</p>
    */
    @SerializedName("DashboardUrl")
    @Expose
    private String DashboardUrl;

    /**
     * Get <p>RayCluster 集群名</p> 
     * @return RayClusterName <p>RayCluster 集群名</p>
     */
    public String getRayClusterName() {
        return this.RayClusterName;
    }

    /**
     * Set <p>RayCluster 集群名</p>
     * @param RayClusterName <p>RayCluster 集群名</p>
     */
    public void setRayClusterName(String RayClusterName) {
        this.RayClusterName = RayClusterName;
    }

    /**
     * Get <p>RayCluster 集群 id</p> 
     * @return RayClusterId <p>RayCluster 集群 id</p>
     */
    public Long getRayClusterId() {
        return this.RayClusterId;
    }

    /**
     * Set <p>RayCluster 集群 id</p>
     * @param RayClusterId <p>RayCluster 集群 id</p>
     */
    public void setRayClusterId(Long RayClusterId) {
        this.RayClusterId = RayClusterId;
    }

    /**
     * Get <p>pod 数量</p> 
     * @return PodCount <p>pod 数量</p>
     */
    public Long getPodCount() {
        return this.PodCount;
    }

    /**
     * Set <p>pod 数量</p>
     * @param PodCount <p>pod 数量</p>
     */
    public void setPodCount(Long PodCount) {
        this.PodCount = PodCount;
    }

    /**
     * Get <p>集群创建时间</p> 
     * @return CreateTime <p>集群创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>集群创建时间</p>
     * @param CreateTime <p>集群创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>redis 实例数量</p> 
     * @return RedisCount <p>redis 实例数量</p>
     */
    public Long getRedisCount() {
        return this.RedisCount;
    }

    /**
     * Set <p>redis 实例数量</p>
     * @param RedisCount <p>redis 实例数量</p>
     */
    public void setRedisCount(Long RedisCount) {
        this.RedisCount = RedisCount;
    }

    /**
     * Get <p>创建类型</p><p>枚举值：</p><ul><li>1： 表单创建</li><li>2： yaml创建</li></ul> 
     * @return SubmitType <p>创建类型</p><p>枚举值：</p><ul><li>1： 表单创建</li><li>2： yaml创建</li></ul>
     */
    public Long getSubmitType() {
        return this.SubmitType;
    }

    /**
     * Set <p>创建类型</p><p>枚举值：</p><ul><li>1： 表单创建</li><li>2： yaml创建</li></ul>
     * @param SubmitType <p>创建类型</p><p>枚举值：</p><ul><li>1： 表单创建</li><li>2： yaml创建</li></ul>
     */
    public void setSubmitType(Long SubmitType) {
        this.SubmitType = SubmitType;
    }

    /**
     * Get <p>head访问地址,也是dashboard地址</p> 
     * @return DashboardUrl <p>head访问地址,也是dashboard地址</p>
     */
    public String getDashboardUrl() {
        return this.DashboardUrl;
    }

    /**
     * Set <p>head访问地址,也是dashboard地址</p>
     * @param DashboardUrl <p>head访问地址,也是dashboard地址</p>
     */
    public void setDashboardUrl(String DashboardUrl) {
        this.DashboardUrl = DashboardUrl;
    }

    public RayCluster() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RayCluster(RayCluster source) {
        if (source.RayClusterName != null) {
            this.RayClusterName = new String(source.RayClusterName);
        }
        if (source.RayClusterId != null) {
            this.RayClusterId = new Long(source.RayClusterId);
        }
        if (source.PodCount != null) {
            this.PodCount = new Long(source.PodCount);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.RedisCount != null) {
            this.RedisCount = new Long(source.RedisCount);
        }
        if (source.SubmitType != null) {
            this.SubmitType = new Long(source.SubmitType);
        }
        if (source.DashboardUrl != null) {
            this.DashboardUrl = new String(source.DashboardUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RayClusterName", this.RayClusterName);
        this.setParamSimple(map, prefix + "RayClusterId", this.RayClusterId);
        this.setParamSimple(map, prefix + "PodCount", this.PodCount);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "RedisCount", this.RedisCount);
        this.setParamSimple(map, prefix + "SubmitType", this.SubmitType);
        this.setParamSimple(map, prefix + "DashboardUrl", this.DashboardUrl);

    }
}

