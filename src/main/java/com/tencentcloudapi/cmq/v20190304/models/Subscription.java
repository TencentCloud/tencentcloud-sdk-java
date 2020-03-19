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

public class Subscription extends AbstractModel{

    /**
    * SubscriptionName
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubscriptionName")
    @Expose
    private String SubscriptionName;

    /**
    * SubscriptionId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubscriptionId")
    @Expose
    private String SubscriptionId;

    /**
    * TopicOwner
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopicOwner")
    @Expose
    private Long TopicOwner;

    /**
    * MsgCount
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MsgCount")
    @Expose
    private Long MsgCount;

    /**
    * LastModifyTime
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastModifyTime")
    @Expose
    private Long LastModifyTime;

    /**
    * CreateTime
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * BindingKey
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BindingKey")
    @Expose
    private String [] BindingKey;

    /**
    * Endpoint
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Endpoint")
    @Expose
    private String Endpoint;

    /**
    * FilterTags
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FilterTags")
    @Expose
    private String [] FilterTags;

    /**
    * Protocol
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * NotifyStrategy
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NotifyStrategy")
    @Expose
    private String NotifyStrategy;

    /**
    * NotifyContentFormat
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NotifyContentFormat")
    @Expose
    private String NotifyContentFormat;

    /**
     * Get SubscriptionName
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubscriptionName SubscriptionName
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubscriptionName() {
        return this.SubscriptionName;
    }

    /**
     * Set SubscriptionName
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubscriptionName SubscriptionName
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubscriptionName(String SubscriptionName) {
        this.SubscriptionName = SubscriptionName;
    }

    /**
     * Get SubscriptionId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubscriptionId SubscriptionId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubscriptionId() {
        return this.SubscriptionId;
    }

    /**
     * Set SubscriptionId
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubscriptionId SubscriptionId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubscriptionId(String SubscriptionId) {
        this.SubscriptionId = SubscriptionId;
    }

    /**
     * Get TopicOwner
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopicOwner TopicOwner
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTopicOwner() {
        return this.TopicOwner;
    }

    /**
     * Set TopicOwner
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopicOwner TopicOwner
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopicOwner(Long TopicOwner) {
        this.TopicOwner = TopicOwner;
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
     * Get BindingKey
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BindingKey BindingKey
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getBindingKey() {
        return this.BindingKey;
    }

    /**
     * Set BindingKey
注意：此字段可能返回 null，表示取不到有效值。
     * @param BindingKey BindingKey
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBindingKey(String [] BindingKey) {
        this.BindingKey = BindingKey;
    }

    /**
     * Get Endpoint
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Endpoint Endpoint
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndpoint() {
        return this.Endpoint;
    }

    /**
     * Set Endpoint
注意：此字段可能返回 null，表示取不到有效值。
     * @param Endpoint Endpoint
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndpoint(String Endpoint) {
        this.Endpoint = Endpoint;
    }

    /**
     * Get FilterTags
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FilterTags FilterTags
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getFilterTags() {
        return this.FilterTags;
    }

    /**
     * Set FilterTags
注意：此字段可能返回 null，表示取不到有效值。
     * @param FilterTags FilterTags
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFilterTags(String [] FilterTags) {
        this.FilterTags = FilterTags;
    }

    /**
     * Get Protocol
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Protocol Protocol
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Protocol
注意：此字段可能返回 null，表示取不到有效值。
     * @param Protocol Protocol
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get NotifyStrategy
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NotifyStrategy NotifyStrategy
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNotifyStrategy() {
        return this.NotifyStrategy;
    }

    /**
     * Set NotifyStrategy
注意：此字段可能返回 null，表示取不到有效值。
     * @param NotifyStrategy NotifyStrategy
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNotifyStrategy(String NotifyStrategy) {
        this.NotifyStrategy = NotifyStrategy;
    }

    /**
     * Get NotifyContentFormat
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NotifyContentFormat NotifyContentFormat
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNotifyContentFormat() {
        return this.NotifyContentFormat;
    }

    /**
     * Set NotifyContentFormat
注意：此字段可能返回 null，表示取不到有效值。
     * @param NotifyContentFormat NotifyContentFormat
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNotifyContentFormat(String NotifyContentFormat) {
        this.NotifyContentFormat = NotifyContentFormat;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubscriptionName", this.SubscriptionName);
        this.setParamSimple(map, prefix + "SubscriptionId", this.SubscriptionId);
        this.setParamSimple(map, prefix + "TopicOwner", this.TopicOwner);
        this.setParamSimple(map, prefix + "MsgCount", this.MsgCount);
        this.setParamSimple(map, prefix + "LastModifyTime", this.LastModifyTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamArraySimple(map, prefix + "BindingKey.", this.BindingKey);
        this.setParamSimple(map, prefix + "Endpoint", this.Endpoint);
        this.setParamArraySimple(map, prefix + "FilterTags.", this.FilterTags);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "NotifyStrategy", this.NotifyStrategy);
        this.setParamSimple(map, prefix + "NotifyContentFormat", this.NotifyContentFormat);

    }
}

