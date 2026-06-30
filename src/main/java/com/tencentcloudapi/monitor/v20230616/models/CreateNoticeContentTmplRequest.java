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
    * <p>模板名称</p>
    */
    @SerializedName("TmplName")
    @Expose
    private String TmplName;

    /**
    * <p>监控类型</p>
    */
    @SerializedName("MonitorType")
    @Expose
    private String MonitorType;

    /**
    * <p>模板内容</p>
    */
    @SerializedName("TmplContents")
    @Expose
    private NoticeContentTmplItem TmplContents;

    /**
    * <p>模板语言 en/zh</p>
    */
    @SerializedName("TmplLanguage")
    @Expose
    private String TmplLanguage;

    /**
     * Get <p>模板名称</p> 
     * @return TmplName <p>模板名称</p>
     */
    public String getTmplName() {
        return this.TmplName;
    }

    /**
     * Set <p>模板名称</p>
     * @param TmplName <p>模板名称</p>
     */
    public void setTmplName(String TmplName) {
        this.TmplName = TmplName;
    }

    /**
     * Get <p>监控类型</p> 
     * @return MonitorType <p>监控类型</p>
     */
    public String getMonitorType() {
        return this.MonitorType;
    }

    /**
     * Set <p>监控类型</p>
     * @param MonitorType <p>监控类型</p>
     */
    public void setMonitorType(String MonitorType) {
        this.MonitorType = MonitorType;
    }

    /**
     * Get <p>模板内容</p> 
     * @return TmplContents <p>模板内容</p>
     */
    public NoticeContentTmplItem getTmplContents() {
        return this.TmplContents;
    }

    /**
     * Set <p>模板内容</p>
     * @param TmplContents <p>模板内容</p>
     */
    public void setTmplContents(NoticeContentTmplItem TmplContents) {
        this.TmplContents = TmplContents;
    }

    /**
     * Get <p>模板语言 en/zh</p> 
     * @return TmplLanguage <p>模板语言 en/zh</p>
     */
    public String getTmplLanguage() {
        return this.TmplLanguage;
    }

    /**
     * Set <p>模板语言 en/zh</p>
     * @param TmplLanguage <p>模板语言 en/zh</p>
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

