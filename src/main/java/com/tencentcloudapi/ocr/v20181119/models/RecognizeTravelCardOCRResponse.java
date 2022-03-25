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

public class RecognizeTravelCardOCRResponse extends AbstractModel{

    /**
    * 行程卡更新时间，格式为：XXXX.XX.XX XX:XX:XX
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * 行程卡颜色：绿色、黄色、红色
    */
    @SerializedName("Color")
    @Expose
    private String Color;

    /**
    * 14天内到达或途经的城市
    */
    @SerializedName("ReachedCity")
    @Expose
    private String [] ReachedCity;

    /**
    * 14天内到达或途径存在中高风险地区的城市
    */
    @SerializedName("RiskArea")
    @Expose
    private String [] RiskArea;

    /**
    * 电话号码
    */
    @SerializedName("Telephone")
    @Expose
    private String Telephone;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 行程卡更新时间，格式为：XXXX.XX.XX XX:XX:XX 
     * @return Time 行程卡更新时间，格式为：XXXX.XX.XX XX:XX:XX
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set 行程卡更新时间，格式为：XXXX.XX.XX XX:XX:XX
     * @param Time 行程卡更新时间，格式为：XXXX.XX.XX XX:XX:XX
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get 行程卡颜色：绿色、黄色、红色 
     * @return Color 行程卡颜色：绿色、黄色、红色
     */
    public String getColor() {
        return this.Color;
    }

    /**
     * Set 行程卡颜色：绿色、黄色、红色
     * @param Color 行程卡颜色：绿色、黄色、红色
     */
    public void setColor(String Color) {
        this.Color = Color;
    }

    /**
     * Get 14天内到达或途经的城市 
     * @return ReachedCity 14天内到达或途经的城市
     */
    public String [] getReachedCity() {
        return this.ReachedCity;
    }

    /**
     * Set 14天内到达或途经的城市
     * @param ReachedCity 14天内到达或途经的城市
     */
    public void setReachedCity(String [] ReachedCity) {
        this.ReachedCity = ReachedCity;
    }

    /**
     * Get 14天内到达或途径存在中高风险地区的城市 
     * @return RiskArea 14天内到达或途径存在中高风险地区的城市
     */
    public String [] getRiskArea() {
        return this.RiskArea;
    }

    /**
     * Set 14天内到达或途径存在中高风险地区的城市
     * @param RiskArea 14天内到达或途径存在中高风险地区的城市
     */
    public void setRiskArea(String [] RiskArea) {
        this.RiskArea = RiskArea;
    }

    /**
     * Get 电话号码 
     * @return Telephone 电话号码
     */
    public String getTelephone() {
        return this.Telephone;
    }

    /**
     * Set 电话号码
     * @param Telephone 电话号码
     */
    public void setTelephone(String Telephone) {
        this.Telephone = Telephone;
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

    public RecognizeTravelCardOCRResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecognizeTravelCardOCRResponse(RecognizeTravelCardOCRResponse source) {
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.Color != null) {
            this.Color = new String(source.Color);
        }
        if (source.ReachedCity != null) {
            this.ReachedCity = new String[source.ReachedCity.length];
            for (int i = 0; i < source.ReachedCity.length; i++) {
                this.ReachedCity[i] = new String(source.ReachedCity[i]);
            }
        }
        if (source.RiskArea != null) {
            this.RiskArea = new String[source.RiskArea.length];
            for (int i = 0; i < source.RiskArea.length; i++) {
                this.RiskArea[i] = new String(source.RiskArea[i]);
            }
        }
        if (source.Telephone != null) {
            this.Telephone = new String(source.Telephone);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Color", this.Color);
        this.setParamArraySimple(map, prefix + "ReachedCity.", this.ReachedCity);
        this.setParamArraySimple(map, prefix + "RiskArea.", this.RiskArea);
        this.setParamSimple(map, prefix + "Telephone", this.Telephone);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

