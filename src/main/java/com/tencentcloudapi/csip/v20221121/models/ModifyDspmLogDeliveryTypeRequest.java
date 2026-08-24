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

public class ModifyDspmLogDeliveryTypeRequest extends AbstractModel {

    /**
    * 日志类型
    */
    @SerializedName("LogType")
    @Expose
    private Long LogType;

    /**
    * 投递的topicid
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 投递的topicname
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
     * Get 日志类型 
     * @return LogType 日志类型
     */
    public Long getLogType() {
        return this.LogType;
    }

    /**
     * Set 日志类型
     * @param LogType 日志类型
     */
    public void setLogType(Long LogType) {
        this.LogType = LogType;
    }

    /**
     * Get 投递的topicid 
     * @return TopicId 投递的topicid
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 投递的topicid
     * @param TopicId 投递的topicid
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get 投递的topicname 
     * @return TopicName 投递的topicname
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set 投递的topicname
     * @param TopicName 投递的topicname
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
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

    public ModifyDspmLogDeliveryTypeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDspmLogDeliveryTypeRequest(ModifyDspmLogDeliveryTypeRequest source) {
        if (source.LogType != null) {
            this.LogType = new Long(source.LogType);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);

    }
}

