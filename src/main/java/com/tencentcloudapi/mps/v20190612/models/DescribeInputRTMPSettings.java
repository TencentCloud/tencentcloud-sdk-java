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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInputRTMPSettings extends AbstractModel{

    /**
    * RTMP的推流路径。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * RTMP的推流StreamKey。
RTMP的推流地址拼接规则为：rtmp://Ip:1935/AppName/StreamKey
    */
    @SerializedName("StreamKey")
    @Expose
    private String StreamKey;

    /**
     * Get RTMP的推流路径。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppName RTMP的推流路径。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set RTMP的推流路径。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppName RTMP的推流路径。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get RTMP的推流StreamKey。
RTMP的推流地址拼接规则为：rtmp://Ip:1935/AppName/StreamKey 
     * @return StreamKey RTMP的推流StreamKey。
RTMP的推流地址拼接规则为：rtmp://Ip:1935/AppName/StreamKey
     */
    public String getStreamKey() {
        return this.StreamKey;
    }

    /**
     * Set RTMP的推流StreamKey。
RTMP的推流地址拼接规则为：rtmp://Ip:1935/AppName/StreamKey
     * @param StreamKey RTMP的推流StreamKey。
RTMP的推流地址拼接规则为：rtmp://Ip:1935/AppName/StreamKey
     */
    public void setStreamKey(String StreamKey) {
        this.StreamKey = StreamKey;
    }

    public DescribeInputRTMPSettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInputRTMPSettings(DescribeInputRTMPSettings source) {
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.StreamKey != null) {
            this.StreamKey = new String(source.StreamKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "StreamKey", this.StreamKey);

    }
}

