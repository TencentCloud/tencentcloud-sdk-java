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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RecognizeHealthCodeOCRResponse extends AbstractModel{

    /**
    * 持码人姓名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 健康码更新时间，格式为：XXXX-XX-XX XX:XX:XX
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * 健康码颜色：绿色、黄色、红色
    */
    @SerializedName("Color")
    @Expose
    private String Color;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 持码人姓名 
     * @return Name 持码人姓名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 持码人姓名
     * @param Name 持码人姓名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 健康码更新时间，格式为：XXXX-XX-XX XX:XX:XX 
     * @return Time 健康码更新时间，格式为：XXXX-XX-XX XX:XX:XX
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set 健康码更新时间，格式为：XXXX-XX-XX XX:XX:XX
     * @param Time 健康码更新时间，格式为：XXXX-XX-XX XX:XX:XX
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get 健康码颜色：绿色、黄色、红色 
     * @return Color 健康码颜色：绿色、黄色、红色
     */
    public String getColor() {
        return this.Color;
    }

    /**
     * Set 健康码颜色：绿色、黄色、红色
     * @param Color 健康码颜色：绿色、黄色、红色
     */
    public void setColor(String Color) {
        this.Color = Color;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public RecognizeHealthCodeOCRResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecognizeHealthCodeOCRResponse(RecognizeHealthCodeOCRResponse source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.Color != null) {
            this.Color = new String(source.Color);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Color", this.Color);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

