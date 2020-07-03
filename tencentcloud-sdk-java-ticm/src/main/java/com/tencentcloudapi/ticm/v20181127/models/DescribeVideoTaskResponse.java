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
package com.tencentcloudapi.ticm.v20181127.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVideoTaskResponse extends AbstractModel{

    /**
    * 任务状态，取值：
WAITING：等待中；
PROCESSING：处理中；
FINISH：已完成。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 任务开始执行的时间，采用 ISO 日期格式。
    */
    @SerializedName("BeginProcessTime")
    @Expose
    private String BeginProcessTime;

    /**
    * 任务执行完毕的时间，采用 ISO 日期格式。
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
    * 视频内容审核智能画面鉴黄任务的查询结果。
    */
    @SerializedName("PornResult")
    @Expose
    private VodPornReviewResult PornResult;

    /**
    * 视频内容审核智能画面鉴恐任务的查询结果。
    */
    @SerializedName("TerrorismResult")
    @Expose
    private VodTerrorismReviewResult TerrorismResult;

    /**
    * 视频内容审核智能画面鉴政任务的查询结果。
    */
    @SerializedName("PoliticalResult")
    @Expose
    private VodPoliticalReviewResult PoliticalResult;

    /**
    * 视频内容审核 Ocr 文字鉴政任务的查询结果。
    */
    @SerializedName("PoliticalOcrResult")
    @Expose
    private VodPoliticalOcrReviewResult PoliticalOcrResult;

    /**
    * 视频内容审核 Asr 文字鉴黄任务的查询结果。
    */
    @SerializedName("PornAsrResult")
    @Expose
    private VodPornAsrReviewResult PornAsrResult;

    /**
    * 视频内容审核 Asr 文字鉴政任务的查询结果。
    */
    @SerializedName("PoliticalAsrResult")
    @Expose
    private VodPoliticalAsrReviewResult PoliticalAsrResult;

    /**
    * 视频内容审核 Ocr 文字鉴黄任务的查询结果。
    */
    @SerializedName("PornOcrResult")
    @Expose
    private VodPornOcrResult PornOcrResult;

    /**
    * 原始视频的元信息。
    */
    @SerializedName("MetaData")
    @Expose
    private VodMetaData MetaData;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 任务状态，取值：
WAITING：等待中；
PROCESSING：处理中；
FINISH：已完成。 
     * @return Status 任务状态，取值：
WAITING：等待中；
PROCESSING：处理中；
FINISH：已完成。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态，取值：
WAITING：等待中；
PROCESSING：处理中；
FINISH：已完成。
     * @param Status 任务状态，取值：
WAITING：等待中；
PROCESSING：处理中；
FINISH：已完成。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 任务开始执行的时间，采用 ISO 日期格式。 
     * @return BeginProcessTime 任务开始执行的时间，采用 ISO 日期格式。
     */
    public String getBeginProcessTime() {
        return this.BeginProcessTime;
    }

    /**
     * Set 任务开始执行的时间，采用 ISO 日期格式。
     * @param BeginProcessTime 任务开始执行的时间，采用 ISO 日期格式。
     */
    public void setBeginProcessTime(String BeginProcessTime) {
        this.BeginProcessTime = BeginProcessTime;
    }

    /**
     * Get 任务执行完毕的时间，采用 ISO 日期格式。 
     * @return FinishTime 任务执行完毕的时间，采用 ISO 日期格式。
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set 任务执行完毕的时间，采用 ISO 日期格式。
     * @param FinishTime 任务执行完毕的时间，采用 ISO 日期格式。
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    /**
     * Get 视频内容审核智能画面鉴黄任务的查询结果。 
     * @return PornResult 视频内容审核智能画面鉴黄任务的查询结果。
     */
    public VodPornReviewResult getPornResult() {
        return this.PornResult;
    }

    /**
     * Set 视频内容审核智能画面鉴黄任务的查询结果。
     * @param PornResult 视频内容审核智能画面鉴黄任务的查询结果。
     */
    public void setPornResult(VodPornReviewResult PornResult) {
        this.PornResult = PornResult;
    }

    /**
     * Get 视频内容审核智能画面鉴恐任务的查询结果。 
     * @return TerrorismResult 视频内容审核智能画面鉴恐任务的查询结果。
     */
    public VodTerrorismReviewResult getTerrorismResult() {
        return this.TerrorismResult;
    }

    /**
     * Set 视频内容审核智能画面鉴恐任务的查询结果。
     * @param TerrorismResult 视频内容审核智能画面鉴恐任务的查询结果。
     */
    public void setTerrorismResult(VodTerrorismReviewResult TerrorismResult) {
        this.TerrorismResult = TerrorismResult;
    }

    /**
     * Get 视频内容审核智能画面鉴政任务的查询结果。 
     * @return PoliticalResult 视频内容审核智能画面鉴政任务的查询结果。
     */
    public VodPoliticalReviewResult getPoliticalResult() {
        return this.PoliticalResult;
    }

    /**
     * Set 视频内容审核智能画面鉴政任务的查询结果。
     * @param PoliticalResult 视频内容审核智能画面鉴政任务的查询结果。
     */
    public void setPoliticalResult(VodPoliticalReviewResult PoliticalResult) {
        this.PoliticalResult = PoliticalResult;
    }

    /**
     * Get 视频内容审核 Ocr 文字鉴政任务的查询结果。 
     * @return PoliticalOcrResult 视频内容审核 Ocr 文字鉴政任务的查询结果。
     */
    public VodPoliticalOcrReviewResult getPoliticalOcrResult() {
        return this.PoliticalOcrResult;
    }

    /**
     * Set 视频内容审核 Ocr 文字鉴政任务的查询结果。
     * @param PoliticalOcrResult 视频内容审核 Ocr 文字鉴政任务的查询结果。
     */
    public void setPoliticalOcrResult(VodPoliticalOcrReviewResult PoliticalOcrResult) {
        this.PoliticalOcrResult = PoliticalOcrResult;
    }

    /**
     * Get 视频内容审核 Asr 文字鉴黄任务的查询结果。 
     * @return PornAsrResult 视频内容审核 Asr 文字鉴黄任务的查询结果。
     */
    public VodPornAsrReviewResult getPornAsrResult() {
        return this.PornAsrResult;
    }

    /**
     * Set 视频内容审核 Asr 文字鉴黄任务的查询结果。
     * @param PornAsrResult 视频内容审核 Asr 文字鉴黄任务的查询结果。
     */
    public void setPornAsrResult(VodPornAsrReviewResult PornAsrResult) {
        this.PornAsrResult = PornAsrResult;
    }

    /**
     * Get 视频内容审核 Asr 文字鉴政任务的查询结果。 
     * @return PoliticalAsrResult 视频内容审核 Asr 文字鉴政任务的查询结果。
     */
    public VodPoliticalAsrReviewResult getPoliticalAsrResult() {
        return this.PoliticalAsrResult;
    }

    /**
     * Set 视频内容审核 Asr 文字鉴政任务的查询结果。
     * @param PoliticalAsrResult 视频内容审核 Asr 文字鉴政任务的查询结果。
     */
    public void setPoliticalAsrResult(VodPoliticalAsrReviewResult PoliticalAsrResult) {
        this.PoliticalAsrResult = PoliticalAsrResult;
    }

    /**
     * Get 视频内容审核 Ocr 文字鉴黄任务的查询结果。 
     * @return PornOcrResult 视频内容审核 Ocr 文字鉴黄任务的查询结果。
     */
    public VodPornOcrResult getPornOcrResult() {
        return this.PornOcrResult;
    }

    /**
     * Set 视频内容审核 Ocr 文字鉴黄任务的查询结果。
     * @param PornOcrResult 视频内容审核 Ocr 文字鉴黄任务的查询结果。
     */
    public void setPornOcrResult(VodPornOcrResult PornOcrResult) {
        this.PornOcrResult = PornOcrResult;
    }

    /**
     * Get 原始视频的元信息。 
     * @return MetaData 原始视频的元信息。
     */
    public VodMetaData getMetaData() {
        return this.MetaData;
    }

    /**
     * Set 原始视频的元信息。
     * @param MetaData 原始视频的元信息。
     */
    public void setMetaData(VodMetaData MetaData) {
        this.MetaData = MetaData;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "BeginProcessTime", this.BeginProcessTime);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);
        this.setParamObj(map, prefix + "PornResult.", this.PornResult);
        this.setParamObj(map, prefix + "TerrorismResult.", this.TerrorismResult);
        this.setParamObj(map, prefix + "PoliticalResult.", this.PoliticalResult);
        this.setParamObj(map, prefix + "PoliticalOcrResult.", this.PoliticalOcrResult);
        this.setParamObj(map, prefix + "PornAsrResult.", this.PornAsrResult);
        this.setParamObj(map, prefix + "PoliticalAsrResult.", this.PoliticalAsrResult);
        this.setParamObj(map, prefix + "PornOcrResult.", this.PornOcrResult);
        this.setParamObj(map, prefix + "MetaData.", this.MetaData);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

