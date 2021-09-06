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

public class OfflineMusicDetail extends AbstractModel{

    /**
    * 歌曲Id
    */
    @SerializedName("ItemId")
    @Expose
    private String ItemId;

    /**
    * 歌曲名称
    */
    @SerializedName("MusicName")
    @Expose
    private String MusicName;

    /**
    * 不可用原因
    */
    @SerializedName("OffRemark")
    @Expose
    private String OffRemark;

    /**
    * 不可用时间
    */
    @SerializedName("OffTime")
    @Expose
    private String OffTime;

    /**
     * Get 歌曲Id 
     * @return ItemId 歌曲Id
     */
    public String getItemId() {
        return this.ItemId;
    }

    /**
     * Set 歌曲Id
     * @param ItemId 歌曲Id
     */
    public void setItemId(String ItemId) {
        this.ItemId = ItemId;
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
     * Get 不可用原因 
     * @return OffRemark 不可用原因
     */
    public String getOffRemark() {
        return this.OffRemark;
    }

    /**
     * Set 不可用原因
     * @param OffRemark 不可用原因
     */
    public void setOffRemark(String OffRemark) {
        this.OffRemark = OffRemark;
    }

    /**
     * Get 不可用时间 
     * @return OffTime 不可用时间
     */
    public String getOffTime() {
        return this.OffTime;
    }

    /**
     * Set 不可用时间
     * @param OffTime 不可用时间
     */
    public void setOffTime(String OffTime) {
        this.OffTime = OffTime;
    }

    public OfflineMusicDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OfflineMusicDetail(OfflineMusicDetail source) {
        if (source.ItemId != null) {
            this.ItemId = new String(source.ItemId);
        }
        if (source.MusicName != null) {
            this.MusicName = new String(source.MusicName);
        }
        if (source.OffRemark != null) {
            this.OffRemark = new String(source.OffRemark);
        }
        if (source.OffTime != null) {
            this.OffTime = new String(source.OffTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ItemId", this.ItemId);
        this.setParamSimple(map, prefix + "MusicName", this.MusicName);
        this.setParamSimple(map, prefix + "OffRemark", this.OffRemark);
        this.setParamSimple(map, prefix + "OffTime", this.OffTime);

    }
}

