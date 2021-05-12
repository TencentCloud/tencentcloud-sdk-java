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

public class StreamConnectOutputInfo extends AbstractModel{

    /**
    * 输出源。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StreamConnectOutput")
    @Expose
    private StreamConnectOutput StreamConnectOutput;

    /**
    * 输出流状态：
<li>On ：开；</li>
<li>Off ：关 。</li>
    */
    @SerializedName("PushSwitch")
    @Expose
    private String PushSwitch;

    /**
     * Get 输出源。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StreamConnectOutput 输出源。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StreamConnectOutput getStreamConnectOutput() {
        return this.StreamConnectOutput;
    }

    /**
     * Set 输出源。
注意：此字段可能返回 null，表示取不到有效值。
     * @param StreamConnectOutput 输出源。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStreamConnectOutput(StreamConnectOutput StreamConnectOutput) {
        this.StreamConnectOutput = StreamConnectOutput;
    }

    /**
     * Get 输出流状态：
<li>On ：开；</li>
<li>Off ：关 。</li> 
     * @return PushSwitch 输出流状态：
<li>On ：开；</li>
<li>Off ：关 。</li>
     */
    public String getPushSwitch() {
        return this.PushSwitch;
    }

    /**
     * Set 输出流状态：
<li>On ：开；</li>
<li>Off ：关 。</li>
     * @param PushSwitch 输出流状态：
<li>On ：开；</li>
<li>Off ：关 。</li>
     */
    public void setPushSwitch(String PushSwitch) {
        this.PushSwitch = PushSwitch;
    }

    public StreamConnectOutputInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StreamConnectOutputInfo(StreamConnectOutputInfo source) {
        if (source.StreamConnectOutput != null) {
            this.StreamConnectOutput = new StreamConnectOutput(source.StreamConnectOutput);
        }
        if (source.PushSwitch != null) {
            this.PushSwitch = new String(source.PushSwitch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "StreamConnectOutput.", this.StreamConnectOutput);
        this.setParamSimple(map, prefix + "PushSwitch", this.PushSwitch);

    }
}

