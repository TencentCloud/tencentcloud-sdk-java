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

public class SnapshotByTimeOffsetTaskInput  extends AbstractModel{

    /**
    * 指定时间点截图模板 ID。
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 截图时间点列表，单位为<font color=red>毫秒</font>。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeOffsetSet")
    @Expose
    private Float [] TimeOffsetSet;

    /**
    * 水印列表，支持多张图片或文字水印，最大可支持 10 张。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WatermarkSet")
    @Expose
    private WatermarkInput [] WatermarkSet;

    /**
     * 获取指定时间点截图模板 ID。
     * @return Definition 指定时间点截图模板 ID。
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * 设置指定时间点截图模板 ID。
     * @param Definition 指定时间点截图模板 ID。
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * 获取截图时间点列表，单位为<font color=red>毫秒</font>。
注意：此字段可能返回 null，表示取不到有效值。
     * @return TimeOffsetSet 截图时间点列表，单位为<font color=red>毫秒</font>。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float [] getTimeOffsetSet() {
        return this.TimeOffsetSet;
    }

    /**
     * 设置截图时间点列表，单位为<font color=red>毫秒</font>。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeOffsetSet 截图时间点列表，单位为<font color=red>毫秒</font>。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeOffsetSet(Float [] TimeOffsetSet) {
        this.TimeOffsetSet = TimeOffsetSet;
    }

    /**
     * 获取水印列表，支持多张图片或文字水印，最大可支持 10 张。
注意：此字段可能返回 null，表示取不到有效值。
     * @return WatermarkSet 水印列表，支持多张图片或文字水印，最大可支持 10 张。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WatermarkInput [] getWatermarkSet() {
        return this.WatermarkSet;
    }

    /**
     * 设置水印列表，支持多张图片或文字水印，最大可支持 10 张。
注意：此字段可能返回 null，表示取不到有效值。
     * @param WatermarkSet 水印列表，支持多张图片或文字水印，最大可支持 10 张。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWatermarkSet(WatermarkInput [] WatermarkSet) {
        this.WatermarkSet = WatermarkSet;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamArraySimple(map, prefix + "TimeOffsetSet.", this.TimeOffsetSet);
        this.setParamArrayObj(map, prefix + "WatermarkSet.", this.WatermarkSet);

    }
}

