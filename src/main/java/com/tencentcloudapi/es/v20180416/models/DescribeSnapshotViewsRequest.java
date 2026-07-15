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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSnapshotViewsRequest extends AbstractModel {

    /**
    * <p>集群实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String [] InstanceId;

    /**
    * <p>快照状态，IN_PROGRESS,SUCCESS,FAILED,PARTIAL</p>
    */
    @SerializedName("State")
    @Expose
    private String [] State;

    /**
    * <p>创建方式: true(手动备份); false(自动备份); 空字符串表示全部</p>
    */
    @SerializedName("UserBackUp")
    @Expose
    private String UserBackUp;

    /**
    * <p>时间范围, 最近多少天, 0表示查询所有时间范围</p>
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
     * Get <p>集群实例ID</p> 
     * @return InstanceId <p>集群实例ID</p>
     */
    public String [] getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>集群实例ID</p>
     * @param InstanceId <p>集群实例ID</p>
     */
    public void setInstanceId(String [] InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>快照状态，IN_PROGRESS,SUCCESS,FAILED,PARTIAL</p> 
     * @return State <p>快照状态，IN_PROGRESS,SUCCESS,FAILED,PARTIAL</p>
     */
    public String [] getState() {
        return this.State;
    }

    /**
     * Set <p>快照状态，IN_PROGRESS,SUCCESS,FAILED,PARTIAL</p>
     * @param State <p>快照状态，IN_PROGRESS,SUCCESS,FAILED,PARTIAL</p>
     */
    public void setState(String [] State) {
        this.State = State;
    }

    /**
     * Get <p>创建方式: true(手动备份); false(自动备份); 空字符串表示全部</p> 
     * @return UserBackUp <p>创建方式: true(手动备份); false(自动备份); 空字符串表示全部</p>
     */
    public String getUserBackUp() {
        return this.UserBackUp;
    }

    /**
     * Set <p>创建方式: true(手动备份); false(自动备份); 空字符串表示全部</p>
     * @param UserBackUp <p>创建方式: true(手动备份); false(自动备份); 空字符串表示全部</p>
     */
    public void setUserBackUp(String UserBackUp) {
        this.UserBackUp = UserBackUp;
    }

    /**
     * Get <p>时间范围, 最近多少天, 0表示查询所有时间范围</p> 
     * @return Duration <p>时间范围, 最近多少天, 0表示查询所有时间范围</p>
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set <p>时间范围, 最近多少天, 0表示查询所有时间范围</p>
     * @param Duration <p>时间范围, 最近多少天, 0表示查询所有时间范围</p>
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    public DescribeSnapshotViewsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSnapshotViewsRequest(DescribeSnapshotViewsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String[source.InstanceId.length];
            for (int i = 0; i < source.InstanceId.length; i++) {
                this.InstanceId[i] = new String(source.InstanceId[i]);
            }
        }
        if (source.State != null) {
            this.State = new String[source.State.length];
            for (int i = 0; i < source.State.length; i++) {
                this.State[i] = new String(source.State[i]);
            }
        }
        if (source.UserBackUp != null) {
            this.UserBackUp = new String(source.UserBackUp);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceId.", this.InstanceId);
        this.setParamArraySimple(map, prefix + "State.", this.State);
        this.setParamSimple(map, prefix + "UserBackUp", this.UserBackUp);
        this.setParamSimple(map, prefix + "Duration", this.Duration);

    }
}

