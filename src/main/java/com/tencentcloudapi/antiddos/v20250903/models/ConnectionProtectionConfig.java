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

public class ConnectionProtectionConfig extends AbstractModel {

    /**
    * <p>源 IP 每秒新建连接数限制，为 0 为不限制（关闭），大于 0 开启限制。命中后限制新建连接。</p><p>取值范围：[0, 4294967295]</p>
    */
    @SerializedName("SourceIPNewConnectionLimit")
    @Expose
    private Long SourceIPNewConnectionLimit;

    /**
    * <p>源 IP 并发连接数限制，为 0 不限制（关闭），大于 0 开启限制。命中后限制新建连接。</p><p>取值范围：[0, 4294967295]</p>
    */
    @SerializedName("SourceIPConcurrentConnectionLimit")
    @Expose
    private Long SourceIPConcurrentConnectionLimit;

    /**
    * <p>目的 IP 每秒新建连接数限制，为 0 不限制（关闭），大于 0 开启限制。命中后限制新建连接。</p><p>取值范围：[0, 4294967295]</p>
    */
    @SerializedName("DestinationIPNewConnectionLimit")
    @Expose
    private Long DestinationIPNewConnectionLimit;

    /**
    * <p>目的 IP 并发连接数限制，为 0 不限制（关闭）， 大于 0 开启限制。命中后限制新建连接。</p><p>取值范围：[0, 4294967295]</p>
    */
    @SerializedName("DestinationIPConcurrentConnectionLimit")
    @Expose
    private Long DestinationIPConcurrentConnectionLimit;

    /**
    * <p>源 IP 异常连接限制。</p>
    */
    @SerializedName("AbnormalConnectionLimit")
    @Expose
    private AbnormalConnectionLimit AbnormalConnectionLimit;

    /**
     * Get <p>源 IP 每秒新建连接数限制，为 0 为不限制（关闭），大于 0 开启限制。命中后限制新建连接。</p><p>取值范围：[0, 4294967295]</p> 
     * @return SourceIPNewConnectionLimit <p>源 IP 每秒新建连接数限制，为 0 为不限制（关闭），大于 0 开启限制。命中后限制新建连接。</p><p>取值范围：[0, 4294967295]</p>
     */
    public Long getSourceIPNewConnectionLimit() {
        return this.SourceIPNewConnectionLimit;
    }

    /**
     * Set <p>源 IP 每秒新建连接数限制，为 0 为不限制（关闭），大于 0 开启限制。命中后限制新建连接。</p><p>取值范围：[0, 4294967295]</p>
     * @param SourceIPNewConnectionLimit <p>源 IP 每秒新建连接数限制，为 0 为不限制（关闭），大于 0 开启限制。命中后限制新建连接。</p><p>取值范围：[0, 4294967295]</p>
     */
    public void setSourceIPNewConnectionLimit(Long SourceIPNewConnectionLimit) {
        this.SourceIPNewConnectionLimit = SourceIPNewConnectionLimit;
    }

    /**
     * Get <p>源 IP 并发连接数限制，为 0 不限制（关闭），大于 0 开启限制。命中后限制新建连接。</p><p>取值范围：[0, 4294967295]</p> 
     * @return SourceIPConcurrentConnectionLimit <p>源 IP 并发连接数限制，为 0 不限制（关闭），大于 0 开启限制。命中后限制新建连接。</p><p>取值范围：[0, 4294967295]</p>
     */
    public Long getSourceIPConcurrentConnectionLimit() {
        return this.SourceIPConcurrentConnectionLimit;
    }

    /**
     * Set <p>源 IP 并发连接数限制，为 0 不限制（关闭），大于 0 开启限制。命中后限制新建连接。</p><p>取值范围：[0, 4294967295]</p>
     * @param SourceIPConcurrentConnectionLimit <p>源 IP 并发连接数限制，为 0 不限制（关闭），大于 0 开启限制。命中后限制新建连接。</p><p>取值范围：[0, 4294967295]</p>
     */
    public void setSourceIPConcurrentConnectionLimit(Long SourceIPConcurrentConnectionLimit) {
        this.SourceIPConcurrentConnectionLimit = SourceIPConcurrentConnectionLimit;
    }

    /**
     * Get <p>目的 IP 每秒新建连接数限制，为 0 不限制（关闭），大于 0 开启限制。命中后限制新建连接。</p><p>取值范围：[0, 4294967295]</p> 
     * @return DestinationIPNewConnectionLimit <p>目的 IP 每秒新建连接数限制，为 0 不限制（关闭），大于 0 开启限制。命中后限制新建连接。</p><p>取值范围：[0, 4294967295]</p>
     */
    public Long getDestinationIPNewConnectionLimit() {
        return this.DestinationIPNewConnectionLimit;
    }

    /**
     * Set <p>目的 IP 每秒新建连接数限制，为 0 不限制（关闭），大于 0 开启限制。命中后限制新建连接。</p><p>取值范围：[0, 4294967295]</p>
     * @param DestinationIPNewConnectionLimit <p>目的 IP 每秒新建连接数限制，为 0 不限制（关闭），大于 0 开启限制。命中后限制新建连接。</p><p>取值范围：[0, 4294967295]</p>
     */
    public void setDestinationIPNewConnectionLimit(Long DestinationIPNewConnectionLimit) {
        this.DestinationIPNewConnectionLimit = DestinationIPNewConnectionLimit;
    }

    /**
     * Get <p>目的 IP 并发连接数限制，为 0 不限制（关闭）， 大于 0 开启限制。命中后限制新建连接。</p><p>取值范围：[0, 4294967295]</p> 
     * @return DestinationIPConcurrentConnectionLimit <p>目的 IP 并发连接数限制，为 0 不限制（关闭）， 大于 0 开启限制。命中后限制新建连接。</p><p>取值范围：[0, 4294967295]</p>
     */
    public Long getDestinationIPConcurrentConnectionLimit() {
        return this.DestinationIPConcurrentConnectionLimit;
    }

    /**
     * Set <p>目的 IP 并发连接数限制，为 0 不限制（关闭）， 大于 0 开启限制。命中后限制新建连接。</p><p>取值范围：[0, 4294967295]</p>
     * @param DestinationIPConcurrentConnectionLimit <p>目的 IP 并发连接数限制，为 0 不限制（关闭）， 大于 0 开启限制。命中后限制新建连接。</p><p>取值范围：[0, 4294967295]</p>
     */
    public void setDestinationIPConcurrentConnectionLimit(Long DestinationIPConcurrentConnectionLimit) {
        this.DestinationIPConcurrentConnectionLimit = DestinationIPConcurrentConnectionLimit;
    }

    /**
     * Get <p>源 IP 异常连接限制。</p> 
     * @return AbnormalConnectionLimit <p>源 IP 异常连接限制。</p>
     */
    public AbnormalConnectionLimit getAbnormalConnectionLimit() {
        return this.AbnormalConnectionLimit;
    }

    /**
     * Set <p>源 IP 异常连接限制。</p>
     * @param AbnormalConnectionLimit <p>源 IP 异常连接限制。</p>
     */
    public void setAbnormalConnectionLimit(AbnormalConnectionLimit AbnormalConnectionLimit) {
        this.AbnormalConnectionLimit = AbnormalConnectionLimit;
    }

    public ConnectionProtectionConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConnectionProtectionConfig(ConnectionProtectionConfig source) {
        if (source.SourceIPNewConnectionLimit != null) {
            this.SourceIPNewConnectionLimit = new Long(source.SourceIPNewConnectionLimit);
        }
        if (source.SourceIPConcurrentConnectionLimit != null) {
            this.SourceIPConcurrentConnectionLimit = new Long(source.SourceIPConcurrentConnectionLimit);
        }
        if (source.DestinationIPNewConnectionLimit != null) {
            this.DestinationIPNewConnectionLimit = new Long(source.DestinationIPNewConnectionLimit);
        }
        if (source.DestinationIPConcurrentConnectionLimit != null) {
            this.DestinationIPConcurrentConnectionLimit = new Long(source.DestinationIPConcurrentConnectionLimit);
        }
        if (source.AbnormalConnectionLimit != null) {
            this.AbnormalConnectionLimit = new AbnormalConnectionLimit(source.AbnormalConnectionLimit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceIPNewConnectionLimit", this.SourceIPNewConnectionLimit);
        this.setParamSimple(map, prefix + "SourceIPConcurrentConnectionLimit", this.SourceIPConcurrentConnectionLimit);
        this.setParamSimple(map, prefix + "DestinationIPNewConnectionLimit", this.DestinationIPNewConnectionLimit);
        this.setParamSimple(map, prefix + "DestinationIPConcurrentConnectionLimit", this.DestinationIPConcurrentConnectionLimit);
        this.setParamObj(map, prefix + "AbnormalConnectionLimit.", this.AbnormalConnectionLimit);

    }
}

