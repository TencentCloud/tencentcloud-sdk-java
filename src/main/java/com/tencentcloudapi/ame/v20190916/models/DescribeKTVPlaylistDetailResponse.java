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

public class DescribeKTVPlaylistDetailResponse extends AbstractModel{

    /**
    * 歌曲基础信息列表
    */
    @SerializedName("KTVMusicInfoSet")
    @Expose
    private KTVMusicBaseInfo [] KTVMusicInfoSet;

    /**
    * 歌单基础信息
    */
    @SerializedName("PlaylistBaseInfo")
    @Expose
    private KTVPlaylistBaseInfo PlaylistBaseInfo;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 歌曲基础信息列表 
     * @return KTVMusicInfoSet 歌曲基础信息列表
     */
    public KTVMusicBaseInfo [] getKTVMusicInfoSet() {
        return this.KTVMusicInfoSet;
    }

    /**
     * Set 歌曲基础信息列表
     * @param KTVMusicInfoSet 歌曲基础信息列表
     */
    public void setKTVMusicInfoSet(KTVMusicBaseInfo [] KTVMusicInfoSet) {
        this.KTVMusicInfoSet = KTVMusicInfoSet;
    }

    /**
     * Get 歌单基础信息 
     * @return PlaylistBaseInfo 歌单基础信息
     */
    public KTVPlaylistBaseInfo getPlaylistBaseInfo() {
        return this.PlaylistBaseInfo;
    }

    /**
     * Set 歌单基础信息
     * @param PlaylistBaseInfo 歌单基础信息
     */
    public void setPlaylistBaseInfo(KTVPlaylistBaseInfo PlaylistBaseInfo) {
        this.PlaylistBaseInfo = PlaylistBaseInfo;
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

    public DescribeKTVPlaylistDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeKTVPlaylistDetailResponse(DescribeKTVPlaylistDetailResponse source) {
        if (source.KTVMusicInfoSet != null) {
            this.KTVMusicInfoSet = new KTVMusicBaseInfo[source.KTVMusicInfoSet.length];
            for (int i = 0; i < source.KTVMusicInfoSet.length; i++) {
                this.KTVMusicInfoSet[i] = new KTVMusicBaseInfo(source.KTVMusicInfoSet[i]);
            }
        }
        if (source.PlaylistBaseInfo != null) {
            this.PlaylistBaseInfo = new KTVPlaylistBaseInfo(source.PlaylistBaseInfo);
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
        this.setParamObj(map, prefix + "PlaylistBaseInfo.", this.PlaylistBaseInfo);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

