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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CustomGuardrailCapabilityLimits extends AbstractModel {

    /**
    * <p>Header 白名单最大条数。</p>
    */
    @SerializedName("MaxHeaderAllowList")
    @Expose
    private Long MaxHeaderAllowList;

    /**
    * <p>单方向关键词最大条数。</p>
    */
    @SerializedName("MaxKeywordsPerDirection")
    @Expose
    private Long MaxKeywordsPerDirection;

    /**
    * <p>直接内联送审的 Body 上限，单位字节。</p>
    */
    @SerializedName("InlineBodyBytes")
    @Expose
    private Long InlineBodyBytes;

    /**
    * <p>可接受的请求 Body 上限，单位字节。</p>
    */
    @SerializedName("MaxAcceptedBodyBytes")
    @Expose
    private Long MaxAcceptedBodyBytes;

    /**
    * <p>超大请求 Body 默认分片大小，单位字节。</p>
    */
    @SerializedName("TransferChunkBytes")
    @Expose
    private Long TransferChunkBytes;

    /**
    * <p>超大请求 Body 最大分片大小，单位字节。</p>
    */
    @SerializedName("MaxTransferChunkBytes")
    @Expose
    private Long MaxTransferChunkBytes;

    /**
    * <p>分片传输目标最大分片数。</p>
    */
    @SerializedName("TransferTargetMaxChunks")
    @Expose
    private Long TransferTargetMaxChunks;

    /**
    * <p>普通响应审核最大 Body 大小，单位字节。</p>
    */
    @SerializedName("MaxResponseBodyBytes")
    @Expose
    private Long MaxResponseBodyBytes;

    /**
    * <p>单个流式事件最大字节数，单位字节。</p>
    */
    @SerializedName("MaxStreamEventBytes")
    @Expose
    private Long MaxStreamEventBytes;

    /**
    * <p>单数据面实例 Stream Relay 默认并发槽位。</p>
    */
    @SerializedName("StreamRelayMaxConcurrentRequests")
    @Expose
    private Long StreamRelayMaxConcurrentRequests;

    /**
    * <p>审核超时最小值，单位毫秒。</p>
    */
    @SerializedName("MinTimeoutMs")
    @Expose
    private Long MinTimeoutMs;

    /**
    * <p>审核超时最大值，单位毫秒。</p>
    */
    @SerializedName("MaxTimeoutMs")
    @Expose
    private Long MaxTimeoutMs;

    /**
    * <p>审核超时默认值，单位毫秒。</p>
    */
    @SerializedName("DefaultTimeoutMs")
    @Expose
    private Long DefaultTimeoutMs;

    /**
     * Get <p>Header 白名单最大条数。</p> 
     * @return MaxHeaderAllowList <p>Header 白名单最大条数。</p>
     */
    public Long getMaxHeaderAllowList() {
        return this.MaxHeaderAllowList;
    }

    /**
     * Set <p>Header 白名单最大条数。</p>
     * @param MaxHeaderAllowList <p>Header 白名单最大条数。</p>
     */
    public void setMaxHeaderAllowList(Long MaxHeaderAllowList) {
        this.MaxHeaderAllowList = MaxHeaderAllowList;
    }

    /**
     * Get <p>单方向关键词最大条数。</p> 
     * @return MaxKeywordsPerDirection <p>单方向关键词最大条数。</p>
     */
    public Long getMaxKeywordsPerDirection() {
        return this.MaxKeywordsPerDirection;
    }

    /**
     * Set <p>单方向关键词最大条数。</p>
     * @param MaxKeywordsPerDirection <p>单方向关键词最大条数。</p>
     */
    public void setMaxKeywordsPerDirection(Long MaxKeywordsPerDirection) {
        this.MaxKeywordsPerDirection = MaxKeywordsPerDirection;
    }

    /**
     * Get <p>直接内联送审的 Body 上限，单位字节。</p> 
     * @return InlineBodyBytes <p>直接内联送审的 Body 上限，单位字节。</p>
     */
    public Long getInlineBodyBytes() {
        return this.InlineBodyBytes;
    }

    /**
     * Set <p>直接内联送审的 Body 上限，单位字节。</p>
     * @param InlineBodyBytes <p>直接内联送审的 Body 上限，单位字节。</p>
     */
    public void setInlineBodyBytes(Long InlineBodyBytes) {
        this.InlineBodyBytes = InlineBodyBytes;
    }

    /**
     * Get <p>可接受的请求 Body 上限，单位字节。</p> 
     * @return MaxAcceptedBodyBytes <p>可接受的请求 Body 上限，单位字节。</p>
     */
    public Long getMaxAcceptedBodyBytes() {
        return this.MaxAcceptedBodyBytes;
    }

    /**
     * Set <p>可接受的请求 Body 上限，单位字节。</p>
     * @param MaxAcceptedBodyBytes <p>可接受的请求 Body 上限，单位字节。</p>
     */
    public void setMaxAcceptedBodyBytes(Long MaxAcceptedBodyBytes) {
        this.MaxAcceptedBodyBytes = MaxAcceptedBodyBytes;
    }

    /**
     * Get <p>超大请求 Body 默认分片大小，单位字节。</p> 
     * @return TransferChunkBytes <p>超大请求 Body 默认分片大小，单位字节。</p>
     */
    public Long getTransferChunkBytes() {
        return this.TransferChunkBytes;
    }

    /**
     * Set <p>超大请求 Body 默认分片大小，单位字节。</p>
     * @param TransferChunkBytes <p>超大请求 Body 默认分片大小，单位字节。</p>
     */
    public void setTransferChunkBytes(Long TransferChunkBytes) {
        this.TransferChunkBytes = TransferChunkBytes;
    }

    /**
     * Get <p>超大请求 Body 最大分片大小，单位字节。</p> 
     * @return MaxTransferChunkBytes <p>超大请求 Body 最大分片大小，单位字节。</p>
     */
    public Long getMaxTransferChunkBytes() {
        return this.MaxTransferChunkBytes;
    }

    /**
     * Set <p>超大请求 Body 最大分片大小，单位字节。</p>
     * @param MaxTransferChunkBytes <p>超大请求 Body 最大分片大小，单位字节。</p>
     */
    public void setMaxTransferChunkBytes(Long MaxTransferChunkBytes) {
        this.MaxTransferChunkBytes = MaxTransferChunkBytes;
    }

    /**
     * Get <p>分片传输目标最大分片数。</p> 
     * @return TransferTargetMaxChunks <p>分片传输目标最大分片数。</p>
     */
    public Long getTransferTargetMaxChunks() {
        return this.TransferTargetMaxChunks;
    }

    /**
     * Set <p>分片传输目标最大分片数。</p>
     * @param TransferTargetMaxChunks <p>分片传输目标最大分片数。</p>
     */
    public void setTransferTargetMaxChunks(Long TransferTargetMaxChunks) {
        this.TransferTargetMaxChunks = TransferTargetMaxChunks;
    }

    /**
     * Get <p>普通响应审核最大 Body 大小，单位字节。</p> 
     * @return MaxResponseBodyBytes <p>普通响应审核最大 Body 大小，单位字节。</p>
     */
    public Long getMaxResponseBodyBytes() {
        return this.MaxResponseBodyBytes;
    }

    /**
     * Set <p>普通响应审核最大 Body 大小，单位字节。</p>
     * @param MaxResponseBodyBytes <p>普通响应审核最大 Body 大小，单位字节。</p>
     */
    public void setMaxResponseBodyBytes(Long MaxResponseBodyBytes) {
        this.MaxResponseBodyBytes = MaxResponseBodyBytes;
    }

    /**
     * Get <p>单个流式事件最大字节数，单位字节。</p> 
     * @return MaxStreamEventBytes <p>单个流式事件最大字节数，单位字节。</p>
     */
    public Long getMaxStreamEventBytes() {
        return this.MaxStreamEventBytes;
    }

    /**
     * Set <p>单个流式事件最大字节数，单位字节。</p>
     * @param MaxStreamEventBytes <p>单个流式事件最大字节数，单位字节。</p>
     */
    public void setMaxStreamEventBytes(Long MaxStreamEventBytes) {
        this.MaxStreamEventBytes = MaxStreamEventBytes;
    }

    /**
     * Get <p>单数据面实例 Stream Relay 默认并发槽位。</p> 
     * @return StreamRelayMaxConcurrentRequests <p>单数据面实例 Stream Relay 默认并发槽位。</p>
     */
    public Long getStreamRelayMaxConcurrentRequests() {
        return this.StreamRelayMaxConcurrentRequests;
    }

    /**
     * Set <p>单数据面实例 Stream Relay 默认并发槽位。</p>
     * @param StreamRelayMaxConcurrentRequests <p>单数据面实例 Stream Relay 默认并发槽位。</p>
     */
    public void setStreamRelayMaxConcurrentRequests(Long StreamRelayMaxConcurrentRequests) {
        this.StreamRelayMaxConcurrentRequests = StreamRelayMaxConcurrentRequests;
    }

    /**
     * Get <p>审核超时最小值，单位毫秒。</p> 
     * @return MinTimeoutMs <p>审核超时最小值，单位毫秒。</p>
     */
    public Long getMinTimeoutMs() {
        return this.MinTimeoutMs;
    }

    /**
     * Set <p>审核超时最小值，单位毫秒。</p>
     * @param MinTimeoutMs <p>审核超时最小值，单位毫秒。</p>
     */
    public void setMinTimeoutMs(Long MinTimeoutMs) {
        this.MinTimeoutMs = MinTimeoutMs;
    }

    /**
     * Get <p>审核超时最大值，单位毫秒。</p> 
     * @return MaxTimeoutMs <p>审核超时最大值，单位毫秒。</p>
     */
    public Long getMaxTimeoutMs() {
        return this.MaxTimeoutMs;
    }

    /**
     * Set <p>审核超时最大值，单位毫秒。</p>
     * @param MaxTimeoutMs <p>审核超时最大值，单位毫秒。</p>
     */
    public void setMaxTimeoutMs(Long MaxTimeoutMs) {
        this.MaxTimeoutMs = MaxTimeoutMs;
    }

    /**
     * Get <p>审核超时默认值，单位毫秒。</p> 
     * @return DefaultTimeoutMs <p>审核超时默认值，单位毫秒。</p>
     */
    public Long getDefaultTimeoutMs() {
        return this.DefaultTimeoutMs;
    }

    /**
     * Set <p>审核超时默认值，单位毫秒。</p>
     * @param DefaultTimeoutMs <p>审核超时默认值，单位毫秒。</p>
     */
    public void setDefaultTimeoutMs(Long DefaultTimeoutMs) {
        this.DefaultTimeoutMs = DefaultTimeoutMs;
    }

    public CustomGuardrailCapabilityLimits() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomGuardrailCapabilityLimits(CustomGuardrailCapabilityLimits source) {
        if (source.MaxHeaderAllowList != null) {
            this.MaxHeaderAllowList = new Long(source.MaxHeaderAllowList);
        }
        if (source.MaxKeywordsPerDirection != null) {
            this.MaxKeywordsPerDirection = new Long(source.MaxKeywordsPerDirection);
        }
        if (source.InlineBodyBytes != null) {
            this.InlineBodyBytes = new Long(source.InlineBodyBytes);
        }
        if (source.MaxAcceptedBodyBytes != null) {
            this.MaxAcceptedBodyBytes = new Long(source.MaxAcceptedBodyBytes);
        }
        if (source.TransferChunkBytes != null) {
            this.TransferChunkBytes = new Long(source.TransferChunkBytes);
        }
        if (source.MaxTransferChunkBytes != null) {
            this.MaxTransferChunkBytes = new Long(source.MaxTransferChunkBytes);
        }
        if (source.TransferTargetMaxChunks != null) {
            this.TransferTargetMaxChunks = new Long(source.TransferTargetMaxChunks);
        }
        if (source.MaxResponseBodyBytes != null) {
            this.MaxResponseBodyBytes = new Long(source.MaxResponseBodyBytes);
        }
        if (source.MaxStreamEventBytes != null) {
            this.MaxStreamEventBytes = new Long(source.MaxStreamEventBytes);
        }
        if (source.StreamRelayMaxConcurrentRequests != null) {
            this.StreamRelayMaxConcurrentRequests = new Long(source.StreamRelayMaxConcurrentRequests);
        }
        if (source.MinTimeoutMs != null) {
            this.MinTimeoutMs = new Long(source.MinTimeoutMs);
        }
        if (source.MaxTimeoutMs != null) {
            this.MaxTimeoutMs = new Long(source.MaxTimeoutMs);
        }
        if (source.DefaultTimeoutMs != null) {
            this.DefaultTimeoutMs = new Long(source.DefaultTimeoutMs);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaxHeaderAllowList", this.MaxHeaderAllowList);
        this.setParamSimple(map, prefix + "MaxKeywordsPerDirection", this.MaxKeywordsPerDirection);
        this.setParamSimple(map, prefix + "InlineBodyBytes", this.InlineBodyBytes);
        this.setParamSimple(map, prefix + "MaxAcceptedBodyBytes", this.MaxAcceptedBodyBytes);
        this.setParamSimple(map, prefix + "TransferChunkBytes", this.TransferChunkBytes);
        this.setParamSimple(map, prefix + "MaxTransferChunkBytes", this.MaxTransferChunkBytes);
        this.setParamSimple(map, prefix + "TransferTargetMaxChunks", this.TransferTargetMaxChunks);
        this.setParamSimple(map, prefix + "MaxResponseBodyBytes", this.MaxResponseBodyBytes);
        this.setParamSimple(map, prefix + "MaxStreamEventBytes", this.MaxStreamEventBytes);
        this.setParamSimple(map, prefix + "StreamRelayMaxConcurrentRequests", this.StreamRelayMaxConcurrentRequests);
        this.setParamSimple(map, prefix + "MinTimeoutMs", this.MinTimeoutMs);
        this.setParamSimple(map, prefix + "MaxTimeoutMs", this.MaxTimeoutMs);
        this.setParamSimple(map, prefix + "DefaultTimeoutMs", this.DefaultTimeoutMs);

    }
}

