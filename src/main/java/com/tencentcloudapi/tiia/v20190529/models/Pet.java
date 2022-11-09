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
package com.tencentcloudapi.tiia.v20190529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Pet extends AbstractModel{

    /**
    * 识别出的宠物类型（猫或者狗，暂不支持识别猫狗品种）。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 识别服务给识别目标打出的置信度，范围在0-100之间。值越高，表示目标为相应结果的可能性越高。
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
    * 识别目标在图片中的坐标。
    */
    @SerializedName("Location")
    @Expose
    private Rect Location;

    /**
     * Get 识别出的宠物类型（猫或者狗，暂不支持识别猫狗品种）。 
     * @return Name 识别出的宠物类型（猫或者狗，暂不支持识别猫狗品种）。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 识别出的宠物类型（猫或者狗，暂不支持识别猫狗品种）。
     * @param Name 识别出的宠物类型（猫或者狗，暂不支持识别猫狗品种）。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 识别服务给识别目标打出的置信度，范围在0-100之间。值越高，表示目标为相应结果的可能性越高。 
     * @return Score 识别服务给识别目标打出的置信度，范围在0-100之间。值越高，表示目标为相应结果的可能性越高。
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set 识别服务给识别目标打出的置信度，范围在0-100之间。值越高，表示目标为相应结果的可能性越高。
     * @param Score 识别服务给识别目标打出的置信度，范围在0-100之间。值越高，表示目标为相应结果的可能性越高。
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    /**
     * Get 识别目标在图片中的坐标。 
     * @return Location 识别目标在图片中的坐标。
     */
    public Rect getLocation() {
        return this.Location;
    }

    /**
     * Set 识别目标在图片中的坐标。
     * @param Location 识别目标在图片中的坐标。
     */
    public void setLocation(Rect Location) {
        this.Location = Location;
    }

    public Pet() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Pet(Pet source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Score != null) {
            this.Score = new Long(source.Score);
        }
        if (source.Location != null) {
            this.Location = new Rect(source.Location);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamObj(map, prefix + "Location.", this.Location);

    }
}

