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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StepTip extends AbstractModel {

    /**
    * 错误码
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * 错误信息
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 解决方式
    */
    @SerializedName("Solution")
    @Expose
    private String Solution;

    /**
    * 帮助文档
    */
    @SerializedName("HelpDoc")
    @Expose
    private String HelpDoc;

    /**
    * 当前步骤跳过信息
    */
    @SerializedName("SkipInfo")
    @Expose
    private String SkipInfo;

    /**
     * Get 错误码 
     * @return Code 错误码
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set 错误码
     * @param Code 错误码
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get 错误信息 
     * @return Message 错误信息
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 错误信息
     * @param Message 错误信息
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 解决方式 
     * @return Solution 解决方式
     */
    public String getSolution() {
        return this.Solution;
    }

    /**
     * Set 解决方式
     * @param Solution 解决方式
     */
    public void setSolution(String Solution) {
        this.Solution = Solution;
    }

    /**
     * Get 帮助文档 
     * @return HelpDoc 帮助文档
     */
    public String getHelpDoc() {
        return this.HelpDoc;
    }

    /**
     * Set 帮助文档
     * @param HelpDoc 帮助文档
     */
    public void setHelpDoc(String HelpDoc) {
        this.HelpDoc = HelpDoc;
    }

    /**
     * Get 当前步骤跳过信息 
     * @return SkipInfo 当前步骤跳过信息
     */
    public String getSkipInfo() {
        return this.SkipInfo;
    }

    /**
     * Set 当前步骤跳过信息
     * @param SkipInfo 当前步骤跳过信息
     */
    public void setSkipInfo(String SkipInfo) {
        this.SkipInfo = SkipInfo;
    }

    public StepTip() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StepTip(StepTip source) {
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.Solution != null) {
            this.Solution = new String(source.Solution);
        }
        if (source.HelpDoc != null) {
            this.HelpDoc = new String(source.HelpDoc);
        }
        if (source.SkipInfo != null) {
            this.SkipInfo = new String(source.SkipInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "Solution", this.Solution);
        this.setParamSimple(map, prefix + "HelpDoc", this.HelpDoc);
        this.setParamSimple(map, prefix + "SkipInfo", this.SkipInfo);

    }
}

