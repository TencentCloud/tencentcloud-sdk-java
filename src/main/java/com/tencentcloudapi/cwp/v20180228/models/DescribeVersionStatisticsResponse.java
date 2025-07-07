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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVersionStatisticsResponse extends AbstractModel {

    /**
    * 基础版数量
    */
    @SerializedName("BasicVersionNum")
    @Expose
    private Long BasicVersionNum;

    /**
    * 专业版数量
    */
    @SerializedName("ProVersionNum")
    @Expose
    private Long ProVersionNum;

    /**
    * 旗舰版数量
    */
    @SerializedName("UltimateVersionNum")
    @Expose
    private Long UltimateVersionNum;

    /**
    * 轻量版数量
    */
    @SerializedName("GeneralVersionNum")
    @Expose
    private Long GeneralVersionNum;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 基础版数量 
     * @return BasicVersionNum 基础版数量
     */
    public Long getBasicVersionNum() {
        return this.BasicVersionNum;
    }

    /**
     * Set 基础版数量
     * @param BasicVersionNum 基础版数量
     */
    public void setBasicVersionNum(Long BasicVersionNum) {
        this.BasicVersionNum = BasicVersionNum;
    }

    /**
     * Get 专业版数量 
     * @return ProVersionNum 专业版数量
     */
    public Long getProVersionNum() {
        return this.ProVersionNum;
    }

    /**
     * Set 专业版数量
     * @param ProVersionNum 专业版数量
     */
    public void setProVersionNum(Long ProVersionNum) {
        this.ProVersionNum = ProVersionNum;
    }

    /**
     * Get 旗舰版数量 
     * @return UltimateVersionNum 旗舰版数量
     */
    public Long getUltimateVersionNum() {
        return this.UltimateVersionNum;
    }

    /**
     * Set 旗舰版数量
     * @param UltimateVersionNum 旗舰版数量
     */
    public void setUltimateVersionNum(Long UltimateVersionNum) {
        this.UltimateVersionNum = UltimateVersionNum;
    }

    /**
     * Get 轻量版数量 
     * @return GeneralVersionNum 轻量版数量
     */
    public Long getGeneralVersionNum() {
        return this.GeneralVersionNum;
    }

    /**
     * Set 轻量版数量
     * @param GeneralVersionNum 轻量版数量
     */
    public void setGeneralVersionNum(Long GeneralVersionNum) {
        this.GeneralVersionNum = GeneralVersionNum;
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

    public DescribeVersionStatisticsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVersionStatisticsResponse(DescribeVersionStatisticsResponse source) {
        if (source.BasicVersionNum != null) {
            this.BasicVersionNum = new Long(source.BasicVersionNum);
        }
        if (source.ProVersionNum != null) {
            this.ProVersionNum = new Long(source.ProVersionNum);
        }
        if (source.UltimateVersionNum != null) {
            this.UltimateVersionNum = new Long(source.UltimateVersionNum);
        }
        if (source.GeneralVersionNum != null) {
            this.GeneralVersionNum = new Long(source.GeneralVersionNum);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BasicVersionNum", this.BasicVersionNum);
        this.setParamSimple(map, prefix + "ProVersionNum", this.ProVersionNum);
        this.setParamSimple(map, prefix + "UltimateVersionNum", this.UltimateVersionNum);
        this.setParamSimple(map, prefix + "GeneralVersionNum", this.GeneralVersionNum);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

