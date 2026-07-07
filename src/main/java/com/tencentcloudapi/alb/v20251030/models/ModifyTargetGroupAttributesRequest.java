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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyTargetGroupAttributesRequest extends AbstractModel {

    /**
    * 是否预览此次请求。
- **false**（默认）：发送普通请求，直接修改目标组。
- **true**：发送预览请求，检查修改目标组的参数、格式、业务限制等是否符合要求。
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
    * 健康检查配置。

    */
    @SerializedName("HealthCheckConfig")
    @Expose
    private HealthCheckConfig HealthCheckConfig;

    /**
    * 是否开启长连接。
    */
    @SerializedName("KeepaliveEnabled")
    @Expose
    private Boolean KeepaliveEnabled;

    /**
    * 调度算法。取值：
- **wrr**：加权轮训，按照权重选择后端服务器，权重越高的服务器被轮训到的概率越高。
- **wlc**：加权最小连接数，当不同后端服务器权重值相同时，当前连接数越小的后端服务器被轮询到的概率越高。
    */
    @SerializedName("SchedulerAlgorithm")
    @Expose
    private String SchedulerAlgorithm;

    /**
    * 会话保持配置。
    */
    @SerializedName("StickySessionConfig")
    @Expose
    private StickySessionConfig StickySessionConfig;

    /**
    * 目标组 ID，格式为 lbtg- 后接 8 位字母数字。
    */
    @SerializedName("TargetGroupId")
    @Expose
    private String TargetGroupId;

    /**
    * 目标组名称。长度为 1~255 个字符，可包含数字、大小写字母、中文、半角句号（.）、下划线（_）和短划线（-）。不传目标组名称时默认使用ID作为目标组名称。
    */
    @SerializedName("TargetGroupName")
    @Expose
    private String TargetGroupName;

    /**
     * Get 是否预览此次请求。
- **false**（默认）：发送普通请求，直接修改目标组。
- **true**：发送预览请求，检查修改目标组的参数、格式、业务限制等是否符合要求。 
     * @return DryRun 是否预览此次请求。
- **false**（默认）：发送普通请求，直接修改目标组。
- **true**：发送预览请求，检查修改目标组的参数、格式、业务限制等是否符合要求。
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set 是否预览此次请求。
- **false**（默认）：发送普通请求，直接修改目标组。
- **true**：发送预览请求，检查修改目标组的参数、格式、业务限制等是否符合要求。
     * @param DryRun 是否预览此次请求。
- **false**（默认）：发送普通请求，直接修改目标组。
- **true**：发送预览请求，检查修改目标组的参数、格式、业务限制等是否符合要求。
     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    /**
     * Get 健康检查配置。
 
     * @return HealthCheckConfig 健康检查配置。

     */
    public HealthCheckConfig getHealthCheckConfig() {
        return this.HealthCheckConfig;
    }

    /**
     * Set 健康检查配置。

     * @param HealthCheckConfig 健康检查配置。

     */
    public void setHealthCheckConfig(HealthCheckConfig HealthCheckConfig) {
        this.HealthCheckConfig = HealthCheckConfig;
    }

    /**
     * Get 是否开启长连接。 
     * @return KeepaliveEnabled 是否开启长连接。
     */
    public Boolean getKeepaliveEnabled() {
        return this.KeepaliveEnabled;
    }

    /**
     * Set 是否开启长连接。
     * @param KeepaliveEnabled 是否开启长连接。
     */
    public void setKeepaliveEnabled(Boolean KeepaliveEnabled) {
        this.KeepaliveEnabled = KeepaliveEnabled;
    }

    /**
     * Get 调度算法。取值：
- **wrr**：加权轮训，按照权重选择后端服务器，权重越高的服务器被轮训到的概率越高。
- **wlc**：加权最小连接数，当不同后端服务器权重值相同时，当前连接数越小的后端服务器被轮询到的概率越高。 
     * @return SchedulerAlgorithm 调度算法。取值：
- **wrr**：加权轮训，按照权重选择后端服务器，权重越高的服务器被轮训到的概率越高。
- **wlc**：加权最小连接数，当不同后端服务器权重值相同时，当前连接数越小的后端服务器被轮询到的概率越高。
     */
    public String getSchedulerAlgorithm() {
        return this.SchedulerAlgorithm;
    }

    /**
     * Set 调度算法。取值：
- **wrr**：加权轮训，按照权重选择后端服务器，权重越高的服务器被轮训到的概率越高。
- **wlc**：加权最小连接数，当不同后端服务器权重值相同时，当前连接数越小的后端服务器被轮询到的概率越高。
     * @param SchedulerAlgorithm 调度算法。取值：
- **wrr**：加权轮训，按照权重选择后端服务器，权重越高的服务器被轮训到的概率越高。
- **wlc**：加权最小连接数，当不同后端服务器权重值相同时，当前连接数越小的后端服务器被轮询到的概率越高。
     */
    public void setSchedulerAlgorithm(String SchedulerAlgorithm) {
        this.SchedulerAlgorithm = SchedulerAlgorithm;
    }

    /**
     * Get 会话保持配置。 
     * @return StickySessionConfig 会话保持配置。
     */
    public StickySessionConfig getStickySessionConfig() {
        return this.StickySessionConfig;
    }

    /**
     * Set 会话保持配置。
     * @param StickySessionConfig 会话保持配置。
     */
    public void setStickySessionConfig(StickySessionConfig StickySessionConfig) {
        this.StickySessionConfig = StickySessionConfig;
    }

    /**
     * Get 目标组 ID，格式为 lbtg- 后接 8 位字母数字。 
     * @return TargetGroupId 目标组 ID，格式为 lbtg- 后接 8 位字母数字。
     */
    public String getTargetGroupId() {
        return this.TargetGroupId;
    }

    /**
     * Set 目标组 ID，格式为 lbtg- 后接 8 位字母数字。
     * @param TargetGroupId 目标组 ID，格式为 lbtg- 后接 8 位字母数字。
     */
    public void setTargetGroupId(String TargetGroupId) {
        this.TargetGroupId = TargetGroupId;
    }

    /**
     * Get 目标组名称。长度为 1~255 个字符，可包含数字、大小写字母、中文、半角句号（.）、下划线（_）和短划线（-）。不传目标组名称时默认使用ID作为目标组名称。 
     * @return TargetGroupName 目标组名称。长度为 1~255 个字符，可包含数字、大小写字母、中文、半角句号（.）、下划线（_）和短划线（-）。不传目标组名称时默认使用ID作为目标组名称。
     */
    public String getTargetGroupName() {
        return this.TargetGroupName;
    }

    /**
     * Set 目标组名称。长度为 1~255 个字符，可包含数字、大小写字母、中文、半角句号（.）、下划线（_）和短划线（-）。不传目标组名称时默认使用ID作为目标组名称。
     * @param TargetGroupName 目标组名称。长度为 1~255 个字符，可包含数字、大小写字母、中文、半角句号（.）、下划线（_）和短划线（-）。不传目标组名称时默认使用ID作为目标组名称。
     */
    public void setTargetGroupName(String TargetGroupName) {
        this.TargetGroupName = TargetGroupName;
    }

    public ModifyTargetGroupAttributesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyTargetGroupAttributesRequest(ModifyTargetGroupAttributesRequest source) {
        if (source.DryRun != null) {
            this.DryRun = new Boolean(source.DryRun);
        }
        if (source.HealthCheckConfig != null) {
            this.HealthCheckConfig = new HealthCheckConfig(source.HealthCheckConfig);
        }
        if (source.KeepaliveEnabled != null) {
            this.KeepaliveEnabled = new Boolean(source.KeepaliveEnabled);
        }
        if (source.SchedulerAlgorithm != null) {
            this.SchedulerAlgorithm = new String(source.SchedulerAlgorithm);
        }
        if (source.StickySessionConfig != null) {
            this.StickySessionConfig = new StickySessionConfig(source.StickySessionConfig);
        }
        if (source.TargetGroupId != null) {
            this.TargetGroupId = new String(source.TargetGroupId);
        }
        if (source.TargetGroupName != null) {
            this.TargetGroupName = new String(source.TargetGroupName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);
        this.setParamObj(map, prefix + "HealthCheckConfig.", this.HealthCheckConfig);
        this.setParamSimple(map, prefix + "KeepaliveEnabled", this.KeepaliveEnabled);
        this.setParamSimple(map, prefix + "SchedulerAlgorithm", this.SchedulerAlgorithm);
        this.setParamObj(map, prefix + "StickySessionConfig.", this.StickySessionConfig);
        this.setParamSimple(map, prefix + "TargetGroupId", this.TargetGroupId);
        this.setParamSimple(map, prefix + "TargetGroupName", this.TargetGroupName);

    }
}

