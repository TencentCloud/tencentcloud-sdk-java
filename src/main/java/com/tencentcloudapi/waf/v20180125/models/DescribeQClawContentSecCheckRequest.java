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
    * <p>服务id,使用哪一套防护策略，就需要传哪一套服务id，模型会检测该服务id下的所有规则</p>
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * <p>要审核的内容</p>
    */
    @SerializedName("Content")
    @Expose
    private ApiGuardContent Content;

    /**
    * <p>标识用户的id，限速使用，不填，则限速会不生效</p>
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * <p>会话id</p>
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * <p>工具名称</p>
    */
    @SerializedName("ToolName")
    @Expose
    private String ToolName;

    /**
    * <p>工具执行的参数</p>
    */
    @SerializedName("ToolArgs")
    @Expose
    private String ToolArgs;

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
     * Get <p>要审核的内容</p> 
     * @return Content <p>要审核的内容</p>
     */
    public ApiGuardContent getContent() {
        return this.Content;
    }

    /**
     * Set <p>要审核的内容</p>
     * @param Content <p>要审核的内容</p>
     */
    public void setContent(ApiGuardContent Content) {
        this.Content = Content;
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
     * Get <p>会话id</p> 
     * @return SessionId <p>会话id</p>
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set <p>会话id</p>
     * @param SessionId <p>会话id</p>
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get <p>工具名称</p> 
     * @return ToolName <p>工具名称</p>
     */
    public String getToolName() {
        return this.ToolName;
    }

    /**
     * Set <p>工具名称</p>
     * @param ToolName <p>工具名称</p>
     */
    public void setToolName(String ToolName) {
        this.ToolName = ToolName;
    }

    /**
     * Get <p>工具执行的参数</p> 
     * @return ToolArgs <p>工具执行的参数</p>
     */
    public String getToolArgs() {
        return this.ToolArgs;
    }

    /**
     * Set <p>工具执行的参数</p>
     * @param ToolArgs <p>工具执行的参数</p>
     */
    public void setToolArgs(String ToolArgs) {
        this.ToolArgs = ToolArgs;
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
        if (source.ToolName != null) {
            this.ToolName = new String(source.ToolName);
        }
        if (source.ToolArgs != null) {
            this.ToolArgs = new String(source.ToolArgs);
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
        this.setParamSimple(map, prefix + "ToolName", this.ToolName);
        this.setParamSimple(map, prefix + "ToolArgs", this.ToolArgs);

    }
}

