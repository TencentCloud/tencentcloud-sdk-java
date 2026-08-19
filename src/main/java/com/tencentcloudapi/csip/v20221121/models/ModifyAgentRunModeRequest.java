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

public class ModifyAgentRunModeRequest extends AbstractModel {

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>自定义模式配置</p>
    */
    @SerializedName("CustomPolicy")
    @Expose
    private CustomAgentRunModePolicy CustomPolicy;

    /**
    * <p>高安全防护模式quuid列表</p>
    */
    @SerializedName("AdvanceModeQuuids")
    @Expose
    private String [] AdvanceModeQuuids;

    /**
    * <p>自定义模式quuid列表</p>
    */
    @SerializedName("CustomModeQuuids")
    @Expose
    private String [] CustomModeQuuids;

    /**
    * <p>日志增强开关,0：关闭，1：打开</p>
    */
    @SerializedName("EnhanceLogMode")
    @Expose
    private Long EnhanceLogMode;

    /**
    * <p>文件查杀自动poc模式开关，0：关闭，1：打开</p>
    */
    @SerializedName("MalwarePocMode")
    @Expose
    private Long MalwarePocMode;

    /**
    * <p>五元组是否上报源端口，0:不上报，1:上报</p>
    */
    @SerializedName("ReportSourcePort")
    @Expose
    private Long ReportSourcePort;

    /**
    * <p>日志采集设置，采集TCP源端口tcp_src_port，TCP入向日志tcp_ingress，HTTP出向连接日志http_egress，HTTP入向连接日志http_ingress，应用访问日志app_access</p>
    */
    @SerializedName("LogCollectSettings")
    @Expose
    private String [] LogCollectSettings;

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

    /**
     * Get <p>自定义模式配置</p> 
     * @return CustomPolicy <p>自定义模式配置</p>
     */
    public CustomAgentRunModePolicy getCustomPolicy() {
        return this.CustomPolicy;
    }

    /**
     * Set <p>自定义模式配置</p>
     * @param CustomPolicy <p>自定义模式配置</p>
     */
    public void setCustomPolicy(CustomAgentRunModePolicy CustomPolicy) {
        this.CustomPolicy = CustomPolicy;
    }

    /**
     * Get <p>高安全防护模式quuid列表</p> 
     * @return AdvanceModeQuuids <p>高安全防护模式quuid列表</p>
     */
    public String [] getAdvanceModeQuuids() {
        return this.AdvanceModeQuuids;
    }

    /**
     * Set <p>高安全防护模式quuid列表</p>
     * @param AdvanceModeQuuids <p>高安全防护模式quuid列表</p>
     */
    public void setAdvanceModeQuuids(String [] AdvanceModeQuuids) {
        this.AdvanceModeQuuids = AdvanceModeQuuids;
    }

    /**
     * Get <p>自定义模式quuid列表</p> 
     * @return CustomModeQuuids <p>自定义模式quuid列表</p>
     */
    public String [] getCustomModeQuuids() {
        return this.CustomModeQuuids;
    }

    /**
     * Set <p>自定义模式quuid列表</p>
     * @param CustomModeQuuids <p>自定义模式quuid列表</p>
     */
    public void setCustomModeQuuids(String [] CustomModeQuuids) {
        this.CustomModeQuuids = CustomModeQuuids;
    }

    /**
     * Get <p>日志增强开关,0：关闭，1：打开</p> 
     * @return EnhanceLogMode <p>日志增强开关,0：关闭，1：打开</p>
     */
    public Long getEnhanceLogMode() {
        return this.EnhanceLogMode;
    }

    /**
     * Set <p>日志增强开关,0：关闭，1：打开</p>
     * @param EnhanceLogMode <p>日志增强开关,0：关闭，1：打开</p>
     */
    public void setEnhanceLogMode(Long EnhanceLogMode) {
        this.EnhanceLogMode = EnhanceLogMode;
    }

    /**
     * Get <p>文件查杀自动poc模式开关，0：关闭，1：打开</p> 
     * @return MalwarePocMode <p>文件查杀自动poc模式开关，0：关闭，1：打开</p>
     */
    public Long getMalwarePocMode() {
        return this.MalwarePocMode;
    }

    /**
     * Set <p>文件查杀自动poc模式开关，0：关闭，1：打开</p>
     * @param MalwarePocMode <p>文件查杀自动poc模式开关，0：关闭，1：打开</p>
     */
    public void setMalwarePocMode(Long MalwarePocMode) {
        this.MalwarePocMode = MalwarePocMode;
    }

    /**
     * Get <p>五元组是否上报源端口，0:不上报，1:上报</p> 
     * @return ReportSourcePort <p>五元组是否上报源端口，0:不上报，1:上报</p>
     */
    public Long getReportSourcePort() {
        return this.ReportSourcePort;
    }

    /**
     * Set <p>五元组是否上报源端口，0:不上报，1:上报</p>
     * @param ReportSourcePort <p>五元组是否上报源端口，0:不上报，1:上报</p>
     */
    public void setReportSourcePort(Long ReportSourcePort) {
        this.ReportSourcePort = ReportSourcePort;
    }

    /**
     * Get <p>日志采集设置，采集TCP源端口tcp_src_port，TCP入向日志tcp_ingress，HTTP出向连接日志http_egress，HTTP入向连接日志http_ingress，应用访问日志app_access</p> 
     * @return LogCollectSettings <p>日志采集设置，采集TCP源端口tcp_src_port，TCP入向日志tcp_ingress，HTTP出向连接日志http_egress，HTTP入向连接日志http_ingress，应用访问日志app_access</p>
     */
    public String [] getLogCollectSettings() {
        return this.LogCollectSettings;
    }

    /**
     * Set <p>日志采集设置，采集TCP源端口tcp_src_port，TCP入向日志tcp_ingress，HTTP出向连接日志http_egress，HTTP入向连接日志http_ingress，应用访问日志app_access</p>
     * @param LogCollectSettings <p>日志采集设置，采集TCP源端口tcp_src_port，TCP入向日志tcp_ingress，HTTP出向连接日志http_egress，HTTP入向连接日志http_ingress，应用访问日志app_access</p>
     */
    public void setLogCollectSettings(String [] LogCollectSettings) {
        this.LogCollectSettings = LogCollectSettings;
    }

    public ModifyAgentRunModeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAgentRunModeRequest(ModifyAgentRunModeRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.CustomPolicy != null) {
            this.CustomPolicy = new CustomAgentRunModePolicy(source.CustomPolicy);
        }
        if (source.AdvanceModeQuuids != null) {
            this.AdvanceModeQuuids = new String[source.AdvanceModeQuuids.length];
            for (int i = 0; i < source.AdvanceModeQuuids.length; i++) {
                this.AdvanceModeQuuids[i] = new String(source.AdvanceModeQuuids[i]);
            }
        }
        if (source.CustomModeQuuids != null) {
            this.CustomModeQuuids = new String[source.CustomModeQuuids.length];
            for (int i = 0; i < source.CustomModeQuuids.length; i++) {
                this.CustomModeQuuids[i] = new String(source.CustomModeQuuids[i]);
            }
        }
        if (source.EnhanceLogMode != null) {
            this.EnhanceLogMode = new Long(source.EnhanceLogMode);
        }
        if (source.MalwarePocMode != null) {
            this.MalwarePocMode = new Long(source.MalwarePocMode);
        }
        if (source.ReportSourcePort != null) {
            this.ReportSourcePort = new Long(source.ReportSourcePort);
        }
        if (source.LogCollectSettings != null) {
            this.LogCollectSettings = new String[source.LogCollectSettings.length];
            for (int i = 0; i < source.LogCollectSettings.length; i++) {
                this.LogCollectSettings[i] = new String(source.LogCollectSettings[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamObj(map, prefix + "CustomPolicy.", this.CustomPolicy);
        this.setParamArraySimple(map, prefix + "AdvanceModeQuuids.", this.AdvanceModeQuuids);
        this.setParamArraySimple(map, prefix + "CustomModeQuuids.", this.CustomModeQuuids);
        this.setParamSimple(map, prefix + "EnhanceLogMode", this.EnhanceLogMode);
        this.setParamSimple(map, prefix + "MalwarePocMode", this.MalwarePocMode);
        this.setParamSimple(map, prefix + "ReportSourcePort", this.ReportSourcePort);
        this.setParamArraySimple(map, prefix + "LogCollectSettings.", this.LogCollectSettings);

    }
}

