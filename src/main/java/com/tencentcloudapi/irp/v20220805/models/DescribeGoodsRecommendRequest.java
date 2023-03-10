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

public class DescribeGoodsRecommendRequest extends AbstractModel{

    /**
    * 实例ID，在控制台获取
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 场景ID，在控制台创建场景后获取
    */
    @SerializedName("SceneId")
    @Expose
    private String SceneId;

    /**
    * 用户唯一ID，客户自定义用户ID，作为一个用户的唯一标识，需和行为数据上报接口中的UserId一致，否则影响特征关联
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 用户设备ID数组，可传入用户的多个类型ID，用于关联画像信息
    */
    @SerializedName("UserIdList")
    @Expose
    private StrUserIdInfo [] UserIdList;

    /**
    * 推荐返回数量，默认10个，最多支持50个的内容返回。如果有更多数量要求，<a href="https://console.cloud.tencent.com/workorder/category" target="_blank">提单</a>沟通解决
    */
    @SerializedName("GoodsCnt")
    @Expose
    private Long GoodsCnt;

    /**
    * 当场景是相关推荐时该值必填，场景是非相关推荐时该值无效
    */
    @SerializedName("CurrentGoodsId")
    @Expose
    private String CurrentGoodsId;

    /**
    * 用户的实时特征信息，用作特征
    */
    @SerializedName("UserPortraitInfo")
    @Expose
    private UserPortraitInfo UserPortraitInfo;

    /**
    * 本次请求针对该用户需要过滤的物品列表(不超过100个)
    */
    @SerializedName("BlackGoodsList")
    @Expose
    private String [] BlackGoodsList;

    /**
    * json字符串，扩展字段
    */
    @SerializedName("Extension")
    @Expose
    private String Extension;

    /**
     * Get 实例ID，在控制台获取 
     * @return InstanceId 实例ID，在控制台获取
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID，在控制台获取
     * @param InstanceId 实例ID，在控制台获取
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 场景ID，在控制台创建场景后获取 
     * @return SceneId 场景ID，在控制台创建场景后获取
     */
    public String getSceneId() {
        return this.SceneId;
    }

    /**
     * Set 场景ID，在控制台创建场景后获取
     * @param SceneId 场景ID，在控制台创建场景后获取
     */
    public void setSceneId(String SceneId) {
        this.SceneId = SceneId;
    }

    /**
     * Get 用户唯一ID，客户自定义用户ID，作为一个用户的唯一标识，需和行为数据上报接口中的UserId一致，否则影响特征关联 
     * @return UserId 用户唯一ID，客户自定义用户ID，作为一个用户的唯一标识，需和行为数据上报接口中的UserId一致，否则影响特征关联
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户唯一ID，客户自定义用户ID，作为一个用户的唯一标识，需和行为数据上报接口中的UserId一致，否则影响特征关联
     * @param UserId 用户唯一ID，客户自定义用户ID，作为一个用户的唯一标识，需和行为数据上报接口中的UserId一致，否则影响特征关联
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 用户设备ID数组，可传入用户的多个类型ID，用于关联画像信息 
     * @return UserIdList 用户设备ID数组，可传入用户的多个类型ID，用于关联画像信息
     */
    public StrUserIdInfo [] getUserIdList() {
        return this.UserIdList;
    }

    /**
     * Set 用户设备ID数组，可传入用户的多个类型ID，用于关联画像信息
     * @param UserIdList 用户设备ID数组，可传入用户的多个类型ID，用于关联画像信息
     */
    public void setUserIdList(StrUserIdInfo [] UserIdList) {
        this.UserIdList = UserIdList;
    }

    /**
     * Get 推荐返回数量，默认10个，最多支持50个的内容返回。如果有更多数量要求，<a href="https://console.cloud.tencent.com/workorder/category" target="_blank">提单</a>沟通解决 
     * @return GoodsCnt 推荐返回数量，默认10个，最多支持50个的内容返回。如果有更多数量要求，<a href="https://console.cloud.tencent.com/workorder/category" target="_blank">提单</a>沟通解决
     */
    public Long getGoodsCnt() {
        return this.GoodsCnt;
    }

    /**
     * Set 推荐返回数量，默认10个，最多支持50个的内容返回。如果有更多数量要求，<a href="https://console.cloud.tencent.com/workorder/category" target="_blank">提单</a>沟通解决
     * @param GoodsCnt 推荐返回数量，默认10个，最多支持50个的内容返回。如果有更多数量要求，<a href="https://console.cloud.tencent.com/workorder/category" target="_blank">提单</a>沟通解决
     */
    public void setGoodsCnt(Long GoodsCnt) {
        this.GoodsCnt = GoodsCnt;
    }

    /**
     * Get 当场景是相关推荐时该值必填，场景是非相关推荐时该值无效 
     * @return CurrentGoodsId 当场景是相关推荐时该值必填，场景是非相关推荐时该值无效
     */
    public String getCurrentGoodsId() {
        return this.CurrentGoodsId;
    }

    /**
     * Set 当场景是相关推荐时该值必填，场景是非相关推荐时该值无效
     * @param CurrentGoodsId 当场景是相关推荐时该值必填，场景是非相关推荐时该值无效
     */
    public void setCurrentGoodsId(String CurrentGoodsId) {
        this.CurrentGoodsId = CurrentGoodsId;
    }

    /**
     * Get 用户的实时特征信息，用作特征 
     * @return UserPortraitInfo 用户的实时特征信息，用作特征
     */
    public UserPortraitInfo getUserPortraitInfo() {
        return this.UserPortraitInfo;
    }

    /**
     * Set 用户的实时特征信息，用作特征
     * @param UserPortraitInfo 用户的实时特征信息，用作特征
     */
    public void setUserPortraitInfo(UserPortraitInfo UserPortraitInfo) {
        this.UserPortraitInfo = UserPortraitInfo;
    }

    /**
     * Get 本次请求针对该用户需要过滤的物品列表(不超过100个) 
     * @return BlackGoodsList 本次请求针对该用户需要过滤的物品列表(不超过100个)
     */
    public String [] getBlackGoodsList() {
        return this.BlackGoodsList;
    }

    /**
     * Set 本次请求针对该用户需要过滤的物品列表(不超过100个)
     * @param BlackGoodsList 本次请求针对该用户需要过滤的物品列表(不超过100个)
     */
    public void setBlackGoodsList(String [] BlackGoodsList) {
        this.BlackGoodsList = BlackGoodsList;
    }

    /**
     * Get json字符串，扩展字段 
     * @return Extension json字符串，扩展字段
     */
    public String getExtension() {
        return this.Extension;
    }

    /**
     * Set json字符串，扩展字段
     * @param Extension json字符串，扩展字段
     */
    public void setExtension(String Extension) {
        this.Extension = Extension;
    }

    public DescribeGoodsRecommendRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGoodsRecommendRequest(DescribeGoodsRecommendRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.SceneId != null) {
            this.SceneId = new String(source.SceneId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.UserIdList != null) {
            this.UserIdList = new StrUserIdInfo[source.UserIdList.length];
            for (int i = 0; i < source.UserIdList.length; i++) {
                this.UserIdList[i] = new StrUserIdInfo(source.UserIdList[i]);
            }
        }
        if (source.GoodsCnt != null) {
            this.GoodsCnt = new Long(source.GoodsCnt);
        }
        if (source.CurrentGoodsId != null) {
            this.CurrentGoodsId = new String(source.CurrentGoodsId);
        }
        if (source.UserPortraitInfo != null) {
            this.UserPortraitInfo = new UserPortraitInfo(source.UserPortraitInfo);
        }
        if (source.BlackGoodsList != null) {
            this.BlackGoodsList = new String[source.BlackGoodsList.length];
            for (int i = 0; i < source.BlackGoodsList.length; i++) {
                this.BlackGoodsList[i] = new String(source.BlackGoodsList[i]);
            }
        }
        if (source.Extension != null) {
            this.Extension = new String(source.Extension);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "SceneId", this.SceneId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamArrayObj(map, prefix + "UserIdList.", this.UserIdList);
        this.setParamSimple(map, prefix + "GoodsCnt", this.GoodsCnt);
        this.setParamSimple(map, prefix + "CurrentGoodsId", this.CurrentGoodsId);
        this.setParamObj(map, prefix + "UserPortraitInfo.", this.UserPortraitInfo);
        this.setParamArraySimple(map, prefix + "BlackGoodsList.", this.BlackGoodsList);
        this.setParamSimple(map, prefix + "Extension", this.Extension);

    }
}

