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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TalkActivationInfo extends AbstractModel {

    /**
    * 设备ID，产品ID_设备名称
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * 设备激活状态，0：激活成功；60001：激活码类型不匹配；60002：激活码数量不足；60003：设备不存在；60004：产品不存在；60005：权限不足；60006：设备已激活；60007：无效的参数；60008：系统错误；60009：产品不是码音视频类型
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * 激活错误信息
    */
    @SerializedName("ErrMessage")
    @Expose
    private String ErrMessage;

    /**
    * 过期时间，秒级时间戳
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
     * Get 设备ID，产品ID_设备名称 
     * @return DeviceId 设备ID，产品ID_设备名称
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set 设备ID，产品ID_设备名称
     * @param DeviceId 设备ID，产品ID_设备名称
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get 设备激活状态，0：激活成功；60001：激活码类型不匹配；60002：激活码数量不足；60003：设备不存在；60004：产品不存在；60005：权限不足；60006：设备已激活；60007：无效的参数；60008：系统错误；60009：产品不是码音视频类型 
     * @return ErrCode 设备激活状态，0：激活成功；60001：激活码类型不匹配；60002：激活码数量不足；60003：设备不存在；60004：产品不存在；60005：权限不足；60006：设备已激活；60007：无效的参数；60008：系统错误；60009：产品不是码音视频类型
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * Set 设备激活状态，0：激活成功；60001：激活码类型不匹配；60002：激活码数量不足；60003：设备不存在；60004：产品不存在；60005：权限不足；60006：设备已激活；60007：无效的参数；60008：系统错误；60009：产品不是码音视频类型
     * @param ErrCode 设备激活状态，0：激活成功；60001：激活码类型不匹配；60002：激活码数量不足；60003：设备不存在；60004：产品不存在；60005：权限不足；60006：设备已激活；60007：无效的参数；60008：系统错误；60009：产品不是码音视频类型
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * Get 激活错误信息 
     * @return ErrMessage 激活错误信息
     */
    public String getErrMessage() {
        return this.ErrMessage;
    }

    /**
     * Set 激活错误信息
     * @param ErrMessage 激活错误信息
     */
    public void setErrMessage(String ErrMessage) {
        this.ErrMessage = ErrMessage;
    }

    /**
     * Get 过期时间，秒级时间戳 
     * @return ExpireTime 过期时间，秒级时间戳
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 过期时间，秒级时间戳
     * @param ExpireTime 过期时间，秒级时间戳
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    public TalkActivationInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TalkActivationInfo(TalkActivationInfo source) {
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.ErrCode != null) {
            this.ErrCode = new Long(source.ErrCode);
        }
        if (source.ErrMessage != null) {
            this.ErrMessage = new String(source.ErrMessage);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "ErrMessage", this.ErrMessage);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);

    }
}

