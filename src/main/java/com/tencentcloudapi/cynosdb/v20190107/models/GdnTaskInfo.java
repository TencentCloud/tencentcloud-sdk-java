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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GdnTaskInfo extends AbstractModel {

    /**
    * 全球数据库唯一标识
    */
    @SerializedName("GdnId")
    @Expose
    private String GdnId;

    /**
    * 全球数据库唯一别名
    */
    @SerializedName("GdnName")
    @Expose
    private String GdnName;

    /**
    * 主集群ID
    */
    @SerializedName("PrimaryClusterId")
    @Expose
    private String PrimaryClusterId;

    /**
    * 主集群所在地域
    */
    @SerializedName("PrimaryClusterRegion")
    @Expose
    private String PrimaryClusterRegion;

    /**
    * 从集群所在地域
    */
    @SerializedName("StandbyClusterRegion")
    @Expose
    private String StandbyClusterRegion;

    /**
    * 从集群ID
    */
    @SerializedName("StandbyClusterId")
    @Expose
    private String StandbyClusterId;

    /**
    * 从集群名称
    */
    @SerializedName("StandbyClusterName")
    @Expose
    private String StandbyClusterName;

    /**
     * Get 全球数据库唯一标识 
     * @return GdnId 全球数据库唯一标识
     */
    public String getGdnId() {
        return this.GdnId;
    }

    /**
     * Set 全球数据库唯一标识
     * @param GdnId 全球数据库唯一标识
     */
    public void setGdnId(String GdnId) {
        this.GdnId = GdnId;
    }

    /**
     * Get 全球数据库唯一别名 
     * @return GdnName 全球数据库唯一别名
     */
    public String getGdnName() {
        return this.GdnName;
    }

    /**
     * Set 全球数据库唯一别名
     * @param GdnName 全球数据库唯一别名
     */
    public void setGdnName(String GdnName) {
        this.GdnName = GdnName;
    }

    /**
     * Get 主集群ID 
     * @return PrimaryClusterId 主集群ID
     */
    public String getPrimaryClusterId() {
        return this.PrimaryClusterId;
    }

    /**
     * Set 主集群ID
     * @param PrimaryClusterId 主集群ID
     */
    public void setPrimaryClusterId(String PrimaryClusterId) {
        this.PrimaryClusterId = PrimaryClusterId;
    }

    /**
     * Get 主集群所在地域 
     * @return PrimaryClusterRegion 主集群所在地域
     */
    public String getPrimaryClusterRegion() {
        return this.PrimaryClusterRegion;
    }

    /**
     * Set 主集群所在地域
     * @param PrimaryClusterRegion 主集群所在地域
     */
    public void setPrimaryClusterRegion(String PrimaryClusterRegion) {
        this.PrimaryClusterRegion = PrimaryClusterRegion;
    }

    /**
     * Get 从集群所在地域 
     * @return StandbyClusterRegion 从集群所在地域
     */
    public String getStandbyClusterRegion() {
        return this.StandbyClusterRegion;
    }

    /**
     * Set 从集群所在地域
     * @param StandbyClusterRegion 从集群所在地域
     */
    public void setStandbyClusterRegion(String StandbyClusterRegion) {
        this.StandbyClusterRegion = StandbyClusterRegion;
    }

    /**
     * Get 从集群ID 
     * @return StandbyClusterId 从集群ID
     */
    public String getStandbyClusterId() {
        return this.StandbyClusterId;
    }

    /**
     * Set 从集群ID
     * @param StandbyClusterId 从集群ID
     */
    public void setStandbyClusterId(String StandbyClusterId) {
        this.StandbyClusterId = StandbyClusterId;
    }

    /**
     * Get 从集群名称 
     * @return StandbyClusterName 从集群名称
     */
    public String getStandbyClusterName() {
        return this.StandbyClusterName;
    }

    /**
     * Set 从集群名称
     * @param StandbyClusterName 从集群名称
     */
    public void setStandbyClusterName(String StandbyClusterName) {
        this.StandbyClusterName = StandbyClusterName;
    }

    public GdnTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GdnTaskInfo(GdnTaskInfo source) {
        if (source.GdnId != null) {
            this.GdnId = new String(source.GdnId);
        }
        if (source.GdnName != null) {
            this.GdnName = new String(source.GdnName);
        }
        if (source.PrimaryClusterId != null) {
            this.PrimaryClusterId = new String(source.PrimaryClusterId);
        }
        if (source.PrimaryClusterRegion != null) {
            this.PrimaryClusterRegion = new String(source.PrimaryClusterRegion);
        }
        if (source.StandbyClusterRegion != null) {
            this.StandbyClusterRegion = new String(source.StandbyClusterRegion);
        }
        if (source.StandbyClusterId != null) {
            this.StandbyClusterId = new String(source.StandbyClusterId);
        }
        if (source.StandbyClusterName != null) {
            this.StandbyClusterName = new String(source.StandbyClusterName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GdnId", this.GdnId);
        this.setParamSimple(map, prefix + "GdnName", this.GdnName);
        this.setParamSimple(map, prefix + "PrimaryClusterId", this.PrimaryClusterId);
        this.setParamSimple(map, prefix + "PrimaryClusterRegion", this.PrimaryClusterRegion);
        this.setParamSimple(map, prefix + "StandbyClusterRegion", this.StandbyClusterRegion);
        this.setParamSimple(map, prefix + "StandbyClusterId", this.StandbyClusterId);
        this.setParamSimple(map, prefix + "StandbyClusterName", this.StandbyClusterName);

    }
}

