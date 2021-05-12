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
package com.tencentcloudapi.ie.v20200304.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaCuttingTimeInfo extends AbstractModel{

    /**
    * 时间类型，可选值：
PointSet：时间点集合；
IntervalPoint：周期采样点；
SectionSet：时间片段集合。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 截取时间点集合，单位毫秒，Type=PointSet时必选。
    */
    @SerializedName("PointSet")
    @Expose
    private Long [] PointSet;

    /**
    * 周期采样点信息，Type=IntervalPoint时必选。
    */
    @SerializedName("IntervalPoint")
    @Expose
    private IntervalTime IntervalPoint;

    /**
    * 时间区间集合信息，Type=SectionSet时必选。
    */
    @SerializedName("SectionSet")
    @Expose
    private SectionTime [] SectionSet;

    /**
     * Get 时间类型，可选值：
PointSet：时间点集合；
IntervalPoint：周期采样点；
SectionSet：时间片段集合。 
     * @return Type 时间类型，可选值：
PointSet：时间点集合；
IntervalPoint：周期采样点；
SectionSet：时间片段集合。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 时间类型，可选值：
PointSet：时间点集合；
IntervalPoint：周期采样点；
SectionSet：时间片段集合。
     * @param Type 时间类型，可选值：
PointSet：时间点集合；
IntervalPoint：周期采样点；
SectionSet：时间片段集合。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 截取时间点集合，单位毫秒，Type=PointSet时必选。 
     * @return PointSet 截取时间点集合，单位毫秒，Type=PointSet时必选。
     */
    public Long [] getPointSet() {
        return this.PointSet;
    }

    /**
     * Set 截取时间点集合，单位毫秒，Type=PointSet时必选。
     * @param PointSet 截取时间点集合，单位毫秒，Type=PointSet时必选。
     */
    public void setPointSet(Long [] PointSet) {
        this.PointSet = PointSet;
    }

    /**
     * Get 周期采样点信息，Type=IntervalPoint时必选。 
     * @return IntervalPoint 周期采样点信息，Type=IntervalPoint时必选。
     */
    public IntervalTime getIntervalPoint() {
        return this.IntervalPoint;
    }

    /**
     * Set 周期采样点信息，Type=IntervalPoint时必选。
     * @param IntervalPoint 周期采样点信息，Type=IntervalPoint时必选。
     */
    public void setIntervalPoint(IntervalTime IntervalPoint) {
        this.IntervalPoint = IntervalPoint;
    }

    /**
     * Get 时间区间集合信息，Type=SectionSet时必选。 
     * @return SectionSet 时间区间集合信息，Type=SectionSet时必选。
     */
    public SectionTime [] getSectionSet() {
        return this.SectionSet;
    }

    /**
     * Set 时间区间集合信息，Type=SectionSet时必选。
     * @param SectionSet 时间区间集合信息，Type=SectionSet时必选。
     */
    public void setSectionSet(SectionTime [] SectionSet) {
        this.SectionSet = SectionSet;
    }

    public MediaCuttingTimeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaCuttingTimeInfo(MediaCuttingTimeInfo source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.PointSet != null) {
            this.PointSet = new Long[source.PointSet.length];
            for (int i = 0; i < source.PointSet.length; i++) {
                this.PointSet[i] = new Long(source.PointSet[i]);
            }
        }
        if (source.IntervalPoint != null) {
            this.IntervalPoint = new IntervalTime(source.IntervalPoint);
        }
        if (source.SectionSet != null) {
            this.SectionSet = new SectionTime[source.SectionSet.length];
            for (int i = 0; i < source.SectionSet.length; i++) {
                this.SectionSet[i] = new SectionTime(source.SectionSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "PointSet.", this.PointSet);
        this.setParamObj(map, prefix + "IntervalPoint.", this.IntervalPoint);
        this.setParamArrayObj(map, prefix + "SectionSet.", this.SectionSet);

    }
}

