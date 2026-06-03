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

public class CreateMetaAndDataSyncDatahubTaskRequest extends AbstractModel {

    /**
    * <p>任务名称</p><p>64字符内</p>
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * <p>同步源连接</p><p>参数格式：resource-test</p>
    */
    @SerializedName("SourceResourceId")
    @Expose
    private String SourceResourceId;

    /**
    * <p>同步目标连接</p><p>参数格式：resource-test</p>
    */
    @SerializedName("TargetResourceId")
    @Expose
    private String TargetResourceId;

    /**
    * <p>标签列表</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>Offset类型，最开始位置earliest，最新位置latest，时间点位置timestamp</p><p>枚举值：</p><ul><li>earliest： 最开始位置</li><li>latest： 最新位置</li><li>timestamp： 时间点位置</li></ul>
    */
    @SerializedName("OffsetType")
    @Expose
    private String OffsetType;

    /**
    * <p>正则匹配Topic列表</p><p>与TopicList参数二选一</p>
    */
    @SerializedName("TopicRegularExpression")
    @Expose
    private String TopicRegularExpression;

    /**
    * <p>多选topic列表</p><p>与TopicRegularExpression参数二选一</p>
    */
    @SerializedName("TopicList")
    @Expose
    private String [] TopicList;

    /**
    * <p>Topic 前缀</p>
    */
    @SerializedName("Prefix")
    @Expose
    private String Prefix;

    /**
    * <p>Topic前缀分隔符</p><p>仅支持 &quot;.&quot; / &quot;-&quot; / &quot;_&quot;</p>
    */
    @SerializedName("Separator")
    @Expose
    private String Separator;

    /**
    * <p>连接器任务描述</p><p>128字符内</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get <p>任务名称</p><p>64字符内</p> 
     * @return TaskName <p>任务名称</p><p>64字符内</p>
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set <p>任务名称</p><p>64字符内</p>
     * @param TaskName <p>任务名称</p><p>64字符内</p>
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get <p>同步源连接</p><p>参数格式：resource-test</p> 
     * @return SourceResourceId <p>同步源连接</p><p>参数格式：resource-test</p>
     */
    public String getSourceResourceId() {
        return this.SourceResourceId;
    }

    /**
     * Set <p>同步源连接</p><p>参数格式：resource-test</p>
     * @param SourceResourceId <p>同步源连接</p><p>参数格式：resource-test</p>
     */
    public void setSourceResourceId(String SourceResourceId) {
        this.SourceResourceId = SourceResourceId;
    }

    /**
     * Get <p>同步目标连接</p><p>参数格式：resource-test</p> 
     * @return TargetResourceId <p>同步目标连接</p><p>参数格式：resource-test</p>
     */
    public String getTargetResourceId() {
        return this.TargetResourceId;
    }

    /**
     * Set <p>同步目标连接</p><p>参数格式：resource-test</p>
     * @param TargetResourceId <p>同步目标连接</p><p>参数格式：resource-test</p>
     */
    public void setTargetResourceId(String TargetResourceId) {
        this.TargetResourceId = TargetResourceId;
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

    /**
     * Get <p>Offset类型，最开始位置earliest，最新位置latest，时间点位置timestamp</p><p>枚举值：</p><ul><li>earliest： 最开始位置</li><li>latest： 最新位置</li><li>timestamp： 时间点位置</li></ul> 
     * @return OffsetType <p>Offset类型，最开始位置earliest，最新位置latest，时间点位置timestamp</p><p>枚举值：</p><ul><li>earliest： 最开始位置</li><li>latest： 最新位置</li><li>timestamp： 时间点位置</li></ul>
     */
    public String getOffsetType() {
        return this.OffsetType;
    }

    /**
     * Set <p>Offset类型，最开始位置earliest，最新位置latest，时间点位置timestamp</p><p>枚举值：</p><ul><li>earliest： 最开始位置</li><li>latest： 最新位置</li><li>timestamp： 时间点位置</li></ul>
     * @param OffsetType <p>Offset类型，最开始位置earliest，最新位置latest，时间点位置timestamp</p><p>枚举值：</p><ul><li>earliest： 最开始位置</li><li>latest： 最新位置</li><li>timestamp： 时间点位置</li></ul>
     */
    public void setOffsetType(String OffsetType) {
        this.OffsetType = OffsetType;
    }

    /**
     * Get <p>正则匹配Topic列表</p><p>与TopicList参数二选一</p> 
     * @return TopicRegularExpression <p>正则匹配Topic列表</p><p>与TopicList参数二选一</p>
     */
    public String getTopicRegularExpression() {
        return this.TopicRegularExpression;
    }

    /**
     * Set <p>正则匹配Topic列表</p><p>与TopicList参数二选一</p>
     * @param TopicRegularExpression <p>正则匹配Topic列表</p><p>与TopicList参数二选一</p>
     */
    public void setTopicRegularExpression(String TopicRegularExpression) {
        this.TopicRegularExpression = TopicRegularExpression;
    }

    /**
     * Get <p>多选topic列表</p><p>与TopicRegularExpression参数二选一</p> 
     * @return TopicList <p>多选topic列表</p><p>与TopicRegularExpression参数二选一</p>
     */
    public String [] getTopicList() {
        return this.TopicList;
    }

    /**
     * Set <p>多选topic列表</p><p>与TopicRegularExpression参数二选一</p>
     * @param TopicList <p>多选topic列表</p><p>与TopicRegularExpression参数二选一</p>
     */
    public void setTopicList(String [] TopicList) {
        this.TopicList = TopicList;
    }

    /**
     * Get <p>Topic 前缀</p> 
     * @return Prefix <p>Topic 前缀</p>
     */
    public String getPrefix() {
        return this.Prefix;
    }

    /**
     * Set <p>Topic 前缀</p>
     * @param Prefix <p>Topic 前缀</p>
     */
    public void setPrefix(String Prefix) {
        this.Prefix = Prefix;
    }

    /**
     * Get <p>Topic前缀分隔符</p><p>仅支持 &quot;.&quot; / &quot;-&quot; / &quot;_&quot;</p> 
     * @return Separator <p>Topic前缀分隔符</p><p>仅支持 &quot;.&quot; / &quot;-&quot; / &quot;_&quot;</p>
     */
    public String getSeparator() {
        return this.Separator;
    }

    /**
     * Set <p>Topic前缀分隔符</p><p>仅支持 &quot;.&quot; / &quot;-&quot; / &quot;_&quot;</p>
     * @param Separator <p>Topic前缀分隔符</p><p>仅支持 &quot;.&quot; / &quot;-&quot; / &quot;_&quot;</p>
     */
    public void setSeparator(String Separator) {
        this.Separator = Separator;
    }

    /**
     * Get <p>连接器任务描述</p><p>128字符内</p> 
     * @return Description <p>连接器任务描述</p><p>128字符内</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>连接器任务描述</p><p>128字符内</p>
     * @param Description <p>连接器任务描述</p><p>128字符内</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public CreateMetaAndDataSyncDatahubTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateMetaAndDataSyncDatahubTaskRequest(CreateMetaAndDataSyncDatahubTaskRequest source) {
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.SourceResourceId != null) {
            this.SourceResourceId = new String(source.SourceResourceId);
        }
        if (source.TargetResourceId != null) {
            this.TargetResourceId = new String(source.TargetResourceId);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.OffsetType != null) {
            this.OffsetType = new String(source.OffsetType);
        }
        if (source.TopicRegularExpression != null) {
            this.TopicRegularExpression = new String(source.TopicRegularExpression);
        }
        if (source.TopicList != null) {
            this.TopicList = new String[source.TopicList.length];
            for (int i = 0; i < source.TopicList.length; i++) {
                this.TopicList[i] = new String(source.TopicList[i]);
            }
        }
        if (source.Prefix != null) {
            this.Prefix = new String(source.Prefix);
        }
        if (source.Separator != null) {
            this.Separator = new String(source.Separator);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "SourceResourceId", this.SourceResourceId);
        this.setParamSimple(map, prefix + "TargetResourceId", this.TargetResourceId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "OffsetType", this.OffsetType);
        this.setParamSimple(map, prefix + "TopicRegularExpression", this.TopicRegularExpression);
        this.setParamArraySimple(map, prefix + "TopicList.", this.TopicList);
        this.setParamSimple(map, prefix + "Prefix", this.Prefix);
        this.setParamSimple(map, prefix + "Separator", this.Separator);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

