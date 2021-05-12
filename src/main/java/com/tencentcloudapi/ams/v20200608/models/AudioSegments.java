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
package com.tencentcloudapi.ams.v20200608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AudioSegments extends AbstractModel{

    /**
    * 截帧时间。
点播文件：该值为相对于视频偏移时间，单位为秒，例如：0，5，10
直播流：该值为时间戳，例如：1594650717
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OffsetTime")
    @Expose
    private String OffsetTime;

    /**
    * 结果集
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Result")
    @Expose
    private AudioResult Result;

    /**
     * Get 截帧时间。
点播文件：该值为相对于视频偏移时间，单位为秒，例如：0，5，10
直播流：该值为时间戳，例如：1594650717
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OffsetTime 截帧时间。
点播文件：该值为相对于视频偏移时间，单位为秒，例如：0，5，10
直播流：该值为时间戳，例如：1594650717
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOffsetTime() {
        return this.OffsetTime;
    }

    /**
     * Set 截帧时间。
点播文件：该值为相对于视频偏移时间，单位为秒，例如：0，5，10
直播流：该值为时间戳，例如：1594650717
注意：此字段可能返回 null，表示取不到有效值。
     * @param OffsetTime 截帧时间。
点播文件：该值为相对于视频偏移时间，单位为秒，例如：0，5，10
直播流：该值为时间戳，例如：1594650717
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOffsetTime(String OffsetTime) {
        this.OffsetTime = OffsetTime;
    }

    /**
     * Get 结果集
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Result 结果集
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AudioResult getResult() {
        return this.Result;
    }

    /**
     * Set 结果集
注意：此字段可能返回 null，表示取不到有效值。
     * @param Result 结果集
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResult(AudioResult Result) {
        this.Result = Result;
    }

    public AudioSegments() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AudioSegments(AudioSegments source) {
        if (source.OffsetTime != null) {
            this.OffsetTime = new String(source.OffsetTime);
        }
        if (source.Result != null) {
            this.Result = new AudioResult(source.Result);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OffsetTime", this.OffsetTime);
        this.setParamObj(map, prefix + "Result.", this.Result);

    }
}

