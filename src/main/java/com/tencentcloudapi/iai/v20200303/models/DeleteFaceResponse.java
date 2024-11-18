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
package com.tencentcloudapi.iai.v20200303.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteFaceResponse extends AbstractModel {

    /**
    * 删除成功的人脸数量.
    */
    @SerializedName("SucDeletedNum")
    @Expose
    private Long SucDeletedNum;

    /**
    * 删除成功的人脸ID列表。
    */
    @SerializedName("SucFaceIds")
    @Expose
    private String [] SucFaceIds;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 删除成功的人脸数量. 
     * @return SucDeletedNum 删除成功的人脸数量.
     */
    public Long getSucDeletedNum() {
        return this.SucDeletedNum;
    }

    /**
     * Set 删除成功的人脸数量.
     * @param SucDeletedNum 删除成功的人脸数量.
     */
    public void setSucDeletedNum(Long SucDeletedNum) {
        this.SucDeletedNum = SucDeletedNum;
    }

    /**
     * Get 删除成功的人脸ID列表。 
     * @return SucFaceIds 删除成功的人脸ID列表。
     */
    public String [] getSucFaceIds() {
        return this.SucFaceIds;
    }

    /**
     * Set 删除成功的人脸ID列表。
     * @param SucFaceIds 删除成功的人脸ID列表。
     */
    public void setSucFaceIds(String [] SucFaceIds) {
        this.SucFaceIds = SucFaceIds;
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

    public DeleteFaceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteFaceResponse(DeleteFaceResponse source) {
        if (source.SucDeletedNum != null) {
            this.SucDeletedNum = new Long(source.SucDeletedNum);
        }
        if (source.SucFaceIds != null) {
            this.SucFaceIds = new String[source.SucFaceIds.length];
            for (int i = 0; i < source.SucFaceIds.length; i++) {
                this.SucFaceIds[i] = new String(source.SucFaceIds[i]);
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
        this.setParamSimple(map, prefix + "SucDeletedNum", this.SucDeletedNum);
        this.setParamArraySimple(map, prefix + "SucFaceIds.", this.SucFaceIds);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

