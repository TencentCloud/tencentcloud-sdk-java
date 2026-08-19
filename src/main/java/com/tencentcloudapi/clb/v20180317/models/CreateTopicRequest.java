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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTopicRequest extends AbstractModel {

    /**
    * <p>日志主题的名称。</p>
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * <p>主题分区Partition的数量，不传参默认创建1个，最大创建允许10个，分裂/合并操作会改变分区数量，整体上限50个。</p>
    */
    @SerializedName("PartitionCount")
    @Expose
    private Long PartitionCount;

    /**
    * <p>日志类型，ACCESS：访问日志，HEALTH：健康检查日志，默认ACCESS。</p>
    */
    @SerializedName("TopicType")
    @Expose
    private String TopicType;

    /**
    * <p>存储时间，单位天，默认为 30。</p><ul><li>日志接入标准存储时，支持1至3600天，值为3640时代表永久保存。</li><li>日志接入低频存储时，支持7至3600天，值为3640时代表永久保存。</li></ul>
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * <p>日志主题的存储类型，可选值 HOT（标准存储），COLD（低频存储）；默认为HOT。</p>
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
    * <p>标签</p><p>最多支持一次传入20个</p>
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
     * Get <p>日志主题的名称。</p> 
     * @return TopicName <p>日志主题的名称。</p>
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set <p>日志主题的名称。</p>
     * @param TopicName <p>日志主题的名称。</p>
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get <p>主题分区Partition的数量，不传参默认创建1个，最大创建允许10个，分裂/合并操作会改变分区数量，整体上限50个。</p> 
     * @return PartitionCount <p>主题分区Partition的数量，不传参默认创建1个，最大创建允许10个，分裂/合并操作会改变分区数量，整体上限50个。</p>
     */
    public Long getPartitionCount() {
        return this.PartitionCount;
    }

    /**
     * Set <p>主题分区Partition的数量，不传参默认创建1个，最大创建允许10个，分裂/合并操作会改变分区数量，整体上限50个。</p>
     * @param PartitionCount <p>主题分区Partition的数量，不传参默认创建1个，最大创建允许10个，分裂/合并操作会改变分区数量，整体上限50个。</p>
     */
    public void setPartitionCount(Long PartitionCount) {
        this.PartitionCount = PartitionCount;
    }

    /**
     * Get <p>日志类型，ACCESS：访问日志，HEALTH：健康检查日志，默认ACCESS。</p> 
     * @return TopicType <p>日志类型，ACCESS：访问日志，HEALTH：健康检查日志，默认ACCESS。</p>
     */
    public String getTopicType() {
        return this.TopicType;
    }

    /**
     * Set <p>日志类型，ACCESS：访问日志，HEALTH：健康检查日志，默认ACCESS。</p>
     * @param TopicType <p>日志类型，ACCESS：访问日志，HEALTH：健康检查日志，默认ACCESS。</p>
     */
    public void setTopicType(String TopicType) {
        this.TopicType = TopicType;
    }

    /**
     * Get <p>存储时间，单位天，默认为 30。</p><ul><li>日志接入标准存储时，支持1至3600天，值为3640时代表永久保存。</li><li>日志接入低频存储时，支持7至3600天，值为3640时代表永久保存。</li></ul> 
     * @return Period <p>存储时间，单位天，默认为 30。</p><ul><li>日志接入标准存储时，支持1至3600天，值为3640时代表永久保存。</li><li>日志接入低频存储时，支持7至3600天，值为3640时代表永久保存。</li></ul>
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set <p>存储时间，单位天，默认为 30。</p><ul><li>日志接入标准存储时，支持1至3600天，值为3640时代表永久保存。</li><li>日志接入低频存储时，支持7至3600天，值为3640时代表永久保存。</li></ul>
     * @param Period <p>存储时间，单位天，默认为 30。</p><ul><li>日志接入标准存储时，支持1至3600天，值为3640时代表永久保存。</li><li>日志接入低频存储时，支持7至3600天，值为3640时代表永久保存。</li></ul>
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get <p>日志主题的存储类型，可选值 HOT（标准存储），COLD（低频存储）；默认为HOT。</p> 
     * @return StorageType <p>日志主题的存储类型，可选值 HOT（标准存储），COLD（低频存储）；默认为HOT。</p>
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set <p>日志主题的存储类型，可选值 HOT（标准存储），COLD（低频存储）；默认为HOT。</p>
     * @param StorageType <p>日志主题的存储类型，可选值 HOT（标准存储），COLD（低频存储）；默认为HOT。</p>
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get <p>标签</p><p>最多支持一次传入20个</p> 
     * @return Tags <p>标签</p><p>最多支持一次传入20个</p>
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签</p><p>最多支持一次传入20个</p>
     * @param Tags <p>标签</p><p>最多支持一次传入20个</p>
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    public CreateTopicRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTopicRequest(CreateTopicRequest source) {
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.PartitionCount != null) {
            this.PartitionCount = new Long(source.PartitionCount);
        }
        if (source.TopicType != null) {
            this.TopicType = new String(source.TopicType);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "PartitionCount", this.PartitionCount);
        this.setParamSimple(map, prefix + "TopicType", this.TopicType);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

