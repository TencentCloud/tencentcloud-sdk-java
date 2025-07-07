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
package com.tencentcloudapi.vrs.v20200824.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VoiceTypeListData extends AbstractModel {

    /**
    * 音色信息列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VoiceTypeList")
    @Expose
    private VoiceTypeInfo [] VoiceTypeList;

    /**
     * Get 音色信息列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VoiceTypeList 音色信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VoiceTypeInfo [] getVoiceTypeList() {
        return this.VoiceTypeList;
    }

    /**
     * Set 音色信息列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param VoiceTypeList 音色信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVoiceTypeList(VoiceTypeInfo [] VoiceTypeList) {
        this.VoiceTypeList = VoiceTypeList;
    }

    public VoiceTypeListData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VoiceTypeListData(VoiceTypeListData source) {
        if (source.VoiceTypeList != null) {
            this.VoiceTypeList = new VoiceTypeInfo[source.VoiceTypeList.length];
            for (int i = 0; i < source.VoiceTypeList.length; i++) {
                this.VoiceTypeList[i] = new VoiceTypeInfo(source.VoiceTypeList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "VoiceTypeList.", this.VoiceTypeList);

    }
}

