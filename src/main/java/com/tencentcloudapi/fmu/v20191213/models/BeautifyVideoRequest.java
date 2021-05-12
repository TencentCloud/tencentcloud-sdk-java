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
package com.tencentcloudapi.fmu.v20191213.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BeautifyVideoRequest extends AbstractModel{

    /**
    * 视频url地址
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 美颜参数 - 美白、平滑、大眼和瘦脸。参数值范围[0, 100]。参数值为0，则不做美颜。参数默认值为0。目前默认取数组第一个元素是对所有人脸美颜。
    */
    @SerializedName("BeautyParam")
    @Expose
    private BeautyParam [] BeautyParam;

    /**
    * 目前只支持mp4
    */
    @SerializedName("OutputVideoType")
    @Expose
    private String OutputVideoType;

    /**
     * Get 视频url地址 
     * @return Url 视频url地址
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 视频url地址
     * @param Url 视频url地址
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 美颜参数 - 美白、平滑、大眼和瘦脸。参数值范围[0, 100]。参数值为0，则不做美颜。参数默认值为0。目前默认取数组第一个元素是对所有人脸美颜。 
     * @return BeautyParam 美颜参数 - 美白、平滑、大眼和瘦脸。参数值范围[0, 100]。参数值为0，则不做美颜。参数默认值为0。目前默认取数组第一个元素是对所有人脸美颜。
     */
    public BeautyParam [] getBeautyParam() {
        return this.BeautyParam;
    }

    /**
     * Set 美颜参数 - 美白、平滑、大眼和瘦脸。参数值范围[0, 100]。参数值为0，则不做美颜。参数默认值为0。目前默认取数组第一个元素是对所有人脸美颜。
     * @param BeautyParam 美颜参数 - 美白、平滑、大眼和瘦脸。参数值范围[0, 100]。参数值为0，则不做美颜。参数默认值为0。目前默认取数组第一个元素是对所有人脸美颜。
     */
    public void setBeautyParam(BeautyParam [] BeautyParam) {
        this.BeautyParam = BeautyParam;
    }

    /**
     * Get 目前只支持mp4 
     * @return OutputVideoType 目前只支持mp4
     */
    public String getOutputVideoType() {
        return this.OutputVideoType;
    }

    /**
     * Set 目前只支持mp4
     * @param OutputVideoType 目前只支持mp4
     */
    public void setOutputVideoType(String OutputVideoType) {
        this.OutputVideoType = OutputVideoType;
    }

    public BeautifyVideoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BeautifyVideoRequest(BeautifyVideoRequest source) {
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.BeautyParam != null) {
            this.BeautyParam = new BeautyParam[source.BeautyParam.length];
            for (int i = 0; i < source.BeautyParam.length; i++) {
                this.BeautyParam[i] = new BeautyParam(source.BeautyParam[i]);
            }
        }
        if (source.OutputVideoType != null) {
            this.OutputVideoType = new String(source.OutputVideoType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamArrayObj(map, prefix + "BeautyParam.", this.BeautyParam);
        this.setParamSimple(map, prefix + "OutputVideoType", this.OutputVideoType);

    }
}

