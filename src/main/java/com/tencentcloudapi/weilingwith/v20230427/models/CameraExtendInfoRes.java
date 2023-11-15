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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CameraExtendInfoRes extends AbstractModel {

    /**
    * 存储方式 (nvr或cosmtav)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SaveType")
    @Expose
    private String SaveType;

    /**
    * 云存储天数（save_type是cosmtav时这个参数才有效）

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SaveDay")
    @Expose
    private Long SaveDay;

    /**
    * 实时分辨率
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LiveResolution")
    @Expose
    private Long LiveResolution;

    /**
    * 历史分辨率
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HistoryResolution")
    @Expose
    private Long HistoryResolution;

    /**
     * Get 存储方式 (nvr或cosmtav)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SaveType 存储方式 (nvr或cosmtav)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSaveType() {
        return this.SaveType;
    }

    /**
     * Set 存储方式 (nvr或cosmtav)
注意：此字段可能返回 null，表示取不到有效值。
     * @param SaveType 存储方式 (nvr或cosmtav)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSaveType(String SaveType) {
        this.SaveType = SaveType;
    }

    /**
     * Get 云存储天数（save_type是cosmtav时这个参数才有效）

注意：此字段可能返回 null，表示取不到有效值。 
     * @return SaveDay 云存储天数（save_type是cosmtav时这个参数才有效）

注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSaveDay() {
        return this.SaveDay;
    }

    /**
     * Set 云存储天数（save_type是cosmtav时这个参数才有效）

注意：此字段可能返回 null，表示取不到有效值。
     * @param SaveDay 云存储天数（save_type是cosmtav时这个参数才有效）

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSaveDay(Long SaveDay) {
        this.SaveDay = SaveDay;
    }

    /**
     * Get 实时分辨率
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LiveResolution 实时分辨率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLiveResolution() {
        return this.LiveResolution;
    }

    /**
     * Set 实时分辨率
注意：此字段可能返回 null，表示取不到有效值。
     * @param LiveResolution 实时分辨率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLiveResolution(Long LiveResolution) {
        this.LiveResolution = LiveResolution;
    }

    /**
     * Get 历史分辨率
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HistoryResolution 历史分辨率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHistoryResolution() {
        return this.HistoryResolution;
    }

    /**
     * Set 历史分辨率
注意：此字段可能返回 null，表示取不到有效值。
     * @param HistoryResolution 历史分辨率
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHistoryResolution(Long HistoryResolution) {
        this.HistoryResolution = HistoryResolution;
    }

    public CameraExtendInfoRes() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CameraExtendInfoRes(CameraExtendInfoRes source) {
        if (source.SaveType != null) {
            this.SaveType = new String(source.SaveType);
        }
        if (source.SaveDay != null) {
            this.SaveDay = new Long(source.SaveDay);
        }
        if (source.LiveResolution != null) {
            this.LiveResolution = new Long(source.LiveResolution);
        }
        if (source.HistoryResolution != null) {
            this.HistoryResolution = new Long(source.HistoryResolution);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SaveType", this.SaveType);
        this.setParamSimple(map, prefix + "SaveDay", this.SaveDay);
        this.setParamSimple(map, prefix + "LiveResolution", this.LiveResolution);
        this.setParamSimple(map, prefix + "HistoryResolution", this.HistoryResolution);

    }
}

