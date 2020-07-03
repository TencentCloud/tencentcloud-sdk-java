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
package com.tencentcloudapi.ms.v20180408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateScanInstancesResponse extends AbstractModel{

    /**
    * 任务唯一标识
    */
    @SerializedName("ItemId")
    @Expose
    private String ItemId;

    /**
    * 任务状态: 1-已完成,2-处理中,3-处理出错,4-处理超时
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * 提交成功的app的md5集合
    */
    @SerializedName("AppMd5s")
    @Expose
    private String [] AppMd5s;

    /**
    * 剩余可用次数
    */
    @SerializedName("LimitCount")
    @Expose
    private Long LimitCount;

    /**
    * 到期时间
    */
    @SerializedName("LimitTime")
    @Expose
    private Long LimitTime;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 任务唯一标识 
     * @return ItemId 任务唯一标识
     */
    public String getItemId() {
        return this.ItemId;
    }

    /**
     * Set 任务唯一标识
     * @param ItemId 任务唯一标识
     */
    public void setItemId(String ItemId) {
        this.ItemId = ItemId;
    }

    /**
     * Get 任务状态: 1-已完成,2-处理中,3-处理出错,4-处理超时 
     * @return Progress 任务状态: 1-已完成,2-处理中,3-处理出错,4-处理超时
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set 任务状态: 1-已完成,2-处理中,3-处理出错,4-处理超时
     * @param Progress 任务状态: 1-已完成,2-处理中,3-处理出错,4-处理超时
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get 提交成功的app的md5集合 
     * @return AppMd5s 提交成功的app的md5集合
     */
    public String [] getAppMd5s() {
        return this.AppMd5s;
    }

    /**
     * Set 提交成功的app的md5集合
     * @param AppMd5s 提交成功的app的md5集合
     */
    public void setAppMd5s(String [] AppMd5s) {
        this.AppMd5s = AppMd5s;
    }

    /**
     * Get 剩余可用次数 
     * @return LimitCount 剩余可用次数
     */
    public Long getLimitCount() {
        return this.LimitCount;
    }

    /**
     * Set 剩余可用次数
     * @param LimitCount 剩余可用次数
     */
    public void setLimitCount(Long LimitCount) {
        this.LimitCount = LimitCount;
    }

    /**
     * Get 到期时间 
     * @return LimitTime 到期时间
     */
    public Long getLimitTime() {
        return this.LimitTime;
    }

    /**
     * Set 到期时间
     * @param LimitTime 到期时间
     */
    public void setLimitTime(Long LimitTime) {
        this.LimitTime = LimitTime;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ItemId", this.ItemId);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamArraySimple(map, prefix + "AppMd5s.", this.AppMd5s);
        this.setParamSimple(map, prefix + "LimitCount", this.LimitCount);
        this.setParamSimple(map, prefix + "LimitTime", this.LimitTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

