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

public class GoodsBehaviorInfo extends AbstractModel{

    /**
    * 用户唯一ID，客户自定义用户ID，作为一个用户的唯一标识
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 商品唯一ID，skuId或spuId，客户根据需求自行决定商品主键粒度
    */
    @SerializedName("GoodsId")
    @Expose
    private String GoodsId;

    /**
    * 行为类型：<br> ● expose - 曝光，<b>必须</b><br> ● click - 点击，<b>必须</b><br/>  ● stay - 详情页停留时长，<b>强烈建议</b><br/>  ● videoover - 视频播放时长，<b>强烈建议</b><br/> ●  like - 点赞&喜欢，<b>正效果</b><br/> ● collect - 收藏，<b>正效果</b><br/> ●  share - 转发&分享，<b>正效果</b><br/> ● reward - 打赏，<b>正效果</b><br/> ● unlike - 踩&不喜欢，<b>负效果</b><br/> ●  comment - 评论<br/> ●  order - 下单<br/> ●  buy - 购买成功<br/> ●  addcart - 加入购物车<br/>   
不支持的行为类型，可以映射到未被使用的其他行为类型。如实际业务数据中有私信行为，没有收藏行为，可以将私信行为映射到收藏行为
    */
    @SerializedName("BehaviorType")
    @Expose
    private String BehaviorType;

    /**
    * 行为类型对应的行为值：<br/> ● expose - 曝光，固定填1<br/> ● click - 点击，固定填1<br/>  ● stay - 详情页停留时长，填停留秒数，取值[1-86400]<br/>  ● videoover - 视频播放时长，填播放结束的秒数，取值[1-86400]<br/> ●  like - 点赞&喜欢，固定填1<br/> ● collect - 收藏，固定填1<br/> ●  share - 转发&分享，固定填1<br/> ● reward - 打赏，填打赏金额，没有则填1<br/> ● unlike - 踩&不喜欢，填不喜欢的原因，没有则填1<br/> ●  comment - 评论，填评论内容，如“上海加油”<br/> ●  order - 下单，固定填1<br/> ●  buy - 购买成功，固定填1<br/> ●  addcart - 加入购物车，固定填1
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
    * 算法来源： <br>● business 业务自己的算法对照组<br/> ● tencent 腾讯算法<br/> ● other 其他算法<br/>默认为tencent，区分行为来源于哪个算法，<b>用于Poc阶段的效果对比验证</b>
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 标识行为发生在app内哪个页面，取值客户自定，可以是明文或id，建议传明文便于理解、分析，如首页，发现页，用户中心等
<b>用作上下文特征，刻画不同场景用户行为分布的差异</b>
    */
    @SerializedName("Page")
    @Expose
    private String Page;

    /**
    * 标识行为发生在页面的哪一区块，取值客户自定，可以是明文或id，建议传明文便于理解、分析，如横幅、广告位、猜你喜欢等
<b>用作上下文特征，刻画不同模块用户行为分布的差异</b>
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 推荐追踪ID，使用推荐结果中返回的GoodsTraceId填入。 
注意：如果和推荐结果中的GoodsTraceId不同，会影响行为特征归因，影响推荐算法效果。<b>强烈建议</b>
    */
    @SerializedName("GoodsTraceId")
    @Expose
    private String GoodsTraceId;

    /**
    * 相关推荐场景点击进入详情页的内容id，该字段用来注明行为发生于哪个内容的详情页推荐中，<b>相关推荐场景强烈建议</b>
    */
    @SerializedName("ReferrerGoodsId")
    @Expose
    private String ReferrerGoodsId;

    /**
    * 订单商品购买个数，当behaviorType=order，buy或addcart时有值，<b>用作特征</b>
    */
    @SerializedName("OrderGoodsCnt")
    @Expose
    private Long OrderGoodsCnt;

    /**
    * 订单总金额，当behaviorType=order或buy时有值（单位：元，统一货币体系，如统一为RMB，美元等），<b>用作特征</b>
    */
    @SerializedName("OrderAmount")
    @Expose
    private Float OrderAmount;

    /**
    * 用户设备ID数组，可传入用户的多个类型ID，详见UserIdInfo结构体，建议补齐，<b>用于构建用户画像信息</b>
    */
    @SerializedName("UserIdList")
    @Expose
    private StrUserIdInfo [] UserIdList;

    /**
    * 行为发生时用户基础特征信息，<b>用作特征</b>
    */
    @SerializedName("UserPortraitInfo")
    @Expose
    private UserPortraitInfo UserPortraitInfo;

    /**
    * 标识行为发生在模块内的具体位置，如1、2、...
<b>用作上下文特征，刻画不同位置用户行为分布的差异</b>
    */
    @SerializedName("Position")
    @Expose
    private Long Position;

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
     * Get 商品唯一ID，skuId或spuId，客户根据需求自行决定商品主键粒度 
     * @return GoodsId 商品唯一ID，skuId或spuId，客户根据需求自行决定商品主键粒度
     */
    public String getGoodsId() {
        return this.GoodsId;
    }

    /**
     * Set 商品唯一ID，skuId或spuId，客户根据需求自行决定商品主键粒度
     * @param GoodsId 商品唯一ID，skuId或spuId，客户根据需求自行决定商品主键粒度
     */
    public void setGoodsId(String GoodsId) {
        this.GoodsId = GoodsId;
    }

    /**
     * Get 行为类型：<br> ● expose - 曝光，<b>必须</b><br> ● click - 点击，<b>必须</b><br/>  ● stay - 详情页停留时长，<b>强烈建议</b><br/>  ● videoover - 视频播放时长，<b>强烈建议</b><br/> ●  like - 点赞&喜欢，<b>正效果</b><br/> ● collect - 收藏，<b>正效果</b><br/> ●  share - 转发&分享，<b>正效果</b><br/> ● reward - 打赏，<b>正效果</b><br/> ● unlike - 踩&不喜欢，<b>负效果</b><br/> ●  comment - 评论<br/> ●  order - 下单<br/> ●  buy - 购买成功<br/> ●  addcart - 加入购物车<br/>   
不支持的行为类型，可以映射到未被使用的其他行为类型。如实际业务数据中有私信行为，没有收藏行为，可以将私信行为映射到收藏行为 
     * @return BehaviorType 行为类型：<br> ● expose - 曝光，<b>必须</b><br> ● click - 点击，<b>必须</b><br/>  ● stay - 详情页停留时长，<b>强烈建议</b><br/>  ● videoover - 视频播放时长，<b>强烈建议</b><br/> ●  like - 点赞&喜欢，<b>正效果</b><br/> ● collect - 收藏，<b>正效果</b><br/> ●  share - 转发&分享，<b>正效果</b><br/> ● reward - 打赏，<b>正效果</b><br/> ● unlike - 踩&不喜欢，<b>负效果</b><br/> ●  comment - 评论<br/> ●  order - 下单<br/> ●  buy - 购买成功<br/> ●  addcart - 加入购物车<br/>   
不支持的行为类型，可以映射到未被使用的其他行为类型。如实际业务数据中有私信行为，没有收藏行为，可以将私信行为映射到收藏行为
     */
    public String getBehaviorType() {
        return this.BehaviorType;
    }

    /**
     * Set 行为类型：<br> ● expose - 曝光，<b>必须</b><br> ● click - 点击，<b>必须</b><br/>  ● stay - 详情页停留时长，<b>强烈建议</b><br/>  ● videoover - 视频播放时长，<b>强烈建议</b><br/> ●  like - 点赞&喜欢，<b>正效果</b><br/> ● collect - 收藏，<b>正效果</b><br/> ●  share - 转发&分享，<b>正效果</b><br/> ● reward - 打赏，<b>正效果</b><br/> ● unlike - 踩&不喜欢，<b>负效果</b><br/> ●  comment - 评论<br/> ●  order - 下单<br/> ●  buy - 购买成功<br/> ●  addcart - 加入购物车<br/>   
不支持的行为类型，可以映射到未被使用的其他行为类型。如实际业务数据中有私信行为，没有收藏行为，可以将私信行为映射到收藏行为
     * @param BehaviorType 行为类型：<br> ● expose - 曝光，<b>必须</b><br> ● click - 点击，<b>必须</b><br/>  ● stay - 详情页停留时长，<b>强烈建议</b><br/>  ● videoover - 视频播放时长，<b>强烈建议</b><br/> ●  like - 点赞&喜欢，<b>正效果</b><br/> ● collect - 收藏，<b>正效果</b><br/> ●  share - 转发&分享，<b>正效果</b><br/> ● reward - 打赏，<b>正效果</b><br/> ● unlike - 踩&不喜欢，<b>负效果</b><br/> ●  comment - 评论<br/> ●  order - 下单<br/> ●  buy - 购买成功<br/> ●  addcart - 加入购物车<br/>   
不支持的行为类型，可以映射到未被使用的其他行为类型。如实际业务数据中有私信行为，没有收藏行为，可以将私信行为映射到收藏行为
     */
    public void setBehaviorType(String BehaviorType) {
        this.BehaviorType = BehaviorType;
    }

    /**
     * Get 行为类型对应的行为值：<br/> ● expose - 曝光，固定填1<br/> ● click - 点击，固定填1<br/>  ● stay - 详情页停留时长，填停留秒数，取值[1-86400]<br/>  ● videoover - 视频播放时长，填播放结束的秒数，取值[1-86400]<br/> ●  like - 点赞&喜欢，固定填1<br/> ● collect - 收藏，固定填1<br/> ●  share - 转发&分享，固定填1<br/> ● reward - 打赏，填打赏金额，没有则填1<br/> ● unlike - 踩&不喜欢，填不喜欢的原因，没有则填1<br/> ●  comment - 评论，填评论内容，如“上海加油”<br/> ●  order - 下单，固定填1<br/> ●  buy - 购买成功，固定填1<br/> ●  addcart - 加入购物车，固定填1 
     * @return BehaviorValue 行为类型对应的行为值：<br/> ● expose - 曝光，固定填1<br/> ● click - 点击，固定填1<br/>  ● stay - 详情页停留时长，填停留秒数，取值[1-86400]<br/>  ● videoover - 视频播放时长，填播放结束的秒数，取值[1-86400]<br/> ●  like - 点赞&喜欢，固定填1<br/> ● collect - 收藏，固定填1<br/> ●  share - 转发&分享，固定填1<br/> ● reward - 打赏，填打赏金额，没有则填1<br/> ● unlike - 踩&不喜欢，填不喜欢的原因，没有则填1<br/> ●  comment - 评论，填评论内容，如“上海加油”<br/> ●  order - 下单，固定填1<br/> ●  buy - 购买成功，固定填1<br/> ●  addcart - 加入购物车，固定填1
     */
    public String getBehaviorValue() {
        return this.BehaviorValue;
    }

    /**
     * Set 行为类型对应的行为值：<br/> ● expose - 曝光，固定填1<br/> ● click - 点击，固定填1<br/>  ● stay - 详情页停留时长，填停留秒数，取值[1-86400]<br/>  ● videoover - 视频播放时长，填播放结束的秒数，取值[1-86400]<br/> ●  like - 点赞&喜欢，固定填1<br/> ● collect - 收藏，固定填1<br/> ●  share - 转发&分享，固定填1<br/> ● reward - 打赏，填打赏金额，没有则填1<br/> ● unlike - 踩&不喜欢，填不喜欢的原因，没有则填1<br/> ●  comment - 评论，填评论内容，如“上海加油”<br/> ●  order - 下单，固定填1<br/> ●  buy - 购买成功，固定填1<br/> ●  addcart - 加入购物车，固定填1
     * @param BehaviorValue 行为类型对应的行为值：<br/> ● expose - 曝光，固定填1<br/> ● click - 点击，固定填1<br/>  ● stay - 详情页停留时长，填停留秒数，取值[1-86400]<br/>  ● videoover - 视频播放时长，填播放结束的秒数，取值[1-86400]<br/> ●  like - 点赞&喜欢，固定填1<br/> ● collect - 收藏，固定填1<br/> ●  share - 转发&分享，固定填1<br/> ● reward - 打赏，填打赏金额，没有则填1<br/> ● unlike - 踩&不喜欢，填不喜欢的原因，没有则填1<br/> ●  comment - 评论，填评论内容，如“上海加油”<br/> ●  order - 下单，固定填1<br/> ●  buy - 购买成功，固定填1<br/> ●  addcart - 加入购物车，固定填1
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
     * Get 标识行为发生在app内哪个页面，取值客户自定，可以是明文或id，建议传明文便于理解、分析，如首页，发现页，用户中心等
<b>用作上下文特征，刻画不同场景用户行为分布的差异</b> 
     * @return Page 标识行为发生在app内哪个页面，取值客户自定，可以是明文或id，建议传明文便于理解、分析，如首页，发现页，用户中心等
<b>用作上下文特征，刻画不同场景用户行为分布的差异</b>
     */
    public String getPage() {
        return this.Page;
    }

    /**
     * Set 标识行为发生在app内哪个页面，取值客户自定，可以是明文或id，建议传明文便于理解、分析，如首页，发现页，用户中心等
<b>用作上下文特征，刻画不同场景用户行为分布的差异</b>
     * @param Page 标识行为发生在app内哪个页面，取值客户自定，可以是明文或id，建议传明文便于理解、分析，如首页，发现页，用户中心等
<b>用作上下文特征，刻画不同场景用户行为分布的差异</b>
     */
    public void setPage(String Page) {
        this.Page = Page;
    }

    /**
     * Get 标识行为发生在页面的哪一区块，取值客户自定，可以是明文或id，建议传明文便于理解、分析，如横幅、广告位、猜你喜欢等
<b>用作上下文特征，刻画不同模块用户行为分布的差异</b> 
     * @return Module 标识行为发生在页面的哪一区块，取值客户自定，可以是明文或id，建议传明文便于理解、分析，如横幅、广告位、猜你喜欢等
<b>用作上下文特征，刻画不同模块用户行为分布的差异</b>
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set 标识行为发生在页面的哪一区块，取值客户自定，可以是明文或id，建议传明文便于理解、分析，如横幅、广告位、猜你喜欢等
<b>用作上下文特征，刻画不同模块用户行为分布的差异</b>
     * @param Module 标识行为发生在页面的哪一区块，取值客户自定，可以是明文或id，建议传明文便于理解、分析，如横幅、广告位、猜你喜欢等
<b>用作上下文特征，刻画不同模块用户行为分布的差异</b>
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get 推荐追踪ID，使用推荐结果中返回的GoodsTraceId填入。 
注意：如果和推荐结果中的GoodsTraceId不同，会影响行为特征归因，影响推荐算法效果。<b>强烈建议</b> 
     * @return GoodsTraceId 推荐追踪ID，使用推荐结果中返回的GoodsTraceId填入。 
注意：如果和推荐结果中的GoodsTraceId不同，会影响行为特征归因，影响推荐算法效果。<b>强烈建议</b>
     */
    public String getGoodsTraceId() {
        return this.GoodsTraceId;
    }

    /**
     * Set 推荐追踪ID，使用推荐结果中返回的GoodsTraceId填入。 
注意：如果和推荐结果中的GoodsTraceId不同，会影响行为特征归因，影响推荐算法效果。<b>强烈建议</b>
     * @param GoodsTraceId 推荐追踪ID，使用推荐结果中返回的GoodsTraceId填入。 
注意：如果和推荐结果中的GoodsTraceId不同，会影响行为特征归因，影响推荐算法效果。<b>强烈建议</b>
     */
    public void setGoodsTraceId(String GoodsTraceId) {
        this.GoodsTraceId = GoodsTraceId;
    }

    /**
     * Get 相关推荐场景点击进入详情页的内容id，该字段用来注明行为发生于哪个内容的详情页推荐中，<b>相关推荐场景强烈建议</b> 
     * @return ReferrerGoodsId 相关推荐场景点击进入详情页的内容id，该字段用来注明行为发生于哪个内容的详情页推荐中，<b>相关推荐场景强烈建议</b>
     */
    public String getReferrerGoodsId() {
        return this.ReferrerGoodsId;
    }

    /**
     * Set 相关推荐场景点击进入详情页的内容id，该字段用来注明行为发生于哪个内容的详情页推荐中，<b>相关推荐场景强烈建议</b>
     * @param ReferrerGoodsId 相关推荐场景点击进入详情页的内容id，该字段用来注明行为发生于哪个内容的详情页推荐中，<b>相关推荐场景强烈建议</b>
     */
    public void setReferrerGoodsId(String ReferrerGoodsId) {
        this.ReferrerGoodsId = ReferrerGoodsId;
    }

    /**
     * Get 订单商品购买个数，当behaviorType=order，buy或addcart时有值，<b>用作特征</b> 
     * @return OrderGoodsCnt 订单商品购买个数，当behaviorType=order，buy或addcart时有值，<b>用作特征</b>
     */
    public Long getOrderGoodsCnt() {
        return this.OrderGoodsCnt;
    }

    /**
     * Set 订单商品购买个数，当behaviorType=order，buy或addcart时有值，<b>用作特征</b>
     * @param OrderGoodsCnt 订单商品购买个数，当behaviorType=order，buy或addcart时有值，<b>用作特征</b>
     */
    public void setOrderGoodsCnt(Long OrderGoodsCnt) {
        this.OrderGoodsCnt = OrderGoodsCnt;
    }

    /**
     * Get 订单总金额，当behaviorType=order或buy时有值（单位：元，统一货币体系，如统一为RMB，美元等），<b>用作特征</b> 
     * @return OrderAmount 订单总金额，当behaviorType=order或buy时有值（单位：元，统一货币体系，如统一为RMB，美元等），<b>用作特征</b>
     */
    public Float getOrderAmount() {
        return this.OrderAmount;
    }

    /**
     * Set 订单总金额，当behaviorType=order或buy时有值（单位：元，统一货币体系，如统一为RMB，美元等），<b>用作特征</b>
     * @param OrderAmount 订单总金额，当behaviorType=order或buy时有值（单位：元，统一货币体系，如统一为RMB，美元等），<b>用作特征</b>
     */
    public void setOrderAmount(Float OrderAmount) {
        this.OrderAmount = OrderAmount;
    }

    /**
     * Get 用户设备ID数组，可传入用户的多个类型ID，详见UserIdInfo结构体，建议补齐，<b>用于构建用户画像信息</b> 
     * @return UserIdList 用户设备ID数组，可传入用户的多个类型ID，详见UserIdInfo结构体，建议补齐，<b>用于构建用户画像信息</b>
     */
    public StrUserIdInfo [] getUserIdList() {
        return this.UserIdList;
    }

    /**
     * Set 用户设备ID数组，可传入用户的多个类型ID，详见UserIdInfo结构体，建议补齐，<b>用于构建用户画像信息</b>
     * @param UserIdList 用户设备ID数组，可传入用户的多个类型ID，详见UserIdInfo结构体，建议补齐，<b>用于构建用户画像信息</b>
     */
    public void setUserIdList(StrUserIdInfo [] UserIdList) {
        this.UserIdList = UserIdList;
    }

    /**
     * Get 行为发生时用户基础特征信息，<b>用作特征</b> 
     * @return UserPortraitInfo 行为发生时用户基础特征信息，<b>用作特征</b>
     */
    public UserPortraitInfo getUserPortraitInfo() {
        return this.UserPortraitInfo;
    }

    /**
     * Set 行为发生时用户基础特征信息，<b>用作特征</b>
     * @param UserPortraitInfo 行为发生时用户基础特征信息，<b>用作特征</b>
     */
    public void setUserPortraitInfo(UserPortraitInfo UserPortraitInfo) {
        this.UserPortraitInfo = UserPortraitInfo;
    }

    /**
     * Get 标识行为发生在模块内的具体位置，如1、2、...
<b>用作上下文特征，刻画不同位置用户行为分布的差异</b> 
     * @return Position 标识行为发生在模块内的具体位置，如1、2、...
<b>用作上下文特征，刻画不同位置用户行为分布的差异</b>
     */
    public Long getPosition() {
        return this.Position;
    }

    /**
     * Set 标识行为发生在模块内的具体位置，如1、2、...
<b>用作上下文特征，刻画不同位置用户行为分布的差异</b>
     * @param Position 标识行为发生在模块内的具体位置，如1、2、...
<b>用作上下文特征，刻画不同位置用户行为分布的差异</b>
     */
    public void setPosition(Long Position) {
        this.Position = Position;
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

    public GoodsBehaviorInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GoodsBehaviorInfo(GoodsBehaviorInfo source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.GoodsId != null) {
            this.GoodsId = new String(source.GoodsId);
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
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.Page != null) {
            this.Page = new String(source.Page);
        }
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.GoodsTraceId != null) {
            this.GoodsTraceId = new String(source.GoodsTraceId);
        }
        if (source.ReferrerGoodsId != null) {
            this.ReferrerGoodsId = new String(source.ReferrerGoodsId);
        }
        if (source.OrderGoodsCnt != null) {
            this.OrderGoodsCnt = new Long(source.OrderGoodsCnt);
        }
        if (source.OrderAmount != null) {
            this.OrderAmount = new Float(source.OrderAmount);
        }
        if (source.UserIdList != null) {
            this.UserIdList = new StrUserIdInfo[source.UserIdList.length];
            for (int i = 0; i < source.UserIdList.length; i++) {
                this.UserIdList[i] = new StrUserIdInfo(source.UserIdList[i]);
            }
        }
        if (source.UserPortraitInfo != null) {
            this.UserPortraitInfo = new UserPortraitInfo(source.UserPortraitInfo);
        }
        if (source.Position != null) {
            this.Position = new Long(source.Position);
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
        this.setParamSimple(map, prefix + "GoodsId", this.GoodsId);
        this.setParamSimple(map, prefix + "BehaviorType", this.BehaviorType);
        this.setParamSimple(map, prefix + "BehaviorValue", this.BehaviorValue);
        this.setParamSimple(map, prefix + "BehaviorTimestamp", this.BehaviorTimestamp);
        this.setParamSimple(map, prefix + "SceneId", this.SceneId);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "GoodsTraceId", this.GoodsTraceId);
        this.setParamSimple(map, prefix + "ReferrerGoodsId", this.ReferrerGoodsId);
        this.setParamSimple(map, prefix + "OrderGoodsCnt", this.OrderGoodsCnt);
        this.setParamSimple(map, prefix + "OrderAmount", this.OrderAmount);
        this.setParamArrayObj(map, prefix + "UserIdList.", this.UserIdList);
        this.setParamObj(map, prefix + "UserPortraitInfo.", this.UserPortraitInfo);
        this.setParamSimple(map, prefix + "Position", this.Position);
        this.setParamSimple(map, prefix + "Extension", this.Extension);

    }
}

