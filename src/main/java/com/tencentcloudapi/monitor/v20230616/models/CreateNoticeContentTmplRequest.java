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
package com.tencentcloudapi.monitor.v20230616.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateNoticeContentTmplRequest extends AbstractModel {

    /**
    * 模板名称
    */
    @SerializedName("TmplName")
    @Expose
    private String TmplName;

    /**
    * 监控类型
    */
    @SerializedName("MonitorType")
    @Expose
    private String MonitorType;

    /**
    * 模板内容
    */
    @SerializedName("TmplContents")
    @Expose
    private NoticeContentTmplItem TmplContents;

    /**
    * 模板语言 en/zh
    */
    @SerializedName("TmplLanguage")
    @Expose
    private String TmplLanguage;

    /**
     * Get 模板名称 
     * @return TmplName 模板名称
     */
    public String getTmplName() {
        return this.TmplName;
    }

    /**
     * Set 模板名称
     * @param TmplName 模板名称
     */
    public void setTmplName(String TmplName) {
        this.TmplName = TmplName;
    }

    /**
     * Get 监控类型 
     * @return MonitorType 监控类型
     */
    public String getMonitorType() {
        return this.MonitorType;
    }

    /**
     * Set 监控类型
     * @param MonitorType 监控类型
     */
    public void setMonitorType(String MonitorType) {
        this.MonitorType = MonitorType;
    }

    /**
     * Get 模板内容 
     * @return TmplContents 模板内容
     */
    public NoticeContentTmplItem getTmplContents() {
        return this.TmplContents;
    }

    /**
     * Set 模板内容
     * @param TmplContents 模板内容
     */
    public void setTmplContents(NoticeContentTmplItem TmplContents) {
        this.TmplContents = TmplContents;
    }

    /**
     * Get 模板语言 en/zh 
     * @return TmplLanguage 模板语言 en/zh
     */
    public String getTmplLanguage() {
        return this.TmplLanguage;
    }

    /**
     * Set 模板语言 en/zh
     * @param TmplLanguage 模板语言 en/zh
     */
    public void setTmplLanguage(String TmplLanguage) {
        this.TmplLanguage = TmplLanguage;
    }

    public CreateNoticeContentTmplRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateNoticeContentTmplRequest(CreateNoticeContentTmplRequest source) {
        if (source.TmplName != null) {
            this.TmplName = new String(source.TmplName);
        }
        if (source.MonitorType != null) {
            this.MonitorType = new String(source.MonitorType);
        }
        if (source.TmplContents != null) {
            this.TmplContents = new NoticeContentTmplItem(source.TmplContents);
        }
        if (source.TmplLanguage != null) {
            this.TmplLanguage = new String(source.TmplLanguage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TmplName", this.TmplName);
        this.setParamSimple(map, prefix + "MonitorType", this.MonitorType);
        this.setParamObj(map, prefix + "TmplContents.", this.TmplContents);
        this.setParamSimple(map, prefix + "TmplLanguage", this.TmplLanguage);

    }
}

