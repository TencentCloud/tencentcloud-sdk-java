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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AvailableType extends AbstractModel {

    /**
    * <p>协议与售卖详情</p>
    */
    @SerializedName("Protocols")
    @Expose
    private AvailableProtoStatus [] Protocols;

    /**
    * <p>存储类型。返回值中 SD 为通用标准型存储， HP为通用性能型存储， TB为Turbo标准型， TP 为Turbo性能型。</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>是否支持预付费。返回值中 true 为支持、false 为不支持</p>
    */
    @SerializedName("Prepayment")
    @Expose
    private Boolean Prepayment;

    /**
    * <p>文件系统版本</p><p>枚举值：</p><ul><li>v1.5： 通用系列</li><li>v3.1： 通用系列（增强型）</li><li>v4.0： Turbo系列</li></ul>
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
     * Get <p>协议与售卖详情</p> 
     * @return Protocols <p>协议与售卖详情</p>
     */
    public AvailableProtoStatus [] getProtocols() {
        return this.Protocols;
    }

    /**
     * Set <p>协议与售卖详情</p>
     * @param Protocols <p>协议与售卖详情</p>
     */
    public void setProtocols(AvailableProtoStatus [] Protocols) {
        this.Protocols = Protocols;
    }

    /**
     * Get <p>存储类型。返回值中 SD 为通用标准型存储， HP为通用性能型存储， TB为Turbo标准型， TP 为Turbo性能型。</p> 
     * @return Type <p>存储类型。返回值中 SD 为通用标准型存储， HP为通用性能型存储， TB为Turbo标准型， TP 为Turbo性能型。</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>存储类型。返回值中 SD 为通用标准型存储， HP为通用性能型存储， TB为Turbo标准型， TP 为Turbo性能型。</p>
     * @param Type <p>存储类型。返回值中 SD 为通用标准型存储， HP为通用性能型存储， TB为Turbo标准型， TP 为Turbo性能型。</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>是否支持预付费。返回值中 true 为支持、false 为不支持</p> 
     * @return Prepayment <p>是否支持预付费。返回值中 true 为支持、false 为不支持</p>
     */
    public Boolean getPrepayment() {
        return this.Prepayment;
    }

    /**
     * Set <p>是否支持预付费。返回值中 true 为支持、false 为不支持</p>
     * @param Prepayment <p>是否支持预付费。返回值中 true 为支持、false 为不支持</p>
     */
    public void setPrepayment(Boolean Prepayment) {
        this.Prepayment = Prepayment;
    }

    /**
     * Get <p>文件系统版本</p><p>枚举值：</p><ul><li>v1.5： 通用系列</li><li>v3.1： 通用系列（增强型）</li><li>v4.0： Turbo系列</li></ul> 
     * @return Version <p>文件系统版本</p><p>枚举值：</p><ul><li>v1.5： 通用系列</li><li>v3.1： 通用系列（增强型）</li><li>v4.0： Turbo系列</li></ul>
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set <p>文件系统版本</p><p>枚举值：</p><ul><li>v1.5： 通用系列</li><li>v3.1： 通用系列（增强型）</li><li>v4.0： Turbo系列</li></ul>
     * @param Version <p>文件系统版本</p><p>枚举值：</p><ul><li>v1.5： 通用系列</li><li>v3.1： 通用系列（增强型）</li><li>v4.0： Turbo系列</li></ul>
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    public AvailableType() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AvailableType(AvailableType source) {
        if (source.Protocols != null) {
            this.Protocols = new AvailableProtoStatus[source.Protocols.length];
            for (int i = 0; i < source.Protocols.length; i++) {
                this.Protocols[i] = new AvailableProtoStatus(source.Protocols[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Prepayment != null) {
            this.Prepayment = new Boolean(source.Prepayment);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Protocols.", this.Protocols);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Prepayment", this.Prepayment);
        this.setParamSimple(map, prefix + "Version", this.Version);

    }
}

