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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTelRecordAsrResponse extends AbstractModel {

    /**
    * 录音转文本信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AsrDataList")
    @Expose
    private AsrData [] AsrDataList;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 录音转文本信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AsrDataList 录音转文本信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AsrData [] getAsrDataList() {
        return this.AsrDataList;
    }

    /**
     * Set 录音转文本信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param AsrDataList 录音转文本信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAsrDataList(AsrData [] AsrDataList) {
        this.AsrDataList = AsrDataList;
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

    public DescribeTelRecordAsrResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTelRecordAsrResponse(DescribeTelRecordAsrResponse source) {
        if (source.AsrDataList != null) {
            this.AsrDataList = new AsrData[source.AsrDataList.length];
            for (int i = 0; i < source.AsrDataList.length; i++) {
                this.AsrDataList[i] = new AsrData(source.AsrDataList[i]);
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
        this.setParamArrayObj(map, prefix + "AsrDataList.", this.AsrDataList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

