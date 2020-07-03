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
package com.tencentcloudapi.tmt.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageTranslateResponse extends AbstractModel{

    /**
    * 请求的SessionUuid返回
    */
    @SerializedName("SessionUuid")
    @Expose
    private String SessionUuid;

    /**
    * 源语言
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 目标语言
    */
    @SerializedName("Target")
    @Expose
    private String Target;

    /**
    * 图片翻译结果，翻译结果按识别的文本每一行独立翻译，后续会推出按段落划分并翻译的版本
    */
    @SerializedName("ImageRecord")
    @Expose
    private ImageRecord ImageRecord;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 请求的SessionUuid返回 
     * @return SessionUuid 请求的SessionUuid返回
     */
    public String getSessionUuid() {
        return this.SessionUuid;
    }

    /**
     * Set 请求的SessionUuid返回
     * @param SessionUuid 请求的SessionUuid返回
     */
    public void setSessionUuid(String SessionUuid) {
        this.SessionUuid = SessionUuid;
    }

    /**
     * Get 源语言 
     * @return Source 源语言
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 源语言
     * @param Source 源语言
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 目标语言 
     * @return Target 目标语言
     */
    public String getTarget() {
        return this.Target;
    }

    /**
     * Set 目标语言
     * @param Target 目标语言
     */
    public void setTarget(String Target) {
        this.Target = Target;
    }

    /**
     * Get 图片翻译结果，翻译结果按识别的文本每一行独立翻译，后续会推出按段落划分并翻译的版本 
     * @return ImageRecord 图片翻译结果，翻译结果按识别的文本每一行独立翻译，后续会推出按段落划分并翻译的版本
     */
    public ImageRecord getImageRecord() {
        return this.ImageRecord;
    }

    /**
     * Set 图片翻译结果，翻译结果按识别的文本每一行独立翻译，后续会推出按段落划分并翻译的版本
     * @param ImageRecord 图片翻译结果，翻译结果按识别的文本每一行独立翻译，后续会推出按段落划分并翻译的版本
     */
    public void setImageRecord(ImageRecord ImageRecord) {
        this.ImageRecord = ImageRecord;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SessionUuid", this.SessionUuid);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Target", this.Target);
        this.setParamObj(map, prefix + "ImageRecord.", this.ImageRecord);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

