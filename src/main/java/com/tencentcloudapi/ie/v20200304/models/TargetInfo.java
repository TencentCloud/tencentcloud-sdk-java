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

public class TargetInfo extends AbstractModel{

    /**
    * 目标文件名
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 目标文件切片信息
    */
    @SerializedName("SegmentInfo")
    @Expose
    private SegmentInfo SegmentInfo;

    /**
     * Get 目标文件名 
     * @return FileName 目标文件名
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 目标文件名
     * @param FileName 目标文件名
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 目标文件切片信息 
     * @return SegmentInfo 目标文件切片信息
     */
    public SegmentInfo getSegmentInfo() {
        return this.SegmentInfo;
    }

    /**
     * Set 目标文件切片信息
     * @param SegmentInfo 目标文件切片信息
     */
    public void setSegmentInfo(SegmentInfo SegmentInfo) {
        this.SegmentInfo = SegmentInfo;
    }

    public TargetInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TargetInfo(TargetInfo source) {
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.SegmentInfo != null) {
            this.SegmentInfo = new SegmentInfo(source.SegmentInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamObj(map, prefix + "SegmentInfo.", this.SegmentInfo);

    }
}

