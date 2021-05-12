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

public class DescribeCloudMusicResponse extends AbstractModel{

    /**
    * 歌曲Id
    */
    @SerializedName("MusicId")
    @Expose
    private String MusicId;

    /**
    * 歌曲名称
    */
    @SerializedName("MusicName")
    @Expose
    private String MusicName;

    /**
    * 歌曲时长
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * 歌曲链接
    */
    @SerializedName("MusicUrl")
    @Expose
    private String MusicUrl;

    /**
    * 歌曲图片
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MusicImageUrl")
    @Expose
    private String MusicImageUrl;

    /**
    * 歌手列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Singers")
    @Expose
    private String [] Singers;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 歌曲Id 
     * @return MusicId 歌曲Id
     */
    public String getMusicId() {
        return this.MusicId;
    }

    /**
     * Set 歌曲Id
     * @param MusicId 歌曲Id
     */
    public void setMusicId(String MusicId) {
        this.MusicId = MusicId;
    }

    /**
     * Get 歌曲名称 
     * @return MusicName 歌曲名称
     */
    public String getMusicName() {
        return this.MusicName;
    }

    /**
     * Set 歌曲名称
     * @param MusicName 歌曲名称
     */
    public void setMusicName(String MusicName) {
        this.MusicName = MusicName;
    }

    /**
     * Get 歌曲时长
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Duration 歌曲时长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set 歌曲时长
注意：此字段可能返回 null，表示取不到有效值。
     * @param Duration 歌曲时长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 歌曲链接 
     * @return MusicUrl 歌曲链接
     */
    public String getMusicUrl() {
        return this.MusicUrl;
    }

    /**
     * Set 歌曲链接
     * @param MusicUrl 歌曲链接
     */
    public void setMusicUrl(String MusicUrl) {
        this.MusicUrl = MusicUrl;
    }

    /**
     * Get 歌曲图片
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MusicImageUrl 歌曲图片
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMusicImageUrl() {
        return this.MusicImageUrl;
    }

    /**
     * Set 歌曲图片
注意：此字段可能返回 null，表示取不到有效值。
     * @param MusicImageUrl 歌曲图片
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMusicImageUrl(String MusicImageUrl) {
        this.MusicImageUrl = MusicImageUrl;
    }

    /**
     * Get 歌手列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Singers 歌手列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSingers() {
        return this.Singers;
    }

    /**
     * Set 歌手列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Singers 歌手列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSingers(String [] Singers) {
        this.Singers = Singers;
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

    public DescribeCloudMusicResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCloudMusicResponse(DescribeCloudMusicResponse source) {
        if (source.MusicId != null) {
            this.MusicId = new String(source.MusicId);
        }
        if (source.MusicName != null) {
            this.MusicName = new String(source.MusicName);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.MusicUrl != null) {
            this.MusicUrl = new String(source.MusicUrl);
        }
        if (source.MusicImageUrl != null) {
            this.MusicImageUrl = new String(source.MusicImageUrl);
        }
        if (source.Singers != null) {
            this.Singers = new String[source.Singers.length];
            for (int i = 0; i < source.Singers.length; i++) {
                this.Singers[i] = new String(source.Singers[i]);
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
        this.setParamSimple(map, prefix + "MusicId", this.MusicId);
        this.setParamSimple(map, prefix + "MusicName", this.MusicName);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "MusicUrl", this.MusicUrl);
        this.setParamSimple(map, prefix + "MusicImageUrl", this.MusicImageUrl);
        this.setParamArraySimple(map, prefix + "Singers.", this.Singers);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

