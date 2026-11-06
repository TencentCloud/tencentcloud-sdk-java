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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TRTCVoicePrintItem extends AbstractModel {

    /**
    * 声纹 ID，36 位 UUID（含连字符）。对 (AppId, SdkAppId) 维度内唯一。
示例值：59d83c76-8f4e-4a1b-9c2d-0e7f8a6b5c4d
    */
    @SerializedName("VoicePrintId")
    @Expose
    private String VoicePrintId;

    /**
    * 业务方自定义的说话人标识，长度不超过 128 字节，由客户在注册声纹时传入。同一 SpeakerId 可对应多条声纹。
示例值：user_12345
    */
    @SerializedName("SpeakerId")
    @Expose
    private String SpeakerId;

    /**
    * 声纹注册时间，ISO8601 格式，UTC 时区。
示例值：2025-04-24T10:20:30Z
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 声纹最近一次更新时间，ISO8601 格式，UTC 时区。未被更新过时等于 CreateTime。
示例值：2025-04-24T10:20:30Z
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 声纹 ID，36 位 UUID（含连字符）。对 (AppId, SdkAppId) 维度内唯一。
示例值：59d83c76-8f4e-4a1b-9c2d-0e7f8a6b5c4d 
     * @return VoicePrintId 声纹 ID，36 位 UUID（含连字符）。对 (AppId, SdkAppId) 维度内唯一。
示例值：59d83c76-8f4e-4a1b-9c2d-0e7f8a6b5c4d
     */
    public String getVoicePrintId() {
        return this.VoicePrintId;
    }

    /**
     * Set 声纹 ID，36 位 UUID（含连字符）。对 (AppId, SdkAppId) 维度内唯一。
示例值：59d83c76-8f4e-4a1b-9c2d-0e7f8a6b5c4d
     * @param VoicePrintId 声纹 ID，36 位 UUID（含连字符）。对 (AppId, SdkAppId) 维度内唯一。
示例值：59d83c76-8f4e-4a1b-9c2d-0e7f8a6b5c4d
     */
    public void setVoicePrintId(String VoicePrintId) {
        this.VoicePrintId = VoicePrintId;
    }

    /**
     * Get 业务方自定义的说话人标识，长度不超过 128 字节，由客户在注册声纹时传入。同一 SpeakerId 可对应多条声纹。
示例值：user_12345 
     * @return SpeakerId 业务方自定义的说话人标识，长度不超过 128 字节，由客户在注册声纹时传入。同一 SpeakerId 可对应多条声纹。
示例值：user_12345
     */
    public String getSpeakerId() {
        return this.SpeakerId;
    }

    /**
     * Set 业务方自定义的说话人标识，长度不超过 128 字节，由客户在注册声纹时传入。同一 SpeakerId 可对应多条声纹。
示例值：user_12345
     * @param SpeakerId 业务方自定义的说话人标识，长度不超过 128 字节，由客户在注册声纹时传入。同一 SpeakerId 可对应多条声纹。
示例值：user_12345
     */
    public void setSpeakerId(String SpeakerId) {
        this.SpeakerId = SpeakerId;
    }

    /**
     * Get 声纹注册时间，ISO8601 格式，UTC 时区。
示例值：2025-04-24T10:20:30Z 
     * @return CreateTime 声纹注册时间，ISO8601 格式，UTC 时区。
示例值：2025-04-24T10:20:30Z
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 声纹注册时间，ISO8601 格式，UTC 时区。
示例值：2025-04-24T10:20:30Z
     * @param CreateTime 声纹注册时间，ISO8601 格式，UTC 时区。
示例值：2025-04-24T10:20:30Z
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 声纹最近一次更新时间，ISO8601 格式，UTC 时区。未被更新过时等于 CreateTime。
示例值：2025-04-24T10:20:30Z 
     * @return UpdateTime 声纹最近一次更新时间，ISO8601 格式，UTC 时区。未被更新过时等于 CreateTime。
示例值：2025-04-24T10:20:30Z
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 声纹最近一次更新时间，ISO8601 格式，UTC 时区。未被更新过时等于 CreateTime。
示例值：2025-04-24T10:20:30Z
     * @param UpdateTime 声纹最近一次更新时间，ISO8601 格式，UTC 时区。未被更新过时等于 CreateTime。
示例值：2025-04-24T10:20:30Z
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public TRTCVoicePrintItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TRTCVoicePrintItem(TRTCVoicePrintItem source) {
        if (source.VoicePrintId != null) {
            this.VoicePrintId = new String(source.VoicePrintId);
        }
        if (source.SpeakerId != null) {
            this.SpeakerId = new String(source.SpeakerId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VoicePrintId", this.VoicePrintId);
        this.setParamSimple(map, prefix + "SpeakerId", this.SpeakerId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

