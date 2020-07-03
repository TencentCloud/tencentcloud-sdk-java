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

public class CreateSessionRequest extends AbstractModel{

    /**
    * 客户端session信息，从JSSDK请求中获得
    */
    @SerializedName("ClientSession")
    @Expose
    private String ClientSession;

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
    * 游戏参数
    */
    @SerializedName("GameParas")
    @Expose
    private String GameParas;

    /**
    * 分辨率,，可设置为1080p或720p
    */
    @SerializedName("Resolution")
    @Expose
    private String Resolution;

    /**
    * 背景图url，格式为png或jpeg，宽高1920*1080
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * 资源池编号，1表示正式，2表示测试
    */
    @SerializedName("SetNo")
    @Expose
    private Long SetNo;

    /**
    * 单位Mbps，固定码率，后端不动态调整(MaxBitrate和MinBitrate将无效)
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
    * 单位Mbps，动态调整最大码率
    */
    @SerializedName("MaxBitrate")
    @Expose
    private Long MaxBitrate;

    /**
    * 单位Mbps，动态调整最小码率
    */
    @SerializedName("MinBitrate")
    @Expose
    private Long MinBitrate;

    /**
    * 帧率，可设置为30、45或60
    */
    @SerializedName("Fps")
    @Expose
    private Long Fps;

    /**
    * 游戏用户IP，用于就近调度，例如125.127.178.228
    */
    @SerializedName("UserIp")
    @Expose
    private String UserIp;

    /**
    * 优化项，便于客户灰度开启新的优化项，默认为0
    */
    @SerializedName("Optimization")
    @Expose
    private Long Optimization;

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
     * Get 分辨率,，可设置为1080p或720p 
     * @return Resolution 分辨率,，可设置为1080p或720p
     */
    public String getResolution() {
        return this.Resolution;
    }

    /**
     * Set 分辨率,，可设置为1080p或720p
     * @param Resolution 分辨率,，可设置为1080p或720p
     */
    public void setResolution(String Resolution) {
        this.Resolution = Resolution;
    }

    /**
     * Get 背景图url，格式为png或jpeg，宽高1920*1080 
     * @return ImageUrl 背景图url，格式为png或jpeg，宽高1920*1080
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set 背景图url，格式为png或jpeg，宽高1920*1080
     * @param ImageUrl 背景图url，格式为png或jpeg，宽高1920*1080
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get 资源池编号，1表示正式，2表示测试 
     * @return SetNo 资源池编号，1表示正式，2表示测试
     */
    public Long getSetNo() {
        return this.SetNo;
    }

    /**
     * Set 资源池编号，1表示正式，2表示测试
     * @param SetNo 资源池编号，1表示正式，2表示测试
     */
    public void setSetNo(Long SetNo) {
        this.SetNo = SetNo;
    }

    /**
     * Get 单位Mbps，固定码率，后端不动态调整(MaxBitrate和MinBitrate将无效) 
     * @return Bitrate 单位Mbps，固定码率，后端不动态调整(MaxBitrate和MinBitrate将无效)
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set 单位Mbps，固定码率，后端不动态调整(MaxBitrate和MinBitrate将无效)
     * @param Bitrate 单位Mbps，固定码率，后端不动态调整(MaxBitrate和MinBitrate将无效)
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    /**
     * Get 单位Mbps，动态调整最大码率 
     * @return MaxBitrate 单位Mbps，动态调整最大码率
     */
    public Long getMaxBitrate() {
        return this.MaxBitrate;
    }

    /**
     * Set 单位Mbps，动态调整最大码率
     * @param MaxBitrate 单位Mbps，动态调整最大码率
     */
    public void setMaxBitrate(Long MaxBitrate) {
        this.MaxBitrate = MaxBitrate;
    }

    /**
     * Get 单位Mbps，动态调整最小码率 
     * @return MinBitrate 单位Mbps，动态调整最小码率
     */
    public Long getMinBitrate() {
        return this.MinBitrate;
    }

    /**
     * Set 单位Mbps，动态调整最小码率
     * @param MinBitrate 单位Mbps，动态调整最小码率
     */
    public void setMinBitrate(Long MinBitrate) {
        this.MinBitrate = MinBitrate;
    }

    /**
     * Get 帧率，可设置为30、45或60 
     * @return Fps 帧率，可设置为30、45或60
     */
    public Long getFps() {
        return this.Fps;
    }

    /**
     * Set 帧率，可设置为30、45或60
     * @param Fps 帧率，可设置为30、45或60
     */
    public void setFps(Long Fps) {
        this.Fps = Fps;
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
     * Get 优化项，便于客户灰度开启新的优化项，默认为0 
     * @return Optimization 优化项，便于客户灰度开启新的优化项，默认为0
     */
    public Long getOptimization() {
        return this.Optimization;
    }

    /**
     * Set 优化项，便于客户灰度开启新的优化项，默认为0
     * @param Optimization 优化项，便于客户灰度开启新的优化项，默认为0
     */
    public void setOptimization(Long Optimization) {
        this.Optimization = Optimization;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClientSession", this.ClientSession);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "GameId", this.GameId);
        this.setParamSimple(map, prefix + "GameRegion", this.GameRegion);
        this.setParamSimple(map, prefix + "GameParas", this.GameParas);
        this.setParamSimple(map, prefix + "Resolution", this.Resolution);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "SetNo", this.SetNo);
        this.setParamSimple(map, prefix + "Bitrate", this.Bitrate);
        this.setParamSimple(map, prefix + "MaxBitrate", this.MaxBitrate);
        this.setParamSimple(map, prefix + "MinBitrate", this.MinBitrate);
        this.setParamSimple(map, prefix + "Fps", this.Fps);
        this.setParamSimple(map, prefix + "UserIp", this.UserIp);
        this.setParamSimple(map, prefix + "Optimization", this.Optimization);

    }
}

