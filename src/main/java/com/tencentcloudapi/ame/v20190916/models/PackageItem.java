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

public class PackageItem extends AbstractModel{

    /**
    * 订单id
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
    * 歌曲名
    */
    @SerializedName("TrackName")
    @Expose
    private String TrackName;

    /**
    * 歌曲ID
    */
    @SerializedName("ItemID")
    @Expose
    private String ItemID;

    /**
    * 专辑图片
    */
    @SerializedName("Img")
    @Expose
    private String Img;

    /**
    * 歌手名
    */
    @SerializedName("ArtistName")
    @Expose
    private String ArtistName;

    /**
    * 歌曲时长
    */
    @SerializedName("Duration")
    @Expose
    private String Duration;

    /**
    * 授权区域，global: 全球 CN: 中国
    */
    @SerializedName("AuthorizedArea")
    @Expose
    private String AuthorizedArea;

    /**
    * 标签数组
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
     * Get 订单id 
     * @return OrderId 订单id
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set 订单id
     * @param OrderId 订单id
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get 歌曲名 
     * @return TrackName 歌曲名
     */
    public String getTrackName() {
        return this.TrackName;
    }

    /**
     * Set 歌曲名
     * @param TrackName 歌曲名
     */
    public void setTrackName(String TrackName) {
        this.TrackName = TrackName;
    }

    /**
     * Get 歌曲ID 
     * @return ItemID 歌曲ID
     */
    public String getItemID() {
        return this.ItemID;
    }

    /**
     * Set 歌曲ID
     * @param ItemID 歌曲ID
     */
    public void setItemID(String ItemID) {
        this.ItemID = ItemID;
    }

    /**
     * Get 专辑图片 
     * @return Img 专辑图片
     */
    public String getImg() {
        return this.Img;
    }

    /**
     * Set 专辑图片
     * @param Img 专辑图片
     */
    public void setImg(String Img) {
        this.Img = Img;
    }

    /**
     * Get 歌手名 
     * @return ArtistName 歌手名
     */
    public String getArtistName() {
        return this.ArtistName;
    }

    /**
     * Set 歌手名
     * @param ArtistName 歌手名
     */
    public void setArtistName(String ArtistName) {
        this.ArtistName = ArtistName;
    }

    /**
     * Get 歌曲时长 
     * @return Duration 歌曲时长
     */
    public String getDuration() {
        return this.Duration;
    }

    /**
     * Set 歌曲时长
     * @param Duration 歌曲时长
     */
    public void setDuration(String Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 授权区域，global: 全球 CN: 中国 
     * @return AuthorizedArea 授权区域，global: 全球 CN: 中国
     */
    public String getAuthorizedArea() {
        return this.AuthorizedArea;
    }

    /**
     * Set 授权区域，global: 全球 CN: 中国
     * @param AuthorizedArea 授权区域，global: 全球 CN: 中国
     */
    public void setAuthorizedArea(String AuthorizedArea) {
        this.AuthorizedArea = AuthorizedArea;
    }

    /**
     * Get 标签数组 
     * @return Tags 标签数组
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签数组
     * @param Tags 标签数组
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    public PackageItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PackageItem(PackageItem source) {
        if (source.OrderId != null) {
            this.OrderId = new String(source.OrderId);
        }
        if (source.TrackName != null) {
            this.TrackName = new String(source.TrackName);
        }
        if (source.ItemID != null) {
            this.ItemID = new String(source.ItemID);
        }
        if (source.Img != null) {
            this.Img = new String(source.Img);
        }
        if (source.ArtistName != null) {
            this.ArtistName = new String(source.ArtistName);
        }
        if (source.Duration != null) {
            this.Duration = new String(source.Duration);
        }
        if (source.AuthorizedArea != null) {
            this.AuthorizedArea = new String(source.AuthorizedArea);
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);
        this.setParamSimple(map, prefix + "TrackName", this.TrackName);
        this.setParamSimple(map, prefix + "ItemID", this.ItemID);
        this.setParamSimple(map, prefix + "Img", this.Img);
        this.setParamSimple(map, prefix + "ArtistName", this.ArtistName);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "AuthorizedArea", this.AuthorizedArea);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);

    }
}

