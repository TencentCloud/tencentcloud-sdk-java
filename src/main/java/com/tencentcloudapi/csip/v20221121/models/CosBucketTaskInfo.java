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

public class CosBucketTaskInfo extends AbstractModel {

    /**
    * <p>appid</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>存储桶名</p>
    */
    @SerializedName("BucketName")
    @Expose
    private String BucketName;

    /**
    * <p>任务id</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>最后一次扫描时间</p>
    */
    @SerializedName("LastScanTime")
    @Expose
    private Long LastScanTime;

    /**
    * <p>识别文件数量</p>
    */
    @SerializedName("IdentifyFileCount")
    @Expose
    private Long IdentifyFileCount;

    /**
    * <p>敏感文件数量</p>
    */
    @SerializedName("SensitiveFileCount")
    @Expose
    private Long SensitiveFileCount;

    /**
     * Get <p>appid</p> 
     * @return AppId <p>appid</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>appid</p>
     * @param AppId <p>appid</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>存储桶名</p> 
     * @return BucketName <p>存储桶名</p>
     */
    public String getBucketName() {
        return this.BucketName;
    }

    /**
     * Set <p>存储桶名</p>
     * @param BucketName <p>存储桶名</p>
     */
    public void setBucketName(String BucketName) {
        this.BucketName = BucketName;
    }

    /**
     * Get <p>任务id</p> 
     * @return TaskId <p>任务id</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>任务id</p>
     * @param TaskId <p>任务id</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>最后一次扫描时间</p> 
     * @return LastScanTime <p>最后一次扫描时间</p>
     */
    public Long getLastScanTime() {
        return this.LastScanTime;
    }

    /**
     * Set <p>最后一次扫描时间</p>
     * @param LastScanTime <p>最后一次扫描时间</p>
     */
    public void setLastScanTime(Long LastScanTime) {
        this.LastScanTime = LastScanTime;
    }

    /**
     * Get <p>识别文件数量</p> 
     * @return IdentifyFileCount <p>识别文件数量</p>
     */
    public Long getIdentifyFileCount() {
        return this.IdentifyFileCount;
    }

    /**
     * Set <p>识别文件数量</p>
     * @param IdentifyFileCount <p>识别文件数量</p>
     */
    public void setIdentifyFileCount(Long IdentifyFileCount) {
        this.IdentifyFileCount = IdentifyFileCount;
    }

    /**
     * Get <p>敏感文件数量</p> 
     * @return SensitiveFileCount <p>敏感文件数量</p>
     */
    public Long getSensitiveFileCount() {
        return this.SensitiveFileCount;
    }

    /**
     * Set <p>敏感文件数量</p>
     * @param SensitiveFileCount <p>敏感文件数量</p>
     */
    public void setSensitiveFileCount(Long SensitiveFileCount) {
        this.SensitiveFileCount = SensitiveFileCount;
    }

    public CosBucketTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosBucketTaskInfo(CosBucketTaskInfo source) {
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.BucketName != null) {
            this.BucketName = new String(source.BucketName);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.LastScanTime != null) {
            this.LastScanTime = new Long(source.LastScanTime);
        }
        if (source.IdentifyFileCount != null) {
            this.IdentifyFileCount = new Long(source.IdentifyFileCount);
        }
        if (source.SensitiveFileCount != null) {
            this.SensitiveFileCount = new Long(source.SensitiveFileCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "BucketName", this.BucketName);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "LastScanTime", this.LastScanTime);
        this.setParamSimple(map, prefix + "IdentifyFileCount", this.IdentifyFileCount);
        this.setParamSimple(map, prefix + "SensitiveFileCount", this.SensitiveFileCount);

    }
}

