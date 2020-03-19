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
package com.tencentcloudapi.cmq.v20190304.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TopicSet extends AbstractModel{

    /**
    * TopicId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * TopicName
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * MsgRetentionSeconds
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MsgRetentionSeconds")
    @Expose
    private Long MsgRetentionSeconds;

    /**
    * MaxMsgSize
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxMsgSize")
    @Expose
    private Long MaxMsgSize;

    /**
    * Qps
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Qps")
    @Expose
    private Long Qps;

    /**
    * FilterType
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FilterType")
    @Expose
    private Long FilterType;

    /**
    * CreateTime
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * LastModifyTime
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastModifyTime")
    @Expose
    private Long LastModifyTime;

    /**
    * MsgCount
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MsgCount")
    @Expose
    private Long MsgCount;

    /**
    * CreateUin
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateUin")
    @Expose
    private Long CreateUin;

    /**
    * Tags
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 主题是否开启消息轨迹，true表示开启，false表示不开启
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Trace")
    @Expose
    private Boolean Trace;

    /**
     * Get TopicId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopicId TopicId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set TopicId
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopicId TopicId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get TopicName
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopicName TopicName
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set TopicName
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopicName TopicName
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get MsgRetentionSeconds
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MsgRetentionSeconds MsgRetentionSeconds
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMsgRetentionSeconds() {
        return this.MsgRetentionSeconds;
    }

    /**
     * Set MsgRetentionSeconds
注意：此字段可能返回 null，表示取不到有效值。
     * @param MsgRetentionSeconds MsgRetentionSeconds
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMsgRetentionSeconds(Long MsgRetentionSeconds) {
        this.MsgRetentionSeconds = MsgRetentionSeconds;
    }

    /**
     * Get MaxMsgSize
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxMsgSize MaxMsgSize
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxMsgSize() {
        return this.MaxMsgSize;
    }

    /**
     * Set MaxMsgSize
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxMsgSize MaxMsgSize
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxMsgSize(Long MaxMsgSize) {
        this.MaxMsgSize = MaxMsgSize;
    }

    /**
     * Get Qps
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Qps Qps
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getQps() {
        return this.Qps;
    }

    /**
     * Set Qps
注意：此字段可能返回 null，表示取不到有效值。
     * @param Qps Qps
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQps(Long Qps) {
        this.Qps = Qps;
    }

    /**
     * Get FilterType
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FilterType FilterType
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFilterType() {
        return this.FilterType;
    }

    /**
     * Set FilterType
注意：此字段可能返回 null，表示取不到有效值。
     * @param FilterType FilterType
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFilterType(Long FilterType) {
        this.FilterType = FilterType;
    }

    /**
     * Get CreateTime
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime CreateTime
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set CreateTime
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime CreateTime
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get LastModifyTime
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastModifyTime LastModifyTime
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLastModifyTime() {
        return this.LastModifyTime;
    }

    /**
     * Set LastModifyTime
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastModifyTime LastModifyTime
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastModifyTime(Long LastModifyTime) {
        this.LastModifyTime = LastModifyTime;
    }

    /**
     * Get MsgCount
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MsgCount MsgCount
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMsgCount() {
        return this.MsgCount;
    }

    /**
     * Set MsgCount
注意：此字段可能返回 null，表示取不到有效值。
     * @param MsgCount MsgCount
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMsgCount(Long MsgCount) {
        this.MsgCount = MsgCount;
    }

    /**
     * Get CreateUin
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateUin CreateUin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreateUin() {
        return this.CreateUin;
    }

    /**
     * Set CreateUin
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateUin CreateUin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateUin(Long CreateUin) {
        this.CreateUin = CreateUin;
    }

    /**
     * Get Tags
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags Tags
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tags
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags Tags
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 主题是否开启消息轨迹，true表示开启，false表示不开启
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Trace 主题是否开启消息轨迹，true表示开启，false表示不开启
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getTrace() {
        return this.Trace;
    }

    /**
     * Set 主题是否开启消息轨迹，true表示开启，false表示不开启
注意：此字段可能返回 null，表示取不到有效值。
     * @param Trace 主题是否开启消息轨迹，true表示开启，false表示不开启
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTrace(Boolean Trace) {
        this.Trace = Trace;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "MsgRetentionSeconds", this.MsgRetentionSeconds);
        this.setParamSimple(map, prefix + "MaxMsgSize", this.MaxMsgSize);
        this.setParamSimple(map, prefix + "Qps", this.Qps);
        this.setParamSimple(map, prefix + "FilterType", this.FilterType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "LastModifyTime", this.LastModifyTime);
        this.setParamSimple(map, prefix + "MsgCount", this.MsgCount);
        this.setParamSimple(map, prefix + "CreateUin", this.CreateUin);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Trace", this.Trace);

    }
}

