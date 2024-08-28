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

public class QueryHunyuanImageChatJobResponse extends AbstractModel {

    /**
    * 当前任务状态码：
1：等待中、2：运行中、4：处理失败、5：处理完成。
    */
    @SerializedName("JobStatusCode")
    @Expose
    private String JobStatusCode;

    /**
    * 当前任务状态：排队中、处理中、处理失败或者处理完成。

    */
    @SerializedName("JobStatusMsg")
    @Expose
    private String JobStatusMsg;

    /**
    * 任务处理失败错误码。

    */
    @SerializedName("JobErrorCode")
    @Expose
    private String JobErrorCode;

    /**
    * 任务处理失败错误信息。

    */
    @SerializedName("JobErrorMsg")
    @Expose
    private String JobErrorMsg;

    /**
    * 本轮对话的 ChatId，ChatId 用于唯一标识一轮对话。
一个对话组中，最多支持进行100轮对话。
每轮对话数据有效期为7天，到期后 ChatId 失效，有效期内的历史对话数据可通过 History 查询，如有长期使用需求请及时保存输入输出数据。
    */
    @SerializedName("ChatId")
    @Expose
    private String ChatId;

    /**
    * 生成图 URL 列表，有效期7天，请及时保存。
    */
    @SerializedName("ResultImage")
    @Expose
    private String [] ResultImage;

    /**
    * 结果 detail 数组，Success 代表成功。

    */
    @SerializedName("ResultDetails")
    @Expose
    private String [] ResultDetails;

    /**
    * 本轮对话前置的历史对话数据（不含生成图）。
    */
    @SerializedName("History")
    @Expose
    private History [] History;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 当前任务状态码：
1：等待中、2：运行中、4：处理失败、5：处理完成。 
     * @return JobStatusCode 当前任务状态码：
1：等待中、2：运行中、4：处理失败、5：处理完成。
     */
    public String getJobStatusCode() {
        return this.JobStatusCode;
    }

    /**
     * Set 当前任务状态码：
1：等待中、2：运行中、4：处理失败、5：处理完成。
     * @param JobStatusCode 当前任务状态码：
1：等待中、2：运行中、4：处理失败、5：处理完成。
     */
    public void setJobStatusCode(String JobStatusCode) {
        this.JobStatusCode = JobStatusCode;
    }

    /**
     * Get 当前任务状态：排队中、处理中、处理失败或者处理完成。
 
     * @return JobStatusMsg 当前任务状态：排队中、处理中、处理失败或者处理完成。

     */
    public String getJobStatusMsg() {
        return this.JobStatusMsg;
    }

    /**
     * Set 当前任务状态：排队中、处理中、处理失败或者处理完成。

     * @param JobStatusMsg 当前任务状态：排队中、处理中、处理失败或者处理完成。

     */
    public void setJobStatusMsg(String JobStatusMsg) {
        this.JobStatusMsg = JobStatusMsg;
    }

    /**
     * Get 任务处理失败错误码。
 
     * @return JobErrorCode 任务处理失败错误码。

     */
    public String getJobErrorCode() {
        return this.JobErrorCode;
    }

    /**
     * Set 任务处理失败错误码。

     * @param JobErrorCode 任务处理失败错误码。

     */
    public void setJobErrorCode(String JobErrorCode) {
        this.JobErrorCode = JobErrorCode;
    }

    /**
     * Get 任务处理失败错误信息。
 
     * @return JobErrorMsg 任务处理失败错误信息。

     */
    public String getJobErrorMsg() {
        return this.JobErrorMsg;
    }

    /**
     * Set 任务处理失败错误信息。

     * @param JobErrorMsg 任务处理失败错误信息。

     */
    public void setJobErrorMsg(String JobErrorMsg) {
        this.JobErrorMsg = JobErrorMsg;
    }

    /**
     * Get 本轮对话的 ChatId，ChatId 用于唯一标识一轮对话。
一个对话组中，最多支持进行100轮对话。
每轮对话数据有效期为7天，到期后 ChatId 失效，有效期内的历史对话数据可通过 History 查询，如有长期使用需求请及时保存输入输出数据。 
     * @return ChatId 本轮对话的 ChatId，ChatId 用于唯一标识一轮对话。
一个对话组中，最多支持进行100轮对话。
每轮对话数据有效期为7天，到期后 ChatId 失效，有效期内的历史对话数据可通过 History 查询，如有长期使用需求请及时保存输入输出数据。
     */
    public String getChatId() {
        return this.ChatId;
    }

    /**
     * Set 本轮对话的 ChatId，ChatId 用于唯一标识一轮对话。
一个对话组中，最多支持进行100轮对话。
每轮对话数据有效期为7天，到期后 ChatId 失效，有效期内的历史对话数据可通过 History 查询，如有长期使用需求请及时保存输入输出数据。
     * @param ChatId 本轮对话的 ChatId，ChatId 用于唯一标识一轮对话。
一个对话组中，最多支持进行100轮对话。
每轮对话数据有效期为7天，到期后 ChatId 失效，有效期内的历史对话数据可通过 History 查询，如有长期使用需求请及时保存输入输出数据。
     */
    public void setChatId(String ChatId) {
        this.ChatId = ChatId;
    }

    /**
     * Get 生成图 URL 列表，有效期7天，请及时保存。 
     * @return ResultImage 生成图 URL 列表，有效期7天，请及时保存。
     */
    public String [] getResultImage() {
        return this.ResultImage;
    }

    /**
     * Set 生成图 URL 列表，有效期7天，请及时保存。
     * @param ResultImage 生成图 URL 列表，有效期7天，请及时保存。
     */
    public void setResultImage(String [] ResultImage) {
        this.ResultImage = ResultImage;
    }

    /**
     * Get 结果 detail 数组，Success 代表成功。
 
     * @return ResultDetails 结果 detail 数组，Success 代表成功。

     */
    public String [] getResultDetails() {
        return this.ResultDetails;
    }

    /**
     * Set 结果 detail 数组，Success 代表成功。

     * @param ResultDetails 结果 detail 数组，Success 代表成功。

     */
    public void setResultDetails(String [] ResultDetails) {
        this.ResultDetails = ResultDetails;
    }

    /**
     * Get 本轮对话前置的历史对话数据（不含生成图）。 
     * @return History 本轮对话前置的历史对话数据（不含生成图）。
     */
    public History [] getHistory() {
        return this.History;
    }

    /**
     * Set 本轮对话前置的历史对话数据（不含生成图）。
     * @param History 本轮对话前置的历史对话数据（不含生成图）。
     */
    public void setHistory(History [] History) {
        this.History = History;
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

    public QueryHunyuanImageChatJobResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryHunyuanImageChatJobResponse(QueryHunyuanImageChatJobResponse source) {
        if (source.JobStatusCode != null) {
            this.JobStatusCode = new String(source.JobStatusCode);
        }
        if (source.JobStatusMsg != null) {
            this.JobStatusMsg = new String(source.JobStatusMsg);
        }
        if (source.JobErrorCode != null) {
            this.JobErrorCode = new String(source.JobErrorCode);
        }
        if (source.JobErrorMsg != null) {
            this.JobErrorMsg = new String(source.JobErrorMsg);
        }
        if (source.ChatId != null) {
            this.ChatId = new String(source.ChatId);
        }
        if (source.ResultImage != null) {
            this.ResultImage = new String[source.ResultImage.length];
            for (int i = 0; i < source.ResultImage.length; i++) {
                this.ResultImage[i] = new String(source.ResultImage[i]);
            }
        }
        if (source.ResultDetails != null) {
            this.ResultDetails = new String[source.ResultDetails.length];
            for (int i = 0; i < source.ResultDetails.length; i++) {
                this.ResultDetails[i] = new String(source.ResultDetails[i]);
            }
        }
        if (source.History != null) {
            this.History = new History[source.History.length];
            for (int i = 0; i < source.History.length; i++) {
                this.History[i] = new History(source.History[i]);
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
        this.setParamSimple(map, prefix + "JobStatusCode", this.JobStatusCode);
        this.setParamSimple(map, prefix + "JobStatusMsg", this.JobStatusMsg);
        this.setParamSimple(map, prefix + "JobErrorCode", this.JobErrorCode);
        this.setParamSimple(map, prefix + "JobErrorMsg", this.JobErrorMsg);
        this.setParamSimple(map, prefix + "ChatId", this.ChatId);
        this.setParamArraySimple(map, prefix + "ResultImage.", this.ResultImage);
        this.setParamArraySimple(map, prefix + "ResultDetails.", this.ResultDetails);
        this.setParamArrayObj(map, prefix + "History.", this.History);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

