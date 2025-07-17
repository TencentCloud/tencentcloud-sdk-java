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

public class CreateCloudModerationRequest extends AbstractModel {

    /**
    * TRTC的[SdkAppId](https://cloud.tencent.com/document/product/647/46351#sdkappid)，和TRTC的房间所对应的SdkAppId相同。
    */
    @SerializedName("SdkAppId")
    @Expose
    private Long SdkAppId;

    /**
    * TRTC的[RoomId](https://cloud.tencent.com/document/product/647/46351#roomid)，为TRTC房间所对应的RoomId。
    */
    @SerializedName("RoomId")
    @Expose
    private String RoomId;

    /**
    * 机器人的UserId，用于进房发起审核任务。【*注意】这个UserId不能与当前房间内的主播观众UserId重复。如果一个房间发起多个切片任务时，机器人的userid也不能相互重复，否则会中断前一个切片任务。建议可以把房间ID作为UserId的标识的一部分，即机器人UserId在房间内唯一。
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 机器人UserId对应的校验签名，即UserId和UserSig相当于机器人进房的登录密码，具体计算方法请参考TRTC计算UserSig的方案。
    */
    @SerializedName("UserSig")
    @Expose
    private String UserSig;

    /**
    * 云端审核控制参数。
    */
    @SerializedName("ModerationParams")
    @Expose
    private ModerationParams ModerationParams;

    /**
    * 云端审核文件上传到云存储的参数
    */
    @SerializedName("ModerationStorageParams")
    @Expose
    private ModerationStorageParams ModerationStorageParams;

    /**
    * TRTC房间号的类型。 【*注意】必须和录制的房间所对应的RoomId类型相同: 0: 字符串类型的RoomId 1: 32位整型的RoomId（默认） 示例值：1
    */
    @SerializedName("RoomIdType")
    @Expose
    private Long RoomIdType;

    /**
    * 任务ID可以调用的时效性，从成功开启任务并获得TaskID后开始计算，超时后无法调用查询、更新和停止等接口，但是切片任务不会停止。 参数的单位是小时，默认24小时（1天），最大可设置72小时（3天），最小设置6小时。举例说明：如果不设置该参数，那么开始切片成功后，查询、更新和停止切片的调用时效为24个小时。
    */
    @SerializedName("ResourceExpiredHour")
    @Expose
    private Long ResourceExpiredHour;

    /**
     * Get TRTC的[SdkAppId](https://cloud.tencent.com/document/product/647/46351#sdkappid)，和TRTC的房间所对应的SdkAppId相同。 
     * @return SdkAppId TRTC的[SdkAppId](https://cloud.tencent.com/document/product/647/46351#sdkappid)，和TRTC的房间所对应的SdkAppId相同。
     */
    public Long getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set TRTC的[SdkAppId](https://cloud.tencent.com/document/product/647/46351#sdkappid)，和TRTC的房间所对应的SdkAppId相同。
     * @param SdkAppId TRTC的[SdkAppId](https://cloud.tencent.com/document/product/647/46351#sdkappid)，和TRTC的房间所对应的SdkAppId相同。
     */
    public void setSdkAppId(Long SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get TRTC的[RoomId](https://cloud.tencent.com/document/product/647/46351#roomid)，为TRTC房间所对应的RoomId。 
     * @return RoomId TRTC的[RoomId](https://cloud.tencent.com/document/product/647/46351#roomid)，为TRTC房间所对应的RoomId。
     */
    public String getRoomId() {
        return this.RoomId;
    }

    /**
     * Set TRTC的[RoomId](https://cloud.tencent.com/document/product/647/46351#roomid)，为TRTC房间所对应的RoomId。
     * @param RoomId TRTC的[RoomId](https://cloud.tencent.com/document/product/647/46351#roomid)，为TRTC房间所对应的RoomId。
     */
    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    /**
     * Get 机器人的UserId，用于进房发起审核任务。【*注意】这个UserId不能与当前房间内的主播观众UserId重复。如果一个房间发起多个切片任务时，机器人的userid也不能相互重复，否则会中断前一个切片任务。建议可以把房间ID作为UserId的标识的一部分，即机器人UserId在房间内唯一。 
     * @return UserId 机器人的UserId，用于进房发起审核任务。【*注意】这个UserId不能与当前房间内的主播观众UserId重复。如果一个房间发起多个切片任务时，机器人的userid也不能相互重复，否则会中断前一个切片任务。建议可以把房间ID作为UserId的标识的一部分，即机器人UserId在房间内唯一。
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 机器人的UserId，用于进房发起审核任务。【*注意】这个UserId不能与当前房间内的主播观众UserId重复。如果一个房间发起多个切片任务时，机器人的userid也不能相互重复，否则会中断前一个切片任务。建议可以把房间ID作为UserId的标识的一部分，即机器人UserId在房间内唯一。
     * @param UserId 机器人的UserId，用于进房发起审核任务。【*注意】这个UserId不能与当前房间内的主播观众UserId重复。如果一个房间发起多个切片任务时，机器人的userid也不能相互重复，否则会中断前一个切片任务。建议可以把房间ID作为UserId的标识的一部分，即机器人UserId在房间内唯一。
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 机器人UserId对应的校验签名，即UserId和UserSig相当于机器人进房的登录密码，具体计算方法请参考TRTC计算UserSig的方案。 
     * @return UserSig 机器人UserId对应的校验签名，即UserId和UserSig相当于机器人进房的登录密码，具体计算方法请参考TRTC计算UserSig的方案。
     */
    public String getUserSig() {
        return this.UserSig;
    }

    /**
     * Set 机器人UserId对应的校验签名，即UserId和UserSig相当于机器人进房的登录密码，具体计算方法请参考TRTC计算UserSig的方案。
     * @param UserSig 机器人UserId对应的校验签名，即UserId和UserSig相当于机器人进房的登录密码，具体计算方法请参考TRTC计算UserSig的方案。
     */
    public void setUserSig(String UserSig) {
        this.UserSig = UserSig;
    }

    /**
     * Get 云端审核控制参数。 
     * @return ModerationParams 云端审核控制参数。
     */
    public ModerationParams getModerationParams() {
        return this.ModerationParams;
    }

    /**
     * Set 云端审核控制参数。
     * @param ModerationParams 云端审核控制参数。
     */
    public void setModerationParams(ModerationParams ModerationParams) {
        this.ModerationParams = ModerationParams;
    }

    /**
     * Get 云端审核文件上传到云存储的参数 
     * @return ModerationStorageParams 云端审核文件上传到云存储的参数
     */
    public ModerationStorageParams getModerationStorageParams() {
        return this.ModerationStorageParams;
    }

    /**
     * Set 云端审核文件上传到云存储的参数
     * @param ModerationStorageParams 云端审核文件上传到云存储的参数
     */
    public void setModerationStorageParams(ModerationStorageParams ModerationStorageParams) {
        this.ModerationStorageParams = ModerationStorageParams;
    }

    /**
     * Get TRTC房间号的类型。 【*注意】必须和录制的房间所对应的RoomId类型相同: 0: 字符串类型的RoomId 1: 32位整型的RoomId（默认） 示例值：1 
     * @return RoomIdType TRTC房间号的类型。 【*注意】必须和录制的房间所对应的RoomId类型相同: 0: 字符串类型的RoomId 1: 32位整型的RoomId（默认） 示例值：1
     */
    public Long getRoomIdType() {
        return this.RoomIdType;
    }

    /**
     * Set TRTC房间号的类型。 【*注意】必须和录制的房间所对应的RoomId类型相同: 0: 字符串类型的RoomId 1: 32位整型的RoomId（默认） 示例值：1
     * @param RoomIdType TRTC房间号的类型。 【*注意】必须和录制的房间所对应的RoomId类型相同: 0: 字符串类型的RoomId 1: 32位整型的RoomId（默认） 示例值：1
     */
    public void setRoomIdType(Long RoomIdType) {
        this.RoomIdType = RoomIdType;
    }

    /**
     * Get 任务ID可以调用的时效性，从成功开启任务并获得TaskID后开始计算，超时后无法调用查询、更新和停止等接口，但是切片任务不会停止。 参数的单位是小时，默认24小时（1天），最大可设置72小时（3天），最小设置6小时。举例说明：如果不设置该参数，那么开始切片成功后，查询、更新和停止切片的调用时效为24个小时。 
     * @return ResourceExpiredHour 任务ID可以调用的时效性，从成功开启任务并获得TaskID后开始计算，超时后无法调用查询、更新和停止等接口，但是切片任务不会停止。 参数的单位是小时，默认24小时（1天），最大可设置72小时（3天），最小设置6小时。举例说明：如果不设置该参数，那么开始切片成功后，查询、更新和停止切片的调用时效为24个小时。
     */
    public Long getResourceExpiredHour() {
        return this.ResourceExpiredHour;
    }

    /**
     * Set 任务ID可以调用的时效性，从成功开启任务并获得TaskID后开始计算，超时后无法调用查询、更新和停止等接口，但是切片任务不会停止。 参数的单位是小时，默认24小时（1天），最大可设置72小时（3天），最小设置6小时。举例说明：如果不设置该参数，那么开始切片成功后，查询、更新和停止切片的调用时效为24个小时。
     * @param ResourceExpiredHour 任务ID可以调用的时效性，从成功开启任务并获得TaskID后开始计算，超时后无法调用查询、更新和停止等接口，但是切片任务不会停止。 参数的单位是小时，默认24小时（1天），最大可设置72小时（3天），最小设置6小时。举例说明：如果不设置该参数，那么开始切片成功后，查询、更新和停止切片的调用时效为24个小时。
     */
    public void setResourceExpiredHour(Long ResourceExpiredHour) {
        this.ResourceExpiredHour = ResourceExpiredHour;
    }

    public CreateCloudModerationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCloudModerationRequest(CreateCloudModerationRequest source) {
        if (source.SdkAppId != null) {
            this.SdkAppId = new Long(source.SdkAppId);
        }
        if (source.RoomId != null) {
            this.RoomId = new String(source.RoomId);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.UserSig != null) {
            this.UserSig = new String(source.UserSig);
        }
        if (source.ModerationParams != null) {
            this.ModerationParams = new ModerationParams(source.ModerationParams);
        }
        if (source.ModerationStorageParams != null) {
            this.ModerationStorageParams = new ModerationStorageParams(source.ModerationStorageParams);
        }
        if (source.RoomIdType != null) {
            this.RoomIdType = new Long(source.RoomIdType);
        }
        if (source.ResourceExpiredHour != null) {
            this.ResourceExpiredHour = new Long(source.ResourceExpiredHour);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "RoomId", this.RoomId);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "UserSig", this.UserSig);
        this.setParamObj(map, prefix + "ModerationParams.", this.ModerationParams);
        this.setParamObj(map, prefix + "ModerationStorageParams.", this.ModerationStorageParams);
        this.setParamSimple(map, prefix + "RoomIdType", this.RoomIdType);
        this.setParamSimple(map, prefix + "ResourceExpiredHour", this.ResourceExpiredHour);

    }
}

