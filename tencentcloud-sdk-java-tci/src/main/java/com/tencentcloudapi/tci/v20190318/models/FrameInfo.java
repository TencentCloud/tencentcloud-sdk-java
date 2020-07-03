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
package com.tencentcloudapi.tci.v20190318.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FrameInfo extends AbstractModel{

    /**
    * 相似度
    */
    @SerializedName("Similarity")
    @Expose
    private Float Similarity;

    /**
    * 截图的存储地址
    */
    @SerializedName("SnapshotUrl")
    @Expose
    private String SnapshotUrl;

    /**
    * 相对于视频起始时间的时间戳，单位秒
    */
    @SerializedName("Ts")
    @Expose
    private Long Ts;

    /**
     * Get 相似度 
     * @return Similarity 相似度
     */
    public Float getSimilarity() {
        return this.Similarity;
    }

    /**
     * Set 相似度
     * @param Similarity 相似度
     */
    public void setSimilarity(Float Similarity) {
        this.Similarity = Similarity;
    }

    /**
     * Get 截图的存储地址 
     * @return SnapshotUrl 截图的存储地址
     */
    public String getSnapshotUrl() {
        return this.SnapshotUrl;
    }

    /**
     * Set 截图的存储地址
     * @param SnapshotUrl 截图的存储地址
     */
    public void setSnapshotUrl(String SnapshotUrl) {
        this.SnapshotUrl = SnapshotUrl;
    }

    /**
     * Get 相对于视频起始时间的时间戳，单位秒 
     * @return Ts 相对于视频起始时间的时间戳，单位秒
     */
    public Long getTs() {
        return this.Ts;
    }

    /**
     * Set 相对于视频起始时间的时间戳，单位秒
     * @param Ts 相对于视频起始时间的时间戳，单位秒
     */
    public void setTs(Long Ts) {
        this.Ts = Ts;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Similarity", this.Similarity);
        this.setParamSimple(map, prefix + "SnapshotUrl", this.SnapshotUrl);
        this.setParamSimple(map, prefix + "Ts", this.Ts);

    }
}

