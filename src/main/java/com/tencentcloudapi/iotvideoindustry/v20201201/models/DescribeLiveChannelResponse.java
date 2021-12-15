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
package com.tencentcloudapi.iotvideoindustry.v20201201.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLiveChannelResponse extends AbstractModel{

    /**
    * 频道ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LiveChannelId")
    @Expose
    private String LiveChannelId;

    /**
    * 频道名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LiveChannelName")
    @Expose
    private String LiveChannelName;

    /**
    * 直播频道类型 1：固定直播；2：移动直播
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LiveChannelType")
    @Expose
    private Long LiveChannelType;

    /**
    * 通道直播状态：1: 未推流，2: 推流中
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LiveStatus")
    @Expose
    private Long LiveStatus;

    /**
    * 推流地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PushStreamAddress")
    @Expose
    private String PushStreamAddress;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String [] CreateTime;

    /**
    * 修改时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String [] UpdateTime;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 频道ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LiveChannelId 频道ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLiveChannelId() {
        return this.LiveChannelId;
    }

    /**
     * Set 频道ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param LiveChannelId 频道ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLiveChannelId(String LiveChannelId) {
        this.LiveChannelId = LiveChannelId;
    }

    /**
     * Get 频道名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LiveChannelName 频道名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLiveChannelName() {
        return this.LiveChannelName;
    }

    /**
     * Set 频道名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param LiveChannelName 频道名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLiveChannelName(String LiveChannelName) {
        this.LiveChannelName = LiveChannelName;
    }

    /**
     * Get 直播频道类型 1：固定直播；2：移动直播
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LiveChannelType 直播频道类型 1：固定直播；2：移动直播
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLiveChannelType() {
        return this.LiveChannelType;
    }

    /**
     * Set 直播频道类型 1：固定直播；2：移动直播
注意：此字段可能返回 null，表示取不到有效值。
     * @param LiveChannelType 直播频道类型 1：固定直播；2：移动直播
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLiveChannelType(Long LiveChannelType) {
        this.LiveChannelType = LiveChannelType;
    }

    /**
     * Get 通道直播状态：1: 未推流，2: 推流中
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LiveStatus 通道直播状态：1: 未推流，2: 推流中
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLiveStatus() {
        return this.LiveStatus;
    }

    /**
     * Set 通道直播状态：1: 未推流，2: 推流中
注意：此字段可能返回 null，表示取不到有效值。
     * @param LiveStatus 通道直播状态：1: 未推流，2: 推流中
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLiveStatus(Long LiveStatus) {
        this.LiveStatus = LiveStatus;
    }

    /**
     * Get 推流地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PushStreamAddress 推流地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPushStreamAddress() {
        return this.PushStreamAddress;
    }

    /**
     * Set 推流地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param PushStreamAddress 推流地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPushStreamAddress(String PushStreamAddress) {
        this.PushStreamAddress = PushStreamAddress;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String [] CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 修改时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String [] UpdateTime) {
        this.UpdateTime = UpdateTime;
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

    public DescribeLiveChannelResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLiveChannelResponse(DescribeLiveChannelResponse source) {
        if (source.LiveChannelId != null) {
            this.LiveChannelId = new String(source.LiveChannelId);
        }
        if (source.LiveChannelName != null) {
            this.LiveChannelName = new String(source.LiveChannelName);
        }
        if (source.LiveChannelType != null) {
            this.LiveChannelType = new Long(source.LiveChannelType);
        }
        if (source.LiveStatus != null) {
            this.LiveStatus = new Long(source.LiveStatus);
        }
        if (source.PushStreamAddress != null) {
            this.PushStreamAddress = new String(source.PushStreamAddress);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String[source.CreateTime.length];
            for (int i = 0; i < source.CreateTime.length; i++) {
                this.CreateTime[i] = new String(source.CreateTime[i]);
            }
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String[source.UpdateTime.length];
            for (int i = 0; i < source.UpdateTime.length; i++) {
                this.UpdateTime[i] = new String(source.UpdateTime[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LiveChannelId", this.LiveChannelId);
        this.setParamSimple(map, prefix + "LiveChannelName", this.LiveChannelName);
        this.setParamSimple(map, prefix + "LiveChannelType", this.LiveChannelType);
        this.setParamSimple(map, prefix + "LiveStatus", this.LiveStatus);
        this.setParamSimple(map, prefix + "PushStreamAddress", this.PushStreamAddress);
        this.setParamArraySimple(map, prefix + "CreateTime.", this.CreateTime);
        this.setParamArraySimple(map, prefix + "UpdateTime.", this.UpdateTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

