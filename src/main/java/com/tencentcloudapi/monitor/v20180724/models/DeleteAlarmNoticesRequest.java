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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteAlarmNoticesRequest extends AbstractModel{

    /**
    * 模块名，这里填“monitor”
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 告警通知模板id列表
    */
    @SerializedName("NoticeIds")
    @Expose
    private String [] NoticeIds;

    /**
     * Get 模块名，这里填“monitor” 
     * @return Module 模块名，这里填“monitor”
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set 模块名，这里填“monitor”
     * @param Module 模块名，这里填“monitor”
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get 告警通知模板id列表 
     * @return NoticeIds 告警通知模板id列表
     */
    public String [] getNoticeIds() {
        return this.NoticeIds;
    }

    /**
     * Set 告警通知模板id列表
     * @param NoticeIds 告警通知模板id列表
     */
    public void setNoticeIds(String [] NoticeIds) {
        this.NoticeIds = NoticeIds;
    }

    public DeleteAlarmNoticesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteAlarmNoticesRequest(DeleteAlarmNoticesRequest source) {
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.NoticeIds != null) {
            this.NoticeIds = new String[source.NoticeIds.length];
            for (int i = 0; i < source.NoticeIds.length; i++) {
                this.NoticeIds[i] = new String(source.NoticeIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamArraySimple(map, prefix + "NoticeIds.", this.NoticeIds);

    }
}

