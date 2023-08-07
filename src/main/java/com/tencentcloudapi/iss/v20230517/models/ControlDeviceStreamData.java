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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ControlDeviceStreamData extends AbstractModel{

    /**
    * flv 流地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Flv")
    @Expose
    private String Flv;

    /**
    * hls 流地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Hls")
    @Expose
    private String Hls;

    /**
    * rtmp 流地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Rtmp")
    @Expose
    private String Rtmp;

    /**
     * Get flv 流地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Flv flv 流地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFlv() {
        return this.Flv;
    }

    /**
     * Set flv 流地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param Flv flv 流地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFlv(String Flv) {
        this.Flv = Flv;
    }

    /**
     * Get hls 流地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Hls hls 流地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHls() {
        return this.Hls;
    }

    /**
     * Set hls 流地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param Hls hls 流地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHls(String Hls) {
        this.Hls = Hls;
    }

    /**
     * Get rtmp 流地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Rtmp rtmp 流地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRtmp() {
        return this.Rtmp;
    }

    /**
     * Set rtmp 流地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param Rtmp rtmp 流地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRtmp(String Rtmp) {
        this.Rtmp = Rtmp;
    }

    public ControlDeviceStreamData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ControlDeviceStreamData(ControlDeviceStreamData source) {
        if (source.Flv != null) {
            this.Flv = new String(source.Flv);
        }
        if (source.Hls != null) {
            this.Hls = new String(source.Hls);
        }
        if (source.Rtmp != null) {
            this.Rtmp = new String(source.Rtmp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Flv", this.Flv);
        this.setParamSimple(map, prefix + "Hls", this.Hls);
        this.setParamSimple(map, prefix + "Rtmp", this.Rtmp);

    }
}

