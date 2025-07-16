/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.ctem.v20231128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DisplayFakeWechatOfficial extends AbstractModel {

    /**
    * 主键ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 公共字段
    */
    @SerializedName("DisplayToolCommon")
    @Expose
    private DisplayToolCommon DisplayToolCommon;

    /**
    * 仿冒公众号名称
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

    /**
    * 公众号ID
    */
    @SerializedName("WechatId")
    @Expose
    private String WechatId;

    /**
    * 头像
    */
    @SerializedName("Avatar")
    @Expose
    private String Avatar;

    /**
    * 二维码
    */
    @SerializedName("QrCode")
    @Expose
    private String QrCode;

    /**
    * 处置状态：0-待处理 1-处理中 2-已处理
    */
    @SerializedName("HandlingStatus")
    @Expose
    private Long HandlingStatus;

    /**
    * 关停状态：0-(默认状态) 1-关停审核中 2-已拦截 3-已拒绝 4-下线流程中 5-已下线 6-下线失败
    */
    @SerializedName("ShutdownStatus")
    @Expose
    private Long ShutdownStatus;

    /**
    * 关停时间
    */
    @SerializedName("ShutdownTime")
    @Expose
    private String ShutdownTime;

    /**
     * Get 主键ID 
     * @return Id 主键ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 主键ID
     * @param Id 主键ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 公共字段 
     * @return DisplayToolCommon 公共字段
     */
    public DisplayToolCommon getDisplayToolCommon() {
        return this.DisplayToolCommon;
    }

    /**
     * Set 公共字段
     * @param DisplayToolCommon 公共字段
     */
    public void setDisplayToolCommon(DisplayToolCommon DisplayToolCommon) {
        this.DisplayToolCommon = DisplayToolCommon;
    }

    /**
     * Get 仿冒公众号名称 
     * @return AccountName 仿冒公众号名称
     */
    public String getAccountName() {
        return this.AccountName;
    }

    /**
     * Set 仿冒公众号名称
     * @param AccountName 仿冒公众号名称
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    /**
     * Get 公众号ID 
     * @return WechatId 公众号ID
     */
    public String getWechatId() {
        return this.WechatId;
    }

    /**
     * Set 公众号ID
     * @param WechatId 公众号ID
     */
    public void setWechatId(String WechatId) {
        this.WechatId = WechatId;
    }

    /**
     * Get 头像 
     * @return Avatar 头像
     */
    public String getAvatar() {
        return this.Avatar;
    }

    /**
     * Set 头像
     * @param Avatar 头像
     */
    public void setAvatar(String Avatar) {
        this.Avatar = Avatar;
    }

    /**
     * Get 二维码 
     * @return QrCode 二维码
     */
    public String getQrCode() {
        return this.QrCode;
    }

    /**
     * Set 二维码
     * @param QrCode 二维码
     */
    public void setQrCode(String QrCode) {
        this.QrCode = QrCode;
    }

    /**
     * Get 处置状态：0-待处理 1-处理中 2-已处理 
     * @return HandlingStatus 处置状态：0-待处理 1-处理中 2-已处理
     */
    public Long getHandlingStatus() {
        return this.HandlingStatus;
    }

    /**
     * Set 处置状态：0-待处理 1-处理中 2-已处理
     * @param HandlingStatus 处置状态：0-待处理 1-处理中 2-已处理
     */
    public void setHandlingStatus(Long HandlingStatus) {
        this.HandlingStatus = HandlingStatus;
    }

    /**
     * Get 关停状态：0-(默认状态) 1-关停审核中 2-已拦截 3-已拒绝 4-下线流程中 5-已下线 6-下线失败 
     * @return ShutdownStatus 关停状态：0-(默认状态) 1-关停审核中 2-已拦截 3-已拒绝 4-下线流程中 5-已下线 6-下线失败
     */
    public Long getShutdownStatus() {
        return this.ShutdownStatus;
    }

    /**
     * Set 关停状态：0-(默认状态) 1-关停审核中 2-已拦截 3-已拒绝 4-下线流程中 5-已下线 6-下线失败
     * @param ShutdownStatus 关停状态：0-(默认状态) 1-关停审核中 2-已拦截 3-已拒绝 4-下线流程中 5-已下线 6-下线失败
     */
    public void setShutdownStatus(Long ShutdownStatus) {
        this.ShutdownStatus = ShutdownStatus;
    }

    /**
     * Get 关停时间 
     * @return ShutdownTime 关停时间
     */
    public String getShutdownTime() {
        return this.ShutdownTime;
    }

    /**
     * Set 关停时间
     * @param ShutdownTime 关停时间
     */
    public void setShutdownTime(String ShutdownTime) {
        this.ShutdownTime = ShutdownTime;
    }

    public DisplayFakeWechatOfficial() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DisplayFakeWechatOfficial(DisplayFakeWechatOfficial source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.DisplayToolCommon != null) {
            this.DisplayToolCommon = new DisplayToolCommon(source.DisplayToolCommon);
        }
        if (source.AccountName != null) {
            this.AccountName = new String(source.AccountName);
        }
        if (source.WechatId != null) {
            this.WechatId = new String(source.WechatId);
        }
        if (source.Avatar != null) {
            this.Avatar = new String(source.Avatar);
        }
        if (source.QrCode != null) {
            this.QrCode = new String(source.QrCode);
        }
        if (source.HandlingStatus != null) {
            this.HandlingStatus = new Long(source.HandlingStatus);
        }
        if (source.ShutdownStatus != null) {
            this.ShutdownStatus = new Long(source.ShutdownStatus);
        }
        if (source.ShutdownTime != null) {
            this.ShutdownTime = new String(source.ShutdownTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamObj(map, prefix + "DisplayToolCommon.", this.DisplayToolCommon);
        this.setParamSimple(map, prefix + "AccountName", this.AccountName);
        this.setParamSimple(map, prefix + "WechatId", this.WechatId);
        this.setParamSimple(map, prefix + "Avatar", this.Avatar);
        this.setParamSimple(map, prefix + "QrCode", this.QrCode);
        this.setParamSimple(map, prefix + "HandlingStatus", this.HandlingStatus);
        this.setParamSimple(map, prefix + "ShutdownStatus", this.ShutdownStatus);
        this.setParamSimple(map, prefix + "ShutdownTime", this.ShutdownTime);

    }
}

