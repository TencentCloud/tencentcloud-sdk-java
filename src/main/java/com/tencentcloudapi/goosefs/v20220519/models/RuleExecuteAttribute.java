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
package com.tencentcloudapi.goosefs.v20220519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleExecuteAttribute extends AbstractModel {

    /**
    * <p>执行id</p>
    */
    @SerializedName("RecordId")
    @Expose
    private String RecordId;

    /**
    * <p>开始执行时间</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>执行结束时间</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>执行状态</p><p>枚举值：</p><ul><li>0： 等待中</li><li>1： 执行中</li><li>2： 已完成</li><li>3： 已跳过</li></ul><p>默认值：0</p><p>已跳过是指任务排队超过了任务的等待时间会自动跳过</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>存储量</p><p>单位：GB</p><p>默认值：0</p><p>不足1G按照1G 统计</p>
    */
    @SerializedName("Capacity")
    @Expose
    private Long Capacity;

    /**
    * <p>文件数</p>
    */
    @SerializedName("FileCount")
    @Expose
    private Long FileCount;

    /**
    * <p>文件清单路径</p><p>参数格式：http://xxx/xxx/xx</p>
    */
    @SerializedName("ManifestUrl")
    @Expose
    private String ManifestUrl;

    /**
     * Get <p>执行id</p> 
     * @return RecordId <p>执行id</p>
     */
    public String getRecordId() {
        return this.RecordId;
    }

    /**
     * Set <p>执行id</p>
     * @param RecordId <p>执行id</p>
     */
    public void setRecordId(String RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get <p>开始执行时间</p> 
     * @return StartTime <p>开始执行时间</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始执行时间</p>
     * @param StartTime <p>开始执行时间</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>执行结束时间</p> 
     * @return EndTime <p>执行结束时间</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>执行结束时间</p>
     * @param EndTime <p>执行结束时间</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>执行状态</p><p>枚举值：</p><ul><li>0： 等待中</li><li>1： 执行中</li><li>2： 已完成</li><li>3： 已跳过</li></ul><p>默认值：0</p><p>已跳过是指任务排队超过了任务的等待时间会自动跳过</p> 
     * @return Status <p>执行状态</p><p>枚举值：</p><ul><li>0： 等待中</li><li>1： 执行中</li><li>2： 已完成</li><li>3： 已跳过</li></ul><p>默认值：0</p><p>已跳过是指任务排队超过了任务的等待时间会自动跳过</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>执行状态</p><p>枚举值：</p><ul><li>0： 等待中</li><li>1： 执行中</li><li>2： 已完成</li><li>3： 已跳过</li></ul><p>默认值：0</p><p>已跳过是指任务排队超过了任务的等待时间会自动跳过</p>
     * @param Status <p>执行状态</p><p>枚举值：</p><ul><li>0： 等待中</li><li>1： 执行中</li><li>2： 已完成</li><li>3： 已跳过</li></ul><p>默认值：0</p><p>已跳过是指任务排队超过了任务的等待时间会自动跳过</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>存储量</p><p>单位：GB</p><p>默认值：0</p><p>不足1G按照1G 统计</p> 
     * @return Capacity <p>存储量</p><p>单位：GB</p><p>默认值：0</p><p>不足1G按照1G 统计</p>
     */
    public Long getCapacity() {
        return this.Capacity;
    }

    /**
     * Set <p>存储量</p><p>单位：GB</p><p>默认值：0</p><p>不足1G按照1G 统计</p>
     * @param Capacity <p>存储量</p><p>单位：GB</p><p>默认值：0</p><p>不足1G按照1G 统计</p>
     */
    public void setCapacity(Long Capacity) {
        this.Capacity = Capacity;
    }

    /**
     * Get <p>文件数</p> 
     * @return FileCount <p>文件数</p>
     */
    public Long getFileCount() {
        return this.FileCount;
    }

    /**
     * Set <p>文件数</p>
     * @param FileCount <p>文件数</p>
     */
    public void setFileCount(Long FileCount) {
        this.FileCount = FileCount;
    }

    /**
     * Get <p>文件清单路径</p><p>参数格式：http://xxx/xxx/xx</p> 
     * @return ManifestUrl <p>文件清单路径</p><p>参数格式：http://xxx/xxx/xx</p>
     */
    public String getManifestUrl() {
        return this.ManifestUrl;
    }

    /**
     * Set <p>文件清单路径</p><p>参数格式：http://xxx/xxx/xx</p>
     * @param ManifestUrl <p>文件清单路径</p><p>参数格式：http://xxx/xxx/xx</p>
     */
    public void setManifestUrl(String ManifestUrl) {
        this.ManifestUrl = ManifestUrl;
    }

    public RuleExecuteAttribute() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleExecuteAttribute(RuleExecuteAttribute source) {
        if (source.RecordId != null) {
            this.RecordId = new String(source.RecordId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Capacity != null) {
            this.Capacity = new Long(source.Capacity);
        }
        if (source.FileCount != null) {
            this.FileCount = new Long(source.FileCount);
        }
        if (source.ManifestUrl != null) {
            this.ManifestUrl = new String(source.ManifestUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Capacity", this.Capacity);
        this.setParamSimple(map, prefix + "FileCount", this.FileCount);
        this.setParamSimple(map, prefix + "ManifestUrl", this.ManifestUrl);

    }
}

