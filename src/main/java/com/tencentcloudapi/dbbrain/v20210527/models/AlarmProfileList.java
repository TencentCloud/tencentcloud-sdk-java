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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlarmProfileList extends AbstractModel {

    /**
    * 0-不是 1-是
    */
    @SerializedName("IsWebHook")
    @Expose
    private Long IsWebHook;

    /**
    * 接收告警用户数量
    */
    @SerializedName("ReceiveUinCount")
    @Expose
    private Long ReceiveUinCount;

    /**
    * 语言
    */
    @SerializedName("Lang")
    @Expose
    private String Lang;

    /**
    * 模板类型
    */
    @SerializedName("TemplateType")
    @Expose
    private String TemplateType;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 接收组数量
    */
    @SerializedName("ReceiveGroupCount")
    @Expose
    private Long ReceiveGroupCount;

    /**
    * 更新用户的uin
    */
    @SerializedName("UpdateUin")
    @Expose
    private Long UpdateUin;

    /**
    * 接收类型
    */
    @SerializedName("ReceiveType")
    @Expose
    private Long [] ReceiveType;

    /**
    * 接收用户信息
    */
    @SerializedName("ReceiveInfo")
    @Expose
    private ReceiveInfo [] ReceiveInfo;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 模板名
    */
    @SerializedName("TemplateName")
    @Expose
    private String TemplateName;

    /**
    * 发送渠道
    */
    @SerializedName("SendChannel")
    @Expose
    private Long [] SendChannel;

    /**
    * 模板id
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
    * webhook数量
    */
    @SerializedName("WebHookCount")
    @Expose
    private Long WebHookCount;

    /**
     * Get 0-不是 1-是 
     * @return IsWebHook 0-不是 1-是
     */
    public Long getIsWebHook() {
        return this.IsWebHook;
    }

    /**
     * Set 0-不是 1-是
     * @param IsWebHook 0-不是 1-是
     */
    public void setIsWebHook(Long IsWebHook) {
        this.IsWebHook = IsWebHook;
    }

    /**
     * Get 接收告警用户数量 
     * @return ReceiveUinCount 接收告警用户数量
     */
    public Long getReceiveUinCount() {
        return this.ReceiveUinCount;
    }

    /**
     * Set 接收告警用户数量
     * @param ReceiveUinCount 接收告警用户数量
     */
    public void setReceiveUinCount(Long ReceiveUinCount) {
        this.ReceiveUinCount = ReceiveUinCount;
    }

    /**
     * Get 语言 
     * @return Lang 语言
     */
    public String getLang() {
        return this.Lang;
    }

    /**
     * Set 语言
     * @param Lang 语言
     */
    public void setLang(String Lang) {
        this.Lang = Lang;
    }

    /**
     * Get 模板类型 
     * @return TemplateType 模板类型
     */
    public String getTemplateType() {
        return this.TemplateType;
    }

    /**
     * Set 模板类型
     * @param TemplateType 模板类型
     */
    public void setTemplateType(String TemplateType) {
        this.TemplateType = TemplateType;
    }

    /**
     * Get 备注 
     * @return Remark 备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
     * @param Remark 备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 接收组数量 
     * @return ReceiveGroupCount 接收组数量
     */
    public Long getReceiveGroupCount() {
        return this.ReceiveGroupCount;
    }

    /**
     * Set 接收组数量
     * @param ReceiveGroupCount 接收组数量
     */
    public void setReceiveGroupCount(Long ReceiveGroupCount) {
        this.ReceiveGroupCount = ReceiveGroupCount;
    }

    /**
     * Get 更新用户的uin 
     * @return UpdateUin 更新用户的uin
     */
    public Long getUpdateUin() {
        return this.UpdateUin;
    }

    /**
     * Set 更新用户的uin
     * @param UpdateUin 更新用户的uin
     */
    public void setUpdateUin(Long UpdateUin) {
        this.UpdateUin = UpdateUin;
    }

    /**
     * Get 接收类型 
     * @return ReceiveType 接收类型
     */
    public Long [] getReceiveType() {
        return this.ReceiveType;
    }

    /**
     * Set 接收类型
     * @param ReceiveType 接收类型
     */
    public void setReceiveType(Long [] ReceiveType) {
        this.ReceiveType = ReceiveType;
    }

    /**
     * Get 接收用户信息 
     * @return ReceiveInfo 接收用户信息
     */
    public ReceiveInfo [] getReceiveInfo() {
        return this.ReceiveInfo;
    }

    /**
     * Set 接收用户信息
     * @param ReceiveInfo 接收用户信息
     */
    public void setReceiveInfo(ReceiveInfo [] ReceiveInfo) {
        this.ReceiveInfo = ReceiveInfo;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 模板名 
     * @return TemplateName 模板名
     */
    public String getTemplateName() {
        return this.TemplateName;
    }

    /**
     * Set 模板名
     * @param TemplateName 模板名
     */
    public void setTemplateName(String TemplateName) {
        this.TemplateName = TemplateName;
    }

    /**
     * Get 发送渠道 
     * @return SendChannel 发送渠道
     */
    public Long [] getSendChannel() {
        return this.SendChannel;
    }

    /**
     * Set 发送渠道
     * @param SendChannel 发送渠道
     */
    public void setSendChannel(Long [] SendChannel) {
        this.SendChannel = SendChannel;
    }

    /**
     * Get 模板id 
     * @return TemplateId 模板id
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 模板id
     * @param TemplateId 模板id
     */
    public void setTemplateId(Long TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get webhook数量 
     * @return WebHookCount webhook数量
     */
    public Long getWebHookCount() {
        return this.WebHookCount;
    }

    /**
     * Set webhook数量
     * @param WebHookCount webhook数量
     */
    public void setWebHookCount(Long WebHookCount) {
        this.WebHookCount = WebHookCount;
    }

    public AlarmProfileList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlarmProfileList(AlarmProfileList source) {
        if (source.IsWebHook != null) {
            this.IsWebHook = new Long(source.IsWebHook);
        }
        if (source.ReceiveUinCount != null) {
            this.ReceiveUinCount = new Long(source.ReceiveUinCount);
        }
        if (source.Lang != null) {
            this.Lang = new String(source.Lang);
        }
        if (source.TemplateType != null) {
            this.TemplateType = new String(source.TemplateType);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.ReceiveGroupCount != null) {
            this.ReceiveGroupCount = new Long(source.ReceiveGroupCount);
        }
        if (source.UpdateUin != null) {
            this.UpdateUin = new Long(source.UpdateUin);
        }
        if (source.ReceiveType != null) {
            this.ReceiveType = new Long[source.ReceiveType.length];
            for (int i = 0; i < source.ReceiveType.length; i++) {
                this.ReceiveType[i] = new Long(source.ReceiveType[i]);
            }
        }
        if (source.ReceiveInfo != null) {
            this.ReceiveInfo = new ReceiveInfo[source.ReceiveInfo.length];
            for (int i = 0; i < source.ReceiveInfo.length; i++) {
                this.ReceiveInfo[i] = new ReceiveInfo(source.ReceiveInfo[i]);
            }
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.TemplateName != null) {
            this.TemplateName = new String(source.TemplateName);
        }
        if (source.SendChannel != null) {
            this.SendChannel = new Long[source.SendChannel.length];
            for (int i = 0; i < source.SendChannel.length; i++) {
                this.SendChannel[i] = new Long(source.SendChannel[i]);
            }
        }
        if (source.TemplateId != null) {
            this.TemplateId = new Long(source.TemplateId);
        }
        if (source.WebHookCount != null) {
            this.WebHookCount = new Long(source.WebHookCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsWebHook", this.IsWebHook);
        this.setParamSimple(map, prefix + "ReceiveUinCount", this.ReceiveUinCount);
        this.setParamSimple(map, prefix + "Lang", this.Lang);
        this.setParamSimple(map, prefix + "TemplateType", this.TemplateType);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "ReceiveGroupCount", this.ReceiveGroupCount);
        this.setParamSimple(map, prefix + "UpdateUin", this.UpdateUin);
        this.setParamArraySimple(map, prefix + "ReceiveType.", this.ReceiveType);
        this.setParamArrayObj(map, prefix + "ReceiveInfo.", this.ReceiveInfo);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "TemplateName", this.TemplateName);
        this.setParamArraySimple(map, prefix + "SendChannel.", this.SendChannel);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "WebHookCount", this.WebHookCount);

    }
}

