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

public class SegmentInfo extends AbstractModel{

    /**
    * 每个切片平均时长，默认10s。
    */
    @SerializedName("FragmentTime")
    @Expose
    private Long FragmentTime;

    /**
    * 切片类型，可选项：hls，不填时默认hls。
    */
    @SerializedName("SegmentType")
    @Expose
    private String SegmentType;

    /**
    * 切片文件名字。注意：
1.不填切片文件名时，默认按照按照如下格式命名：m3u8文件名{order}。
2.若填了切片文件名字，则会按照如下格式命名：用户指定文件名{order}。
    */
    @SerializedName("FragmentName")
    @Expose
    private String FragmentName;

    /**
     * Get 每个切片平均时长，默认10s。 
     * @return FragmentTime 每个切片平均时长，默认10s。
     */
    public Long getFragmentTime() {
        return this.FragmentTime;
    }

    /**
     * Set 每个切片平均时长，默认10s。
     * @param FragmentTime 每个切片平均时长，默认10s。
     */
    public void setFragmentTime(Long FragmentTime) {
        this.FragmentTime = FragmentTime;
    }

    /**
     * Get 切片类型，可选项：hls，不填时默认hls。 
     * @return SegmentType 切片类型，可选项：hls，不填时默认hls。
     */
    public String getSegmentType() {
        return this.SegmentType;
    }

    /**
     * Set 切片类型，可选项：hls，不填时默认hls。
     * @param SegmentType 切片类型，可选项：hls，不填时默认hls。
     */
    public void setSegmentType(String SegmentType) {
        this.SegmentType = SegmentType;
    }

    /**
     * Get 切片文件名字。注意：
1.不填切片文件名时，默认按照按照如下格式命名：m3u8文件名{order}。
2.若填了切片文件名字，则会按照如下格式命名：用户指定文件名{order}。 
     * @return FragmentName 切片文件名字。注意：
1.不填切片文件名时，默认按照按照如下格式命名：m3u8文件名{order}。
2.若填了切片文件名字，则会按照如下格式命名：用户指定文件名{order}。
     */
    public String getFragmentName() {
        return this.FragmentName;
    }

    /**
     * Set 切片文件名字。注意：
1.不填切片文件名时，默认按照按照如下格式命名：m3u8文件名{order}。
2.若填了切片文件名字，则会按照如下格式命名：用户指定文件名{order}。
     * @param FragmentName 切片文件名字。注意：
1.不填切片文件名时，默认按照按照如下格式命名：m3u8文件名{order}。
2.若填了切片文件名字，则会按照如下格式命名：用户指定文件名{order}。
     */
    public void setFragmentName(String FragmentName) {
        this.FragmentName = FragmentName;
    }

    public SegmentInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SegmentInfo(SegmentInfo source) {
        if (source.FragmentTime != null) {
            this.FragmentTime = new Long(source.FragmentTime);
        }
        if (source.SegmentType != null) {
            this.SegmentType = new String(source.SegmentType);
        }
        if (source.FragmentName != null) {
            this.FragmentName = new String(source.FragmentName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FragmentTime", this.FragmentTime);
        this.setParamSimple(map, prefix + "SegmentType", this.SegmentType);
        this.setParamSimple(map, prefix + "FragmentName", this.FragmentName);

    }
}

