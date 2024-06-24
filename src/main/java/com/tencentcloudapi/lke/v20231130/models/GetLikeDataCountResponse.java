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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetLikeDataCountResponse extends AbstractModel {

    /**
    * 可评价消息数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 评价数
    */
    @SerializedName("AppraisalTotal")
    @Expose
    private Long AppraisalTotal;

    /**
    * 参评率
    */
    @SerializedName("ParticipationRate")
    @Expose
    private Float ParticipationRate;

    /**
    * 点赞数
    */
    @SerializedName("LikeTotal")
    @Expose
    private Long LikeTotal;

    /**
    * 点赞率
    */
    @SerializedName("LikeRate")
    @Expose
    private Float LikeRate;

    /**
    * 点踩数
    */
    @SerializedName("DislikeTotal")
    @Expose
    private Long DislikeTotal;

    /**
    * 点踩率
    */
    @SerializedName("DislikeRate")
    @Expose
    private Float DislikeRate;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 可评价消息数 
     * @return Total 可评价消息数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 可评价消息数
     * @param Total 可评价消息数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 评价数 
     * @return AppraisalTotal 评价数
     */
    public Long getAppraisalTotal() {
        return this.AppraisalTotal;
    }

    /**
     * Set 评价数
     * @param AppraisalTotal 评价数
     */
    public void setAppraisalTotal(Long AppraisalTotal) {
        this.AppraisalTotal = AppraisalTotal;
    }

    /**
     * Get 参评率 
     * @return ParticipationRate 参评率
     */
    public Float getParticipationRate() {
        return this.ParticipationRate;
    }

    /**
     * Set 参评率
     * @param ParticipationRate 参评率
     */
    public void setParticipationRate(Float ParticipationRate) {
        this.ParticipationRate = ParticipationRate;
    }

    /**
     * Get 点赞数 
     * @return LikeTotal 点赞数
     */
    public Long getLikeTotal() {
        return this.LikeTotal;
    }

    /**
     * Set 点赞数
     * @param LikeTotal 点赞数
     */
    public void setLikeTotal(Long LikeTotal) {
        this.LikeTotal = LikeTotal;
    }

    /**
     * Get 点赞率 
     * @return LikeRate 点赞率
     */
    public Float getLikeRate() {
        return this.LikeRate;
    }

    /**
     * Set 点赞率
     * @param LikeRate 点赞率
     */
    public void setLikeRate(Float LikeRate) {
        this.LikeRate = LikeRate;
    }

    /**
     * Get 点踩数 
     * @return DislikeTotal 点踩数
     */
    public Long getDislikeTotal() {
        return this.DislikeTotal;
    }

    /**
     * Set 点踩数
     * @param DislikeTotal 点踩数
     */
    public void setDislikeTotal(Long DislikeTotal) {
        this.DislikeTotal = DislikeTotal;
    }

    /**
     * Get 点踩率 
     * @return DislikeRate 点踩率
     */
    public Float getDislikeRate() {
        return this.DislikeRate;
    }

    /**
     * Set 点踩率
     * @param DislikeRate 点踩率
     */
    public void setDislikeRate(Float DislikeRate) {
        this.DislikeRate = DislikeRate;
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

    public GetLikeDataCountResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetLikeDataCountResponse(GetLikeDataCountResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.AppraisalTotal != null) {
            this.AppraisalTotal = new Long(source.AppraisalTotal);
        }
        if (source.ParticipationRate != null) {
            this.ParticipationRate = new Float(source.ParticipationRate);
        }
        if (source.LikeTotal != null) {
            this.LikeTotal = new Long(source.LikeTotal);
        }
        if (source.LikeRate != null) {
            this.LikeRate = new Float(source.LikeRate);
        }
        if (source.DislikeTotal != null) {
            this.DislikeTotal = new Long(source.DislikeTotal);
        }
        if (source.DislikeRate != null) {
            this.DislikeRate = new Float(source.DislikeRate);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "AppraisalTotal", this.AppraisalTotal);
        this.setParamSimple(map, prefix + "ParticipationRate", this.ParticipationRate);
        this.setParamSimple(map, prefix + "LikeTotal", this.LikeTotal);
        this.setParamSimple(map, prefix + "LikeRate", this.LikeRate);
        this.setParamSimple(map, prefix + "DislikeTotal", this.DislikeTotal);
        this.setParamSimple(map, prefix + "DislikeRate", this.DislikeRate);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

