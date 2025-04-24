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
package com.tencentcloudapi.gs.v20191118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FetchAndroidInstancesLogsRequest extends AbstractModel {

    /**
    * 安卓实例 ID 列表
    */
    @SerializedName("AndroidInstanceIds")
    @Expose
    private String [] AndroidInstanceIds;

    /**
    * cos 桶名称
    */
    @SerializedName("BucketName")
    @Expose
    private String BucketName;

    /**
    * cos 桶区域
    */
    @SerializedName("BucketRegion")
    @Expose
    private String BucketRegion;

    /**
    * cos 桶目录，默认为 /log/
    */
    @SerializedName("BucketDirectory")
    @Expose
    private String BucketDirectory;

    /**
    * 下载最近几天的日志，默认值为 1
    */
    @SerializedName("RecentDays")
    @Expose
    private Long RecentDays;

    /**
     * Get 安卓实例 ID 列表 
     * @return AndroidInstanceIds 安卓实例 ID 列表
     */
    public String [] getAndroidInstanceIds() {
        return this.AndroidInstanceIds;
    }

    /**
     * Set 安卓实例 ID 列表
     * @param AndroidInstanceIds 安卓实例 ID 列表
     */
    public void setAndroidInstanceIds(String [] AndroidInstanceIds) {
        this.AndroidInstanceIds = AndroidInstanceIds;
    }

    /**
     * Get cos 桶名称 
     * @return BucketName cos 桶名称
     */
    public String getBucketName() {
        return this.BucketName;
    }

    /**
     * Set cos 桶名称
     * @param BucketName cos 桶名称
     */
    public void setBucketName(String BucketName) {
        this.BucketName = BucketName;
    }

    /**
     * Get cos 桶区域 
     * @return BucketRegion cos 桶区域
     */
    public String getBucketRegion() {
        return this.BucketRegion;
    }

    /**
     * Set cos 桶区域
     * @param BucketRegion cos 桶区域
     */
    public void setBucketRegion(String BucketRegion) {
        this.BucketRegion = BucketRegion;
    }

    /**
     * Get cos 桶目录，默认为 /log/ 
     * @return BucketDirectory cos 桶目录，默认为 /log/
     */
    public String getBucketDirectory() {
        return this.BucketDirectory;
    }

    /**
     * Set cos 桶目录，默认为 /log/
     * @param BucketDirectory cos 桶目录，默认为 /log/
     */
    public void setBucketDirectory(String BucketDirectory) {
        this.BucketDirectory = BucketDirectory;
    }

    /**
     * Get 下载最近几天的日志，默认值为 1 
     * @return RecentDays 下载最近几天的日志，默认值为 1
     */
    public Long getRecentDays() {
        return this.RecentDays;
    }

    /**
     * Set 下载最近几天的日志，默认值为 1
     * @param RecentDays 下载最近几天的日志，默认值为 1
     */
    public void setRecentDays(Long RecentDays) {
        this.RecentDays = RecentDays;
    }

    public FetchAndroidInstancesLogsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FetchAndroidInstancesLogsRequest(FetchAndroidInstancesLogsRequest source) {
        if (source.AndroidInstanceIds != null) {
            this.AndroidInstanceIds = new String[source.AndroidInstanceIds.length];
            for (int i = 0; i < source.AndroidInstanceIds.length; i++) {
                this.AndroidInstanceIds[i] = new String(source.AndroidInstanceIds[i]);
            }
        }
        if (source.BucketName != null) {
            this.BucketName = new String(source.BucketName);
        }
        if (source.BucketRegion != null) {
            this.BucketRegion = new String(source.BucketRegion);
        }
        if (source.BucketDirectory != null) {
            this.BucketDirectory = new String(source.BucketDirectory);
        }
        if (source.RecentDays != null) {
            this.RecentDays = new Long(source.RecentDays);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AndroidInstanceIds.", this.AndroidInstanceIds);
        this.setParamSimple(map, prefix + "BucketName", this.BucketName);
        this.setParamSimple(map, prefix + "BucketRegion", this.BucketRegion);
        this.setParamSimple(map, prefix + "BucketDirectory", this.BucketDirectory);
        this.setParamSimple(map, prefix + "RecentDays", this.RecentDays);

    }
}

