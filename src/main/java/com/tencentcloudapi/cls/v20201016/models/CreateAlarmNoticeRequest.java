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

public class CreateAlarmNoticeRequest extends AbstractModel {

    /**
    * 通知渠道组名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 通知类型。可选值：
- Trigger - 告警触发
- Recovery - 告警恢复
- All - 告警触发和告警恢复


 注意:  
- Type、NoticeReceivers和WebCallbacks是一组rule配置，其中Type必填，NoticeReceivers和WebCallbacks至少一个不为空；NoticeRules是另一组rule配置，其中rule不许为空
- 2组rule配置互斥
- rule配置 与 deliver配置（DeliverStatus与DeliverConfig）至少填写一组配置
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 通知接收对象。
 注意:  
- Type、NoticeReceivers和WebCallbacks是一组rule配置，其中Type必填，NoticeReceivers和WebCallbacks至少一个不为空；NoticeRules是另一组rule配置，其中rule不许为空
- 2组rule配置互斥
- rule配置 与 deliver配置（DeliverStatus与DeliverConfig）至少填写一组配置
    */
    @SerializedName("NoticeReceivers")
    @Expose
    private NoticeReceiver [] NoticeReceivers;

    /**
    * 接口回调信息（包括企业微信）。
 注意:  
- Type、NoticeReceivers和WebCallbacks是一组rule配置，其中Type必填，NoticeReceivers和WebCallbacks至少一个不为空；NoticeRules是另一组rule配置，其中rule不许为空
- 2组rule配置互斥
- rule配置 与 deliver配置（DeliverStatus与DeliverConfig）至少填写一组配置
    */
    @SerializedName("WebCallbacks")
    @Expose
    private WebCallback [] WebCallbacks;

    /**
    * 通知规则。
 注意:  
- Type、NoticeReceivers和WebCallbacks是一组rule配置，其中Type必填，NoticeReceivers和WebCallbacks至少一个不为空；NoticeRules是另一组rule配置，其中rule不许为空
- 2组rule配置互斥
- rule配置 与 deliver配置（DeliverStatus与DeliverConfig）至少填写一组配置


    */
    @SerializedName("NoticeRules")
    @Expose
    private NoticeRule [] NoticeRules;

    /**
     * Get 通知渠道组名称。 
     * @return Name 通知渠道组名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 通知渠道组名称。
     * @param Name 通知渠道组名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 通知类型。可选值：
- Trigger - 告警触发
- Recovery - 告警恢复
- All - 告警触发和告警恢复


 注意:  
- Type、NoticeReceivers和WebCallbacks是一组rule配置，其中Type必填，NoticeReceivers和WebCallbacks至少一个不为空；NoticeRules是另一组rule配置，其中rule不许为空
- 2组rule配置互斥
- rule配置 与 deliver配置（DeliverStatus与DeliverConfig）至少填写一组配置 
     * @return Type 通知类型。可选值：
- Trigger - 告警触发
- Recovery - 告警恢复
- All - 告警触发和告警恢复


 注意:  
- Type、NoticeReceivers和WebCallbacks是一组rule配置，其中Type必填，NoticeReceivers和WebCallbacks至少一个不为空；NoticeRules是另一组rule配置，其中rule不许为空
- 2组rule配置互斥
- rule配置 与 deliver配置（DeliverStatus与DeliverConfig）至少填写一组配置
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 通知类型。可选值：
- Trigger - 告警触发
- Recovery - 告警恢复
- All - 告警触发和告警恢复


 注意:  
- Type、NoticeReceivers和WebCallbacks是一组rule配置，其中Type必填，NoticeReceivers和WebCallbacks至少一个不为空；NoticeRules是另一组rule配置，其中rule不许为空
- 2组rule配置互斥
- rule配置 与 deliver配置（DeliverStatus与DeliverConfig）至少填写一组配置
     * @param Type 通知类型。可选值：
- Trigger - 告警触发
- Recovery - 告警恢复
- All - 告警触发和告警恢复


 注意:  
- Type、NoticeReceivers和WebCallbacks是一组rule配置，其中Type必填，NoticeReceivers和WebCallbacks至少一个不为空；NoticeRules是另一组rule配置，其中rule不许为空
- 2组rule配置互斥
- rule配置 与 deliver配置（DeliverStatus与DeliverConfig）至少填写一组配置
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 通知接收对象。
 注意:  
- Type、NoticeReceivers和WebCallbacks是一组rule配置，其中Type必填，NoticeReceivers和WebCallbacks至少一个不为空；NoticeRules是另一组rule配置，其中rule不许为空
- 2组rule配置互斥
- rule配置 与 deliver配置（DeliverStatus与DeliverConfig）至少填写一组配置 
     * @return NoticeReceivers 通知接收对象。
 注意:  
- Type、NoticeReceivers和WebCallbacks是一组rule配置，其中Type必填，NoticeReceivers和WebCallbacks至少一个不为空；NoticeRules是另一组rule配置，其中rule不许为空
- 2组rule配置互斥
- rule配置 与 deliver配置（DeliverStatus与DeliverConfig）至少填写一组配置
     */
    public NoticeReceiver [] getNoticeReceivers() {
        return this.NoticeReceivers;
    }

    /**
     * Set 通知接收对象。
 注意:  
- Type、NoticeReceivers和WebCallbacks是一组rule配置，其中Type必填，NoticeReceivers和WebCallbacks至少一个不为空；NoticeRules是另一组rule配置，其中rule不许为空
- 2组rule配置互斥
- rule配置 与 deliver配置（DeliverStatus与DeliverConfig）至少填写一组配置
     * @param NoticeReceivers 通知接收对象。
 注意:  
- Type、NoticeReceivers和WebCallbacks是一组rule配置，其中Type必填，NoticeReceivers和WebCallbacks至少一个不为空；NoticeRules是另一组rule配置，其中rule不许为空
- 2组rule配置互斥
- rule配置 与 deliver配置（DeliverStatus与DeliverConfig）至少填写一组配置
     */
    public void setNoticeReceivers(NoticeReceiver [] NoticeReceivers) {
        this.NoticeReceivers = NoticeReceivers;
    }

    /**
     * Get 接口回调信息（包括企业微信）。
 注意:  
- Type、NoticeReceivers和WebCallbacks是一组rule配置，其中Type必填，NoticeReceivers和WebCallbacks至少一个不为空；NoticeRules是另一组rule配置，其中rule不许为空
- 2组rule配置互斥
- rule配置 与 deliver配置（DeliverStatus与DeliverConfig）至少填写一组配置 
     * @return WebCallbacks 接口回调信息（包括企业微信）。
 注意:  
- Type、NoticeReceivers和WebCallbacks是一组rule配置，其中Type必填，NoticeReceivers和WebCallbacks至少一个不为空；NoticeRules是另一组rule配置，其中rule不许为空
- 2组rule配置互斥
- rule配置 与 deliver配置（DeliverStatus与DeliverConfig）至少填写一组配置
     */
    public WebCallback [] getWebCallbacks() {
        return this.WebCallbacks;
    }

    /**
     * Set 接口回调信息（包括企业微信）。
 注意:  
- Type、NoticeReceivers和WebCallbacks是一组rule配置，其中Type必填，NoticeReceivers和WebCallbacks至少一个不为空；NoticeRules是另一组rule配置，其中rule不许为空
- 2组rule配置互斥
- rule配置 与 deliver配置（DeliverStatus与DeliverConfig）至少填写一组配置
     * @param WebCallbacks 接口回调信息（包括企业微信）。
 注意:  
- Type、NoticeReceivers和WebCallbacks是一组rule配置，其中Type必填，NoticeReceivers和WebCallbacks至少一个不为空；NoticeRules是另一组rule配置，其中rule不许为空
- 2组rule配置互斥
- rule配置 与 deliver配置（DeliverStatus与DeliverConfig）至少填写一组配置
     */
    public void setWebCallbacks(WebCallback [] WebCallbacks) {
        this.WebCallbacks = WebCallbacks;
    }

    /**
     * Get 通知规则。
 注意:  
- Type、NoticeReceivers和WebCallbacks是一组rule配置，其中Type必填，NoticeReceivers和WebCallbacks至少一个不为空；NoticeRules是另一组rule配置，其中rule不许为空
- 2组rule配置互斥
- rule配置 与 deliver配置（DeliverStatus与DeliverConfig）至少填写一组配置

 
     * @return NoticeRules 通知规则。
 注意:  
- Type、NoticeReceivers和WebCallbacks是一组rule配置，其中Type必填，NoticeReceivers和WebCallbacks至少一个不为空；NoticeRules是另一组rule配置，其中rule不许为空
- 2组rule配置互斥
- rule配置 与 deliver配置（DeliverStatus与DeliverConfig）至少填写一组配置


     */
    public NoticeRule [] getNoticeRules() {
        return this.NoticeRules;
    }

    /**
     * Set 通知规则。
 注意:  
- Type、NoticeReceivers和WebCallbacks是一组rule配置，其中Type必填，NoticeReceivers和WebCallbacks至少一个不为空；NoticeRules是另一组rule配置，其中rule不许为空
- 2组rule配置互斥
- rule配置 与 deliver配置（DeliverStatus与DeliverConfig）至少填写一组配置


     * @param NoticeRules 通知规则。
 注意:  
- Type、NoticeReceivers和WebCallbacks是一组rule配置，其中Type必填，NoticeReceivers和WebCallbacks至少一个不为空；NoticeRules是另一组rule配置，其中rule不许为空
- 2组rule配置互斥
- rule配置 与 deliver配置（DeliverStatus与DeliverConfig）至少填写一组配置


     */
    public void setNoticeRules(NoticeRule [] NoticeRules) {
        this.NoticeRules = NoticeRules;
    }

    public CreateAlarmNoticeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAlarmNoticeRequest(CreateAlarmNoticeRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.NoticeReceivers != null) {
            this.NoticeReceivers = new NoticeReceiver[source.NoticeReceivers.length];
            for (int i = 0; i < source.NoticeReceivers.length; i++) {
                this.NoticeReceivers[i] = new NoticeReceiver(source.NoticeReceivers[i]);
            }
        }
        if (source.WebCallbacks != null) {
            this.WebCallbacks = new WebCallback[source.WebCallbacks.length];
            for (int i = 0; i < source.WebCallbacks.length; i++) {
                this.WebCallbacks[i] = new WebCallback(source.WebCallbacks[i]);
            }
        }
        if (source.NoticeRules != null) {
            this.NoticeRules = new NoticeRule[source.NoticeRules.length];
            for (int i = 0; i < source.NoticeRules.length; i++) {
                this.NoticeRules[i] = new NoticeRule(source.NoticeRules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "NoticeReceivers.", this.NoticeReceivers);
        this.setParamArrayObj(map, prefix + "WebCallbacks.", this.WebCallbacks);
        this.setParamArrayObj(map, prefix + "NoticeRules.", this.NoticeRules);

    }
}

