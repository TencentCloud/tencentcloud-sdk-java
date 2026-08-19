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

public class ScanCSIPTaskAgainRequest extends AbstractModel {

    /**
    * <p>扫描任务ID</p>
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>限定本次重扫的目标主机列表；为空时取主表对应子表的全量 实例ID；长度上限 1000</p>
    */
    @SerializedName("InstanceIDList")
    @Expose
    private String [] InstanceIDList;

    /**
    * <p>扫描超时时长（秒），可选。非零时更新一键扫描超时配置并同步更新子表 timeout 字段。上限 7200 秒（2小时），超出返回 InvalidParameter。</p>
    */
    @SerializedName("TimeoutPeriod")
    @Expose
    private Long TimeoutPeriod;

    /**
     * Get <p>扫描任务ID</p> 
     * @return TaskId <p>扫描任务ID</p>
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>扫描任务ID</p>
     * @param TaskId <p>扫描任务ID</p>
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
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
     * Get <p>限定本次重扫的目标主机列表；为空时取主表对应子表的全量 实例ID；长度上限 1000</p> 
     * @return InstanceIDList <p>限定本次重扫的目标主机列表；为空时取主表对应子表的全量 实例ID；长度上限 1000</p>
     */
    public String [] getInstanceIDList() {
        return this.InstanceIDList;
    }

    /**
     * Set <p>限定本次重扫的目标主机列表；为空时取主表对应子表的全量 实例ID；长度上限 1000</p>
     * @param InstanceIDList <p>限定本次重扫的目标主机列表；为空时取主表对应子表的全量 实例ID；长度上限 1000</p>
     */
    public void setInstanceIDList(String [] InstanceIDList) {
        this.InstanceIDList = InstanceIDList;
    }

    /**
     * Get <p>扫描超时时长（秒），可选。非零时更新一键扫描超时配置并同步更新子表 timeout 字段。上限 7200 秒（2小时），超出返回 InvalidParameter。</p> 
     * @return TimeoutPeriod <p>扫描超时时长（秒），可选。非零时更新一键扫描超时配置并同步更新子表 timeout 字段。上限 7200 秒（2小时），超出返回 InvalidParameter。</p>
     */
    public Long getTimeoutPeriod() {
        return this.TimeoutPeriod;
    }

    /**
     * Set <p>扫描超时时长（秒），可选。非零时更新一键扫描超时配置并同步更新子表 timeout 字段。上限 7200 秒（2小时），超出返回 InvalidParameter。</p>
     * @param TimeoutPeriod <p>扫描超时时长（秒），可选。非零时更新一键扫描超时配置并同步更新子表 timeout 字段。上限 7200 秒（2小时），超出返回 InvalidParameter。</p>
     */
    public void setTimeoutPeriod(Long TimeoutPeriod) {
        this.TimeoutPeriod = TimeoutPeriod;
    }

    public ScanCSIPTaskAgainRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScanCSIPTaskAgainRequest(ScanCSIPTaskAgainRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.InstanceIDList != null) {
            this.InstanceIDList = new String[source.InstanceIDList.length];
            for (int i = 0; i < source.InstanceIDList.length; i++) {
                this.InstanceIDList[i] = new String(source.InstanceIDList[i]);
            }
        }
        if (source.TimeoutPeriod != null) {
            this.TimeoutPeriod = new Long(source.TimeoutPeriod);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArraySimple(map, prefix + "InstanceIDList.", this.InstanceIDList);
        this.setParamSimple(map, prefix + "TimeoutPeriod", this.TimeoutPeriod);

    }
}

