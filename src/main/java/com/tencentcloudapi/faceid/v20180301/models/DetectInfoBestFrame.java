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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DetectInfoBestFrame extends AbstractModel{

    /**
    * 活体比对最佳帧。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BestFrame")
    @Expose
    private String BestFrame;

    /**
    * 自截帧。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BestFrames")
    @Expose
    private String [] BestFrames;

    /**
     * Get 活体比对最佳帧。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BestFrame 活体比对最佳帧。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBestFrame() {
        return this.BestFrame;
    }

    /**
     * Set 活体比对最佳帧。
注意：此字段可能返回 null，表示取不到有效值。
     * @param BestFrame 活体比对最佳帧。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBestFrame(String BestFrame) {
        this.BestFrame = BestFrame;
    }

    /**
     * Get 自截帧。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BestFrames 自截帧。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getBestFrames() {
        return this.BestFrames;
    }

    /**
     * Set 自截帧。
注意：此字段可能返回 null，表示取不到有效值。
     * @param BestFrames 自截帧。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBestFrames(String [] BestFrames) {
        this.BestFrames = BestFrames;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BestFrame", this.BestFrame);
        this.setParamArraySimple(map, prefix + "BestFrames.", this.BestFrames);

    }
}

