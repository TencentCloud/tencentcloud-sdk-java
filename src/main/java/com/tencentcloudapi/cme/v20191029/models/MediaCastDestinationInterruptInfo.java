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

public class MediaCastDestinationInterruptInfo extends AbstractModel{

    /**
    * 发生断流的输出源信息。
    */
    @SerializedName("DestinationInfo")
    @Expose
    private MediaCastDestinationInfo DestinationInfo;

    /**
    * 输出源断流原因，取值有：
<li>SystemError：系统错误；</li>
<li>Unknown：未知错误。</li>
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
     * Get 发生断流的输出源信息。 
     * @return DestinationInfo 发生断流的输出源信息。
     */
    public MediaCastDestinationInfo getDestinationInfo() {
        return this.DestinationInfo;
    }

    /**
     * Set 发生断流的输出源信息。
     * @param DestinationInfo 发生断流的输出源信息。
     */
    public void setDestinationInfo(MediaCastDestinationInfo DestinationInfo) {
        this.DestinationInfo = DestinationInfo;
    }

    /**
     * Get 输出源断流原因，取值有：
<li>SystemError：系统错误；</li>
<li>Unknown：未知错误。</li> 
     * @return Reason 输出源断流原因，取值有：
<li>SystemError：系统错误；</li>
<li>Unknown：未知错误。</li>
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set 输出源断流原因，取值有：
<li>SystemError：系统错误；</li>
<li>Unknown：未知错误。</li>
     * @param Reason 输出源断流原因，取值有：
<li>SystemError：系统错误；</li>
<li>Unknown：未知错误。</li>
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    public MediaCastDestinationInterruptInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaCastDestinationInterruptInfo(MediaCastDestinationInterruptInfo source) {
        if (source.DestinationInfo != null) {
            this.DestinationInfo = new MediaCastDestinationInfo(source.DestinationInfo);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "DestinationInfo.", this.DestinationInfo);
        this.setParamSimple(map, prefix + "Reason", this.Reason);

    }
}

