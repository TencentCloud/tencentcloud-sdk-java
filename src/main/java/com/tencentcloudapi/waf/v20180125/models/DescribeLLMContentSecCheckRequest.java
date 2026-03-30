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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLLMContentSecCheckRequest extends AbstractModel {

    /**
    *  服务id,使用哪一套防护策略，就需要传哪一套服务id，模型会检测该服务id下的所有规则
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * 要审核的内容
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 流量类型，是入向流量还是出向流量，入向：1，出向：2；入向和出向必填
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 实例id，必传
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 对话的id
    */
    @SerializedName("ChatId")
    @Expose
    private String ChatId;

    /**
    * 标识用户的id，限速使用，不填，则限速会不生效
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * token使用量，不填，会采用默认的token计算方法，计算的是模型的消耗，因为该值时在出向方向上添加，即Type=2
    */
    @SerializedName("TokenUsage")
    @Expose
    private Long TokenUsage;

    /**
     * Get  服务id,使用哪一套防护策略，就需要传哪一套服务id，模型会检测该服务id下的所有规则 
     * @return ServiceId  服务id,使用哪一套防护策略，就需要传哪一套服务id，模型会检测该服务id下的所有规则
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set  服务id,使用哪一套防护策略，就需要传哪一套服务id，模型会检测该服务id下的所有规则
     * @param ServiceId  服务id,使用哪一套防护策略，就需要传哪一套服务id，模型会检测该服务id下的所有规则
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get 要审核的内容 
     * @return Content 要审核的内容
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 要审核的内容
     * @param Content 要审核的内容
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 流量类型，是入向流量还是出向流量，入向：1，出向：2；入向和出向必填 
     * @return Type 流量类型，是入向流量还是出向流量，入向：1，出向：2；入向和出向必填
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 流量类型，是入向流量还是出向流量，入向：1，出向：2；入向和出向必填
     * @param Type 流量类型，是入向流量还是出向流量，入向：1，出向：2；入向和出向必填
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 实例id，必传 
     * @return InstanceId 实例id，必传
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id，必传
     * @param InstanceId 实例id，必传
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 对话的id 
     * @return ChatId 对话的id
     */
    public String getChatId() {
        return this.ChatId;
    }

    /**
     * Set 对话的id
     * @param ChatId 对话的id
     */
    public void setChatId(String ChatId) {
        this.ChatId = ChatId;
    }

    /**
     * Get 标识用户的id，限速使用，不填，则限速会不生效 
     * @return UserId 标识用户的id，限速使用，不填，则限速会不生效
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 标识用户的id，限速使用，不填，则限速会不生效
     * @param UserId 标识用户的id，限速使用，不填，则限速会不生效
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get token使用量，不填，会采用默认的token计算方法，计算的是模型的消耗，因为该值时在出向方向上添加，即Type=2 
     * @return TokenUsage token使用量，不填，会采用默认的token计算方法，计算的是模型的消耗，因为该值时在出向方向上添加，即Type=2
     */
    public Long getTokenUsage() {
        return this.TokenUsage;
    }

    /**
     * Set token使用量，不填，会采用默认的token计算方法，计算的是模型的消耗，因为该值时在出向方向上添加，即Type=2
     * @param TokenUsage token使用量，不填，会采用默认的token计算方法，计算的是模型的消耗，因为该值时在出向方向上添加，即Type=2
     */
    public void setTokenUsage(Long TokenUsage) {
        this.TokenUsage = TokenUsage;
    }

    public DescribeLLMContentSecCheckRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLLMContentSecCheckRequest(DescribeLLMContentSecCheckRequest source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ChatId != null) {
            this.ChatId = new String(source.ChatId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.TokenUsage != null) {
            this.TokenUsage = new Long(source.TokenUsage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ChatId", this.ChatId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "TokenUsage", this.TokenUsage);

    }
}

