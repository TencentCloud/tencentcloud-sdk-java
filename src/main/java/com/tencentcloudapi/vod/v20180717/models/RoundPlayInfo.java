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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RoundPlayInfo extends AbstractModel{

    /**
    * 轮播播单标识。
    */
    @SerializedName("RoundPlayId")
    @Expose
    private String RoundPlayId;

    /**
    * 启播时间，格式按照 ISO 8601标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#52)。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 轮播列表。
    */
    @SerializedName("RoundPlaylist")
    @Expose
    private RoundPlayListItemInfo [] RoundPlaylist;

    /**
    * 轮播播单名称，长度限制：64 个字符。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 轮播播单描述信息，长度限制：256 个字符。
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * 播放状态，可选值：
<li>Enabled：启动状态；</li>
<li>Disabled：停止状态。</li>
默认值：Enabled。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 播放模式，可选值：
<li>Loop：循环播放播单；</li>
<li>Linear：单次播放，播单播放完停止播放。</li>
默认值：Loop。
    */
    @SerializedName("PlayBackMode")
    @Expose
    private String PlayBackMode;

    /**
    * 轮播播放地址。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * Get 轮播播单标识。 
     * @return RoundPlayId 轮播播单标识。
     */
    public String getRoundPlayId() {
        return this.RoundPlayId;
    }

    /**
     * Set 轮播播单标识。
     * @param RoundPlayId 轮播播单标识。
     */
    public void setRoundPlayId(String RoundPlayId) {
        this.RoundPlayId = RoundPlayId;
    }

    /**
     * Get 启播时间，格式按照 ISO 8601标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#52)。 
     * @return StartTime 启播时间，格式按照 ISO 8601标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#52)。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 启播时间，格式按照 ISO 8601标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#52)。
     * @param StartTime 启播时间，格式按照 ISO 8601标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#52)。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 轮播列表。 
     * @return RoundPlaylist 轮播列表。
     */
    public RoundPlayListItemInfo [] getRoundPlaylist() {
        return this.RoundPlaylist;
    }

    /**
     * Set 轮播列表。
     * @param RoundPlaylist 轮播列表。
     */
    public void setRoundPlaylist(RoundPlayListItemInfo [] RoundPlaylist) {
        this.RoundPlaylist = RoundPlaylist;
    }

    /**
     * Get 轮播播单名称，长度限制：64 个字符。 
     * @return Name 轮播播单名称，长度限制：64 个字符。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 轮播播单名称，长度限制：64 个字符。
     * @param Name 轮播播单名称，长度限制：64 个字符。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 轮播播单描述信息，长度限制：256 个字符。 
     * @return Desc 轮播播单描述信息，长度限制：256 个字符。
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set 轮播播单描述信息，长度限制：256 个字符。
     * @param Desc 轮播播单描述信息，长度限制：256 个字符。
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get 播放状态，可选值：
<li>Enabled：启动状态；</li>
<li>Disabled：停止状态。</li>
默认值：Enabled。 
     * @return Status 播放状态，可选值：
<li>Enabled：启动状态；</li>
<li>Disabled：停止状态。</li>
默认值：Enabled。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 播放状态，可选值：
<li>Enabled：启动状态；</li>
<li>Disabled：停止状态。</li>
默认值：Enabled。
     * @param Status 播放状态，可选值：
<li>Enabled：启动状态；</li>
<li>Disabled：停止状态。</li>
默认值：Enabled。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 播放模式，可选值：
<li>Loop：循环播放播单；</li>
<li>Linear：单次播放，播单播放完停止播放。</li>
默认值：Loop。 
     * @return PlayBackMode 播放模式，可选值：
<li>Loop：循环播放播单；</li>
<li>Linear：单次播放，播单播放完停止播放。</li>
默认值：Loop。
     */
    public String getPlayBackMode() {
        return this.PlayBackMode;
    }

    /**
     * Set 播放模式，可选值：
<li>Loop：循环播放播单；</li>
<li>Linear：单次播放，播单播放完停止播放。</li>
默认值：Loop。
     * @param PlayBackMode 播放模式，可选值：
<li>Loop：循环播放播单；</li>
<li>Linear：单次播放，播单播放完停止播放。</li>
默认值：Loop。
     */
    public void setPlayBackMode(String PlayBackMode) {
        this.PlayBackMode = PlayBackMode;
    }

    /**
     * Get 轮播播放地址。 
     * @return Url 轮播播放地址。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 轮播播放地址。
     * @param Url 轮播播放地址。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    public RoundPlayInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RoundPlayInfo(RoundPlayInfo source) {
        if (source.RoundPlayId != null) {
            this.RoundPlayId = new String(source.RoundPlayId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.RoundPlaylist != null) {
            this.RoundPlaylist = new RoundPlayListItemInfo[source.RoundPlaylist.length];
            for (int i = 0; i < source.RoundPlaylist.length; i++) {
                this.RoundPlaylist[i] = new RoundPlayListItemInfo(source.RoundPlaylist[i]);
            }
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.PlayBackMode != null) {
            this.PlayBackMode = new String(source.PlayBackMode);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoundPlayId", this.RoundPlayId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamArrayObj(map, prefix + "RoundPlaylist.", this.RoundPlaylist);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "PlayBackMode", this.PlayBackMode);
        this.setParamSimple(map, prefix + "Url", this.Url);

    }
}

