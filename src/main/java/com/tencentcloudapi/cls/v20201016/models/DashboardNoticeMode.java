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

public class DashboardNoticeMode extends AbstractModel {

    /**
    * 仪表盘通知方式。<br>
<li/>Uin：腾讯云用户<br>
<li/>Group：腾讯云用户组<br>
<li/>Email：自定义Email<br>
<li/>WeCom: 企业微信回调
    */
    @SerializedName("ReceiverType")
    @Expose
    private String ReceiverType;

    /**
    * 知方式对应的值。
<br> <li/> 当ReceiverType不是 Wecom 时，Values必填。
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
    * 仪表盘通知渠道。
<br><li/> 支持：["Email","Sms","WeChat","Phone"]。
<br><li/> 当ReceiverType是 Email 或 Wecom 时，ReceiverChannels不能赋值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReceiverChannels")
    @Expose
    private String [] ReceiverChannels;

    /**
    * 回调Url。
<br><li/> 当ReceiverType是 Wecom 时，Url必填。
<br><li/> 当ReceiverType不是 Wecom 时，Url不能填写。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * Get 仪表盘通知方式。<br>
<li/>Uin：腾讯云用户<br>
<li/>Group：腾讯云用户组<br>
<li/>Email：自定义Email<br>
<li/>WeCom: 企业微信回调 
     * @return ReceiverType 仪表盘通知方式。<br>
<li/>Uin：腾讯云用户<br>
<li/>Group：腾讯云用户组<br>
<li/>Email：自定义Email<br>
<li/>WeCom: 企业微信回调
     */
    public String getReceiverType() {
        return this.ReceiverType;
    }

    /**
     * Set 仪表盘通知方式。<br>
<li/>Uin：腾讯云用户<br>
<li/>Group：腾讯云用户组<br>
<li/>Email：自定义Email<br>
<li/>WeCom: 企业微信回调
     * @param ReceiverType 仪表盘通知方式。<br>
<li/>Uin：腾讯云用户<br>
<li/>Group：腾讯云用户组<br>
<li/>Email：自定义Email<br>
<li/>WeCom: 企业微信回调
     */
    public void setReceiverType(String ReceiverType) {
        this.ReceiverType = ReceiverType;
    }

    /**
     * Get 知方式对应的值。
<br> <li/> 当ReceiverType不是 Wecom 时，Values必填。 
     * @return Values 知方式对应的值。
<br> <li/> 当ReceiverType不是 Wecom 时，Values必填。
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set 知方式对应的值。
<br> <li/> 当ReceiverType不是 Wecom 时，Values必填。
     * @param Values 知方式对应的值。
<br> <li/> 当ReceiverType不是 Wecom 时，Values必填。
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    /**
     * Get 仪表盘通知渠道。
<br><li/> 支持：["Email","Sms","WeChat","Phone"]。
<br><li/> 当ReceiverType是 Email 或 Wecom 时，ReceiverChannels不能赋值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReceiverChannels 仪表盘通知渠道。
<br><li/> 支持：["Email","Sms","WeChat","Phone"]。
<br><li/> 当ReceiverType是 Email 或 Wecom 时，ReceiverChannels不能赋值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getReceiverChannels() {
        return this.ReceiverChannels;
    }

    /**
     * Set 仪表盘通知渠道。
<br><li/> 支持：["Email","Sms","WeChat","Phone"]。
<br><li/> 当ReceiverType是 Email 或 Wecom 时，ReceiverChannels不能赋值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReceiverChannels 仪表盘通知渠道。
<br><li/> 支持：["Email","Sms","WeChat","Phone"]。
<br><li/> 当ReceiverType是 Email 或 Wecom 时，ReceiverChannels不能赋值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReceiverChannels(String [] ReceiverChannels) {
        this.ReceiverChannels = ReceiverChannels;
    }

    /**
     * Get 回调Url。
<br><li/> 当ReceiverType是 Wecom 时，Url必填。
<br><li/> 当ReceiverType不是 Wecom 时，Url不能填写。 
     * @return Url 回调Url。
<br><li/> 当ReceiverType是 Wecom 时，Url必填。
<br><li/> 当ReceiverType不是 Wecom 时，Url不能填写。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 回调Url。
<br><li/> 当ReceiverType是 Wecom 时，Url必填。
<br><li/> 当ReceiverType不是 Wecom 时，Url不能填写。
     * @param Url 回调Url。
<br><li/> 当ReceiverType是 Wecom 时，Url必填。
<br><li/> 当ReceiverType不是 Wecom 时，Url不能填写。
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

