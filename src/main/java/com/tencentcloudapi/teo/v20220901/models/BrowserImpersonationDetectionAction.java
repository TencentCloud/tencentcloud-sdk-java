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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BrowserImpersonationDetectionAction extends AbstractModel {

    /**
    * Cookie 校验和会话跟踪配置。
    */
    @SerializedName("BotSessionValidation")
    @Expose
    private BotSessionValidation BotSessionValidation;

    /**
    * 客户端行为校验配置。
    */
    @SerializedName("ClientBehaviorDetection")
    @Expose
    private ClientBehaviorDetection ClientBehaviorDetection;

    /**
     * Get Cookie 校验和会话跟踪配置。 
     * @return BotSessionValidation Cookie 校验和会话跟踪配置。
     */
    public BotSessionValidation getBotSessionValidation() {
        return this.BotSessionValidation;
    }

    /**
     * Set Cookie 校验和会话跟踪配置。
     * @param BotSessionValidation Cookie 校验和会话跟踪配置。
     */
    public void setBotSessionValidation(BotSessionValidation BotSessionValidation) {
        this.BotSessionValidation = BotSessionValidation;
    }

    /**
     * Get 客户端行为校验配置。 
     * @return ClientBehaviorDetection 客户端行为校验配置。
     */
    public ClientBehaviorDetection getClientBehaviorDetection() {
        return this.ClientBehaviorDetection;
    }

    /**
     * Set 客户端行为校验配置。
     * @param ClientBehaviorDetection 客户端行为校验配置。
     */
    public void setClientBehaviorDetection(ClientBehaviorDetection ClientBehaviorDetection) {
        this.ClientBehaviorDetection = ClientBehaviorDetection;
    }

    public BrowserImpersonationDetectionAction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BrowserImpersonationDetectionAction(BrowserImpersonationDetectionAction source) {
        if (source.BotSessionValidation != null) {
            this.BotSessionValidation = new BotSessionValidation(source.BotSessionValidation);
        }
        if (source.ClientBehaviorDetection != null) {
            this.ClientBehaviorDetection = new ClientBehaviorDetection(source.ClientBehaviorDetection);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "BotSessionValidation.", this.BotSessionValidation);
        this.setParamObj(map, prefix + "ClientBehaviorDetection.", this.ClientBehaviorDetection);

    }
}

