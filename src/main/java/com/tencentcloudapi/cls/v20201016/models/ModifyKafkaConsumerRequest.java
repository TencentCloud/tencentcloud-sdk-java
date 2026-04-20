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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyKafkaConsumerRequest extends AbstractModel {

    /**
    * <p>日志主题Id。</p><ul><li>通过 <a href="https://cloud.tencent.com/document/product/614/56454">获取日志主题列表</a> 获取日志主题Id。</li><li>通过 <a href="https://cloud.tencent.com/document/product/614/56456">创建日志主题</a> 获取日志主题Id。</li></ul>
    */
    @SerializedName("FromTopicId")
    @Expose
    private String FromTopicId;

    /**
    * <p>压缩方式。0：不压缩；2：使用Snappy压缩；3：使用LZ4压缩</p>
    */
    @SerializedName("Compression")
    @Expose
    private Long Compression;

    /**
    * <p>kafka协议消费数据格式</p>
    */
    @SerializedName("ConsumerContent")
    @Expose
    private KafkaConsumerContent ConsumerContent;

    /**
    * <p>是否开启投递服务日志。1：关闭，2：开启。</p>
    */
    @SerializedName("HasServicesLog")
    @Expose
    private Long HasServicesLog;

    /**
    * <p>消费范围类型，0:最新，1:历史+最新</p>
    */
    @SerializedName("ScopeType")
    @Expose
    private Long ScopeType;

    /**
     * Get <p>日志主题Id。</p><ul><li>通过 <a href="https://cloud.tencent.com/document/product/614/56454">获取日志主题列表</a> 获取日志主题Id。</li><li>通过 <a href="https://cloud.tencent.com/document/product/614/56456">创建日志主题</a> 获取日志主题Id。</li></ul> 
     * @return FromTopicId <p>日志主题Id。</p><ul><li>通过 <a href="https://cloud.tencent.com/document/product/614/56454">获取日志主题列表</a> 获取日志主题Id。</li><li>通过 <a href="https://cloud.tencent.com/document/product/614/56456">创建日志主题</a> 获取日志主题Id。</li></ul>
     */
    public String getFromTopicId() {
        return this.FromTopicId;
    }

    /**
     * Set <p>日志主题Id。</p><ul><li>通过 <a href="https://cloud.tencent.com/document/product/614/56454">获取日志主题列表</a> 获取日志主题Id。</li><li>通过 <a href="https://cloud.tencent.com/document/product/614/56456">创建日志主题</a> 获取日志主题Id。</li></ul>
     * @param FromTopicId <p>日志主题Id。</p><ul><li>通过 <a href="https://cloud.tencent.com/document/product/614/56454">获取日志主题列表</a> 获取日志主题Id。</li><li>通过 <a href="https://cloud.tencent.com/document/product/614/56456">创建日志主题</a> 获取日志主题Id。</li></ul>
     */
    public void setFromTopicId(String FromTopicId) {
        this.FromTopicId = FromTopicId;
    }

    /**
     * Get <p>压缩方式。0：不压缩；2：使用Snappy压缩；3：使用LZ4压缩</p> 
     * @return Compression <p>压缩方式。0：不压缩；2：使用Snappy压缩；3：使用LZ4压缩</p>
     */
    public Long getCompression() {
        return this.Compression;
    }

    /**
     * Set <p>压缩方式。0：不压缩；2：使用Snappy压缩；3：使用LZ4压缩</p>
     * @param Compression <p>压缩方式。0：不压缩；2：使用Snappy压缩；3：使用LZ4压缩</p>
     */
    public void setCompression(Long Compression) {
        this.Compression = Compression;
    }

    /**
     * Get <p>kafka协议消费数据格式</p> 
     * @return ConsumerContent <p>kafka协议消费数据格式</p>
     */
    public KafkaConsumerContent getConsumerContent() {
        return this.ConsumerContent;
    }

    /**
     * Set <p>kafka协议消费数据格式</p>
     * @param ConsumerContent <p>kafka协议消费数据格式</p>
     */
    public void setConsumerContent(KafkaConsumerContent ConsumerContent) {
        this.ConsumerContent = ConsumerContent;
    }

    /**
     * Get <p>是否开启投递服务日志。1：关闭，2：开启。</p> 
     * @return HasServicesLog <p>是否开启投递服务日志。1：关闭，2：开启。</p>
     */
    public Long getHasServicesLog() {
        return this.HasServicesLog;
    }

    /**
     * Set <p>是否开启投递服务日志。1：关闭，2：开启。</p>
     * @param HasServicesLog <p>是否开启投递服务日志。1：关闭，2：开启。</p>
     */
    public void setHasServicesLog(Long HasServicesLog) {
        this.HasServicesLog = HasServicesLog;
    }

    /**
     * Get <p>消费范围类型，0:最新，1:历史+最新</p> 
     * @return ScopeType <p>消费范围类型，0:最新，1:历史+最新</p>
     */
    public Long getScopeType() {
        return this.ScopeType;
    }

    /**
     * Set <p>消费范围类型，0:最新，1:历史+最新</p>
     * @param ScopeType <p>消费范围类型，0:最新，1:历史+最新</p>
     */
    public void setScopeType(Long ScopeType) {
        this.ScopeType = ScopeType;
    }

    public ModifyKafkaConsumerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyKafkaConsumerRequest(ModifyKafkaConsumerRequest source) {
        if (source.FromTopicId != null) {
            this.FromTopicId = new String(source.FromTopicId);
        }
        if (source.Compression != null) {
            this.Compression = new Long(source.Compression);
        }
        if (source.ConsumerContent != null) {
            this.ConsumerContent = new KafkaConsumerContent(source.ConsumerContent);
        }
        if (source.HasServicesLog != null) {
            this.HasServicesLog = new Long(source.HasServicesLog);
        }
        if (source.ScopeType != null) {
            this.ScopeType = new Long(source.ScopeType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FromTopicId", this.FromTopicId);
        this.setParamSimple(map, prefix + "Compression", this.Compression);
        this.setParamObj(map, prefix + "ConsumerContent.", this.ConsumerContent);
        this.setParamSimple(map, prefix + "HasServicesLog", this.HasServicesLog);
        this.setParamSimple(map, prefix + "ScopeType", this.ScopeType);

    }
}

