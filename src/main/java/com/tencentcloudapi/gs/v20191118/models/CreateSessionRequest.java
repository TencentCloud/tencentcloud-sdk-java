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
    * 【已废弃】只在TrylockWorker时生效
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
    * 分辨率,，可设置为1080p或720p或1920x1080格式
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
    * 【已废弃】
    */
    @SerializedName("SetNo")
    @Expose
    private Long SetNo;

    /**
    * 单位Mbps，固定码率建议值，有一定浮动范围，后端不动态调整(MaxBitrate和MinBitrate将无效)
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
    * 单位Mbps，动态调整最大码率建议值，会按实际情况调整
    */
    @SerializedName("MaxBitrate")
    @Expose
    private Long MaxBitrate;

    /**
    * 单位Mbps，动态调整最小码率建议值，会按实际情况调整
    */
    @SerializedName("MinBitrate")
    @Expose
    private Long MinBitrate;

    /**
    * 帧率，可设置为30、45、60、90、120、144
    */
    @SerializedName("Fps")
    @Expose
    private Long Fps;

    /**
    * 【已废弃】只在TrylockWorker时生效
    */
    @SerializedName("UserIp")
    @Expose
    private String UserIp;

    /**
    * 【已废弃】优化项，便于客户灰度开启新的优化项，默认为0
    */
    @SerializedName("Optimization")
    @Expose
    private Long Optimization;

    /**
    * 【互动云游】游戏主机用户ID
    */
    @SerializedName("HostUserId")
    @Expose
    private String HostUserId;

    /**
    * 【互动云游】角色；Player表示玩家；Viewer表示观察者
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
    * 游戏相关参数
    */
    @SerializedName("GameContext")
    @Expose
    private String GameContext;

    /**
    * 云端运行模式。
RunWithoutClient：允许无客户端连接的情况下仍保持云端 App 运行
默认值（空）：要求必须有客户端连接才会保持云端 App 运行。
    */
    @SerializedName("RunMode")
    @Expose
    private String RunMode;

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
     * Get 【已废弃】只在TrylockWorker时生效 
     * @return GameRegion 【已废弃】只在TrylockWorker时生效
     */
    public String getGameRegion() {
        return this.GameRegion;
    }

    /**
     * Set 【已废弃】只在TrylockWorker时生效
     * @param GameRegion 【已废弃】只在TrylockWorker时生效
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
     * Get 分辨率,，可设置为1080p或720p或1920x1080格式 
     * @return Resolution 分辨率,，可设置为1080p或720p或1920x1080格式
     */
    public String getResolution() {
        return this.Resolution;
    }

    /**
     * Set 分辨率,，可设置为1080p或720p或1920x1080格式
     * @param Resolution 分辨率,，可设置为1080p或720p或1920x1080格式
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
     * Get 【已废弃】 
     * @return SetNo 【已废弃】
     */
    public Long getSetNo() {
        return this.SetNo;
    }

    /**
     * Set 【已废弃】
     * @param SetNo 【已废弃】
     */
    public void setSetNo(Long SetNo) {
        this.SetNo = SetNo;
    }

    /**
     * Get 单位Mbps，固定码率建议值，有一定浮动范围，后端不动态调整(MaxBitrate和MinBitrate将无效) 
     * @return Bitrate 单位Mbps，固定码率建议值，有一定浮动范围，后端不动态调整(MaxBitrate和MinBitrate将无效)
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set 单位Mbps，固定码率建议值，有一定浮动范围，后端不动态调整(MaxBitrate和MinBitrate将无效)
     * @param Bitrate 单位Mbps，固定码率建议值，有一定浮动范围，后端不动态调整(MaxBitrate和MinBitrate将无效)
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    /**
     * Get 单位Mbps，动态调整最大码率建议值，会按实际情况调整 
     * @return MaxBitrate 单位Mbps，动态调整最大码率建议值，会按实际情况调整
     */
    public Long getMaxBitrate() {
        return this.MaxBitrate;
    }

    /**
     * Set 单位Mbps，动态调整最大码率建议值，会按实际情况调整
     * @param MaxBitrate 单位Mbps，动态调整最大码率建议值，会按实际情况调整
     */
    public void setMaxBitrate(Long MaxBitrate) {
        this.MaxBitrate = MaxBitrate;
    }

    /**
     * Get 单位Mbps，动态调整最小码率建议值，会按实际情况调整 
     * @return MinBitrate 单位Mbps，动态调整最小码率建议值，会按实际情况调整
     */
    public Long getMinBitrate() {
        return this.MinBitrate;
    }

    /**
     * Set 单位Mbps，动态调整最小码率建议值，会按实际情况调整
     * @param MinBitrate 单位Mbps，动态调整最小码率建议值，会按实际情况调整
     */
    public void setMinBitrate(Long MinBitrate) {
        this.MinBitrate = MinBitrate;
    }

    /**
     * Get 帧率，可设置为30、45、60、90、120、144 
     * @return Fps 帧率，可设置为30、45、60、90、120、144
     */
    public Long getFps() {
        return this.Fps;
    }

    /**
     * Set 帧率，可设置为30、45、60、90、120、144
     * @param Fps 帧率，可设置为30、45、60、90、120、144
     */
    public void setFps(Long Fps) {
        this.Fps = Fps;
    }

    /**
     * Get 【已废弃】只在TrylockWorker时生效 
     * @return UserIp 【已废弃】只在TrylockWorker时生效
     */
    public String getUserIp() {
        return this.UserIp;
    }

    /**
     * Set 【已废弃】只在TrylockWorker时生效
     * @param UserIp 【已废弃】只在TrylockWorker时生效
     */
    public void setUserIp(String UserIp) {
        this.UserIp = UserIp;
    }

    /**
     * Get 【已废弃】优化项，便于客户灰度开启新的优化项，默认为0 
     * @return Optimization 【已废弃】优化项，便于客户灰度开启新的优化项，默认为0
     */
    public Long getOptimization() {
        return this.Optimization;
    }

    /**
     * Set 【已废弃】优化项，便于客户灰度开启新的优化项，默认为0
     * @param Optimization 【已废弃】优化项，便于客户灰度开启新的优化项，默认为0
     */
    public void setOptimization(Long Optimization) {
        this.Optimization = Optimization;
    }

    /**
     * Get 【互动云游】游戏主机用户ID 
     * @return HostUserId 【互动云游】游戏主机用户ID
     */
    public String getHostUserId() {
        return this.HostUserId;
    }

    /**
     * Set 【互动云游】游戏主机用户ID
     * @param HostUserId 【互动云游】游戏主机用户ID
     */
    public void setHostUserId(String HostUserId) {
        this.HostUserId = HostUserId;
    }

    /**
     * Get 【互动云游】角色；Player表示玩家；Viewer表示观察者 
     * @return Role 【互动云游】角色；Player表示玩家；Viewer表示观察者
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set 【互动云游】角色；Player表示玩家；Viewer表示观察者
     * @param Role 【互动云游】角色；Player表示玩家；Viewer表示观察者
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    /**
     * Get 游戏相关参数 
     * @return GameContext 游戏相关参数
     */
    public String getGameContext() {
        return this.GameContext;
    }

    /**
     * Set 游戏相关参数
     * @param GameContext 游戏相关参数
     */
    public void setGameContext(String GameContext) {
        this.GameContext = GameContext;
    }

    /**
     * Get 云端运行模式。
RunWithoutClient：允许无客户端连接的情况下仍保持云端 App 运行
默认值（空）：要求必须有客户端连接才会保持云端 App 运行。 
     * @return RunMode 云端运行模式。
RunWithoutClient：允许无客户端连接的情况下仍保持云端 App 运行
默认值（空）：要求必须有客户端连接才会保持云端 App 运行。
     */
    public String getRunMode() {
        return this.RunMode;
    }

    /**
     * Set 云端运行模式。
RunWithoutClient：允许无客户端连接的情况下仍保持云端 App 运行
默认值（空）：要求必须有客户端连接才会保持云端 App 运行。
     * @param RunMode 云端运行模式。
RunWithoutClient：允许无客户端连接的情况下仍保持云端 App 运行
默认值（空）：要求必须有客户端连接才会保持云端 App 运行。
     */
    public void setRunMode(String RunMode) {
        this.RunMode = RunMode;
    }

    public CreateSessionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSessionRequest(CreateSessionRequest source) {
        if (source.ClientSession != null) {
            this.ClientSession = new String(source.ClientSession);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.GameId != null) {
            this.GameId = new String(source.GameId);
        }
        if (source.GameRegion != null) {
            this.GameRegion = new String(source.GameRegion);
        }
        if (source.GameParas != null) {
            this.GameParas = new String(source.GameParas);
        }
        if (source.Resolution != null) {
            this.Resolution = new String(source.Resolution);
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.SetNo != null) {
            this.SetNo = new Long(source.SetNo);
        }
        if (source.Bitrate != null) {
            this.Bitrate = new Long(source.Bitrate);
        }
        if (source.MaxBitrate != null) {
            this.MaxBitrate = new Long(source.MaxBitrate);
        }
        if (source.MinBitrate != null) {
            this.MinBitrate = new Long(source.MinBitrate);
        }
        if (source.Fps != null) {
            this.Fps = new Long(source.Fps);
        }
        if (source.UserIp != null) {
            this.UserIp = new String(source.UserIp);
        }
        if (source.Optimization != null) {
            this.Optimization = new Long(source.Optimization);
        }
        if (source.HostUserId != null) {
            this.HostUserId = new String(source.HostUserId);
        }
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
        if (source.GameContext != null) {
            this.GameContext = new String(source.GameContext);
        }
        if (source.RunMode != null) {
            this.RunMode = new String(source.RunMode);
        }
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
        this.setParamSimple(map, prefix + "HostUserId", this.HostUserId);
        this.setParamSimple(map, prefix + "Role", this.Role);
        this.setParamSimple(map, prefix + "GameContext", this.GameContext);
        this.setParamSimple(map, prefix + "RunMode", this.RunMode);

    }
}

