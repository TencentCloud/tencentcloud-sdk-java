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
package com.tencentcloudapi.ms.v20180408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServiceInfo extends AbstractModel{

    /**
    * 服务版本，基础版basic，专业版professional，企业版enterprise。
    */
    @SerializedName("ServiceEdition")
    @Expose
    private String ServiceEdition;

    /**
    * 任务处理完成后的反向通知回调地址，如果不需要通知请传递空字符串。通知为POST请求，post包体数据示例{"Response":{"ItemId":"4cdad8fb86f036b06bccb3f58971c306","ShieldCode":0,"ShieldMd5":"78701576793c4a5f04e1c9660de0aa0b","ShieldSize":11997354,"TaskStatus":1,"TaskTime":1539148141}}，调用方需要返回如下信息，{"Result":"ok","Reason":"xxxxx"}，如果Result字段值不等于ok会继续回调。
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
    * 提交来源 YYB-应用宝 RDM-rdm MC-控制台 MAC_TOOL-mac工具 WIN_TOOL-window工具。
    */
    @SerializedName("SubmitSource")
    @Expose
    private String SubmitSource;

    /**
    * 加固策略编号，如果不传则使用系统默认加固策略。如果指定的plan不存在会返回错误。
    */
    @SerializedName("PlanId")
    @Expose
    private Long PlanId;

    /**
     * Get 服务版本，基础版basic，专业版professional，企业版enterprise。 
     * @return ServiceEdition 服务版本，基础版basic，专业版professional，企业版enterprise。
     */
    public String getServiceEdition() {
        return this.ServiceEdition;
    }

    /**
     * Set 服务版本，基础版basic，专业版professional，企业版enterprise。
     * @param ServiceEdition 服务版本，基础版basic，专业版professional，企业版enterprise。
     */
    public void setServiceEdition(String ServiceEdition) {
        this.ServiceEdition = ServiceEdition;
    }

    /**
     * Get 任务处理完成后的反向通知回调地址，如果不需要通知请传递空字符串。通知为POST请求，post包体数据示例{"Response":{"ItemId":"4cdad8fb86f036b06bccb3f58971c306","ShieldCode":0,"ShieldMd5":"78701576793c4a5f04e1c9660de0aa0b","ShieldSize":11997354,"TaskStatus":1,"TaskTime":1539148141}}，调用方需要返回如下信息，{"Result":"ok","Reason":"xxxxx"}，如果Result字段值不等于ok会继续回调。 
     * @return CallbackUrl 任务处理完成后的反向通知回调地址，如果不需要通知请传递空字符串。通知为POST请求，post包体数据示例{"Response":{"ItemId":"4cdad8fb86f036b06bccb3f58971c306","ShieldCode":0,"ShieldMd5":"78701576793c4a5f04e1c9660de0aa0b","ShieldSize":11997354,"TaskStatus":1,"TaskTime":1539148141}}，调用方需要返回如下信息，{"Result":"ok","Reason":"xxxxx"}，如果Result字段值不等于ok会继续回调。
     */
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set 任务处理完成后的反向通知回调地址，如果不需要通知请传递空字符串。通知为POST请求，post包体数据示例{"Response":{"ItemId":"4cdad8fb86f036b06bccb3f58971c306","ShieldCode":0,"ShieldMd5":"78701576793c4a5f04e1c9660de0aa0b","ShieldSize":11997354,"TaskStatus":1,"TaskTime":1539148141}}，调用方需要返回如下信息，{"Result":"ok","Reason":"xxxxx"}，如果Result字段值不等于ok会继续回调。
     * @param CallbackUrl 任务处理完成后的反向通知回调地址，如果不需要通知请传递空字符串。通知为POST请求，post包体数据示例{"Response":{"ItemId":"4cdad8fb86f036b06bccb3f58971c306","ShieldCode":0,"ShieldMd5":"78701576793c4a5f04e1c9660de0aa0b","ShieldSize":11997354,"TaskStatus":1,"TaskTime":1539148141}}，调用方需要返回如下信息，{"Result":"ok","Reason":"xxxxx"}，如果Result字段值不等于ok会继续回调。
     */
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    /**
     * Get 提交来源 YYB-应用宝 RDM-rdm MC-控制台 MAC_TOOL-mac工具 WIN_TOOL-window工具。 
     * @return SubmitSource 提交来源 YYB-应用宝 RDM-rdm MC-控制台 MAC_TOOL-mac工具 WIN_TOOL-window工具。
     */
    public String getSubmitSource() {
        return this.SubmitSource;
    }

    /**
     * Set 提交来源 YYB-应用宝 RDM-rdm MC-控制台 MAC_TOOL-mac工具 WIN_TOOL-window工具。
     * @param SubmitSource 提交来源 YYB-应用宝 RDM-rdm MC-控制台 MAC_TOOL-mac工具 WIN_TOOL-window工具。
     */
    public void setSubmitSource(String SubmitSource) {
        this.SubmitSource = SubmitSource;
    }

    /**
     * Get 加固策略编号，如果不传则使用系统默认加固策略。如果指定的plan不存在会返回错误。 
     * @return PlanId 加固策略编号，如果不传则使用系统默认加固策略。如果指定的plan不存在会返回错误。
     */
    public Long getPlanId() {
        return this.PlanId;
    }

    /**
     * Set 加固策略编号，如果不传则使用系统默认加固策略。如果指定的plan不存在会返回错误。
     * @param PlanId 加固策略编号，如果不传则使用系统默认加固策略。如果指定的plan不存在会返回错误。
     */
    public void setPlanId(Long PlanId) {
        this.PlanId = PlanId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceEdition", this.ServiceEdition);
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);
        this.setParamSimple(map, prefix + "SubmitSource", this.SubmitSource);
        this.setParamSimple(map, prefix + "PlanId", this.PlanId);

    }
}

