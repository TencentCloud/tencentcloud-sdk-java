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
package com.tencentcloudapi.cloudaudit.v20190319.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuditSummary extends AbstractModel{

    /**
    * 跟踪集状态，1：开启，0：关闭
    */
    @SerializedName("AuditStatus")
    @Expose
    private Long AuditStatus;

    /**
    * COS存储桶名称
    */
    @SerializedName("CosBucketName")
    @Expose
    private String CosBucketName;

    /**
    * 跟踪集名称
    */
    @SerializedName("AuditName")
    @Expose
    private String AuditName;

    /**
    * 日志前缀
    */
    @SerializedName("LogFilePrefix")
    @Expose
    private String LogFilePrefix;

    /**
     * Get 跟踪集状态，1：开启，0：关闭 
     * @return AuditStatus 跟踪集状态，1：开启，0：关闭
     */
    public Long getAuditStatus() {
        return this.AuditStatus;
    }

    /**
     * Set 跟踪集状态，1：开启，0：关闭
     * @param AuditStatus 跟踪集状态，1：开启，0：关闭
     */
    public void setAuditStatus(Long AuditStatus) {
        this.AuditStatus = AuditStatus;
    }

    /**
     * Get COS存储桶名称 
     * @return CosBucketName COS存储桶名称
     */
    public String getCosBucketName() {
        return this.CosBucketName;
    }

    /**
     * Set COS存储桶名称
     * @param CosBucketName COS存储桶名称
     */
    public void setCosBucketName(String CosBucketName) {
        this.CosBucketName = CosBucketName;
    }

    /**
     * Get 跟踪集名称 
     * @return AuditName 跟踪集名称
     */
    public String getAuditName() {
        return this.AuditName;
    }

    /**
     * Set 跟踪集名称
     * @param AuditName 跟踪集名称
     */
    public void setAuditName(String AuditName) {
        this.AuditName = AuditName;
    }

    /**
     * Get 日志前缀 
     * @return LogFilePrefix 日志前缀
     */
    public String getLogFilePrefix() {
        return this.LogFilePrefix;
    }

    /**
     * Set 日志前缀
     * @param LogFilePrefix 日志前缀
     */
    public void setLogFilePrefix(String LogFilePrefix) {
        this.LogFilePrefix = LogFilePrefix;
    }

    public AuditSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuditSummary(AuditSummary source) {
        if (source.AuditStatus != null) {
            this.AuditStatus = new Long(source.AuditStatus);
        }
        if (source.CosBucketName != null) {
            this.CosBucketName = new String(source.CosBucketName);
        }
        if (source.AuditName != null) {
            this.AuditName = new String(source.AuditName);
        }
        if (source.LogFilePrefix != null) {
            this.LogFilePrefix = new String(source.LogFilePrefix);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AuditStatus", this.AuditStatus);
        this.setParamSimple(map, prefix + "CosBucketName", this.CosBucketName);
        this.setParamSimple(map, prefix + "AuditName", this.AuditName);
        this.setParamSimple(map, prefix + "LogFilePrefix", this.LogFilePrefix);

    }
}

