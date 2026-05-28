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

public class CreateCosObjectScanTaskRequest extends AbstractModel {

    /**
    * <p>1: 敏感数据识别 2:恶意文件扫描 3:批量扫描敏感数据</p>
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>存储桶列表</p>
    */
    @SerializedName("BucketSet")
    @Expose
    private String [] BucketSet;

    /**
    * <p>任务参数</p>
    */
    @SerializedName("TaskArgs")
    @Expose
    private String TaskArgs;

    /**
    * <p>是否全部扫描</p>
    */
    @SerializedName("IsScanAll")
    @Expose
    private Boolean IsScanAll;

    /**
    * <p>扫描时需要剔除的存储桶</p>
    */
    @SerializedName("DeleteBucketSet")
    @Expose
    private String [] DeleteBucketSet;

    /**
     * Get <p>1: 敏感数据识别 2:恶意文件扫描 3:批量扫描敏感数据</p> 
     * @return TaskType <p>1: 敏感数据识别 2:恶意文件扫描 3:批量扫描敏感数据</p>
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set <p>1: 敏感数据识别 2:恶意文件扫描 3:批量扫描敏感数据</p>
     * @param TaskType <p>1: 敏感数据识别 2:恶意文件扫描 3:批量扫描敏感数据</p>
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get <p>集团账号的成员id</p> 
     * @return MemberId <p>集团账号的成员id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>集团账号的成员id</p>
     * @param MemberId <p>集团账号的成员id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>存储桶列表</p> 
     * @return BucketSet <p>存储桶列表</p>
     */
    public String [] getBucketSet() {
        return this.BucketSet;
    }

    /**
     * Set <p>存储桶列表</p>
     * @param BucketSet <p>存储桶列表</p>
     */
    public void setBucketSet(String [] BucketSet) {
        this.BucketSet = BucketSet;
    }

    /**
     * Get <p>任务参数</p> 
     * @return TaskArgs <p>任务参数</p>
     */
    public String getTaskArgs() {
        return this.TaskArgs;
    }

    /**
     * Set <p>任务参数</p>
     * @param TaskArgs <p>任务参数</p>
     */
    public void setTaskArgs(String TaskArgs) {
        this.TaskArgs = TaskArgs;
    }

    /**
     * Get <p>是否全部扫描</p> 
     * @return IsScanAll <p>是否全部扫描</p>
     */
    public Boolean getIsScanAll() {
        return this.IsScanAll;
    }

    /**
     * Set <p>是否全部扫描</p>
     * @param IsScanAll <p>是否全部扫描</p>
     */
    public void setIsScanAll(Boolean IsScanAll) {
        this.IsScanAll = IsScanAll;
    }

    /**
     * Get <p>扫描时需要剔除的存储桶</p> 
     * @return DeleteBucketSet <p>扫描时需要剔除的存储桶</p>
     */
    public String [] getDeleteBucketSet() {
        return this.DeleteBucketSet;
    }

    /**
     * Set <p>扫描时需要剔除的存储桶</p>
     * @param DeleteBucketSet <p>扫描时需要剔除的存储桶</p>
     */
    public void setDeleteBucketSet(String [] DeleteBucketSet) {
        this.DeleteBucketSet = DeleteBucketSet;
    }

    public CreateCosObjectScanTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCosObjectScanTaskRequest(CreateCosObjectScanTaskRequest source) {
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.BucketSet != null) {
            this.BucketSet = new String[source.BucketSet.length];
            for (int i = 0; i < source.BucketSet.length; i++) {
                this.BucketSet[i] = new String(source.BucketSet[i]);
            }
        }
        if (source.TaskArgs != null) {
            this.TaskArgs = new String(source.TaskArgs);
        }
        if (source.IsScanAll != null) {
            this.IsScanAll = new Boolean(source.IsScanAll);
        }
        if (source.DeleteBucketSet != null) {
            this.DeleteBucketSet = new String[source.DeleteBucketSet.length];
            for (int i = 0; i < source.DeleteBucketSet.length; i++) {
                this.DeleteBucketSet[i] = new String(source.DeleteBucketSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArraySimple(map, prefix + "BucketSet.", this.BucketSet);
        this.setParamSimple(map, prefix + "TaskArgs", this.TaskArgs);
        this.setParamSimple(map, prefix + "IsScanAll", this.IsScanAll);
        this.setParamArraySimple(map, prefix + "DeleteBucketSet.", this.DeleteBucketSet);

    }
}

