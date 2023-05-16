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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RocketMQMessageTrack extends AbstractModel{

    /**
    * 消费者组
    */
    @SerializedName("Group")
    @Expose
    private String Group;

    /**
    * 消费状态
    */
    @SerializedName("ConsumeStatus")
    @Expose
    private String ConsumeStatus;

    /**
    * 消息track类型
    */
    @SerializedName("TrackType")
    @Expose
    private String TrackType;

    /**
    * 异常信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExceptionDesc")
    @Expose
    private String ExceptionDesc;

    /**
     * Get 消费者组 
     * @return Group 消费者组
     */
    public String getGroup() {
        return this.Group;
    }

    /**
     * Set 消费者组
     * @param Group 消费者组
     */
    public void setGroup(String Group) {
        this.Group = Group;
    }

    /**
     * Get 消费状态 
     * @return ConsumeStatus 消费状态
     */
    public String getConsumeStatus() {
        return this.ConsumeStatus;
    }

    /**
     * Set 消费状态
     * @param ConsumeStatus 消费状态
     */
    public void setConsumeStatus(String ConsumeStatus) {
        this.ConsumeStatus = ConsumeStatus;
    }

    /**
     * Get 消息track类型 
     * @return TrackType 消息track类型
     */
    public String getTrackType() {
        return this.TrackType;
    }

    /**
     * Set 消息track类型
     * @param TrackType 消息track类型
     */
    public void setTrackType(String TrackType) {
        this.TrackType = TrackType;
    }

    /**
     * Get 异常信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExceptionDesc 异常信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExceptionDesc() {
        return this.ExceptionDesc;
    }

    /**
     * Set 异常信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExceptionDesc 异常信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExceptionDesc(String ExceptionDesc) {
        this.ExceptionDesc = ExceptionDesc;
    }

    public RocketMQMessageTrack() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RocketMQMessageTrack(RocketMQMessageTrack source) {
        if (source.Group != null) {
            this.Group = new String(source.Group);
        }
        if (source.ConsumeStatus != null) {
            this.ConsumeStatus = new String(source.ConsumeStatus);
        }
        if (source.TrackType != null) {
            this.TrackType = new String(source.TrackType);
        }
        if (source.ExceptionDesc != null) {
            this.ExceptionDesc = new String(source.ExceptionDesc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Group", this.Group);
        this.setParamSimple(map, prefix + "ConsumeStatus", this.ConsumeStatus);
        this.setParamSimple(map, prefix + "TrackType", this.TrackType);
        this.setParamSimple(map, prefix + "ExceptionDesc", this.ExceptionDesc);

    }
}

