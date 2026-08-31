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

public class FeiShuRobotNoticeTmpl extends AbstractModel {

    /**
    * <p>内容模板</p>
    */
    @SerializedName("ContentTmpl")
    @Expose
    private String ContentTmpl;

    /**
    * <p>标题模板</p>
    */
    @SerializedName("TitleTmpl")
    @Expose
    private String TitleTmpl;

    /**
    * <p>通知内容模版标题自定义颜色</p>
    */
    @SerializedName("TitleColor")
    @Expose
    private RobotNoticeTitleColor TitleColor;

    /**
     * Get <p>内容模板</p> 
     * @return ContentTmpl <p>内容模板</p>
     */
    public String getContentTmpl() {
        return this.ContentTmpl;
    }

    /**
     * Set <p>内容模板</p>
     * @param ContentTmpl <p>内容模板</p>
     */
    public void setContentTmpl(String ContentTmpl) {
        this.ContentTmpl = ContentTmpl;
    }

    /**
     * Get <p>标题模板</p> 
     * @return TitleTmpl <p>标题模板</p>
     */
    public String getTitleTmpl() {
        return this.TitleTmpl;
    }

    /**
     * Set <p>标题模板</p>
     * @param TitleTmpl <p>标题模板</p>
     */
    public void setTitleTmpl(String TitleTmpl) {
        this.TitleTmpl = TitleTmpl;
    }

    /**
     * Get <p>通知内容模版标题自定义颜色</p> 
     * @return TitleColor <p>通知内容模版标题自定义颜色</p>
     */
    public RobotNoticeTitleColor getTitleColor() {
        return this.TitleColor;
    }

    /**
     * Set <p>通知内容模版标题自定义颜色</p>
     * @param TitleColor <p>通知内容模版标题自定义颜色</p>
     */
    public void setTitleColor(RobotNoticeTitleColor TitleColor) {
        this.TitleColor = TitleColor;
    }

    public FeiShuRobotNoticeTmpl() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FeiShuRobotNoticeTmpl(FeiShuRobotNoticeTmpl source) {
        if (source.ContentTmpl != null) {
            this.ContentTmpl = new String(source.ContentTmpl);
        }
        if (source.TitleTmpl != null) {
            this.TitleTmpl = new String(source.TitleTmpl);
        }
        if (source.TitleColor != null) {
            this.TitleColor = new RobotNoticeTitleColor(source.TitleColor);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ContentTmpl", this.ContentTmpl);
        this.setParamSimple(map, prefix + "TitleTmpl", this.TitleTmpl);
        this.setParamObj(map, prefix + "TitleColor.", this.TitleColor);

    }
}

