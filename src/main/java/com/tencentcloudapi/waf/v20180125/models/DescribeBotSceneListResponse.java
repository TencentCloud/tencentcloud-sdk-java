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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBotSceneListResponse extends AbstractModel {

    /**
    * 符合筛选条件的场景数目
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 当TotalCount为0时，返回空
    */
    @SerializedName("BotSceneList")
    @Expose
    private BotSceneInfo [] BotSceneList;

    /**
    * true-简易模式
    */
    @SerializedName("SimpleFlag")
    @Expose
    private Boolean SimpleFlag;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 符合筛选条件的场景数目 
     * @return TotalCount 符合筛选条件的场景数目
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 符合筛选条件的场景数目
     * @param TotalCount 符合筛选条件的场景数目
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 当TotalCount为0时，返回空 
     * @return BotSceneList 当TotalCount为0时，返回空
     */
    public BotSceneInfo [] getBotSceneList() {
        return this.BotSceneList;
    }

    /**
     * Set 当TotalCount为0时，返回空
     * @param BotSceneList 当TotalCount为0时，返回空
     */
    public void setBotSceneList(BotSceneInfo [] BotSceneList) {
        this.BotSceneList = BotSceneList;
    }

    /**
     * Get true-简易模式 
     * @return SimpleFlag true-简易模式
     */
    public Boolean getSimpleFlag() {
        return this.SimpleFlag;
    }

    /**
     * Set true-简易模式
     * @param SimpleFlag true-简易模式
     */
    public void setSimpleFlag(Boolean SimpleFlag) {
        this.SimpleFlag = SimpleFlag;
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

    public DescribeBotSceneListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBotSceneListResponse(DescribeBotSceneListResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.BotSceneList != null) {
            this.BotSceneList = new BotSceneInfo[source.BotSceneList.length];
            for (int i = 0; i < source.BotSceneList.length; i++) {
                this.BotSceneList[i] = new BotSceneInfo(source.BotSceneList[i]);
            }
        }
        if (source.SimpleFlag != null) {
            this.SimpleFlag = new Boolean(source.SimpleFlag);
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
        this.setParamArrayObj(map, prefix + "BotSceneList.", this.BotSceneList);
        this.setParamSimple(map, prefix + "SimpleFlag", this.SimpleFlag);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

