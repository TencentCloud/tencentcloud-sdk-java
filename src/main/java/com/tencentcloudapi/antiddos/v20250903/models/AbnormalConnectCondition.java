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
package com.tencentcloudapi.antiddos.v20250903.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AbnormalConnectCondition extends AbstractModel {

    /**
    * <p>SYN占比阈值（百分比）， 0为不检查。 同一连接中，SYN 包占比超过配置占比时，将被视为异常连接处置。</p><p>取值范围：[0, 100]</p>
    */
    @SerializedName("SynRatioThreshold")
    @Expose
    private Long SynRatioThreshold;

    /**
    * <p>SYN占比阈值（百分比）， 0为不检查。 同一连接中，SYN 包占比超过配置占比时，将被视为异常连接处置。</p><p>取值范围：[0, 65535]</p>
    */
    @SerializedName("SynCountThreshold")
    @Expose
    private Long SynCountThreshold;

    /**
    * <p>连接超时（秒），0为不检查。 连接超过配置时间内未收到数据时，将被视为异常连接处置。</p><p>取值范围：[0, 65535]</p>
    */
    @SerializedName("ConnectTimeout")
    @Expose
    private Long ConnectTimeout;

    /**
    * <p>是否开启空连接防护。 同一客户端对应了较大数量的空连接时，将被视为异常连接处置。</p><p>枚举值：</p><ul><li>on： 开启</li><li>off： 关闭</li></ul>
    */
    @SerializedName("EmptyConnection")
    @Expose
    private String EmptyConnection;

    /**
     * Get <p>SYN占比阈值（百分比）， 0为不检查。 同一连接中，SYN 包占比超过配置占比时，将被视为异常连接处置。</p><p>取值范围：[0, 100]</p> 
     * @return SynRatioThreshold <p>SYN占比阈值（百分比）， 0为不检查。 同一连接中，SYN 包占比超过配置占比时，将被视为异常连接处置。</p><p>取值范围：[0, 100]</p>
     */
    public Long getSynRatioThreshold() {
        return this.SynRatioThreshold;
    }

    /**
     * Set <p>SYN占比阈值（百分比）， 0为不检查。 同一连接中，SYN 包占比超过配置占比时，将被视为异常连接处置。</p><p>取值范围：[0, 100]</p>
     * @param SynRatioThreshold <p>SYN占比阈值（百分比）， 0为不检查。 同一连接中，SYN 包占比超过配置占比时，将被视为异常连接处置。</p><p>取值范围：[0, 100]</p>
     */
    public void setSynRatioThreshold(Long SynRatioThreshold) {
        this.SynRatioThreshold = SynRatioThreshold;
    }

    /**
     * Get <p>SYN占比阈值（百分比）， 0为不检查。 同一连接中，SYN 包占比超过配置占比时，将被视为异常连接处置。</p><p>取值范围：[0, 65535]</p> 
     * @return SynCountThreshold <p>SYN占比阈值（百分比）， 0为不检查。 同一连接中，SYN 包占比超过配置占比时，将被视为异常连接处置。</p><p>取值范围：[0, 65535]</p>
     */
    public Long getSynCountThreshold() {
        return this.SynCountThreshold;
    }

    /**
     * Set <p>SYN占比阈值（百分比）， 0为不检查。 同一连接中，SYN 包占比超过配置占比时，将被视为异常连接处置。</p><p>取值范围：[0, 65535]</p>
     * @param SynCountThreshold <p>SYN占比阈值（百分比）， 0为不检查。 同一连接中，SYN 包占比超过配置占比时，将被视为异常连接处置。</p><p>取值范围：[0, 65535]</p>
     */
    public void setSynCountThreshold(Long SynCountThreshold) {
        this.SynCountThreshold = SynCountThreshold;
    }

    /**
     * Get <p>连接超时（秒），0为不检查。 连接超过配置时间内未收到数据时，将被视为异常连接处置。</p><p>取值范围：[0, 65535]</p> 
     * @return ConnectTimeout <p>连接超时（秒），0为不检查。 连接超过配置时间内未收到数据时，将被视为异常连接处置。</p><p>取值范围：[0, 65535]</p>
     */
    public Long getConnectTimeout() {
        return this.ConnectTimeout;
    }

    /**
     * Set <p>连接超时（秒），0为不检查。 连接超过配置时间内未收到数据时，将被视为异常连接处置。</p><p>取值范围：[0, 65535]</p>
     * @param ConnectTimeout <p>连接超时（秒），0为不检查。 连接超过配置时间内未收到数据时，将被视为异常连接处置。</p><p>取值范围：[0, 65535]</p>
     */
    public void setConnectTimeout(Long ConnectTimeout) {
        this.ConnectTimeout = ConnectTimeout;
    }

    /**
     * Get <p>是否开启空连接防护。 同一客户端对应了较大数量的空连接时，将被视为异常连接处置。</p><p>枚举值：</p><ul><li>on： 开启</li><li>off： 关闭</li></ul> 
     * @return EmptyConnection <p>是否开启空连接防护。 同一客户端对应了较大数量的空连接时，将被视为异常连接处置。</p><p>枚举值：</p><ul><li>on： 开启</li><li>off： 关闭</li></ul>
     */
    public String getEmptyConnection() {
        return this.EmptyConnection;
    }

    /**
     * Set <p>是否开启空连接防护。 同一客户端对应了较大数量的空连接时，将被视为异常连接处置。</p><p>枚举值：</p><ul><li>on： 开启</li><li>off： 关闭</li></ul>
     * @param EmptyConnection <p>是否开启空连接防护。 同一客户端对应了较大数量的空连接时，将被视为异常连接处置。</p><p>枚举值：</p><ul><li>on： 开启</li><li>off： 关闭</li></ul>
     */
    public void setEmptyConnection(String EmptyConnection) {
        this.EmptyConnection = EmptyConnection;
    }

    public AbnormalConnectCondition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AbnormalConnectCondition(AbnormalConnectCondition source) {
        if (source.SynRatioThreshold != null) {
            this.SynRatioThreshold = new Long(source.SynRatioThreshold);
        }
        if (source.SynCountThreshold != null) {
            this.SynCountThreshold = new Long(source.SynCountThreshold);
        }
        if (source.ConnectTimeout != null) {
            this.ConnectTimeout = new Long(source.ConnectTimeout);
        }
        if (source.EmptyConnection != null) {
            this.EmptyConnection = new String(source.EmptyConnection);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SynRatioThreshold", this.SynRatioThreshold);
        this.setParamSimple(map, prefix + "SynCountThreshold", this.SynCountThreshold);
        this.setParamSimple(map, prefix + "ConnectTimeout", this.ConnectTimeout);
        this.setParamSimple(map, prefix + "EmptyConnection", this.EmptyConnection);

    }
}

