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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAsrHotwordsResponse extends AbstractModel {

    /**
    * 需要查询的热词库 id
    */
    @SerializedName("HotwordsId")
    @Expose
    private String HotwordsId;

    /**
    * 当前热词库 id 状态，为 0 表示查询的时刻，没有模板绑定这个热词库，可以删除
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 热词库的名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 临时热词库为 0，返回创建时候的字符串
文件热词库为 1，返回创建是上传的文件内容


注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 热词文件上传时的文件名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 查询返回的热词库列表
    */
    @SerializedName("HotWords")
    @Expose
    private AsrHotwordsSetItem [] HotWords;

    /**
    * 热词库文本，根据 Type 区分
如果 Type 为 0，是热词库字符串
如果 Type 是 1，是热词库文本文件的文件内容 base64 编码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 当前热词库包含的词语数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WordCount")
    @Expose
    private Long WordCount;

    /**
    * 分页偏移量，默认值：0。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回记录条数，默认值：10，最大值：100。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 热词库创建时间 ISOUTC 格式 "2006-01-02T15:04:05Z"
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 热词库修改时间 ISOUTC 格式 "2006-01-02T15:04:05Z"
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 需要查询的热词库 id 
     * @return HotwordsId 需要查询的热词库 id
     */
    public String getHotwordsId() {
        return this.HotwordsId;
    }

    /**
     * Set 需要查询的热词库 id
     * @param HotwordsId 需要查询的热词库 id
     */
    public void setHotwordsId(String HotwordsId) {
        this.HotwordsId = HotwordsId;
    }

    /**
     * Get 当前热词库 id 状态，为 0 表示查询的时刻，没有模板绑定这个热词库，可以删除
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 当前热词库 id 状态，为 0 表示查询的时刻，没有模板绑定这个热词库，可以删除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 当前热词库 id 状态，为 0 表示查询的时刻，没有模板绑定这个热词库，可以删除
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 当前热词库 id 状态，为 0 表示查询的时刻，没有模板绑定这个热词库，可以删除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 热词库的名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 热词库的名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 热词库的名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 热词库的名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 临时热词库为 0，返回创建时候的字符串
文件热词库为 1，返回创建是上传的文件内容


注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 临时热词库为 0，返回创建时候的字符串
文件热词库为 1，返回创建是上传的文件内容


注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 临时热词库为 0，返回创建时候的字符串
文件热词库为 1，返回创建是上传的文件内容


注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 临时热词库为 0，返回创建时候的字符串
文件热词库为 1，返回创建是上传的文件内容


注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 热词文件上传时的文件名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileName 热词文件上传时的文件名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 热词文件上传时的文件名
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileName 热词文件上传时的文件名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 查询返回的热词库列表 
     * @return HotWords 查询返回的热词库列表
     */
    public AsrHotwordsSetItem [] getHotWords() {
        return this.HotWords;
    }

    /**
     * Set 查询返回的热词库列表
     * @param HotWords 查询返回的热词库列表
     */
    public void setHotWords(AsrHotwordsSetItem [] HotWords) {
        this.HotWords = HotWords;
    }

    /**
     * Get 热词库文本，根据 Type 区分
如果 Type 为 0，是热词库字符串
如果 Type 是 1，是热词库文本文件的文件内容 base64 编码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Content 热词库文本，根据 Type 区分
如果 Type 为 0，是热词库字符串
如果 Type 是 1，是热词库文本文件的文件内容 base64 编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 热词库文本，根据 Type 区分
如果 Type 为 0，是热词库字符串
如果 Type 是 1，是热词库文本文件的文件内容 base64 编码
注意：此字段可能返回 null，表示取不到有效值。
     * @param Content 热词库文本，根据 Type 区分
如果 Type 为 0，是热词库字符串
如果 Type 是 1，是热词库文本文件的文件内容 base64 编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 当前热词库包含的词语数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WordCount 当前热词库包含的词语数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWordCount() {
        return this.WordCount;
    }

    /**
     * Set 当前热词库包含的词语数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param WordCount 当前热词库包含的词语数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWordCount(Long WordCount) {
        this.WordCount = WordCount;
    }

    /**
     * Get 分页偏移量，默认值：0。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Offset 分页偏移量，默认值：0。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量，默认值：0。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Offset 分页偏移量，默认值：0。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回记录条数，默认值：10，最大值：100。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Limit 返回记录条数，默认值：10，最大值：100。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回记录条数，默认值：10，最大值：100。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Limit 返回记录条数，默认值：10，最大值：100。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 热词库创建时间 ISOUTC 格式 "2006-01-02T15:04:05Z"
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 热词库创建时间 ISOUTC 格式 "2006-01-02T15:04:05Z"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 热词库创建时间 ISOUTC 格式 "2006-01-02T15:04:05Z"
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 热词库创建时间 ISOUTC 格式 "2006-01-02T15:04:05Z"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 热词库修改时间 ISOUTC 格式 "2006-01-02T15:04:05Z"
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 热词库修改时间 ISOUTC 格式 "2006-01-02T15:04:05Z"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 热词库修改时间 ISOUTC 格式 "2006-01-02T15:04:05Z"
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 热词库修改时间 ISOUTC 格式 "2006-01-02T15:04:05Z"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeAsrHotwordsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAsrHotwordsResponse(DescribeAsrHotwordsResponse source) {
        if (source.HotwordsId != null) {
            this.HotwordsId = new String(source.HotwordsId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.HotWords != null) {
            this.HotWords = new AsrHotwordsSetItem[source.HotWords.length];
            for (int i = 0; i < source.HotWords.length; i++) {
                this.HotWords[i] = new AsrHotwordsSetItem(source.HotWords[i]);
            }
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.WordCount != null) {
            this.WordCount = new Long(source.WordCount);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HotwordsId", this.HotwordsId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamArrayObj(map, prefix + "HotWords.", this.HotWords);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "WordCount", this.WordCount);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

