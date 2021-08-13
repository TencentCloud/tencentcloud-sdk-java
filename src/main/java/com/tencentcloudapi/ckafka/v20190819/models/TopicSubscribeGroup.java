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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TopicSubscribeGroup extends AbstractModel{

    /**
    * 总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 消费分组状态数量信息
    */
    @SerializedName("StatusCountInfo")
    @Expose
    private String StatusCountInfo;

    /**
    * 消费分组信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupsInfo")
    @Expose
    private GroupInfoResponse [] GroupsInfo;

    /**
    * 此次请求是否异步的状态。实例里分组较少的会直接返回结果,Status为1。当分组较多时,会异步更新缓存，Status为0时不会返回分组信息，直至Status为1更新完毕返回结果。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

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
     * Get 消费分组状态数量信息 
     * @return StatusCountInfo 消费分组状态数量信息
     */
    public String getStatusCountInfo() {
        return this.StatusCountInfo;
    }

    /**
     * Set 消费分组状态数量信息
     * @param StatusCountInfo 消费分组状态数量信息
     */
    public void setStatusCountInfo(String StatusCountInfo) {
        this.StatusCountInfo = StatusCountInfo;
    }

    /**
     * Get 消费分组信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupsInfo 消费分组信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public GroupInfoResponse [] getGroupsInfo() {
        return this.GroupsInfo;
    }

    /**
     * Set 消费分组信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupsInfo 消费分组信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupsInfo(GroupInfoResponse [] GroupsInfo) {
        this.GroupsInfo = GroupsInfo;
    }

    /**
     * Get 此次请求是否异步的状态。实例里分组较少的会直接返回结果,Status为1。当分组较多时,会异步更新缓存，Status为0时不会返回分组信息，直至Status为1更新完毕返回结果。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 此次请求是否异步的状态。实例里分组较少的会直接返回结果,Status为1。当分组较多时,会异步更新缓存，Status为0时不会返回分组信息，直至Status为1更新完毕返回结果。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 此次请求是否异步的状态。实例里分组较少的会直接返回结果,Status为1。当分组较多时,会异步更新缓存，Status为0时不会返回分组信息，直至Status为1更新完毕返回结果。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 此次请求是否异步的状态。实例里分组较少的会直接返回结果,Status为1。当分组较多时,会异步更新缓存，Status为0时不会返回分组信息，直至Status为1更新完毕返回结果。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public TopicSubscribeGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TopicSubscribeGroup(TopicSubscribeGroup source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.StatusCountInfo != null) {
            this.StatusCountInfo = new String(source.StatusCountInfo);
        }
        if (source.GroupsInfo != null) {
            this.GroupsInfo = new GroupInfoResponse[source.GroupsInfo.length];
            for (int i = 0; i < source.GroupsInfo.length; i++) {
                this.GroupsInfo[i] = new GroupInfoResponse(source.GroupsInfo[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "StatusCountInfo", this.StatusCountInfo);
        this.setParamArrayObj(map, prefix + "GroupsInfo.", this.GroupsInfo);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

