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

public class ServiceProcessFunctionInfo extends AbstractModel {

    /**
    * 探测告警级别
    */
    @SerializedName("DetectAlert")
    @Expose
    private String DetectAlert;

    /**
    * 探测功能描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DetetcFunctionKey")
    @Expose
    private String DetetcFunctionKey;

    /**
    * 探测功能结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DetetcFunctionValue")
    @Expose
    private String DetetcFunctionValue;

    /**
    * 探测结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DetetcTime")
    @Expose
    private String DetetcTime;

    /**
    * 探测功能描述
    */
    @SerializedName("DetectFunctionKey")
    @Expose
    private String DetectFunctionKey;

    /**
    * 探测功能结果
    */
    @SerializedName("DetectFunctionValue")
    @Expose
    private String DetectFunctionValue;

    /**
    * 探测结果
    */
    @SerializedName("DetectTime")
    @Expose
    private String DetectTime;

    /**
     * Get 探测告警级别 
     * @return DetectAlert 探测告警级别
     */
    public String getDetectAlert() {
        return this.DetectAlert;
    }

    /**
     * Set 探测告警级别
     * @param DetectAlert 探测告警级别
     */
    public void setDetectAlert(String DetectAlert) {
        this.DetectAlert = DetectAlert;
    }

    /**
     * Get 探测功能描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DetetcFunctionKey 探测功能描述
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public String getDetetcFunctionKey() {
        return this.DetetcFunctionKey;
    }

    /**
     * Set 探测功能描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param DetetcFunctionKey 探测功能描述
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setDetetcFunctionKey(String DetetcFunctionKey) {
        this.DetetcFunctionKey = DetetcFunctionKey;
    }

    /**
     * Get 探测功能结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DetetcFunctionValue 探测功能结果
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public String getDetetcFunctionValue() {
        return this.DetetcFunctionValue;
    }

    /**
     * Set 探测功能结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param DetetcFunctionValue 探测功能结果
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setDetetcFunctionValue(String DetetcFunctionValue) {
        this.DetetcFunctionValue = DetetcFunctionValue;
    }

    /**
     * Get 探测结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DetetcTime 探测结果
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public String getDetetcTime() {
        return this.DetetcTime;
    }

    /**
     * Set 探测结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param DetetcTime 探测结果
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setDetetcTime(String DetetcTime) {
        this.DetetcTime = DetetcTime;
    }

    /**
     * Get 探测功能描述 
     * @return DetectFunctionKey 探测功能描述
     */
    public String getDetectFunctionKey() {
        return this.DetectFunctionKey;
    }

    /**
     * Set 探测功能描述
     * @param DetectFunctionKey 探测功能描述
     */
    public void setDetectFunctionKey(String DetectFunctionKey) {
        this.DetectFunctionKey = DetectFunctionKey;
    }

    /**
     * Get 探测功能结果 
     * @return DetectFunctionValue 探测功能结果
     */
    public String getDetectFunctionValue() {
        return this.DetectFunctionValue;
    }

    /**
     * Set 探测功能结果
     * @param DetectFunctionValue 探测功能结果
     */
    public void setDetectFunctionValue(String DetectFunctionValue) {
        this.DetectFunctionValue = DetectFunctionValue;
    }

    /**
     * Get 探测结果 
     * @return DetectTime 探测结果
     */
    public String getDetectTime() {
        return this.DetectTime;
    }

    /**
     * Set 探测结果
     * @param DetectTime 探测结果
     */
    public void setDetectTime(String DetectTime) {
        this.DetectTime = DetectTime;
    }

    public ServiceProcessFunctionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServiceProcessFunctionInfo(ServiceProcessFunctionInfo source) {
        if (source.DetectAlert != null) {
            this.DetectAlert = new String(source.DetectAlert);
        }
        if (source.DetetcFunctionKey != null) {
            this.DetetcFunctionKey = new String(source.DetetcFunctionKey);
        }
        if (source.DetetcFunctionValue != null) {
            this.DetetcFunctionValue = new String(source.DetetcFunctionValue);
        }
        if (source.DetetcTime != null) {
            this.DetetcTime = new String(source.DetetcTime);
        }
        if (source.DetectFunctionKey != null) {
            this.DetectFunctionKey = new String(source.DetectFunctionKey);
        }
        if (source.DetectFunctionValue != null) {
            this.DetectFunctionValue = new String(source.DetectFunctionValue);
        }
        if (source.DetectTime != null) {
            this.DetectTime = new String(source.DetectTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DetectAlert", this.DetectAlert);
        this.setParamSimple(map, prefix + "DetetcFunctionKey", this.DetetcFunctionKey);
        this.setParamSimple(map, prefix + "DetetcFunctionValue", this.DetetcFunctionValue);
        this.setParamSimple(map, prefix + "DetetcTime", this.DetetcTime);
        this.setParamSimple(map, prefix + "DetectFunctionKey", this.DetectFunctionKey);
        this.setParamSimple(map, prefix + "DetectFunctionValue", this.DetectFunctionValue);
        this.setParamSimple(map, prefix + "DetectTime", this.DetectTime);

    }
}

