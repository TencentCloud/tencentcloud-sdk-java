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

public class StreamConnectInputInterruptInfo extends AbstractModel{

    /**
    * 云转推输入源标识，取值有：
<li>Main：主源；</li>
<li>Backup：备源。</li>
    */
    @SerializedName("EndPoint")
    @Expose
    private String EndPoint;

    /**
     * Get 云转推输入源标识，取值有：
<li>Main：主源；</li>
<li>Backup：备源。</li> 
     * @return EndPoint 云转推输入源标识，取值有：
<li>Main：主源；</li>
<li>Backup：备源。</li>
     */
    public String getEndPoint() {
        return this.EndPoint;
    }

    /**
     * Set 云转推输入源标识，取值有：
<li>Main：主源；</li>
<li>Backup：备源。</li>
     * @param EndPoint 云转推输入源标识，取值有：
<li>Main：主源；</li>
<li>Backup：备源。</li>
     */
    public void setEndPoint(String EndPoint) {
        this.EndPoint = EndPoint;
    }

    public StreamConnectInputInterruptInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StreamConnectInputInterruptInfo(StreamConnectInputInterruptInfo source) {
        if (source.EndPoint != null) {
            this.EndPoint = new String(source.EndPoint);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EndPoint", this.EndPoint);

    }
}

