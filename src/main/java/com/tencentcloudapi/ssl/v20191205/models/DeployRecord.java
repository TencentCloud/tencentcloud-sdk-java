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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeployRecord extends AbstractModel {

    /**
    * 总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 成功总数
    */
    @SerializedName("SuccessTotalCount")
    @Expose
    private Long SuccessTotalCount;

    /**
    * 失败总数
    */
    @SerializedName("FailedTotalCount")
    @Expose
    private Long FailedTotalCount;

    /**
    * 部署中总数
    */
    @SerializedName("RunningTotalCount")
    @Expose
    private Long RunningTotalCount;

    /**
    * 部署记录类型 0 为部署， 1 为回滚
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 部署记录详情列表
    */
    @SerializedName("RecordDetailList")
    @Expose
    private DeployRecordList [] RecordDetailList;

    /**
    * 托管资源部署状态：0 等待部署， 1 部署成功， 2 部署失败 3 部署中， 4 回滚成功， 5 回滚失败
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 托管资源创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get 总数 
     * @return TotalCount 总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总数
     * @param TotalCount 总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 成功总数 
     * @return SuccessTotalCount 成功总数
     */
    public Long getSuccessTotalCount() {
        return this.SuccessTotalCount;
    }

    /**
     * Set 成功总数
     * @param SuccessTotalCount 成功总数
     */
    public void setSuccessTotalCount(Long SuccessTotalCount) {
        this.SuccessTotalCount = SuccessTotalCount;
    }

    /**
     * Get 失败总数 
     * @return FailedTotalCount 失败总数
     */
    public Long getFailedTotalCount() {
        return this.FailedTotalCount;
    }

    /**
     * Set 失败总数
     * @param FailedTotalCount 失败总数
     */
    public void setFailedTotalCount(Long FailedTotalCount) {
        this.FailedTotalCount = FailedTotalCount;
    }

    /**
     * Get 部署中总数 
     * @return RunningTotalCount 部署中总数
     */
    public Long getRunningTotalCount() {
        return this.RunningTotalCount;
    }

    /**
     * Set 部署中总数
     * @param RunningTotalCount 部署中总数
     */
    public void setRunningTotalCount(Long RunningTotalCount) {
        this.RunningTotalCount = RunningTotalCount;
    }

    /**
     * Get 部署记录类型 0 为部署， 1 为回滚 
     * @return Type 部署记录类型 0 为部署， 1 为回滚
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 部署记录类型 0 为部署， 1 为回滚
     * @param Type 部署记录类型 0 为部署， 1 为回滚
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 部署记录详情列表 
     * @return RecordDetailList 部署记录详情列表
     */
    public DeployRecordList [] getRecordDetailList() {
        return this.RecordDetailList;
    }

    /**
     * Set 部署记录详情列表
     * @param RecordDetailList 部署记录详情列表
     */
    public void setRecordDetailList(DeployRecordList [] RecordDetailList) {
        this.RecordDetailList = RecordDetailList;
    }

    /**
     * Get 托管资源部署状态：0 等待部署， 1 部署成功， 2 部署失败 3 部署中， 4 回滚成功， 5 回滚失败 
     * @return Status 托管资源部署状态：0 等待部署， 1 部署成功， 2 部署失败 3 部署中， 4 回滚成功， 5 回滚失败
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 托管资源部署状态：0 等待部署， 1 部署成功， 2 部署失败 3 部署中， 4 回滚成功， 5 回滚失败
     * @param Status 托管资源部署状态：0 等待部署， 1 部署成功， 2 部署失败 3 部署中， 4 回滚成功， 5 回滚失败
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 托管资源创建时间 
     * @return CreateTime 托管资源创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 托管资源创建时间
     * @param CreateTime 托管资源创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public DeployRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeployRecord(DeployRecord source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.SuccessTotalCount != null) {
            this.SuccessTotalCount = new Long(source.SuccessTotalCount);
        }
        if (source.FailedTotalCount != null) {
            this.FailedTotalCount = new Long(source.FailedTotalCount);
        }
        if (source.RunningTotalCount != null) {
            this.RunningTotalCount = new Long(source.RunningTotalCount);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.RecordDetailList != null) {
            this.RecordDetailList = new DeployRecordList[source.RecordDetailList.length];
            for (int i = 0; i < source.RecordDetailList.length; i++) {
                this.RecordDetailList[i] = new DeployRecordList(source.RecordDetailList[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "SuccessTotalCount", this.SuccessTotalCount);
        this.setParamSimple(map, prefix + "FailedTotalCount", this.FailedTotalCount);
        this.setParamSimple(map, prefix + "RunningTotalCount", this.RunningTotalCount);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "RecordDetailList.", this.RecordDetailList);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

