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

public class SecurityHeadersToOrigin extends AbstractModel {

    /**
    * <p>Bot 标识信息回源头部配置。</p><p>枚举值：</p><ul><li>EO-Bot-Botnet-ID： 基于 Bot 请求特征生成的识别标识。</li></ul>
    */
    @SerializedName("BotIdentificationHeaders")
    @Expose
    private String [] BotIdentificationHeaders;

    /**
    * <p>高级 Bot 管理模块识别结果回源头部配置。</p><p>枚举值：</p><ul><li>EO-Bot-Client-Attestation： 高级 Bot 管理 - 客户端认证模块认证票据校验结果；</li><li>EO-Bot-Client-Risk： 高级 Bot 管理 - 客户端认证模块设备风险评估结果；</li><li>EO-Bot-Intelligence： 高级 Bot 管理 - Bot 智能分析模块识别结果；</li><li>EO-Bot-IP-Reputation： 高级 Bot 管理 - 客户端画像分析识别结果；</li><li>EO-Bot-Known-Tool： 高级 Bot 管理 - 基础特征管理 - UA 特征规则模块识别结果；</li><li>EO-Bot-Search-Engine： 高级 Bot 管理 - 基础特征管理 - 搜索引擎规则模块识别结果；</li><li>EO-Bot-Source-IDC： 高级 Bot 管理 - 基础特征管理 - IDC 规则模块识别结果；</li><li>EO-Bot-User-Risk： 高级 Bot 管理 - 客户端认证模块账号风险评估结果。</li></ul>
    */
    @SerializedName("BotManagementHeaders")
    @Expose
    private String [] BotManagementHeaders;

    /**
    * <p>客户端指纹信息回源头部配置。</p><p>枚举值：</p><ul><li>EO-Bot-Fingerprint： 客户端指纹信息。</li></ul>
    */
    @SerializedName("ClientFingerprintHeaders")
    @Expose
    private String [] ClientFingerprintHeaders;

    /**
     * Get <p>Bot 标识信息回源头部配置。</p><p>枚举值：</p><ul><li>EO-Bot-Botnet-ID： 基于 Bot 请求特征生成的识别标识。</li></ul> 
     * @return BotIdentificationHeaders <p>Bot 标识信息回源头部配置。</p><p>枚举值：</p><ul><li>EO-Bot-Botnet-ID： 基于 Bot 请求特征生成的识别标识。</li></ul>
     */
    public String [] getBotIdentificationHeaders() {
        return this.BotIdentificationHeaders;
    }

    /**
     * Set <p>Bot 标识信息回源头部配置。</p><p>枚举值：</p><ul><li>EO-Bot-Botnet-ID： 基于 Bot 请求特征生成的识别标识。</li></ul>
     * @param BotIdentificationHeaders <p>Bot 标识信息回源头部配置。</p><p>枚举值：</p><ul><li>EO-Bot-Botnet-ID： 基于 Bot 请求特征生成的识别标识。</li></ul>
     */
    public void setBotIdentificationHeaders(String [] BotIdentificationHeaders) {
        this.BotIdentificationHeaders = BotIdentificationHeaders;
    }

    /**
     * Get <p>高级 Bot 管理模块识别结果回源头部配置。</p><p>枚举值：</p><ul><li>EO-Bot-Client-Attestation： 高级 Bot 管理 - 客户端认证模块认证票据校验结果；</li><li>EO-Bot-Client-Risk： 高级 Bot 管理 - 客户端认证模块设备风险评估结果；</li><li>EO-Bot-Intelligence： 高级 Bot 管理 - Bot 智能分析模块识别结果；</li><li>EO-Bot-IP-Reputation： 高级 Bot 管理 - 客户端画像分析识别结果；</li><li>EO-Bot-Known-Tool： 高级 Bot 管理 - 基础特征管理 - UA 特征规则模块识别结果；</li><li>EO-Bot-Search-Engine： 高级 Bot 管理 - 基础特征管理 - 搜索引擎规则模块识别结果；</li><li>EO-Bot-Source-IDC： 高级 Bot 管理 - 基础特征管理 - IDC 规则模块识别结果；</li><li>EO-Bot-User-Risk： 高级 Bot 管理 - 客户端认证模块账号风险评估结果。</li></ul> 
     * @return BotManagementHeaders <p>高级 Bot 管理模块识别结果回源头部配置。</p><p>枚举值：</p><ul><li>EO-Bot-Client-Attestation： 高级 Bot 管理 - 客户端认证模块认证票据校验结果；</li><li>EO-Bot-Client-Risk： 高级 Bot 管理 - 客户端认证模块设备风险评估结果；</li><li>EO-Bot-Intelligence： 高级 Bot 管理 - Bot 智能分析模块识别结果；</li><li>EO-Bot-IP-Reputation： 高级 Bot 管理 - 客户端画像分析识别结果；</li><li>EO-Bot-Known-Tool： 高级 Bot 管理 - 基础特征管理 - UA 特征规则模块识别结果；</li><li>EO-Bot-Search-Engine： 高级 Bot 管理 - 基础特征管理 - 搜索引擎规则模块识别结果；</li><li>EO-Bot-Source-IDC： 高级 Bot 管理 - 基础特征管理 - IDC 规则模块识别结果；</li><li>EO-Bot-User-Risk： 高级 Bot 管理 - 客户端认证模块账号风险评估结果。</li></ul>
     */
    public String [] getBotManagementHeaders() {
        return this.BotManagementHeaders;
    }

    /**
     * Set <p>高级 Bot 管理模块识别结果回源头部配置。</p><p>枚举值：</p><ul><li>EO-Bot-Client-Attestation： 高级 Bot 管理 - 客户端认证模块认证票据校验结果；</li><li>EO-Bot-Client-Risk： 高级 Bot 管理 - 客户端认证模块设备风险评估结果；</li><li>EO-Bot-Intelligence： 高级 Bot 管理 - Bot 智能分析模块识别结果；</li><li>EO-Bot-IP-Reputation： 高级 Bot 管理 - 客户端画像分析识别结果；</li><li>EO-Bot-Known-Tool： 高级 Bot 管理 - 基础特征管理 - UA 特征规则模块识别结果；</li><li>EO-Bot-Search-Engine： 高级 Bot 管理 - 基础特征管理 - 搜索引擎规则模块识别结果；</li><li>EO-Bot-Source-IDC： 高级 Bot 管理 - 基础特征管理 - IDC 规则模块识别结果；</li><li>EO-Bot-User-Risk： 高级 Bot 管理 - 客户端认证模块账号风险评估结果。</li></ul>
     * @param BotManagementHeaders <p>高级 Bot 管理模块识别结果回源头部配置。</p><p>枚举值：</p><ul><li>EO-Bot-Client-Attestation： 高级 Bot 管理 - 客户端认证模块认证票据校验结果；</li><li>EO-Bot-Client-Risk： 高级 Bot 管理 - 客户端认证模块设备风险评估结果；</li><li>EO-Bot-Intelligence： 高级 Bot 管理 - Bot 智能分析模块识别结果；</li><li>EO-Bot-IP-Reputation： 高级 Bot 管理 - 客户端画像分析识别结果；</li><li>EO-Bot-Known-Tool： 高级 Bot 管理 - 基础特征管理 - UA 特征规则模块识别结果；</li><li>EO-Bot-Search-Engine： 高级 Bot 管理 - 基础特征管理 - 搜索引擎规则模块识别结果；</li><li>EO-Bot-Source-IDC： 高级 Bot 管理 - 基础特征管理 - IDC 规则模块识别结果；</li><li>EO-Bot-User-Risk： 高级 Bot 管理 - 客户端认证模块账号风险评估结果。</li></ul>
     */
    public void setBotManagementHeaders(String [] BotManagementHeaders) {
        this.BotManagementHeaders = BotManagementHeaders;
    }

    /**
     * Get <p>客户端指纹信息回源头部配置。</p><p>枚举值：</p><ul><li>EO-Bot-Fingerprint： 客户端指纹信息。</li></ul> 
     * @return ClientFingerprintHeaders <p>客户端指纹信息回源头部配置。</p><p>枚举值：</p><ul><li>EO-Bot-Fingerprint： 客户端指纹信息。</li></ul>
     */
    public String [] getClientFingerprintHeaders() {
        return this.ClientFingerprintHeaders;
    }

    /**
     * Set <p>客户端指纹信息回源头部配置。</p><p>枚举值：</p><ul><li>EO-Bot-Fingerprint： 客户端指纹信息。</li></ul>
     * @param ClientFingerprintHeaders <p>客户端指纹信息回源头部配置。</p><p>枚举值：</p><ul><li>EO-Bot-Fingerprint： 客户端指纹信息。</li></ul>
     */
    public void setClientFingerprintHeaders(String [] ClientFingerprintHeaders) {
        this.ClientFingerprintHeaders = ClientFingerprintHeaders;
    }

    public SecurityHeadersToOrigin() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityHeadersToOrigin(SecurityHeadersToOrigin source) {
        if (source.BotIdentificationHeaders != null) {
            this.BotIdentificationHeaders = new String[source.BotIdentificationHeaders.length];
            for (int i = 0; i < source.BotIdentificationHeaders.length; i++) {
                this.BotIdentificationHeaders[i] = new String(source.BotIdentificationHeaders[i]);
            }
        }
        if (source.BotManagementHeaders != null) {
            this.BotManagementHeaders = new String[source.BotManagementHeaders.length];
            for (int i = 0; i < source.BotManagementHeaders.length; i++) {
                this.BotManagementHeaders[i] = new String(source.BotManagementHeaders[i]);
            }
        }
        if (source.ClientFingerprintHeaders != null) {
            this.ClientFingerprintHeaders = new String[source.ClientFingerprintHeaders.length];
            for (int i = 0; i < source.ClientFingerprintHeaders.length; i++) {
                this.ClientFingerprintHeaders[i] = new String(source.ClientFingerprintHeaders[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "BotIdentificationHeaders.", this.BotIdentificationHeaders);
        this.setParamArraySimple(map, prefix + "BotManagementHeaders.", this.BotManagementHeaders);
        this.setParamArraySimple(map, prefix + "ClientFingerprintHeaders.", this.ClientFingerprintHeaders);

    }
}

