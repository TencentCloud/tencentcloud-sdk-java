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

public class DescribeQClawContentSecCheckRequest extends AbstractModel {

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
    private ApiGuardContent Content;

    /**
    * 标识用户的id，限速使用，不填，则限速会不生效
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 会话id
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

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
    public ApiGuardContent getContent() {
        return this.Content;
    }

    /**
     * Set 要审核的内容
     * @param Content 要审核的内容
     */
    public void setContent(ApiGuardContent Content) {
        this.Content = Content;
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
     * Get 会话id 
     * @return SessionId 会话id
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set 会话id
     * @param SessionId 会话id
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    public DescribeQClawContentSecCheckRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeQClawContentSecCheckRequest(DescribeQClawContentSecCheckRequest source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.Content != null) {
            this.Content = new ApiGuardContent(source.Content);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamObj(map, prefix + "Content.", this.Content);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);

    }
}

