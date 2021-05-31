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

public class DescribeKTVMusicDetailResponse extends AbstractModel{

    /**
    * 歌曲基础信息
    */
    @SerializedName("KTVMusicBaseInfo")
    @Expose
    private KTVMusicBaseInfo KTVMusicBaseInfo;

    /**
    * 播放凭证
    */
    @SerializedName("PlayToken")
    @Expose
    private String PlayToken;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 歌曲基础信息 
     * @return KTVMusicBaseInfo 歌曲基础信息
     */
    public KTVMusicBaseInfo getKTVMusicBaseInfo() {
        return this.KTVMusicBaseInfo;
    }

    /**
     * Set 歌曲基础信息
     * @param KTVMusicBaseInfo 歌曲基础信息
     */
    public void setKTVMusicBaseInfo(KTVMusicBaseInfo KTVMusicBaseInfo) {
        this.KTVMusicBaseInfo = KTVMusicBaseInfo;
    }

    /**
     * Get 播放凭证 
     * @return PlayToken 播放凭证
     */
    public String getPlayToken() {
        return this.PlayToken;
    }

    /**
     * Set 播放凭证
     * @param PlayToken 播放凭证
     */
    public void setPlayToken(String PlayToken) {
        this.PlayToken = PlayToken;
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

    public DescribeKTVMusicDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeKTVMusicDetailResponse(DescribeKTVMusicDetailResponse source) {
        if (source.KTVMusicBaseInfo != null) {
            this.KTVMusicBaseInfo = new KTVMusicBaseInfo(source.KTVMusicBaseInfo);
        }
        if (source.PlayToken != null) {
            this.PlayToken = new String(source.PlayToken);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "KTVMusicBaseInfo.", this.KTVMusicBaseInfo);
        this.setParamSimple(map, prefix + "PlayToken", this.PlayToken);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

