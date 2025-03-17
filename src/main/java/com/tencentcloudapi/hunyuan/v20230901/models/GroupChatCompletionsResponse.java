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
package com.tencentcloudapi.hunyuan.v20230901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GroupChatCompletionsResponse extends SSEResponseModel {

    /**
    * Unix 时间戳，单位为秒。
    */
    @SerializedName("Created")
    @Expose
    private Long Created;

    /**
    * Token 统计信息。
按照总 Token 数量计费。
    */
    @SerializedName("Usage")
    @Expose
    private Usage Usage;

    /**
    * 免责声明。
    */
    @SerializedName("Note")
    @Expose
    private String Note;

    /**
    * 本次请求的 RequestId。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 回复内容。
    */
    @SerializedName("Choices")
    @Expose
    private Choice [] Choices;

    /**
    * 错误信息。
如果流式返回中服务处理异常，返回该错误信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorMsg")
    @Expose
    private ErrorMsg ErrorMsg;

    /**
    * 搜索结果信息
    */
    @SerializedName("SearchInfo")
    @Expose
    private SearchInfo SearchInfo;

    /**
    * 多媒体信息。
说明：
1. 可以用多媒体信息替换回复内容里的占位符，得到完整的消息。
2. 可能会出现回复内容里存在占位符，但是因为审核等原因没有返回多媒体信息。
    */
    @SerializedName("Replaces")
    @Expose
    private Replace [] Replaces;

    /**
    * 推荐问答。
    */
    @SerializedName("RecommendedQuestions")
    @Expose
    private String [] RecommendedQuestions;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。本接口为流式响应接口，当请求成功时，RequestId 会被放在 HTTP 响应的 Header "X-TC-RequestId" 中。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Unix 时间戳，单位为秒。 
     * @return Created Unix 时间戳，单位为秒。
     */
    public Long getCreated() {
        return this.Created;
    }

    /**
     * Set Unix 时间戳，单位为秒。
     * @param Created Unix 时间戳，单位为秒。
     */
    public void setCreated(Long Created) {
        this.Created = Created;
    }

    /**
     * Get Token 统计信息。
按照总 Token 数量计费。 
     * @return Usage Token 统计信息。
按照总 Token 数量计费。
     */
    public Usage getUsage() {
        return this.Usage;
    }

    /**
     * Set Token 统计信息。
按照总 Token 数量计费。
     * @param Usage Token 统计信息。
按照总 Token 数量计费。
     */
    public void setUsage(Usage Usage) {
        this.Usage = Usage;
    }

    /**
     * Get 免责声明。 
     * @return Note 免责声明。
     */
    public String getNote() {
        return this.Note;
    }

    /**
     * Set 免责声明。
     * @param Note 免责声明。
     */
    public void setNote(String Note) {
        this.Note = Note;
    }

    /**
     * Get 本次请求的 RequestId。 
     * @return Id 本次请求的 RequestId。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 本次请求的 RequestId。
     * @param Id 本次请求的 RequestId。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 回复内容。 
     * @return Choices 回复内容。
     */
    public Choice [] getChoices() {
        return this.Choices;
    }

    /**
     * Set 回复内容。
     * @param Choices 回复内容。
     */
    public void setChoices(Choice [] Choices) {
        this.Choices = Choices;
    }

    /**
     * Get 错误信息。
如果流式返回中服务处理异常，返回该错误信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorMsg 错误信息。
如果流式返回中服务处理异常，返回该错误信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ErrorMsg getErrorMsg() {
        return this.ErrorMsg;
    }

    /**
     * Set 错误信息。
如果流式返回中服务处理异常，返回该错误信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorMsg 错误信息。
如果流式返回中服务处理异常，返回该错误信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorMsg(ErrorMsg ErrorMsg) {
        this.ErrorMsg = ErrorMsg;
    }

    /**
     * Get 搜索结果信息 
     * @return SearchInfo 搜索结果信息
     */
    public SearchInfo getSearchInfo() {
        return this.SearchInfo;
    }

    /**
     * Set 搜索结果信息
     * @param SearchInfo 搜索结果信息
     */
    public void setSearchInfo(SearchInfo SearchInfo) {
        this.SearchInfo = SearchInfo;
    }

    /**
     * Get 多媒体信息。
说明：
1. 可以用多媒体信息替换回复内容里的占位符，得到完整的消息。
2. 可能会出现回复内容里存在占位符，但是因为审核等原因没有返回多媒体信息。 
     * @return Replaces 多媒体信息。
说明：
1. 可以用多媒体信息替换回复内容里的占位符，得到完整的消息。
2. 可能会出现回复内容里存在占位符，但是因为审核等原因没有返回多媒体信息。
     */
    public Replace [] getReplaces() {
        return this.Replaces;
    }

    /**
     * Set 多媒体信息。
说明：
1. 可以用多媒体信息替换回复内容里的占位符，得到完整的消息。
2. 可能会出现回复内容里存在占位符，但是因为审核等原因没有返回多媒体信息。
     * @param Replaces 多媒体信息。
说明：
1. 可以用多媒体信息替换回复内容里的占位符，得到完整的消息。
2. 可能会出现回复内容里存在占位符，但是因为审核等原因没有返回多媒体信息。
     */
    public void setReplaces(Replace [] Replaces) {
        this.Replaces = Replaces;
    }

    /**
     * Get 推荐问答。 
     * @return RecommendedQuestions 推荐问答。
     */
    public String [] getRecommendedQuestions() {
        return this.RecommendedQuestions;
    }

    /**
     * Set 推荐问答。
     * @param RecommendedQuestions 推荐问答。
     */
    public void setRecommendedQuestions(String [] RecommendedQuestions) {
        this.RecommendedQuestions = RecommendedQuestions;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。本接口为流式响应接口，当请求成功时，RequestId 会被放在 HTTP 响应的 Header "X-TC-RequestId" 中。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。本接口为流式响应接口，当请求成功时，RequestId 会被放在 HTTP 响应的 Header "X-TC-RequestId" 中。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。本接口为流式响应接口，当请求成功时，RequestId 会被放在 HTTP 响应的 Header "X-TC-RequestId" 中。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。本接口为流式响应接口，当请求成功时，RequestId 会被放在 HTTP 响应的 Header "X-TC-RequestId" 中。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public GroupChatCompletionsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GroupChatCompletionsResponse(GroupChatCompletionsResponse source) {
        if (source.Created != null) {
            this.Created = new Long(source.Created);
        }
        if (source.Usage != null) {
            this.Usage = new Usage(source.Usage);
        }
        if (source.Note != null) {
            this.Note = new String(source.Note);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Choices != null) {
            this.Choices = new Choice[source.Choices.length];
            for (int i = 0; i < source.Choices.length; i++) {
                this.Choices[i] = new Choice(source.Choices[i]);
            }
        }
        if (source.ErrorMsg != null) {
            this.ErrorMsg = new ErrorMsg(source.ErrorMsg);
        }
        if (source.SearchInfo != null) {
            this.SearchInfo = new SearchInfo(source.SearchInfo);
        }
        if (source.Replaces != null) {
            this.Replaces = new Replace[source.Replaces.length];
            for (int i = 0; i < source.Replaces.length; i++) {
                this.Replaces[i] = new Replace(source.Replaces[i]);
            }
        }
        if (source.RecommendedQuestions != null) {
            this.RecommendedQuestions = new String[source.RecommendedQuestions.length];
            for (int i = 0; i < source.RecommendedQuestions.length; i++) {
                this.RecommendedQuestions[i] = new String(source.RecommendedQuestions[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Created", this.Created);
        this.setParamObj(map, prefix + "Usage.", this.Usage);
        this.setParamSimple(map, prefix + "Note", this.Note);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamArrayObj(map, prefix + "Choices.", this.Choices);
        this.setParamObj(map, prefix + "ErrorMsg.", this.ErrorMsg);
        this.setParamObj(map, prefix + "SearchInfo.", this.SearchInfo);
        this.setParamArrayObj(map, prefix + "Replaces.", this.Replaces);
        this.setParamArraySimple(map, prefix + "RecommendedQuestions.", this.RecommendedQuestions);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

