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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RecognizeGeneralTextImageWarnResponse extends AbstractModel {

    /**
    * 复印告警信息
    */
    @SerializedName("Copy")
    @Expose
    private GeneralWarnInfo Copy;

    /**
    * 翻拍告警信息
    */
    @SerializedName("Reprint")
    @Expose
    private GeneralWarnInfo Reprint;

    /**
    * 模糊告警信息
    */
    @SerializedName("Blur")
    @Expose
    private GeneralWarnInfo Blur;

    /**
    * 反光告警信息
    */
    @SerializedName("Reflection")
    @Expose
    private GeneralWarnInfo Reflection;

    /**
    * 边框不完整告警信息
    */
    @SerializedName("BorderIncomplete")
    @Expose
    private GeneralWarnInfo BorderIncomplete;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 复印告警信息 
     * @return Copy 复印告警信息
     */
    public GeneralWarnInfo getCopy() {
        return this.Copy;
    }

    /**
     * Set 复印告警信息
     * @param Copy 复印告警信息
     */
    public void setCopy(GeneralWarnInfo Copy) {
        this.Copy = Copy;
    }

    /**
     * Get 翻拍告警信息 
     * @return Reprint 翻拍告警信息
     */
    public GeneralWarnInfo getReprint() {
        return this.Reprint;
    }

    /**
     * Set 翻拍告警信息
     * @param Reprint 翻拍告警信息
     */
    public void setReprint(GeneralWarnInfo Reprint) {
        this.Reprint = Reprint;
    }

    /**
     * Get 模糊告警信息 
     * @return Blur 模糊告警信息
     */
    public GeneralWarnInfo getBlur() {
        return this.Blur;
    }

    /**
     * Set 模糊告警信息
     * @param Blur 模糊告警信息
     */
    public void setBlur(GeneralWarnInfo Blur) {
        this.Blur = Blur;
    }

    /**
     * Get 反光告警信息 
     * @return Reflection 反光告警信息
     */
    public GeneralWarnInfo getReflection() {
        return this.Reflection;
    }

    /**
     * Set 反光告警信息
     * @param Reflection 反光告警信息
     */
    public void setReflection(GeneralWarnInfo Reflection) {
        this.Reflection = Reflection;
    }

    /**
     * Get 边框不完整告警信息 
     * @return BorderIncomplete 边框不完整告警信息
     */
    public GeneralWarnInfo getBorderIncomplete() {
        return this.BorderIncomplete;
    }

    /**
     * Set 边框不完整告警信息
     * @param BorderIncomplete 边框不完整告警信息
     */
    public void setBorderIncomplete(GeneralWarnInfo BorderIncomplete) {
        this.BorderIncomplete = BorderIncomplete;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public RecognizeGeneralTextImageWarnResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecognizeGeneralTextImageWarnResponse(RecognizeGeneralTextImageWarnResponse source) {
        if (source.Copy != null) {
            this.Copy = new GeneralWarnInfo(source.Copy);
        }
        if (source.Reprint != null) {
            this.Reprint = new GeneralWarnInfo(source.Reprint);
        }
        if (source.Blur != null) {
            this.Blur = new GeneralWarnInfo(source.Blur);
        }
        if (source.Reflection != null) {
            this.Reflection = new GeneralWarnInfo(source.Reflection);
        }
        if (source.BorderIncomplete != null) {
            this.BorderIncomplete = new GeneralWarnInfo(source.BorderIncomplete);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Copy.", this.Copy);
        this.setParamObj(map, prefix + "Reprint.", this.Reprint);
        this.setParamObj(map, prefix + "Blur.", this.Blur);
        this.setParamObj(map, prefix + "Reflection.", this.Reflection);
        this.setParamObj(map, prefix + "BorderIncomplete.", this.BorderIncomplete);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

