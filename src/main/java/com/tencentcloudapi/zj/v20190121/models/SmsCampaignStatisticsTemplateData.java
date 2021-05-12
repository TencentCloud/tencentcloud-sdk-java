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
package com.tencentcloudapi.zj.v20190121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SmsCampaignStatisticsTemplateData extends AbstractModel{

    /**
    * 模板或样例id
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * 模板内容
    */
    @SerializedName("TemplateContent")
    @Expose
    private String TemplateContent;

    /**
    * 触达成功数
    */
    @SerializedName("SendCount")
    @Expose
    private Long SendCount;

    /**
    * 短链点击数
    */
    @SerializedName("ClickCount")
    @Expose
    private Long ClickCount;

    /**
     * Get 模板或样例id 
     * @return TemplateId 模板或样例id
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 模板或样例id
     * @param TemplateId 模板或样例id
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 模板内容 
     * @return TemplateContent 模板内容
     */
    public String getTemplateContent() {
        return this.TemplateContent;
    }

    /**
     * Set 模板内容
     * @param TemplateContent 模板内容
     */
    public void setTemplateContent(String TemplateContent) {
        this.TemplateContent = TemplateContent;
    }

    /**
     * Get 触达成功数 
     * @return SendCount 触达成功数
     */
    public Long getSendCount() {
        return this.SendCount;
    }

    /**
     * Set 触达成功数
     * @param SendCount 触达成功数
     */
    public void setSendCount(Long SendCount) {
        this.SendCount = SendCount;
    }

    /**
     * Get 短链点击数 
     * @return ClickCount 短链点击数
     */
    public Long getClickCount() {
        return this.ClickCount;
    }

    /**
     * Set 短链点击数
     * @param ClickCount 短链点击数
     */
    public void setClickCount(Long ClickCount) {
        this.ClickCount = ClickCount;
    }

    public SmsCampaignStatisticsTemplateData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SmsCampaignStatisticsTemplateData(SmsCampaignStatisticsTemplateData source) {
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.TemplateContent != null) {
            this.TemplateContent = new String(source.TemplateContent);
        }
        if (source.SendCount != null) {
            this.SendCount = new Long(source.SendCount);
        }
        if (source.ClickCount != null) {
            this.ClickCount = new Long(source.ClickCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "TemplateContent", this.TemplateContent);
        this.setParamSimple(map, prefix + "SendCount", this.SendCount);
        this.setParamSimple(map, prefix + "ClickCount", this.ClickCount);

    }
}

