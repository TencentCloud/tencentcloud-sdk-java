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
package com.tencentcloudapi.gs.v20191118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TrylockWorkerRequest extends AbstractModel{

    /**
    * 唯一用户身份标识，由业务方自定义，平台不予理解。（可根据业务需要决定使用用户的唯一身份标识或是使用时间戳随机生成；在用户重连时应保持UserId不变）
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 游戏ID
    */
    @SerializedName("GameId")
    @Expose
    private String GameId;

    /**
    * 游戏区域，ap-guangzhou、ap-shanghai、ap-beijing等，如果不为空，优先按照该区域进行调度分配机器
    */
    @SerializedName("GameRegion")
    @Expose
    private String GameRegion;

    /**
    * 【废弃】资源池编号
    */
    @SerializedName("SetNo")
    @Expose
    private Long SetNo;

    /**
    * 【必选】用户IP，用于就近调度，不填将严重影响用户体验
    */
    @SerializedName("UserIp")
    @Expose
    private String UserIp;

    /**
    * 分组ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
     * Get 唯一用户身份标识，由业务方自定义，平台不予理解。（可根据业务需要决定使用用户的唯一身份标识或是使用时间戳随机生成；在用户重连时应保持UserId不变） 
     * @return UserId 唯一用户身份标识，由业务方自定义，平台不予理解。（可根据业务需要决定使用用户的唯一身份标识或是使用时间戳随机生成；在用户重连时应保持UserId不变）
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 唯一用户身份标识，由业务方自定义，平台不予理解。（可根据业务需要决定使用用户的唯一身份标识或是使用时间戳随机生成；在用户重连时应保持UserId不变）
     * @param UserId 唯一用户身份标识，由业务方自定义，平台不予理解。（可根据业务需要决定使用用户的唯一身份标识或是使用时间戳随机生成；在用户重连时应保持UserId不变）
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 游戏ID 
     * @return GameId 游戏ID
     */
    public String getGameId() {
        return this.GameId;
    }

    /**
     * Set 游戏ID
     * @param GameId 游戏ID
     */
    public void setGameId(String GameId) {
        this.GameId = GameId;
    }

    /**
     * Get 游戏区域，ap-guangzhou、ap-shanghai、ap-beijing等，如果不为空，优先按照该区域进行调度分配机器 
     * @return GameRegion 游戏区域，ap-guangzhou、ap-shanghai、ap-beijing等，如果不为空，优先按照该区域进行调度分配机器
     */
    public String getGameRegion() {
        return this.GameRegion;
    }

    /**
     * Set 游戏区域，ap-guangzhou、ap-shanghai、ap-beijing等，如果不为空，优先按照该区域进行调度分配机器
     * @param GameRegion 游戏区域，ap-guangzhou、ap-shanghai、ap-beijing等，如果不为空，优先按照该区域进行调度分配机器
     */
    public void setGameRegion(String GameRegion) {
        this.GameRegion = GameRegion;
    }

    /**
     * Get 【废弃】资源池编号 
     * @return SetNo 【废弃】资源池编号
     */
    public Long getSetNo() {
        return this.SetNo;
    }

    /**
     * Set 【废弃】资源池编号
     * @param SetNo 【废弃】资源池编号
     */
    public void setSetNo(Long SetNo) {
        this.SetNo = SetNo;
    }

    /**
     * Get 【必选】用户IP，用于就近调度，不填将严重影响用户体验 
     * @return UserIp 【必选】用户IP，用于就近调度，不填将严重影响用户体验
     */
    public String getUserIp() {
        return this.UserIp;
    }

    /**
     * Set 【必选】用户IP，用于就近调度，不填将严重影响用户体验
     * @param UserIp 【必选】用户IP，用于就近调度，不填将严重影响用户体验
     */
    public void setUserIp(String UserIp) {
        this.UserIp = UserIp;
    }

    /**
     * Get 分组ID 
     * @return GroupId 分组ID
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 分组ID
     * @param GroupId 分组ID
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    public TrylockWorkerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TrylockWorkerRequest(TrylockWorkerRequest source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.GameId != null) {
            this.GameId = new String(source.GameId);
        }
        if (source.GameRegion != null) {
            this.GameRegion = new String(source.GameRegion);
        }
        if (source.SetNo != null) {
            this.SetNo = new Long(source.SetNo);
        }
        if (source.UserIp != null) {
            this.UserIp = new String(source.UserIp);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "GameId", this.GameId);
        this.setParamSimple(map, prefix + "GameRegion", this.GameRegion);
        this.setParamSimple(map, prefix + "SetNo", this.SetNo);
        this.setParamSimple(map, prefix + "UserIp", this.UserIp);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);

    }
}

