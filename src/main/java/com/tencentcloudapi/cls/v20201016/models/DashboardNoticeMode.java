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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DashboardNoticeMode extends AbstractModel {

    /**
    * 仪表盘通知方式。

- Uin：腾讯云用户
- Group：腾讯云用户组
- WeCom：企业微信回调
- Email：自定义邮件
- DingTalk：钉钉
- Lark：飞书
    */
    @SerializedName("ReceiverType")
    @Expose
    private String ReceiverType;

    /**
    * 知方式对应的值。
- 当ReceiverType为：`WeCom`、`DingTalk`、`Lark` 时，Values必须为空，且Url字段必填。
- 当ReceiverType为：`Uin`、`Group`、`Email` 时，Values必填，且Url字段必须为空。
- 当ReceiverType为：`Uin ` 时，Values为用户id，通过 [拉取子用户](https://cloud.tencent.com/document/product/598/34587) 获取子用户 UID 。
- 当ReceiverType为：`Group` 时，Values为用户组id，通过 [查询用户组列表](https://cloud.tencent.com/document/product/598/34589) 获取用户组 ID 。
- 当ReceiverType为：`Email` 时，Values为用户邮箱信息。
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
    * 仪表盘通知渠道。

-  支持：["Email","Sms","WeChat","Phone"]。
-  当ReceiverType为 `Email` 或 `WeCom` 时，ReceiverChannels无效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReceiverChannels")
    @Expose
    private String [] ReceiverChannels;

    /**
    * 订阅方式	- 回调地址。
- 当ReceiverType为：`WeCom`、`DingTalk`、`Lark` 时，Url字段必填为各渠道的回调地址。
    - 为：`WeCom` 时，Url为 企业微信回调地址。
    - 为：`DingTalk` 时，Url为 钉钉机器人Webhook地址。
    - 为：`Lark` 时，Url为 飞书机器人Webhook地址。
- 当ReceiverType为：`Uin`、`Group`、`Email` 时，Url字段必须为空。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * Get 仪表盘通知方式。

- Uin：腾讯云用户
- Group：腾讯云用户组
- WeCom：企业微信回调
- Email：自定义邮件
- DingTalk：钉钉
- Lark：飞书 
     * @return ReceiverType 仪表盘通知方式。

- Uin：腾讯云用户
- Group：腾讯云用户组
- WeCom：企业微信回调
- Email：自定义邮件
- DingTalk：钉钉
- Lark：飞书
     */
    public String getReceiverType() {
        return this.ReceiverType;
    }

    /**
     * Set 仪表盘通知方式。

- Uin：腾讯云用户
- Group：腾讯云用户组
- WeCom：企业微信回调
- Email：自定义邮件
- DingTalk：钉钉
- Lark：飞书
     * @param ReceiverType 仪表盘通知方式。

- Uin：腾讯云用户
- Group：腾讯云用户组
- WeCom：企业微信回调
- Email：自定义邮件
- DingTalk：钉钉
- Lark：飞书
     */
    public void setReceiverType(String ReceiverType) {
        this.ReceiverType = ReceiverType;
    }

    /**
     * Get 知方式对应的值。
- 当ReceiverType为：`WeCom`、`DingTalk`、`Lark` 时，Values必须为空，且Url字段必填。
- 当ReceiverType为：`Uin`、`Group`、`Email` 时，Values必填，且Url字段必须为空。
- 当ReceiverType为：`Uin ` 时，Values为用户id，通过 [拉取子用户](https://cloud.tencent.com/document/product/598/34587) 获取子用户 UID 。
- 当ReceiverType为：`Group` 时，Values为用户组id，通过 [查询用户组列表](https://cloud.tencent.com/document/product/598/34589) 获取用户组 ID 。
- 当ReceiverType为：`Email` 时，Values为用户邮箱信息。 
     * @return Values 知方式对应的值。
- 当ReceiverType为：`WeCom`、`DingTalk`、`Lark` 时，Values必须为空，且Url字段必填。
- 当ReceiverType为：`Uin`、`Group`、`Email` 时，Values必填，且Url字段必须为空。
- 当ReceiverType为：`Uin ` 时，Values为用户id，通过 [拉取子用户](https://cloud.tencent.com/document/product/598/34587) 获取子用户 UID 。
- 当ReceiverType为：`Group` 时，Values为用户组id，通过 [查询用户组列表](https://cloud.tencent.com/document/product/598/34589) 获取用户组 ID 。
- 当ReceiverType为：`Email` 时，Values为用户邮箱信息。
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set 知方式对应的值。
- 当ReceiverType为：`WeCom`、`DingTalk`、`Lark` 时，Values必须为空，且Url字段必填。
- 当ReceiverType为：`Uin`、`Group`、`Email` 时，Values必填，且Url字段必须为空。
- 当ReceiverType为：`Uin ` 时，Values为用户id，通过 [拉取子用户](https://cloud.tencent.com/document/product/598/34587) 获取子用户 UID 。
- 当ReceiverType为：`Group` 时，Values为用户组id，通过 [查询用户组列表](https://cloud.tencent.com/document/product/598/34589) 获取用户组 ID 。
- 当ReceiverType为：`Email` 时，Values为用户邮箱信息。
     * @param Values 知方式对应的值。
- 当ReceiverType为：`WeCom`、`DingTalk`、`Lark` 时，Values必须为空，且Url字段必填。
- 当ReceiverType为：`Uin`、`Group`、`Email` 时，Values必填，且Url字段必须为空。
- 当ReceiverType为：`Uin ` 时，Values为用户id，通过 [拉取子用户](https://cloud.tencent.com/document/product/598/34587) 获取子用户 UID 。
- 当ReceiverType为：`Group` 时，Values为用户组id，通过 [查询用户组列表](https://cloud.tencent.com/document/product/598/34589) 获取用户组 ID 。
- 当ReceiverType为：`Email` 时，Values为用户邮箱信息。
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    /**
     * Get 仪表盘通知渠道。

-  支持：["Email","Sms","WeChat","Phone"]。
-  当ReceiverType为 `Email` 或 `WeCom` 时，ReceiverChannels无效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReceiverChannels 仪表盘通知渠道。

-  支持：["Email","Sms","WeChat","Phone"]。
-  当ReceiverType为 `Email` 或 `WeCom` 时，ReceiverChannels无效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getReceiverChannels() {
        return this.ReceiverChannels;
    }

    /**
     * Set 仪表盘通知渠道。

-  支持：["Email","Sms","WeChat","Phone"]。
-  当ReceiverType为 `Email` 或 `WeCom` 时，ReceiverChannels无效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReceiverChannels 仪表盘通知渠道。

-  支持：["Email","Sms","WeChat","Phone"]。
-  当ReceiverType为 `Email` 或 `WeCom` 时，ReceiverChannels无效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReceiverChannels(String [] ReceiverChannels) {
        this.ReceiverChannels = ReceiverChannels;
    }

    /**
     * Get 订阅方式	- 回调地址。
- 当ReceiverType为：`WeCom`、`DingTalk`、`Lark` 时，Url字段必填为各渠道的回调地址。
    - 为：`WeCom` 时，Url为 企业微信回调地址。
    - 为：`DingTalk` 时，Url为 钉钉机器人Webhook地址。
    - 为：`Lark` 时，Url为 飞书机器人Webhook地址。
- 当ReceiverType为：`Uin`、`Group`、`Email` 时，Url字段必须为空。 
     * @return Url 订阅方式	- 回调地址。
- 当ReceiverType为：`WeCom`、`DingTalk`、`Lark` 时，Url字段必填为各渠道的回调地址。
    - 为：`WeCom` 时，Url为 企业微信回调地址。
    - 为：`DingTalk` 时，Url为 钉钉机器人Webhook地址。
    - 为：`Lark` 时，Url为 飞书机器人Webhook地址。
- 当ReceiverType为：`Uin`、`Group`、`Email` 时，Url字段必须为空。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 订阅方式	- 回调地址。
- 当ReceiverType为：`WeCom`、`DingTalk`、`Lark` 时，Url字段必填为各渠道的回调地址。
    - 为：`WeCom` 时，Url为 企业微信回调地址。
    - 为：`DingTalk` 时，Url为 钉钉机器人Webhook地址。
    - 为：`Lark` 时，Url为 飞书机器人Webhook地址。
- 当ReceiverType为：`Uin`、`Group`、`Email` 时，Url字段必须为空。
     * @param Url 订阅方式	- 回调地址。
- 当ReceiverType为：`WeCom`、`DingTalk`、`Lark` 时，Url字段必填为各渠道的回调地址。
    - 为：`WeCom` 时，Url为 企业微信回调地址。
    - 为：`DingTalk` 时，Url为 钉钉机器人Webhook地址。
    - 为：`Lark` 时，Url为 飞书机器人Webhook地址。
- 当ReceiverType为：`Uin`、`Group`、`Email` 时，Url字段必须为空。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    public DashboardNoticeMode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DashboardNoticeMode(DashboardNoticeMode source) {
        if (source.ReceiverType != null) {
            this.ReceiverType = new String(source.ReceiverType);
        }
        if (source.Values != null) {
            this.Values = new String[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new String(source.Values[i]);
            }
        }
        if (source.ReceiverChannels != null) {
            this.ReceiverChannels = new String[source.ReceiverChannels.length];
            for (int i = 0; i < source.ReceiverChannels.length; i++) {
                this.ReceiverChannels[i] = new String(source.ReceiverChannels[i]);
            }
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReceiverType", this.ReceiverType);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);
        this.setParamArraySimple(map, prefix + "ReceiverChannels.", this.ReceiverChannels);
        this.setParamSimple(map, prefix + "Url", this.Url);

    }
}

