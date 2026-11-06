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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTRTCVoicePrintResponse extends AbstractModel {

    /**
    * 当前 (AppId, SdkAppId) 下的声纹总数（仅计活跃状态）
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 声纹条目列表，元素为 TRTCVoicePrintItem 结构：{ VoicePrintId:string, SpeakerId:string, CreateTime:string(ISO8601), UpdateTime:string(ISO8601) }。
    */
    @SerializedName("VoicePrintList")
    @Expose
    private TRTCVoicePrintItem [] VoicePrintList;

    /**
    * 结果描述，成功时为 query voiceprint list successfully
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 当前 (AppId, SdkAppId) 下的声纹总数（仅计活跃状态） 
     * @return TotalCount 当前 (AppId, SdkAppId) 下的声纹总数（仅计活跃状态）
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 当前 (AppId, SdkAppId) 下的声纹总数（仅计活跃状态）
     * @param TotalCount 当前 (AppId, SdkAppId) 下的声纹总数（仅计活跃状态）
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 声纹条目列表，元素为 TRTCVoicePrintItem 结构：{ VoicePrintId:string, SpeakerId:string, CreateTime:string(ISO8601), UpdateTime:string(ISO8601) }。 
     * @return VoicePrintList 声纹条目列表，元素为 TRTCVoicePrintItem 结构：{ VoicePrintId:string, SpeakerId:string, CreateTime:string(ISO8601), UpdateTime:string(ISO8601) }。
     */
    public TRTCVoicePrintItem [] getVoicePrintList() {
        return this.VoicePrintList;
    }

    /**
     * Set 声纹条目列表，元素为 TRTCVoicePrintItem 结构：{ VoicePrintId:string, SpeakerId:string, CreateTime:string(ISO8601), UpdateTime:string(ISO8601) }。
     * @param VoicePrintList 声纹条目列表，元素为 TRTCVoicePrintItem 结构：{ VoicePrintId:string, SpeakerId:string, CreateTime:string(ISO8601), UpdateTime:string(ISO8601) }。
     */
    public void setVoicePrintList(TRTCVoicePrintItem [] VoicePrintList) {
        this.VoicePrintList = VoicePrintList;
    }

    /**
     * Get 结果描述，成功时为 query voiceprint list successfully 
     * @return Message 结果描述，成功时为 query voiceprint list successfully
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 结果描述，成功时为 query voiceprint list successfully
     * @param Message 结果描述，成功时为 query voiceprint list successfully
     */
    public void setMessage(String Message) {
        this.Message = Message;
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

    public DescribeTRTCVoicePrintResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTRTCVoicePrintResponse(DescribeTRTCVoicePrintResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.VoicePrintList != null) {
            this.VoicePrintList = new TRTCVoicePrintItem[source.VoicePrintList.length];
            for (int i = 0; i < source.VoicePrintList.length; i++) {
                this.VoicePrintList[i] = new TRTCVoicePrintItem(source.VoicePrintList[i]);
            }
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "VoicePrintList.", this.VoicePrintList);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

