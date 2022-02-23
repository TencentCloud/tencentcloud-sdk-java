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

public class BatchDescribeKTVMusicDetailsResponse extends AbstractModel{

    /**
    * 歌曲详情列表信息
    */
    @SerializedName("KTVMusicDetailInfoSet")
    @Expose
    private KTVMusicDetailInfo [] KTVMusicDetailInfoSet;

    /**
    * 不存在的歌曲 ID 列表。
    */
    @SerializedName("NotExistMusicIdSet")
    @Expose
    private String [] NotExistMusicIdSet;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 歌曲详情列表信息 
     * @return KTVMusicDetailInfoSet 歌曲详情列表信息
     */
    public KTVMusicDetailInfo [] getKTVMusicDetailInfoSet() {
        return this.KTVMusicDetailInfoSet;
    }

    /**
     * Set 歌曲详情列表信息
     * @param KTVMusicDetailInfoSet 歌曲详情列表信息
     */
    public void setKTVMusicDetailInfoSet(KTVMusicDetailInfo [] KTVMusicDetailInfoSet) {
        this.KTVMusicDetailInfoSet = KTVMusicDetailInfoSet;
    }

    /**
     * Get 不存在的歌曲 ID 列表。 
     * @return NotExistMusicIdSet 不存在的歌曲 ID 列表。
     */
    public String [] getNotExistMusicIdSet() {
        return this.NotExistMusicIdSet;
    }

    /**
     * Set 不存在的歌曲 ID 列表。
     * @param NotExistMusicIdSet 不存在的歌曲 ID 列表。
     */
    public void setNotExistMusicIdSet(String [] NotExistMusicIdSet) {
        this.NotExistMusicIdSet = NotExistMusicIdSet;
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

    public BatchDescribeKTVMusicDetailsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchDescribeKTVMusicDetailsResponse(BatchDescribeKTVMusicDetailsResponse source) {
        if (source.KTVMusicDetailInfoSet != null) {
            this.KTVMusicDetailInfoSet = new KTVMusicDetailInfo[source.KTVMusicDetailInfoSet.length];
            for (int i = 0; i < source.KTVMusicDetailInfoSet.length; i++) {
                this.KTVMusicDetailInfoSet[i] = new KTVMusicDetailInfo(source.KTVMusicDetailInfoSet[i]);
            }
        }
        if (source.NotExistMusicIdSet != null) {
            this.NotExistMusicIdSet = new String[source.NotExistMusicIdSet.length];
            for (int i = 0; i < source.NotExistMusicIdSet.length; i++) {
                this.NotExistMusicIdSet[i] = new String(source.NotExistMusicIdSet[i]);
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
        this.setParamArrayObj(map, prefix + "KTVMusicDetailInfoSet.", this.KTVMusicDetailInfoSet);
        this.setParamArraySimple(map, prefix + "NotExistMusicIdSet.", this.NotExistMusicIdSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

