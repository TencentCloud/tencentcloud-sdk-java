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
    * <p>服务id,使用哪一套防护策略，就需要传哪一套服务id，模型会检测该服务id下的所有规则</p>
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * <p>流量类型，是入向流量还是出向流量，入向：1，出向：2；入向和出向必填</p>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>实例id，必传</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>要审核的内容</p>
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * <p>对话的id</p>
    */
    @SerializedName("ChatId")
    @Expose
    private String ChatId;

    /**
    * <p>标识用户的id，限速使用，不填，则限速会不生效</p>
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * <p>token使用量，不填，会采用默认的token计算方法，计算的是模型的消耗，因为该值时在出向方向上添加，即Type=2</p>
    */
    @SerializedName("TokenUsage")
    @Expose
    private Long TokenUsage;

    /**
    * <p>图片base64编码后的数据,body大小最大支持10M</p>
    */
    @SerializedName("ImageEncode")
    @Expose
    private String ImageEncode;

    /**
     * Get <p>服务id,使用哪一套防护策略，就需要传哪一套服务id，模型会检测该服务id下的所有规则</p> 
     * @return ServiceId <p>服务id,使用哪一套防护策略，就需要传哪一套服务id，模型会检测该服务id下的所有规则</p>
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set <p>服务id,使用哪一套防护策略，就需要传哪一套服务id，模型会检测该服务id下的所有规则</p>
     * @param ServiceId <p>服务id,使用哪一套防护策略，就需要传哪一套服务id，模型会检测该服务id下的所有规则</p>
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get <p>流量类型，是入向流量还是出向流量，入向：1，出向：2；入向和出向必填</p> 
     * @return Type <p>流量类型，是入向流量还是出向流量，入向：1，出向：2；入向和出向必填</p>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>流量类型，是入向流量还是出向流量，入向：1，出向：2；入向和出向必填</p>
     * @param Type <p>流量类型，是入向流量还是出向流量，入向：1，出向：2；入向和出向必填</p>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>实例id，必传</p> 
     * @return InstanceId <p>实例id，必传</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例id，必传</p>
     * @param InstanceId <p>实例id，必传</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>要审核的内容</p> 
     * @return Content <p>要审核的内容</p>
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set <p>要审核的内容</p>
     * @param Content <p>要审核的内容</p>
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get <p>对话的id</p> 
     * @return ChatId <p>对话的id</p>
     */
    public String getChatId() {
        return this.ChatId;
    }

    /**
     * Set <p>对话的id</p>
     * @param ChatId <p>对话的id</p>
     */
    public void setChatId(String ChatId) {
        this.ChatId = ChatId;
    }

    /**
     * Get <p>标识用户的id，限速使用，不填，则限速会不生效</p> 
     * @return UserId <p>标识用户的id，限速使用，不填，则限速会不生效</p>
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set <p>标识用户的id，限速使用，不填，则限速会不生效</p>
     * @param UserId <p>标识用户的id，限速使用，不填，则限速会不生效</p>
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get <p>token使用量，不填，会采用默认的token计算方法，计算的是模型的消耗，因为该值时在出向方向上添加，即Type=2</p> 
     * @return TokenUsage <p>token使用量，不填，会采用默认的token计算方法，计算的是模型的消耗，因为该值时在出向方向上添加，即Type=2</p>
     */
    public Long getTokenUsage() {
        return this.TokenUsage;
    }

    /**
     * Set <p>token使用量，不填，会采用默认的token计算方法，计算的是模型的消耗，因为该值时在出向方向上添加，即Type=2</p>
     * @param TokenUsage <p>token使用量，不填，会采用默认的token计算方法，计算的是模型的消耗，因为该值时在出向方向上添加，即Type=2</p>
     */
    public void setTokenUsage(Long TokenUsage) {
        this.TokenUsage = TokenUsage;
    }

    /**
     * Get <p>图片base64编码后的数据,body大小最大支持10M</p> 
     * @return ImageEncode <p>图片base64编码后的数据,body大小最大支持10M</p>
     */
    public String getImageEncode() {
        return this.ImageEncode;
    }

    /**
     * Set <p>图片base64编码后的数据,body大小最大支持10M</p>
     * @param ImageEncode <p>图片base64编码后的数据,body大小最大支持10M</p>
     */
    public void setImageEncode(String ImageEncode) {
        this.ImageEncode = ImageEncode;
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
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
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
        if (source.ImageEncode != null) {
            this.ImageEncode = new String(source.ImageEncode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "ChatId", this.ChatId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "TokenUsage", this.TokenUsage);
        this.setParamSimple(map, prefix + "ImageEncode", this.ImageEncode);

    }
}

