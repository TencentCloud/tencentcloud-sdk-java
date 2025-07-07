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

public class CreateRoundPlayRequest extends AbstractModel {

    /**
    * 启播时间，格式按照 ISO 8601标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#52)。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 轮播列表。
<li>数组长度限制：100。</li>
    */
    @SerializedName("RoundPlaylist")
    @Expose
    private RoundPlayListItemInfo [] RoundPlaylist;

    /**
    * <b>点播[应用](/document/product/266/14574) ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

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
    * 播放模式，可选值：
<li>Loop：循环播放播单；</li>
<li>Linear：单次播放，播单播放完停止播放。</li>
默认值：Loop。
    */
    @SerializedName("PlayBackMode")
    @Expose
    private String PlayBackMode;

    /**
    * 播单唯一标识 ID，长度限制为64个字符，只允许包含大小写英文字母（a-zA-Z）、数字（0-9）和连字符（-）。如果存在相同 RoundPlayId 的播单，返回 InvalidParameterValue.RoundPlayAlreadyExists 错误。默认取值为空，表示由系统分配。
    */
    @SerializedName("RoundPlayId")
    @Expose
    private String RoundPlayId;

    /**
    * 过期时间，格式按照 ISO 8601标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#52)。过期后的播单将停止播放，“9999-12-31T23:59:59+08:00”表示不过期。默认值：9999-12-31T23:59:59+08:00。
    */
    @SerializedName("ExpiredTime")
    @Expose
    private String ExpiredTime;

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
<li>数组长度限制：100。</li> 
     * @return RoundPlaylist 轮播列表。
<li>数组长度限制：100。</li>
     */
    public RoundPlayListItemInfo [] getRoundPlaylist() {
        return this.RoundPlaylist;
    }

    /**
     * Set 轮播列表。
<li>数组长度限制：100。</li>
     * @param RoundPlaylist 轮播列表。
<li>数组长度限制：100。</li>
     */
    public void setRoundPlaylist(RoundPlayListItemInfo [] RoundPlaylist) {
        this.RoundPlaylist = RoundPlaylist;
    }

    /**
     * Get <b>点播[应用](/document/product/266/14574) ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b> 
     * @return SubAppId <b>点播[应用](/document/product/266/14574) ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>点播[应用](/document/product/266/14574) ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b>
     * @param SubAppId <b>点播[应用](/document/product/266/14574) ID。从2023年12月25日起开通点播的客户，如访问点播应用中的资源（无论是默认应用还是新创建的应用），必须将该字段填写为应用 ID。</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
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
     * Get 播单唯一标识 ID，长度限制为64个字符，只允许包含大小写英文字母（a-zA-Z）、数字（0-9）和连字符（-）。如果存在相同 RoundPlayId 的播单，返回 InvalidParameterValue.RoundPlayAlreadyExists 错误。默认取值为空，表示由系统分配。 
     * @return RoundPlayId 播单唯一标识 ID，长度限制为64个字符，只允许包含大小写英文字母（a-zA-Z）、数字（0-9）和连字符（-）。如果存在相同 RoundPlayId 的播单，返回 InvalidParameterValue.RoundPlayAlreadyExists 错误。默认取值为空，表示由系统分配。
     */
    public String getRoundPlayId() {
        return this.RoundPlayId;
    }

    /**
     * Set 播单唯一标识 ID，长度限制为64个字符，只允许包含大小写英文字母（a-zA-Z）、数字（0-9）和连字符（-）。如果存在相同 RoundPlayId 的播单，返回 InvalidParameterValue.RoundPlayAlreadyExists 错误。默认取值为空，表示由系统分配。
     * @param RoundPlayId 播单唯一标识 ID，长度限制为64个字符，只允许包含大小写英文字母（a-zA-Z）、数字（0-9）和连字符（-）。如果存在相同 RoundPlayId 的播单，返回 InvalidParameterValue.RoundPlayAlreadyExists 错误。默认取值为空，表示由系统分配。
     */
    public void setRoundPlayId(String RoundPlayId) {
        this.RoundPlayId = RoundPlayId;
    }

    /**
     * Get 过期时间，格式按照 ISO 8601标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#52)。过期后的播单将停止播放，“9999-12-31T23:59:59+08:00”表示不过期。默认值：9999-12-31T23:59:59+08:00。 
     * @return ExpiredTime 过期时间，格式按照 ISO 8601标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#52)。过期后的播单将停止播放，“9999-12-31T23:59:59+08:00”表示不过期。默认值：9999-12-31T23:59:59+08:00。
     */
    public String getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set 过期时间，格式按照 ISO 8601标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#52)。过期后的播单将停止播放，“9999-12-31T23:59:59+08:00”表示不过期。默认值：9999-12-31T23:59:59+08:00。
     * @param ExpiredTime 过期时间，格式按照 ISO 8601标准表示，详见 [ISO 日期格式说明](https://cloud.tencent.com/document/product/266/11732#52)。过期后的播单将停止播放，“9999-12-31T23:59:59+08:00”表示不过期。默认值：9999-12-31T23:59:59+08:00。
     */
    public void setExpiredTime(String ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    public CreateRoundPlayRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRoundPlayRequest(CreateRoundPlayRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.RoundPlaylist != null) {
            this.RoundPlaylist = new RoundPlayListItemInfo[source.RoundPlaylist.length];
            for (int i = 0; i < source.RoundPlaylist.length; i++) {
                this.RoundPlaylist[i] = new RoundPlayListItemInfo(source.RoundPlaylist[i]);
            }
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.PlayBackMode != null) {
            this.PlayBackMode = new String(source.PlayBackMode);
        }
        if (source.RoundPlayId != null) {
            this.RoundPlayId = new String(source.RoundPlayId);
        }
        if (source.ExpiredTime != null) {
            this.ExpiredTime = new String(source.ExpiredTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamArrayObj(map, prefix + "RoundPlaylist.", this.RoundPlaylist);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "PlayBackMode", this.PlayBackMode);
        this.setParamSimple(map, prefix + "RoundPlayId", this.RoundPlayId);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);

    }
}

