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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CommonMixInputParam extends AbstractModel{

    /**
    * 输入流名称。80字节以内，仅含字母、数字以及下划线的字符串。
    */
    @SerializedName("InputStreamName")
    @Expose
    private String InputStreamName;

    /**
    * 输入流布局参数。
    */
    @SerializedName("LayoutParams")
    @Expose
    private CommonMixLayoutParams LayoutParams;

    /**
    * 输入流裁剪参数。
    */
    @SerializedName("CropParams")
    @Expose
    private CommonMixCropParams CropParams;

    /**
     * Get 输入流名称。80字节以内，仅含字母、数字以及下划线的字符串。 
     * @return InputStreamName 输入流名称。80字节以内，仅含字母、数字以及下划线的字符串。
     */
    public String getInputStreamName() {
        return this.InputStreamName;
    }

    /**
     * Set 输入流名称。80字节以内，仅含字母、数字以及下划线的字符串。
     * @param InputStreamName 输入流名称。80字节以内，仅含字母、数字以及下划线的字符串。
     */
    public void setInputStreamName(String InputStreamName) {
        this.InputStreamName = InputStreamName;
    }

    /**
     * Get 输入流布局参数。 
     * @return LayoutParams 输入流布局参数。
     */
    public CommonMixLayoutParams getLayoutParams() {
        return this.LayoutParams;
    }

    /**
     * Set 输入流布局参数。
     * @param LayoutParams 输入流布局参数。
     */
    public void setLayoutParams(CommonMixLayoutParams LayoutParams) {
        this.LayoutParams = LayoutParams;
    }

    /**
     * Get 输入流裁剪参数。 
     * @return CropParams 输入流裁剪参数。
     */
    public CommonMixCropParams getCropParams() {
        return this.CropParams;
    }

    /**
     * Set 输入流裁剪参数。
     * @param CropParams 输入流裁剪参数。
     */
    public void setCropParams(CommonMixCropParams CropParams) {
        this.CropParams = CropParams;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InputStreamName", this.InputStreamName);
        this.setParamObj(map, prefix + "LayoutParams.", this.LayoutParams);
        this.setParamObj(map, prefix + "CropParams.", this.CropParams);

    }
}

