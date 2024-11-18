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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SegmentSpecificInfo extends AbstractModel {

    /**
    * 启动分片时长开关，可选值：
on：打开
off：关闭
默认off
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 启动时分片时长，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FragmentTime")
    @Expose
    private Long FragmentTime;

    /**
    * 生效分片数，表示前FragmentEndNum个分片以FragmentTime时长切片，取值>=1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FragmentEndNum")
    @Expose
    private Long FragmentEndNum;

    /**
     * Get 启动分片时长开关，可选值：
on：打开
off：关闭
默认off
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Switch 启动分片时长开关，可选值：
on：打开
off：关闭
默认off
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 启动分片时长开关，可选值：
on：打开
off：关闭
默认off
注意：此字段可能返回 null，表示取不到有效值。
     * @param Switch 启动分片时长开关，可选值：
on：打开
off：关闭
默认off
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 启动时分片时长，单位：秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FragmentTime 启动时分片时长，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFragmentTime() {
        return this.FragmentTime;
    }

    /**
     * Set 启动时分片时长，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param FragmentTime 启动时分片时长，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFragmentTime(Long FragmentTime) {
        this.FragmentTime = FragmentTime;
    }

    /**
     * Get 生效分片数，表示前FragmentEndNum个分片以FragmentTime时长切片，取值>=1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FragmentEndNum 生效分片数，表示前FragmentEndNum个分片以FragmentTime时长切片，取值>=1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFragmentEndNum() {
        return this.FragmentEndNum;
    }

    /**
     * Set 生效分片数，表示前FragmentEndNum个分片以FragmentTime时长切片，取值>=1
注意：此字段可能返回 null，表示取不到有效值。
     * @param FragmentEndNum 生效分片数，表示前FragmentEndNum个分片以FragmentTime时长切片，取值>=1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFragmentEndNum(Long FragmentEndNum) {
        this.FragmentEndNum = FragmentEndNum;
    }

    public SegmentSpecificInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SegmentSpecificInfo(SegmentSpecificInfo source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.FragmentTime != null) {
            this.FragmentTime = new Long(source.FragmentTime);
        }
        if (source.FragmentEndNum != null) {
            this.FragmentEndNum = new Long(source.FragmentEndNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "FragmentTime", this.FragmentTime);
        this.setParamSimple(map, prefix + "FragmentEndNum", this.FragmentEndNum);

    }
}

