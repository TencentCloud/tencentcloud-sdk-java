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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyWhiteboardBucketConfigRequest extends AbstractModel{

    /**
    * 客户的SdkAppId
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * 需要查询的任务类型
recording: 实时录制
transcode: 文档转码
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * COS存储桶名字
    */
    @SerializedName("BucketName")
    @Expose
    private String BucketName;

    /**
    * COS存储桶地域
    */
    @SerializedName("BucketLocation")
    @Expose
    private String BucketLocation;

    /**
    * 存储桶里资源前缀
    */
    @SerializedName("BucketPrefix")
    @Expose
    private String BucketPrefix;

    /**
    * 返回Url域名
    */
    @SerializedName("ResultDomain")
    @Expose
    private String ResultDomain;

    /**
     * Get 客户的SdkAppId 
     * @return SdkAppId 客户的SdkAppId
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set 客户的SdkAppId
     * @param SdkAppId 客户的SdkAppId
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get 需要查询的任务类型
recording: 实时录制
transcode: 文档转码 
     * @return TaskType 需要查询的任务类型
recording: 实时录制
transcode: 文档转码
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 需要查询的任务类型
recording: 实时录制
transcode: 文档转码
     * @param TaskType 需要查询的任务类型
recording: 实时录制
transcode: 文档转码
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get COS存储桶名字 
     * @return BucketName COS存储桶名字
     */
    public String getBucketName() {
        return this.BucketName;
    }

    /**
     * Set COS存储桶名字
     * @param BucketName COS存储桶名字
     */
    public void setBucketName(String BucketName) {
        this.BucketName = BucketName;
    }

    /**
     * Get COS存储桶地域 
     * @return BucketLocation COS存储桶地域
     */
    public String getBucketLocation() {
        return this.BucketLocation;
    }

    /**
     * Set COS存储桶地域
     * @param BucketLocation COS存储桶地域
     */
    public void setBucketLocation(String BucketLocation) {
        this.BucketLocation = BucketLocation;
    }

    /**
     * Get 存储桶里资源前缀 
     * @return BucketPrefix 存储桶里资源前缀
     */
    public String getBucketPrefix() {
        return this.BucketPrefix;
    }

    /**
     * Set 存储桶里资源前缀
     * @param BucketPrefix 存储桶里资源前缀
     */
    public void setBucketPrefix(String BucketPrefix) {
        this.BucketPrefix = BucketPrefix;
    }

    /**
     * Get 返回Url域名 
     * @return ResultDomain 返回Url域名
     */
    public String getResultDomain() {
        return this.ResultDomain;
    }

    /**
     * Set 返回Url域名
     * @param ResultDomain 返回Url域名
     */
    public void setResultDomain(String ResultDomain) {
        this.ResultDomain = ResultDomain;
    }

    public ModifyWhiteboardBucketConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyWhiteboardBucketConfigRequest(ModifyWhiteboardBucketConfigRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.BucketName != null) {
            this.BucketName = new String(source.BucketName);
        }
        if (source.BucketLocation != null) {
            this.BucketLocation = new String(source.BucketLocation);
        }
        if (source.BucketPrefix != null) {
            this.BucketPrefix = new String(source.BucketPrefix);
        }
        if (source.ResultDomain != null) {
            this.ResultDomain = new String(source.ResultDomain);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "BucketName", this.BucketName);
        this.setParamSimple(map, prefix + "BucketLocation", this.BucketLocation);
        this.setParamSimple(map, prefix + "BucketPrefix", this.BucketPrefix);
        this.setParamSimple(map, prefix + "ResultDomain", this.ResultDomain);

    }
}

