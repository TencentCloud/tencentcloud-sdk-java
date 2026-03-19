/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AvatarTimbreInfo extends AbstractModel {

    /**
    * 音色 Key。
    */
    @SerializedName("TimbreKey")
    @Expose
    private String TimbreKey;

    /**
    * 音色名称。
    */
    @SerializedName("TimbreName")
    @Expose
    private String TimbreName;

    /**
    * 音色描述。
    */
    @SerializedName("TimbreDesc")
    @Expose
    private String TimbreDesc;

    /**
    * 音色试听样例 URL。
    */
    @SerializedName("TimbreSample")
    @Expose
    private String TimbreSample;

    /**
    * 音色性别，male:男音，femal:女音。
    */
    @SerializedName("TimbreGender")
    @Expose
    private String TimbreGender;

    /**
     * Get 音色 Key。 
     * @return TimbreKey 音色 Key。
     */
    public String getTimbreKey() {
        return this.TimbreKey;
    }

    /**
     * Set 音色 Key。
     * @param TimbreKey 音色 Key。
     */
    public void setTimbreKey(String TimbreKey) {
        this.TimbreKey = TimbreKey;
    }

    /**
     * Get 音色名称。 
     * @return TimbreName 音色名称。
     */
    public String getTimbreName() {
        return this.TimbreName;
    }

    /**
     * Set 音色名称。
     * @param TimbreName 音色名称。
     */
    public void setTimbreName(String TimbreName) {
        this.TimbreName = TimbreName;
    }

    /**
     * Get 音色描述。 
     * @return TimbreDesc 音色描述。
     */
    public String getTimbreDesc() {
        return this.TimbreDesc;
    }

    /**
     * Set 音色描述。
     * @param TimbreDesc 音色描述。
     */
    public void setTimbreDesc(String TimbreDesc) {
        this.TimbreDesc = TimbreDesc;
    }

    /**
     * Get 音色试听样例 URL。 
     * @return TimbreSample 音色试听样例 URL。
     */
    public String getTimbreSample() {
        return this.TimbreSample;
    }

    /**
     * Set 音色试听样例 URL。
     * @param TimbreSample 音色试听样例 URL。
     */
    public void setTimbreSample(String TimbreSample) {
        this.TimbreSample = TimbreSample;
    }

    /**
     * Get 音色性别，male:男音，femal:女音。 
     * @return TimbreGender 音色性别，male:男音，femal:女音。
     */
    public String getTimbreGender() {
        return this.TimbreGender;
    }

    /**
     * Set 音色性别，male:男音，femal:女音。
     * @param TimbreGender 音色性别，male:男音，femal:女音。
     */
    public void setTimbreGender(String TimbreGender) {
        this.TimbreGender = TimbreGender;
    }

    public AvatarTimbreInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AvatarTimbreInfo(AvatarTimbreInfo source) {
        if (source.TimbreKey != null) {
            this.TimbreKey = new String(source.TimbreKey);
        }
        if (source.TimbreName != null) {
            this.TimbreName = new String(source.TimbreName);
        }
        if (source.TimbreDesc != null) {
            this.TimbreDesc = new String(source.TimbreDesc);
        }
        if (source.TimbreSample != null) {
            this.TimbreSample = new String(source.TimbreSample);
        }
        if (source.TimbreGender != null) {
            this.TimbreGender = new String(source.TimbreGender);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimbreKey", this.TimbreKey);
        this.setParamSimple(map, prefix + "TimbreName", this.TimbreName);
        this.setParamSimple(map, prefix + "TimbreDesc", this.TimbreDesc);
        this.setParamSimple(map, prefix + "TimbreSample", this.TimbreSample);
        this.setParamSimple(map, prefix + "TimbreGender", this.TimbreGender);

    }
}

