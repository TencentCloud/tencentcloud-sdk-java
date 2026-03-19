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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLiveAvatarScriptsResponse extends AbstractModel {

    /**
    * 数字人直播间话术信息列表。
    */
    @SerializedName("InfoList")
    @Expose
    private AvatarScriptInfo [] InfoList;

    /**
    * 限制可创建的数字人直播间话术总条数。
    */
    @SerializedName("LimitCreateNum")
    @Expose
    private Long LimitCreateNum;

    /**
    * 当前数字人直播间话术总条数。
    */
    @SerializedName("TotalNum")
    @Expose
    private Long TotalNum;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 数字人直播间话术信息列表。 
     * @return InfoList 数字人直播间话术信息列表。
     */
    public AvatarScriptInfo [] getInfoList() {
        return this.InfoList;
    }

    /**
     * Set 数字人直播间话术信息列表。
     * @param InfoList 数字人直播间话术信息列表。
     */
    public void setInfoList(AvatarScriptInfo [] InfoList) {
        this.InfoList = InfoList;
    }

    /**
     * Get 限制可创建的数字人直播间话术总条数。 
     * @return LimitCreateNum 限制可创建的数字人直播间话术总条数。
     */
    public Long getLimitCreateNum() {
        return this.LimitCreateNum;
    }

    /**
     * Set 限制可创建的数字人直播间话术总条数。
     * @param LimitCreateNum 限制可创建的数字人直播间话术总条数。
     */
    public void setLimitCreateNum(Long LimitCreateNum) {
        this.LimitCreateNum = LimitCreateNum;
    }

    /**
     * Get 当前数字人直播间话术总条数。 
     * @return TotalNum 当前数字人直播间话术总条数。
     */
    public Long getTotalNum() {
        return this.TotalNum;
    }

    /**
     * Set 当前数字人直播间话术总条数。
     * @param TotalNum 当前数字人直播间话术总条数。
     */
    public void setTotalNum(Long TotalNum) {
        this.TotalNum = TotalNum;
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

    public DescribeLiveAvatarScriptsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLiveAvatarScriptsResponse(DescribeLiveAvatarScriptsResponse source) {
        if (source.InfoList != null) {
            this.InfoList = new AvatarScriptInfo[source.InfoList.length];
            for (int i = 0; i < source.InfoList.length; i++) {
                this.InfoList[i] = new AvatarScriptInfo(source.InfoList[i]);
            }
        }
        if (source.LimitCreateNum != null) {
            this.LimitCreateNum = new Long(source.LimitCreateNum);
        }
        if (source.TotalNum != null) {
            this.TotalNum = new Long(source.TotalNum);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "InfoList.", this.InfoList);
        this.setParamSimple(map, prefix + "LimitCreateNum", this.LimitCreateNum);
        this.setParamSimple(map, prefix + "TotalNum", this.TotalNum);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

