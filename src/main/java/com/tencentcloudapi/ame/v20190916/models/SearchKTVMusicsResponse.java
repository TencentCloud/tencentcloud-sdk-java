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
package com.tencentcloudapi.ame.v20190916.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchKTVMusicsResponse extends AbstractModel{

    /**
    * 总记录数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * KTV 曲目列表
    */
    @SerializedName("KTVMusicInfoSet")
    @Expose
    private KTVMusicBaseInfo [] KTVMusicInfoSet;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 总记录数 
     * @return TotalCount 总记录数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总记录数
     * @param TotalCount 总记录数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get KTV 曲目列表 
     * @return KTVMusicInfoSet KTV 曲目列表
     */
    public KTVMusicBaseInfo [] getKTVMusicInfoSet() {
        return this.KTVMusicInfoSet;
    }

    /**
     * Set KTV 曲目列表
     * @param KTVMusicInfoSet KTV 曲目列表
     */
    public void setKTVMusicInfoSet(KTVMusicBaseInfo [] KTVMusicInfoSet) {
        this.KTVMusicInfoSet = KTVMusicInfoSet;
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

    public SearchKTVMusicsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchKTVMusicsResponse(SearchKTVMusicsResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.KTVMusicInfoSet != null) {
            this.KTVMusicInfoSet = new KTVMusicBaseInfo[source.KTVMusicInfoSet.length];
            for (int i = 0; i < source.KTVMusicInfoSet.length; i++) {
                this.KTVMusicInfoSet[i] = new KTVMusicBaseInfo(source.KTVMusicInfoSet[i]);
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "KTVMusicInfoSet.", this.KTVMusicInfoSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

