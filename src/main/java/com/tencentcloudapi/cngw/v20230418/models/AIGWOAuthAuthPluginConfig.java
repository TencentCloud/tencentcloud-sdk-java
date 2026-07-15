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
package com.tencentcloudapi.cngw.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AIGWOAuthAuthPluginConfig extends AbstractModel {

    /**
    * <p>取token的头部名称</p>
    */
    @SerializedName("HeaderNames")
    @Expose
    private String [] HeaderNames;

    /**
    * <p>过期时间</p>
    */
    @SerializedName("TokenExpiration")
    @Expose
    private Long TokenExpiration;

    /**
    * <p>授权范围</p>
    */
    @SerializedName("Scopes")
    @Expose
    private String [] Scopes;

    /**
    * <p>是否强制判断授权范围</p>
    */
    @SerializedName("MandatoryScope")
    @Expose
    private Boolean MandatoryScope;

    /**
     * Get <p>取token的头部名称</p> 
     * @return HeaderNames <p>取token的头部名称</p>
     */
    public String [] getHeaderNames() {
        return this.HeaderNames;
    }

    /**
     * Set <p>取token的头部名称</p>
     * @param HeaderNames <p>取token的头部名称</p>
     */
    public void setHeaderNames(String [] HeaderNames) {
        this.HeaderNames = HeaderNames;
    }

    /**
     * Get <p>过期时间</p> 
     * @return TokenExpiration <p>过期时间</p>
     */
    public Long getTokenExpiration() {
        return this.TokenExpiration;
    }

    /**
     * Set <p>过期时间</p>
     * @param TokenExpiration <p>过期时间</p>
     */
    public void setTokenExpiration(Long TokenExpiration) {
        this.TokenExpiration = TokenExpiration;
    }

    /**
     * Get <p>授权范围</p> 
     * @return Scopes <p>授权范围</p>
     */
    public String [] getScopes() {
        return this.Scopes;
    }

    /**
     * Set <p>授权范围</p>
     * @param Scopes <p>授权范围</p>
     */
    public void setScopes(String [] Scopes) {
        this.Scopes = Scopes;
    }

    /**
     * Get <p>是否强制判断授权范围</p> 
     * @return MandatoryScope <p>是否强制判断授权范围</p>
     */
    public Boolean getMandatoryScope() {
        return this.MandatoryScope;
    }

    /**
     * Set <p>是否强制判断授权范围</p>
     * @param MandatoryScope <p>是否强制判断授权范围</p>
     */
    public void setMandatoryScope(Boolean MandatoryScope) {
        this.MandatoryScope = MandatoryScope;
    }

    public AIGWOAuthAuthPluginConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIGWOAuthAuthPluginConfig(AIGWOAuthAuthPluginConfig source) {
        if (source.HeaderNames != null) {
            this.HeaderNames = new String[source.HeaderNames.length];
            for (int i = 0; i < source.HeaderNames.length; i++) {
                this.HeaderNames[i] = new String(source.HeaderNames[i]);
            }
        }
        if (source.TokenExpiration != null) {
            this.TokenExpiration = new Long(source.TokenExpiration);
        }
        if (source.Scopes != null) {
            this.Scopes = new String[source.Scopes.length];
            for (int i = 0; i < source.Scopes.length; i++) {
                this.Scopes[i] = new String(source.Scopes[i]);
            }
        }
        if (source.MandatoryScope != null) {
            this.MandatoryScope = new Boolean(source.MandatoryScope);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "HeaderNames.", this.HeaderNames);
        this.setParamSimple(map, prefix + "TokenExpiration", this.TokenExpiration);
        this.setParamArraySimple(map, prefix + "Scopes.", this.Scopes);
        this.setParamSimple(map, prefix + "MandatoryScope", this.MandatoryScope);

    }
}

