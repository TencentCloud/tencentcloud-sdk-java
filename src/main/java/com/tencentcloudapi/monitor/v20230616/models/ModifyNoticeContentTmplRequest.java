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

public class ModifyNoticeContentTmplRequest extends AbstractModel {

    /**
    * 模板名称
    */
    @SerializedName("TmplName")
    @Expose
    private String TmplName;

    /**
    * 模板内容
    */
    @SerializedName("TmplContents")
    @Expose
    private NoticeContentTmplItem TmplContents;

    /**
    * 需要修改的模板ID
    */
    @SerializedName("TmplID")
    @Expose
    private String TmplID;

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
     * Get 需要修改的模板ID 
     * @return TmplID 需要修改的模板ID
     */
    public String getTmplID() {
        return this.TmplID;
    }

    /**
     * Set 需要修改的模板ID
     * @param TmplID 需要修改的模板ID
     */
    public void setTmplID(String TmplID) {
        this.TmplID = TmplID;
    }

    public ModifyNoticeContentTmplRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyNoticeContentTmplRequest(ModifyNoticeContentTmplRequest source) {
        if (source.TmplName != null) {
            this.TmplName = new String(source.TmplName);
        }
        if (source.TmplContents != null) {
            this.TmplContents = new NoticeContentTmplItem(source.TmplContents);
        }
        if (source.TmplID != null) {
            this.TmplID = new String(source.TmplID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TmplName", this.TmplName);
        this.setParamObj(map, prefix + "TmplContents.", this.TmplContents);
        this.setParamSimple(map, prefix + "TmplID", this.TmplID);

    }
}

