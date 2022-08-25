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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaCastSourceInterruptInfo extends AbstractModel{

    /**
    * 发生断流的输入源信息。
    */
    @SerializedName("SourceInfo")
    @Expose
    private MediaCastSourceInfo SourceInfo;

    /**
    * 输入源断开原因。取值有：
<li>SystemError：系统错误；</li>
<li>Unknown：未知错误。</li>
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
     * Get 发生断流的输入源信息。 
     * @return SourceInfo 发生断流的输入源信息。
     */
    public MediaCastSourceInfo getSourceInfo() {
        return this.SourceInfo;
    }

    /**
     * Set 发生断流的输入源信息。
     * @param SourceInfo 发生断流的输入源信息。
     */
    public void setSourceInfo(MediaCastSourceInfo SourceInfo) {
        this.SourceInfo = SourceInfo;
    }

    /**
     * Get 输入源断开原因。取值有：
<li>SystemError：系统错误；</li>
<li>Unknown：未知错误。</li> 
     * @return Reason 输入源断开原因。取值有：
<li>SystemError：系统错误；</li>
<li>Unknown：未知错误。</li>
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set 输入源断开原因。取值有：
<li>SystemError：系统错误；</li>
<li>Unknown：未知错误。</li>
     * @param Reason 输入源断开原因。取值有：
<li>SystemError：系统错误；</li>
<li>Unknown：未知错误。</li>
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    public MediaCastSourceInterruptInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaCastSourceInterruptInfo(MediaCastSourceInterruptInfo source) {
        if (source.SourceInfo != null) {
            this.SourceInfo = new MediaCastSourceInfo(source.SourceInfo);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "SourceInfo.", this.SourceInfo);
        this.setParamSimple(map, prefix + "Reason", this.Reason);

    }
}

