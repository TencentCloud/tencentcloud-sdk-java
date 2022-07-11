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

public class RecommendContentRequest extends AbstractModel{

    /**
    * 业务id
    */
    @SerializedName("Bid")
    @Expose
    private String Bid;

    /**
    * 场景id：比如有“猜你喜欢”，“热门内容”等推荐模块，每一个模块都有一个scene_id来表示。 在控制台创建场景后获取。需要跟行为上报时的id一致
    */
    @SerializedName("SceneId")
    @Expose
    private String SceneId;

    /**
    * 用户唯一ID数组，每个数组元素详见userId结构体，若不填，则接口返回热门结果
    */
    @SerializedName("UserIdList")
    @Expose
    private UserIdInfo [] UserIdList;

    /**
    * 会话id：必须和行为数据上报时所填写的traceId相同，用于行为数据来自于那次在线推荐请求的归因。**注意：此处如果没传，则响应会返回一个全局唯一ID返回给客户，并需客户透传给行为日志上报接口**
    */
    @SerializedName("RecTraceId")
    @Expose
    private String RecTraceId;

    /**
    * 推荐数量：物料优选的结果， 默认50个，目前最多支持200个的内容返回，如果返回个数更多，会影响性能，容易超时。
    */
    @SerializedName("ItemCnt")
    @Expose
    private Long ItemCnt;

    /**
    * 物料池id，用于召回该pool_id下的商品，如果有多个，用英文;分割。**注意：此处poolId需和物料上报时的poolIdList对应上**
    */
    @SerializedName("PoolId")
    @Expose
    private String PoolId;

    /**
    * 来源物料id，即用户当前浏览的物料id，用于在内容详情页获取关联推荐内容
    */
    @SerializedName("CurrentItemId")
    @Expose
    private String CurrentItemId;

    /**
    * 请求响应超时时间，单位ms，默认300ms，数值设置的过小，会影响推荐效果，最小支持250ms
    */
    @SerializedName("ResponseTimeout")
    @Expose
    private Long ResponseTimeout;

    /**
    * 返回结果中不同物料类型的比例，比例顺序需严格按照（图文，长视频，短视频，小视频）进行。只允许传[0,100]数字，多个请用**英文冒号**分割，且加起来不能超过100，以及比例数量不能超过**场景绑定的物料类型**（图文，长视频，短视频，小视频）数。**示例：**图文和短视频比例为40%:60%时，则填40:60图文和短视频比例为0%:100%时，则填0:100图文，长视频和短视频的比例为，图文占20%，剩余80%由长视频和短视频随机返回，则填20:80或仅填20均可
    */
    @SerializedName("ItemTypeRatio")
    @Expose
    private String ItemTypeRatio;

    /**
     * Get 业务id 
     * @return Bid 业务id
     */
    public String getBid() {
        return this.Bid;
    }

    /**
     * Set 业务id
     * @param Bid 业务id
     */
    public void setBid(String Bid) {
        this.Bid = Bid;
    }

    /**
     * Get 场景id：比如有“猜你喜欢”，“热门内容”等推荐模块，每一个模块都有一个scene_id来表示。 在控制台创建场景后获取。需要跟行为上报时的id一致 
     * @return SceneId 场景id：比如有“猜你喜欢”，“热门内容”等推荐模块，每一个模块都有一个scene_id来表示。 在控制台创建场景后获取。需要跟行为上报时的id一致
     */
    public String getSceneId() {
        return this.SceneId;
    }

    /**
     * Set 场景id：比如有“猜你喜欢”，“热门内容”等推荐模块，每一个模块都有一个scene_id来表示。 在控制台创建场景后获取。需要跟行为上报时的id一致
     * @param SceneId 场景id：比如有“猜你喜欢”，“热门内容”等推荐模块，每一个模块都有一个scene_id来表示。 在控制台创建场景后获取。需要跟行为上报时的id一致
     */
    public void setSceneId(String SceneId) {
        this.SceneId = SceneId;
    }

    /**
     * Get 用户唯一ID数组，每个数组元素详见userId结构体，若不填，则接口返回热门结果 
     * @return UserIdList 用户唯一ID数组，每个数组元素详见userId结构体，若不填，则接口返回热门结果
     */
    public UserIdInfo [] getUserIdList() {
        return this.UserIdList;
    }

    /**
     * Set 用户唯一ID数组，每个数组元素详见userId结构体，若不填，则接口返回热门结果
     * @param UserIdList 用户唯一ID数组，每个数组元素详见userId结构体，若不填，则接口返回热门结果
     */
    public void setUserIdList(UserIdInfo [] UserIdList) {
        this.UserIdList = UserIdList;
    }

    /**
     * Get 会话id：必须和行为数据上报时所填写的traceId相同，用于行为数据来自于那次在线推荐请求的归因。**注意：此处如果没传，则响应会返回一个全局唯一ID返回给客户，并需客户透传给行为日志上报接口** 
     * @return RecTraceId 会话id：必须和行为数据上报时所填写的traceId相同，用于行为数据来自于那次在线推荐请求的归因。**注意：此处如果没传，则响应会返回一个全局唯一ID返回给客户，并需客户透传给行为日志上报接口**
     */
    public String getRecTraceId() {
        return this.RecTraceId;
    }

    /**
     * Set 会话id：必须和行为数据上报时所填写的traceId相同，用于行为数据来自于那次在线推荐请求的归因。**注意：此处如果没传，则响应会返回一个全局唯一ID返回给客户，并需客户透传给行为日志上报接口**
     * @param RecTraceId 会话id：必须和行为数据上报时所填写的traceId相同，用于行为数据来自于那次在线推荐请求的归因。**注意：此处如果没传，则响应会返回一个全局唯一ID返回给客户，并需客户透传给行为日志上报接口**
     */
    public void setRecTraceId(String RecTraceId) {
        this.RecTraceId = RecTraceId;
    }

    /**
     * Get 推荐数量：物料优选的结果， 默认50个，目前最多支持200个的内容返回，如果返回个数更多，会影响性能，容易超时。 
     * @return ItemCnt 推荐数量：物料优选的结果， 默认50个，目前最多支持200个的内容返回，如果返回个数更多，会影响性能，容易超时。
     */
    public Long getItemCnt() {
        return this.ItemCnt;
    }

    /**
     * Set 推荐数量：物料优选的结果， 默认50个，目前最多支持200个的内容返回，如果返回个数更多，会影响性能，容易超时。
     * @param ItemCnt 推荐数量：物料优选的结果， 默认50个，目前最多支持200个的内容返回，如果返回个数更多，会影响性能，容易超时。
     */
    public void setItemCnt(Long ItemCnt) {
        this.ItemCnt = ItemCnt;
    }

    /**
     * Get 物料池id，用于召回该pool_id下的商品，如果有多个，用英文;分割。**注意：此处poolId需和物料上报时的poolIdList对应上** 
     * @return PoolId 物料池id，用于召回该pool_id下的商品，如果有多个，用英文;分割。**注意：此处poolId需和物料上报时的poolIdList对应上**
     */
    public String getPoolId() {
        return this.PoolId;
    }

    /**
     * Set 物料池id，用于召回该pool_id下的商品，如果有多个，用英文;分割。**注意：此处poolId需和物料上报时的poolIdList对应上**
     * @param PoolId 物料池id，用于召回该pool_id下的商品，如果有多个，用英文;分割。**注意：此处poolId需和物料上报时的poolIdList对应上**
     */
    public void setPoolId(String PoolId) {
        this.PoolId = PoolId;
    }

    /**
     * Get 来源物料id，即用户当前浏览的物料id，用于在内容详情页获取关联推荐内容 
     * @return CurrentItemId 来源物料id，即用户当前浏览的物料id，用于在内容详情页获取关联推荐内容
     */
    public String getCurrentItemId() {
        return this.CurrentItemId;
    }

    /**
     * Set 来源物料id，即用户当前浏览的物料id，用于在内容详情页获取关联推荐内容
     * @param CurrentItemId 来源物料id，即用户当前浏览的物料id，用于在内容详情页获取关联推荐内容
     */
    public void setCurrentItemId(String CurrentItemId) {
        this.CurrentItemId = CurrentItemId;
    }

    /**
     * Get 请求响应超时时间，单位ms，默认300ms，数值设置的过小，会影响推荐效果，最小支持250ms 
     * @return ResponseTimeout 请求响应超时时间，单位ms，默认300ms，数值设置的过小，会影响推荐效果，最小支持250ms
     */
    public Long getResponseTimeout() {
        return this.ResponseTimeout;
    }

    /**
     * Set 请求响应超时时间，单位ms，默认300ms，数值设置的过小，会影响推荐效果，最小支持250ms
     * @param ResponseTimeout 请求响应超时时间，单位ms，默认300ms，数值设置的过小，会影响推荐效果，最小支持250ms
     */
    public void setResponseTimeout(Long ResponseTimeout) {
        this.ResponseTimeout = ResponseTimeout;
    }

    /**
     * Get 返回结果中不同物料类型的比例，比例顺序需严格按照（图文，长视频，短视频，小视频）进行。只允许传[0,100]数字，多个请用**英文冒号**分割，且加起来不能超过100，以及比例数量不能超过**场景绑定的物料类型**（图文，长视频，短视频，小视频）数。**示例：**图文和短视频比例为40%:60%时，则填40:60图文和短视频比例为0%:100%时，则填0:100图文，长视频和短视频的比例为，图文占20%，剩余80%由长视频和短视频随机返回，则填20:80或仅填20均可 
     * @return ItemTypeRatio 返回结果中不同物料类型的比例，比例顺序需严格按照（图文，长视频，短视频，小视频）进行。只允许传[0,100]数字，多个请用**英文冒号**分割，且加起来不能超过100，以及比例数量不能超过**场景绑定的物料类型**（图文，长视频，短视频，小视频）数。**示例：**图文和短视频比例为40%:60%时，则填40:60图文和短视频比例为0%:100%时，则填0:100图文，长视频和短视频的比例为，图文占20%，剩余80%由长视频和短视频随机返回，则填20:80或仅填20均可
     */
    public String getItemTypeRatio() {
        return this.ItemTypeRatio;
    }

    /**
     * Set 返回结果中不同物料类型的比例，比例顺序需严格按照（图文，长视频，短视频，小视频）进行。只允许传[0,100]数字，多个请用**英文冒号**分割，且加起来不能超过100，以及比例数量不能超过**场景绑定的物料类型**（图文，长视频，短视频，小视频）数。**示例：**图文和短视频比例为40%:60%时，则填40:60图文和短视频比例为0%:100%时，则填0:100图文，长视频和短视频的比例为，图文占20%，剩余80%由长视频和短视频随机返回，则填20:80或仅填20均可
     * @param ItemTypeRatio 返回结果中不同物料类型的比例，比例顺序需严格按照（图文，长视频，短视频，小视频）进行。只允许传[0,100]数字，多个请用**英文冒号**分割，且加起来不能超过100，以及比例数量不能超过**场景绑定的物料类型**（图文，长视频，短视频，小视频）数。**示例：**图文和短视频比例为40%:60%时，则填40:60图文和短视频比例为0%:100%时，则填0:100图文，长视频和短视频的比例为，图文占20%，剩余80%由长视频和短视频随机返回，则填20:80或仅填20均可
     */
    public void setItemTypeRatio(String ItemTypeRatio) {
        this.ItemTypeRatio = ItemTypeRatio;
    }

    public RecommendContentRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecommendContentRequest(RecommendContentRequest source) {
        if (source.Bid != null) {
            this.Bid = new String(source.Bid);
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
        if (source.ItemCnt != null) {
            this.ItemCnt = new Long(source.ItemCnt);
        }
        if (source.PoolId != null) {
            this.PoolId = new String(source.PoolId);
        }
        if (source.CurrentItemId != null) {
            this.CurrentItemId = new String(source.CurrentItemId);
        }
        if (source.ResponseTimeout != null) {
            this.ResponseTimeout = new Long(source.ResponseTimeout);
        }
        if (source.ItemTypeRatio != null) {
            this.ItemTypeRatio = new String(source.ItemTypeRatio);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Bid", this.Bid);
        this.setParamSimple(map, prefix + "SceneId", this.SceneId);
        this.setParamArrayObj(map, prefix + "UserIdList.", this.UserIdList);
        this.setParamSimple(map, prefix + "RecTraceId", this.RecTraceId);
        this.setParamSimple(map, prefix + "ItemCnt", this.ItemCnt);
        this.setParamSimple(map, prefix + "PoolId", this.PoolId);
        this.setParamSimple(map, prefix + "CurrentItemId", this.CurrentItemId);
        this.setParamSimple(map, prefix + "ResponseTimeout", this.ResponseTimeout);
        this.setParamSimple(map, prefix + "ItemTypeRatio", this.ItemTypeRatio);

    }
}

