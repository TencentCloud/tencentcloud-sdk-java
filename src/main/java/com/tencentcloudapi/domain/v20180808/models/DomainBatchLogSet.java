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
package com.tencentcloudapi.domain.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DomainBatchLogSet extends AbstractModel{

    /**
    * 日志ID
    */
    @SerializedName("LogId")
    @Expose
    private Long LogId;

    /**
    * 数量
    */
    @SerializedName("Number")
    @Expose
    private Long Number;

    /**
    * 执行状态：
doing 执行中。
done 执行完成。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 提交时间
    */
    @SerializedName("CreatedOn")
    @Expose
    private String CreatedOn;

    /**
     * Get 日志ID 
     * @return LogId 日志ID
     */
    public Long getLogId() {
        return this.LogId;
    }

    /**
     * Set 日志ID
     * @param LogId 日志ID
     */
    public void setLogId(Long LogId) {
        this.LogId = LogId;
    }

    /**
     * Get 数量 
     * @return Number 数量
     */
    public Long getNumber() {
        return this.Number;
    }

    /**
     * Set 数量
     * @param Number 数量
     */
    public void setNumber(Long Number) {
        this.Number = Number;
    }

    /**
     * Get 执行状态：
doing 执行中。
done 执行完成。 
     * @return Status 执行状态：
doing 执行中。
done 执行完成。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 执行状态：
doing 执行中。
done 执行完成。
     * @param Status 执行状态：
doing 执行中。
done 执行完成。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 提交时间 
     * @return CreatedOn 提交时间
     */
    public String getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set 提交时间
     * @param CreatedOn 提交时间
     */
    public void setCreatedOn(String CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    public DomainBatchLogSet() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DomainBatchLogSet(DomainBatchLogSet source) {
        if (source.LogId != null) {
            this.LogId = new Long(source.LogId);
        }
        if (source.Number != null) {
            this.Number = new Long(source.Number);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new String(source.CreatedOn);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogId", this.LogId);
        this.setParamSimple(map, prefix + "Number", this.Number);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);

    }
}

