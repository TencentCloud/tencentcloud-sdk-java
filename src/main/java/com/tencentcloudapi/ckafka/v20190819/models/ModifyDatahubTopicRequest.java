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

public class ModifyDatahubTopicRequest extends AbstractModel {

    /**
    * <p>弹性topic名称</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/597/86863">DescribeDatahubTopics</a></p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>消息保留时间，单位：ms，当前最小值为60000ms。</p>
    */
    @SerializedName("RetentionMs")
    @Expose
    private Long RetentionMs;

    /**
    * <p>主题备注</p><p>入参限制：不超过64个字符</p>
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
     * Get <p>弹性topic名称</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/597/86863">DescribeDatahubTopics</a></p> 
     * @return Name <p>弹性topic名称</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/597/86863">DescribeDatahubTopics</a></p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>弹性topic名称</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/597/86863">DescribeDatahubTopics</a></p>
     * @param Name <p>弹性topic名称</p><p>取值参考：<a href="https://cloud.tencent.com/document/api/597/86863">DescribeDatahubTopics</a></p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>消息保留时间，单位：ms，当前最小值为60000ms。</p> 
     * @return RetentionMs <p>消息保留时间，单位：ms，当前最小值为60000ms。</p>
     */
    public Long getRetentionMs() {
        return this.RetentionMs;
    }

    /**
     * Set <p>消息保留时间，单位：ms，当前最小值为60000ms。</p>
     * @param RetentionMs <p>消息保留时间，单位：ms，当前最小值为60000ms。</p>
     */
    public void setRetentionMs(Long RetentionMs) {
        this.RetentionMs = RetentionMs;
    }

    /**
     * Get <p>主题备注</p><p>入参限制：不超过64个字符</p> 
     * @return Note <p>主题备注</p><p>入参限制：不超过64个字符</p>
     */
    public String getNote() {
        return this.Note;
    }

    /**
     * Set <p>主题备注</p><p>入参限制：不超过64个字符</p>
     * @param Note <p>主题备注</p><p>入参限制：不超过64个字符</p>
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

    public ModifyDatahubTopicRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDatahubTopicRequest(ModifyDatahubTopicRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
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
        this.setParamSimple(map, prefix + "RetentionMs", this.RetentionMs);
        this.setParamSimple(map, prefix + "Note", this.Note);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

