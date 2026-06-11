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

public class ProcessStepTip extends AbstractModel {

    /**
    * <p>提示信息</p>
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * <p>解决方案</p>
    */
    @SerializedName("Solution")
    @Expose
    private String Solution;

    /**
    * <p>文档提示</p>
    */
    @SerializedName("HelpDoc")
    @Expose
    private String HelpDoc;

    /**
     * Get <p>提示信息</p> 
     * @return Message <p>提示信息</p>
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set <p>提示信息</p>
     * @param Message <p>提示信息</p>
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get <p>解决方案</p> 
     * @return Solution <p>解决方案</p>
     */
    public String getSolution() {
        return this.Solution;
    }

    /**
     * Set <p>解决方案</p>
     * @param Solution <p>解决方案</p>
     */
    public void setSolution(String Solution) {
        this.Solution = Solution;
    }

    /**
     * Get <p>文档提示</p> 
     * @return HelpDoc <p>文档提示</p>
     */
    public String getHelpDoc() {
        return this.HelpDoc;
    }

    /**
     * Set <p>文档提示</p>
     * @param HelpDoc <p>文档提示</p>
     */
    public void setHelpDoc(String HelpDoc) {
        this.HelpDoc = HelpDoc;
    }

    public ProcessStepTip() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProcessStepTip(ProcessStepTip source) {
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.Solution != null) {
            this.Solution = new String(source.Solution);
        }
        if (source.HelpDoc != null) {
            this.HelpDoc = new String(source.HelpDoc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "Solution", this.Solution);
        this.setParamSimple(map, prefix + "HelpDoc", this.HelpDoc);

    }
}

