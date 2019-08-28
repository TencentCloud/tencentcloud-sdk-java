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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaSnapshotByTimePicInfoItem  extends AbstractModel{

    /**
    * 该张截图对应视频文件中的时间偏移，单位为<font color=red>毫秒</font>。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeOffset")
    @Expose
    private Float TimeOffset;

    /**
    * 该张截图的 URL 地址。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 截图如果被打上了水印，被打水印的模板 ID 列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WaterMarkDefinition")
    @Expose
    private Long [] WaterMarkDefinition;

    /**
     * 获取该张截图对应视频文件中的时间偏移，单位为<font color=red>毫秒</font>。
注意：此字段可能返回 null，表示取不到有效值。
     * @return TimeOffset 该张截图对应视频文件中的时间偏移，单位为<font color=red>毫秒</font>。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getTimeOffset() {
        return this.TimeOffset;
    }

    /**
     * 设置该张截图对应视频文件中的时间偏移，单位为<font color=red>毫秒</font>。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeOffset 该张截图对应视频文件中的时间偏移，单位为<font color=red>毫秒</font>。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeOffset(Float TimeOffset) {
        this.TimeOffset = TimeOffset;
    }

    /**
     * 获取该张截图的 URL 地址。
注意：此字段可能返回 null，表示取不到有效值。
     * @return Url 该张截图的 URL 地址。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * 设置该张截图的 URL 地址。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Url 该张截图的 URL 地址。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * 获取截图如果被打上了水印，被打水印的模板 ID 列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @return WaterMarkDefinition 截图如果被打上了水印，被打水印的模板 ID 列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getWaterMarkDefinition() {
        return this.WaterMarkDefinition;
    }

    /**
     * 设置截图如果被打上了水印，被打水印的模板 ID 列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param WaterMarkDefinition 截图如果被打上了水印，被打水印的模板 ID 列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWaterMarkDefinition(Long [] WaterMarkDefinition) {
        this.WaterMarkDefinition = WaterMarkDefinition;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimeOffset", this.TimeOffset);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamArraySimple(map, prefix + "WaterMarkDefinition.", this.WaterMarkDefinition);

    }
}

