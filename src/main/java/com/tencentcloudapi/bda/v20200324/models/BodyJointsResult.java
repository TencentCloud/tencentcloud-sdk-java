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
package com.tencentcloudapi.bda.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BodyJointsResult extends AbstractModel{

    /**
    * 图中检测出来的人体框。
    */
    @SerializedName("BoundBox")
    @Expose
    private BoundRect BoundBox;

    /**
    * 14个人体关键点的坐标，人体关键点详见KeyPointInfo。
    */
    @SerializedName("BodyJoints")
    @Expose
    private KeyPointInfo [] BodyJoints;

    /**
    * 检测出的人体置信度，0-1之间，数值越高越准确。
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
     * Get 图中检测出来的人体框。 
     * @return BoundBox 图中检测出来的人体框。
     */
    public BoundRect getBoundBox() {
        return this.BoundBox;
    }

    /**
     * Set 图中检测出来的人体框。
     * @param BoundBox 图中检测出来的人体框。
     */
    public void setBoundBox(BoundRect BoundBox) {
        this.BoundBox = BoundBox;
    }

    /**
     * Get 14个人体关键点的坐标，人体关键点详见KeyPointInfo。 
     * @return BodyJoints 14个人体关键点的坐标，人体关键点详见KeyPointInfo。
     */
    public KeyPointInfo [] getBodyJoints() {
        return this.BodyJoints;
    }

    /**
     * Set 14个人体关键点的坐标，人体关键点详见KeyPointInfo。
     * @param BodyJoints 14个人体关键点的坐标，人体关键点详见KeyPointInfo。
     */
    public void setBodyJoints(KeyPointInfo [] BodyJoints) {
        this.BodyJoints = BodyJoints;
    }

    /**
     * Get 检测出的人体置信度，0-1之间，数值越高越准确。 
     * @return Confidence 检测出的人体置信度，0-1之间，数值越高越准确。
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set 检测出的人体置信度，0-1之间，数值越高越准确。
     * @param Confidence 检测出的人体置信度，0-1之间，数值越高越准确。
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    public BodyJointsResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BodyJointsResult(BodyJointsResult source) {
        if (source.BoundBox != null) {
            this.BoundBox = new BoundRect(source.BoundBox);
        }
        if (source.BodyJoints != null) {
            this.BodyJoints = new KeyPointInfo[source.BodyJoints.length];
            for (int i = 0; i < source.BodyJoints.length; i++) {
                this.BodyJoints[i] = new KeyPointInfo(source.BodyJoints[i]);
            }
        }
        if (source.Confidence != null) {
            this.Confidence = new Float(source.Confidence);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "BoundBox.", this.BoundBox);
        this.setParamArrayObj(map, prefix + "BodyJoints.", this.BodyJoints);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);

    }
}

