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

public class AIGWHealthCheckSetting extends AbstractModel {

    /**
    * <p>健康检查类型</p><p>枚举值：</p><ul><li>MCP： 标准mcp</li><li>HTTP： http</li></ul>
    */
    @SerializedName("HealthCheckType")
    @Expose
    private String HealthCheckType;

    /**
    * <p>检查间隔</p>
    */
    @SerializedName("HealthCheckIntervalSecond")
    @Expose
    private Long HealthCheckIntervalSecond;

    /**
    * <p>检查超时时间</p>
    */
    @SerializedName("HealthCheckTimeout")
    @Expose
    private Long HealthCheckTimeout;

    /**
    * <p>检查失败阈值</p>
    */
    @SerializedName("HealthCheckFailThreshold")
    @Expose
    private Long HealthCheckFailThreshold;

    /**
    * <p>检查恢复阈值</p>
    */
    @SerializedName("HealthCheckRecoverThreshold")
    @Expose
    private Long HealthCheckRecoverThreshold;

    /**
    * <p>检查路径</p>
    */
    @SerializedName("HealthCheckPath")
    @Expose
    private String HealthCheckPath;

    /**
    * <p>检查方法</p>
    */
    @SerializedName("HealthCheckMethod")
    @Expose
    private String HealthCheckMethod;

    /**
     * Get <p>健康检查类型</p><p>枚举值：</p><ul><li>MCP： 标准mcp</li><li>HTTP： http</li></ul> 
     * @return HealthCheckType <p>健康检查类型</p><p>枚举值：</p><ul><li>MCP： 标准mcp</li><li>HTTP： http</li></ul>
     */
    public String getHealthCheckType() {
        return this.HealthCheckType;
    }

    /**
     * Set <p>健康检查类型</p><p>枚举值：</p><ul><li>MCP： 标准mcp</li><li>HTTP： http</li></ul>
     * @param HealthCheckType <p>健康检查类型</p><p>枚举值：</p><ul><li>MCP： 标准mcp</li><li>HTTP： http</li></ul>
     */
    public void setHealthCheckType(String HealthCheckType) {
        this.HealthCheckType = HealthCheckType;
    }

    /**
     * Get <p>检查间隔</p> 
     * @return HealthCheckIntervalSecond <p>检查间隔</p>
     */
    public Long getHealthCheckIntervalSecond() {
        return this.HealthCheckIntervalSecond;
    }

    /**
     * Set <p>检查间隔</p>
     * @param HealthCheckIntervalSecond <p>检查间隔</p>
     */
    public void setHealthCheckIntervalSecond(Long HealthCheckIntervalSecond) {
        this.HealthCheckIntervalSecond = HealthCheckIntervalSecond;
    }

    /**
     * Get <p>检查超时时间</p> 
     * @return HealthCheckTimeout <p>检查超时时间</p>
     */
    public Long getHealthCheckTimeout() {
        return this.HealthCheckTimeout;
    }

    /**
     * Set <p>检查超时时间</p>
     * @param HealthCheckTimeout <p>检查超时时间</p>
     */
    public void setHealthCheckTimeout(Long HealthCheckTimeout) {
        this.HealthCheckTimeout = HealthCheckTimeout;
    }

    /**
     * Get <p>检查失败阈值</p> 
     * @return HealthCheckFailThreshold <p>检查失败阈值</p>
     */
    public Long getHealthCheckFailThreshold() {
        return this.HealthCheckFailThreshold;
    }

    /**
     * Set <p>检查失败阈值</p>
     * @param HealthCheckFailThreshold <p>检查失败阈值</p>
     */
    public void setHealthCheckFailThreshold(Long HealthCheckFailThreshold) {
        this.HealthCheckFailThreshold = HealthCheckFailThreshold;
    }

    /**
     * Get <p>检查恢复阈值</p> 
     * @return HealthCheckRecoverThreshold <p>检查恢复阈值</p>
     */
    public Long getHealthCheckRecoverThreshold() {
        return this.HealthCheckRecoverThreshold;
    }

    /**
     * Set <p>检查恢复阈值</p>
     * @param HealthCheckRecoverThreshold <p>检查恢复阈值</p>
     */
    public void setHealthCheckRecoverThreshold(Long HealthCheckRecoverThreshold) {
        this.HealthCheckRecoverThreshold = HealthCheckRecoverThreshold;
    }

    /**
     * Get <p>检查路径</p> 
     * @return HealthCheckPath <p>检查路径</p>
     */
    public String getHealthCheckPath() {
        return this.HealthCheckPath;
    }

    /**
     * Set <p>检查路径</p>
     * @param HealthCheckPath <p>检查路径</p>
     */
    public void setHealthCheckPath(String HealthCheckPath) {
        this.HealthCheckPath = HealthCheckPath;
    }

    /**
     * Get <p>检查方法</p> 
     * @return HealthCheckMethod <p>检查方法</p>
     */
    public String getHealthCheckMethod() {
        return this.HealthCheckMethod;
    }

    /**
     * Set <p>检查方法</p>
     * @param HealthCheckMethod <p>检查方法</p>
     */
    public void setHealthCheckMethod(String HealthCheckMethod) {
        this.HealthCheckMethod = HealthCheckMethod;
    }

    public AIGWHealthCheckSetting() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIGWHealthCheckSetting(AIGWHealthCheckSetting source) {
        if (source.HealthCheckType != null) {
            this.HealthCheckType = new String(source.HealthCheckType);
        }
        if (source.HealthCheckIntervalSecond != null) {
            this.HealthCheckIntervalSecond = new Long(source.HealthCheckIntervalSecond);
        }
        if (source.HealthCheckTimeout != null) {
            this.HealthCheckTimeout = new Long(source.HealthCheckTimeout);
        }
        if (source.HealthCheckFailThreshold != null) {
            this.HealthCheckFailThreshold = new Long(source.HealthCheckFailThreshold);
        }
        if (source.HealthCheckRecoverThreshold != null) {
            this.HealthCheckRecoverThreshold = new Long(source.HealthCheckRecoverThreshold);
        }
        if (source.HealthCheckPath != null) {
            this.HealthCheckPath = new String(source.HealthCheckPath);
        }
        if (source.HealthCheckMethod != null) {
            this.HealthCheckMethod = new String(source.HealthCheckMethod);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HealthCheckType", this.HealthCheckType);
        this.setParamSimple(map, prefix + "HealthCheckIntervalSecond", this.HealthCheckIntervalSecond);
        this.setParamSimple(map, prefix + "HealthCheckTimeout", this.HealthCheckTimeout);
        this.setParamSimple(map, prefix + "HealthCheckFailThreshold", this.HealthCheckFailThreshold);
        this.setParamSimple(map, prefix + "HealthCheckRecoverThreshold", this.HealthCheckRecoverThreshold);
        this.setParamSimple(map, prefix + "HealthCheckPath", this.HealthCheckPath);
        this.setParamSimple(map, prefix + "HealthCheckMethod", this.HealthCheckMethod);

    }
}

