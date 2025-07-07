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

public class SubsErr extends AbstractModel {

    /**
    * 报错信息
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 报错原因
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * 建议的修复方案
    */
    @SerializedName("Solution")
    @Expose
    private String Solution;

    /**
     * Get 报错信息 
     * @return Message 报错信息
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 报错信息
     * @param Message 报错信息
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 报错原因 
     * @return Reason 报错原因
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set 报错原因
     * @param Reason 报错原因
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get 建议的修复方案 
     * @return Solution 建议的修复方案
     */
    public String getSolution() {
        return this.Solution;
    }

    /**
     * Set 建议的修复方案
     * @param Solution 建议的修复方案
     */
    public void setSolution(String Solution) {
        this.Solution = Solution;
    }

    public SubsErr() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubsErr(SubsErr source) {
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.Solution != null) {
            this.Solution = new String(source.Solution);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "Solution", this.Solution);

    }
}

