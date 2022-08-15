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

public class FeedRecommendRequest extends AbstractModel{

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
    * 用户唯一ID，客户自定义用户ID，作为一个用户的唯一标识
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 用户设备ID数组，可传入用户的多个类型ID，用于关联画像信息
    */
    @SerializedName("UserIdList")
    @Expose
    private UserIdInfo [] UserIdList;

    /**
    * 推荐返回数量，默认10个，最多支持50个的内容返回。如果有更多数量要求，<a href="https://console.cloud.tencent.com/workorder/category" target="_blank">提单</a>沟通解决
    */
    @SerializedName("ItemCnt")
    @Expose
    private Long ItemCnt;

    /**
    * 当场景是相关推荐时该值必填，场景是非相关推荐时该值无效
    */
    @SerializedName("CurrentItemId")
    @Expose
    private String CurrentItemId;

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
     * Get 用户设备ID数组，可传入用户的多个类型ID，用于关联画像信息 
     * @return UserIdList 用户设备ID数组，可传入用户的多个类型ID，用于关联画像信息
     */
    public UserIdInfo [] getUserIdList() {
        return this.UserIdList;
    }

    /**
     * Set 用户设备ID数组，可传入用户的多个类型ID，用于关联画像信息
     * @param UserIdList 用户设备ID数组，可传入用户的多个类型ID，用于关联画像信息
     */
    public void setUserIdList(UserIdInfo [] UserIdList) {
        this.UserIdList = UserIdList;
    }

    /**
     * Get 推荐返回数量，默认10个，最多支持50个的内容返回。如果有更多数量要求，<a href="https://console.cloud.tencent.com/workorder/category" target="_blank">提单</a>沟通解决 
     * @return ItemCnt 推荐返回数量，默认10个，最多支持50个的内容返回。如果有更多数量要求，<a href="https://console.cloud.tencent.com/workorder/category" target="_blank">提单</a>沟通解决
     */
    public Long getItemCnt() {
        return this.ItemCnt;
    }

    /**
     * Set 推荐返回数量，默认10个，最多支持50个的内容返回。如果有更多数量要求，<a href="https://console.cloud.tencent.com/workorder/category" target="_blank">提单</a>沟通解决
     * @param ItemCnt 推荐返回数量，默认10个，最多支持50个的内容返回。如果有更多数量要求，<a href="https://console.cloud.tencent.com/workorder/category" target="_blank">提单</a>沟通解决
     */
    public void setItemCnt(Long ItemCnt) {
        this.ItemCnt = ItemCnt;
    }

    /**
     * Get 当场景是相关推荐时该值必填，场景是非相关推荐时该值无效 
     * @return CurrentItemId 当场景是相关推荐时该值必填，场景是非相关推荐时该值无效
     */
    public String getCurrentItemId() {
        return this.CurrentItemId;
    }

    /**
     * Set 当场景是相关推荐时该值必填，场景是非相关推荐时该值无效
     * @param CurrentItemId 当场景是相关推荐时该值必填，场景是非相关推荐时该值无效
     */
    public void setCurrentItemId(String CurrentItemId) {
        this.CurrentItemId = CurrentItemId;
    }

    public FeedRecommendRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FeedRecommendRequest(FeedRecommendRequest source) {
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
            this.UserIdList = new UserIdInfo[source.UserIdList.length];
            for (int i = 0; i < source.UserIdList.length; i++) {
                this.UserIdList[i] = new UserIdInfo(source.UserIdList[i]);
            }
        }
        if (source.ItemCnt != null) {
            this.ItemCnt = new Long(source.ItemCnt);
        }
        if (source.CurrentItemId != null) {
            this.CurrentItemId = new String(source.CurrentItemId);
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
        this.setParamSimple(map, prefix + "ItemCnt", this.ItemCnt);
        this.setParamSimple(map, prefix + "CurrentItemId", this.CurrentItemId);

    }
}

