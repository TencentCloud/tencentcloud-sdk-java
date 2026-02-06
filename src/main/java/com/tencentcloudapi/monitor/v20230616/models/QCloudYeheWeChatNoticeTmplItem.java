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

public class QCloudYeheWeChatNoticeTmplItem extends AbstractModel {

    /**
    * 告警内容模板
    */
    @SerializedName("AlarmContentTmpl")
    @Expose
    private String AlarmContentTmpl;

    /**
    * 告警对象模板
    */
    @SerializedName("AlarmObjectTmpl")
    @Expose
    private String AlarmObjectTmpl;

    /**
    * 告警地域模板
    */
    @SerializedName("AlarmRegionTmpl")
    @Expose
    private String AlarmRegionTmpl;

    /**
    * 告警时间模板
    */
    @SerializedName("AlarmTimeTmpl")
    @Expose
    private String AlarmTimeTmpl;

    /**
     * Get 告警内容模板 
     * @return AlarmContentTmpl 告警内容模板
     */
    public String getAlarmContentTmpl() {
        return this.AlarmContentTmpl;
    }

    /**
     * Set 告警内容模板
     * @param AlarmContentTmpl 告警内容模板
     */
    public void setAlarmContentTmpl(String AlarmContentTmpl) {
        this.AlarmContentTmpl = AlarmContentTmpl;
    }

    /**
     * Get 告警对象模板 
     * @return AlarmObjectTmpl 告警对象模板
     */
    public String getAlarmObjectTmpl() {
        return this.AlarmObjectTmpl;
    }

    /**
     * Set 告警对象模板
     * @param AlarmObjectTmpl 告警对象模板
     */
    public void setAlarmObjectTmpl(String AlarmObjectTmpl) {
        this.AlarmObjectTmpl = AlarmObjectTmpl;
    }

    /**
     * Get 告警地域模板 
     * @return AlarmRegionTmpl 告警地域模板
     */
    public String getAlarmRegionTmpl() {
        return this.AlarmRegionTmpl;
    }

    /**
     * Set 告警地域模板
     * @param AlarmRegionTmpl 告警地域模板
     */
    public void setAlarmRegionTmpl(String AlarmRegionTmpl) {
        this.AlarmRegionTmpl = AlarmRegionTmpl;
    }

    /**
     * Get 告警时间模板 
     * @return AlarmTimeTmpl 告警时间模板
     */
    public String getAlarmTimeTmpl() {
        return this.AlarmTimeTmpl;
    }

    /**
     * Set 告警时间模板
     * @param AlarmTimeTmpl 告警时间模板
     */
    public void setAlarmTimeTmpl(String AlarmTimeTmpl) {
        this.AlarmTimeTmpl = AlarmTimeTmpl;
    }

    public QCloudYeheWeChatNoticeTmplItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QCloudYeheWeChatNoticeTmplItem(QCloudYeheWeChatNoticeTmplItem source) {
        if (source.AlarmContentTmpl != null) {
            this.AlarmContentTmpl = new String(source.AlarmContentTmpl);
        }
        if (source.AlarmObjectTmpl != null) {
            this.AlarmObjectTmpl = new String(source.AlarmObjectTmpl);
        }
        if (source.AlarmRegionTmpl != null) {
            this.AlarmRegionTmpl = new String(source.AlarmRegionTmpl);
        }
        if (source.AlarmTimeTmpl != null) {
            this.AlarmTimeTmpl = new String(source.AlarmTimeTmpl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AlarmContentTmpl", this.AlarmContentTmpl);
        this.setParamSimple(map, prefix + "AlarmObjectTmpl", this.AlarmObjectTmpl);
        this.setParamSimple(map, prefix + "AlarmRegionTmpl", this.AlarmRegionTmpl);
        this.setParamSimple(map, prefix + "AlarmTimeTmpl", this.AlarmTimeTmpl);

    }
}

