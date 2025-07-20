/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HandleCurrentPlaylistRequest extends AbstractModel {

    /**
    * <b>点播[应用](/document/product/266/14574) ID。</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * 轮播播单唯一标识。
    */
    @SerializedName("RoundPlayId")
    @Expose
    private String RoundPlayId;

    /**
    * 操作类型，取值有：<li>Insert：向当前播放列表插入节目。插入的节目在后续轮播过程仍然有效。</li> <li>InsertTemporary：向当前播放列表临时插入节目。临时插入的节目只在本次轮播过程生效。</li><li>Delete：删除播放列表中的节目。不能删除正在播放的节目。</li>
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * 播单节目 ID。 <li>当 Operation 为 Insert 时，该字段必填，表示插入的节目列表位于该节目之后。</li> <li>当 Operation 为 InsertTemporary 时，该字段选填，不填时表示插入节目到最近的一个插入点上。当该字段填写时，如果同时填写 SegmentIndex，表示节目被插入到 ItemId 对应节目的第 SegmentIndex 分片后面，否则插入到该节目之后。</li> <li>当 Operation 为 Delete 时，该字段必填，表示删除该节目。不能删除正在播放的节目。</li>
    */
    @SerializedName("ItemId")
    @Expose
    private String ItemId;

    /**
    * M3U8 文件分片的索引号。M3U8 文件第一个分片的 SegmentIndex 为0。当 Operation 为 InsertTemporary 且 ItemId 有值时该参数有效。
    */
    @SerializedName("SegmentIndex")
    @Expose
    private Long SegmentIndex;

    /**
    * 节目列表。当 Operation 为 Insert、InsertTemporary、Delete 时必填，表示要操作的节目列表。列表长度最大为10。
    */
    @SerializedName("RoundPlaylist")
    @Expose
    private RoundPlayListItemInfo [] RoundPlaylist;

    /**
     * Get <b>点播[应用](/document/product/266/14574) ID。</b> 
     * @return SubAppId <b>点播[应用](/document/product/266/14574) ID。</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>点播[应用](/document/product/266/14574) ID。</b>
     * @param SubAppId <b>点播[应用](/document/product/266/14574) ID。</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get 轮播播单唯一标识。 
     * @return RoundPlayId 轮播播单唯一标识。
     */
    public String getRoundPlayId() {
        return this.RoundPlayId;
    }

    /**
     * Set 轮播播单唯一标识。
     * @param RoundPlayId 轮播播单唯一标识。
     */
    public void setRoundPlayId(String RoundPlayId) {
        this.RoundPlayId = RoundPlayId;
    }

    /**
     * Get 操作类型，取值有：<li>Insert：向当前播放列表插入节目。插入的节目在后续轮播过程仍然有效。</li> <li>InsertTemporary：向当前播放列表临时插入节目。临时插入的节目只在本次轮播过程生效。</li><li>Delete：删除播放列表中的节目。不能删除正在播放的节目。</li> 
     * @return Operation 操作类型，取值有：<li>Insert：向当前播放列表插入节目。插入的节目在后续轮播过程仍然有效。</li> <li>InsertTemporary：向当前播放列表临时插入节目。临时插入的节目只在本次轮播过程生效。</li><li>Delete：删除播放列表中的节目。不能删除正在播放的节目。</li>
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set 操作类型，取值有：<li>Insert：向当前播放列表插入节目。插入的节目在后续轮播过程仍然有效。</li> <li>InsertTemporary：向当前播放列表临时插入节目。临时插入的节目只在本次轮播过程生效。</li><li>Delete：删除播放列表中的节目。不能删除正在播放的节目。</li>
     * @param Operation 操作类型，取值有：<li>Insert：向当前播放列表插入节目。插入的节目在后续轮播过程仍然有效。</li> <li>InsertTemporary：向当前播放列表临时插入节目。临时插入的节目只在本次轮播过程生效。</li><li>Delete：删除播放列表中的节目。不能删除正在播放的节目。</li>
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get 播单节目 ID。 <li>当 Operation 为 Insert 时，该字段必填，表示插入的节目列表位于该节目之后。</li> <li>当 Operation 为 InsertTemporary 时，该字段选填，不填时表示插入节目到最近的一个插入点上。当该字段填写时，如果同时填写 SegmentIndex，表示节目被插入到 ItemId 对应节目的第 SegmentIndex 分片后面，否则插入到该节目之后。</li> <li>当 Operation 为 Delete 时，该字段必填，表示删除该节目。不能删除正在播放的节目。</li> 
     * @return ItemId 播单节目 ID。 <li>当 Operation 为 Insert 时，该字段必填，表示插入的节目列表位于该节目之后。</li> <li>当 Operation 为 InsertTemporary 时，该字段选填，不填时表示插入节目到最近的一个插入点上。当该字段填写时，如果同时填写 SegmentIndex，表示节目被插入到 ItemId 对应节目的第 SegmentIndex 分片后面，否则插入到该节目之后。</li> <li>当 Operation 为 Delete 时，该字段必填，表示删除该节目。不能删除正在播放的节目。</li>
     */
    public String getItemId() {
        return this.ItemId;
    }

    /**
     * Set 播单节目 ID。 <li>当 Operation 为 Insert 时，该字段必填，表示插入的节目列表位于该节目之后。</li> <li>当 Operation 为 InsertTemporary 时，该字段选填，不填时表示插入节目到最近的一个插入点上。当该字段填写时，如果同时填写 SegmentIndex，表示节目被插入到 ItemId 对应节目的第 SegmentIndex 分片后面，否则插入到该节目之后。</li> <li>当 Operation 为 Delete 时，该字段必填，表示删除该节目。不能删除正在播放的节目。</li>
     * @param ItemId 播单节目 ID。 <li>当 Operation 为 Insert 时，该字段必填，表示插入的节目列表位于该节目之后。</li> <li>当 Operation 为 InsertTemporary 时，该字段选填，不填时表示插入节目到最近的一个插入点上。当该字段填写时，如果同时填写 SegmentIndex，表示节目被插入到 ItemId 对应节目的第 SegmentIndex 分片后面，否则插入到该节目之后。</li> <li>当 Operation 为 Delete 时，该字段必填，表示删除该节目。不能删除正在播放的节目。</li>
     */
    public void setItemId(String ItemId) {
        this.ItemId = ItemId;
    }

    /**
     * Get M3U8 文件分片的索引号。M3U8 文件第一个分片的 SegmentIndex 为0。当 Operation 为 InsertTemporary 且 ItemId 有值时该参数有效。 
     * @return SegmentIndex M3U8 文件分片的索引号。M3U8 文件第一个分片的 SegmentIndex 为0。当 Operation 为 InsertTemporary 且 ItemId 有值时该参数有效。
     */
    public Long getSegmentIndex() {
        return this.SegmentIndex;
    }

    /**
     * Set M3U8 文件分片的索引号。M3U8 文件第一个分片的 SegmentIndex 为0。当 Operation 为 InsertTemporary 且 ItemId 有值时该参数有效。
     * @param SegmentIndex M3U8 文件分片的索引号。M3U8 文件第一个分片的 SegmentIndex 为0。当 Operation 为 InsertTemporary 且 ItemId 有值时该参数有效。
     */
    public void setSegmentIndex(Long SegmentIndex) {
        this.SegmentIndex = SegmentIndex;
    }

    /**
     * Get 节目列表。当 Operation 为 Insert、InsertTemporary、Delete 时必填，表示要操作的节目列表。列表长度最大为10。 
     * @return RoundPlaylist 节目列表。当 Operation 为 Insert、InsertTemporary、Delete 时必填，表示要操作的节目列表。列表长度最大为10。
     */
    public RoundPlayListItemInfo [] getRoundPlaylist() {
        return this.RoundPlaylist;
    }

    /**
     * Set 节目列表。当 Operation 为 Insert、InsertTemporary、Delete 时必填，表示要操作的节目列表。列表长度最大为10。
     * @param RoundPlaylist 节目列表。当 Operation 为 Insert、InsertTemporary、Delete 时必填，表示要操作的节目列表。列表长度最大为10。
     */
    public void setRoundPlaylist(RoundPlayListItemInfo [] RoundPlaylist) {
        this.RoundPlaylist = RoundPlaylist;
    }

    public HandleCurrentPlaylistRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HandleCurrentPlaylistRequest(HandleCurrentPlaylistRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.RoundPlayId != null) {
            this.RoundPlayId = new String(source.RoundPlayId);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
        if (source.ItemId != null) {
            this.ItemId = new String(source.ItemId);
        }
        if (source.SegmentIndex != null) {
            this.SegmentIndex = new Long(source.SegmentIndex);
        }
        if (source.RoundPlaylist != null) {
            this.RoundPlaylist = new RoundPlayListItemInfo[source.RoundPlaylist.length];
            for (int i = 0; i < source.RoundPlaylist.length; i++) {
                this.RoundPlaylist[i] = new RoundPlayListItemInfo(source.RoundPlaylist[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "RoundPlayId", this.RoundPlayId);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "ItemId", this.ItemId);
        this.setParamSimple(map, prefix + "SegmentIndex", this.SegmentIndex);
        this.setParamArrayObj(map, prefix + "RoundPlaylist.", this.RoundPlaylist);

    }
}

