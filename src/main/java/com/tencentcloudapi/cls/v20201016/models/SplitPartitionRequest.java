/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SplitPartitionRequest extends AbstractModel{

    /**
    * 日志主题ID
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 待分裂分区ID
    */
    @SerializedName("PartitionId")
    @Expose
    private Long PartitionId;

    /**
    * 分区切分的哈希key的位置，只在Number=2时有意义
    */
    @SerializedName("SplitKey")
    @Expose
    private String SplitKey;

    /**
    * 分区分裂个数(可选)，默认等于2
    */
    @SerializedName("Number")
    @Expose
    private Long Number;

    /**
     * Get 日志主题ID 
     * @return TopicId 日志主题ID
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 日志主题ID
     * @param TopicId 日志主题ID
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get 待分裂分区ID 
     * @return PartitionId 待分裂分区ID
     */
    public Long getPartitionId() {
        return this.PartitionId;
    }

    /**
     * Set 待分裂分区ID
     * @param PartitionId 待分裂分区ID
     */
    public void setPartitionId(Long PartitionId) {
        this.PartitionId = PartitionId;
    }

    /**
     * Get 分区切分的哈希key的位置，只在Number=2时有意义 
     * @return SplitKey 分区切分的哈希key的位置，只在Number=2时有意义
     */
    public String getSplitKey() {
        return this.SplitKey;
    }

    /**
     * Set 分区切分的哈希key的位置，只在Number=2时有意义
     * @param SplitKey 分区切分的哈希key的位置，只在Number=2时有意义
     */
    public void setSplitKey(String SplitKey) {
        this.SplitKey = SplitKey;
    }

    /**
     * Get 分区分裂个数(可选)，默认等于2 
     * @return Number 分区分裂个数(可选)，默认等于2
     */
    public Long getNumber() {
        return this.Number;
    }

    /**
     * Set 分区分裂个数(可选)，默认等于2
     * @param Number 分区分裂个数(可选)，默认等于2
     */
    public void setNumber(Long Number) {
        this.Number = Number;
    }

    public SplitPartitionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SplitPartitionRequest(SplitPartitionRequest source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.PartitionId != null) {
            this.PartitionId = new Long(source.PartitionId);
        }
        if (source.SplitKey != null) {
            this.SplitKey = new String(source.SplitKey);
        }
        if (source.Number != null) {
            this.Number = new Long(source.Number);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "PartitionId", this.PartitionId);
        this.setParamSimple(map, prefix + "SplitKey", this.SplitKey);
        this.setParamSimple(map, prefix + "Number", this.Number);

    }
}

