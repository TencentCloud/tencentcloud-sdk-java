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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NoticeReceiver extends AbstractModel {

    /**
    * 接受者类型。可选值：
-  Uin - 用户ID
- Group - 用户组ID
暂不支持其余接收者类型。
    */
    @SerializedName("ReceiverType")
    @Expose
    private String ReceiverType;

    /**
    * 接收者。
当ReceiverType为Uin时，ReceiverIds的值为用户id。[子用户信息查询](https://cloud.tencent.com/document/product/598/36258)
当ReceiverType为Group时，ReceiverIds的值为用户组id。[CAM用户组](https://cloud.tencent.com/document/product/598/14985)
    */
    @SerializedName("ReceiverIds")
    @Expose
    private Long [] ReceiverIds;

    /**
    * 通知接收渠道。
- Email - 邮件
- Sms - 短信
- WeChat - 微信
- Phone - 电话
    */
    @SerializedName("ReceiverChannels")
    @Expose
    private String [] ReceiverChannels;

    /**
    * 允许接收信息的开始时间。格式：`15:04:05`，必填。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 允许接收信息的结束时间。格式：`15:04:05`，必填。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 位序。

- 入参时无效。
- 出参时有效。
    */
    @SerializedName("Index")
    @Expose
    private Long Index;

    /**
     * Get 接受者类型。可选值：
-  Uin - 用户ID
- Group - 用户组ID
暂不支持其余接收者类型。 
     * @return ReceiverType 接受者类型。可选值：
-  Uin - 用户ID
- Group - 用户组ID
暂不支持其余接收者类型。
     */
    public String getReceiverType() {
        return this.ReceiverType;
    }

    /**
     * Set 接受者类型。可选值：
-  Uin - 用户ID
- Group - 用户组ID
暂不支持其余接收者类型。
     * @param ReceiverType 接受者类型。可选值：
-  Uin - 用户ID
- Group - 用户组ID
暂不支持其余接收者类型。
     */
    public void setReceiverType(String ReceiverType) {
        this.ReceiverType = ReceiverType;
    }

    /**
     * Get 接收者。
当ReceiverType为Uin时，ReceiverIds的值为用户id。[子用户信息查询](https://cloud.tencent.com/document/product/598/36258)
当ReceiverType为Group时，ReceiverIds的值为用户组id。[CAM用户组](https://cloud.tencent.com/document/product/598/14985) 
     * @return ReceiverIds 接收者。
当ReceiverType为Uin时，ReceiverIds的值为用户id。[子用户信息查询](https://cloud.tencent.com/document/product/598/36258)
当ReceiverType为Group时，ReceiverIds的值为用户组id。[CAM用户组](https://cloud.tencent.com/document/product/598/14985)
     */
    public Long [] getReceiverIds() {
        return this.ReceiverIds;
    }

    /**
     * Set 接收者。
当ReceiverType为Uin时，ReceiverIds的值为用户id。[子用户信息查询](https://cloud.tencent.com/document/product/598/36258)
当ReceiverType为Group时，ReceiverIds的值为用户组id。[CAM用户组](https://cloud.tencent.com/document/product/598/14985)
     * @param ReceiverIds 接收者。
当ReceiverType为Uin时，ReceiverIds的值为用户id。[子用户信息查询](https://cloud.tencent.com/document/product/598/36258)
当ReceiverType为Group时，ReceiverIds的值为用户组id。[CAM用户组](https://cloud.tencent.com/document/product/598/14985)
     */
    public void setReceiverIds(Long [] ReceiverIds) {
        this.ReceiverIds = ReceiverIds;
    }

    /**
     * Get 通知接收渠道。
- Email - 邮件
- Sms - 短信
- WeChat - 微信
- Phone - 电话 
     * @return ReceiverChannels 通知接收渠道。
- Email - 邮件
- Sms - 短信
- WeChat - 微信
- Phone - 电话
     */
    public String [] getReceiverChannels() {
        return this.ReceiverChannels;
    }

    /**
     * Set 通知接收渠道。
- Email - 邮件
- Sms - 短信
- WeChat - 微信
- Phone - 电话
     * @param ReceiverChannels 通知接收渠道。
- Email - 邮件
- Sms - 短信
- WeChat - 微信
- Phone - 电话
     */
    public void setReceiverChannels(String [] ReceiverChannels) {
        this.ReceiverChannels = ReceiverChannels;
    }

    /**
     * Get 允许接收信息的开始时间。格式：`15:04:05`，必填。 
     * @return StartTime 允许接收信息的开始时间。格式：`15:04:05`，必填。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 允许接收信息的开始时间。格式：`15:04:05`，必填。
     * @param StartTime 允许接收信息的开始时间。格式：`15:04:05`，必填。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 允许接收信息的结束时间。格式：`15:04:05`，必填。 
     * @return EndTime 允许接收信息的结束时间。格式：`15:04:05`，必填。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 允许接收信息的结束时间。格式：`15:04:05`，必填。
     * @param EndTime 允许接收信息的结束时间。格式：`15:04:05`，必填。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 位序。

- 入参时无效。
- 出参时有效。 
     * @return Index 位序。

- 入参时无效。
- 出参时有效。
     */
    public Long getIndex() {
        return this.Index;
    }

    /**
     * Set 位序。

- 入参时无效。
- 出参时有效。
     * @param Index 位序。

- 入参时无效。
- 出参时有效。
     */
    public void setIndex(Long Index) {
        this.Index = Index;
    }

    public NoticeReceiver() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NoticeReceiver(NoticeReceiver source) {
        if (source.ReceiverType != null) {
            this.ReceiverType = new String(source.ReceiverType);
        }
        if (source.ReceiverIds != null) {
            this.ReceiverIds = new Long[source.ReceiverIds.length];
            for (int i = 0; i < source.ReceiverIds.length; i++) {
                this.ReceiverIds[i] = new Long(source.ReceiverIds[i]);
            }
        }
        if (source.ReceiverChannels != null) {
            this.ReceiverChannels = new String[source.ReceiverChannels.length];
            for (int i = 0; i < source.ReceiverChannels.length; i++) {
                this.ReceiverChannels[i] = new String(source.ReceiverChannels[i]);
            }
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Index != null) {
            this.Index = new Long(source.Index);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReceiverType", this.ReceiverType);
        this.setParamArraySimple(map, prefix + "ReceiverIds.", this.ReceiverIds);
        this.setParamArraySimple(map, prefix + "ReceiverChannels.", this.ReceiverChannels);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Index", this.Index);

    }
}

