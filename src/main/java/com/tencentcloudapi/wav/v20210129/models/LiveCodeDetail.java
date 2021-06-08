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
package com.tencentcloudapi.wav.v20210129.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LiveCodeDetail extends AbstractModel{

    /**
    * 活码id
    */
    @SerializedName("LiveCodeId")
    @Expose
    private Long LiveCodeId;

    /**
    * 活码名称
    */
    @SerializedName("LiveCodeName")
    @Expose
    private String LiveCodeName;

    /**
    * 短链url
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShortChainAddress")
    @Expose
    private String ShortChainAddress;

    /**
    * 活码二维码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LiveCodePreview")
    @Expose
    private String LiveCodePreview;

    /**
    * 活动id
    */
    @SerializedName("ActivityId")
    @Expose
    private Long ActivityId;

    /**
    * 活动名称
    */
    @SerializedName("ActivityName")
    @Expose
    private String ActivityName;

    /**
    * 活码状态，-1：删除，0：启用，1禁用，默认为0
    */
    @SerializedName("LiveCodeState")
    @Expose
    private Long LiveCodeState;

    /**
    * 活码参数，每个活码参数都是不一样的， 这个的值对应的是字符串json类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LiveCodeData")
    @Expose
    private String LiveCodeData;

    /**
    * 创建时间戳，单位为秒
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 更新时间戳，单位为秒
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
     * Get 活码id 
     * @return LiveCodeId 活码id
     */
    public Long getLiveCodeId() {
        return this.LiveCodeId;
    }

    /**
     * Set 活码id
     * @param LiveCodeId 活码id
     */
    public void setLiveCodeId(Long LiveCodeId) {
        this.LiveCodeId = LiveCodeId;
    }

    /**
     * Get 活码名称 
     * @return LiveCodeName 活码名称
     */
    public String getLiveCodeName() {
        return this.LiveCodeName;
    }

    /**
     * Set 活码名称
     * @param LiveCodeName 活码名称
     */
    public void setLiveCodeName(String LiveCodeName) {
        this.LiveCodeName = LiveCodeName;
    }

    /**
     * Get 短链url
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShortChainAddress 短链url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getShortChainAddress() {
        return this.ShortChainAddress;
    }

    /**
     * Set 短链url
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShortChainAddress 短链url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShortChainAddress(String ShortChainAddress) {
        this.ShortChainAddress = ShortChainAddress;
    }

    /**
     * Get 活码二维码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LiveCodePreview 活码二维码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLiveCodePreview() {
        return this.LiveCodePreview;
    }

    /**
     * Set 活码二维码
注意：此字段可能返回 null，表示取不到有效值。
     * @param LiveCodePreview 活码二维码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLiveCodePreview(String LiveCodePreview) {
        this.LiveCodePreview = LiveCodePreview;
    }

    /**
     * Get 活动id 
     * @return ActivityId 活动id
     */
    public Long getActivityId() {
        return this.ActivityId;
    }

    /**
     * Set 活动id
     * @param ActivityId 活动id
     */
    public void setActivityId(Long ActivityId) {
        this.ActivityId = ActivityId;
    }

    /**
     * Get 活动名称 
     * @return ActivityName 活动名称
     */
    public String getActivityName() {
        return this.ActivityName;
    }

    /**
     * Set 活动名称
     * @param ActivityName 活动名称
     */
    public void setActivityName(String ActivityName) {
        this.ActivityName = ActivityName;
    }

    /**
     * Get 活码状态，-1：删除，0：启用，1禁用，默认为0 
     * @return LiveCodeState 活码状态，-1：删除，0：启用，1禁用，默认为0
     */
    public Long getLiveCodeState() {
        return this.LiveCodeState;
    }

    /**
     * Set 活码状态，-1：删除，0：启用，1禁用，默认为0
     * @param LiveCodeState 活码状态，-1：删除，0：启用，1禁用，默认为0
     */
    public void setLiveCodeState(Long LiveCodeState) {
        this.LiveCodeState = LiveCodeState;
    }

    /**
     * Get 活码参数，每个活码参数都是不一样的， 这个的值对应的是字符串json类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LiveCodeData 活码参数，每个活码参数都是不一样的， 这个的值对应的是字符串json类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLiveCodeData() {
        return this.LiveCodeData;
    }

    /**
     * Set 活码参数，每个活码参数都是不一样的， 这个的值对应的是字符串json类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param LiveCodeData 活码参数，每个活码参数都是不一样的， 这个的值对应的是字符串json类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLiveCodeData(String LiveCodeData) {
        this.LiveCodeData = LiveCodeData;
    }

    /**
     * Get 创建时间戳，单位为秒 
     * @return CreateTime 创建时间戳，单位为秒
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间戳，单位为秒
     * @param CreateTime 创建时间戳，单位为秒
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间戳，单位为秒 
     * @return UpdateTime 更新时间戳，单位为秒
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间戳，单位为秒
     * @param UpdateTime 更新时间戳，单位为秒
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public LiveCodeDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LiveCodeDetail(LiveCodeDetail source) {
        if (source.LiveCodeId != null) {
            this.LiveCodeId = new Long(source.LiveCodeId);
        }
        if (source.LiveCodeName != null) {
            this.LiveCodeName = new String(source.LiveCodeName);
        }
        if (source.ShortChainAddress != null) {
            this.ShortChainAddress = new String(source.ShortChainAddress);
        }
        if (source.LiveCodePreview != null) {
            this.LiveCodePreview = new String(source.LiveCodePreview);
        }
        if (source.ActivityId != null) {
            this.ActivityId = new Long(source.ActivityId);
        }
        if (source.ActivityName != null) {
            this.ActivityName = new String(source.ActivityName);
        }
        if (source.LiveCodeState != null) {
            this.LiveCodeState = new Long(source.LiveCodeState);
        }
        if (source.LiveCodeData != null) {
            this.LiveCodeData = new String(source.LiveCodeData);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LiveCodeId", this.LiveCodeId);
        this.setParamSimple(map, prefix + "LiveCodeName", this.LiveCodeName);
        this.setParamSimple(map, prefix + "ShortChainAddress", this.ShortChainAddress);
        this.setParamSimple(map, prefix + "LiveCodePreview", this.LiveCodePreview);
        this.setParamSimple(map, prefix + "ActivityId", this.ActivityId);
        this.setParamSimple(map, prefix + "ActivityName", this.ActivityName);
        this.setParamSimple(map, prefix + "LiveCodeState", this.LiveCodeState);
        this.setParamSimple(map, prefix + "LiveCodeData", this.LiveCodeData);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

