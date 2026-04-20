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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDatahubTopicRequest extends AbstractModel {

    /**
    * <p>名称，是一个不超过 128 个字符的字符串，必须以“AppId-”为首字符，剩余部分可以包含字母、数字和横划线(-)，可通过接口DescribeAppInfo获取。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Partition个数，最大值为500，大于0</p>
    */
    @SerializedName("PartitionNum")
    @Expose
    private Long PartitionNum;

    /**
    * <p>消息保留时间，单位ms，当前最小值为60000ms</p>
    */
    @SerializedName("RetentionMs")
    @Expose
    private Long RetentionMs;

    /**
    * <p>主题备注，是一个不超过 64 个字符的字符串，可以包含字母、数字和横划线(-)。</p>
    */
    @SerializedName("Note")
    @Expose
    private String Note;

    /**
    * <p>标签列表</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get <p>名称，是一个不超过 128 个字符的字符串，必须以“AppId-”为首字符，剩余部分可以包含字母、数字和横划线(-)，可通过接口DescribeAppInfo获取。</p> 
     * @return Name <p>名称，是一个不超过 128 个字符的字符串，必须以“AppId-”为首字符，剩余部分可以包含字母、数字和横划线(-)，可通过接口DescribeAppInfo获取。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>名称，是一个不超过 128 个字符的字符串，必须以“AppId-”为首字符，剩余部分可以包含字母、数字和横划线(-)，可通过接口DescribeAppInfo获取。</p>
     * @param Name <p>名称，是一个不超过 128 个字符的字符串，必须以“AppId-”为首字符，剩余部分可以包含字母、数字和横划线(-)，可通过接口DescribeAppInfo获取。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Partition个数，最大值为500，大于0</p> 
     * @return PartitionNum <p>Partition个数，最大值为500，大于0</p>
     */
    public Long getPartitionNum() {
        return this.PartitionNum;
    }

    /**
     * Set <p>Partition个数，最大值为500，大于0</p>
     * @param PartitionNum <p>Partition个数，最大值为500，大于0</p>
     */
    public void setPartitionNum(Long PartitionNum) {
        this.PartitionNum = PartitionNum;
    }

    /**
     * Get <p>消息保留时间，单位ms，当前最小值为60000ms</p> 
     * @return RetentionMs <p>消息保留时间，单位ms，当前最小值为60000ms</p>
     */
    public Long getRetentionMs() {
        return this.RetentionMs;
    }

    /**
     * Set <p>消息保留时间，单位ms，当前最小值为60000ms</p>
     * @param RetentionMs <p>消息保留时间，单位ms，当前最小值为60000ms</p>
     */
    public void setRetentionMs(Long RetentionMs) {
        this.RetentionMs = RetentionMs;
    }

    /**
     * Get <p>主题备注，是一个不超过 64 个字符的字符串，可以包含字母、数字和横划线(-)。</p> 
     * @return Note <p>主题备注，是一个不超过 64 个字符的字符串，可以包含字母、数字和横划线(-)。</p>
     */
    public String getNote() {
        return this.Note;
    }

    /**
     * Set <p>主题备注，是一个不超过 64 个字符的字符串，可以包含字母、数字和横划线(-)。</p>
     * @param Note <p>主题备注，是一个不超过 64 个字符的字符串，可以包含字母、数字和横划线(-)。</p>
     */
    public void setNote(String Note) {
        this.Note = Note;
    }

    /**
     * Get <p>标签列表</p> 
     * @return Tags <p>标签列表</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签列表</p>
     * @param Tags <p>标签列表</p>
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

