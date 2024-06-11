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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuthToken extends AbstractModel {

    /**
    * 认证Token
    */
    @SerializedName("Token")
    @Expose
    private String Token;

    /**
    * 服务器时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CurrentTime")
    @Expose
    private Long CurrentTime;

    /**
    * 毫秒时间戳，根据轮转周期准确计算得到
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NextRotationTime")
    @Expose
    private Long NextRotationTime;

    /**
    * 毫秒，如果轮转失败则为 -1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastRotationTimeCost")
    @Expose
    private Long LastRotationTimeCost;

    /**
    * 成功：success
失败：failed
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RotationStatus")
    @Expose
    private String RotationStatus;

    /**
    * 成功：success
失败：失败信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RotationMessage")
    @Expose
    private String RotationMessage;

    /**
     * Get 认证Token 
     * @return Token 认证Token
     */
    public String getToken() {
        return this.Token;
    }

    /**
     * Set 认证Token
     * @param Token 认证Token
     */
    public void setToken(String Token) {
        this.Token = Token;
    }

    /**
     * Get 服务器时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CurrentTime 服务器时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCurrentTime() {
        return this.CurrentTime;
    }

    /**
     * Set 服务器时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param CurrentTime 服务器时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCurrentTime(Long CurrentTime) {
        this.CurrentTime = CurrentTime;
    }

    /**
     * Get 毫秒时间戳，根据轮转周期准确计算得到
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NextRotationTime 毫秒时间戳，根据轮转周期准确计算得到
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNextRotationTime() {
        return this.NextRotationTime;
    }

    /**
     * Set 毫秒时间戳，根据轮转周期准确计算得到
注意：此字段可能返回 null，表示取不到有效值。
     * @param NextRotationTime 毫秒时间戳，根据轮转周期准确计算得到
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNextRotationTime(Long NextRotationTime) {
        this.NextRotationTime = NextRotationTime;
    }

    /**
     * Get 毫秒，如果轮转失败则为 -1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastRotationTimeCost 毫秒，如果轮转失败则为 -1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLastRotationTimeCost() {
        return this.LastRotationTimeCost;
    }

    /**
     * Set 毫秒，如果轮转失败则为 -1
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastRotationTimeCost 毫秒，如果轮转失败则为 -1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastRotationTimeCost(Long LastRotationTimeCost) {
        this.LastRotationTimeCost = LastRotationTimeCost;
    }

    /**
     * Get 成功：success
失败：failed
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RotationStatus 成功：success
失败：failed
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRotationStatus() {
        return this.RotationStatus;
    }

    /**
     * Set 成功：success
失败：failed
注意：此字段可能返回 null，表示取不到有效值。
     * @param RotationStatus 成功：success
失败：failed
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRotationStatus(String RotationStatus) {
        this.RotationStatus = RotationStatus;
    }

    /**
     * Get 成功：success
失败：失败信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RotationMessage 成功：success
失败：失败信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRotationMessage() {
        return this.RotationMessage;
    }

    /**
     * Set 成功：success
失败：失败信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param RotationMessage 成功：success
失败：失败信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRotationMessage(String RotationMessage) {
        this.RotationMessage = RotationMessage;
    }

    public AuthToken() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuthToken(AuthToken source) {
        if (source.Token != null) {
            this.Token = new String(source.Token);
        }
        if (source.CurrentTime != null) {
            this.CurrentTime = new Long(source.CurrentTime);
        }
        if (source.NextRotationTime != null) {
            this.NextRotationTime = new Long(source.NextRotationTime);
        }
        if (source.LastRotationTimeCost != null) {
            this.LastRotationTimeCost = new Long(source.LastRotationTimeCost);
        }
        if (source.RotationStatus != null) {
            this.RotationStatus = new String(source.RotationStatus);
        }
        if (source.RotationMessage != null) {
            this.RotationMessage = new String(source.RotationMessage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Token", this.Token);
        this.setParamSimple(map, prefix + "CurrentTime", this.CurrentTime);
        this.setParamSimple(map, prefix + "NextRotationTime", this.NextRotationTime);
        this.setParamSimple(map, prefix + "LastRotationTimeCost", this.LastRotationTimeCost);
        this.setParamSimple(map, prefix + "RotationStatus", this.RotationStatus);
        this.setParamSimple(map, prefix + "RotationMessage", this.RotationMessage);

    }
}

