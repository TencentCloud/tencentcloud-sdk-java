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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAlarmNoticeRequest extends AbstractModel{

    /**
    * 告警模板名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 告警模板的类型。可选值：
<br><li> Trigger - 告警触发
<br><li> Recovery - 告警恢复
<br><li> All - 告警触发和告警恢复
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 告警模板接收者信息。
    */
    @SerializedName("NoticeReceivers")
    @Expose
    private NoticeReceiver [] NoticeReceivers;

    /**
    * 告警模板回调信息。
    */
    @SerializedName("WebCallbacks")
    @Expose
    private WebCallback [] WebCallbacks;

    /**
     * Get 告警模板名称。 
     * @return Name 告警模板名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 告警模板名称。
     * @param Name 告警模板名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 告警模板的类型。可选值：
<br><li> Trigger - 告警触发
<br><li> Recovery - 告警恢复
<br><li> All - 告警触发和告警恢复 
     * @return Type 告警模板的类型。可选值：
<br><li> Trigger - 告警触发
<br><li> Recovery - 告警恢复
<br><li> All - 告警触发和告警恢复
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 告警模板的类型。可选值：
<br><li> Trigger - 告警触发
<br><li> Recovery - 告警恢复
<br><li> All - 告警触发和告警恢复
     * @param Type 告警模板的类型。可选值：
<br><li> Trigger - 告警触发
<br><li> Recovery - 告警恢复
<br><li> All - 告警触发和告警恢复
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 告警模板接收者信息。 
     * @return NoticeReceivers 告警模板接收者信息。
     */
    public NoticeReceiver [] getNoticeReceivers() {
        return this.NoticeReceivers;
    }

    /**
     * Set 告警模板接收者信息。
     * @param NoticeReceivers 告警模板接收者信息。
     */
    public void setNoticeReceivers(NoticeReceiver [] NoticeReceivers) {
        this.NoticeReceivers = NoticeReceivers;
    }

    /**
     * Get 告警模板回调信息。 
     * @return WebCallbacks 告警模板回调信息。
     */
    public WebCallback [] getWebCallbacks() {
        return this.WebCallbacks;
    }

    /**
     * Set 告警模板回调信息。
     * @param WebCallbacks 告警模板回调信息。
     */
    public void setWebCallbacks(WebCallback [] WebCallbacks) {
        this.WebCallbacks = WebCallbacks;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "NoticeReceivers.", this.NoticeReceivers);
        this.setParamArrayObj(map, prefix + "WebCallbacks.", this.WebCallbacks);

    }
}

