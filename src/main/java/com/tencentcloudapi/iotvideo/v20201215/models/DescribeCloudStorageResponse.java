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
package com.tencentcloudapi.iotvideo.v20201215.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCloudStorageResponse extends AbstractModel{

    /**
    * 云存开启状态，1为开启，0为未开启或已过期
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 云存类型，1为全时云存，2为事件云存
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 云存套餐过期时间
    */
    @SerializedName("ExpireTime")
    @Expose
    private Long ExpireTime;

    /**
    * 云存回看时长
    */
    @SerializedName("ShiftDuration")
    @Expose
    private Long ShiftDuration;

    /**
    * 云存用户ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 云存开启状态，1为开启，0为未开启或已过期 
     * @return Status 云存开启状态，1为开启，0为未开启或已过期
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 云存开启状态，1为开启，0为未开启或已过期
     * @param Status 云存开启状态，1为开启，0为未开启或已过期
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 云存类型，1为全时云存，2为事件云存 
     * @return Type 云存类型，1为全时云存，2为事件云存
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 云存类型，1为全时云存，2为事件云存
     * @param Type 云存类型，1为全时云存，2为事件云存
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 云存套餐过期时间 
     * @return ExpireTime 云存套餐过期时间
     */
    public Long getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 云存套餐过期时间
     * @param ExpireTime 云存套餐过期时间
     */
    public void setExpireTime(Long ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 云存回看时长 
     * @return ShiftDuration 云存回看时长
     */
    public Long getShiftDuration() {
        return this.ShiftDuration;
    }

    /**
     * Set 云存回看时长
     * @param ShiftDuration 云存回看时长
     */
    public void setShiftDuration(Long ShiftDuration) {
        this.ShiftDuration = ShiftDuration;
    }

    /**
     * Get 云存用户ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserId 云存用户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 云存用户ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserId 云存用户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
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

    public DescribeCloudStorageResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCloudStorageResponse(DescribeCloudStorageResponse source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new Long(source.ExpireTime);
        }
        if (source.ShiftDuration != null) {
            this.ShiftDuration = new Long(source.ShiftDuration);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "ShiftDuration", this.ShiftDuration);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

