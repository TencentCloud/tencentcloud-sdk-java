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
package com.tencentcloudapi.irp.v20220324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DocBehavior extends AbstractModel{

    /**
    * 内容唯一ID，如 2824324234
    */
    @SerializedName("ItemId")
    @Expose
    private String ItemId;

    /**
    * 行为类型
    */
    @SerializedName("BehaviorType")
    @Expose
    private Long BehaviorType;

    /**
    * 行为值
    */
    @SerializedName("BehaviorValue")
    @Expose
    private String BehaviorValue;

    /**
    * 行为时间戳： 秒级时间戳（默认为当前时间）,不能延迟太久，尽量实时上报，否则会影响推荐结果的准确性。
    */
    @SerializedName("BehaviorTimestamp")
    @Expose
    private Long BehaviorTimestamp;

    /**
    * 场景id，在控制台创建场景后获取。
    */
    @SerializedName("SceneId")
    @Expose
    private String SceneId;

    /**
    * 用户id列表
    */
    @SerializedName("UserIdList")
    @Expose
    private UserIdInfo [] UserIdList;

    /**
    * 会话id，使用获取推荐结果中返回的RecTraceId填入。<br>注意：如果和在线推荐请求中的traceId不同，会影响行为特征归因，影响推荐算法效果
    */
    @SerializedName("RecTraceId")
    @Expose
    private String RecTraceId;

    /**
    * 算法来源：用来区分行为来源于哪个算法。值为**business，tencent，other** 三者之一<br>● business 表示业务自己的算法对照组<br>● tencent 为腾讯算法<br>● other 为其他算法
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 物料类型
    */
    @SerializedName("ItemType")
    @Expose
    private Long ItemType;

    /**
    * 微信开放平台上查看appId
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 回传video_over事件的时候，回传的用户播放视频的总时长（真正播放的，拖动不算，单位为秒）
    */
    @SerializedName("VideoPlayDuration")
    @Expose
    private Long VideoPlayDuration;

    /**
    * 来源物料内容：用来标识在指定内容页面产生的行为，如需要统计用户在A内容详情页里，对推荐内容B点击等行为，则ReferrerItemId代表内容A，ItemId代表内容B
    */
    @SerializedName("ReferrerItemId")
    @Expose
    private String ReferrerItemId;

    /**
    * 国家，统一用简写，比如中国则填写CN
    */
    @SerializedName("Country")
    @Expose
    private String Country;

    /**
    * 省
    */
    @SerializedName("Province")
    @Expose
    private String Province;

    /**
    * 城市
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * 区县
    */
    @SerializedName("District")
    @Expose
    private String District;

    /**
    * 客户端ip
    */
    @SerializedName("IP")
    @Expose
    private String IP;

    /**
    * 客户端网络类型
    */
    @SerializedName("Network")
    @Expose
    private String Network;

    /**
    * 客户端平台，ios/android/h5
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * 客户端app版本
    */
    @SerializedName("AppVersion")
    @Expose
    private String AppVersion;

    /**
    * 操作系统版本
    */
    @SerializedName("OsVersion")
    @Expose
    private String OsVersion;

    /**
    * 机型
    */
    @SerializedName("DeviceModel")
    @Expose
    private String DeviceModel;

    /**
    * json字符串，用于行为数据的扩展
    */
    @SerializedName("Extension")
    @Expose
    private String Extension;

    /**
     * Get 内容唯一ID，如 2824324234 
     * @return ItemId 内容唯一ID，如 2824324234
     */
    public String getItemId() {
        return this.ItemId;
    }

    /**
     * Set 内容唯一ID，如 2824324234
     * @param ItemId 内容唯一ID，如 2824324234
     */
    public void setItemId(String ItemId) {
        this.ItemId = ItemId;
    }

    /**
     * Get 行为类型 
     * @return BehaviorType 行为类型
     */
    public Long getBehaviorType() {
        return this.BehaviorType;
    }

    /**
     * Set 行为类型
     * @param BehaviorType 行为类型
     */
    public void setBehaviorType(Long BehaviorType) {
        this.BehaviorType = BehaviorType;
    }

    /**
     * Get 行为值 
     * @return BehaviorValue 行为值
     */
    public String getBehaviorValue() {
        return this.BehaviorValue;
    }

    /**
     * Set 行为值
     * @param BehaviorValue 行为值
     */
    public void setBehaviorValue(String BehaviorValue) {
        this.BehaviorValue = BehaviorValue;
    }

    /**
     * Get 行为时间戳： 秒级时间戳（默认为当前时间）,不能延迟太久，尽量实时上报，否则会影响推荐结果的准确性。 
     * @return BehaviorTimestamp 行为时间戳： 秒级时间戳（默认为当前时间）,不能延迟太久，尽量实时上报，否则会影响推荐结果的准确性。
     */
    public Long getBehaviorTimestamp() {
        return this.BehaviorTimestamp;
    }

    /**
     * Set 行为时间戳： 秒级时间戳（默认为当前时间）,不能延迟太久，尽量实时上报，否则会影响推荐结果的准确性。
     * @param BehaviorTimestamp 行为时间戳： 秒级时间戳（默认为当前时间）,不能延迟太久，尽量实时上报，否则会影响推荐结果的准确性。
     */
    public void setBehaviorTimestamp(Long BehaviorTimestamp) {
        this.BehaviorTimestamp = BehaviorTimestamp;
    }

    /**
     * Get 场景id，在控制台创建场景后获取。 
     * @return SceneId 场景id，在控制台创建场景后获取。
     */
    public String getSceneId() {
        return this.SceneId;
    }

    /**
     * Set 场景id，在控制台创建场景后获取。
     * @param SceneId 场景id，在控制台创建场景后获取。
     */
    public void setSceneId(String SceneId) {
        this.SceneId = SceneId;
    }

    /**
     * Get 用户id列表 
     * @return UserIdList 用户id列表
     */
    public UserIdInfo [] getUserIdList() {
        return this.UserIdList;
    }

    /**
     * Set 用户id列表
     * @param UserIdList 用户id列表
     */
    public void setUserIdList(UserIdInfo [] UserIdList) {
        this.UserIdList = UserIdList;
    }

    /**
     * Get 会话id，使用获取推荐结果中返回的RecTraceId填入。<br>注意：如果和在线推荐请求中的traceId不同，会影响行为特征归因，影响推荐算法效果 
     * @return RecTraceId 会话id，使用获取推荐结果中返回的RecTraceId填入。<br>注意：如果和在线推荐请求中的traceId不同，会影响行为特征归因，影响推荐算法效果
     */
    public String getRecTraceId() {
        return this.RecTraceId;
    }

    /**
     * Set 会话id，使用获取推荐结果中返回的RecTraceId填入。<br>注意：如果和在线推荐请求中的traceId不同，会影响行为特征归因，影响推荐算法效果
     * @param RecTraceId 会话id，使用获取推荐结果中返回的RecTraceId填入。<br>注意：如果和在线推荐请求中的traceId不同，会影响行为特征归因，影响推荐算法效果
     */
    public void setRecTraceId(String RecTraceId) {
        this.RecTraceId = RecTraceId;
    }

    /**
     * Get 算法来源：用来区分行为来源于哪个算法。值为**business，tencent，other** 三者之一<br>● business 表示业务自己的算法对照组<br>● tencent 为腾讯算法<br>● other 为其他算法 
     * @return Source 算法来源：用来区分行为来源于哪个算法。值为**business，tencent，other** 三者之一<br>● business 表示业务自己的算法对照组<br>● tencent 为腾讯算法<br>● other 为其他算法
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 算法来源：用来区分行为来源于哪个算法。值为**business，tencent，other** 三者之一<br>● business 表示业务自己的算法对照组<br>● tencent 为腾讯算法<br>● other 为其他算法
     * @param Source 算法来源：用来区分行为来源于哪个算法。值为**business，tencent，other** 三者之一<br>● business 表示业务自己的算法对照组<br>● tencent 为腾讯算法<br>● other 为其他算法
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 物料类型 
     * @return ItemType 物料类型
     */
    public Long getItemType() {
        return this.ItemType;
    }

    /**
     * Set 物料类型
     * @param ItemType 物料类型
     */
    public void setItemType(Long ItemType) {
        this.ItemType = ItemType;
    }

    /**
     * Get 微信开放平台上查看appId 
     * @return AppId 微信开放平台上查看appId
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set 微信开放平台上查看appId
     * @param AppId 微信开放平台上查看appId
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 回传video_over事件的时候，回传的用户播放视频的总时长（真正播放的，拖动不算，单位为秒） 
     * @return VideoPlayDuration 回传video_over事件的时候，回传的用户播放视频的总时长（真正播放的，拖动不算，单位为秒）
     */
    public Long getVideoPlayDuration() {
        return this.VideoPlayDuration;
    }

    /**
     * Set 回传video_over事件的时候，回传的用户播放视频的总时长（真正播放的，拖动不算，单位为秒）
     * @param VideoPlayDuration 回传video_over事件的时候，回传的用户播放视频的总时长（真正播放的，拖动不算，单位为秒）
     */
    public void setVideoPlayDuration(Long VideoPlayDuration) {
        this.VideoPlayDuration = VideoPlayDuration;
    }

    /**
     * Get 来源物料内容：用来标识在指定内容页面产生的行为，如需要统计用户在A内容详情页里，对推荐内容B点击等行为，则ReferrerItemId代表内容A，ItemId代表内容B 
     * @return ReferrerItemId 来源物料内容：用来标识在指定内容页面产生的行为，如需要统计用户在A内容详情页里，对推荐内容B点击等行为，则ReferrerItemId代表内容A，ItemId代表内容B
     */
    public String getReferrerItemId() {
        return this.ReferrerItemId;
    }

    /**
     * Set 来源物料内容：用来标识在指定内容页面产生的行为，如需要统计用户在A内容详情页里，对推荐内容B点击等行为，则ReferrerItemId代表内容A，ItemId代表内容B
     * @param ReferrerItemId 来源物料内容：用来标识在指定内容页面产生的行为，如需要统计用户在A内容详情页里，对推荐内容B点击等行为，则ReferrerItemId代表内容A，ItemId代表内容B
     */
    public void setReferrerItemId(String ReferrerItemId) {
        this.ReferrerItemId = ReferrerItemId;
    }

    /**
     * Get 国家，统一用简写，比如中国则填写CN 
     * @return Country 国家，统一用简写，比如中国则填写CN
     */
    public String getCountry() {
        return this.Country;
    }

    /**
     * Set 国家，统一用简写，比如中国则填写CN
     * @param Country 国家，统一用简写，比如中国则填写CN
     */
    public void setCountry(String Country) {
        this.Country = Country;
    }

    /**
     * Get 省 
     * @return Province 省
     */
    public String getProvince() {
        return this.Province;
    }

    /**
     * Set 省
     * @param Province 省
     */
    public void setProvince(String Province) {
        this.Province = Province;
    }

    /**
     * Get 城市 
     * @return City 城市
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set 城市
     * @param City 城市
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * Get 区县 
     * @return District 区县
     */
    public String getDistrict() {
        return this.District;
    }

    /**
     * Set 区县
     * @param District 区县
     */
    public void setDistrict(String District) {
        this.District = District;
    }

    /**
     * Get 客户端ip 
     * @return IP 客户端ip
     */
    public String getIP() {
        return this.IP;
    }

    /**
     * Set 客户端ip
     * @param IP 客户端ip
     */
    public void setIP(String IP) {
        this.IP = IP;
    }

    /**
     * Get 客户端网络类型 
     * @return Network 客户端网络类型
     */
    public String getNetwork() {
        return this.Network;
    }

    /**
     * Set 客户端网络类型
     * @param Network 客户端网络类型
     */
    public void setNetwork(String Network) {
        this.Network = Network;
    }

    /**
     * Get 客户端平台，ios/android/h5 
     * @return Platform 客户端平台，ios/android/h5
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set 客户端平台，ios/android/h5
     * @param Platform 客户端平台，ios/android/h5
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get 客户端app版本 
     * @return AppVersion 客户端app版本
     */
    public String getAppVersion() {
        return this.AppVersion;
    }

    /**
     * Set 客户端app版本
     * @param AppVersion 客户端app版本
     */
    public void setAppVersion(String AppVersion) {
        this.AppVersion = AppVersion;
    }

    /**
     * Get 操作系统版本 
     * @return OsVersion 操作系统版本
     */
    public String getOsVersion() {
        return this.OsVersion;
    }

    /**
     * Set 操作系统版本
     * @param OsVersion 操作系统版本
     */
    public void setOsVersion(String OsVersion) {
        this.OsVersion = OsVersion;
    }

    /**
     * Get 机型 
     * @return DeviceModel 机型
     */
    public String getDeviceModel() {
        return this.DeviceModel;
    }

    /**
     * Set 机型
     * @param DeviceModel 机型
     */
    public void setDeviceModel(String DeviceModel) {
        this.DeviceModel = DeviceModel;
    }

    /**
     * Get json字符串，用于行为数据的扩展 
     * @return Extension json字符串，用于行为数据的扩展
     */
    public String getExtension() {
        return this.Extension;
    }

    /**
     * Set json字符串，用于行为数据的扩展
     * @param Extension json字符串，用于行为数据的扩展
     */
    public void setExtension(String Extension) {
        this.Extension = Extension;
    }

    public DocBehavior() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DocBehavior(DocBehavior source) {
        if (source.ItemId != null) {
            this.ItemId = new String(source.ItemId);
        }
        if (source.BehaviorType != null) {
            this.BehaviorType = new Long(source.BehaviorType);
        }
        if (source.BehaviorValue != null) {
            this.BehaviorValue = new String(source.BehaviorValue);
        }
        if (source.BehaviorTimestamp != null) {
            this.BehaviorTimestamp = new Long(source.BehaviorTimestamp);
        }
        if (source.SceneId != null) {
            this.SceneId = new String(source.SceneId);
        }
        if (source.UserIdList != null) {
            this.UserIdList = new UserIdInfo[source.UserIdList.length];
            for (int i = 0; i < source.UserIdList.length; i++) {
                this.UserIdList[i] = new UserIdInfo(source.UserIdList[i]);
            }
        }
        if (source.RecTraceId != null) {
            this.RecTraceId = new String(source.RecTraceId);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.ItemType != null) {
            this.ItemType = new Long(source.ItemType);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.VideoPlayDuration != null) {
            this.VideoPlayDuration = new Long(source.VideoPlayDuration);
        }
        if (source.ReferrerItemId != null) {
            this.ReferrerItemId = new String(source.ReferrerItemId);
        }
        if (source.Country != null) {
            this.Country = new String(source.Country);
        }
        if (source.Province != null) {
            this.Province = new String(source.Province);
        }
        if (source.City != null) {
            this.City = new String(source.City);
        }
        if (source.District != null) {
            this.District = new String(source.District);
        }
        if (source.IP != null) {
            this.IP = new String(source.IP);
        }
        if (source.Network != null) {
            this.Network = new String(source.Network);
        }
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
        if (source.AppVersion != null) {
            this.AppVersion = new String(source.AppVersion);
        }
        if (source.OsVersion != null) {
            this.OsVersion = new String(source.OsVersion);
        }
        if (source.DeviceModel != null) {
            this.DeviceModel = new String(source.DeviceModel);
        }
        if (source.Extension != null) {
            this.Extension = new String(source.Extension);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ItemId", this.ItemId);
        this.setParamSimple(map, prefix + "BehaviorType", this.BehaviorType);
        this.setParamSimple(map, prefix + "BehaviorValue", this.BehaviorValue);
        this.setParamSimple(map, prefix + "BehaviorTimestamp", this.BehaviorTimestamp);
        this.setParamSimple(map, prefix + "SceneId", this.SceneId);
        this.setParamArrayObj(map, prefix + "UserIdList.", this.UserIdList);
        this.setParamSimple(map, prefix + "RecTraceId", this.RecTraceId);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "ItemType", this.ItemType);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "VideoPlayDuration", this.VideoPlayDuration);
        this.setParamSimple(map, prefix + "ReferrerItemId", this.ReferrerItemId);
        this.setParamSimple(map, prefix + "Country", this.Country);
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "District", this.District);
        this.setParamSimple(map, prefix + "IP", this.IP);
        this.setParamSimple(map, prefix + "Network", this.Network);
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "AppVersion", this.AppVersion);
        this.setParamSimple(map, prefix + "OsVersion", this.OsVersion);
        this.setParamSimple(map, prefix + "DeviceModel", this.DeviceModel);
        this.setParamSimple(map, prefix + "Extension", this.Extension);

    }
}

