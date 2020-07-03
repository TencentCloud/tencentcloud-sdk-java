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
    * 游戏用户ID
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
    * 游戏区域，ap-guangzhou、ap-shanghai、ap-beijing等
    */
    @SerializedName("GameRegion")
    @Expose
    private String GameRegion;

    /**
    * 资源池编号，1表示共用，2表示测试
    */
    @SerializedName("SetNo")
    @Expose
    private Long SetNo;

    /**
    * 游戏用户IP，用于就近调度，例如125.127.178.228
    */
    @SerializedName("UserIp")
    @Expose
    private String UserIp;

    /**
     * Get 游戏用户ID 
     * @return UserId 游戏用户ID
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 游戏用户ID
     * @param UserId 游戏用户ID
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
     * Get 游戏区域，ap-guangzhou、ap-shanghai、ap-beijing等 
     * @return GameRegion 游戏区域，ap-guangzhou、ap-shanghai、ap-beijing等
     */
    public String getGameRegion() {
        return this.GameRegion;
    }

    /**
     * Set 游戏区域，ap-guangzhou、ap-shanghai、ap-beijing等
     * @param GameRegion 游戏区域，ap-guangzhou、ap-shanghai、ap-beijing等
     */
    public void setGameRegion(String GameRegion) {
        this.GameRegion = GameRegion;
    }

    /**
     * Get 资源池编号，1表示共用，2表示测试 
     * @return SetNo 资源池编号，1表示共用，2表示测试
     */
    public Long getSetNo() {
        return this.SetNo;
    }

    /**
     * Set 资源池编号，1表示共用，2表示测试
     * @param SetNo 资源池编号，1表示共用，2表示测试
     */
    public void setSetNo(Long SetNo) {
        this.SetNo = SetNo;
    }

    /**
     * Get 游戏用户IP，用于就近调度，例如125.127.178.228 
     * @return UserIp 游戏用户IP，用于就近调度，例如125.127.178.228
     */
    public String getUserIp() {
        return this.UserIp;
    }

    /**
     * Set 游戏用户IP，用于就近调度，例如125.127.178.228
     * @param UserIp 游戏用户IP，用于就近调度，例如125.127.178.228
     */
    public void setUserIp(String UserIp) {
        this.UserIp = UserIp;
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

    }
}

