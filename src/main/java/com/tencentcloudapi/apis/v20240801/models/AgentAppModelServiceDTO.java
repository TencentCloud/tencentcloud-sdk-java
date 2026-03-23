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
package com.tencentcloudapi.apis.v20240801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AgentAppModelServiceDTO extends AbstractModel {

    /**
    * 模型服务ID
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * 是否开启流量控制
    */
    @SerializedName("InvokeLimitConfigStatus")
    @Expose
    private Boolean InvokeLimitConfigStatus;

    /**
    * 流量控制
    */
    @SerializedName("InvokeLimitConfig")
    @Expose
    private InvokeLimitConfigDTO InvokeLimitConfig;

    /**
    * 是否开启token控制
    */
    @SerializedName("TokenLimitStatus")
    @Expose
    private Boolean TokenLimitStatus;

    /**
    * token控制
    */
    @SerializedName("TokenLimitConfig")
    @Expose
    private TokenLimitConfigDTO TokenLimitConfig;

    /**
     * Get 模型服务ID 
     * @return ID 模型服务ID
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set 模型服务ID
     * @param ID 模型服务ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get 是否开启流量控制 
     * @return InvokeLimitConfigStatus 是否开启流量控制
     */
    public Boolean getInvokeLimitConfigStatus() {
        return this.InvokeLimitConfigStatus;
    }

    /**
     * Set 是否开启流量控制
     * @param InvokeLimitConfigStatus 是否开启流量控制
     */
    public void setInvokeLimitConfigStatus(Boolean InvokeLimitConfigStatus) {
        this.InvokeLimitConfigStatus = InvokeLimitConfigStatus;
    }

    /**
     * Get 流量控制 
     * @return InvokeLimitConfig 流量控制
     */
    public InvokeLimitConfigDTO getInvokeLimitConfig() {
        return this.InvokeLimitConfig;
    }

    /**
     * Set 流量控制
     * @param InvokeLimitConfig 流量控制
     */
    public void setInvokeLimitConfig(InvokeLimitConfigDTO InvokeLimitConfig) {
        this.InvokeLimitConfig = InvokeLimitConfig;
    }

    /**
     * Get 是否开启token控制 
     * @return TokenLimitStatus 是否开启token控制
     */
    public Boolean getTokenLimitStatus() {
        return this.TokenLimitStatus;
    }

    /**
     * Set 是否开启token控制
     * @param TokenLimitStatus 是否开启token控制
     */
    public void setTokenLimitStatus(Boolean TokenLimitStatus) {
        this.TokenLimitStatus = TokenLimitStatus;
    }

    /**
     * Get token控制 
     * @return TokenLimitConfig token控制
     */
    public TokenLimitConfigDTO getTokenLimitConfig() {
        return this.TokenLimitConfig;
    }

    /**
     * Set token控制
     * @param TokenLimitConfig token控制
     */
    public void setTokenLimitConfig(TokenLimitConfigDTO TokenLimitConfig) {
        this.TokenLimitConfig = TokenLimitConfig;
    }

    public AgentAppModelServiceDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentAppModelServiceDTO(AgentAppModelServiceDTO source) {
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
        if (source.InvokeLimitConfigStatus != null) {
            this.InvokeLimitConfigStatus = new Boolean(source.InvokeLimitConfigStatus);
        }
        if (source.InvokeLimitConfig != null) {
            this.InvokeLimitConfig = new InvokeLimitConfigDTO(source.InvokeLimitConfig);
        }
        if (source.TokenLimitStatus != null) {
            this.TokenLimitStatus = new Boolean(source.TokenLimitStatus);
        }
        if (source.TokenLimitConfig != null) {
            this.TokenLimitConfig = new TokenLimitConfigDTO(source.TokenLimitConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "InvokeLimitConfigStatus", this.InvokeLimitConfigStatus);
        this.setParamObj(map, prefix + "InvokeLimitConfig.", this.InvokeLimitConfig);
        this.setParamSimple(map, prefix + "TokenLimitStatus", this.TokenLimitStatus);
        this.setParamObj(map, prefix + "TokenLimitConfig.", this.TokenLimitConfig);

    }
}

