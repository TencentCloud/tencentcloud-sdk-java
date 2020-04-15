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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMfaCodeStatusResponse extends AbstractModel{

    /**
    * 微信mfa code状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 记住设备
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RmDevice")
    @Expose
    private Long RmDevice;

    /**
    * 临时Code
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tmpcode")
    @Expose
    private String Tmpcode;

    /**
    * 昵称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Nickname")
    @Expose
    private String Nickname;

    /**
    * 是否有OpenId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HasOpenId")
    @Expose
    private Long HasOpenId;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 微信mfa code状态 
     * @return Status 微信mfa code状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 微信mfa code状态
     * @param Status 微信mfa code状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 记住设备
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RmDevice 记住设备
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRmDevice() {
        return this.RmDevice;
    }

    /**
     * Set 记住设备
注意：此字段可能返回 null，表示取不到有效值。
     * @param RmDevice 记住设备
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRmDevice(Long RmDevice) {
        this.RmDevice = RmDevice;
    }

    /**
     * Get 临时Code
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tmpcode 临时Code
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTmpcode() {
        return this.Tmpcode;
    }

    /**
     * Set 临时Code
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tmpcode 临时Code
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTmpcode(String Tmpcode) {
        this.Tmpcode = Tmpcode;
    }

    /**
     * Get 昵称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Nickname 昵称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNickname() {
        return this.Nickname;
    }

    /**
     * Set 昵称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Nickname 昵称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
    }

    /**
     * Get 是否有OpenId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HasOpenId 是否有OpenId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHasOpenId() {
        return this.HasOpenId;
    }

    /**
     * Set 是否有OpenId
注意：此字段可能返回 null，表示取不到有效值。
     * @param HasOpenId 是否有OpenId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHasOpenId(Long HasOpenId) {
        this.HasOpenId = HasOpenId;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RmDevice", this.RmDevice);
        this.setParamSimple(map, prefix + "Tmpcode", this.Tmpcode);
        this.setParamSimple(map, prefix + "Nickname", this.Nickname);
        this.setParamSimple(map, prefix + "HasOpenId", this.HasOpenId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

