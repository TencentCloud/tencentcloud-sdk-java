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

public class FaultToleranceDTO extends AbstractModel {

    /**
    * <p>是否启用API Key容错配置</p>
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * <p>异常判定状态码，固定3位数字或字母</p>
    */
    @SerializedName("ErrorCodes")
    @Expose
    private String [] ErrorCodes;

    /**
    * <p>连续异常次数</p><p>单位：次</p>
    */
    @SerializedName("ErrorCount")
    @Expose
    private Long ErrorCount;

    /**
    * <p>隔离时长</p><p>单位：秒</p>
    */
    @SerializedName("IsolationTime")
    @Expose
    private Long IsolationTime;

    /**
    * <p>最多切换次数</p><p>置0为不开启自动切换</p>
    */
    @SerializedName("MaxSwitchCount")
    @Expose
    private Long MaxSwitchCount;

    /**
    * <p>切换总时间预算</p><p>单位：秒</p>
    */
    @SerializedName("SwitchTimeout")
    @Expose
    private Long SwitchTimeout;

    /**
     * Get <p>是否启用API Key容错配置</p> 
     * @return Enabled <p>是否启用API Key容错配置</p>
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set <p>是否启用API Key容错配置</p>
     * @param Enabled <p>是否启用API Key容错配置</p>
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get <p>异常判定状态码，固定3位数字或字母</p> 
     * @return ErrorCodes <p>异常判定状态码，固定3位数字或字母</p>
     */
    public String [] getErrorCodes() {
        return this.ErrorCodes;
    }

    /**
     * Set <p>异常判定状态码，固定3位数字或字母</p>
     * @param ErrorCodes <p>异常判定状态码，固定3位数字或字母</p>
     */
    public void setErrorCodes(String [] ErrorCodes) {
        this.ErrorCodes = ErrorCodes;
    }

    /**
     * Get <p>连续异常次数</p><p>单位：次</p> 
     * @return ErrorCount <p>连续异常次数</p><p>单位：次</p>
     */
    public Long getErrorCount() {
        return this.ErrorCount;
    }

    /**
     * Set <p>连续异常次数</p><p>单位：次</p>
     * @param ErrorCount <p>连续异常次数</p><p>单位：次</p>
     */
    public void setErrorCount(Long ErrorCount) {
        this.ErrorCount = ErrorCount;
    }

    /**
     * Get <p>隔离时长</p><p>单位：秒</p> 
     * @return IsolationTime <p>隔离时长</p><p>单位：秒</p>
     */
    public Long getIsolationTime() {
        return this.IsolationTime;
    }

    /**
     * Set <p>隔离时长</p><p>单位：秒</p>
     * @param IsolationTime <p>隔离时长</p><p>单位：秒</p>
     */
    public void setIsolationTime(Long IsolationTime) {
        this.IsolationTime = IsolationTime;
    }

    /**
     * Get <p>最多切换次数</p><p>置0为不开启自动切换</p> 
     * @return MaxSwitchCount <p>最多切换次数</p><p>置0为不开启自动切换</p>
     */
    public Long getMaxSwitchCount() {
        return this.MaxSwitchCount;
    }

    /**
     * Set <p>最多切换次数</p><p>置0为不开启自动切换</p>
     * @param MaxSwitchCount <p>最多切换次数</p><p>置0为不开启自动切换</p>
     */
    public void setMaxSwitchCount(Long MaxSwitchCount) {
        this.MaxSwitchCount = MaxSwitchCount;
    }

    /**
     * Get <p>切换总时间预算</p><p>单位：秒</p> 
     * @return SwitchTimeout <p>切换总时间预算</p><p>单位：秒</p>
     */
    public Long getSwitchTimeout() {
        return this.SwitchTimeout;
    }

    /**
     * Set <p>切换总时间预算</p><p>单位：秒</p>
     * @param SwitchTimeout <p>切换总时间预算</p><p>单位：秒</p>
     */
    public void setSwitchTimeout(Long SwitchTimeout) {
        this.SwitchTimeout = SwitchTimeout;
    }

    public FaultToleranceDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FaultToleranceDTO(FaultToleranceDTO source) {
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.ErrorCodes != null) {
            this.ErrorCodes = new String[source.ErrorCodes.length];
            for (int i = 0; i < source.ErrorCodes.length; i++) {
                this.ErrorCodes[i] = new String(source.ErrorCodes[i]);
            }
        }
        if (source.ErrorCount != null) {
            this.ErrorCount = new Long(source.ErrorCount);
        }
        if (source.IsolationTime != null) {
            this.IsolationTime = new Long(source.IsolationTime);
        }
        if (source.MaxSwitchCount != null) {
            this.MaxSwitchCount = new Long(source.MaxSwitchCount);
        }
        if (source.SwitchTimeout != null) {
            this.SwitchTimeout = new Long(source.SwitchTimeout);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamArraySimple(map, prefix + "ErrorCodes.", this.ErrorCodes);
        this.setParamSimple(map, prefix + "ErrorCount", this.ErrorCount);
        this.setParamSimple(map, prefix + "IsolationTime", this.IsolationTime);
        this.setParamSimple(map, prefix + "MaxSwitchCount", this.MaxSwitchCount);
        this.setParamSimple(map, prefix + "SwitchTimeout", this.SwitchTimeout);

    }
}

