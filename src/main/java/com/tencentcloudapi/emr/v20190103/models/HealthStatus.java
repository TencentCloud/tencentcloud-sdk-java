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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HealthStatus extends AbstractModel {

    /**
    * 运行正常
    */
    @SerializedName("Code")
    @Expose
    private Long Code;

    /**
    * 运行正常
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 运行正常
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
     * Get 运行正常 
     * @return Code 运行正常
     */
    public Long getCode() {
        return this.Code;
    }

    /**
     * Set 运行正常
     * @param Code 运行正常
     */
    public void setCode(Long Code) {
        this.Code = Code;
    }

    /**
     * Get 运行正常 
     * @return Text 运行正常
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 运行正常
     * @param Text 运行正常
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get 运行正常 
     * @return Desc 运行正常
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set 运行正常
     * @param Desc 运行正常
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    public HealthStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HealthStatus(HealthStatus source) {
        if (source.Code != null) {
            this.Code = new Long(source.Code);
        }
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "Desc", this.Desc);

    }
}

