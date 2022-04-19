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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserNotice extends AbstractModel{

    /**
    * 接收者类型 USER=用户 GROUP=用户组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReceiverType")
    @Expose
    private String ReceiverType;

    /**
    * 通知开始时间 00:00:00 开始的秒数（取值范围0-86399）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 通知结束时间 00:00:00 开始的秒数（取值范围0-86399）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 通知渠道列表 EMAIL=邮件 SMS=短信 CALL=电话 WECHAT=微信 RTX=企业微信
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NoticeWay")
    @Expose
    private String [] NoticeWay;

    /**
    * 用户 uid 列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserIds")
    @Expose
    private Long [] UserIds;

    /**
    * 用户组 group id 列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupIds")
    @Expose
    private Long [] GroupIds;

    /**
    * 电话轮询列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PhoneOrder")
    @Expose
    private Long [] PhoneOrder;

    /**
    * 电话轮询次数 （取值范围1-5）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PhoneCircleTimes")
    @Expose
    private Long PhoneCircleTimes;

    /**
    * 单次轮询内拨打间隔 秒数 （取值范围60-900）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PhoneInnerInterval")
    @Expose
    private Long PhoneInnerInterval;

    /**
    * 两次轮询间隔 秒数（取值范围60-900）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PhoneCircleInterval")
    @Expose
    private Long PhoneCircleInterval;

    /**
    * 是否需要触达通知 0=否 1=是
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NeedPhoneArriveNotice")
    @Expose
    private Long NeedPhoneArriveNotice;

    /**
    * 电话拨打类型 SYNC=同时拨打 CIRCLE=轮询拨打 不指定时默认是轮询
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PhoneCallType")
    @Expose
    private String PhoneCallType;

    /**
    * 通知周期 1-7表示周一到周日
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Weekday")
    @Expose
    private Long [] Weekday;

    /**
     * Get 接收者类型 USER=用户 GROUP=用户组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReceiverType 接收者类型 USER=用户 GROUP=用户组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReceiverType() {
        return this.ReceiverType;
    }

    /**
     * Set 接收者类型 USER=用户 GROUP=用户组
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReceiverType 接收者类型 USER=用户 GROUP=用户组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReceiverType(String ReceiverType) {
        this.ReceiverType = ReceiverType;
    }

    /**
     * Get 通知开始时间 00:00:00 开始的秒数（取值范围0-86399）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 通知开始时间 00:00:00 开始的秒数（取值范围0-86399）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 通知开始时间 00:00:00 开始的秒数（取值范围0-86399）
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 通知开始时间 00:00:00 开始的秒数（取值范围0-86399）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 通知结束时间 00:00:00 开始的秒数（取值范围0-86399）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 通知结束时间 00:00:00 开始的秒数（取值范围0-86399）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 通知结束时间 00:00:00 开始的秒数（取值范围0-86399）
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 通知结束时间 00:00:00 开始的秒数（取值范围0-86399）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 通知渠道列表 EMAIL=邮件 SMS=短信 CALL=电话 WECHAT=微信 RTX=企业微信
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NoticeWay 通知渠道列表 EMAIL=邮件 SMS=短信 CALL=电话 WECHAT=微信 RTX=企业微信
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getNoticeWay() {
        return this.NoticeWay;
    }

    /**
     * Set 通知渠道列表 EMAIL=邮件 SMS=短信 CALL=电话 WECHAT=微信 RTX=企业微信
注意：此字段可能返回 null，表示取不到有效值。
     * @param NoticeWay 通知渠道列表 EMAIL=邮件 SMS=短信 CALL=电话 WECHAT=微信 RTX=企业微信
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNoticeWay(String [] NoticeWay) {
        this.NoticeWay = NoticeWay;
    }

    /**
     * Get 用户 uid 列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserIds 用户 uid 列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getUserIds() {
        return this.UserIds;
    }

    /**
     * Set 用户 uid 列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserIds 用户 uid 列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserIds(Long [] UserIds) {
        this.UserIds = UserIds;
    }

    /**
     * Get 用户组 group id 列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupIds 用户组 group id 列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getGroupIds() {
        return this.GroupIds;
    }

    /**
     * Set 用户组 group id 列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupIds 用户组 group id 列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupIds(Long [] GroupIds) {
        this.GroupIds = GroupIds;
    }

    /**
     * Get 电话轮询列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PhoneOrder 电话轮询列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getPhoneOrder() {
        return this.PhoneOrder;
    }

    /**
     * Set 电话轮询列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param PhoneOrder 电话轮询列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPhoneOrder(Long [] PhoneOrder) {
        this.PhoneOrder = PhoneOrder;
    }

    /**
     * Get 电话轮询次数 （取值范围1-5）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PhoneCircleTimes 电话轮询次数 （取值范围1-5）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPhoneCircleTimes() {
        return this.PhoneCircleTimes;
    }

    /**
     * Set 电话轮询次数 （取值范围1-5）
注意：此字段可能返回 null，表示取不到有效值。
     * @param PhoneCircleTimes 电话轮询次数 （取值范围1-5）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPhoneCircleTimes(Long PhoneCircleTimes) {
        this.PhoneCircleTimes = PhoneCircleTimes;
    }

    /**
     * Get 单次轮询内拨打间隔 秒数 （取值范围60-900）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PhoneInnerInterval 单次轮询内拨打间隔 秒数 （取值范围60-900）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPhoneInnerInterval() {
        return this.PhoneInnerInterval;
    }

    /**
     * Set 单次轮询内拨打间隔 秒数 （取值范围60-900）
注意：此字段可能返回 null，表示取不到有效值。
     * @param PhoneInnerInterval 单次轮询内拨打间隔 秒数 （取值范围60-900）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPhoneInnerInterval(Long PhoneInnerInterval) {
        this.PhoneInnerInterval = PhoneInnerInterval;
    }

    /**
     * Get 两次轮询间隔 秒数（取值范围60-900）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PhoneCircleInterval 两次轮询间隔 秒数（取值范围60-900）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPhoneCircleInterval() {
        return this.PhoneCircleInterval;
    }

    /**
     * Set 两次轮询间隔 秒数（取值范围60-900）
注意：此字段可能返回 null，表示取不到有效值。
     * @param PhoneCircleInterval 两次轮询间隔 秒数（取值范围60-900）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPhoneCircleInterval(Long PhoneCircleInterval) {
        this.PhoneCircleInterval = PhoneCircleInterval;
    }

    /**
     * Get 是否需要触达通知 0=否 1=是
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NeedPhoneArriveNotice 是否需要触达通知 0=否 1=是
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNeedPhoneArriveNotice() {
        return this.NeedPhoneArriveNotice;
    }

    /**
     * Set 是否需要触达通知 0=否 1=是
注意：此字段可能返回 null，表示取不到有效值。
     * @param NeedPhoneArriveNotice 是否需要触达通知 0=否 1=是
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNeedPhoneArriveNotice(Long NeedPhoneArriveNotice) {
        this.NeedPhoneArriveNotice = NeedPhoneArriveNotice;
    }

    /**
     * Get 电话拨打类型 SYNC=同时拨打 CIRCLE=轮询拨打 不指定时默认是轮询
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PhoneCallType 电话拨打类型 SYNC=同时拨打 CIRCLE=轮询拨打 不指定时默认是轮询
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPhoneCallType() {
        return this.PhoneCallType;
    }

    /**
     * Set 电话拨打类型 SYNC=同时拨打 CIRCLE=轮询拨打 不指定时默认是轮询
注意：此字段可能返回 null，表示取不到有效值。
     * @param PhoneCallType 电话拨打类型 SYNC=同时拨打 CIRCLE=轮询拨打 不指定时默认是轮询
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPhoneCallType(String PhoneCallType) {
        this.PhoneCallType = PhoneCallType;
    }

    /**
     * Get 通知周期 1-7表示周一到周日
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Weekday 通知周期 1-7表示周一到周日
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getWeekday() {
        return this.Weekday;
    }

    /**
     * Set 通知周期 1-7表示周一到周日
注意：此字段可能返回 null，表示取不到有效值。
     * @param Weekday 通知周期 1-7表示周一到周日
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWeekday(Long [] Weekday) {
        this.Weekday = Weekday;
    }

    public UserNotice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserNotice(UserNotice source) {
        if (source.ReceiverType != null) {
            this.ReceiverType = new String(source.ReceiverType);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.NoticeWay != null) {
            this.NoticeWay = new String[source.NoticeWay.length];
            for (int i = 0; i < source.NoticeWay.length; i++) {
                this.NoticeWay[i] = new String(source.NoticeWay[i]);
            }
        }
        if (source.UserIds != null) {
            this.UserIds = new Long[source.UserIds.length];
            for (int i = 0; i < source.UserIds.length; i++) {
                this.UserIds[i] = new Long(source.UserIds[i]);
            }
        }
        if (source.GroupIds != null) {
            this.GroupIds = new Long[source.GroupIds.length];
            for (int i = 0; i < source.GroupIds.length; i++) {
                this.GroupIds[i] = new Long(source.GroupIds[i]);
            }
        }
        if (source.PhoneOrder != null) {
            this.PhoneOrder = new Long[source.PhoneOrder.length];
            for (int i = 0; i < source.PhoneOrder.length; i++) {
                this.PhoneOrder[i] = new Long(source.PhoneOrder[i]);
            }
        }
        if (source.PhoneCircleTimes != null) {
            this.PhoneCircleTimes = new Long(source.PhoneCircleTimes);
        }
        if (source.PhoneInnerInterval != null) {
            this.PhoneInnerInterval = new Long(source.PhoneInnerInterval);
        }
        if (source.PhoneCircleInterval != null) {
            this.PhoneCircleInterval = new Long(source.PhoneCircleInterval);
        }
        if (source.NeedPhoneArriveNotice != null) {
            this.NeedPhoneArriveNotice = new Long(source.NeedPhoneArriveNotice);
        }
        if (source.PhoneCallType != null) {
            this.PhoneCallType = new String(source.PhoneCallType);
        }
        if (source.Weekday != null) {
            this.Weekday = new Long[source.Weekday.length];
            for (int i = 0; i < source.Weekday.length; i++) {
                this.Weekday[i] = new Long(source.Weekday[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReceiverType", this.ReceiverType);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "NoticeWay.", this.NoticeWay);
        this.setParamArraySimple(map, prefix + "UserIds.", this.UserIds);
        this.setParamArraySimple(map, prefix + "GroupIds.", this.GroupIds);
        this.setParamArraySimple(map, prefix + "PhoneOrder.", this.PhoneOrder);
        this.setParamSimple(map, prefix + "PhoneCircleTimes", this.PhoneCircleTimes);
        this.setParamSimple(map, prefix + "PhoneInnerInterval", this.PhoneInnerInterval);
        this.setParamSimple(map, prefix + "PhoneCircleInterval", this.PhoneCircleInterval);
        this.setParamSimple(map, prefix + "NeedPhoneArriveNotice", this.NeedPhoneArriveNotice);
        this.setParamSimple(map, prefix + "PhoneCallType", this.PhoneCallType);
        this.setParamArraySimple(map, prefix + "Weekday.", this.Weekday);

    }
}

