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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeStreamAuthData extends AbstractModel{

    /**
    * 鉴权配置ID（uuid）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 是否开播放鉴权（1:开启,0:关闭）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PullState")
    @Expose
    private Long PullState;

    /**
    * 播放密钥（仅支持字母数字，长度0-10位）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PullSecret")
    @Expose
    private String PullSecret;

    /**
    * 播放过期时间（单位：分钟）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PullExpired")
    @Expose
    private Long PullExpired;

    /**
    * 是否开启推流鉴权（1:开启,0:关闭）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PushState")
    @Expose
    private Long PushState;

    /**
    * 推流密钥（仅支持字母数字，长度0-10位）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PushSecret")
    @Expose
    private String PushSecret;

    /**
    * 推流过期时间（单位：分钟）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PushExpired")
    @Expose
    private Long PushExpired;

    /**
    * 用户ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
     * Get 鉴权配置ID（uuid）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 鉴权配置ID（uuid）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 鉴权配置ID（uuid）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 鉴权配置ID（uuid）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 是否开播放鉴权（1:开启,0:关闭）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PullState 是否开播放鉴权（1:开启,0:关闭）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPullState() {
        return this.PullState;
    }

    /**
     * Set 是否开播放鉴权（1:开启,0:关闭）
注意：此字段可能返回 null，表示取不到有效值。
     * @param PullState 是否开播放鉴权（1:开启,0:关闭）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPullState(Long PullState) {
        this.PullState = PullState;
    }

    /**
     * Get 播放密钥（仅支持字母数字，长度0-10位）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PullSecret 播放密钥（仅支持字母数字，长度0-10位）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPullSecret() {
        return this.PullSecret;
    }

    /**
     * Set 播放密钥（仅支持字母数字，长度0-10位）
注意：此字段可能返回 null，表示取不到有效值。
     * @param PullSecret 播放密钥（仅支持字母数字，长度0-10位）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPullSecret(String PullSecret) {
        this.PullSecret = PullSecret;
    }

    /**
     * Get 播放过期时间（单位：分钟）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PullExpired 播放过期时间（单位：分钟）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPullExpired() {
        return this.PullExpired;
    }

    /**
     * Set 播放过期时间（单位：分钟）
注意：此字段可能返回 null，表示取不到有效值。
     * @param PullExpired 播放过期时间（单位：分钟）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPullExpired(Long PullExpired) {
        this.PullExpired = PullExpired;
    }

    /**
     * Get 是否开启推流鉴权（1:开启,0:关闭）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PushState 是否开启推流鉴权（1:开启,0:关闭）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPushState() {
        return this.PushState;
    }

    /**
     * Set 是否开启推流鉴权（1:开启,0:关闭）
注意：此字段可能返回 null，表示取不到有效值。
     * @param PushState 是否开启推流鉴权（1:开启,0:关闭）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPushState(Long PushState) {
        this.PushState = PushState;
    }

    /**
     * Get 推流密钥（仅支持字母数字，长度0-10位）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PushSecret 推流密钥（仅支持字母数字，长度0-10位）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPushSecret() {
        return this.PushSecret;
    }

    /**
     * Set 推流密钥（仅支持字母数字，长度0-10位）
注意：此字段可能返回 null，表示取不到有效值。
     * @param PushSecret 推流密钥（仅支持字母数字，长度0-10位）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPushSecret(String PushSecret) {
        this.PushSecret = PushSecret;
    }

    /**
     * Get 推流过期时间（单位：分钟）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PushExpired 推流过期时间（单位：分钟）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPushExpired() {
        return this.PushExpired;
    }

    /**
     * Set 推流过期时间（单位：分钟）
注意：此字段可能返回 null，表示取不到有效值。
     * @param PushExpired 推流过期时间（单位：分钟）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPushExpired(Long PushExpired) {
        this.PushExpired = PushExpired;
    }

    /**
     * Get 用户ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppId 用户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 用户ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppId 用户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    public DescribeStreamAuthData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeStreamAuthData(DescribeStreamAuthData source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.PullState != null) {
            this.PullState = new Long(source.PullState);
        }
        if (source.PullSecret != null) {
            this.PullSecret = new String(source.PullSecret);
        }
        if (source.PullExpired != null) {
            this.PullExpired = new Long(source.PullExpired);
        }
        if (source.PushState != null) {
            this.PushState = new Long(source.PushState);
        }
        if (source.PushSecret != null) {
            this.PushSecret = new String(source.PushSecret);
        }
        if (source.PushExpired != null) {
            this.PushExpired = new Long(source.PushExpired);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "PullState", this.PullState);
        this.setParamSimple(map, prefix + "PullSecret", this.PullSecret);
        this.setParamSimple(map, prefix + "PullExpired", this.PullExpired);
        this.setParamSimple(map, prefix + "PushState", this.PushState);
        this.setParamSimple(map, prefix + "PushSecret", this.PushSecret);
        this.setParamSimple(map, prefix + "PushExpired", this.PushExpired);
        this.setParamSimple(map, prefix + "AppId", this.AppId);

    }
}

