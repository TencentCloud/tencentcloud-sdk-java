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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDatahubTopicRequest extends AbstractModel{

    /**
    * 名称，是一个不超过 128 个字符的字符串，必须以字母为首字符，剩余部分可以包含字母、数字和横划线(-)
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Partition个数，大于0
    */
    @SerializedName("PartitionNum")
    @Expose
    private Long PartitionNum;

    /**
    * 消息保留时间，单位ms，当前最小值为60000ms
    */
    @SerializedName("RetentionMs")
    @Expose
    private Long RetentionMs;

    /**
    * 主题备注，是一个不超过 64 个字符的字符串，必须以字母为首字符，剩余部分可以包含字母、数字和横划线(-)
    */
    @SerializedName("Note")
    @Expose
    private String Note;

    /**
    * 标签列表
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get 名称，是一个不超过 128 个字符的字符串，必须以字母为首字符，剩余部分可以包含字母、数字和横划线(-) 
     * @return Name 名称，是一个不超过 128 个字符的字符串，必须以字母为首字符，剩余部分可以包含字母、数字和横划线(-)
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称，是一个不超过 128 个字符的字符串，必须以字母为首字符，剩余部分可以包含字母、数字和横划线(-)
     * @param Name 名称，是一个不超过 128 个字符的字符串，必须以字母为首字符，剩余部分可以包含字母、数字和横划线(-)
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Partition个数，大于0 
     * @return PartitionNum Partition个数，大于0
     */
    public Long getPartitionNum() {
        return this.PartitionNum;
    }

    /**
     * Set Partition个数，大于0
     * @param PartitionNum Partition个数，大于0
     */
    public void setPartitionNum(Long PartitionNum) {
        this.PartitionNum = PartitionNum;
    }

    /**
     * Get 消息保留时间，单位ms，当前最小值为60000ms 
     * @return RetentionMs 消息保留时间，单位ms，当前最小值为60000ms
     */
    public Long getRetentionMs() {
        return this.RetentionMs;
    }

    /**
     * Set 消息保留时间，单位ms，当前最小值为60000ms
     * @param RetentionMs 消息保留时间，单位ms，当前最小值为60000ms
     */
    public void setRetentionMs(Long RetentionMs) {
        this.RetentionMs = RetentionMs;
    }

    /**
     * Get 主题备注，是一个不超过 64 个字符的字符串，必须以字母为首字符，剩余部分可以包含字母、数字和横划线(-) 
     * @return Note 主题备注，是一个不超过 64 个字符的字符串，必须以字母为首字符，剩余部分可以包含字母、数字和横划线(-)
     */
    public String getNote() {
        return this.Note;
    }

    /**
     * Set 主题备注，是一个不超过 64 个字符的字符串，必须以字母为首字符，剩余部分可以包含字母、数字和横划线(-)
     * @param Note 主题备注，是一个不超过 64 个字符的字符串，必须以字母为首字符，剩余部分可以包含字母、数字和横划线(-)
     */
    public void setNote(String Note) {
        this.Note = Note;
    }

    /**
     * Get 标签列表 
     * @return Tags 标签列表
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签列表
     * @param Tags 标签列表
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public CreateDatahubTopicRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDatahubTopicRequest(CreateDatahubTopicRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.PartitionNum != null) {
            this.PartitionNum = new Long(source.PartitionNum);
        }
        if (source.RetentionMs != null) {
            this.RetentionMs = new Long(source.RetentionMs);
        }
        if (source.Note != null) {
            this.Note = new String(source.Note);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "PartitionNum", this.PartitionNum);
        this.setParamSimple(map, prefix + "RetentionMs", this.RetentionMs);
        this.setParamSimple(map, prefix + "Note", this.Note);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

