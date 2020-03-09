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
package com.tencentcloudapi.bizlive.v20190313.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSessionRequest extends AbstractModel{

    /**
    * 客户端session信息，从JSSDK请求中获得
    */
    @SerializedName("ClientSession")
    @Expose
    private String ClientSession;

    /**
    * 游戏ID
    */
    @SerializedName("GameId")
    @Expose
    private String GameId;

    /**
    * 游戏用户ID
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 游戏参数
    */
    @SerializedName("GameParas")
    @Expose
    private String GameParas;

    /**
    * 游戏区域
    */
    @SerializedName("GameRegion")
    @Expose
    private String GameRegion;

    /**
    * 背景图url
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * 分辨率
    */
    @SerializedName("Resolution")
    @Expose
    private String Resolution;

    /**
     * Get 客户端session信息，从JSSDK请求中获得 
     * @return ClientSession 客户端session信息，从JSSDK请求中获得
     */
    public String getClientSession() {
        return this.ClientSession;
    }

    /**
     * Set 客户端session信息，从JSSDK请求中获得
     * @param ClientSession 客户端session信息，从JSSDK请求中获得
     */
    public void setClientSession(String ClientSession) {
        this.ClientSession = ClientSession;
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
     * Get 游戏参数 
     * @return GameParas 游戏参数
     */
    public String getGameParas() {
        return this.GameParas;
    }

    /**
     * Set 游戏参数
     * @param GameParas 游戏参数
     */
    public void setGameParas(String GameParas) {
        this.GameParas = GameParas;
    }

    /**
     * Get 游戏区域 
     * @return GameRegion 游戏区域
     */
    public String getGameRegion() {
        return this.GameRegion;
    }

    /**
     * Set 游戏区域
     * @param GameRegion 游戏区域
     */
    public void setGameRegion(String GameRegion) {
        this.GameRegion = GameRegion;
    }

    /**
     * Get 背景图url 
     * @return ImageUrl 背景图url
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set 背景图url
     * @param ImageUrl 背景图url
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get 分辨率 
     * @return Resolution 分辨率
     */
    public String getResolution() {
        return this.Resolution;
    }

    /**
     * Set 分辨率
     * @param Resolution 分辨率
     */
    public void setResolution(String Resolution) {
        this.Resolution = Resolution;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClientSession", this.ClientSession);
        this.setParamSimple(map, prefix + "GameId", this.GameId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "GameParas", this.GameParas);
        this.setParamSimple(map, prefix + "GameRegion", this.GameRegion);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "Resolution", this.Resolution);

    }
}

