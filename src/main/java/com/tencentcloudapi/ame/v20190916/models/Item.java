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

public class Item extends AbstractModel{

    /**
    * Song ID
    */
    @SerializedName("ItemID")
    @Expose
    private String ItemID;

    /**
    * Song info
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataInfo")
    @Expose
    private DataInfo DataInfo;

    /**
    * 专辑信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Album")
    @Expose
    private Album Album;

    /**
    * 多个歌手集合
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Artists")
    @Expose
    private Artist [] Artists;

    /**
    * 歌曲状态，1:添加进购物车；2:核销进曲库包
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get Song ID 
     * @return ItemID Song ID
     */
    public String getItemID() {
        return this.ItemID;
    }

    /**
     * Set Song ID
     * @param ItemID Song ID
     */
    public void setItemID(String ItemID) {
        this.ItemID = ItemID;
    }

    /**
     * Get Song info
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataInfo Song info
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DataInfo getDataInfo() {
        return this.DataInfo;
    }

    /**
     * Set Song info
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataInfo Song info
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataInfo(DataInfo DataInfo) {
        this.DataInfo = DataInfo;
    }

    /**
     * Get 专辑信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Album 专辑信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Album getAlbum() {
        return this.Album;
    }

    /**
     * Set 专辑信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Album 专辑信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlbum(Album Album) {
        this.Album = Album;
    }

    /**
     * Get 多个歌手集合
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Artists 多个歌手集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Artist [] getArtists() {
        return this.Artists;
    }

    /**
     * Set 多个歌手集合
注意：此字段可能返回 null，表示取不到有效值。
     * @param Artists 多个歌手集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setArtists(Artist [] Artists) {
        this.Artists = Artists;
    }

    /**
     * Get 歌曲状态，1:添加进购物车；2:核销进曲库包
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 歌曲状态，1:添加进购物车；2:核销进曲库包
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 歌曲状态，1:添加进购物车；2:核销进曲库包
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 歌曲状态，1:添加进购物车；2:核销进曲库包
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public Item() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Item(Item source) {
        if (source.ItemID != null) {
            this.ItemID = new String(source.ItemID);
        }
        if (source.DataInfo != null) {
            this.DataInfo = new DataInfo(source.DataInfo);
        }
        if (source.Album != null) {
            this.Album = new Album(source.Album);
        }
        if (source.Artists != null) {
            this.Artists = new Artist[source.Artists.length];
            for (int i = 0; i < source.Artists.length; i++) {
                this.Artists[i] = new Artist(source.Artists[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ItemID", this.ItemID);
        this.setParamObj(map, prefix + "DataInfo.", this.DataInfo);
        this.setParamObj(map, prefix + "Album.", this.Album);
        this.setParamArrayObj(map, prefix + "Artists.", this.Artists);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

