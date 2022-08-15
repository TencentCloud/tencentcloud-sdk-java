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
package com.tencentcloudapi.irp.v20220805.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FeedBehaviorInfo extends AbstractModel{

    /**
    * 用户唯一ID，客户自定义用户ID，作为一个用户的唯一标识
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 内容唯一id
    */
    @SerializedName("ItemId")
    @Expose
    private String ItemId;

    /**
    * 行为类型：<br> ● expose - 曝光，<b>必须</b><br> ● click - 点击，<b>必须</b><br/>  ● stay - 详情页停留时长，<b>强烈建议</b><br/>  ● videoover - 视频播放时长，<b>强烈建议</b><br/> ●  like - 点赞&喜欢，<b>正效果</b><br/> ● collect - 收藏，<b>正效果</b><br/> ●  share - 转发&分享，<b>正效果</b><br/> ● reward - 打赏，<b>正效果</b><br/> ● unlike - 踩&不喜欢，<b>负效果</b><br/> ●  comment - 评论<br/> 不支持的行为类型，可以映射到未被使用的其他行为类型。如实际业务数据中有私信行为，没有收藏行为，可以将私信行为映射到收藏行为
    */
    @SerializedName("BehaviorType")
    @Expose
    private String BehaviorType;

    /**
    * 行为类型对应的行为值：<br/> ● expose - 曝光，固定填1<br/> ● click - 点击，固定填1<br/>  ● stay - 详情页停留时长，填停留秒数，取值[1-86400]<br/>  ● videoover - 视频播放时长，填播放结束的秒数，取值[1-86400]<br/> ●  like - 点赞&喜欢，固定填1<br/> ● collect - 收藏，固定填1<br/> ●  share - 转发&分享，固定填1<br/> ● reward - 打赏，填打赏金额，没有则填1<br/> ● unlike - 踩&不喜欢，填不喜欢的原因，没有则填1<br/> ●  comment - 评论，填评论内容，如“上海加油”
    */
    @SerializedName("BehaviorValue")
    @Expose
    private String BehaviorValue;

    /**
    * 行为发生的时间戳： 秒级时间戳，尽量实时上报，最长不超过半小时否则会影响推荐结果的准确性
    */
    @SerializedName("BehaviorTimestamp")
    @Expose
    private Long BehaviorTimestamp;

    /**
    * 行为发生的场景ID，在控制台创建场景后获取
    */
    @SerializedName("SceneId")
    @Expose
    private String SceneId;

    /**
    * 推荐追踪ID，使用推荐结果中返回的ItemTraceId填入。 
注意：如果和推荐结果中的ItemTraceId不同，会影响行为特征归因，影响推荐算法效果
    */
    @SerializedName("ItemTraceId")
    @Expose
    private String ItemTraceId;

    /**
    * 内容类型，跟内容上报类型一致，用于效果分析，不做内容校验，<b>强烈建议</b>
    */
    @SerializedName("ItemType")
    @Expose
    private String ItemType;

    /**
    * 相关推荐场景点击进入详情页的内容id，该字段用来注明行为发生于哪个内容的详情页推荐中，<b>相关推荐场景强烈建议</b>
    */
    @SerializedName("ReferrerItemId")
    @Expose
    private String ReferrerItemId;

    /**
    * 用户设备ID数组，可传入用户的多个类型ID，详见UserIdInfo结构体，建议补齐，<b>用于构建用户画像信息</b>
    */
    @SerializedName("UserIdList")
    @Expose
    private UserIdInfo [] UserIdList;

    /**
    * 算法来源： <br>● business 业务自己的算法对照组<br/> ● tencent 腾讯算法<br/> ● other 其他算法<br/>默认为tencent，区分行为来源于哪个算法，<b>用于Poc阶段的效果对比验证</b>
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 行为发生时的国家，ISO 3166-1 alpha-2编码，参考<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2" target="_blank">ISO 3166-1 alpha-2</a>，中国：“CN”，<b>用作特征</b>
    */
    @SerializedName("Country")
    @Expose
    private String Country;

    /**
    * 行为发生时的省份，ISO 3166-2行政区编码，如中国参考<a href="https://zh.wikipedia.org/wiki/ISO_3166-2:CN" target="_blank">ISO_3166-2:CN</a>，广东省：“CN-GD”，<b>用作特征</b>
    */
    @SerializedName("Province")
    @Expose
    private String Province;

    /**
    * 行为发生时的城市地区，统一用国家最新标准地区行政编码，如：<a href="https://www.mca.gov.cn/article/sj/xzqh/2020/" target="_blank">2020年行政区编码</a>，其他国家统一用国际公认城市简称或者城市编码，<b>用作特征</b>
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * 行为发生时的客户端ip，<b>用作特征</b>
    */
    @SerializedName("IP")
    @Expose
    private String IP;

    /**
    * 行为发生时的客户端网络类型，<b>用作特征</b>
    */
    @SerializedName("Network")
    @Expose
    private String Network;

    /**
    * 行为发生时的客户端平台，ios/android/h5，<b>用作特征</b>
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * 行为发生时的客户端app版本，<b>用作特征</b>
    */
    @SerializedName("AppVersion")
    @Expose
    private String AppVersion;

    /**
    * 行为发生时的操作系统版本，<b>用作特征</b>
    */
    @SerializedName("OsVersion")
    @Expose
    private String OsVersion;

    /**
    * 行为发生时的机型，<b>用作特征</b>
    */
    @SerializedName("DeviceModel")
    @Expose
    private String DeviceModel;

    /**
    * json字符串，<b>用于行为数据的扩展</b>
    */
    @SerializedName("Extension")
    @Expose
    private String Extension;

    /**
     * Get 用户唯一ID，客户自定义用户ID，作为一个用户的唯一标识 
     * @return UserId 用户唯一ID，客户自定义用户ID，作为一个用户的唯一标识
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户唯一ID，客户自定义用户ID，作为一个用户的唯一标识
     * @param UserId 用户唯一ID，客户自定义用户ID，作为一个用户的唯一标识
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 内容唯一id 
     * @return ItemId 内容唯一id
     */
    public String getItemId() {
        return this.ItemId;
    }

    /**
     * Set 内容唯一id
     * @param ItemId 内容唯一id
     */
    public void setItemId(String ItemId) {
        this.ItemId = ItemId;
    }

    /**
     * Get 行为类型：<br> ● expose - 曝光，<b>必须</b><br> ● click - 点击，<b>必须</b><br/>  ● stay - 详情页停留时长，<b>强烈建议</b><br/>  ● videoover - 视频播放时长，<b>强烈建议</b><br/> ●  like - 点赞&喜欢，<b>正效果</b><br/> ● collect - 收藏，<b>正效果</b><br/> ●  share - 转发&分享，<b>正效果</b><br/> ● reward - 打赏，<b>正效果</b><br/> ● unlike - 踩&不喜欢，<b>负效果</b><br/> ●  comment - 评论<br/> 不支持的行为类型，可以映射到未被使用的其他行为类型。如实际业务数据中有私信行为，没有收藏行为，可以将私信行为映射到收藏行为 
     * @return BehaviorType 行为类型：<br> ● expose - 曝光，<b>必须</b><br> ● click - 点击，<b>必须</b><br/>  ● stay - 详情页停留时长，<b>强烈建议</b><br/>  ● videoover - 视频播放时长，<b>强烈建议</b><br/> ●  like - 点赞&喜欢，<b>正效果</b><br/> ● collect - 收藏，<b>正效果</b><br/> ●  share - 转发&分享，<b>正效果</b><br/> ● reward - 打赏，<b>正效果</b><br/> ● unlike - 踩&不喜欢，<b>负效果</b><br/> ●  comment - 评论<br/> 不支持的行为类型，可以映射到未被使用的其他行为类型。如实际业务数据中有私信行为，没有收藏行为，可以将私信行为映射到收藏行为
     */
    public String getBehaviorType() {
        return this.BehaviorType;
    }

    /**
     * Set 行为类型：<br> ● expose - 曝光，<b>必须</b><br> ● click - 点击，<b>必须</b><br/>  ● stay - 详情页停留时长，<b>强烈建议</b><br/>  ● videoover - 视频播放时长，<b>强烈建议</b><br/> ●  like - 点赞&喜欢，<b>正效果</b><br/> ● collect - 收藏，<b>正效果</b><br/> ●  share - 转发&分享，<b>正效果</b><br/> ● reward - 打赏，<b>正效果</b><br/> ● unlike - 踩&不喜欢，<b>负效果</b><br/> ●  comment - 评论<br/> 不支持的行为类型，可以映射到未被使用的其他行为类型。如实际业务数据中有私信行为，没有收藏行为，可以将私信行为映射到收藏行为
     * @param BehaviorType 行为类型：<br> ● expose - 曝光，<b>必须</b><br> ● click - 点击，<b>必须</b><br/>  ● stay - 详情页停留时长，<b>强烈建议</b><br/>  ● videoover - 视频播放时长，<b>强烈建议</b><br/> ●  like - 点赞&喜欢，<b>正效果</b><br/> ● collect - 收藏，<b>正效果</b><br/> ●  share - 转发&分享，<b>正效果</b><br/> ● reward - 打赏，<b>正效果</b><br/> ● unlike - 踩&不喜欢，<b>负效果</b><br/> ●  comment - 评论<br/> 不支持的行为类型，可以映射到未被使用的其他行为类型。如实际业务数据中有私信行为，没有收藏行为，可以将私信行为映射到收藏行为
     */
    public void setBehaviorType(String BehaviorType) {
        this.BehaviorType = BehaviorType;
    }

    /**
     * Get 行为类型对应的行为值：<br/> ● expose - 曝光，固定填1<br/> ● click - 点击，固定填1<br/>  ● stay - 详情页停留时长，填停留秒数，取值[1-86400]<br/>  ● videoover - 视频播放时长，填播放结束的秒数，取值[1-86400]<br/> ●  like - 点赞&喜欢，固定填1<br/> ● collect - 收藏，固定填1<br/> ●  share - 转发&分享，固定填1<br/> ● reward - 打赏，填打赏金额，没有则填1<br/> ● unlike - 踩&不喜欢，填不喜欢的原因，没有则填1<br/> ●  comment - 评论，填评论内容，如“上海加油” 
     * @return BehaviorValue 行为类型对应的行为值：<br/> ● expose - 曝光，固定填1<br/> ● click - 点击，固定填1<br/>  ● stay - 详情页停留时长，填停留秒数，取值[1-86400]<br/>  ● videoover - 视频播放时长，填播放结束的秒数，取值[1-86400]<br/> ●  like - 点赞&喜欢，固定填1<br/> ● collect - 收藏，固定填1<br/> ●  share - 转发&分享，固定填1<br/> ● reward - 打赏，填打赏金额，没有则填1<br/> ● unlike - 踩&不喜欢，填不喜欢的原因，没有则填1<br/> ●  comment - 评论，填评论内容，如“上海加油”
     */
    public String getBehaviorValue() {
        return this.BehaviorValue;
    }

    /**
     * Set 行为类型对应的行为值：<br/> ● expose - 曝光，固定填1<br/> ● click - 点击，固定填1<br/>  ● stay - 详情页停留时长，填停留秒数，取值[1-86400]<br/>  ● videoover - 视频播放时长，填播放结束的秒数，取值[1-86400]<br/> ●  like - 点赞&喜欢，固定填1<br/> ● collect - 收藏，固定填1<br/> ●  share - 转发&分享，固定填1<br/> ● reward - 打赏，填打赏金额，没有则填1<br/> ● unlike - 踩&不喜欢，填不喜欢的原因，没有则填1<br/> ●  comment - 评论，填评论内容，如“上海加油”
     * @param BehaviorValue 行为类型对应的行为值：<br/> ● expose - 曝光，固定填1<br/> ● click - 点击，固定填1<br/>  ● stay - 详情页停留时长，填停留秒数，取值[1-86400]<br/>  ● videoover - 视频播放时长，填播放结束的秒数，取值[1-86400]<br/> ●  like - 点赞&喜欢，固定填1<br/> ● collect - 收藏，固定填1<br/> ●  share - 转发&分享，固定填1<br/> ● reward - 打赏，填打赏金额，没有则填1<br/> ● unlike - 踩&不喜欢，填不喜欢的原因，没有则填1<br/> ●  comment - 评论，填评论内容，如“上海加油”
     */
    public void setBehaviorValue(String BehaviorValue) {
        this.BehaviorValue = BehaviorValue;
    }

    /**
     * Get 行为发生的时间戳： 秒级时间戳，尽量实时上报，最长不超过半小时否则会影响推荐结果的准确性 
     * @return BehaviorTimestamp 行为发生的时间戳： 秒级时间戳，尽量实时上报，最长不超过半小时否则会影响推荐结果的准确性
     */
    public Long getBehaviorTimestamp() {
        return this.BehaviorTimestamp;
    }

    /**
     * Set 行为发生的时间戳： 秒级时间戳，尽量实时上报，最长不超过半小时否则会影响推荐结果的准确性
     * @param BehaviorTimestamp 行为发生的时间戳： 秒级时间戳，尽量实时上报，最长不超过半小时否则会影响推荐结果的准确性
     */
    public void setBehaviorTimestamp(Long BehaviorTimestamp) {
        this.BehaviorTimestamp = BehaviorTimestamp;
    }

    /**
     * Get 行为发生的场景ID，在控制台创建场景后获取 
     * @return SceneId 行为发生的场景ID，在控制台创建场景后获取
     */
    public String getSceneId() {
        return this.SceneId;
    }

    /**
     * Set 行为发生的场景ID，在控制台创建场景后获取
     * @param SceneId 行为发生的场景ID，在控制台创建场景后获取
     */
    public void setSceneId(String SceneId) {
        this.SceneId = SceneId;
    }

    /**
     * Get 推荐追踪ID，使用推荐结果中返回的ItemTraceId填入。 
注意：如果和推荐结果中的ItemTraceId不同，会影响行为特征归因，影响推荐算法效果 
     * @return ItemTraceId 推荐追踪ID，使用推荐结果中返回的ItemTraceId填入。 
注意：如果和推荐结果中的ItemTraceId不同，会影响行为特征归因，影响推荐算法效果
     */
    public String getItemTraceId() {
        return this.ItemTraceId;
    }

    /**
     * Set 推荐追踪ID，使用推荐结果中返回的ItemTraceId填入。 
注意：如果和推荐结果中的ItemTraceId不同，会影响行为特征归因，影响推荐算法效果
     * @param ItemTraceId 推荐追踪ID，使用推荐结果中返回的ItemTraceId填入。 
注意：如果和推荐结果中的ItemTraceId不同，会影响行为特征归因，影响推荐算法效果
     */
    public void setItemTraceId(String ItemTraceId) {
        this.ItemTraceId = ItemTraceId;
    }

    /**
     * Get 内容类型，跟内容上报类型一致，用于效果分析，不做内容校验，<b>强烈建议</b> 
     * @return ItemType 内容类型，跟内容上报类型一致，用于效果分析，不做内容校验，<b>强烈建议</b>
     */
    public String getItemType() {
        return this.ItemType;
    }

    /**
     * Set 内容类型，跟内容上报类型一致，用于效果分析，不做内容校验，<b>强烈建议</b>
     * @param ItemType 内容类型，跟内容上报类型一致，用于效果分析，不做内容校验，<b>强烈建议</b>
     */
    public void setItemType(String ItemType) {
        this.ItemType = ItemType;
    }

    /**
     * Get 相关推荐场景点击进入详情页的内容id，该字段用来注明行为发生于哪个内容的详情页推荐中，<b>相关推荐场景强烈建议</b> 
     * @return ReferrerItemId 相关推荐场景点击进入详情页的内容id，该字段用来注明行为发生于哪个内容的详情页推荐中，<b>相关推荐场景强烈建议</b>
     */
    public String getReferrerItemId() {
        return this.ReferrerItemId;
    }

    /**
     * Set 相关推荐场景点击进入详情页的内容id，该字段用来注明行为发生于哪个内容的详情页推荐中，<b>相关推荐场景强烈建议</b>
     * @param ReferrerItemId 相关推荐场景点击进入详情页的内容id，该字段用来注明行为发生于哪个内容的详情页推荐中，<b>相关推荐场景强烈建议</b>
     */
    public void setReferrerItemId(String ReferrerItemId) {
        this.ReferrerItemId = ReferrerItemId;
    }

    /**
     * Get 用户设备ID数组，可传入用户的多个类型ID，详见UserIdInfo结构体，建议补齐，<b>用于构建用户画像信息</b> 
     * @return UserIdList 用户设备ID数组，可传入用户的多个类型ID，详见UserIdInfo结构体，建议补齐，<b>用于构建用户画像信息</b>
     */
    public UserIdInfo [] getUserIdList() {
        return this.UserIdList;
    }

    /**
     * Set 用户设备ID数组，可传入用户的多个类型ID，详见UserIdInfo结构体，建议补齐，<b>用于构建用户画像信息</b>
     * @param UserIdList 用户设备ID数组，可传入用户的多个类型ID，详见UserIdInfo结构体，建议补齐，<b>用于构建用户画像信息</b>
     */
    public void setUserIdList(UserIdInfo [] UserIdList) {
        this.UserIdList = UserIdList;
    }

    /**
     * Get 算法来源： <br>● business 业务自己的算法对照组<br/> ● tencent 腾讯算法<br/> ● other 其他算法<br/>默认为tencent，区分行为来源于哪个算法，<b>用于Poc阶段的效果对比验证</b> 
     * @return Source 算法来源： <br>● business 业务自己的算法对照组<br/> ● tencent 腾讯算法<br/> ● other 其他算法<br/>默认为tencent，区分行为来源于哪个算法，<b>用于Poc阶段的效果对比验证</b>
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 算法来源： <br>● business 业务自己的算法对照组<br/> ● tencent 腾讯算法<br/> ● other 其他算法<br/>默认为tencent，区分行为来源于哪个算法，<b>用于Poc阶段的效果对比验证</b>
     * @param Source 算法来源： <br>● business 业务自己的算法对照组<br/> ● tencent 腾讯算法<br/> ● other 其他算法<br/>默认为tencent，区分行为来源于哪个算法，<b>用于Poc阶段的效果对比验证</b>
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 行为发生时的国家，ISO 3166-1 alpha-2编码，参考<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2" target="_blank">ISO 3166-1 alpha-2</a>，中国：“CN”，<b>用作特征</b> 
     * @return Country 行为发生时的国家，ISO 3166-1 alpha-2编码，参考<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2" target="_blank">ISO 3166-1 alpha-2</a>，中国：“CN”，<b>用作特征</b>
     */
    public String getCountry() {
        return this.Country;
    }

    /**
     * Set 行为发生时的国家，ISO 3166-1 alpha-2编码，参考<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2" target="_blank">ISO 3166-1 alpha-2</a>，中国：“CN”，<b>用作特征</b>
     * @param Country 行为发生时的国家，ISO 3166-1 alpha-2编码，参考<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2" target="_blank">ISO 3166-1 alpha-2</a>，中国：“CN”，<b>用作特征</b>
     */
    public void setCountry(String Country) {
        this.Country = Country;
    }

    /**
     * Get 行为发生时的省份，ISO 3166-2行政区编码，如中国参考<a href="https://zh.wikipedia.org/wiki/ISO_3166-2:CN" target="_blank">ISO_3166-2:CN</a>，广东省：“CN-GD”，<b>用作特征</b> 
     * @return Province 行为发生时的省份，ISO 3166-2行政区编码，如中国参考<a href="https://zh.wikipedia.org/wiki/ISO_3166-2:CN" target="_blank">ISO_3166-2:CN</a>，广东省：“CN-GD”，<b>用作特征</b>
     */
    public String getProvince() {
        return this.Province;
    }

    /**
     * Set 行为发生时的省份，ISO 3166-2行政区编码，如中国参考<a href="https://zh.wikipedia.org/wiki/ISO_3166-2:CN" target="_blank">ISO_3166-2:CN</a>，广东省：“CN-GD”，<b>用作特征</b>
     * @param Province 行为发生时的省份，ISO 3166-2行政区编码，如中国参考<a href="https://zh.wikipedia.org/wiki/ISO_3166-2:CN" target="_blank">ISO_3166-2:CN</a>，广东省：“CN-GD”，<b>用作特征</b>
     */
    public void setProvince(String Province) {
        this.Province = Province;
    }

    /**
     * Get 行为发生时的城市地区，统一用国家最新标准地区行政编码，如：<a href="https://www.mca.gov.cn/article/sj/xzqh/2020/" target="_blank">2020年行政区编码</a>，其他国家统一用国际公认城市简称或者城市编码，<b>用作特征</b> 
     * @return City 行为发生时的城市地区，统一用国家最新标准地区行政编码，如：<a href="https://www.mca.gov.cn/article/sj/xzqh/2020/" target="_blank">2020年行政区编码</a>，其他国家统一用国际公认城市简称或者城市编码，<b>用作特征</b>
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set 行为发生时的城市地区，统一用国家最新标准地区行政编码，如：<a href="https://www.mca.gov.cn/article/sj/xzqh/2020/" target="_blank">2020年行政区编码</a>，其他国家统一用国际公认城市简称或者城市编码，<b>用作特征</b>
     * @param City 行为发生时的城市地区，统一用国家最新标准地区行政编码，如：<a href="https://www.mca.gov.cn/article/sj/xzqh/2020/" target="_blank">2020年行政区编码</a>，其他国家统一用国际公认城市简称或者城市编码，<b>用作特征</b>
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * Get 行为发生时的客户端ip，<b>用作特征</b> 
     * @return IP 行为发生时的客户端ip，<b>用作特征</b>
     */
    public String getIP() {
        return this.IP;
    }

    /**
     * Set 行为发生时的客户端ip，<b>用作特征</b>
     * @param IP 行为发生时的客户端ip，<b>用作特征</b>
     */
    public void setIP(String IP) {
        this.IP = IP;
    }

    /**
     * Get 行为发生时的客户端网络类型，<b>用作特征</b> 
     * @return Network 行为发生时的客户端网络类型，<b>用作特征</b>
     */
    public String getNetwork() {
        return this.Network;
    }

    /**
     * Set 行为发生时的客户端网络类型，<b>用作特征</b>
     * @param Network 行为发生时的客户端网络类型，<b>用作特征</b>
     */
    public void setNetwork(String Network) {
        this.Network = Network;
    }

    /**
     * Get 行为发生时的客户端平台，ios/android/h5，<b>用作特征</b> 
     * @return Platform 行为发生时的客户端平台，ios/android/h5，<b>用作特征</b>
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set 行为发生时的客户端平台，ios/android/h5，<b>用作特征</b>
     * @param Platform 行为发生时的客户端平台，ios/android/h5，<b>用作特征</b>
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get 行为发生时的客户端app版本，<b>用作特征</b> 
     * @return AppVersion 行为发生时的客户端app版本，<b>用作特征</b>
     */
    public String getAppVersion() {
        return this.AppVersion;
    }

    /**
     * Set 行为发生时的客户端app版本，<b>用作特征</b>
     * @param AppVersion 行为发生时的客户端app版本，<b>用作特征</b>
     */
    public void setAppVersion(String AppVersion) {
        this.AppVersion = AppVersion;
    }

    /**
     * Get 行为发生时的操作系统版本，<b>用作特征</b> 
     * @return OsVersion 行为发生时的操作系统版本，<b>用作特征</b>
     */
    public String getOsVersion() {
        return this.OsVersion;
    }

    /**
     * Set 行为发生时的操作系统版本，<b>用作特征</b>
     * @param OsVersion 行为发生时的操作系统版本，<b>用作特征</b>
     */
    public void setOsVersion(String OsVersion) {
        this.OsVersion = OsVersion;
    }

    /**
     * Get 行为发生时的机型，<b>用作特征</b> 
     * @return DeviceModel 行为发生时的机型，<b>用作特征</b>
     */
    public String getDeviceModel() {
        return this.DeviceModel;
    }

    /**
     * Set 行为发生时的机型，<b>用作特征</b>
     * @param DeviceModel 行为发生时的机型，<b>用作特征</b>
     */
    public void setDeviceModel(String DeviceModel) {
        this.DeviceModel = DeviceModel;
    }

    /**
     * Get json字符串，<b>用于行为数据的扩展</b> 
     * @return Extension json字符串，<b>用于行为数据的扩展</b>
     */
    public String getExtension() {
        return this.Extension;
    }

    /**
     * Set json字符串，<b>用于行为数据的扩展</b>
     * @param Extension json字符串，<b>用于行为数据的扩展</b>
     */
    public void setExtension(String Extension) {
        this.Extension = Extension;
    }

    public FeedBehaviorInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FeedBehaviorInfo(FeedBehaviorInfo source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.ItemId != null) {
            this.ItemId = new String(source.ItemId);
        }
        if (source.BehaviorType != null) {
            this.BehaviorType = new String(source.BehaviorType);
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
        if (source.ItemTraceId != null) {
            this.ItemTraceId = new String(source.ItemTraceId);
        }
        if (source.ItemType != null) {
            this.ItemType = new String(source.ItemType);
        }
        if (source.ReferrerItemId != null) {
            this.ReferrerItemId = new String(source.ReferrerItemId);
        }
        if (source.UserIdList != null) {
            this.UserIdList = new UserIdInfo[source.UserIdList.length];
            for (int i = 0; i < source.UserIdList.length; i++) {
                this.UserIdList[i] = new UserIdInfo(source.UserIdList[i]);
            }
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
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
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "ItemId", this.ItemId);
        this.setParamSimple(map, prefix + "BehaviorType", this.BehaviorType);
        this.setParamSimple(map, prefix + "BehaviorValue", this.BehaviorValue);
        this.setParamSimple(map, prefix + "BehaviorTimestamp", this.BehaviorTimestamp);
        this.setParamSimple(map, prefix + "SceneId", this.SceneId);
        this.setParamSimple(map, prefix + "ItemTraceId", this.ItemTraceId);
        this.setParamSimple(map, prefix + "ItemType", this.ItemType);
        this.setParamSimple(map, prefix + "ReferrerItemId", this.ReferrerItemId);
        this.setParamArrayObj(map, prefix + "UserIdList.", this.UserIdList);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Country", this.Country);
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "IP", this.IP);
        this.setParamSimple(map, prefix + "Network", this.Network);
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "AppVersion", this.AppVersion);
        this.setParamSimple(map, prefix + "OsVersion", this.OsVersion);
        this.setParamSimple(map, prefix + "DeviceModel", this.DeviceModel);
        this.setParamSimple(map, prefix + "Extension", this.Extension);

    }
}

