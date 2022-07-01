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
package com.tencentcloudapi.yinsuda.v20220527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchKTVMusicsResponse extends AbstractModel{

    /**
    * 歌曲信息列表。
    */
    @SerializedName("KTVMusicInfoSet")
    @Expose
    private KTVMusicBaseInfo [] KTVMusicInfoSet;

    /**
    * 滚动标记，用于设置下次请求的 ScrollToken 参数。
    */
    @SerializedName("ScrollToken")
    @Expose
    private String ScrollToken;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 歌曲信息列表。 
     * @return KTVMusicInfoSet 歌曲信息列表。
     */
    public KTVMusicBaseInfo [] getKTVMusicInfoSet() {
        return this.KTVMusicInfoSet;
    }

    /**
     * Set 歌曲信息列表。
     * @param KTVMusicInfoSet 歌曲信息列表。
     */
    public void setKTVMusicInfoSet(KTVMusicBaseInfo [] KTVMusicInfoSet) {
        this.KTVMusicInfoSet = KTVMusicInfoSet;
    }

    /**
     * Get 滚动标记，用于设置下次请求的 ScrollToken 参数。 
     * @return ScrollToken 滚动标记，用于设置下次请求的 ScrollToken 参数。
     */
    public String getScrollToken() {
        return this.ScrollToken;
    }

    /**
     * Set 滚动标记，用于设置下次请求的 ScrollToken 参数。
     * @param ScrollToken 滚动标记，用于设置下次请求的 ScrollToken 参数。
     */
    public void setScrollToken(String ScrollToken) {
        this.ScrollToken = ScrollToken;
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
        if (source.KTVMusicInfoSet != null) {
            this.KTVMusicInfoSet = new KTVMusicBaseInfo[source.KTVMusicInfoSet.length];
            for (int i = 0; i < source.KTVMusicInfoSet.length; i++) {
                this.KTVMusicInfoSet[i] = new KTVMusicBaseInfo(source.KTVMusicInfoSet[i]);
            }
        }
        if (source.ScrollToken != null) {
            this.ScrollToken = new String(source.ScrollToken);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "KTVMusicInfoSet.", this.KTVMusicInfoSet);
        this.setParamSimple(map, prefix + "ScrollToken", this.ScrollToken);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

